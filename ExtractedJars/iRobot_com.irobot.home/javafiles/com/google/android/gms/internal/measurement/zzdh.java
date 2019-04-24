// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzat, zzch, zzbv, 
//			zzcj, zzaw

public final class zzdh extends zzau
{

	public zzdh(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void zzau(zzaw)>
	//    3    5:return          
	}

	protected final void zzag()
	{
		Object obj = ((Object) (((zzat)this).getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Context zzat.getContext()>
	//    2    4:astore_3        
		try
		{
			obj = ((Object) (((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 128)));
	//    3    5:aload_3         
	//    4    6:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #39  <Method String Context.getPackageName()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #45  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_3        
		}
	//*  10   20:goto            33
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  11   23:astore_3        
		{
			((zzat)this).zzd("PackageManager doesn't know about the app package", obj);
	//   12   24:aload_0         
	//   13   25:ldc1            #47  <String "PackageManager doesn't know about the app package">
	//   14   27:aload_3         
	//   15   28:invokevirtual   #51  <Method void zzat.zzd(String, Object)>
			obj = null;
	//   16   31:aconst_null     
	//   17   32:astore_3        
		}
		if(obj == null)
	//*  18   33:aload_3         
	//*  19   34:ifnonnull       44
		{
			((zzat)this).zzt("Couldn't get ApplicationInfo to load global config");
	//   20   37:aload_0         
	//   21   38:ldc1            #53  <String "Couldn't get ApplicationInfo to load global config">
	//   22   40:invokevirtual   #57  <Method void zzat.zzt(String)>
			return;
	//   23   43:return          
		}
		obj = ((Object) (((ApplicationInfo) (obj)).metaData));
	//   24   44:aload_3         
	//   25   45:getfield        #63  <Field Bundle ApplicationInfo.metaData>
	//   26   48:astore_3        
		if(obj != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          367
		{
			int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
	//   29   53:aload_3         
	//   30   54:ldc1            #65  <String "com.google.android.gms.analytics.globalConfigResource">
	//   31   56:invokevirtual   #71  <Method int Bundle.getInt(String)>
	//   32   59:istore_1        
			if(i > 0)
	//*  33   60:iload_1         
	//*  34   61:ifle            367
			{
				zzcj zzcj1 = (zzcj)((zzbv) (new zzch(((zzat)this).zzbw()))).zzq(i);
	//   35   64:new             #73  <Class zzch>
	//   36   67:dup             
	//   37   68:aload_0         
	//   38   69:invokevirtual   #77  <Method zzaw zzat.zzbw()>
	//   39   72:invokespecial   #78  <Method void zzch(zzaw)>
	//   40   75:iload_1         
	//   41   76:invokevirtual   #84  <Method zzbu zzbv.zzq(int)>
	//   42   79:checkcast       #86  <Class zzcj>
	//   43   82:astore_3        
				if(zzcj1 != null)
	//*  44   83:aload_3         
	//*  45   84:ifnull          367
				{
					((zzat)this).zzq("Loading global XML config values");
	//   46   87:aload_0         
	//   47   88:ldc1            #88  <String "Loading global XML config values">
	//   48   90:invokevirtual   #90  <Method void zzat.zzq(String)>
					String s = zzcj1.zzaaq;
	//   49   93:aload_3         
	//   50   94:getfield        #92  <Field String zzcj.zzaaq>
	//   51   97:astore          4
					boolean flag1 = false;
	//   52   99:iconst_0        
	//   53  100:istore_2        
					boolean flag;
					if(s != null)
	//*  54  101:aload           4
	//*  55  103:ifnull          111
						flag = true;
	//   56  106:iconst_1        
	//   57  107:istore_1        
					else
	//*  58  108:goto            113
						flag = false;
	//   59  111:iconst_0        
	//   60  112:istore_1        
					if(flag)
	//*  61  113:iload_1         
	//*  62  114:ifeq            137
					{
						String s1 = zzcj1.zzaaq;
	//   63  117:aload_3         
	//   64  118:getfield        #92  <Field String zzcj.zzaaq>
	//   65  121:astore          4
						zzaaq = s1;
	//   66  123:aload_0         
	//   67  124:aload           4
	//   68  126:putfield        #93  <Field String zzaaq>
						((zzat)this).zzb("XML config - app name", ((Object) (s1)));
	//   69  129:aload_0         
	//   70  130:ldc1            #95  <String "XML config - app name">
	//   71  132:aload           4
	//   72  134:invokevirtual   #98  <Method void zzat.zzb(String, Object)>
					}
					if(zzcj1.zzaar != null)
	//*  73  137:aload_3         
	//*  74  138:getfield        #100 <Field String zzcj.zzaar>
	//*  75  141:ifnull          149
						flag = true;
	//   76  144:iconst_1        
	//   77  145:istore_1        
					else
	//*  78  146:goto            151
						flag = false;
	//   79  149:iconst_0        
	//   80  150:istore_1        
					if(flag)
	//*  81  151:iload_1         
	//*  82  152:ifeq            175
					{
						String s2 = zzcj1.zzaar;
	//   83  155:aload_3         
	//   84  156:getfield        #100 <Field String zzcj.zzaar>
	//   85  159:astore          4
						zzaar = s2;
	//   86  161:aload_0         
	//   87  162:aload           4
	//   88  164:putfield        #101 <Field String zzaar>
						((zzat)this).zzb("XML config - app version", ((Object) (s2)));
	//   89  167:aload_0         
	//   90  168:ldc1            #103 <String "XML config - app version">
	//   91  170:aload           4
	//   92  172:invokevirtual   #98  <Method void zzat.zzb(String, Object)>
					}
					if(zzcj1.zzaas != null)
	//*  93  175:aload_3         
	//*  94  176:getfield        #106 <Field String zzcj.zzaas>
	//*  95  179:ifnull          187
						flag = true;
	//   96  182:iconst_1        
	//   97  183:istore_1        
					else
	//*  98  184:goto            189
						flag = false;
	//   99  187:iconst_0        
	//  100  188:istore_1        
					if(flag)
	//* 101  189:iload_1         
	//* 102  190:ifeq            286
					{
						String s3 = zzcj1.zzaas.toLowerCase(Locale.US);
	//  103  193:aload_3         
	//  104  194:getfield        #106 <Field String zzcj.zzaas>
	//  105  197:getstatic       #112 <Field Locale Locale.US>
	//  106  200:invokevirtual   #118 <Method String String.toLowerCase(Locale)>
	//  107  203:astore          4
						int j;
						if("verbose".equals(((Object) (s3))))
	//* 108  205:ldc1            #120 <String "verbose">
	//* 109  207:aload           4
	//* 110  209:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 111  212:ifeq            220
							j = 0;
	//  112  215:iconst_0        
	//  113  216:istore_1        
						else
	//* 114  217:goto            267
						if("info".equals(((Object) (s3))))
	//* 115  220:ldc1            #126 <String "info">
	//* 116  222:aload           4
	//* 117  224:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 118  227:ifeq            235
							j = 1;
	//  119  230:iconst_1        
	//  120  231:istore_1        
						else
	//* 121  232:goto            267
						if("warning".equals(((Object) (s3))))
	//* 122  235:ldc1            #128 <String "warning">
	//* 123  237:aload           4
	//* 124  239:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 125  242:ifeq            250
							j = 2;
	//  126  245:iconst_2        
	//  127  246:istore_1        
						else
	//* 128  247:goto            267
						if("error".equals(((Object) (s3))))
	//* 129  250:ldc1            #130 <String "error">
	//* 130  252:aload           4
	//* 131  254:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 132  257:ifeq            265
							j = 3;
	//  133  260:iconst_3        
	//  134  261:istore_1        
						else
	//* 135  262:goto            267
							j = -1;
	//  136  265:iconst_m1       
	//  137  266:istore_1        
						if(j >= 0)
	//* 138  267:iload_1         
	//* 139  268:iflt            286
						{
							zzacq = j;
	//  140  271:aload_0         
	//  141  272:iload_1         
	//  142  273:putfield        #132 <Field int zzacq>
							((zzat)this).zza("XML config - log level", ((Object) (Integer.valueOf(j))));
	//  143  276:aload_0         
	//  144  277:ldc1            #134 <String "XML config - log level">
	//  145  279:iload_1         
	//  146  280:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//  147  283:invokevirtual   #143 <Method void zzat.zza(String, Object)>
						}
					}
					if(zzcj1.zzaat >= 0)
	//* 148  286:aload_3         
	//* 149  287:getfield        #145 <Field int zzcj.zzaat>
	//* 150  290:iflt            298
						j = 1;
	//  151  293:iconst_1        
	//  152  294:istore_1        
					else
	//* 153  295:goto            300
						j = 0;
	//  154  298:iconst_0        
	//  155  299:istore_1        
					if(j)
	//* 156  300:iload_1         
	//* 157  301:ifeq            329
					{
						int k = zzcj1.zzaat;
	//  158  304:aload_3         
	//  159  305:getfield        #145 <Field int zzcj.zzaat>
	//  160  308:istore_1        
						zzaat = k;
	//  161  309:aload_0         
	//  162  310:iload_1         
	//  163  311:putfield        #146 <Field int zzaat>
						zzacr = true;
	//  164  314:aload_0         
	//  165  315:iconst_1        
	//  166  316:putfield        #148 <Field boolean zzacr>
						((zzat)this).zzb("XML config - dispatch period (sec)", ((Object) (Integer.valueOf(k))));
	//  167  319:aload_0         
	//  168  320:ldc1            #150 <String "XML config - dispatch period (sec)">
	//  169  322:iload_1         
	//  170  323:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//  171  326:invokevirtual   #98  <Method void zzat.zzb(String, Object)>
					}
					if(zzcj1.zzaau != -1)
	//* 172  329:aload_3         
	//* 173  330:getfield        #153 <Field int zzcj.zzaau>
	//* 174  333:iconst_m1       
	//* 175  334:icmpeq          367
					{
						if(zzcj1.zzaau == 1)
	//* 176  337:aload_3         
	//* 177  338:getfield        #153 <Field int zzcj.zzaau>
	//* 178  341:iconst_1        
	//* 179  342:icmpne          347
							flag1 = true;
	//  180  345:iconst_1        
	//  181  346:istore_2        
						zzact = flag1;
	//  182  347:aload_0         
	//  183  348:iload_2         
	//  184  349:putfield        #155 <Field boolean zzact>
						zzacs = true;
	//  185  352:aload_0         
	//  186  353:iconst_1        
	//  187  354:putfield        #157 <Field boolean zzacs>
						((zzat)this).zzb("XML config - dry run", ((Object) (Boolean.valueOf(flag1))));
	//  188  357:aload_0         
	//  189  358:ldc1            #159 <String "XML config - dry run">
	//  190  360:iload_2         
	//  191  361:invokestatic    #164 <Method Boolean Boolean.valueOf(boolean)>
	//  192  364:invokevirtual   #98  <Method void zzat.zzb(String, Object)>
					}
				}
			}
		}
	//  193  367:return          
	}

	public final String zzaj()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method void zzau.zzcl()>
		return zzaaq;
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field String zzaaq>
	//    4    8:areturn         
	}

	public final String zzak()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method void zzau.zzcl()>
		return zzaar;
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field String zzaar>
	//    4    8:areturn         
	}

	public final boolean zzfr()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method void zzau.zzcl()>
		return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	}

	public final boolean zzfs()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method void zzau.zzcl()>
		return zzacs;
	//    2    4:aload_0         
	//    3    5:getfield        #157 <Field boolean zzacs>
	//    4    8:ireturn         
	}

	public final boolean zzft()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method void zzau.zzcl()>
		return zzact;
	//    2    4:aload_0         
	//    3    5:getfield        #155 <Field boolean zzact>
	//    4    8:ireturn         
	}

	private String zzaaq;
	private String zzaar;
	protected int zzaat;
	private int zzacq;
	protected boolean zzacr;
	private boolean zzacs;
	private boolean zzact;
}
