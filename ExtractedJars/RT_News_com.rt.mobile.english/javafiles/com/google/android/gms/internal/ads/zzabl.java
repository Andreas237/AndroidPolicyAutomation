// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaji, zzaej, zzabr, zznk, 
//			zzkb, zzni, zzaqw, zzasi, 
//			zzabq, zzabn, zzabt, zzabo, 
//			zzakb, zzalc, zzci, zzxn, 
//			zzabm, zznx

public final class zzabl
{

	public zzabl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static zzalc zza(Context context, zza zza1, zzaji zzaji1, zzci zzci, zzaqw zzaqw1, zzxn zzxn, zzabm zzabm, zznx zznx)
	{
		zzaej zzaej1 = zzaji1.zzcos;
	//    0    0:aload_2         
	//    1    1:getfield        #20  <Field zzaej zzaji.zzcos>
	//    2    4:astore          8
		if(zzaej1.zzceq)
	//*   3    6:aload           8
	//*   4    8:getfield        #26  <Field boolean zzaej.zzceq>
	//*   5   11:ifeq            35
			context = ((Context) (new zzabr(context, zzaji1, zzxn, zzabm, zznx, zzaqw1)));
	//    6   14:new             #28  <Class zzabr>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:aload           5
	//   11   22:aload           6
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokespecial   #31  <Method void zzabr(Context, zzaji, zzxn, zzabm, zznx, zzaqw)>
	//   15   31:astore_0        
		else
	//*  16   32:goto            185
		if(!zzaej1.zzare && !(zza1 instanceof zzbc))
	//*  17   35:aload           8
	//*  18   37:getfield        #34  <Field boolean zzaej.zzare>
	//*  19   40:ifne            137
	//*  20   43:aload_1         
	//*  21   44:instanceof      #36  <Class zzbc>
	//*  22   47:ifeq            53
	//*  23   50:goto            137
		{
			zza1 = ((zza) (zznk.zzaxd));
	//   24   53:getstatic       #42  <Field zzna zznk.zzaxd>
	//   25   56:astore_1        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (zza1)))).booleanValue() && PlatformVersion.isAtLeastKitKat() && !PlatformVersion.isAtLeastLollipop() && zzaqw1 != null && zzaqw1.zzud().zzvs())
	//*  26   57:invokestatic    #48  <Method zzni zzkb.zzik()>
	//*  27   60:aload_1         
	//*  28   61:invokevirtual   #54  <Method Object zzni.zzd(zzna)>
	//*  29   64:checkcast       #56  <Class Boolean>
	//*  30   67:invokevirtual   #60  <Method boolean Boolean.booleanValue()>
	//*  31   70:ifeq            120
	//*  32   73:invokestatic    #65  <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*  33   76:ifeq            120
	//*  34   79:invokestatic    #68  <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*  35   82:ifne            120
	//*  36   85:aload           4
	//*  37   87:ifnull          120
	//*  38   90:aload           4
	//*  39   92:invokeinterface #74  <Method zzasi zzaqw.zzud()>
	//*  40   97:invokevirtual   #79  <Method boolean zzasi.zzvs()>
	//*  41  100:ifeq            120
				context = ((Context) (new zzabq(context, zzaji1, zzaqw1, zzabm)));
	//   42  103:new             #81  <Class zzabq>
	//   43  106:dup             
	//   44  107:aload_0         
	//   45  108:aload_2         
	//   46  109:aload           4
	//   47  111:aload           6
	//   48  113:invokespecial   #84  <Method void zzabq(Context, zzaji, zzaqw, zzabm)>
	//   49  116:astore_0        
			else
	//*  50  117:goto            185
				context = ((Context) (new zzabn(context, zzaji1, zzaqw1, zzabm)));
	//   51  120:new             #86  <Class zzabn>
	//   52  123:dup             
	//   53  124:aload_0         
	//   54  125:aload_2         
	//   55  126:aload           4
	//   56  128:aload           6
	//   57  130:invokespecial   #87  <Method void zzabn(Context, zzaji, zzaqw, zzabm)>
	//   58  133:astore_0        
		} else
	//*  59  134:goto            185
		if(zzaej1.zzare && (zza1 instanceof zzbc))
	//*  60  137:aload           8
	//*  61  139:getfield        #34  <Field boolean zzaej.zzare>
	//*  62  142:ifeq            174
	//*  63  145:aload_1         
	//*  64  146:instanceof      #36  <Class zzbc>
	//*  65  149:ifeq            174
			context = ((Context) (new zzabt(context, (zzbc)zza1, zzaji1, zzci, zzabm, zznx)));
	//   66  152:new             #89  <Class zzabt>
	//   67  155:dup             
	//   68  156:aload_0         
	//   69  157:aload_1         
	//   70  158:checkcast       #36  <Class zzbc>
	//   71  161:aload_2         
	//   72  162:aload_3         
	//   73  163:aload           6
	//   74  165:aload           7
	//   75  167:invokespecial   #92  <Method void zzabt(Context, zzbc, zzaji, zzci, zzabm, zznx)>
	//   76  170:astore_0        
		else
	//*  77  171:goto            185
			context = ((Context) (new zzabo(zzaji1, zzabm)));
	//   78  174:new             #94  <Class zzabo>
	//   79  177:dup             
	//   80  178:aload_2         
	//   81  179:aload           6
	//   82  181:invokespecial   #97  <Method void zzabo(zzaji, zzabm)>
	//   83  184:astore_0        
		zza1 = ((zza) (String.valueOf(((Object) (((Object) (context)).getClass().getName())))));
	//   84  185:aload_0         
	//   85  186:invokevirtual   #101 <Method Class Object.getClass()>
	//   86  189:invokevirtual   #107 <Method String Class.getName()>
	//   87  192:invokestatic    #113 <Method String String.valueOf(Object)>
	//   88  195:astore_1        
		if(((String) (zza1)).length() != 0)
	//*  89  196:aload_1         
	//*  90  197:invokevirtual   #117 <Method int String.length()>
	//*  91  200:ifeq            213
			zza1 = ((zza) ("AdRenderer: ".concat(((String) (zza1)))));
	//   92  203:ldc1            #119 <String "AdRenderer: ">
	//   93  205:aload_1         
	//   94  206:invokevirtual   #123 <Method String String.concat(String)>
	//   95  209:astore_1        
		else
	//*  96  210:goto            223
			zza1 = ((zza) (new String("AdRenderer: ")));
	//   97  213:new             #109 <Class String>
	//   98  216:dup             
	//   99  217:ldc1            #119 <String "AdRenderer: ">
	//  100  219:invokespecial   #126 <Method void String(String)>
	//  101  222:astore_1        
		zzakb.zzck(((String) (zza1)));
	//  102  223:aload_1         
	//  103  224:invokestatic    #131 <Method void zzakb.zzck(String)>
		((zzalc) (context)).zznt();
	//  104  227:aload_0         
	//  105  228:invokeinterface #137 <Method Object zzalc.zznt()>
	//  106  233:pop             
		return ((zzalc) (context));
	//  107  234:aload_0         
	//  108  235:areturn         
	}
}
