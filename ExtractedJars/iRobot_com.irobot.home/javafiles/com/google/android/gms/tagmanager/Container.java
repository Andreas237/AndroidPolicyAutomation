// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi, zzfb, zzeh, zzdq, 
//			DataLayer, zzgj, zzdz, zzan, 
//			zzu

public class Container
{
	public static interface FunctionCallMacroCallback
	{

		public abstract Object getValue(String s, Map map);
	}

	public static interface FunctionCallTagCallback
	{

		public abstract void execute(String s, Map map);
	}

	final class zza
		implements zzan
	{

		public final Object zza(String s, Map map)
		{
			FunctionCallMacroCallback functioncallmacrocallback = zzazx.zzdc(s);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Container zzazx>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method Container$FunctionCallMacroCallback Container.zzdc(String)>
		//    4    8:astore_3        
			if(functioncallmacrocallback == null)
		//*   5    9:aload_3         
		//*   6   10:ifnonnull       15
				return ((Object) (null));
		//    7   13:aconst_null     
		//    8   14:areturn         
			else
				return functioncallmacrocallback.getValue(s, map);
		//    9   15:aload_3         
		//   10   16:aload_1         
		//   11   17:aload_2         
		//   12   18:invokeinterface #32  <Method Object Container$FunctionCallMacroCallback.getValue(String, Map)>
		//   13   23:areturn         
		}

		private final Container zzazx;

		private zza()
		{
			zzazx = Container.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Container zzazx>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

		zza(zzu zzu)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void Container$zza(Container)>
		//    3    5:return          
		}
	}

	final class zzb
		implements zzan
	{

		public final Object zza(String s, Map map)
		{
			FunctionCallTagCallback functioncalltagcallback = zzazx.zzdd(s);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Container zzazx>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method Container$FunctionCallTagCallback Container.zzdd(String)>
		//    4    8:astore_3        
			if(functioncalltagcallback != null)
		//*   5    9:aload_3         
		//*   6   10:ifnull          21
				functioncalltagcallback.execute(s, map);
		//    7   13:aload_3         
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:invokeinterface #34  <Method void Container$FunctionCallTagCallback.execute(String, Map)>
			return ((Object) (zzgj.zzqp()));
		//   11   21:invokestatic    #40  <Method String zzgj.zzqp()>
		//   12   24:areturn         
		}

		private final Container zzazx;

		private zzb()
		{
			zzazx = Container.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Container zzazx>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

		zzb(zzu zzu)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void Container$zzb(Container)>
		//    3    5:return          
		}
	}


