package entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModelProperty;

public class Group implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "groupId")
	private Integer groupId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ApiModelProperty("groupLarp Larp該團劇本")
	@Column(name = "groupLarp")
    private Larp groupLarp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ApiModelProperty("groupStudio Studio該團工作室")
	@Column(name = "groupStudio")
    private Studio groupStudio;
	
	@ApiModelProperty("groupMembers List<Member>該團現有團員")
	@ManyToMany
	@JoinTable(
		name = "groupMembers", 
		joinColumns = @JoinColumn(name = "groupId"), 
		inverseJoinColumns = @JoinColumn(name = "memberId"))
	@Column(name = "groupMembers")
	private List<Member> groupMembers;
		
	@ApiModelProperty("groupMaster Member該團主揪")
	@Column(name = "groupMaster")
	private Member groupMaster;
	
	@ApiModelProperty("groupDateTime LocalDateTime該團日期時間")
	@Column(name = "groupDateTime")
	private LocalDateTime groupDateTime;
	
	@ApiModelProperty("groupAddress String該團地點")
	@Column(name = "groupAddress")
	private String groupAddress;
	
	@ApiModelProperty("groupGM String該團GM")
	@Column(name = "groupGM")
	private String groupGM;
	
	@ApiModelProperty("groupPrice Integer該團優惠價")
	@Column(name = "groupPrice")
	private Integer groupPrice;

}
