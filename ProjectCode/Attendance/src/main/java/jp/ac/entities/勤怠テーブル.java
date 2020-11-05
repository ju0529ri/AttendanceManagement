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
@Table(name = "times")
public class 勤怠テーブル {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timeId;						//勤怠ID
	//외래키
	private Timestamp dates;				//日付
	private Timestamp attendTime;			//出勤時刻
	private Timestamp leaveTime;			//退勤時刻
	private String businDescCode;			//業務内容コード
	private BigDecimal overTimeClass;		//超過勤怠区分
	private Timestamp overTimeStartTime;	//超過開始時刻
	private Timestamp overTimeEndTime;		//超過終了時刻
	private String registred;				//登録者
	private Timestamp registredTime;		//登録日時
	private String updated;					//更新者
	private Timestamp updatedTime;			//更新日時
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private EmployeeVO employeeId;				//社員ID
}