	Container(Context context, DataLayer datalayer, String s, long l, zzo zzo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzazt = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #42  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void HashMap()>
	//    6   12:putfield        #45  <Field Map zzazt>
		zzazu = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #42  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #43  <Method void HashMap()>
	//   11   23:putfield        #47  <Field Map zzazu>
		zzazw = "";
	//   12   26:aload_0         
	//   13   27:ldc1            #49  <String "">
	//   14   29:putfield        #51  <Field String zzazw>
		zzri = context;
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:putfield        #53  <Field Context zzri>
		zzazr = datalayer;
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:putfield        #55  <Field DataLayer zzazr>
		zzazq = s;
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:putfield        #57  <Field String zzazq>
		zzazv = l;
	//   24   47:aload_0         
	//   25   48:lload           4
	//   26   50:putfield        #59  <Field long zzazv>
		context = ((Context) (zzo1.zzqg));
	//   27   53:aload           6
	//   28   55:getfield        #65  <Field com.google.android.gms.internal.measurement.zzl zzo.zzqg>
	//   29   58:astore_1        
		if(context == null)
	//*  30   59:aload_1         
	//*  31   60:ifnonnull       71
			throw new NullPointerException();
	//   32   63:new             #67  <Class NullPointerException>
	//   33   66:dup             
	//   34   67:invokespecial   #68  <Method void NullPointerException()>
	//   35   70:athrow          
		datalayer = ((DataLayer) (zzrg.zza(((com.google.android.gms.internal.measurement.zzl) (context)))));
	//   36   71:aload_1         
	//   37   72:invokestatic    #73  <Method zzrk zzrg.zza(com.google.android.gms.internal.measurement.zzl)>
	//   38   75:astore_2        
		zza(((zzrk) (datalayer)));
	//   39   76:aload_0         
	//   40   77:aload_2         
	//   41   78:invokespecial   #76  <Method void zza(zzrk)>
		break MISSING_BLOCK_LABEL_154;
	//   42   81:goto            154
		datalayer;
	//   43   84:astore_2        
		context = ((Context) (String.valueOf(((Object) (context)))));
	//   44   85:aload_1         
	//   45   86:invokestatic    #82  <Method String String.valueOf(Object)>
	//   46   89:astore_1        
		datalayer = ((DataLayer) (((zzro) (datalayer)).toString()));
	//   47   90:aload_2         
	//   48   91:invokevirtual   #86  <Method String zzro.toString()>
	//   49   94:astore_2        
		s = ((String) (new StringBuilder(String.valueOf(((Object) (context))).length() + 46 + String.valueOf(((Object) (datalayer))).length())));
	//   50   95:new             #88  <Class StringBuilder>
	//   51   98:dup             
	//   52   99:aload_1         
	//   53  100:invokestatic    #82  <Method String String.valueOf(Object)>
	//   54  103:invokevirtual   #92  <Method int String.length()>
	//   55  106:bipush          46
	//   56  108:iadd            
	//   57  109:aload_2         
	//   58  110:invokestatic    #82  <Method String String.valueOf(Object)>
	//   59  113:invokevirtual   #92  <Method int String.length()>
	//   60  116:iadd            
	//   61  117:invokespecial   #95  <Method void StringBuilder(int)>
	//   62  120:astore_3        
		((StringBuilder) (s)).append("Not loading resource: ");
	//   63  121:aload_3         
	//   64  122:ldc1            #97  <String "Not loading resource: ">
	//   65  124:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   66  127:pop             
		((StringBuilder) (s)).append(((String) (context)));
	//   67  128:aload_3         
	//   68  129:aload_1         
	//   69  130:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   70  133:pop             
		((StringBuilder) (s)).append(" because it is invalid: ");
	//   71  134:aload_3         
	//   72  135:ldc1            #103 <String " because it is invalid: ">
	//   73  137:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   74  140:pop             
		((StringBuilder) (s)).append(((String) (datalayer)));
	//   75  141:aload_3         
	//   76  142:aload_2         
	//   77  143:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   78  146:pop             
		zzdi.e(((StringBuilder) (s)).toString());
	//   79  147:aload_3         
	//   80  148:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   81  151:invokestatic    #110 <Method void zzdi.e(String)>
		if(zzo1.zzqf != null)
	//*  82  154:aload           6
	//*  83  156:getfield        #114 <Field com.google.android.gms.internal.measurement.zzn[] zzo.zzqf>
	//*  84  159:ifnull          218
		{
			context = ((Context) (zzo1.zzqf));
	//   85  162:aload           6
	//   86  164:getfield        #114 <Field com.google.android.gms.internal.measurement.zzn[] zzo.zzqf>
	//   87  167:astore_1        
			datalayer = ((DataLayer) (new ArrayList()));
	//   88  168:new             #116 <Class ArrayList>
	//   89  171:dup             
	//   90  172:invokespecial   #117 <Method void ArrayList()>
	//   91  175:astore_2        
			int j = context.length;
	//   92  176:aload_1         
	//   93  177:arraylength     
	//   94  178:istore          8
			for(int i = 0; i < j; i++)
	//*  95  180:iconst_0        
	//*  96  181:istore          7
	//*  97  183:iload           7
	//*  98  185:iload           8
	//*  99  187:icmpge          210
				((List) (datalayer)).add(((Object) (context[i])));
	//  100  190:aload_2         
	//  101  191:aload_1         
	//  102  192:iload           7
	//  103  194:aaload          
	//  104  195:invokeinterface #123 <Method boolean List.add(Object)>
	//  105  200:pop             

	//  106  201:iload           7
	//  107  203:iconst_1        
	//  108  204:iadd            
	//  109  205:istore          7
	//* 110  207:goto            183
			zznp().zzg(((List) (datalayer)));
	//  111  210:aload_0         
	//  112  211:invokespecial   #127 <Method zzfb zznp()>
	//  113  214:aload_2         
	//  114  215:invokevirtual   #133 <Method void zzfb.zzg(List)>
		}
		return;
	//  115  218:return          
	}

