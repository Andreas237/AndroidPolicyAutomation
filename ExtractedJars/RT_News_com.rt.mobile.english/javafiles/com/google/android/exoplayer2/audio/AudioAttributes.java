// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


public final class AudioAttributes
{
	public static final class Builder
	{

		public AudioAttributes build()
		{
			return new AudioAttributes(contentType, flags, usage);
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

		public Builder setContentType(int i)
		{
			contentType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field int contentType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setFlags(int i)
		{
			flags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #19  <Field int flags>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUsage(int i)
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

		public Builder()
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


	private AudioAttributes(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		contentType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int contentType>
		flags = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #35  <Field int flags>
		usage = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #37  <Field int usage>
	//   11   19:return          
	}


	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          66
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #47  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #47  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AudioAttributes)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AudioAttributes>
	//   16   28:astore_1        
			return contentType == ((AudioAttributes) (obj)).contentType && flags == ((AudioAttributes) (obj)).flags && usage == ((AudioAttributes) (obj)).usage;
	//   17   29:aload_0         
	//   18   30:getfield        #33  <Field int contentType>
	//   19   33:aload_1         
	//   20   34:getfield        #33  <Field int contentType>
	//   21   37:icmpne          64
	//   22   40:aload_0         
	//   23   41:getfield        #35  <Field int flags>
	//   24   44:aload_1         
	//   25   45:getfield        #35  <Field int flags>
	//   26   48:icmpne          64
	//   27   51:aload_0         
	//   28   52:getfield        #37  <Field int usage>
	//   29   55:aload_1         
	//   30   56:getfield        #37  <Field int usage>
	//   31   59:icmpne          64
	//   32   62:iconst_1        
	//   33   63:ireturn         
	//   34   64:iconst_0        
	//   35   65:ireturn         
		} else
		{
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		}
	}

	android.media.AudioAttributes getAudioAttributesV21()
	{
		if(audioAttributesV21 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field android.media.AudioAttributes audioAttributesV21>
	//*   2    4:ifnonnull       42
			audioAttributesV21 = (new android.media.Builder()).setContentType(contentType).setFlags(flags).setUsage(usage).build();
	//    3    7:aload_0         
	//    4    8:new             #57  <Class android.media.AudioAttributes$Builder>
	//    5   11:dup             
	//    6   12:invokespecial   #58  <Method void android.media.AudioAttributes$Builder()>
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field int contentType>
	//    9   19:invokevirtual   #62  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field int flags>
	//   12   26:invokevirtual   #65  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setFlags(int)>
	//   13   29:aload_0         
	//   14   30:getfield        #37  <Field int usage>
	//   15   33:invokevirtual   #68  <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   16   36:invokevirtual   #70  <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   17   39:putfield        #55  <Field android.media.AudioAttributes audioAttributesV21>
		return audioAttributesV21;
	//   18   42:aload_0         
	//   19   43:getfield        #55  <Field android.media.AudioAttributes audioAttributesV21>
	//   20   46:areturn         
	}

	public int hashCode()
	{
		return 31 * ((527 + contentType) * 31 + flags) + usage;
	//    0    0:bipush          31
	//    1    2:sipush          527
	//    2    5:aload_0         
	//    3    6:getfield        #33  <Field int contentType>
	//    4    9:iadd            
	//    5   10:bipush          31
	//    6   12:imul            
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field int flags>
	//    9   17:iadd            
	//   10   18:imul            
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field int usage>
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	public static final AudioAttributes DEFAULT = (new Builder()).build();
	private android.media.AudioAttributes audioAttributesV21;
	public final int contentType;
	public final int flags;
	public final int usage;

	static 
	{
	//    0    0:new             #8   <Class AudioAttributes$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void AudioAttributes$Builder()>
	//    3    7:invokevirtual   #26  <Method AudioAttributes AudioAttributes$Builder.build()>
	//    4   10:putstatic       #28  <Field AudioAttributes DEFAULT>
	//*   5   13:return          
	}
}
