// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioAttributes

public static final class AudioAttributes$Builder
{

	public AudioAttributes build()
	{
		return new AudioAttributes(contentType, flags, usage, ((AudioAttributes._cls1) (null)));
	//    0    0:new             #6   <Class AudioAttributes>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field int contentType>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field int flags>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field int usage>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #27  <Method void AudioAttributes(int, int, int, AudioAttributes$1)>
	//   10   20:areturn         
	}

	public AudioAttributes$Builder setContentType(int i)
	{
		contentType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int contentType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AudioAttributes$Builder setFlags(int i)
	{
		flags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int flags>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AudioAttributes$Builder setUsage(int i)
	{
		usage = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int usage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int contentType;
	private int flags;
	private int usage;

	public AudioAttributes$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		contentType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int contentType>
		flags = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int flags>
		usage = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #21  <Field int usage>
	//   11   19:return          
	}
}
