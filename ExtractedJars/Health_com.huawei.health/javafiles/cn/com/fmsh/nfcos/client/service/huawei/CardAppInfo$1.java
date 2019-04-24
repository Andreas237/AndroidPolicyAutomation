// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			CardAppInfo, CardAppRecord

class CardAppInfo$1
	implements android.os.ator
{

	public CardAppInfo createFromParcel(Parcel parcel)
	{
		CardAppInfo cardappinfo = new CardAppInfo();
	//    0    0:new             #9   <Class CardAppInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void CardAppInfo()>
	//    3    7:astore_2        
		cardappinfo.cardFaceNo = parcel.readString();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
	//    7   13:putfield        #27  <Field String CardAppInfo.cardFaceNo>
		cardappinfo.appNo = CardAppInfo.readBytesWithNull(parcel);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #31  <Method byte[] CardAppInfo.readBytesWithNull(Parcel)>
	//   11   21:putfield        #35  <Field byte[] CardAppInfo.appNo>
		cardappinfo.balance = parcel.readInt();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method int Parcel.readInt()>
	//   15   29:putfield        #43  <Field int CardAppInfo.balance>
		cardappinfo.records = (CardAppRecord[])parcel.readParcelableArray(((Class) (cn/com/fmsh/nfcos/client/service/huawei/CardAppRecord)).getClassLoader());
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:ldc1            #45  <Class CardAppRecord>
	//   19   36:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//   20   39:invokevirtual   #55  <Method android.os.Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   21   42:checkcast       #57  <Class CardAppRecord[]>
	//   22   45:putfield        #60  <Field CardAppRecord[] CardAppInfo.records>
		cardappinfo.appLock = parcel.readInt();
	//   23   48:aload_2         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #39  <Method int Parcel.readInt()>
	//   26   53:putfield        #63  <Field int CardAppInfo.appLock>
		cardappinfo.cardType = parcel.readInt();
	//   27   56:aload_2         
	//   28   57:aload_1         
	//   29   58:invokevirtual   #39  <Method int Parcel.readInt()>
	//   30   61:putfield        #66  <Field int CardAppInfo.cardType>
		cardappinfo.moc = parcel.readString();
	//   31   64:aload_2         
	//   32   65:aload_1         
	//   33   66:invokevirtual   #23  <Method String Parcel.readString()>
	//   34   69:putfield        #69  <Field String CardAppInfo.moc>
		cardappinfo.time4Validity = parcel.readString();
	//   35   72:aload_2         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #23  <Method String Parcel.readString()>
	//   38   77:putfield        #72  <Field String CardAppInfo.time4Validity>
		return cardappinfo;
	//   39   80:aload_2         
	//   40   81:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method CardAppInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public CardAppInfo[] newArray(int i)
	{
		return new CardAppInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CardAppInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method CardAppInfo[] newArray(int)>
	//    3    5:areturn         
	}

	CardAppInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
