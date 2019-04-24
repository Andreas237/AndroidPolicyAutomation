// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznv, zzajm, zznn, zznr

public final class zznx
{

	public zznx(boolean flag, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void LinkedList()>
	//    6   12:putfield        #32  <Field List zzbgo>
	//    7   15:aload_0         
	//    8   16:new             #34  <Class LinkedHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void LinkedHashMap()>
	//   11   23:putfield        #37  <Field Map zzbgp>
	//   12   26:aload_0         
	//   13   27:new             #4   <Class Object>
	//   14   30:dup             
	//   15   31:invokespecial   #27  <Method void Object()>
	//   16   34:putfield        #39  <Field Object mLock>
		zzbgn = flag;
	//   17   37:aload_0         
	//   18   38:iload_1         
	//   19   39:putfield        #41  <Field boolean zzbgn>
		zzbgp.put("action", ((Object) (s)));
	//   20   42:aload_0         
	//   21   43:getfield        #37  <Field Map zzbgp>
	//   22   46:ldc1            #43  <String "action">
	//   23   48:aload_2         
	//   24   49:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   25   54:pop             
		zzbgp.put("ad_format", ((Object) (s1)));
	//   26   55:aload_0         
	//   27   56:getfield        #37  <Field Map zzbgp>
	//   28   59:ldc1            #51  <String "ad_format">
	//   29   61:aload_3         
	//   30   62:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   31   67:pop             
	//   32   68:return          
	}

