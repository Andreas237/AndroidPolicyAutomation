// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			AsyncLayoutInflater

static class AsyncLayoutInflater$BasicInflater extends LayoutInflater
{

	public LayoutInflater cloneInContext(Context context)
	{
		return ((LayoutInflater) (new AsyncLayoutInflater$BasicInflater(context)));
	//    0    0:new             #2   <Class AsyncLayoutInflater$BasicInflater>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #29  <Method void AsyncLayoutInflater$BasicInflater(Context)>
	//    4    8:areturn         
	}

	protected View onCreateView(String s, AttributeSet attributeset)
		throws ClassNotFoundException
	{
		int i;
		int j;
		String as[];
		as = sClassPrefixList;
	//    0    0:getstatic       #21  <Field String[] sClassPrefixList>
	//    1    3:astore          5
		j = as.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore          4
		i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//    7   12:iload_3         
	//    8   13:iload           4
	//    9   15:icmpge          54
_L1:
		Object obj = ((Object) (as[i]));
	//   10   18:aload           5
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          6
		obj = ((Object) (createView(s, ((String) (obj)), attributeset)));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:aload           6
	//   17   28:aload_2         
	//   18   29:invokevirtual   #37  <Method View createView(String, String, AttributeSet)>
	//   19   32:astore          6
		if(obj != null)
	//*  20   34:aload           6
	//*  21   36:ifnull          42
			return ((View) (obj));
	//   22   39:aload           6
	//   23   41:areturn         
		continue; /* Loop/switch isn't completed */
	//   24   42:goto            47
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   25   45:astore          6
		i++;
	//   26   47:iload_3         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:istore_3        
		  goto _L3
	//*  30   51:goto            12
_L2:
		return super.onCreateView(s, attributeset);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:aload_2         
	//   34   57:invokespecial   #39  <Method View LayoutInflater.onCreateView(String, AttributeSet)>
	//   35   60:areturn         
	}

	private static final String sClassPrefixList[] = {
		"android.widget.", "android.webkit.", "android.app."
	};

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #15  <String "android.widget.">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #17  <String "android.webkit.">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #19  <String "android.app.">
	//   13   18:aastore         
	//   14   19:putstatic       #21  <Field String[] sClassPrefixList>
	//*  15   22:return          
	}

	AsyncLayoutInflater$BasicInflater(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void LayoutInflater(Context)>
	//    3    5:return          
	}
}
