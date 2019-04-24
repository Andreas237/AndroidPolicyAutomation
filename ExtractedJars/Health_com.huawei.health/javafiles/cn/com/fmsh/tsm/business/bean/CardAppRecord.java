// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.tsm.business.enums.EnumTradeType;
import java.io.Serializable;

public class CardAppRecord
	implements Serializable
{

	public CardAppRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public int getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int amount>
	//    2    4:ireturn         
	}

	public int getBalance()
	{
		return balance;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int balance>
	//    2    4:ireturn         
	}

	public byte getOriTradeType()
	{
		return oriTradeType;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field byte oriTradeType>
	//    2    4:ireturn         
	}

	public int getOverdraft()
	{
		return overdraft;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int overdraft>
	//    2    4:ireturn         
	}

	public byte getTerminalTradeType()
	{
		return terminalTradeType;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte terminalTradeType>
	//    2    4:ireturn         
	}

	public String getTradeDate()
	{
		return tradeDate;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String tradeDate>
	//    2    4:areturn         
	}

	public String getTradeDevice()
	{
		return tradeDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String tradeDevice>
	//    2    4:areturn         
	}

	public int getTradeNo()
	{
		return tradeNo;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int tradeNo>
	//    2    4:ireturn         
	}

	public String getTradeTime()
	{
		return tradeTime;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String tradeTime>
	//    2    4:areturn         
	}

	public EnumTradeType getTradeType()
	{
		return tradeType;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field EnumTradeType tradeType>
	//    2    4:areturn         
	}

	public void setAmount(int i)
	{
		amount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int amount>
	//    3    5:return          
	}

	public void setBalance(int i)
	{
		balance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int balance>
	//    3    5:return          
	}

	public void setOriTradeType(byte byte0)
	{
		oriTradeType = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field byte oriTradeType>
	//    3    5:return          
	}

	public void setOverdraft(int i)
	{
		overdraft = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int overdraft>
	//    3    5:return          
	}

	public void setTerminalTradeType(byte byte0)
	{
		terminalTradeType = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field byte terminalTradeType>
	//    3    5:return          
	}

	public void setTradeDate(String s)
	{
		tradeDate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String tradeDate>
	//    3    5:return          
	}

	public void setTradeDevice(String s)
	{
		tradeDevice = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field String tradeDevice>
	//    3    5:return          
	}

	public void setTradeNo(int i)
	{
		tradeNo = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int tradeNo>
	//    3    5:return          
	}

	public void setTradeTime(String s)
	{
		tradeTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String tradeTime>
	//    3    5:return          
	}

	public void setTradeType(EnumTradeType enumtradetype)
	{
		tradeType = enumtradetype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field EnumTradeType tradeType>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
	private int amount;
	private int balance;
	private byte oriTradeType;
	private int overdraft;
	private byte terminalTradeType;
	private String tradeDate;
	private String tradeDevice;
	private int tradeNo;
	private String tradeTime;
	private EnumTradeType tradeType;
}
