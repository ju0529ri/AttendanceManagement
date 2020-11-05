package jp.ac.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "commons")
public class 共通マスタ {
	private BigDecimal code;			//コ-ド
	private String codeName;			//コ-ド名
	private String registred;			//登録者
	private Timestamp registredTime;	//登録日時
	private String updated;				//更新者
	private String updatedTime;			//更新日時
}
