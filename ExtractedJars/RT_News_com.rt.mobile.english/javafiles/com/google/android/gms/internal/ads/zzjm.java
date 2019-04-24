// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlw, zzmq, zzkb, zzamu, 
//			zzjj

public final class zzjm
{

	protected zzjm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static zzjj zza(Context context, zzlw zzlw1)
	{
		Object obj = ((Object) (zzlw1.getBirthday()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Date zzlw.getBirthday()>
	//    2    4:astore          9
		long l;
		if(obj != null)
	//*   3    6:aload           9
	//*   4    8:ifnull          21
			l = ((Date) (obj)).getTime();
	//    5   11:aload           9
	//    6   13:invokevirtual   #32  <Method long Date.getTime()>
	//    7   16:lstore          4
		else
	//*   8   18:goto            29
			l = -1L;
	//    9   21:ldc2w           #33  <Long -1L>
	//   10   24:lstore          4
	//*  11   26:goto            18
		String s = zzlw1.getContentUrl();
	//   12   29:aload_1         
	//   13   30:invokevirtual   #38  <Method String zzlw.getContentUrl()>
	//   14   33:astore          11
		int i = zzlw1.getGender();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #42  <Method int zzlw.getGender()>
	//   17   39:istore_2        
		obj = ((Object) (zzlw1.getKeywords()));
	//   18   40:aload_1         
	//   19   41:invokevirtual   #46  <Method Set zzlw.getKeywords()>
	//   20   44:astore          9
		if(!((Set) (obj)).isEmpty())
	//*  21   46:aload           9
	//*  22   48:invokeinterface #52  <Method boolean Set.isEmpty()>
	//*  23   53:ifne            73
			obj = ((Object) (Collections.unmodifiableList(((java.util.List) (new ArrayList(((java.util.Collection) (obj))))))));
	//   24   56:new             #54  <Class ArrayList>
	//   25   59:dup             
	//   26   60:aload           9
	//   27   62:invokespecial   #57  <Method void ArrayList(java.util.Collection)>
	//   28   65:invokestatic    #63  <Method java.util.List Collections.unmodifiableList(java.util.List)>
	//   29   68:astore          9
		else
	//*  30   70:goto            76
			obj = null;
	//   31   73:aconst_null     
	//   32   74:astore          9
		boolean flag = zzlw1.isTestDevice(context);
	//   33   76:aload_1         
	//   34   77:aload_0         
	//   35   78:invokevirtual   #67  <Method boolean zzlw.isTestDevice(Context)>
	//   36   81:istore          6
		int j = zzlw1.zzit();
	//   37   83:aload_1         
	//   38   84:invokevirtual   #70  <Method int zzlw.zzit()>
	//   39   87:istore_3        
		android.location.Location location = zzlw1.getLocation();
	//   40   88:aload_1         
	//   41   89:invokevirtual   #74  <Method android.location.Location zzlw.getLocation()>
	//   42   92:astore          12
		android.os.Bundle bundle = zzlw1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
	//   43   94:aload_1         
	//   44   95:ldc1            #76  <Class AdMobAdapter>
	//   45   97:invokevirtual   #80  <Method android.os.Bundle zzlw.getNetworkExtrasBundle(Class)>
	//   46  100:astore          13
		boolean flag1 = zzlw1.getManualImpressionsEnabled();
	//   47  102:aload_1         
	//   48  103:invokevirtual   #83  <Method boolean zzlw.getManualImpressionsEnabled()>
	//   49  106:istore          7
		String s1 = zzlw1.getPublisherProvidedId();
	//   50  108:aload_1         
	//   51  109:invokevirtual   #86  <Method String zzlw.getPublisherProvidedId()>
	//   52  112:astore          14
		Object obj1 = ((Object) (zzlw1.zziq()));
	//   53  114:aload_1         
	//   54  115:invokevirtual   #90  <Method com.google.android.gms.ads.search.SearchAdRequest zzlw.zziq()>
	//   55  118:astore          10
		if(obj1 != null)
	//*  56  120:aload           10
	//*  57  122:ifnull          139
			obj1 = ((Object) (new zzmq(((com.google.android.gms.ads.search.SearchAdRequest) (obj1)))));
	//   58  125:new             #92  <Class zzmq>
	//   59  128:dup             
	//   60  129:aload           10
	//   61  131:invokespecial   #95  <Method void zzmq(com.google.android.gms.ads.search.SearchAdRequest)>
	//   62  134:astore          10
		else
	//*  63  136:goto            142
			obj1 = null;
	//   64  139:aconst_null     
	//   65  140:astore          10
		context = context.getApplicationContext();
	//   66  142:aload_0         
	//   67  143:invokevirtual   #101 <Method Context Context.getApplicationContext()>
	//   68  146:astore_0        
		if(context != null)
	//*  69  147:aload_0         
	//*  70  148:ifnull          174
		{
			context = ((Context) (context.getPackageName()));
	//   71  151:aload_0         
	//   72  152:invokevirtual   #104 <Method String Context.getPackageName()>
	//   73  155:astore_0        
			zzkb.zzif();
	//   74  156:invokestatic    #110 <Method zzamu zzkb.zzif()>
	//   75  159:pop             
			context = ((Context) (zzamu.zza(Thread.currentThread().getStackTrace(), ((String) (context)))));
	//   76  160:invokestatic    #116 <Method Thread Thread.currentThread()>
	//   77  163:invokevirtual   #120 <Method StackTraceElement[] Thread.getStackTrace()>
	//   78  166:aload_0         
	//   79  167:invokestatic    #125 <Method String zzamu.zza(StackTraceElement[], String)>
	//   80  170:astore_0        
		} else
	//*  81  171:goto            176
		{
			context = null;
	//   82  174:aconst_null     
	//   83  175:astore_0        
		}
		boolean flag2 = zzlw1.isDesignedForFamilies();
	//   84  176:aload_1         
	//   85  177:invokevirtual   #128 <Method boolean zzlw.isDesignedForFamilies()>
	//   86  180:istore          8
		return new zzjj(7, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, ((zzmq) (obj1)), location, s, zzlw1.zzis(), zzlw1.getCustomTargeting(), Collections.unmodifiableList(((java.util.List) (new ArrayList(((java.util.Collection) (zzlw1.zziu())))))), zzlw1.zzip(), ((String) (context)), flag2);
	//   87  182:new             #130 <Class zzjj>
	//   88  185:dup             
	//   89  186:bipush          7
	//   90  188:lload           4
	//   91  190:aload           13
	//   92  192:iload_2         
	//   93  193:aload           9
	//   94  195:iload           6
	//   95  197:iload_3         
	//   96  198:iload           7
	//   97  200:aload           14
	//   98  202:aload           10
	//   99  204:aload           12
	//  100  206:aload           11
	//  101  208:aload_1         
	//  102  209:invokevirtual   #134 <Method android.os.Bundle zzlw.zzis()>
	//  103  212:aload_1         
	//  104  213:invokevirtual   #137 <Method android.os.Bundle zzlw.getCustomTargeting()>
	//  105  216:new             #54  <Class ArrayList>
	//  106  219:dup             
	//  107  220:aload_1         
	//  108  221:invokevirtual   #140 <Method Set zzlw.zziu()>
	//  109  224:invokespecial   #57  <Method void ArrayList(java.util.Collection)>
	//  110  227:invokestatic    #63  <Method java.util.List Collections.unmodifiableList(java.util.List)>
	//  111  230:aload_1         
	//  112  231:invokevirtual   #143 <Method String zzlw.zzip()>
	//  113  234:aload_0         
	//  114  235:iload           8
	//  115  237:invokespecial   #146 <Method void zzjj(int, long, android.os.Bundle, int, java.util.List, boolean, int, boolean, String, zzmq, android.location.Location, String, android.os.Bundle, android.os.Bundle, java.util.List, String, String, boolean)>
	//  116  240:areturn         
	}

	public static final zzjm zzara = new zzjm();

	static 
	{
	//    0    0:new             #2   <Class zzjm>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void zzjm()>
	//    3    7:putstatic       #14  <Field zzjm zzara>
	//*   4   10:return          
	}
}
