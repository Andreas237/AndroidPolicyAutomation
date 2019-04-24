// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;

public final class ExoPlaybackException extends Exception
{
	public static interface Type
		extends Annotation
	{
	}


	private ExoPlaybackException(int i, String s, Throwable throwable, int j)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #21  <Method void Exception(String, Throwable)>
		type = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #23  <Field int type>
		rendererIndex = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #25  <Field int rendererIndex>
	//   10   17:return          
	}

	public static ExoPlaybackException createForRenderer(Exception exception, int i)
	{
		return new ExoPlaybackException(1, ((String) (null)), ((Throwable) (exception)), i);
	//    0    0:new             #2   <Class ExoPlaybackException>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokespecial   #30  <Method void ExoPlaybackException(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	public static ExoPlaybackException createForSource(IOException ioexception)
	{
		return new ExoPlaybackException(0, ((String) (null)), ((Throwable) (ioexception)), -1);
	//    0    0:new             #2   <Class ExoPlaybackException>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #30  <Method void ExoPlaybackException(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	static ExoPlaybackException createForUnexpected(RuntimeException runtimeexception)
	{
		return new ExoPlaybackException(2, ((String) (null)), ((Throwable) (runtimeexception)), -1);
	//    0    0:new             #2   <Class ExoPlaybackException>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #30  <Method void ExoPlaybackException(int, String, Throwable, int)>
	//    7   11:areturn         
	}

	public Exception getRendererException()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int type>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		Assertions.checkState(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #42  <Method void Assertions.checkState(boolean)>
		return (Exception)getCause();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #46  <Method Throwable getCause()>
	//   15   25:checkcast       #4   <Class Exception>
	//   16   28:areturn         
	}

	public IOException getSourceException()
	{
		boolean flag;
		if(type == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int type>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #42  <Method void Assertions.checkState(boolean)>
		return (IOException)getCause();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #46  <Method Throwable getCause()>
	//   12   22:checkcast       #50  <Class IOException>
	//   13   25:areturn         
	}

	public RuntimeException getUnexpectedException()
	{
		boolean flag;
		if(type == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #42  <Method void Assertions.checkState(boolean)>
		return (RuntimeException)getCause();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #46  <Method Throwable getCause()>
	//   13   23:checkcast       #54  <Class RuntimeException>
	//   14   26:areturn         
	}

	public static final int TYPE_RENDERER = 1;
	public static final int TYPE_SOURCE = 0;
	public static final int TYPE_UNEXPECTED = 2;
	public final int rendererIndex;
	public final int type;
}
