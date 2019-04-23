// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.o;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			acn, adf, add, adc, 
//			adj, aca, ad, acm

public final class acv extends acn
{

	public acv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void acn()>
	//    2    4:return          
	}

	public final acm a(Context context, add add1, int i, boolean flag, ad ad, adc adc1)
	{
		Object obj = ((Object) (context.getApplicationInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore          10
		boolean flag3 = o.a();
	//    3    6:invokestatic    #23  <Method boolean o.a()>
	//    4    9:istore          9
		boolean flag2 = true;
	//    5   11:iconst_1        
	//    6   12:istore          8
		boolean flag1;
		if(flag3 && (obj == null || ((ApplicationInfo) (obj)).targetSdkVersion >= 11))
	//*   7   14:iload           9
	//*   8   16:ifeq            40
	//*   9   19:aload           10
	//*  10   21:ifnull          34
	//*  11   24:aload           10
	//*  12   26:getfield        #29  <Field int ApplicationInfo.targetSdkVersion>
	//*  13   29:bipush          11
	//*  14   31:icmplt          40
			flag1 = true;
	//   15   34:iconst_1        
	//   16   35:istore          7
		else
	//*  17   37:goto            43
			flag1 = false;
	//   18   40:iconst_0        
	//   19   41:istore          7
		if(!flag1)
	//*  20   43:iload           7
	//*  21   45:ifne            50
			return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
		obj = ((Object) (new adf(context, add1.k(), add1.g(), ad, add1.c())));
	//   24   50:new             #31  <Class adf>
	//   25   53:dup             
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokeinterface #37  <Method zzbbi add.k()>
	//   29   61:aload_2         
	//   30   62:invokeinterface #41  <Method String add.g()>
	//   31   67:aload           5
	//   32   69:aload_2         
	//   33   70:invokeinterface #45  <Method aa add.c()>
	//   34   75:invokespecial   #48  <Method void adf(Context, zzbbi, String, ad, aa)>
	//   35   78:astore          10
		if(android.os.Build.VERSION.SDK_INT >= 16 && i == 2)
	//*  36   80:getstatic       #53  <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   83:bipush          16
	//*  38   85:icmplt          99
	//*  39   88:iload_3         
	//*  40   89:iconst_2        
	//*  41   90:icmpne          99
			i = ((int) (flag2));
	//   42   93:iload           8
	//   43   95:istore_3        
		else
	//*  44   96:goto            101
			i = 0;
	//   45   99:iconst_0        
	//   46  100:istore_3        
		if(i != 0 && Arrays.asList(((Object []) (adc1.e.split(",")))).contains("3"))
	//*  47  101:iload_3         
	//*  48  102:ifeq            148
	//*  49  105:aload           6
	//*  50  107:getfield        #59  <Field String adc.e>
	//*  51  110:ldc1            #61  <String ",">
	//*  52  112:invokevirtual   #67  <Method String[] String.split(String)>
	//*  53  115:invokestatic    #73  <Method List Arrays.asList(Object[])>
	//*  54  118:ldc1            #75  <String "3">
	//*  55  120:invokeinterface #81  <Method boolean List.contains(Object)>
	//*  56  125:ifeq            148
			return ((acm) (new adj(context, ((adf) (obj)), add1, flag, a(add1), adc1)));
	//   57  128:new             #83  <Class adj>
	//   58  131:dup             
	//   59  132:aload_1         
	//   60  133:aload           10
	//   61  135:aload_2         
	//   62  136:iload           4
	//   63  138:aload_2         
	//   64  139:invokestatic    #86  <Method boolean a(add)>
	//   65  142:aload           6
	//   66  144:invokespecial   #89  <Method void adj(Context, adf, add, boolean, boolean, adc)>
	//   67  147:areturn         
		else
			return ((acm) (new aca(context, flag, a(add1), adc1, new adf(context, add1.k(), add1.g(), ad, add1.c()))));
	//   68  148:new             #91  <Class aca>
	//   69  151:dup             
	//   70  152:aload_1         
	//   71  153:iload           4
	//   72  155:aload_2         
	//   73  156:invokestatic    #86  <Method boolean a(add)>
	//   74  159:aload           6
	//   75  161:new             #31  <Class adf>
	//   76  164:dup             
	//   77  165:aload_1         
	//   78  166:aload_2         
	//   79  167:invokeinterface #37  <Method zzbbi add.k()>
	//   80  172:aload_2         
	//   81  173:invokeinterface #41  <Method String add.g()>
	//   82  178:aload           5
	//   83  180:aload_2         
	//   84  181:invokeinterface #45  <Method aa add.c()>
	//   85  186:invokespecial   #48  <Method void adf(Context, zzbbi, String, ad, aa)>
	//   86  189:invokespecial   #94  <Method void aca(Context, boolean, boolean, adc, adf)>
	//   87  192:areturn         
	}
}
