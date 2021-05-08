package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("Character")
@Data
@Entity
@Table
public class Character implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "characterId")
	private Integer characterId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ApiModelProperty("characterLarp Larp該角色所屬劇本")
	@Column(name = "characterLarp")
    private Larp characterLarp;
	
	@ApiModelProperty("characterName String角色名稱")
	@Column(name = "characterName")
	private String characterName;
	
	@ApiModelProperty("characterGender String角色性別(1=男,2=女,0=無)")
	@Column(name = "characterGender")
	private String characterGender;
	
	@ApiModelProperty("characterIntroduction String角色介紹")
	@Column(name = "characterIntroduction")
	private String characterIntroduction;
	
	@ApiModelProperty("characterAge Integer角色年齡")
	@Column(name = "characterAge")
	private Integer characterAge;
	
	@ApiModelProperty("characterClothes String角色服裝")
	@Column(name = "characterClothes")
	private String characterClothes;
	
	@ApiModelProperty("characterPersonality String角色個性")
	@Column(name = "characterPersonality")
	private String characterPersonality;
	
	@ApiModelProperty("characterPhoto String角色照片")
	@Column(name = "characterPhoto")
	private String characterPhoto;

}
