// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ao, wx, an, xg

final class xj
	implements ao
{

	xj(xg xg, List list, an an1, Context context)
	{
		a = list;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #16  <Field List a>
		b = an1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field an b>
		c = context;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #20  <Field Context c>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #23  <Method void Object()>
	//   11   20:return          
	}

	public final void a()
	{
		Object obj;
		for(Iterator iterator = a.iterator(); iterator.hasNext(); b.a(((Uri) (obj)), ((android.os.Bundle) (null)), ((List) (null))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field List a>
	//*   2    4:invokeinterface #30  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            84
		{
			String s = (String)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #40  <Method Object Iterator.next()>
	//    9   25:checkcast       #42  <Class String>
	//   10   28:astore_3        
			obj = ((Object) (String.valueOf(((Object) (s)))));
	//   11   29:aload_3         
	//   12   30:invokestatic    #46  <Method String String.valueOf(Object)>
	//   13   33:astore_1        
			if(((String) (obj)).length() != 0)
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #50  <Method int String.length()>
	//*  16   38:ifeq            51
				obj = ((Object) ("Pinging url: ".concat(((String) (obj)))));
	//   17   41:ldc1            #52  <String "Pinging url: ">
	//   18   43:aload_1         
	//   19   44:invokevirtual   #56  <Method String String.concat(String)>
	//   20   47:astore_1        
			else
	//*  21   48:goto            61
				obj = ((Object) (new String("Pinging url: ")));
	//   22   51:new             #42  <Class String>
	//   23   54:dup             
	//   24   55:ldc1            #52  <String "Pinging url: ">
	//   25   57:invokespecial   #59  <Method void String(String)>
	//   26   60:astore_1        
			wx.d(((String) (obj)));
	//   27   61:aload_1         
	//   28   62:invokestatic    #64  <Method void wx.d(String)>
			obj = ((Object) (Uri.parse(s)));
	//   29   65:aload_3         
	//   30   66:invokestatic    #70  <Method Uri Uri.parse(String)>
	//   31   69:astore_1        
		}

	//   32   70:aload_0         
	//   33   71:getfield        #18  <Field an b>
	//   34   74:aload_1         
	//   35   75:aconst_null     
	//   36   76:aconst_null     
	//   37   77:invokevirtual   #75  <Method boolean an.a(Uri, android.os.Bundle, List)>
	//   38   80:pop             
	//*  39   81:goto            10
		b.a((Activity)c);
	//   40   84:aload_0         
	//   41   85:getfield        #18  <Field an b>
	//   42   88:aload_0         
	//   43   89:getfield        #20  <Field Context c>
	//   44   92:checkcast       #77  <Class Activity>
	//   45   95:invokevirtual   #80  <Method void an.a(Activity)>
	//   46   98:return          
	}

	public final void b()
	{
	//    0    0:return          
	}

	private final List a;
	private final an b;
	private final Context c;
}
