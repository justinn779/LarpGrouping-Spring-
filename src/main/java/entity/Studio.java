package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("Studio")
@Data
@Entity
@Table
public class Studio implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studioId")
	private Integer studioId;
	
	@ApiModelProperty("studioGroups List<Studio>該劇本的團")
	@OneToMany(mappedBy = "studioGroups", cascade = CascadeType.ALL)
	@Column(name = "studioGroups")
	private List<Studio> studioGroups;
	
	@ApiModelProperty("studioLarps List<Larp>該工作室有的劇本")
	@ManyToMany
	@JoinTable(
		name = "studioLarps", 
		joinColumns = @JoinColumn(name = "studioId"), 
		inverseJoinColumns = @JoinColumn(name = "larpId"))
	@Column(name = "studioLarps")
	private List<Larp> studioLarps;
	
	@ApiModelProperty("studioName String工作室名稱")
	@Column(name = "studioName")
	private String studioName;
	
	@ApiModelProperty("studioIntroduction String工作室介紹")
	@Column(name = "studioIntroduction")
	private String studioIntroduction;
	
	@ApiModelProperty("studioUrl String工作室網址")
	@Column(name = "studioUrl")
	private String studioUrl;
	
	@ApiModelProperty("studioPhoneNumber String工作室電話")
	@Column(name = "studioPhoneNumber")
	private String studioPhoneNumber;
	
	@ApiModelProperty("studioLogo String工作室Logo")
	@Column(name = "studioLogo")
	private String studioLogo;
	
	

}
