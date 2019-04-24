// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.util.Assertions;

public abstract class Id3Frame
	implements com.google.android.exoplayer2.metadata.Metadata.Entry
{

	public Id3Frame(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		id = (String)Assertions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #21  <Class String>
	//    6   12:putfield        #23  <Field String id>
	//    7   15:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String id>
	//    2    4:areturn         
	}

	public final String id;
}
