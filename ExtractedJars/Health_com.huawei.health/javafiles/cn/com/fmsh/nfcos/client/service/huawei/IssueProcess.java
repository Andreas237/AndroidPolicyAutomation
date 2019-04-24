// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class IssueProcess
	implements Parcelable
{

	public IssueProcess()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		process = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method int Parcel.readInt()>
	//    3    5:putfield        #33  <Field int process>
	//    4    8:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(process);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int process>
	//    3    5:invokevirtual   #39  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public IssueProcess createFromParcel(Parcel parcel)
		{
			IssueProcess issueprocess = new IssueProcess();
		//    0    0:new             #9   <Class IssueProcess>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void IssueProcess()>
		//    3    7:astore_2        
			issueprocess.process = parcel.readInt();
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
		//    7   13:putfield        #27  <Field int IssueProcess.process>
			return issueprocess;
		//    8   16:aload_2         
		//    9   17:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #30  <Method IssueProcess createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public IssueProcess[] newArray(int i)
		{
			return new IssueProcess[i];
		//    0    0:iload_1         
		//    1    1:anewarray       IssueProcess[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method IssueProcess[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public int process;

	static 
	{
	//    0    0:new             #8   <Class IssueProcess$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void IssueProcess$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
