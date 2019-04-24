// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			CardAppRecord

class CardAppRecord$1
	implements android.os.or
{

	public CardAppRecord createFromParcel(Parcel parcel)
	{
		CardAppRecord cardapprecord = new CardAppRecord();
	//    0    0:new             #9   <Class CardAppRecord>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void CardAppRecord()>
	//    3    7:astore_2        
		cardapprecord.tradeType = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int CardAppRecord.tradeType>
		cardapprecord.tradeDate = parcel.readString();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #31  <Method String Parcel.readString()>
	//   11   21:putfield        #35  <Field String CardAppRecord.tradeDate>
		cardapprecord.tradeTime = parcel.readString();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #31  <Method String Parcel.readString()>
	//   15   29:putfield        #38  <Field String CardAppRecord.tradeTime>
		cardapprecord.amount = parcel.readInt();
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #23  <Method int Parcel.readInt()>
	//   19   37:putfield        #41  <Field int CardAppRecord.amount>
		cardapprecord.balance = parcel.readInt();
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #23  <Method int Parcel.readInt()>
	//   23   45:putfield        #44  <Field int CardAppRecord.balance>
		return cardapprecord;
	//   24   48:aload_2         
	//   25   49:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method CardAppRecord createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public CardAppRecord[] newArray(int i)
	{
		return new CardAppRecord[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CardAppRecord[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #52  <Method CardAppRecord[] newArray(int)>
	//    3    5:areturn         
	}

	CardAppRecord$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
