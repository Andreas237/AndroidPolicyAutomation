// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


public final class RendererConfiguration
{

	public RendererConfiguration(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		tunnelingAudioSessionId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int tunnelingAudioSessionId>
	//    5    9:return          
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
	//*   6    8:ifnull          44
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #28  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((RendererConfiguration)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class RendererConfiguration>
	//   16   28:astore_1        
			return tunnelingAudioSessionId == ((RendererConfiguration) (obj)).tunnelingAudioSessionId;
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field int tunnelingAudioSessionId>
	//   19   33:aload_1         
	//   20   34:getfield        #21  <Field int tunnelingAudioSessionId>
	//   21   37:icmpne          42
	//   22   40:iconst_1        
	//   23   41:ireturn         
	//   24   42:iconst_0        
	//   25   43:ireturn         
		} else
		{
			return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
		}
	}

	public int hashCode()
	{
		return tunnelingAudioSessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int tunnelingAudioSessionId>
	//    2    4:ireturn         
	}

	public static final RendererConfiguration DEFAULT = new RendererConfiguration(0);
	public final int tunnelingAudioSessionId;

	static 
	{
	//    0    0:new             #2   <Class RendererConfiguration>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #14  <Method void RendererConfiguration(int)>
	//    4    8:putstatic       #16  <Field RendererConfiguration DEFAULT>
	//*   5   11:return          
	}
}
