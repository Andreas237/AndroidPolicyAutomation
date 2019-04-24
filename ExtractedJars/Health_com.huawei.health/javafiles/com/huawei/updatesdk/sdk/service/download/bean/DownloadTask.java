// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.updatesdk.sdk.service.download.bean;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.updatesdk.sdk.a.b.a.a.a;
import com.huawei.updatesdk.sdk.a.c.a.c;
import com.huawei.updatesdk.sdk.service.download.b;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;

// Referenced classes of package com.huawei.updatesdk.sdk.service.download.bean:
//			c

public class DownloadTask
	implements Parcelable
{

	public DownloadTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		N = "DownloadTask";
	//    2    4:aload_0         
	//    3    5:ldc1            #91  <String "DownloadTask">
	//    4    7:putfield        #93  <Field String N>
		c = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #95  <Field int c>
		e = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #97  <Field int e>
		g = 0L;
	//   11   20:aload_0         
	//   12   21:lconst_0        
	//   13   22:putfield        #99  <Field long g>
		i = 0L;
	//   14   25:aload_0         
	//   15   26:lconst_0        
	//   16   27:putfield        #101 <Field long i>
		k = 0L;
	//   17   30:aload_0         
	//   18   31:lconst_0        
	//   19   32:putfield        #103 <Field long k>
		n = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #105 <Field int n>
		o = 0;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #107 <Field int o>
		p = false;
	//   26   45:aload_0         
	//   27   46:iconst_0        
	//   28   47:putfield        #109 <Field boolean p>
		q = null;
	//   29   50:aload_0         
	//   30   51:aconst_null     
	//   31   52:putfield        #111 <Field Future q>
		s = 0;
	//   32   55:aload_0         
	//   33   56:iconst_0        
	//   34   57:putfield        #113 <Field int s>
		t = 0;
	//   35   60:aload_0         
	//   36   61:iconst_0        
	//   37   62:putfield        #115 <Field int t>
		R = false;
	//   38   65:aload_0         
	//   39   66:iconst_0        
	//   40   67:putfield        #117 <Field boolean R>
		S = true;
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:putfield        #119 <Field boolean S>
		w = 1;
	//   44   75:aload_0         
	//   45   76:iconst_1        
	//   46   77:putfield        #121 <Field int w>
		x = 0;
	//   47   80:aload_0         
	//   48   81:iconst_0        
	//   49   82:putfield        #123 <Field int x>
		y = true;
	//   50   85:aload_0         
	//   51   86:iconst_1        
	//   52   87:putfield        #125 <Field boolean y>
		z = false;
	//   53   90:aload_0         
	//   54   91:iconst_0        
	//   55   92:putfield        #127 <Field boolean z>
		A = false;
	//   56   95:aload_0         
	//   57   96:iconst_0        
	//   58   97:putfield        #129 <Field boolean A>
		B = null;
	//   59  100:aload_0         
	//   60  101:aconst_null     
	//   61  102:putfield        #131 <Field String B>
		C = null;
	//   62  105:aload_0         
	//   63  106:aconst_null     
	//   64  107:putfield        #133 <Field String C>
	/* block-local class not found */
	class a {}

		D = new a();
	//   65  110:aload_0         
	//   66  111:new             #8   <Class DownloadTask$a>
	//   67  114:dup             
	//   68  115:invokespecial   #134 <Method void DownloadTask$a()>
	//   69  118:putfield        #136 <Field DownloadTask$a D>
	/* block-local class not found */
	class b {}

		E = new b();
	//   70  121:aload_0         
	//   71  122:new             #10  <Class DownloadTask$b>
	//   72  125:dup             
	//   73  126:invokespecial   #137 <Method void DownloadTask$b()>
	//   74  129:putfield        #139 <Field DownloadTask$b E>
		F = ((List) (new CopyOnWriteArrayList()));
	//   75  132:aload_0         
	//   76  133:new             #141 <Class CopyOnWriteArrayList>
	//   77  136:dup             
	//   78  137:invokespecial   #142 <Method void CopyOnWriteArrayList()>
	//   79  140:putfield        #144 <Field List F>
		G = 0L;
	//   80  143:aload_0         
	//   81  144:lconst_0        
	//   82  145:putfield        #146 <Field long G>
		H = false;
	//   83  148:aload_0         
	//   84  149:iconst_0        
	//   85  150:putfield        #148 <Field boolean H>
		I = false;
	//   86  153:aload_0         
	//   87  154:iconst_0        
	//   88  155:putfield        #150 <Field boolean I>
		J = false;
	//   89  158:aload_0         
	//   90  159:iconst_0        
	//   91  160:putfield        #152 <Field boolean J>
		L = null;
	//   92  163:aload_0         
	//   93  164:aconst_null     
	//   94  165:putfield        #154 <Field Future L>
		M = ((com.huawei.updatesdk.sdk.service.download.c) (new b()));
	//   95  168:aload_0         
	//   96  169:new             #156 <Class b>
	//   97  172:dup             
	//   98  173:invokespecial   #157 <Method void b()>
	//   99  176:putfield        #159 <Field com.huawei.updatesdk.sdk.service.download.c M>
	//  100  179:return          
	}

	protected DownloadTask(Bundle bundle)
	{
		int i1;
		Field afield[];
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		N = "DownloadTask";
	//    2    4:aload_0         
	//    3    5:ldc1            #91  <String "DownloadTask">
	//    4    7:putfield        #93  <Field String N>
		c = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #95  <Field int c>
		e = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #97  <Field int e>
		g = 0L;
	//   11   20:aload_0         
	//   12   21:lconst_0        
	//   13   22:putfield        #99  <Field long g>
		i = 0L;
	//   14   25:aload_0         
	//   15   26:lconst_0        
	//   16   27:putfield        #101 <Field long i>
		k = 0L;
	//   17   30:aload_0         
	//   18   31:lconst_0        
	//   19   32:putfield        #103 <Field long k>
		n = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #105 <Field int n>
		o = 0;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #107 <Field int o>
		p = false;
	//   26   45:aload_0         
	//   27   46:iconst_0        
	//   28   47:putfield        #109 <Field boolean p>
		q = null;
	//   29   50:aload_0         
	//   30   51:aconst_null     
	//   31   52:putfield        #111 <Field Future q>
		s = 0;
	//   32   55:aload_0         
	//   33   56:iconst_0        
	//   34   57:putfield        #113 <Field int s>
		t = 0;
	//   35   60:aload_0         
	//   36   61:iconst_0        
	//   37   62:putfield        #115 <Field int t>
		R = false;
	//   38   65:aload_0         
	//   39   66:iconst_0        
	//   40   67:putfield        #117 <Field boolean R>
		S = true;
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:putfield        #119 <Field boolean S>
		w = 1;
	//   44   75:aload_0         
	//   45   76:iconst_1        
	//   46   77:putfield        #121 <Field int w>
		x = 0;
	//   47   80:aload_0         
	//   48   81:iconst_0        
	//   49   82:putfield        #123 <Field int x>
		y = true;
	//   50   85:aload_0         
	//   51   86:iconst_1        
	//   52   87:putfield        #125 <Field boolean y>
		z = false;
	//   53   90:aload_0         
	//   54   91:iconst_0        
	//   55   92:putfield        #127 <Field boolean z>
		A = false;
	//   56   95:aload_0         
	//   57   96:iconst_0        
	//   58   97:putfield        #129 <Field boolean A>
		B = null;
	//   59  100:aload_0         
	//   60  101:aconst_null     
	//   61  102:putfield        #131 <Field String B>
		C = null;
	//   62  105:aload_0         
	//   63  106:aconst_null     
	//   64  107:putfield        #133 <Field String C>
		D = new a();
	//   65  110:aload_0         
	//   66  111:new             #8   <Class DownloadTask$a>
	//   67  114:dup             
	//   68  115:invokespecial   #134 <Method void DownloadTask$a()>
	//   69  118:putfield        #136 <Field DownloadTask$a D>
		E = new b();
	//   70  121:aload_0         
	//   71  122:new             #10  <Class DownloadTask$b>
	//   72  125:dup             
	//   73  126:invokespecial   #137 <Method void DownloadTask$b()>
	//   74  129:putfield        #139 <Field DownloadTask$b E>
		F = ((List) (new CopyOnWriteArrayList()));
	//   75  132:aload_0         
	//   76  133:new             #141 <Class CopyOnWriteArrayList>
	//   77  136:dup             
	//   78  137:invokespecial   #142 <Method void CopyOnWriteArrayList()>
	//   79  140:putfield        #144 <Field List F>
		G = 0L;
	//   80  143:aload_0         
	//   81  144:lconst_0        
	//   82  145:putfield        #146 <Field long G>
		H = false;
	//   83  148:aload_0         
	//   84  149:iconst_0        
	//   85  150:putfield        #148 <Field boolean H>
		I = false;
	//   86  153:aload_0         
	//   87  154:iconst_0        
	//   88  155:putfield        #150 <Field boolean I>
		J = false;
	//   89  158:aload_0         
	//   90  159:iconst_0        
	//   91  160:putfield        #152 <Field boolean J>
		L = null;
	//   92  163:aload_0         
	//   93  164:aconst_null     
	//   94  165:putfield        #154 <Field Future L>
		M = ((com.huawei.updatesdk.sdk.service.download.c) (new b()));
	//   95  168:aload_0         
	//   96  169:new             #156 <Class b>
	//   97  172:dup             
	//   98  173:invokespecial   #157 <Method void b()>
	//   99  176:putfield        #159 <Field com.huawei.updatesdk.sdk.service.download.c M>
		afield = ((Class) (com/huawei/updatesdk/sdk/service/download/bean/DownloadTask)).getDeclaredFields();
	//  100  179:ldc1            #2   <Class DownloadTask>
	//  101  181:invokevirtual   #170 <Method Field[] Class.getDeclaredFields()>
	//  102  184:astore_3        
		i1 = 0;
	//  103  185:iconst_0        
	//  104  186:istore_2        
_L3:
		if(i1 >= afield.length) goto _L2; else goto _L1
	//  105  187:iload_2         
	//  106  188:aload_3         
	//  107  189:arraylength     
	//  108  190:icmpge          420
_L1:
		String s1;
		String s2;
		afield[i1].setAccessible(true);
	//  109  193:aload_3         
	//  110  194:iload_2         
	//  111  195:aaload          
	//  112  196:iconst_1        
	//  113  197:invokevirtual   #176 <Method void Field.setAccessible(boolean)>
		if(!afield[i1].isAnnotationPresent(com/huawei/updatesdk/sdk/service/download/bean/c))
			continue; /* Loop/switch isn't completed */
	//  114  200:aload_3         
	//  115  201:iload_2         
	//  116  202:aaload          
	//  117  203:ldc1            #178 <Class com.huawei.updatesdk.sdk.service.download.bean.c>
	//  118  205:invokevirtual   #182 <Method boolean Field.isAnnotationPresent(Class)>
	//  119  208:ifeq            383
		s1 = afield[i1].getType().getSimpleName();
	//  120  211:aload_3         
	//  121  212:iload_2         
	//  122  213:aaload          
	//  123  214:invokevirtual   #186 <Method Class Field.getType()>
	//  124  217:invokevirtual   #190 <Method String Class.getSimpleName()>
	//  125  220:astore          4
		s2 = afield[i1].getName();
	//  126  222:aload_3         
	//  127  223:iload_2         
	//  128  224:aaload          
	//  129  225:invokevirtual   #193 <Method String Field.getName()>
	//  130  228:astore          5
		if("String".equals(((Object) (s1))))
	//* 131  230:ldc1            #195 <String "String">
	//* 132  232:aload           4
	//* 133  234:invokevirtual   #201 <Method boolean String.equals(Object)>
	//* 134  237:ifeq            256
		{
			afield[i1].set(((Object) (this)), ((Object) (bundle.getString(s2))));
	//  135  240:aload_3         
	//  136  241:iload_2         
	//  137  242:aaload          
	//  138  243:aload_0         
	//  139  244:aload_1         
	//  140  245:aload           5
	//  141  247:invokevirtual   #207 <Method String Bundle.getString(String)>
	//  142  250:invokevirtual   #211 <Method void Field.set(Object, Object)>
			continue; /* Loop/switch isn't completed */
	//  143  253:goto            383
		}
		if("int".equals(((Object) (s1))))
	//* 144  256:ldc1            #213 <String "int">
	//* 145  258:aload           4
	//* 146  260:invokevirtual   #201 <Method boolean String.equals(Object)>
	//* 147  263:ifeq            285
		{
			afield[i1].set(((Object) (this)), ((Object) (Integer.valueOf(bundle.getInt(s2)))));
	//  148  266:aload_3         
	//  149  267:iload_2         
	//  150  268:aaload          
	//  151  269:aload_0         
	//  152  270:aload_1         
	//  153  271:aload           5
	//  154  273:invokevirtual   #217 <Method int Bundle.getInt(String)>
	//  155  276:invokestatic    #223 <Method Integer Integer.valueOf(int)>
	//  156  279:invokevirtual   #211 <Method void Field.set(Object, Object)>
			continue; /* Loop/switch isn't completed */
	//  157  282:goto            383
		}
		if("long".equals(((Object) (s1))))
	//* 158  285:ldc1            #225 <String "long">
	//* 159  287:aload           4
	//* 160  289:invokevirtual   #201 <Method boolean String.equals(Object)>
	//* 161  292:ifeq            314
		{
			afield[i1].set(((Object) (this)), ((Object) (Long.valueOf(bundle.getLong(s2)))));
	//  162  295:aload_3         
	//  163  296:iload_2         
	//  164  297:aaload          
	//  165  298:aload_0         
	//  166  299:aload_1         
	//  167  300:aload           5
	//  168  302:invokevirtual   #229 <Method long Bundle.getLong(String)>
	//  169  305:invokestatic    #234 <Method Long Long.valueOf(long)>
	//  170  308:invokevirtual   #211 <Method void Field.set(Object, Object)>
			continue; /* Loop/switch isn't completed */
	//  171  311:goto            383
		}
		if("float".equals(((Object) (s1))))
	//* 172  314:ldc1            #236 <String "float">
	//* 173  316:aload           4
	//* 174  318:invokevirtual   #201 <Method boolean String.equals(Object)>
	//* 175  321:ifeq            343
		{
			afield[i1].set(((Object) (this)), ((Object) (Float.valueOf(bundle.getFloat(s2)))));
	//  176  324:aload_3         
	//  177  325:iload_2         
	//  178  326:aaload          
	//  179  327:aload_0         
	//  180  328:aload_1         
	//  181  329:aload           5
	//  182  331:invokevirtual   #240 <Method float Bundle.getFloat(String)>
	//  183  334:invokestatic    #245 <Method Float Float.valueOf(float)>
	//  184  337:invokevirtual   #211 <Method void Field.set(Object, Object)>
			continue; /* Loop/switch isn't completed */
	//  185  340:goto            383
		}
		try
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.d("DownloadTask", (new StringBuilder()).append("unsupport field type:").append(s1).append(" ").append(afield[i1].getName()).toString());
	//  186  343:ldc1            #91  <String "DownloadTask">
	//  187  345:new             #247 <Class StringBuilder>
	//  188  348:dup             
	//  189  349:invokespecial   #248 <Method void StringBuilder()>
	//  190  352:ldc1            #250 <String "unsupport field type:">
	//  191  354:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  192  357:aload           4
	//  193  359:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  194  362:ldc2            #256 <String " ">
	//  195  365:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  196  368:aload_3         
	//  197  369:iload_2         
	//  198  370:aaload          
	//  199  371:invokevirtual   #193 <Method String Field.getName()>
	//  200  374:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  201  377:invokevirtual   #259 <Method String StringBuilder.toString()>
	//  202  380:invokestatic    #264 <Method void a.d(String, String)>
		}
	//* 203  383:goto            413
		catch(RuntimeException runtimeexception)
	//* 204  386:astore          4
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("DownloadTask", "DownloadTask exception:", ((Throwable) (runtimeexception)));
	//  205  388:ldc1            #91  <String "DownloadTask">
	//  206  390:ldc2            #266 <String "DownloadTask exception:">
	//  207  393:aload           4
	//  208  395:invokestatic    #269 <Method void a.a(String, String, Throwable)>
		}
	//* 209  398:goto            413
		catch(IllegalAccessException illegalaccessexception)
	//* 210  401:astore          4
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("DownloadTask", "DownloadTask exception:", ((Throwable) (illegalaccessexception)));
	//  211  403:ldc1            #91  <String "DownloadTask">
	//  212  405:ldc2            #266 <String "DownloadTask exception:">
	//  213  408:aload           4
	//  214  410:invokestatic    #269 <Method void a.a(String, String, Throwable)>
		}
		i1++;
	//  215  413:iload_2         
	//  216  414:iconst_1        
	//  217  415:iadd            
	//  218  416:istore_2        
		  goto _L3
	//* 219  417:goto            187
