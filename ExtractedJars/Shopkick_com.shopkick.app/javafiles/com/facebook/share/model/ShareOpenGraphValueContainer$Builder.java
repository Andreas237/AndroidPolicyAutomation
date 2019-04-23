// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareOpenGraphValueContainer, ShareOpenGraphObject, SharePhoto, 
//			ShareModel

public static abstract class ShareOpenGraphValueContainer$Builder
	implements ShareModelBuilder
{

	public ShareOpenGraphValueContainer$Builder putBoolean(String s, boolean flag)
	{
		bundle.putBoolean(s, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #29  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putBooleanArray(String s, boolean aflag[])
	{
		bundle.putBooleanArray(s, aflag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method void Bundle.putBooleanArray(String, boolean[])>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putDouble(String s, double d)
	{
		bundle.putDouble(s, d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #44  <Method void Bundle.putDouble(String, double)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putDoubleArray(String s, double ad[])
	{
		bundle.putDoubleArray(s, ad);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #50  <Method void Bundle.putDoubleArray(String, double[])>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putInt(String s, int i)
	{
		bundle.putInt(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #56  <Method void Bundle.putInt(String, int)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putIntArray(String s, int ai[])
	{
		bundle.putIntArray(s, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #62  <Method void Bundle.putIntArray(String, int[])>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putLong(String s, long l)
	{
		bundle.putLong(s, l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #68  <Method void Bundle.putLong(String, long)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putLongArray(String s, long al[])
	{
		bundle.putLongArray(s, al);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #74  <Method void Bundle.putLongArray(String, long[])>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putObject(String s, ShareOpenGraphObject shareopengraphobject)
	{
		bundle.putParcelable(s, ((android.os.Parcelable) (shareopengraphobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #81  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putObjectArrayList(String s, ArrayList arraylist)
	{
		bundle.putParcelableArrayList(s, arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #88  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putPhoto(String s, SharePhoto sharephoto)
	{
		bundle.putParcelable(s, ((android.os.Parcelable) (sharephoto)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #81  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putPhotoArrayList(String s, ArrayList arraylist)
	{
		bundle.putParcelableArrayList(s, arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #88  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putString(String s, String s1)
	{
		bundle.putString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #99  <Method void Bundle.putString(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareOpenGraphValueContainer$Builder putStringArrayList(String s, ArrayList arraylist)
	{
		bundle.putStringArrayList(s, arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #103 <Method void Bundle.putStringArrayList(String, ArrayList)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareOpenGraphValueContainer)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareOpenGraphValueContainer>
	//    3    5:invokevirtual   #109 <Method ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer)>
	//    4    8:areturn         
	}

	public ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
	{
		if(shareopengraphvaluecontainer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			bundle.putAll(shareopengraphvaluecontainer.getBundle());
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Bundle bundle>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method Bundle ShareOpenGraphValueContainer.getBundle()>
	//    6   12:invokevirtual   #117 <Method void Bundle.putAll(Bundle)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private Bundle bundle;


/*
	static Bundle access$000(ShareOpenGraphValueContainer$Builder shareopengraphvaluecontainer$builder)
	{
		return shareopengraphvaluecontainer$builder.bundle;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:areturn         
	}

*/

	public ShareOpenGraphValueContainer$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		bundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle bundle>
	//    7   15:return          
	}
}
