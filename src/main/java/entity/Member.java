package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import io.swagger.annotations.ApiModelProperty;

public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "memberId")
	private Integer memberId;
	
	@ApiModelProperty("memberGroups List<Group>有該劇本的工作室")
	@ManyToMany(mappedBy = "groupMembers")
	@Column(name = "memberGroups")
	private List<Group> memberGroups;
		
	@ApiModelProperty("memberName String會員名稱(暱稱)")
	@Column(name = "memberName")
	private String memberName;
	
	@ApiModelProperty("memberGender String會員性別(1=男,2=女,0=無)")
	@Column(name = "memberGender")
	private String memberGender;
	
	@ApiModelProperty("memberIntroduction String會員自我介紹")
	@Column(name = "memberIntroduction")
	private String memberIntroduction;
	
	@ApiModelProperty("memberAge Integer會員年齡")
	@Column(name = "memberAge")
	private Integer memberAge;
	
	@ApiModelProperty("memberPhoto String會員照片")
	@Column(name = "memberPhoto")
	private String memberPhoto;
	
	@ApiModelProperty("memberPhoneNumber String會員電話")
	@Column(name = "memberPhoneNumber")
	private String memberPhoneNumber;
	
	@ApiModelProperty("memberLine String會員Line")
	@Column(name = "memberLine")
	private String memberLine;
	
	@ApiModelProperty("memberFB String會員FB")
	@Column(name = "memberFB")
	private String memberFB;
	
	@ApiModelProperty("memberOtherContact String會員其它聯繫方式")
	@Column(name = "memberOtherContact")
	private String memberOtherContact;
}
