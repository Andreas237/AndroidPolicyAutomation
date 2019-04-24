// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, c

private static class MediaBrowserCompat$m
{

	public MediaBrowserCompat$n a(Context context, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bundle.setClassLoader(context.getClassLoader());
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method ClassLoader Context.getClassLoader()>
	//    5    9:invokevirtual   #37  <Method void Bundle.setClassLoader(ClassLoader)>
		for(int i = 0; i < b.size(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:aload_0         
	//*  10   16:getfield        #23  <Field List b>
	//*  11   19:invokeinterface #43  <Method int List.size()>
	//*  12   24:icmpge          68
			if(c.a((Bundle)b.get(i), bundle))
	//*  13   27:aload_0         
	//*  14   28:getfield        #23  <Field List b>
	//*  15   31:iload_3         
	//*  16   32:invokeinterface #47  <Method Object List.get(int)>
	//*  17   37:checkcast       #33  <Class Bundle>
	//*  18   40:aload_2         
	//*  19   41:invokestatic    #52  <Method boolean c.a(Bundle, Bundle)>
	//*  20   44:ifeq            61
				return (MediaBrowserCompat$n)a.get(i);
	//   21   47:aload_0         
	//   22   48:getfield        #21  <Field List a>
	//   23   51:iload_3         
	//   24   52:invokeinterface #47  <Method Object List.get(int)>
	//   25   57:checkcast       #54  <Class MediaBrowserCompat$n>
	//   26   60:areturn         

	//   27   61:iload_3         
	//   28   62:iconst_1        
	//   29   63:iadd            
	//   30   64:istore_3        
	//*  31   65:goto            14
		return null;
	//   32   68:aconst_null     
	//   33   69:areturn         
	}

	public List a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List b>
	//    2    4:areturn         
	}

	public List b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List a>
	//    2    4:areturn         
	}

	private final List a = new ArrayList();
	private final List b = new ArrayList();

	public MediaBrowserCompat$m()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List a>
	//    7   15:aload_0         
	//    8   16:new             #18  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void ArrayList()>
	//   11   23:putfield        #23  <Field List b>
	//   12   26:return          
	}
}