_L2:
	//  220  420:return          
	}

	protected DownloadTask(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		N = "DownloadTask";
	//    2    4:aload_0         
	//    3    5:ldc1            #91  <String "DownloadTask">
	//    4    7:putfield        #93  <Field String N>
		c = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #95  <Field int c>
		e = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #97  <Field int e>
		g = 0L;
	//   11   20:aload_0         
	//   12   21:lconst_0        
	//   13   22:putfield        #99  <Field long g>
		i = 0L;
	//   14   25:aload_0         
	//   15   26:lconst_0        
	//   16   27:putfield        #101 <Field long i>
		k = 0L;
	//   17   30:aload_0         
	//   18   31:lconst_0        
	//   19   32:putfield        #103 <Field long k>
		n = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #105 <Field int n>
		o = 0;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #107 <Field int o>
		p = false;
	//   26   45:aload_0         
	//   27   46:iconst_0        
	//   28   47:putfield        #109 <Field boolean p>
		q = null;
	//   29   50:aload_0         
	//   30   51:aconst_null     
	//   31   52:putfield        #111 <Field Future q>
		s = 0;
	//   32   55:aload_0         
	//   33   56:iconst_0        
	//   34   57:putfield        #113 <Field int s>
		t = 0;
	//   35   60:aload_0         
	//   36   61:iconst_0        
	//   37   62:putfield        #115 <Field int t>
		R = false;
	//   38   65:aload_0         
	//   39   66:iconst_0        
	//   40   67:putfield        #117 <Field boolean R>
		S = true;
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:putfield        #119 <Field boolean S>
		w = 1;
	//   44   75:aload_0         
	//   45   76:iconst_1        
	//   46   77:putfield        #121 <Field int w>
		x = 0;
	//   47   80:aload_0         
	//   48   81:iconst_0        
	//   49   82:putfield        #123 <Field int x>
		y = true;
	//   50   85:aload_0         
	//   51   86:iconst_1        
	//   52   87:putfield        #125 <Field boolean y>
		z = false;
	//   53   90:aload_0         
	//   54   91:iconst_0        
	//   55   92:putfield        #127 <Field boolean z>
		A = false;
	//   56   95:aload_0         
	//   57   96:iconst_0        
	//   58   97:putfield        #129 <Field boolean A>
		B = null;
	//   59  100:aload_0         
	//   60  101:aconst_null     
	//   61  102:putfield        #131 <Field String B>
		C = null;
	//   62  105:aload_0         
	//   63  106:aconst_null     
	//   64  107:putfield        #133 <Field String C>
		D = new a();
	//   65  110:aload_0         
	//   66  111:new             #8   <Class DownloadTask$a>
	//   67  114:dup             
	//   68  115:invokespecial   #134 <Method void DownloadTask$a()>
	//   69  118:putfield        #136 <Field DownloadTask$a D>
		E = new b();
	//   70  121:aload_0         
	//   71  122:new             #10  <Class DownloadTask$b>
	//   72  125:dup             
	//   73  126:invokespecial   #137 <Method void DownloadTask$b()>
	//   74  129:putfield        #139 <Field DownloadTask$b E>
		F = ((List) (new CopyOnWriteArrayList()));
	//   75  132:aload_0         
	//   76  133:new             #141 <Class CopyOnWriteArrayList>
	//   77  136:dup             
	//   78  137:invokespecial   #142 <Method void CopyOnWriteArrayList()>
	//   79  140:putfield        #144 <Field List F>
		G = 0L;
	//   80  143:aload_0         
	//   81  144:lconst_0        
	//   82  145:putfield        #146 <Field long G>
		H = false;
	//   83  148:aload_0         
	//   84  149:iconst_0        
	//   85  150:putfield        #148 <Field boolean H>
		I = false;
	//   86  153:aload_0         
	//   87  154:iconst_0        
	//   88  155:putfield        #150 <Field boolean I>
		J = false;
	//   89  158:aload_0         
	//   90  159:iconst_0        
	//   91  160:putfield        #152 <Field boolean J>
		L = null;
	//   92  163:aload_0         
	//   93  164:aconst_null     
	//   94  165:putfield        #154 <Field Future L>
		M = ((com.huawei.updatesdk.sdk.service.download.c) (new b()));
	//   95  168:aload_0         
	//   96  169:new             #156 <Class b>
	//   97  172:dup             
	//   98  173:invokespecial   #157 <Method void b()>
	//   99  176:putfield        #159 <Field com.huawei.updatesdk.sdk.service.download.c M>
		c = parcel.readInt();
	//  100  179:aload_0         
	//  101  180:aload_1         
	//  102  181:invokevirtual   #275 <Method int Parcel.readInt()>
	//  103  184:putfield        #95  <Field int c>
		d = parcel.readString();
	//  104  187:aload_0         
	//  105  188:aload_1         
	//  106  189:invokevirtual   #278 <Method String Parcel.readString()>
	//  107  192:putfield        #280 <Field String d>
		e = parcel.readInt();
	//  108  195:aload_0         
	//  109  196:aload_1         
	//  110  197:invokevirtual   #275 <Method int Parcel.readInt()>
	//  111  200:putfield        #97  <Field int e>
		f = parcel.readString();
	//  112  203:aload_0         
	//  113  204:aload_1         
	//  114  205:invokevirtual   #278 <Method String Parcel.readString()>
	//  115  208:putfield        #282 <Field String f>
		g = parcel.readLong();
	//  116  211:aload_0         
	//  117  212:aload_1         
	//  118  213:invokevirtual   #286 <Method long Parcel.readLong()>
	//  119  216:putfield        #99  <Field long g>
		k = parcel.readLong();
	//  120  219:aload_0         
	//  121  220:aload_1         
	//  122  221:invokevirtual   #286 <Method long Parcel.readLong()>
	//  123  224:putfield        #103 <Field long k>
		l = parcel.readString();
	//  124  227:aload_0         
	//  125  228:aload_1         
	//  126  229:invokevirtual   #278 <Method String Parcel.readString()>
	//  127  232:putfield        #288 <Field String l>
		r = parcel.readString();
	//  128  235:aload_0         
	//  129  236:aload_1         
	//  130  237:invokevirtual   #278 <Method String Parcel.readString()>
	//  131  240:putfield        #290 <Field String r>
		m = parcel.readInt();
	//  132  243:aload_0         
	//  133  244:aload_1         
	//  134  245:invokevirtual   #275 <Method int Parcel.readInt()>
	//  135  248:putfield        #292 <Field int m>
		o = parcel.readInt();
	//  136  251:aload_0         
	//  137  252:aload_1         
	//  138  253:invokevirtual   #275 <Method int Parcel.readInt()>
	//  139  256:putfield        #107 <Field int o>
		j = parcel.readString();
	//  140  259:aload_0         
	//  141  260:aload_1         
	//  142  261:invokevirtual   #278 <Method String Parcel.readString()>
	//  143  264:putfield        #294 <Field String j>
		u = parcel.readString();
	//  144  267:aload_0         
	//  145  268:aload_1         
	//  146  269:invokevirtual   #278 <Method String Parcel.readString()>
	//  147  272:putfield        #296 <Field String u>
		Q = parcel.readString();
	//  148  275:aload_0         
	//  149  276:aload_1         
	//  150  277:invokevirtual   #278 <Method String Parcel.readString()>
	//  151  280:putfield        #298 <Field String Q>
		s = parcel.readInt();
	//  152  283:aload_0         
	//  153  284:aload_1         
	//  154  285:invokevirtual   #275 <Method int Parcel.readInt()>
	//  155  288:putfield        #113 <Field int s>
		t = parcel.readInt();
	//  156  291:aload_0         
	//  157  292:aload_1         
	//  158  293:invokevirtual   #275 <Method int Parcel.readInt()>
	//  159  296:putfield        #115 <Field int t>
		h = parcel.readString();
	//  160  299:aload_0         
	//  161  300:aload_1         
	//  162  301:invokevirtual   #278 <Method String Parcel.readString()>
	//  163  304:putfield        #300 <Field String h>
		i = parcel.readLong();
	//  164  307:aload_0         
	//  165  308:aload_1         
	//  166  309:invokevirtual   #286 <Method long Parcel.readLong()>
	//  167  312:putfield        #101 <Field long i>
		b = parcel.readString();
	//  168  315:aload_0         
	//  169  316:aload_1         
	//  170  317:invokevirtual   #278 <Method String Parcel.readString()>
	//  171  320:putfield        #302 <Field String b>
		n = parcel.readInt();
	//  172  323:aload_0         
	//  173  324:aload_1         
	//  174  325:invokevirtual   #275 <Method int Parcel.readInt()>
	//  175  328:putfield        #105 <Field int n>
		a = parcel.readString();
	//  176  331:aload_0         
	//  177  332:aload_1         
	//  178  333:invokevirtual   #278 <Method String Parcel.readString()>
	//  179  336:putfield        #304 <Field String a>
		v = parcel.readInt();
	//  180  339:aload_0         
	//  181  340:aload_1         
	//  182  341:invokevirtual   #275 <Method int Parcel.readInt()>
	//  183  344:putfield        #306 <Field int v>
	//  184  347:return          
	}

	public static int a()
	{
		Object obj = P;
	//    0    0:getstatic       #83  <Field Object P>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i1;
		O++;
	//    4    6:getstatic       #78  <Field int O>
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:putstatic       #78  <Field int O>
		if(O == 0x80000000 || O == -1)
	//*   8   14:getstatic       #78  <Field int O>
	//*   9   17:ldc2            #307 <Int 0x80000000>
	//*  10   20:icmpeq          30
	//*  11   23:getstatic       #78  <Field int O>
	//*  12   26:iconst_m1       
	//*  13   27:icmpne          36
			O = com.huawei.updatesdk.sdk.a.c.a.c.a();
	//   14   30:invokestatic    #76  <Method int c.a()>
	//   15   33:putstatic       #78  <Field int O>
		i1 = O;
	//   16   36:getstatic       #78  <Field int O>
	//   17   39:istore_0        
		obj;
	//   18   40:aload_1         
		JVM INSTR monitorexit ;
	//   19   41:monitorexit     
		return i1;
	//   20   42:iload_0         
	//   21   43:ireturn         
		Exception exception;
		exception;
	//   22   44:astore_2        
	//*  23   45:aload_1         
		throw exception;
	//   24   46:monitorexit     
	//   25   47:aload_2         
	//   26   48:athrow          
	}

	public static DownloadTask a(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new DownloadTask(bundle);
	//    4    6:new             #2   <Class DownloadTask>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #310 <Method void DownloadTask(Bundle)>
	//    8   14:areturn         
	}

	public boolean A()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field boolean A>
	//    2    4:ireturn         
	}

	public boolean B()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean z>
	//    2    4:ireturn         
	}

	public long C()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field long G>
	//    2    4:lreturn         
	}

	public boolean D()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field boolean I>
	//    2    4:ireturn         
	}

	public String E()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field String b>
	//    2    4:areturn         
	}

	public int F()
	{
		int i1 = (int)Math.round(((double)t() / (double)s()) * 100D);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #313 <Method long t()>
	//    2    4:l2d             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #315 <Method long s()>
	//    5    9:l2d             
	//    6   10:ddiv            
	//    7   11:ldc2w           #316 <Double 100D>
	//    8   14:dmul            
	//    9   15:invokestatic    #323 <Method long Math.round(double)>
	//   10   18:l2i             
	//   11   19:istore_1        
		if(i1 > 100)
	//*  12   20:iload_1         
	//*  13   21:bipush          100
	//*  14   23:icmple          29
			return 100;
	//   15   26:bipush          100
	//   16   28:ireturn         
		else
			return i1;
	//   17   29:iload_1         
	//   18   30:ireturn         
	}

	public boolean G()
	{
		return b != null && b.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field String b>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #302 <Field String b>
	//    5   11:invokevirtual   #326 <Method int String.length()>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void a(int i1)
	{
		t = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field int t>
	//    3    5:return          
	}

	public void a(long l1)
	{
		g = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #99  <Field long g>
		if(l1 <= 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifgt            195
		{
			StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
	//    7   11:new             #330 <Class Throwable>
	//    8   14:dup             
	//    9   15:invokespecial   #331 <Method void Throwable()>
	//   10   18:invokevirtual   #335 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   11   21:astore          4
			StringBuffer stringbuffer = new StringBuffer();
	//   12   23:new             #337 <Class StringBuffer>
	//   13   26:dup             
	//   14   27:invokespecial   #338 <Method void StringBuffer()>
	//   15   30:astore          5
			stringbuffer.append("debug : fileSize is wrong \n");
	//   16   32:aload           5
	//   17   34:ldc2            #340 <String "debug : fileSize is wrong \n">
	//   18   37:invokevirtual   #343 <Method StringBuffer StringBuffer.append(String)>
	//   19   40:pop             
			stringbuffer.append((new StringBuilder()).append("Stack for setFileSize, fileSize=").append(l1).append(":").toString());
	//   20   41:aload           5
	//   21   43:new             #247 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #248 <Method void StringBuilder()>
	//   24   50:ldc2            #345 <String "Stack for setFileSize, fileSize=">
	//   25   53:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:lload_1         
	//   27   57:invokevirtual   #348 <Method StringBuilder StringBuilder.append(long)>
	//   28   60:ldc2            #350 <String ":">
	//   29   63:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   31   69:invokevirtual   #343 <Method StringBuffer StringBuffer.append(String)>
	//   32   72:pop             
			int i1 = 0;
	//   33   73:iconst_0        
	//   34   74:istore_3        
			do
			{
				if(i1 >= astacktraceelement.length)
					break;
	//   35   75:iload_3         
	//   36   76:aload           4
	//   37   78:arraylength     
	//   38   79:icmpge          184
				stringbuffer.append((new StringBuilder()).append("\n    ").append(astacktraceelement[i1].getClassName()).append(".").append(astacktraceelement[i1].getMethodName()).append("(").append(astacktraceelement[i1].getFileName()).append(":").append(astacktraceelement[i1].getLineNumber()).append(")").toString());
	//   39   82:aload           5
	//   40   84:new             #247 <Class StringBuilder>
	//   41   87:dup             
	//   42   88:invokespecial   #248 <Method void StringBuilder()>
	//   43   91:ldc2            #352 <String "\n    ">
	//   44   94:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   45   97:aload           4
	//   46   99:iload_3         
	//   47  100:aaload          
	//   48  101:invokevirtual   #357 <Method String StackTraceElement.getClassName()>
	//   49  104:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:ldc2            #359 <String ".">
	//   51  110:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   52  113:aload           4
	//   53  115:iload_3         
	//   54  116:aaload          
	//   55  117:invokevirtual   #362 <Method String StackTraceElement.getMethodName()>
	//   56  120:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   57  123:ldc2            #364 <String "(">
	//   58  126:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   59  129:aload           4
	//   60  131:iload_3         
	//   61  132:aaload          
	//   62  133:invokevirtual   #367 <Method String StackTraceElement.getFileName()>
	//   63  136:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   64  139:ldc2            #350 <String ":">
	//   65  142:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   66  145:aload           4
	//   67  147:iload_3         
	//   68  148:aaload          
	//   69  149:invokevirtual   #370 <Method int StackTraceElement.getLineNumber()>
	//   70  152:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   71  155:ldc2            #375 <String ")">
	//   72  158:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   73  161:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   74  164:invokevirtual   #343 <Method StringBuffer StringBuffer.append(String)>
	//   75  167:pop             
				if(i1 > 14)
	//*  76  168:iload_3         
	//*  77  169:bipush          14
	//*  78  171:icmple          177
					break;
	//   79  174:goto            184
				i1++;
	//   80  177:iload_3         
	//   81  178:iconst_1        
	//   82  179:iadd            
	//   83  180:istore_3        
			} while(true);
	//   84  181:goto            75
			com.huawei.updatesdk.sdk.a.b.a.a.a.d("HiAppDownload", stringbuffer.toString());
	//   85  184:ldc2            #377 <String "HiAppDownload">
	//   86  187:aload           5
	//   87  189:invokevirtual   #378 <Method String StringBuffer.toString()>
	//   88  192:invokestatic    #264 <Method void a.d(String, String)>
		}
	//   89  195:return          
	}

	public void a(NetworkInfo networkinfo)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #282 <Field String f>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int i1 = f.lastIndexOf("&");
	//    4    8:aload_0         
	//    5    9:getfield        #282 <Field String f>
	//    6   12:ldc2            #381 <String "&">
	//    7   15:invokevirtual   #384 <Method int String.lastIndexOf(String)>
	//    8   18:istore_2        
		String s2 = f;
	//    9   19:aload_0         
	//   10   20:getfield        #282 <Field String f>
	//   11   23:astore          4
		String s1 = s2;
	//   12   25:aload           4
	//   13   27:astore_3        
		if(i1 != -1)
	//*  14   28:iload_2         
	//*  15   29:iconst_m1       
	//*  16   30:icmpeq          68
		{
			s1 = s2;
	//   17   33:aload           4
	//   18   35:astore_3        
			if(f.substring(i1 + 1).trim().startsWith("net"))
	//*  19   36:aload_0         
	//*  20   37:getfield        #282 <Field String f>
	//*  21   40:iload_2         
	//*  22   41:iconst_1        
	//*  23   42:iadd            
	//*  24   43:invokevirtual   #388 <Method String String.substring(int)>
	//*  25   46:invokevirtual   #391 <Method String String.trim()>
	//*  26   49:ldc2            #393 <String "net">
	//*  27   52:invokevirtual   #397 <Method boolean String.startsWith(String)>
	//*  28   55:ifeq            68
				s1 = f.substring(0, i1);
	//   29   58:aload_0         
	//   30   59:getfield        #282 <Field String f>
	//   31   62:iconst_0        
	//   32   63:iload_2         
	//   33   64:invokevirtual   #400 <Method String String.substring(int, int)>
	//   34   67:astore_3        
		}
		f = (new StringBuilder()).append(s1).append("&").append("net").append("=").append(com.huawei.updatesdk.sdk.a.c.c.b.a(networkinfo)).toString();
	//   35   68:aload_0         
	//   36   69:new             #247 <Class StringBuilder>
	//   37   72:dup             
	//   38   73:invokespecial   #248 <Method void StringBuilder()>
	//   39   76:aload_3         
	//   40   77:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:ldc2            #381 <String "&">
	//   42   83:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   43   86:ldc2            #393 <String "net">
	//   44   89:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   45   92:ldc2            #402 <String "=">
	//   46   95:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   47   98:aload_1         
	//   48   99:invokestatic    #407 <Method int com.huawei.updatesdk.sdk.a.c.c.b.a(NetworkInfo)>
	//   49  102:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   50  105:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   51  108:putfield        #282 <Field String f>
	//   52  111:return          
	}

	public void a(String s1)
	{
		Q = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #298 <Field String Q>
	//    3    5:return          
	}

	public void a(Future future)
	{
		q = future;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field Future q>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		S = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #119 <Field boolean S>
	//    3    5:return          
	}

	public void a(boolean flag, int i1)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean p>
		s = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #113 <Field int s>
		if(i1 != 4 && flag)
	//*   6   10:iload_2         
	//*   7   11:iconst_4        
	//*   8   12:icmpeq          28
	//*   9   15:iload_1         
	//*  10   16:ifeq            28
			com.huawei.updatesdk.sdk.service.download.bean.b.a(E, true);
	//   11   19:aload_0         
	//   12   20:getfield        #139 <Field DownloadTask$b E>
	//   13   23:iconst_1        
	//   14   24:invokestatic    #415 <Method boolean com.huawei.updatesdk.sdk.service.download.bean.DownloadTask$b.a(DownloadTask$b, boolean)>
	//   15   27:pop             
		com.huawei.updatesdk.sdk.a.b.a.a.a.c("DownloadTask", (new StringBuilder()).append("setInterrupt,package:").append(x()).append(", isInterrupt:").append(flag).append(",reason:").append(i1).toString());
	//   16   28:ldc1            #91  <String "DownloadTask">
	//   17   30:new             #247 <Class StringBuilder>
	//   18   33:dup             
	//   19   34:invokespecial   #248 <Method void StringBuilder()>
	//   20   37:ldc2            #417 <String "setInterrupt,package:">
	//   21   40:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_0         
	//   23   44:invokevirtual   #419 <Method String x()>
	//   24   47:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:ldc2            #421 <String ", isInterrupt:">
	//   26   53:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:iload_1         
	//   28   57:invokevirtual   #424 <Method StringBuilder StringBuilder.append(boolean)>
	//   29   60:ldc2            #426 <String ",reason:">
	//   30   63:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:iload_2         
	//   32   67:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   33   70:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   34   73:invokestatic    #428 <Method void a.c(String, String)>
		if(flag)
	//*  35   76:iload_1         
	//*  36   77:ifeq            84
			f();
	//   37   80:aload_0         
	//   38   81:invokevirtual   #430 <Method void f()>
	//   39   84:return          
	}

	public List b()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field List F>
	//    2    4:areturn         
	}

	public void b(int i1)
	{
		w = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field int w>
	//    3    5:return          
	}

	public void b(long l1)
	{
		k = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #103 <Field long k>
	//    3    5:return          
	}

	public void b(Bundle bundle)
	{
		int i1;
		Field afield[];
		afield = ((Class) (com/huawei/updatesdk/sdk/service/download/bean/DownloadTask)).getDeclaredFields();
	//    0    0:ldc1            #2   <Class DownloadTask>
	//    1    2:invokevirtual   #170 <Method Field[] Class.getDeclaredFields()>
	//    2    5:astore_3        
		i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
_L3:
		if(i1 >= afield.length) goto _L2; else goto _L1
	//    5    8:iload_2         
	//    6    9:aload_3         
	//    7   10:arraylength     
	//    8   11:icmpge          246
_L1:
		String s1;
		String s2;
		Object obj;
		afield[i1].setAccessible(true);
	//    9   14:aload_3         
	//   10   15:iload_2         
	//   11   16:aaload          
	//   12   17:iconst_1        
	//   13   18:invokevirtual   #176 <Method void Field.setAccessible(boolean)>
		if(!afield[i1].isAnnotationPresent(com/huawei/updatesdk/sdk/service/download/bean/c))
			continue; /* Loop/switch isn't completed */
	//   14   21:aload_3         
	//   15   22:iload_2         
	//   16   23:aaload          
	//   17   24:ldc1            #178 <Class com.huawei.updatesdk.sdk.service.download.bean.c>
	//   18   26:invokevirtual   #182 <Method boolean Field.isAnnotationPresent(Class)>
	//   19   29:ifeq            209
		s1 = afield[i1].getType().getSimpleName();
	//   20   32:aload_3         
	//   21   33:iload_2         
	//   22   34:aaload          
	//   23   35:invokevirtual   #186 <Method Class Field.getType()>
	//   24   38:invokevirtual   #190 <Method String Class.getSimpleName()>
	//   25   41:astore          4
		s2 = afield[i1].getName();
	//   26   43:aload_3         
	//   27   44:iload_2         
	//   28   45:aaload          
	//   29   46:invokevirtual   #193 <Method String Field.getName()>
	//   30   49:astore          5
		obj = afield[i1].get(((Object) (this)));
	//   31   51:aload_3         
	//   32   52:iload_2         
	//   33   53:aaload          
	//   34   54:aload_0         
	//   35   55:invokevirtual   #436 <Method Object Field.get(Object)>
	//   36   58:astore          6
		if(obj == null)
	//*  37   60:aload           6
	//*  38   62:ifnonnull       68
			continue; /* Loop/switch isn't completed */
	//   39   65:goto            239
		if("String".equals(((Object) (s1))))
	//*  40   68:ldc1            #195 <String "String">
	//*  41   70:aload           4
	//*  42   72:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  43   75:ifeq            92
		{
			bundle.putString(s2, (String)obj);
	//   44   78:aload_1         
	//   45   79:aload           5
	//   46   81:aload           6
	//   47   83:checkcast       #197 <Class String>
	//   48   86:invokevirtual   #439 <Method void Bundle.putString(String, String)>
			continue; /* Loop/switch isn't completed */
	//   49   89:goto            209
		}
		if("int".equals(((Object) (s1))))
	//*  50   92:ldc1            #213 <String "int">
	//*  51   94:aload           4
	//*  52   96:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  53   99:ifeq            119
		{
			bundle.putInt(s2, ((Integer)obj).intValue());
	//   54  102:aload_1         
	//   55  103:aload           5
	//   56  105:aload           6
	//   57  107:checkcast       #219 <Class Integer>
	//   58  110:invokevirtual   #442 <Method int Integer.intValue()>
	//   59  113:invokevirtual   #446 <Method void Bundle.putInt(String, int)>
			continue; /* Loop/switch isn't completed */
	//   60  116:goto            209
		}
		if("long".equals(((Object) (s1))))
	//*  61  119:ldc1            #225 <String "long">
	//*  62  121:aload           4
	//*  63  123:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  64  126:ifeq            146
		{
			bundle.putLong(s2, ((Long)obj).longValue());
	//   65  129:aload_1         
	//   66  130:aload           5
	//   67  132:aload           6
	//   68  134:checkcast       #231 <Class Long>
	//   69  137:invokevirtual   #449 <Method long Long.longValue()>
	//   70  140:invokevirtual   #453 <Method void Bundle.putLong(String, long)>
			continue; /* Loop/switch isn't completed */
	//   71  143:goto            209
		}
		if("float".equals(((Object) (s1))))
	//*  72  146:ldc1            #236 <String "float">
	//*  73  148:aload           4
	//*  74  150:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  75  153:ifeq            173
		{
			bundle.putFloat(s2, ((Float)obj).floatValue());
	//   76  156:aload_1         
	//   77  157:aload           5
	//   78  159:aload           6
	//   79  161:checkcast       #242 <Class Float>
	//   80  164:invokevirtual   #457 <Method float Float.floatValue()>
	//   81  167:invokevirtual   #461 <Method void Bundle.putFloat(String, float)>
			continue; /* Loop/switch isn't completed */
	//   82  170:goto            209
		}
		if("boolean".equals(((Object) (s1))))
	//*  83  173:ldc2            #463 <String "boolean">
	//*  84  176:aload           4
	//*  85  178:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  86  181:ifeq            201
		{
			bundle.putBoolean(s2, ((Boolean)obj).booleanValue());
	//   87  184:aload_1         
	//   88  185:aload           5
	//   89  187:aload           6
	//   90  189:checkcast       #465 <Class Boolean>
	//   91  192:invokevirtual   #468 <Method boolean Boolean.booleanValue()>
	//   92  195:invokevirtual   #472 <Method void Bundle.putBoolean(String, boolean)>
			continue; /* Loop/switch isn't completed */
	//   93  198:goto            209
		}
		try
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.d("DownloadTask", "unsupport type");
	//   94  201:ldc1            #91  <String "DownloadTask">
	//   95  203:ldc2            #474 <String "unsupport type">
	//   96  206:invokestatic    #264 <Method void a.d(String, String)>
		}
	//*  97  209:goto            239
		catch(RuntimeException runtimeexception)
	//*  98  212:astore          4
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("DownloadTask", "writeToBundle exception:", ((Throwable) (runtimeexception)));
	//   99  214:ldc1            #91  <String "DownloadTask">
	//  100  216:ldc2            #476 <String "writeToBundle exception:">
	//  101  219:aload           4
	//  102  221:invokestatic    #269 <Method void a.a(String, String, Throwable)>
		}
	//* 103  224:goto            239
		catch(IllegalAccessException illegalaccessexception)
	//* 104  227:astore          4
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("DownloadTask", "writeToBundle exception:", ((Throwable) (illegalaccessexception)));
	//  105  229:ldc1            #91  <String "DownloadTask">
	//  106  231:ldc2            #476 <String "writeToBundle exception:">
	//  107  234:aload           4
	//  108  236:invokestatic    #269 <Method void a.a(String, String, Throwable)>
		}
		i1++;
	//  109  239:iload_2         
	//  110  240:iconst_1        
	//  111  241:iadd            
	//  112  242:istore_2        
		  goto _L3
	//* 113  243:goto            8
