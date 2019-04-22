// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api.player;

import com.google.c.a.e;

public final class VideoProgressUpdate
{

	public VideoProgressUpdate(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		currentTime = (float)l / 1000F;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:l2f             
	//    5    7:ldc1            #23  <Float 1000F>
	//    6    9:fdiv            
	//    7   10:putfield        #25  <Field float currentTime>
		duration = (float)l1 / 1000F;
	//    8   13:aload_0         
	//    9   14:lload_3         
	//   10   15:l2f             
	//   11   16:ldc1            #23  <Float 1000F>
	//   12   18:fdiv            
	//   13   19:putfield        #27  <Field float duration>
	//   14   22:return          
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
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #33  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #33  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((VideoProgressUpdate)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class VideoProgressUpdate>
	//   18   30:astore_1        
		if(Float.floatToIntBits(currentTime) != Float.floatToIntBits(((VideoProgressUpdate) (obj)).currentTime))
	//*  19   31:aload_0         
	//*  20   32:getfield        #25  <Field float currentTime>
	//*  21   35:invokestatic    #39  <Method int Float.floatToIntBits(float)>
	//*  22   38:aload_1         
	//*  23   39:getfield        #25  <Field float currentTime>
	//*  24   42:invokestatic    #39  <Method int Float.floatToIntBits(float)>
	//*  25   45:icmpeq          50
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		return Float.floatToIntBits(duration) == Float.floatToIntBits(((VideoProgressUpdate) (obj)).duration);
	//   28   50:aload_0         
	//   29   51:getfield        #27  <Field float duration>
	//   30   54:invokestatic    #39  <Method int Float.floatToIntBits(float)>
	//   31   57:aload_1         
	//   32   58:getfield        #27  <Field float duration>
	//   33   61:invokestatic    #39  <Method int Float.floatToIntBits(float)>
	//   34   64:icmpeq          69
	//   35   67:iconst_0        
	//   36   68:ireturn         
	//   37   69:iconst_1        
	//   38   70:ireturn         
	}

	public float getCurrentTime()
	{
		return currentTime;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float currentTime>
	//    2    4:freturn         
	}

	public float getDuration()
	{
		return duration;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float duration>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return e.a(new Object[] {
			Float.valueOf(currentTime), Float.valueOf(duration)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field float currentTime>
	//    6   10:invokestatic    #48  <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field float duration>
	//   12   20:invokestatic    #48  <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:invokestatic    #54  <Method int e.a(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		float f = currentTime;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float currentTime>
	//    2    4:fstore_1        
		float f1 = duration;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field float duration>
	//    5    9:fstore_2        
		StringBuilder stringbuilder = new StringBuilder(75);
	//    6   10:new             #58  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          75
	//    9   16:invokespecial   #61  <Method void StringBuilder(int)>
	//   10   19:astore_3        
		stringbuilder.append("VideoProgressUpdate [currentTime=");
	//   11   20:aload_3         
	//   12   21:ldc1            #63  <String "VideoProgressUpdate [currentTime=">
	//   13   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append(f);
	//   15   27:aload_3         
	//   16   28:fload_1         
	//   17   29:invokevirtual   #70  <Method StringBuilder StringBuilder.append(float)>
	//   18   32:pop             
		stringbuilder.append(", duration=");
	//   19   33:aload_3         
	//   20   34:ldc1            #72  <String ", duration=">
	//   21   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
		stringbuilder.append(f1);
	//   23   40:aload_3         
	//   24   41:fload_2         
	//   25   42:invokevirtual   #70  <Method StringBuilder StringBuilder.append(float)>
	//   26   45:pop             
		stringbuilder.append("]");
	//   27   46:aload_3         
	//   28   47:ldc1            #74  <String "]">
	//   29   49:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   30   52:pop             
		return stringbuilder.toString();
	//   31   53:aload_3         
	//   32   54:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   33   57:areturn         
	}

	public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1L, -1L);
	private float currentTime;
	private float duration;

	static 
	{
	//    0    0:new             #2   <Class VideoProgressUpdate>
	//    1    3:dup             
	//    2    4:ldc2w           #12  <Long -1L>
	//    3    7:ldc2w           #12  <Long -1L>
	//    4   10:invokespecial   #17  <Method void VideoProgressUpdate(long, long)>
	//    5   13:putstatic       #19  <Field VideoProgressUpdate VIDEO_TIME_NOT_READY>
	//*   6   16:return          
	}
}
