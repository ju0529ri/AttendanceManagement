package jp.ac.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "holidayManage")
public class 休日管理マスタ {
	private Timestamp date;				//日付
	private String holiday;				//休日
	private String remarks;				//備考
	private String registred;			//登録者
	private Timestamp registredTime;	//登録日時
	private String updated;				//更新者
	private Timestamp updatedTime;		//更新日時
}
