// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			CardAppRecord

public class CardAppInfo
{

	public CardAppInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		cardType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field int cardType>
		isAppClose = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field boolean isAppClose>
		records = ((List) (new ArrayList()));
	//    8   14:aload_0         
	//    9   15:new             #31  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #32  <Method void ArrayList()>
	//   12   22:putfield        #34  <Field List records>
	//   13   25:return          
	}

	public void addRecord(CardAppRecord cardapprecord)
	{
		if(cardapprecord != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			records.add(((Object) (cardapprecord)));
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field List records>
	//    4    8:aload_1         
	//    5    9:invokeinterface #43  <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void addRecord(CardAppRecord acardapprecord[])
	{
		if(records == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field List records>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int j = acardapprecord.length;
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_2        
	//*   9   13:goto            37
		{
			CardAppRecord cardapprecord = acardapprecord[i];
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			records.add(((Object) (cardapprecord)));
	//   14   21:aload_0         
	//   15   22:getfield        #34  <Field List records>
	//   16   25:aload           4
	//   17   27:invokeinterface #43  <Method boolean List.add(Object)>
	//   18   32:pop             
		}

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//   23   37:iload_2         
	//   24   38:iload_3         
	//   25   39:icmplt          16
	//   26   42:return          
	}

	public Integer getBalance()
	{
		return balance;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Integer balance>
	//    2    4:areturn         
	}

	public String getBalanceDelayDate()
	{
		return delayDate;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String delayDate>
	//    2    4:areturn         
	}

	public byte[] getCardAppNo()
	{
		return cardAppNo;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field byte[] cardAppNo>
	//    2    4:areturn         
	}

	public int getCardType()
	{
		return cardType;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int cardType>
	//    2    4:ireturn         
	}

	public String getFaceId()
	{
		return faceId;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String faceId>
	//    2    4:areturn         
	}

	public String getMoc()
	{
		return moc;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String moc>
	//    2    4:areturn         
	}

	public CardAppRecord[] getRecords()
	{
		if(records == null || records.size() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field List records>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field List records>
	//*   5   11:invokeinterface #69  <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:icmpge          22
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		else
			return (CardAppRecord[])records.toArray(((Object []) (new CardAppRecord[0])));
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field List records>
	//   12   26:iconst_0        
	//   13   27:anewarray       CardAppRecord[]
	//   14   30:invokeinterface #75  <Method Object[] List.toArray(Object[])>
	//   15   35:checkcast       #77  <Class CardAppRecord[]>
	//   16   38:areturn         
	}

	public String getTime4Validity()
	{
		return time4Validity;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String time4Validity>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String title>
	//    2    4:areturn         
	}

	public boolean isAppClose()
	{
		return isAppClose;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean isAppClose>
	//    2    4:ireturn         
	}

	public void setAppClose(boolean flag)
	{
		isAppClose = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean isAppClose>
	//    3    5:return          
	}

	public void setBalance(Integer integer)
	{
		balance = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Integer balance>
	//    3    5:return          
	}

	public void setCardAppNo(byte abyte0[])
	{
		cardAppNo = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field byte[] cardAppNo>
	//    3    5:return          
	}

	public void setCardType(int i)
	{
		cardType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int cardType>
	//    3    5:return          
	}

	public void setDelayDate(String s)
	{
		delayDate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String delayDate>
	//    3    5:return          
	}

	public void setFaceId(String s)
	{
		faceId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String faceId>
	//    3    5:return          
	}

	public void setMoc(String s)
	{
		moc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field String moc>
	//    3    5:return          
	}

	public void setTime4Validity(String s)
	{
		time4Validity = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field String time4Validity>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field String title>
	//    3    5:return          
	}

	private Integer balance;
	private byte cardAppNo[];
	private int cardType;
	private String delayDate;
	private String faceId;
	private boolean isAppClose;
	private String moc;
	private List records;
	private String time4Validity;
	private String title;
}
