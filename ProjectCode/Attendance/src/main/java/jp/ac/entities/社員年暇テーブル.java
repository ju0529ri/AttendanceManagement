package jp.ac.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "empYearFreeTime")
public class 社員年暇テーブル {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesNum;				//一連番号
	//외래키
	private String employeeName;		//社員名
	private BigDecimal yearTimeCode;	//年暇コード
	private Timestamp fromDate;			//開始日
	private Timestamp toDate;			//終了日
	private String grounds;				//事由
	private BigDecimal days;			//日数
	private BigDecimal approvalCode;	//承認区分コード
	private String registred;			//登録者
	private Timestamp registredTime;	//登録日時
	private String updated;				//更新者
	private Timestamp updatedTime;		//更新日時
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private EmployeeVO employeeId;			//社員ID
}
