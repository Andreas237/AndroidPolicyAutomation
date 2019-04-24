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
//			zzoi, zzakb, zzoh, zzakk

final class zzakl
	implements zzoi
{

	zzakl(zzakk zzakk, List list, zzoh zzoh1, Context context)
	{
		zzcrs = list;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #16  <Field List zzcrs>
		zzcrt = zzoh1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field zzoh zzcrt>
		val$context = context;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #20  <Field Context val$context>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #23  <Method void Object()>
	//   11   20:return          
	}

	public final void zzjp()
	{
		Object obj;
		for(Iterator iterator = zzcrs.iterator(); iterator.hasNext(); zzcrt.mayLaunchUrl(((Uri) (obj)), ((android.os.Bundle) (null)), ((List) (null))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field List zzcrs>
	//*   2    4:invokeinterface #31  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            84
		{
			String s = (String)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #41  <Method Object Iterator.next()>
	//    9   25:checkcast       #43  <Class String>
	//   10   28:astore_3        
			obj = ((Object) (String.valueOf(((Object) (s)))));
	//   11   29:aload_3         
	//   12   30:invokestatic    #47  <Method String String.valueOf(Object)>
	//   13   33:astore_1        
			if(((String) (obj)).length() != 0)
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #51  <Method int String.length()>
	//*  16   38:ifeq            51
				obj = ((Object) ("Pinging url: ".concat(((String) (obj)))));
	//   17   41:ldc1            #53  <String "Pinging url: ">
	//   18   43:aload_1         
	//   19   44:invokevirtual   #57  <Method String String.concat(String)>
	//   20   47:astore_1        
			else
	//*  21   48:goto            61
				obj = ((Object) (new String("Pinging url: ")));
	//   22   51:new             #43  <Class String>
	//   23   54:dup             
	//   24   55:ldc1            #53  <String "Pinging url: ">
	//   25   57:invokespecial   #60  <Method void String(String)>
	//   26   60:astore_1        
			zzakb.zzdj(((String) (obj)));
	//   27   61:aload_1         
	//   28   62:invokestatic    #65  <Method void zzakb.zzdj(String)>
			obj = ((Object) (Uri.parse(s)));
	//   29   65:aload_3         
	//   30   66:invokestatic    #71  <Method Uri Uri.parse(String)>
	//   31   69:astore_1        
		}

	//   32   70:aload_0         
	//   33   71:getfield        #18  <Field zzoh zzcrt>
	//   34   74:aload_1         
	//   35   75:aconst_null     
	//   36   76:aconst_null     
	//   37   77:invokevirtual   #77  <Method boolean zzoh.mayLaunchUrl(Uri, android.os.Bundle, List)>
	//   38   80:pop             
	//*  39   81:goto            10
		zzcrt.zzc((Activity)val$context);
	//   40   84:aload_0         
	//   41   85:getfield        #18  <Field zzoh zzcrt>
	//   42   88:aload_0         
	//   43   89:getfield        #20  <Field Context val$context>
	//   44   92:checkcast       #79  <Class Activity>
	//   45   95:invokevirtual   #83  <Method void zzoh.zzc(Activity)>
	//   46   98:return          
	}

	public final void zzjq()
	{
	//    0    0:return          
	}

	private final Context val$context;
	private final List zzcrs;
	private final zzoh zzcrt;
}
