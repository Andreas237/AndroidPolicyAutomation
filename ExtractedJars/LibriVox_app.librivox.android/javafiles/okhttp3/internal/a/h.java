// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package okhttp3.internal.a;

import a.aa;
import java.io.IOException;

// Referenced classes of package okhttp3.internal.a:
//			m, f

class h extends m
{

	h(f f1, aa aa)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field f b>
		super(aa);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #28  <Method void m(aa)>
	//    6   10:return          
	}

	protected void a(IOException ioexception)
	{
		if(!a && !Thread.holdsLock(((Object) (b))))
	//*   0    0:getstatic       #20  <Field boolean a>
	//*   1    3:ifne            27
	//*   2    6:aload_0         
	//*   3    7:getfield        #25  <Field f b>
	//*   4   10:invokestatic    #35  <Method boolean Thread.holdsLock(Object)>
	//*   5   13:ifeq            19
	//*   6   16:goto            27
		{
			throw new AssertionError();
	//    7   19:new             #37  <Class AssertionError>
	//    8   22:dup             
	//    9   23:invokespecial   #39  <Method void AssertionError()>
	//   10   26:athrow          
		} else
		{
			b.h = true;
	//   11   27:aload_0         
	//   12   28:getfield        #25  <Field f b>
	//   13   31:iconst_1        
	//   14   32:putfield        #42  <Field boolean f.h>
			return;
	//   15   35:return          
		}
	}

	static final boolean a = ((Class) (okhttp3/internal/a/f)).desiredAssertionStatus() ^ true;
	final f b;

	static 
	{
	//    0    0:ldc1            #12  <Class f>
	//    1    2:invokevirtual   #18  <Method boolean Class.desiredAssertionStatus()>
	//    2    5:iconst_1        
	//    3    6:ixor            
	//    4    7:putstatic       #20  <Field boolean a>
	//*   5   10:return          
	}
}