_L2:
	//  114  246:return          
	}

	public void b(String s1)
	{
		u = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field String u>
	//    3    5:return          
	}

	public void b(Future future)
	{
		L = future;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field Future L>
	//    3    5:return          
	}

	public void b(boolean flag)
	{
		R = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field boolean R>
	//    3    5:return          
	}

	public void c()
	{
		B = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #131 <Field String B>
		C = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #133 <Field String C>
		m = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #292 <Field int m>
	//    9   15:return          
	}

	public void c(int i1)
	{
		x = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int x>
	//    3    5:return          
	}

	public void c(long l1)
	{
		G = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #146 <Field long G>
	//    3    5:return          
	}

	public void c(String s1)
	{
		B = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field String B>
	//    3    5:return          
	}

	public void c(boolean flag)
	{
		y = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #125 <Field boolean y>
	//    3    5:return          
	}

	public a d()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field DownloadTask$a D>
	//    2    4:areturn         
	}

	public void d(int i1)
	{
		if(i1 == 5)
	//*   0    0:iload_1         
	//*   1    1:iconst_5        
	//*   2    2:icmpne          14
			com.huawei.updatesdk.sdk.a.b.a.a.a.d("downloadtask", "set DownloadCode.downloadfailed");
	//    3    5:ldc2            #479 <String "downloadtask">
	//    4    8:ldc2            #481 <String "set DownloadCode.downloadfailed">
	//    5   11:invokestatic    #264 <Method void a.d(String, String)>
		o = i1;
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:putfield        #107 <Field int o>
	//    9   19:return          
	}

	public void d(String s1)
	{
		C = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field String C>
	//    3    5:return          
	}

	public void d(boolean flag)
	{
		H = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field boolean H>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public b e()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field DownloadTask$b E>
	//    2    4:areturn         
	}

	public void e(int i1)
	{
		c = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field int c>
	//    3    5:return          
	}

	public void e(String s1)
	{
		K = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #485 <Field String K>
	//    3    5:return          
	}

	public void e(boolean flag)
	{
		J = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field boolean J>
	//    3    5:return          
	}

	public void f()
	{
		if(L == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field Future L>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		try
		{
			L.cancel(true);
	//    4    8:aload_0         
	//    5    9:getfield        #154 <Field Future L>
	//    6   12:iconst_1        
	//    7   13:invokeinterface #493 <Method boolean Future.cancel(boolean)>
	//    8   18:pop             
			com.huawei.updatesdk.sdk.a.b.a.a.a.c("HiAppDownload", (new StringBuilder()).append("abort http request, pacakge:").append(r).toString());
	//    9   19:ldc2            #377 <String "HiAppDownload">
	//   10   22:new             #247 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #248 <Method void StringBuilder()>
	//   13   29:ldc2            #495 <String "abort http request, pacakge:">
	//   14   32:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_0         
	//   16   36:getfield        #290 <Field String r>
	//   17   39:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   19   45:invokestatic    #428 <Method void a.c(String, String)>
			return;
	//   20   48:return          
		}
		catch(Exception exception)
	//*  21   49:astore_1        
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("HiAppDownload", "abort http request exception:", ((Throwable) (exception)));
	//   22   50:ldc2            #377 <String "HiAppDownload">
	//   23   53:ldc2            #497 <String "abort http request exception:">
	//   24   56:aload_1         
	//   25   57:invokestatic    #269 <Method void a.a(String, String, Throwable)>
		}
	//   26   60:return          
	}

	public void f(int i1)
	{
		e = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field int e>
	//    3    5:return          
	}

	public void f(String s1)
	{
		d = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #280 <Field String d>
	//    3    5:return          
	}

	public int g()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int s>
	//    2    4:ireturn         
	}

	public void g(int i1)
	{
		m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #292 <Field int m>
	//    3    5:return          
	}

	public void g(String s1)
	{
		f = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field String f>
	//    3    5:return          
	}

	public String h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field String h>
	//    2    4:areturn         
	}

	public void h(String s1)
	{
		l = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #288 <Field String l>
	//    3    5:return          
	}

	public long i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field long i>
	//    2    4:lreturn         
	}

	public void i(String s1)
	{
		r = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #290 <Field String r>
	//    3    5:return          
	}

	public int j()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int w>
	//    2    4:ireturn         
	}

	public void j(String s1)
	{
		j = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field String j>
	//    3    5:return          
	}

	public int k()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int x>
	//    2    4:ireturn         
	}

	public void k(String s1)
	{
		b = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #302 <Field String b>
	//    3    5:return          
	}

	public String l()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String B>
	//    2    4:areturn         
	}

	public String m()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field String C>
	//    2    4:areturn         
	}

	public String n()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field String K>
	//    2    4:areturn         
	}

	public int o()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int o>
	//    2    4:ireturn         
	}

	public int p()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int c>
	//    2    4:ireturn         
	}

	public int q()
	{
		if(e > 100)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field int e>
	//*   2    4:bipush          100
	//*   3    6:icmple          12
			return 100;
	//    4    9:bipush          100
	//    5   11:ireturn         
		else
			return e;
	//    6   12:aload_0         
	//    7   13:getfield        #97  <Field int e>
	//    8   16:ireturn         
	}

	public String r()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field String f>
	//    2    4:areturn         
	}

	public long s()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field long g>
	//    2    4:lreturn         
	}

	public long t()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field long k>
	//    2    4:lreturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {\n\thash_: ").append(a).append("\n\tdiffSha2_: ").append(b).append("\n\tid_: ").append(c).append("\n\tname_: ").append(d).append("\n\tprogress_: ").append(e).append("\n\turl_: ").append(f).append("\n\ticonUrl_: ").append(j).append("\n\tfileSize_: ").append(g).append("\n\talreadDownloadSize_: ").append(k).append("\n\tfilepath_: ").append(l).append("\n\tdownloadRate_: ").append(m).append("\n\tstatus_: ").append(o).append("\n\tisInterrupt: ").append(p).append("\n\tpackageName_: ").append(r).append("\n\tinterruptReason_: ").append(s).append("\n\tallowMobileNetowrkDownload: ").append(R).append("\n\tinstallType_: ").append(t).append("\n\tdetailID_: ").append(Q).append("\n\tappID_: ").append(u).append("\n\tdownloadErrInfo: ").append(((Object) (D))).append("\n\tisDeleteDirtyFile: ").append(S).append("\n\tbackupUrl: ").append(h).append("\n\tversionCode_: ").append(v).append("\n\tbackupFileSize: ").append(i).append("\n\tdownloadProtocol_: ").append(n).append("\n}").toString();
	//    0    0:new             #247 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #248 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #500 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #501 <Method String Class.getName()>
	//    6   14:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #503 <String " {\n\thash_: ">
	//    8   20:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #304 <Field String a>
	//   11   27:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:ldc2            #505 <String "\n\tdiffSha2_: ">
	//   13   33:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #302 <Field String b>
	//   16   40:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:ldc2            #507 <String "\n\tid_: ">
	//   18   46:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:aload_0         
	//   20   50:getfield        #95  <Field int c>
	//   21   53:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   22   56:ldc2            #509 <String "\n\tname_: ">
	//   23   59:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   24   62:aload_0         
	//   25   63:getfield        #280 <Field String d>
	//   26   66:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   27   69:ldc2            #511 <String "\n\tprogress_: ">
	//   28   72:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   29   75:aload_0         
	//   30   76:getfield        #97  <Field int e>
	//   31   79:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   32   82:ldc2            #513 <String "\n\turl_: ">
	//   33   85:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   34   88:aload_0         
	//   35   89:getfield        #282 <Field String f>
	//   36   92:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   37   95:ldc2            #515 <String "\n\ticonUrl_: ">
	//   38   98:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   39  101:aload_0         
	//   40  102:getfield        #294 <Field String j>
	//   41  105:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   42  108:ldc2            #517 <String "\n\tfileSize_: ">
	//   43  111:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   44  114:aload_0         
	//   45  115:getfield        #99  <Field long g>
	//   46  118:invokevirtual   #348 <Method StringBuilder StringBuilder.append(long)>
	//   47  121:ldc2            #519 <String "\n\talreadDownloadSize_: ">
	//   48  124:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   49  127:aload_0         
	//   50  128:getfield        #103 <Field long k>
	//   51  131:invokevirtual   #348 <Method StringBuilder StringBuilder.append(long)>
	//   52  134:ldc2            #521 <String "\n\tfilepath_: ">
	//   53  137:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   54  140:aload_0         
	//   55  141:getfield        #288 <Field String l>
	//   56  144:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   57  147:ldc2            #523 <String "\n\tdownloadRate_: ">
	//   58  150:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   59  153:aload_0         
	//   60  154:getfield        #292 <Field int m>
	//   61  157:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   62  160:ldc2            #525 <String "\n\tstatus_: ">
	//   63  163:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   64  166:aload_0         
	//   65  167:getfield        #107 <Field int o>
	//   66  170:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   67  173:ldc2            #527 <String "\n\tisInterrupt: ">
	//   68  176:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   69  179:aload_0         
	//   70  180:getfield        #109 <Field boolean p>
	//   71  183:invokevirtual   #424 <Method StringBuilder StringBuilder.append(boolean)>
	//   72  186:ldc2            #529 <String "\n\tpackageName_: ">
	//   73  189:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   74  192:aload_0         
	//   75  193:getfield        #290 <Field String r>
	//   76  196:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   77  199:ldc2            #531 <String "\n\tinterruptReason_: ">
	//   78  202:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   79  205:aload_0         
	//   80  206:getfield        #113 <Field int s>
	//   81  209:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   82  212:ldc2            #533 <String "\n\tallowMobileNetowrkDownload: ">
	//   83  215:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   84  218:aload_0         
	//   85  219:getfield        #117 <Field boolean R>
	//   86  222:invokevirtual   #424 <Method StringBuilder StringBuilder.append(boolean)>
	//   87  225:ldc2            #535 <String "\n\tinstallType_: ">
	//   88  228:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   89  231:aload_0         
	//   90  232:getfield        #115 <Field int t>
	//   91  235:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   92  238:ldc2            #537 <String "\n\tdetailID_: ">
	//   93  241:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   94  244:aload_0         
	//   95  245:getfield        #298 <Field String Q>
	//   96  248:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   97  251:ldc2            #539 <String "\n\tappID_: ">
	//   98  254:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   99  257:aload_0         
	//  100  258:getfield        #296 <Field String u>
	//  101  261:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  102  264:ldc2            #541 <String "\n\tdownloadErrInfo: ">
	//  103  267:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  104  270:aload_0         
	//  105  271:getfield        #136 <Field DownloadTask$a D>
	//  106  274:invokevirtual   #544 <Method StringBuilder StringBuilder.append(Object)>
	//  107  277:ldc2            #546 <String "\n\tisDeleteDirtyFile: ">
	//  108  280:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  109  283:aload_0         
	//  110  284:getfield        #119 <Field boolean S>
	//  111  287:invokevirtual   #424 <Method StringBuilder StringBuilder.append(boolean)>
	//  112  290:ldc2            #548 <String "\n\tbackupUrl: ">
	//  113  293:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  114  296:aload_0         
	//  115  297:getfield        #300 <Field String h>
	//  116  300:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  117  303:ldc2            #550 <String "\n\tversionCode_: ">
	//  118  306:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  119  309:aload_0         
	//  120  310:getfield        #306 <Field int v>
	//  121  313:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//  122  316:ldc2            #552 <String "\n\tbackupFileSize: ">
	//  123  319:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  124  322:aload_0         
	//  125  323:getfield        #101 <Field long i>
	//  126  326:invokevirtual   #348 <Method StringBuilder StringBuilder.append(long)>
	//  127  329:ldc2            #554 <String "\n\tdownloadProtocol_: ">
	//  128  332:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  129  335:aload_0         
	//  130  336:getfield        #105 <Field int n>
	//  131  339:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//  132  342:ldc2            #556 <String "\n}">
	//  133  345:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//  134  348:invokevirtual   #259 <Method String StringBuilder.toString()>
	//  135  351:areturn         
	}

	public String u()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field String l>
	//    2    4:areturn         
	}

	public String v()
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #288 <Field String l>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i1 = l.lastIndexOf(File.separator);
	//    5    9:aload_0         
	//    6   10:getfield        #288 <Field String l>
	//    7   13:getstatic       #561 <Field String File.separator>
	//    8   16:invokevirtual   #384 <Method int String.lastIndexOf(String)>
	//    9   19:istore_1        
		if(i1 == -1)
	//*  10   20:iload_1         
	//*  11   21:iconst_m1       
	//*  12   22:icmpne          27
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
		else
			return l.substring(i1 + 1);
	//   15   27:aload_0         
	//   16   28:getfield        #288 <Field String l>
	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:invokevirtual   #388 <Method String String.substring(int)>
	//   21   37:areturn         
	}

	public Future w()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Future q>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field int c>
	//    3    5:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeString(d);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #280 <Field String d>
	//    7   13:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field int e>
	//   11   21:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeString(f);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #282 <Field String f>
	//   15   29:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeLong(g);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #99  <Field long g>
	//   19   37:invokevirtual   #574 <Method void Parcel.writeLong(long)>
		parcel.writeLong(k);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #103 <Field long k>
	//   23   45:invokevirtual   #574 <Method void Parcel.writeLong(long)>
		parcel.writeString(l);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #288 <Field String l>
	//   27   53:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeString(r);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #290 <Field String r>
	//   31   61:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeInt(m);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #292 <Field int m>
	//   35   69:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeInt(o);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #107 <Field int o>
	//   39   77:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeString(j);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #294 <Field String j>
	//   43   85:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeString(u);
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #296 <Field String u>
	//   47   93:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeString(Q);
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #298 <Field String Q>
	//   51  101:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeInt(s);
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #113 <Field int s>
	//   55  109:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeInt(t);
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #115 <Field int t>
	//   59  117:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeString(h);
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #300 <Field String h>
	//   63  125:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeLong(i);
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #101 <Field long i>
	//   67  133:invokevirtual   #574 <Method void Parcel.writeLong(long)>
		parcel.writeString(b);
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #302 <Field String b>
	//   71  141:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeInt(n);
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:getfield        #105 <Field int n>
	//   75  149:invokevirtual   #568 <Method void Parcel.writeInt(int)>
		parcel.writeString(a);
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #304 <Field String a>
	//   79  157:invokevirtual   #571 <Method void Parcel.writeString(String)>
		parcel.writeInt(v);
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:getfield        #306 <Field int v>
	//   83  165:invokevirtual   #568 <Method void Parcel.writeInt(int)>
	//   84  168:return          
	}

	public String x()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field String r>
	//    2    4:areturn         
	}

	public void y()
	{
		if(!S)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field boolean S>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(l == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #288 <Field String l>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		com.huawei.updatesdk.sdk.a.b.a.a.a.a("DownloadTask", (new StringBuilder()).append("download failed, delete temp file, task:").append(((Object) (this))).toString());
	//    8   16:ldc1            #91  <String "DownloadTask">
	//    9   18:new             #247 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #248 <Method void StringBuilder()>
	//   12   25:ldc2            #576 <String "download failed, delete temp file, task:">
	//   13   28:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_0         
	//   15   32:invokevirtual   #544 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   17   38:invokestatic    #578 <Method void a.a(String, String)>
		if(!(new File(l)).delete())
	//*  18   41:new             #558 <Class File>
	//*  19   44:dup             
	//*  20   45:aload_0         
	//*  21   46:getfield        #288 <Field String l>
	//*  22   49:invokespecial   #580 <Method void File(String)>
	//*  23   52:invokevirtual   #583 <Method boolean File.delete()>
	//*  24   55:ifne            66
			com.huawei.updatesdk.sdk.a.b.a.a.a.d("DownloadTask", "file delete failed!");
	//   25   58:ldc1            #91  <String "DownloadTask">
	//   26   60:ldc2            #585 <String "file delete failed!">
	//   27   63:invokestatic    #264 <Method void a.d(String, String)>
	//   28   66:return          
	}

	public boolean z()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean y>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new _cls1();
	private static int O = com.huawei.updatesdk.sdk.a.c.a.c.a();
	private static final Object P = new Object();
	protected volatile boolean A;
	protected String B;
	protected String C;
	protected a D;
	protected b E;
	protected List F;
	protected long G;
	protected boolean H;
	protected boolean I;
	protected boolean J;
	protected String K;
	protected Future L;
	protected com.huawei.updatesdk.sdk.service.download.c M;
	private final String N;
	private String Q;
	private boolean R;
	private boolean S;
	public String a;
	protected String b;
	protected int c;
	protected String d;
	protected int e;
	protected String f;
	protected long g;
	protected String h;
	protected long i;
	protected String j;
	protected long k;
	protected String l;
	protected int m;
	protected int n;
	protected int o;
	public boolean p;
	protected Future q;
	protected String r;
	public int s;
	protected int t;
	protected String u;
	protected int v;
	protected int w;
	protected int x;
	protected boolean y;
	protected volatile boolean z;

	static 
	{
	//    0    0:invokestatic    #76  <Method int c.a()>
	//    1    3:putstatic       #78  <Field int O>
	//    2    6:new             #4   <Class Object>
	//    3    9:dup             
	//    4   10:invokespecial   #81  <Method void Object()>
	//    5   13:putstatic       #83  <Field Object P>
	//    6   16:new             #85  <Class DownloadTask$1>
	//    7   19:dup             
	//    8   20:invokespecial   #86  <Method void DownloadTask$1()>
	//    9   23:putstatic       #88  <Field android.os.Parcelable$Creator CREATOR>
	//*  10   26:return          
	}

	/* member class not found */
	class _cls1 {}

}