	Container(Context context, DataLayer datalayer, String s, long l, zzrk zzrk1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzazt = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #42  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void HashMap()>
	//    6   12:putfield        #45  <Field Map zzazt>
		zzazu = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #42  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #43  <Method void HashMap()>
	//   11   23:putfield        #47  <Field Map zzazu>
		zzazw = "";
	//   12   26:aload_0         
	//   13   27:ldc1            #49  <String "">
	//   14   29:putfield        #51  <Field String zzazw>
		zzri = context;
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:putfield        #53  <Field Context zzri>
		zzazr = datalayer;
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:putfield        #55  <Field DataLayer zzazr>
		zzazq = s;
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:putfield        #57  <Field String zzazq>
		zzazv = 0L;
	//   24   47:aload_0         
	//   25   48:lconst_0        
	//   26   49:putfield        #59  <Field long zzazv>
		zza(zzrk1);
	//   27   52:aload_0         
	//   28   53:aload           6
	//   29   55:invokespecial   #76  <Method void zza(zzrk)>
	//   30   58:return          
	}

	private final void zza(zzrk zzrk1)
	{
		zzazw = zzrk1.getVersion();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method String zzrk.getVersion()>
	//    3    5:putfield        #51  <Field String zzazw>
		Object obj = ((Object) (zzazw));
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field String zzazw>
	//    6   12:astore_2        
		zzeh.zzpm().zzpn().equals(((Object) (zzeh.zza.zzbei)));
	//    7   13:invokestatic    #146 <Method zzeh zzeh.zzpm()>
	//    8   16:invokevirtual   #150 <Method zzeh$zza zzeh.zzpn()>
	//    9   19:getstatic       #156 <Field zzeh$zza zzeh$zza.zzbei>
	//   10   22:invokevirtual   #159 <Method boolean zzeh$zza.equals(Object)>
	//   11   25:pop             
		obj = ((Object) (new zzdq()));
	//   12   26:new             #161 <Class zzdq>
	//   13   29:dup             
	//   14   30:invokespecial   #162 <Method void zzdq()>
	//   15   33:astore_2        
		zza(new zzfb(zzri, zzrk1, zzazr, ((zzan) (new zza(((zzu) (null))))), ((zzan) (new zzb(((zzu) (null))))), ((zzbo) (obj))));
	//   16   34:aload_0         
	//   17   35:new             #129 <Class zzfb>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #53  <Field Context zzri>
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #55  <Field DataLayer zzazr>
	//   24   48:new             #12  <Class Container$zza>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:invokespecial   #165 <Method void Container$zza(Container, zzu)>
	//   29   57:new             #15  <Class Container$zzb>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:aconst_null     
	//   33   63:invokespecial   #166 <Method void Container$zzb(Container, zzu)>
	//   34   66:aload_2         
	//   35   67:invokespecial   #169 <Method void zzfb(Context, zzrk, DataLayer, zzan, zzan, zzbo)>
	//   36   70:invokespecial   #172 <Method void zza(zzfb)>
		if(getBoolean("_gtm.loadEventEnabled"))
	//*  37   73:aload_0         
	//*  38   74:ldc1            #174 <String "_gtm.loadEventEnabled">
	//*  39   76:invokevirtual   #178 <Method boolean getBoolean(String)>
	//*  40   79:ifeq            110
			zzazr.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
				"gtm.id", zzazq
			}));
	//   41   82:aload_0         
	//   42   83:getfield        #55  <Field DataLayer zzazr>
	//   43   86:ldc1            #180 <String "gtm.load">
	//   44   88:iconst_2        
	//   45   89:anewarray       Object[]
	//   46   92:dup             
	//   47   93:iconst_0        
	//   48   94:ldc1            #182 <String "gtm.id">
	//   49   96:aastore         
	//   50   97:dup             
	//   51   98:iconst_1        
	//   52   99:aload_0         
	//   53  100:getfield        #57  <Field String zzazq>
	//   54  103:aastore         
	//   55  104:invokestatic    #188 <Method Map DataLayer.mapOf(Object[])>
	//   56  107:invokevirtual   #192 <Method void DataLayer.pushEvent(String, Map)>
	//   57  110:return          
	}

	private final void zza(zzfb zzfb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzazs = zzfb1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #194 <Field zzfb zzazs>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		zzfb1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw zzfb1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private final zzfb zznp()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzfb zzfb1 = zzazs;
	//    2    2:aload_0         
	//    3    3:getfield        #194 <Field zzfb zzazs>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzfb1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public boolean getBoolean(String s)
	{
		zzfb zzfb1 = zznp();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method zzfb zznp()>
	//    2    4:astore_3        
		if(zzfb1 != null) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:ifnonnull       23
_L1:
		s = "getBoolean called for closed container.";
	//    5    9:ldc1            #198 <String "getBoolean called for closed container.">
	//    6   11:astore_1        
_L4:
		zzdi.e(s);
	//    7   12:aload_1         
	//    8   13:invokestatic    #110 <Method void zzdi.e(String)>
		return zzgj.zzqn().booleanValue();
	//    9   16:invokestatic    #204 <Method Boolean zzgj.zzqn()>
	//   10   19:invokevirtual   #210 <Method boolean Boolean.booleanValue()>
	//   11   22:ireturn         
_L2:
		boolean flag = zzgj.zzg((zzp)zzfb1.zzdz(s).getObject()).booleanValue();
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #214 <Method zzdz zzfb.zzdz(String)>
	//   15   28:invokevirtual   #220 <Method Object zzdz.getObject()>
	//   16   31:checkcast       #222 <Class zzp>
	//   17   34:invokestatic    #225 <Method Boolean zzgj.zzg(zzp)>
	//   18   37:invokevirtual   #210 <Method boolean Boolean.booleanValue()>
	//   19   40:istore_2        
		return flag;
	//   20   41:iload_2         
	//   21   42:ireturn         
		s;
	//   22   43:astore_1        
		s = ((Exception) (s)).getMessage();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #228 <Method String Exception.getMessage()>
	//   25   48:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 66);
	//   26   49:new             #88  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:aload_1         
	//   29   54:invokestatic    #82  <Method String String.valueOf(Object)>
	//   30   57:invokevirtual   #92  <Method int String.length()>
	//   31   60:bipush          66
	//   32   62:iadd            
	//   33   63:invokespecial   #95  <Method void StringBuilder(int)>
	//   34   66:astore_3        
		stringbuilder.append("Calling getBoolean() threw an exception: ");
	//   35   67:aload_3         
	//   36   68:ldc1            #230 <String "Calling getBoolean() threw an exception: ">
	//   37   70:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
		stringbuilder.append(s);
	//   39   74:aload_3         
	//   40   75:aload_1         
	//   41   76:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
		stringbuilder.append(" Returning default value.");
	//   43   80:aload_3         
	//   44   81:ldc1            #232 <String " Returning default value.">
	//   45   83:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
		s = stringbuilder.toString();
	//   47   87:aload_3         
	//   48   88:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   49   91:astore_1        
		if(true) goto _L4; else goto _L3
	//   50   92:goto            12
_L3:
	}

	public String getContainerId()
	{
		return zzazq;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String zzazq>
	//    2    4:areturn         
	}

	public double getDouble(String s)
	{
		zzfb zzfb1 = zznp();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method zzfb zznp()>
	//    2    4:astore          4
		if(zzfb1 != null) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:ifnonnull       25
_L1:
		s = "getDouble called for closed container.";
	//    5   11:ldc1            #237 <String "getDouble called for closed container.">
	//    6   13:astore_1        
_L4:
		zzdi.e(s);
	//    7   14:aload_1         
	//    8   15:invokestatic    #110 <Method void zzdi.e(String)>
		return zzgj.zzqm().doubleValue();
	//    9   18:invokestatic    #241 <Method Double zzgj.zzqm()>
	//   10   21:invokevirtual   #247 <Method double Double.doubleValue()>
	//   11   24:dreturn         
_L2:
		double d = zzgj.zzf((zzp)zzfb1.zzdz(s).getObject()).doubleValue();
	//   12   25:aload           4
	//   13   27:aload_1         
	//   14   28:invokevirtual   #214 <Method zzdz zzfb.zzdz(String)>
	//   15   31:invokevirtual   #220 <Method Object zzdz.getObject()>
	//   16   34:checkcast       #222 <Class zzp>
	//   17   37:invokestatic    #251 <Method Double zzgj.zzf(zzp)>
	//   18   40:invokevirtual   #247 <Method double Double.doubleValue()>
	//   19   43:dstore_2        
		return d;
	//   20   44:dload_2         
	//   21   45:dreturn         
		s;
	//   22   46:astore_1        
		s = ((Exception) (s)).getMessage();
	//   23   47:aload_1         
	//   24   48:invokevirtual   #228 <Method String Exception.getMessage()>
	//   25   51:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   26   52:new             #88  <Class StringBuilder>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:invokestatic    #82  <Method String String.valueOf(Object)>
	//   30   60:invokevirtual   #92  <Method int String.length()>
	//   31   63:bipush          65
	//   32   65:iadd            
	//   33   66:invokespecial   #95  <Method void StringBuilder(int)>
	//   34   69:astore          4
		stringbuilder.append("Calling getDouble() threw an exception: ");
	//   35   71:aload           4
	//   36   73:ldc1            #253 <String "Calling getDouble() threw an exception: ">
	//   37   75:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		stringbuilder.append(s);
	//   39   79:aload           4
	//   40   81:aload_1         
	//   41   82:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
		stringbuilder.append(" Returning default value.");
	//   43   86:aload           4
	//   44   88:ldc1            #232 <String " Returning default value.">
	//   45   90:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   46   93:pop             
		s = stringbuilder.toString();
	//   47   94:aload           4
	//   48   96:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   49   99:astore_1        
		if(true) goto _L4; else goto _L3
	//   50  100:goto            14
_L3:
	}

	public long getLastRefreshTime()
	{
		return zzazv;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field long zzazv>
	//    2    4:lreturn         
	}

	public long getLong(String s)
	{
		zzfb zzfb1 = zznp();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method zzfb zznp()>
	//    2    4:astore          4
		if(zzfb1 != null) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:ifnonnull       26
_L1:
		s = "getLong called for closed container.";
	//    5   11:ldc2            #259 <String "getLong called for closed container.">
	//    6   14:astore_1        
_L4:
		zzdi.e(s);
	//    7   15:aload_1         
	//    8   16:invokestatic    #110 <Method void zzdi.e(String)>
		return zzgj.zzql().longValue();
	//    9   19:invokestatic    #263 <Method Long zzgj.zzql()>
	//   10   22:invokevirtual   #268 <Method long Long.longValue()>
	//   11   25:lreturn         
_L2:
		long l = zzgj.zze((zzp)zzfb1.zzdz(s).getObject()).longValue();
	//   12   26:aload           4
	//   13   28:aload_1         
	//   14   29:invokevirtual   #214 <Method zzdz zzfb.zzdz(String)>
	//   15   32:invokevirtual   #220 <Method Object zzdz.getObject()>
	//   16   35:checkcast       #222 <Class zzp>
	//   17   38:invokestatic    #272 <Method Long zzgj.zze(zzp)>
	//   18   41:invokevirtual   #268 <Method long Long.longValue()>
	//   19   44:lstore_2        
		return l;
	//   20   45:lload_2         
	//   21   46:lreturn         
		s;
	//   22   47:astore_1        
		s = ((Exception) (s)).getMessage();
	//   23   48:aload_1         
	//   24   49:invokevirtual   #228 <Method String Exception.getMessage()>
	//   25   52:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 63);
	//   26   53:new             #88  <Class StringBuilder>
	//   27   56:dup             
	//   28   57:aload_1         
	//   29   58:invokestatic    #82  <Method String String.valueOf(Object)>
	//   30   61:invokevirtual   #92  <Method int String.length()>
	//   31   64:bipush          63
	//   32   66:iadd            
	//   33   67:invokespecial   #95  <Method void StringBuilder(int)>
	//   34   70:astore          4
		stringbuilder.append("Calling getLong() threw an exception: ");
	//   35   72:aload           4
	//   36   74:ldc2            #274 <String "Calling getLong() threw an exception: ">
	//   37   77:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
		stringbuilder.append(s);
	//   39   81:aload           4
	//   40   83:aload_1         
	//   41   84:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
		stringbuilder.append(" Returning default value.");
	//   43   88:aload           4
	//   44   90:ldc1            #232 <String " Returning default value.">
	//   45   92:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   46   95:pop             
		s = stringbuilder.toString();
	//   47   96:aload           4
	//   48   98:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   49  101:astore_1        
		if(true) goto _L4; else goto _L3
	//   50  102:goto            15
_L3:
	}

	public String getString(String s)
	{
		zzfb zzfb1 = zznp();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method zzfb zznp()>
	//    2    4:astore_2        
		if(zzfb1 != null) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnonnull       21
_L1:
		s = "getString called for closed container.";
	//    5    9:ldc2            #278 <String "getString called for closed container.">
	//    6   12:astore_1        
_L4:
		zzdi.e(s);
	//    7   13:aload_1         
	//    8   14:invokestatic    #110 <Method void zzdi.e(String)>
		return zzgj.zzqp();
	//    9   17:invokestatic    #281 <Method String zzgj.zzqp()>
	//   10   20:areturn         
_L2:
		s = zzgj.zzc((zzp)zzfb1.zzdz(s).getObject());
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #214 <Method zzdz zzfb.zzdz(String)>
	//   14   26:invokevirtual   #220 <Method Object zzdz.getObject()>
	//   15   29:checkcast       #222 <Class zzp>
	//   16   32:invokestatic    #285 <Method String zzgj.zzc(zzp)>
	//   17   35:astore_1        
		return s;
	//   18   36:aload_1         
	//   19   37:areturn         
		s;
	//   20   38:astore_1        
		s = ((Exception) (s)).getMessage();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #228 <Method String Exception.getMessage()>
	//   23   43:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   24   44:new             #88  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:aload_1         
	//   27   49:invokestatic    #82  <Method String String.valueOf(Object)>
	//   28   52:invokevirtual   #92  <Method int String.length()>
	//   29   55:bipush          65
	//   30   57:iadd            
	//   31   58:invokespecial   #95  <Method void StringBuilder(int)>
	//   32   61:astore_2        
		stringbuilder.append("Calling getString() threw an exception: ");
	//   33   62:aload_2         
	//   34   63:ldc2            #287 <String "Calling getString() threw an exception: ">
	//   35   66:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		stringbuilder.append(s);
	//   37   70:aload_2         
	//   38   71:aload_1         
	//   39   72:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
		stringbuilder.append(" Returning default value.");
	//   41   76:aload_2         
	//   42   77:ldc1            #232 <String " Returning default value.">
	//   43   79:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		s = stringbuilder.toString();
	//   45   83:aload_2         
	//   46   84:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   47   87:astore_1        
		if(true) goto _L4; else goto _L3
	//   48   88:goto            13
_L3:
	}

	public boolean isDefault()
	{
		return getLastRefreshTime() == 0L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method long getLastRefreshTime()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
	{
		if(functioncallmacrocallback == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new NullPointerException("Macro handler must be non-null");
	//    2    4:new             #67  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #294 <String "Macro handler must be non-null">
	//    5   11:invokespecial   #296 <Method void NullPointerException(String)>
	//    6   14:athrow          
		synchronized(zzazt)
	//*   7   15:aload_0         
	//*   8   16:getfield        #45  <Field Map zzazt>
	//*   9   19:astore_3        
	//*  10   20:aload_3         
	//*  11   21:monitorenter    
		{
			zzazt.put(((Object) (s)), ((Object) (functioncallmacrocallback)));
	//   12   22:aload_0         
	//   13   23:getfield        #45  <Field Map zzazt>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//   17   33:pop             
		}
	//   18   34:aload_3         
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		s;
	//   21   37:astore_1        
		map;
	//   22   38:aload_3         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw s;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void registerFunctionCallTagCallback(String s, FunctionCallTagCallback functioncalltagcallback)
	{
		if(functioncalltagcallback == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new NullPointerException("Tag callback must be non-null");
	//    2    4:new             #67  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #306 <String "Tag callback must be non-null">
	//    5   11:invokespecial   #296 <Method void NullPointerException(String)>
	//    6   14:athrow          
		synchronized(zzazu)
	//*   7   15:aload_0         
	//*   8   16:getfield        #47  <Field Map zzazu>
	//*   9   19:astore_3        
	//*  10   20:aload_3         
	//*  11   21:monitorenter    
		{
			zzazu.put(((Object) (s)), ((Object) (functioncalltagcallback)));
	//   12   22:aload_0         
	//   13   23:getfield        #47  <Field Map zzazu>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//   17   33:pop             
		}
	//   18   34:aload_3         
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		s;
	//   21   37:astore_1        
		map;
	//   22   38:aload_3         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw s;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	final void release()
	{
		zzazs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #194 <Field zzfb zzazs>
	//    3    5:return          
	}

	public void unregisterFunctionCallMacroCallback(String s)
	{
		synchronized(zzazt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Map zzazt>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzazt.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field Map zzazt>
	//    7   11:aload_1         
	//    8   12:invokeinterface #312 <Method Object Map.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s;
	//   13   21:astore_1        
		map;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void unregisterFunctionCallTagCallback(String s)
	{
		synchronized(zzazu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Map zzazu>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzazu.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field Map zzazu>
	//    7   11:aload_1         
	//    8   12:invokeinterface #312 <Method Object Map.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s;
	//   13   21:astore_1        
		map;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	final FunctionCallMacroCallback zzdc(String s)
	{
		synchronized(zzazt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Map zzazt>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			s = ((String) ((FunctionCallMacroCallback)zzazt.get(((Object) (s)))));
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field Map zzazt>
	//    7   11:aload_1         
	//    8   12:invokeinterface #318 <Method Object Map.get(Object)>
	//    9   17:checkcast       #6   <Class Container$FunctionCallMacroCallback>
	//   10   20:astore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return ((FunctionCallMacroCallback) (s));
	//   13   23:aload_1         
	//   14   24:areturn         
		s;
	//   15   25:astore_1        
		map;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw s;
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public final FunctionCallTagCallback zzdd(String s)
	{
		synchronized(zzazu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Map zzazu>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			s = ((String) ((FunctionCallTagCallback)zzazu.get(((Object) (s)))));
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field Map zzazu>
	//    7   11:aload_1         
	//    8   12:invokeinterface #318 <Method Object Map.get(Object)>
	//    9   17:checkcast       #9   <Class Container$FunctionCallTagCallback>
	//   10   20:astore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return ((FunctionCallTagCallback) (s));
	//   13   23:aload_1         
	//   14   24:areturn         
		s;
	//   15   25:astore_1        
		map;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw s;
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public final void zzde(String s)
	{
		zznp().zzde(s);
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method zzfb zznp()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #324 <Method void zzfb.zzde(String)>
	//    4    8:return          
	}

	public final String zzno()
	{
		return zzazw;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String zzazw>
	//    2    4:areturn         
	}

	private final String zzazq;
	private final DataLayer zzazr;
	private zzfb zzazs;
	private Map zzazt;
	private Map zzazu;
	private volatile long zzazv;
	private volatile String zzazw;
	private final Context zzri;
}
