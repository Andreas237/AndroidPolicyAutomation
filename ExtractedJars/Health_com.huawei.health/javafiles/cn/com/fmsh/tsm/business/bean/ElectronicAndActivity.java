// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import java.util.ArrayList;
import java.util.List;

public class ElectronicAndActivity
{
	public class Object4Activity
	{

		public byte activity[];
		final ElectronicAndActivity this$0;
		public byte ticketType[];

		public Object4Activity(byte abyte0[], byte abyte1[])
		{
			this$0 = ElectronicAndActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ElectronicAndActivity this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			ticketType = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field byte[] ticketType>
			activity = abyte1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #23  <Field byte[] activity>
		//   11   19:return          
		}
	}

	public class Object4Url
	{

		final ElectronicAndActivity this$0;
		public byte url[];
		public byte urlType[];

		public Object4Url(byte abyte0[], byte abyte1[])
		{
			this$0 = ElectronicAndActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ElectronicAndActivity this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			url = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field byte[] url>
			urlType = abyte1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #23  <Field byte[] urlType>
		//   11   19:return          
		}
	}


	public ElectronicAndActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		urls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List urls>
		activites = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #21  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void ArrayList()>
	//   11   23:putfield        #26  <Field List activites>
	//   12   26:return          
	}

	public void addActivity(byte abyte0[], byte abyte1[])
	{
		activites.add(((Object) (new Object4Activity(abyte0, abyte1))));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List activites>
	//    2    4:new             #6   <Class ElectronicAndActivity$Object4Activity>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #32  <Method void ElectronicAndActivity$Object4Activity(ElectronicAndActivity, byte[], byte[])>
	//    8   14:invokeinterface #38  <Method boolean List.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void addUrl(byte abyte0[], byte abyte1[])
	{
		urls.add(((Object) (new Object4Url(abyte0, abyte1))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List urls>
	//    2    4:new             #9   <Class ElectronicAndActivity$Object4Url>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #40  <Method void ElectronicAndActivity$Object4Url(ElectronicAndActivity, byte[], byte[])>
	//    8   14:invokeinterface #38  <Method boolean List.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public Object4Activity[] getActivity()
	{
		return (Object4Activity[])activites.toArray(((Object []) (new Object4Activity[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List activites>
	//    2    4:iconst_0        
	//    3    5:anewarray       Object4Activity[]
	//    4    8:invokeinterface #46  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #48  <Class ElectronicAndActivity$Object4Activity[]>
	//    6   16:areturn         
	}

	public Object4Url[] getUrls()
	{
		return (Object4Url[])urls.toArray(((Object []) (new Object4Url[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List urls>
	//    2    4:iconst_0        
	//    3    5:anewarray       Object4Url[]
	//    4    8:invokeinterface #46  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #52  <Class ElectronicAndActivity$Object4Url[]>
	//    6   16:areturn         
	}

	private List activites;
	private List urls;
}