	public final transient boolean zza(zznv zznv1, long l, String as[])
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object mLock>
	//    2    4:astore          7
		obj;
	//    3    6:aload           7
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j = as.length;
	//    5    9:aload           4
	//    6   11:arraylength     
	//    7   12:istore          6
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore          5
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   10   17:iload           5
	//   11   19:iload           6
	//   12   21:icmpge          61
		zznv zznv2 = new zznv(l, as[i], zznv1);
	//   13   24:new             #56  <Class zznv>
	//   14   27:dup             
	//   15   28:lload_2         
	//   16   29:aload           4
	//   17   31:iload           5
	//   18   33:aaload          
	//   19   34:aload_1         
	//   20   35:invokespecial   #59  <Method void zznv(long, String, zznv)>
	//   21   38:astore          8
		zzbgo.add(((Object) (zznv2)));
	//   22   40:aload_0         
	//   23   41:getfield        #32  <Field List zzbgo>
	//   24   44:aload           8
	//   25   46:invokeinterface #65  <Method boolean List.add(Object)>
	//   26   51:pop             
		i++;
	//   27   52:iload           5
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore          5
		if(true) goto _L2; else goto _L1
	//   31   58:goto            17
_L1:
		obj;
	//   32   61:aload           7
		JVM INSTR monitorexit ;
	//   33   63:monitorexit     
		return true;
	//   34   64:iconst_1        
	//   35   65:ireturn         
		zznv1;
	//   36   66:astore_1        
		obj;
	//   37   67:aload           7
		JVM INSTR monitorexit ;
	//   38   69:monitorexit     
		throw zznv1;
	//   39   70:aload_1         
	//   40   71:athrow          
	}

	public final transient boolean zza(zznv zznv1, String as[])
	{
		if(zzbgn && zznv1 != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean zzbgn>
	//*   2    4:ifeq            29
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            29
			return zza(zznv1, zzbv.zzer().elapsedRealtime(), as);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #72  <Method Clock zzbv.zzer()>
	//    9   19:invokeinterface #78  <Method long Clock.elapsedRealtime()>
	//   10   24:aload_2         
	//   11   25:invokevirtual   #80  <Method boolean zza(zznv, long, String[])>
	//   12   28:ireturn         
		else
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public final void zzan(String s)
	{
		if(!zzbgn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean zzbgn>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		synchronized(mLock)
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field Object mLock>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:monitorenter    
		{
			zzbgq = s;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #85  <Field String zzbgq>
		}
	//   12   20:aload_2         
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		s;
	//   15   23:astore_1        
		obj;
	//   16   24:aload_2         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw s;
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public final void zzc(zznx zznx1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbgr = zznx1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #89  <Field zznx zzbgr>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zznx1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zznx1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final zznv zzd(long l)
	{
		if(!zzbgn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean zzbgn>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return new zznv(l, ((String) (null)), ((zznv) (null)));
	//    5    9:new             #56  <Class zznv>
	//    6   12:dup             
	//    7   13:lload_1         
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokespecial   #59  <Method void zznv(long, String, zznv)>
	//   11   19:areturn         
	}

	public final void zze(String s, String s1)
	{
		if(zzbgn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean zzbgn>
	//*   2    4:ifeq            84
		{
			if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			Object obj1 = ((Object) (zzbv.zzeo().zzpy()));
	//    7   15:invokestatic    #104 <Method zzajm zzbv.zzeo()>
	//    8   18:invokevirtual   #110 <Method zznn zzajm.zzpy()>
	//    9   21:astore          4
			if(obj1 == null)
	//*  10   23:aload           4
	//*  11   25:ifnonnull       29
				return;
	//   12   28:return          
			synchronized(mLock)
	//*  13   29:aload_0         
	//*  14   30:getfield        #39  <Field Object mLock>
	//*  15   33:astore_3        
	//*  16   34:aload_3         
	//*  17   35:monitorenter    
			{
				obj1 = ((Object) (((zznn) (obj1)).zzal(s)));
	//   18   36:aload           4
	//   19   38:aload_1         
	//   20   39:invokevirtual   #116 <Method zznr zznn.zzal(String)>
	//   21   42:astore          4
				Map map = zzbgp;
	//   22   44:aload_0         
	//   23   45:getfield        #37  <Field Map zzbgp>
	//   24   48:astore          5
				map.put(((Object) (s)), ((Object) (((zznr) (obj1)).zzd((String)map.get(((Object) (s))), s1))));
	//   25   50:aload           5
	//   26   52:aload_1         
	//   27   53:aload           4
	//   28   55:aload           5
	//   29   57:aload_1         
	//   30   58:invokeinterface #120 <Method Object Map.get(Object)>
	//   31   63:checkcast       #122 <Class String>
	//   32   66:aload_2         
	//   33   67:invokevirtual   #127 <Method String zznr.zzd(String, String)>
	//   34   70:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   35   75:pop             
			}
	//   36   76:aload_3         
	//   37   77:monitorexit     
			return;
	//   38   78:return          
		} else
	//*  39   79:astore_1        
	//*  40   80:aload_3         
	//*  41   81:monitorexit     
	//*  42   82:aload_1         
	//*  43   83:athrow          
		{
			return;
	//   44   84:return          
		}
		s;
		obj;
		JVM INSTR monitorexit ;
		throw s;
	}

	public final zznv zzjj()
	{
		return zzd(zzbv.zzer().elapsedRealtime());
	//    0    0:aload_0         
	//    1    1:invokestatic    #72  <Method Clock zzbv.zzer()>
	//    2    4:invokeinterface #78  <Method long Clock.elapsedRealtime()>
	//    3    9:invokevirtual   #131 <Method zznv zzd(long)>
	//    4   12:areturn         
	}

	public final String zzjk()
	{
		Object obj1 = ((Object) (new StringBuilder()));
	//    0    0:new             #135 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void StringBuilder()>
	//    3    7:astore          6
		Object obj = mLock;
	//    4    9:aload_0         
	//    5   10:getfield        #39  <Field Object mLock>
	//    6   13:astore          5
		obj;
	//    7   15:aload           5
		JVM INSTR monitorenter ;
	//    8   17:monitorenter    
		Iterator iterator = zzbgo.iterator();
	//    9   18:aload_0         
	//   10   19:getfield        #32  <Field List zzbgo>
	//   11   22:invokeinterface #140 <Method Iterator List.iterator()>
	//   12   27:astore          7
_L2:
		long l;
		String s;
		zznv zznv1;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_124;
	//   13   29:aload           7
	//   14   31:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            124
			zznv1 = (zznv)iterator.next();
	//   16   39:aload           7
	//   17   41:invokeinterface #150 <Method Object Iterator.next()>
	//   18   46:checkcast       #56  <Class zznv>
	//   19   49:astore          9
			l = zznv1.getTime();
	//   20   51:aload           9
	//   21   53:invokevirtual   #153 <Method long zznv.getTime()>
	//   22   56:lstore_1        
			s = zznv1.zzjg();
	//   23   57:aload           9
	//   24   59:invokevirtual   #156 <Method String zznv.zzjg()>
	//   25   62:astore          8
			zznv1 = zznv1.zzjh();
	//   26   64:aload           9
	//   27   66:invokevirtual   #159 <Method zznv zznv.zzjh()>
	//   28   69:astore          9
		} while(zznv1 == null || l <= 0L);
	//   29   71:aload           9
	//   30   73:ifnull          29
	//   31   76:lload_1         
	//   32   77:lconst_0        
	//   33   78:lcmp            
	//   34   79:ifle            29
		long l1 = zznv1.getTime();
	//   35   82:aload           9
	//   36   84:invokevirtual   #153 <Method long zznv.getTime()>
	//   37   87:lstore_3        
		((StringBuilder) (obj1)).append(s);
	//   38   88:aload           6
	//   39   90:aload           8
	//   40   92:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   41   95:pop             
		((StringBuilder) (obj1)).append('.');
	//   42   96:aload           6
	//   43   98:bipush          46
	//   44  100:invokevirtual   #166 <Method StringBuilder StringBuilder.append(char)>
	//   45  103:pop             
		((StringBuilder) (obj1)).append(l - l1);
	//   46  104:aload           6
	//   47  106:lload_1         
	//   48  107:lload_3         
	//   49  108:lsub            
	//   50  109:invokevirtual   #169 <Method StringBuilder StringBuilder.append(long)>
	//   51  112:pop             
		((StringBuilder) (obj1)).append(',');
	//   52  113:aload           6
	//   53  115:bipush          44
	//   54  117:invokevirtual   #166 <Method StringBuilder StringBuilder.append(char)>
	//   55  120:pop             
		if(true) goto _L2; else goto _L1
	//   56  121:goto            29
_L1:
		zzbgo.clear();
	//   57  124:aload_0         
	//   58  125:getfield        #32  <Field List zzbgo>
	//   59  128:invokeinterface #172 <Method void List.clear()>
		if(!TextUtils.isEmpty(((CharSequence) (zzbgq))))
	//*  60  133:aload_0         
	//*  61  134:getfield        #85  <Field String zzbgq>
	//*  62  137:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  140:ifne            156
		{
			((StringBuilder) (obj1)).append(zzbgq);
	//   64  143:aload           6
	//   65  145:aload_0         
	//   66  146:getfield        #85  <Field String zzbgq>
	//   67  149:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   68  152:pop             
			break MISSING_BLOCK_LABEL_176;
	//   69  153:goto            176
		}
		if(((StringBuilder) (obj1)).length() > 0)
	//*  70  156:aload           6
	//*  71  158:invokevirtual   #176 <Method int StringBuilder.length()>
	//*  72  161:ifle            176
			((StringBuilder) (obj1)).setLength(((StringBuilder) (obj1)).length() - 1);
	//   73  164:aload           6
	//   74  166:aload           6
	//   75  168:invokevirtual   #176 <Method int StringBuilder.length()>
	//   76  171:iconst_1        
	//   77  172:isub            
	//   78  173:invokevirtual   #180 <Method void StringBuilder.setLength(int)>
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   79  176:aload           6
	//   80  178:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   81  181:astore          6
		obj;
	//   82  183:aload           5
		JVM INSTR monitorexit ;
	//   83  185:monitorexit     
		return ((String) (obj1));
	//   84  186:aload           6
	//   85  188:areturn         
		Exception exception;
		exception;
	//   86  189:astore          6
		obj;
	//   87  191:aload           5
		JVM INSTR monitorexit ;
	//   88  193:monitorexit     
		throw exception;
	//   89  194:aload           6
	//   90  196:athrow          
	}

	final Map zzjl()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (zzbv.zzeo().zzpy()));
	//    5    7:invokestatic    #104 <Method zzajm zzbv.zzeo()>
	//    6   10:invokevirtual   #110 <Method zznn zzajm.zzpy()>
	//    7   13:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_48;
	//    8   14:aload_2         
	//    9   15:ifnull          48
		if(zzbgr == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #89  <Field zznx zzbgr>
	//*  12   22:ifnonnull       28
			break MISSING_BLOCK_LABEL_48;
	//   13   25:goto            48
		obj1 = ((Object) (((zznn) (obj1)).zza(zzbgp, zzbgr.zzjl())));
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:getfield        #37  <Field Map zzbgp>
	//   17   33:aload_0         
	//   18   34:getfield        #89  <Field zznx zzbgr>
	//   19   37:invokevirtual   #187 <Method Map zzjl()>
	//   20   40:invokevirtual   #190 <Method Map zznn.zza(Map, Map)>
	//   21   43:astore_2        
		obj;
	//   22   44:aload_1         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		return ((Map) (obj1));
	//   24   46:aload_2         
	//   25   47:areturn         
		obj1 = ((Object) (zzbgp));
	//   26   48:aload_0         
	//   27   49:getfield        #37  <Field Map zzbgp>
	//   28   52:astore_2        
		obj;
	//   29   53:aload_1         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
		return ((Map) (obj1));
	//   31   55:aload_2         
	//   32   56:areturn         
		Exception exception;
		exception;
	//   33   57:astore_2        
		obj;
	//   34   58:aload_1         
		JVM INSTR monitorexit ;
	//   35   59:monitorexit     
		throw exception;
	//   36   60:aload_2         
	//   37   61:athrow          
	}

	public final zznv zzjm()
	{
		synchronized(mLock) { }
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object mLock>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:monitorenter    
	//    5    7:aload_1         
	//    6    8:monitorexit     
		return null;
	//    7    9:aconst_null     
	//    8   10:areturn         
		exception;
	//    9   11:astore_2        
		obj;
	//   10   12:aload_1         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	private final Object mLock = new Object();
	private boolean zzbgn;
	private final List zzbgo = new LinkedList();
	private final Map zzbgp = new LinkedHashMap();
	private String zzbgq;
	private zznx zzbgr;
}
