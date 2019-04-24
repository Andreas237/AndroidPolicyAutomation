// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

public static class MediaBrowserServiceCompat$c
{

	void a(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int e>
	//    3    5:return          
	}

	void a(Object obj)
	{
	//    0    0:return          
	}

	boolean a()
	{
		return b || c || d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean b>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field boolean c>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field boolean d>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	int b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int e>
	//    2    4:ireturn         
	}

	void b(Bundle bundle)
	{
		bundle = ((Bundle) (new StringBuilder()));
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bundle)).append("It is not supported to send an error for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #42  <String "It is not supported to send an error for ">
	//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bundle)).append(a);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field Object a>
	//   11   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
	//   13   24:new             #51  <Class UnsupportedOperationException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//   18   35:athrow          
	}

	public void b(Object obj)
	{
		if(!c && !d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean c>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field boolean d>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			c = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #33  <Field boolean c>
			a(obj);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #60  <Method void a(Object)>
			return;
	//   13   27:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   14   28:new             #39  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #40  <Method void StringBuilder()>
	//   17   35:astore_1        
			((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
	//   18   36:aload_1         
	//   19   37:ldc1            #62  <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
	//   20   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			((StringBuilder) (obj)).append(a);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field Object a>
	//   25   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   27   52:new             #64  <Class IllegalStateException>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #65  <Method void IllegalStateException(String)>
	//   32   63:athrow          
		}
	}

	public void c(Bundle bundle)
	{
		if(!c && !d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean c>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field boolean d>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			d = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #35  <Field boolean d>
			b(bundle);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #67  <Method void b(Bundle)>
			return;
	//   13   27:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   14   28:new             #39  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #40  <Method void StringBuilder()>
	//   17   35:astore_1        
			((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
	//   18   36:aload_1         
	//   19   37:ldc1            #69  <String "sendError() called when either sendResult() or sendError() had already been called for: ">
	//   20   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			((StringBuilder) (bundle)).append(a);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field Object a>
	//   25   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   27   52:new             #64  <Class IllegalStateException>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #65  <Method void IllegalStateException(String)>
	//   32   63:athrow          
		}
	}

	private final Object a;
	private boolean b;
	private boolean c;
	private boolean d;
	private int e;

	MediaBrowserServiceCompat$c(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object a>
	//    5    9:return          
	}
}
