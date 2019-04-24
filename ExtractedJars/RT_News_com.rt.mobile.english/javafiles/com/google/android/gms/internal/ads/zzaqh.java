// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapw, zzang, zzakk, zzamu, 
//			zzaqj, zzaqk

public abstract class zzaqh
	implements Releasable
{

	public zzaqh(zzapw zzapw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mContext = zzapw1.getContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #26  <Method Context zzapw.getContext()>
	//    5   11:putfield        #28  <Field Context mContext>
		zzcpq = zzbv.zzek().zzm(mContext, zzapw1.zztq().zzcw);
	//    6   14:aload_0         
	//    7   15:invokestatic    #34  <Method zzakk zzbv.zzek()>
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field Context mContext>
	//   10   22:aload_1         
	//   11   23:invokeinterface #38  <Method zzang zzapw.zztq()>
	//   12   28:getfield        #43  <Field String zzang.zzcw>
	//   13   31:invokevirtual   #49  <Method String zzakk.zzm(Context, String)>
	//   14   34:putfield        #51  <Field String zzcpq>
		zzdaz = new WeakReference(((Object) (zzapw1)));
	//   15   37:aload_0         
	//   16   38:new             #53  <Class WeakReference>
	//   17   41:dup             
	//   18   42:aload_1         
	//   19   43:invokespecial   #56  <Method void WeakReference(Object)>
	//   20   46:putfield        #58  <Field WeakReference zzdaz>
	//   21   49:return          
	}

	static String zza(zzaqh zzaqh1, String s)
	{
		return zzdq(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method String zzdq(String)>
	//    2    4:areturn         
	}

	static void zza(zzaqh zzaqh1, String s, Map map)
	{
		zzaqh1.zza(s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #69  <Method void zza(String, Map)>
	//    4    6:return          
	}

	private final void zza(String s, Map map)
	{
		zzapw zzapw1 = (zzapw)zzdaz.get();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field WeakReference zzdaz>
	//    2    4:invokevirtual   #73  <Method Object WeakReference.get()>
	//    3    7:checkcast       #22  <Class zzapw>
	//    4   10:astore_3        
		if(zzapw1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          23
			zzapw1.zza(s, map);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #74  <Method void zzapw.zza(String, Map)>
	//   11   23:return          
	}

	private static String zzdq(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #82  <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    12: default 112
	//	               -1947652542: 275
	//	               -1396664534: 260
	//	               -1347010958: 246
	//	               -918817863: 231
	//	               -659376217: 217
	//	               -642208130: 203
	//	               -354048396: 188
	//	               -32082395: 173
	//	               3387234: 159
	//	               96784904: 145
	//	               580119100: 130
	//	               725497484: 115
	//*   3  112:goto            289
			case 725497484: 
				if(s.equals("noCacheDir"))
	//*   4  115:aload_0         
	//*   5  116:ldc1            #84  <String "noCacheDir">
	//*   6  118:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*   7  121:ifeq            289
				{
					byte0 = 7;
	//    8  124:bipush          7
	//    9  126:istore_1        
					break label0;
	//   10  127:goto            291
				}
				break;

			case 580119100: 
				if(!s.equals("expireFailed"))
					break;
	//   11  130:aload_0         
	//   12  131:ldc1            #90  <String "expireFailed">
	//   13  133:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   14  136:ifeq            289
				byte0 = 6;
	//   15  139:bipush          6
	//   16  141:istore_1        
				break label0;
	//   17  142:goto            291

			case 96784904: 
				if(!s.equals("error"))
					break;
	//   18  145:aload_0         
	//   19  146:ldc1            #92  <String "error">
	//   20  148:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   21  151:ifeq            289
				byte0 = 1;
	//   22  154:iconst_1        
	//   23  155:istore_1        
				break label0;
	//   24  156:goto            291

			case 3387234: 
				if(!s.equals("noop"))
					break;
	//   25  159:aload_0         
	//   26  160:ldc1            #94  <String "noop">
	//   27  162:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   28  165:ifeq            289
				byte0 = 4;
	//   29  168:iconst_4        
	//   30  169:istore_1        
				break label0;
	//   31  170:goto            291

			case -32082395: 
				if(!s.equals("externalAbort"))
					break;
	//   32  173:aload_0         
	//   33  174:ldc1            #96  <String "externalAbort">
	//   34  176:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   35  179:ifeq            289
				byte0 = 10;
	//   36  182:bipush          10
	//   37  184:istore_1        
				break label0;
	//   38  185:goto            291

			case -354048396: 
				if(!s.equals("sizeExceeded"))
					break;
	//   39  188:aload_0         
	//   40  189:ldc1            #98  <String "sizeExceeded">
	//   41  191:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   42  194:ifeq            289
				byte0 = 11;
	//   43  197:bipush          11
	//   44  199:istore_1        
				break label0;
	//   45  200:goto            291

			case -642208130: 
				if(!s.equals("playerFailed"))
					break;
	//   46  203:aload_0         
	//   47  204:ldc1            #100 <String "playerFailed">
	//   48  206:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   49  209:ifeq            289
				byte0 = 5;
	//   50  212:iconst_5        
	//   51  213:istore_1        
				break label0;
	//   52  214:goto            291

			case -659376217: 
				if(!s.equals("contentLengthMissing"))
					break;
	//   53  217:aload_0         
	//   54  218:ldc1            #102 <String "contentLengthMissing">
	//   55  220:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   56  223:ifeq            289
				byte0 = 0;
	//   57  226:iconst_0        
	//   58  227:istore_1        
				break label0;
	//   59  228:goto            291

			case -918817863: 
				if(!s.equals("downloadTimeout"))
					break;
	//   60  231:aload_0         
	//   61  232:ldc1            #104 <String "downloadTimeout">
	//   62  234:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   63  237:ifeq            289
				byte0 = 9;
	//   64  240:bipush          9
	//   65  242:istore_1        
				break label0;
	//   66  243:goto            291

			case -1347010958: 
				if(!s.equals("inProgress"))
					break;
	//   67  246:aload_0         
	//   68  247:ldc1            #106 <String "inProgress">
	//   69  249:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   70  252:ifeq            289
				byte0 = 2;
	//   71  255:iconst_2        
	//   72  256:istore_1        
				break label0;
	//   73  257:goto            291

			case -1396664534: 
				if(!s.equals("badUrl"))
					break;
	//   74  260:aload_0         
	//   75  261:ldc1            #108 <String "badUrl">
	//   76  263:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   77  266:ifeq            289
				byte0 = 8;
	//   78  269:bipush          8
	//   79  271:istore_1        
				break label0;
	//   80  272:goto            291

			case -1947652542: 
				if(!s.equals("interrupted"))
					break;
	//   81  275:aload_0         
	//   82  276:ldc1            #110 <String "interrupted">
	//   83  278:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   84  281:ifeq            289
				byte0 = 3;
	//   85  284:iconst_3        
	//   86  285:istore_1        
				break label0;
	//   87  286:goto            291
			}
			byte0 = -1;
	//   88  289:iconst_m1       
	//   89  290:istore_1        
		}
		switch(byte0)
	//*  90  291:iload_1         
		{
	//*  91  292:tableswitch     0 11: default 356
	//	               0 368
	//	               1 368
	//	               2 368
	//	               3 368
	//	               4 368
	//	               5 368
	//	               6 365
	//	               7 365
	//	               8 362
	//	               9 362
	//	               10 359
	//	               11 359
		default:
			return "internal";
	//   92  356:ldc1            #112 <String "internal">
	//   93  358:areturn         

		case 10: // '\n'
		case 11: // '\013'
			return "policy";
	//   94  359:ldc1            #114 <String "policy">
	//   95  361:areturn         

		case 8: // '\b'
		case 9: // '\t'
			return "network";
	//   96  362:ldc1            #116 <String "network">
	//   97  364:areturn         

		case 6: // '\006'
		case 7: // '\007'
			return "io";
	//   98  365:ldc1            #118 <String "io">
	//   99  367:areturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return "internal";
	//  100  368:ldc1            #112 <String "internal">
	//  101  370:areturn         
		}
	}

	public abstract void abort();

	public void release()
	{
	//    0    0:return          
	}

	protected final void zza(String s, String s1, int i)
	{
		zzamu.zzsy.post(((Runnable) (new zzaqj(this, s, s1, i))));
	//    0    0:getstatic       #127 <Field Handler zzamu.zzsy>
	//    1    3:new             #129 <Class zzaqj>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #132 <Method void zzaqj(zzaqh, String, String, int)>
	//    8   14:invokevirtual   #138 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void zza(String s, String s1, String s2, String s3)
	{
		zzamu.zzsy.post(((Runnable) (new zzaqk(this, s, s1, s2, s3))));
	//    0    0:getstatic       #127 <Field Handler zzamu.zzsy>
	//    1    3:new             #143 <Class zzaqk>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #146 <Method void zzaqk(zzaqh, String, String, String, String)>
	//    9   16:invokevirtual   #138 <Method boolean Handler.post(Runnable)>
	//   10   19:pop             
	//   11   20:return          
	}

	public abstract boolean zzdp(String s);

	protected Context mContext;
	private String zzcpq;
	private WeakReference zzdaz;
}
