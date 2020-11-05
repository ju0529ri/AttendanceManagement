package jp.ac.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "empBusinOrders")
public class 社員業務指示新規テーブル {
	//외래키
	private BigDecimal departCode;			//部署コード
	private String employeeName;			//社員名
	private Timestamp fromDate;				//開始日
	private Timestamp toDate;				//終了日
	private BigDecimal businessDesCode;		//業務内容コード
	private String registred;				//登録者
	private Timestamp registredTime;		//登録日時
	private String updated;					//更新者
	private Timestamp updatedTime;			//更新日時
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private EmployeeVO employeeId;				//社員ID
}
