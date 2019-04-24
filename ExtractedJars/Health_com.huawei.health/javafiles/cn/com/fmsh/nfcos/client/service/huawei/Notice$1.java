// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			Notice

class Notice$1
	implements android.os.e.Creator
{

	public Notice createFromParcel(Parcel parcel)
	{
		Notice notice = new Notice();
	//    0    0:new             #9   <Class Notice>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Notice()>
	//    3    7:astore_2        
		notice.no = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int Notice.no>
		notice.title = parcel.readString();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #31  <Method String Parcel.readString()>
	//   11   21:putfield        #35  <Field String Notice.title>
		notice.content = parcel.readString();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #31  <Method String Parcel.readString()>
	//   15   29:putfield        #38  <Field String Notice.content>
		notice.startDate = parcel.readString();
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #31  <Method String Parcel.readString()>
	//   19   37:putfield        #41  <Field String Notice.startDate>
		notice.endDate = parcel.readString();
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #31  <Method String Parcel.readString()>
	//   23   45:putfield        #44  <Field String Notice.endDate>
		notice.type = parcel.readInt();
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #23  <Method int Parcel.readInt()>
	//   27   53:putfield        #47  <Field int Notice.type>
		notice.order = Notice.readBytesWithNull(parcel);
	//   28   56:aload_2         
	//   29   57:aload_1         
	//   30   58:invokestatic    #51  <Method byte[] Notice.readBytesWithNull(Parcel)>
	//   31   61:putfield        #55  <Field byte[] Notice.order>
		return notice;
	//   32   64:aload_2         
	//   33   65:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method Notice createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public Notice[] newArray(int i)
	{
		return new Notice[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Notice[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #63  <Method Notice[] newArray(int)>
	//    3    5:areturn         
	}

	Notice$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
