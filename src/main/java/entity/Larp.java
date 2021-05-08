package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("Larp")
@Data
@Entity
@Table
public class Larp implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "larpId")
	private Integer larpId;
	
	@ApiModelProperty("larpCharacters List<Character>劇本角色")
	@OneToMany(mappedBy = "laprCharacters", cascade = CascadeType.ALL)
	@Column(name = "larpCharacters")
	private List<Character> larpCharacters;	
	
	@ApiModelProperty("larpGroups List<Group>該劇本的團")
	@OneToMany(mappedBy = "larpGroups", cascade = CascadeType.ALL)
	@Column(name = "larpGroups")
	private List<Group> larpGroups;
	
	@ApiModelProperty("larpStudios List<Studio>有該劇本的工作室")
	@ManyToMany(mappedBy = "studioLarps")
	@Column(name = "larpStudios")
	private List<Studio> larpStudios;
	
	@ApiModelProperty("larpName String劇本名稱")
	@Column(name = "larpName")
	private String larpName;
	
	@ApiModelProperty("larpIntroduction String劇本介紹")
	@Column(name = "larpIntroduction")
	private String larpIntroduction;
	
	@ApiModelProperty("larpTime Integer劇本時長(以小時為單位)")
	@Column(name = "larpTime")
	private Integer larpTime;
	
	@ApiModelProperty("larpType String劇本類型")
	@Column(name = "larpType")
	private String larpType;
	
	@ApiModelProperty("larpLevel String劇本難度")
	@Column(name = "larpLevel")
	private String larpLevel;
	
	@ApiModelProperty("larpPrice Integer劇本價格")
	@Column(name = "larpPrice")
	private Integer larpPrice;
	
	@ApiModelProperty("larpCoverImage String劇本封面照")
	@Column(name = "larpCoverImage")
	private String larpCoverImage;
	


}
