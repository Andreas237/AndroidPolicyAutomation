// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Predicate;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzaoe, zzut, zzakk

public abstract class zzus
{

	public zzus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashMap()>
	//    6   12:putfield        #22  <Field Map zzbpn>
	//    7   15:return          
	}

	private final void zzb(String s, Map map)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		if(!zzakb.isLoggable(2))
			break MISSING_BLOCK_LABEL_161;
	//    2    2:iconst_2        
	//    3    3:invokestatic    #31  <Method boolean zzakb.isLoggable(int)>
	//    4    6:ifeq            161
		s1 = String.valueOf(((Object) (s)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #37  <Method String String.valueOf(Object)>
	//    7   13:astore_3        
		if(s1.length() != 0)
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #41  <Method int String.length()>
	//*  10   18:ifeq            31
		{
			s1 = "Received GMSG: ".concat(s1);
	//   11   21:ldc1            #43  <String "Received GMSG: ">
	//   12   23:aload_3         
	//   13   24:invokevirtual   #47  <Method String String.concat(String)>
	//   14   27:astore_3        
			break MISSING_BLOCK_LABEL_41;
	//   15   28:goto            41
		}
		s1 = new String("Received GMSG: ");
	//   16   31:new             #33  <Class String>
	//   17   34:dup             
	//   18   35:ldc1            #43  <String "Received GMSG: ">
	//   19   37:invokespecial   #50  <Method void String(String)>
	//   20   40:astore_3        
		zzakb.v(s1);
	//   21   41:aload_3         
	//   22   42:invokestatic    #53  <Method void zzakb.v(String)>
		StringBuilder stringbuilder;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zzakb.v(stringbuilder.toString()))
	//*  23   45:aload_2         
	//*  24   46:invokeinterface #59  <Method Set Map.keySet()>
	//*  25   51:invokeinterface #65  <Method Iterator Set.iterator()>
	//*  26   56:astore_3        
	//*  27   57:aload_3         
	//*  28   58:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  29   63:ifeq            161
		{
			String s2 = (String)iterator.next();
	//   30   66:aload_3         
	//   31   67:invokeinterface #75  <Method Object Iterator.next()>
	//   32   72:checkcast       #33  <Class String>
	//   33   75:astore          4
			String s3 = (String)map.get(((Object) (s2)));
	//   34   77:aload_2         
	//   35   78:aload           4
	//   36   80:invokeinterface #79  <Method Object Map.get(Object)>
	//   37   85:checkcast       #33  <Class String>
	//   38   88:astore          5
			stringbuilder = new StringBuilder(4 + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//   39   90:new             #81  <Class StringBuilder>
	//   40   93:dup             
	//   41   94:iconst_4        
	//   42   95:aload           4
	//   43   97:invokestatic    #37  <Method String String.valueOf(Object)>
	//   44  100:invokevirtual   #41  <Method int String.length()>
	//   45  103:iadd            
	//   46  104:aload           5
	//   47  106:invokestatic    #37  <Method String String.valueOf(Object)>
	//   48  109:invokevirtual   #41  <Method int String.length()>
	//   49  112:iadd            
	//   50  113:invokespecial   #84  <Method void StringBuilder(int)>
	//   51  116:astore          6
			stringbuilder.append("  ");
	//   52  118:aload           6
	//   53  120:ldc1            #86  <String "  ">
	//   54  122:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   55  125:pop             
			stringbuilder.append(s2);
	//   56  126:aload           6
	//   57  128:aload           4
	//   58  130:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   59  133:pop             
			stringbuilder.append(": ");
	//   60  134:aload           6
	//   61  136:ldc1            #92  <String ": ">
	//   62  138:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   63  141:pop             
			stringbuilder.append(s3);
	//   64  142:aload           6
	//   65  144:aload           5
	//   66  146:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   67  149:pop             
		}

	//   68  150:aload           6
	//   69  152:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   70  155:invokestatic    #53  <Method void zzakb.v(String)>
	//*  71  158:goto            57
		s = ((String) ((CopyOnWriteArrayList)zzbpn.get(((Object) (s)))));
	//   72  161:aload_0         
	//   73  162:getfield        #22  <Field Map zzbpn>
	//   74  165:aload_1         
	//   75  166:invokeinterface #79  <Method Object Map.get(Object)>
	//   76  171:checkcast       #98  <Class CopyOnWriteArrayList>
	//   77  174:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_224;
	//   78  175:aload_1         
	//   79  176:ifnull          224
		zzv zzv1;
		for(s = ((String) (((CopyOnWriteArrayList) (s)).iterator())); ((Iterator) (s)).hasNext(); zzaoe.zzcvy.execute(((Runnable) (new zzut(this, zzv1, map)))))
	//*  80  179:aload_1         
	//*  81  180:invokevirtual   #99  <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  82  183:astore_1        
	//*  83  184:aload_1         
	//*  84  185:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  85  190:ifeq            224
			zzv1 = (zzv)((Iterator) (s)).next();
	//   86  193:aload_1         
	//   87  194:invokeinterface #75  <Method Object Iterator.next()>
	//   88  199:checkcast       #101 <Class zzv>
	//   89  202:astore_3        

	//   90  203:getstatic       #107 <Field Executor zzaoe.zzcvy>
	//   91  206:new             #109 <Class zzut>
	//   92  209:dup             
	//   93  210:aload_0         
	//   94  211:aload_3         
	//   95  212:aload_2         
	//   96  213:invokespecial   #112 <Method void zzut(zzus, zzv, Map)>
	//   97  216:invokeinterface #118 <Method void Executor.execute(Runnable)>
	//*  98  221:goto            184
		this;
	//   99  224:aload_0         
		JVM INSTR monitorexit ;
	//  100  225:monitorexit     
		return;
	//  101  226:return          
		s;
	//  102  227:astore_1        
	//* 103  228:aload_0         
		throw s;
	//  104  229:monitorexit     
	//  105  230:aload_1         
	//  106  231:athrow          
	}

	public abstract Object getReference();

	public void reset()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzbpn.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field Map zzbpn>
	//    4    6:invokeinterface #125 <Method void Map.clear()>
		this;
	//    5   11:aload_0         
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		return;
	//    7   13:return          
		Exception exception;
		exception;
	//    8   14:astore_1        
	//*   9   15:aload_0         
		throw exception;
	//   10   16:monitorexit     
	//   11   17:aload_1         
	//   12   18:athrow          
	}

	public final void zza(String s, zzv zzv1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CopyOnWriteArrayList copyonwritearraylist1 = (CopyOnWriteArrayList)zzbpn.get(((Object) (s)));
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field Map zzbpn>
	//    4    6:aload_1         
	//    5    7:invokeinterface #79  <Method Object Map.get(Object)>
	//    6   12:checkcast       #98  <Class CopyOnWriteArrayList>
	//    7   15:astore          4
		CopyOnWriteArrayList copyonwritearraylist;
		copyonwritearraylist = copyonwritearraylist1;
	//    8   17:aload           4
	//    9   19:astore_3        
		if(copyonwritearraylist1 != null)
			break MISSING_BLOCK_LABEL_45;
	//   10   20:aload           4
	//   11   22:ifnonnull       45
		copyonwritearraylist = new CopyOnWriteArrayList();
	//   12   25:new             #98  <Class CopyOnWriteArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #128 <Method void CopyOnWriteArrayList()>
	//   15   32:astore_3        
		zzbpn.put(((Object) (s)), ((Object) (copyonwritearraylist)));
	//   16   33:aload_0         
	//   17   34:getfield        #22  <Field Map zzbpn>
	//   18   37:aload_1         
	//   19   38:aload_3         
	//   20   39:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   21   44:pop             
		copyonwritearraylist.add(((Object) (zzv1)));
	//   22   45:aload_3         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #136 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   25   50:pop             
		this;
	//   26   51:aload_0         
		JVM INSTR monitorexit ;
	//   27   52:monitorexit     
		return;
	//   28   53:return          
		s;
	//   29   54:astore_1        
	//*  30   55:aload_0         
		throw s;
	//   31   56:monitorexit     
	//   32   57:aload_1         
	//   33   58:athrow          
	}

	public final void zza(String s, Predicate predicate)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((CopyOnWriteArrayList)zzbpn.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field Map zzbpn>
	//    4    6:aload_1         
	//    5    7:invokeinterface #79  <Method Object Map.get(Object)>
	//    6   12:checkcast       #98  <Class CopyOnWriteArrayList>
	//    7   15:astore_1        
		if(s != null)
			break MISSING_BLOCK_LABEL_23;
	//    8   16:aload_1         
	//    9   17:ifnonnull       23
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		ArrayList arraylist;
		arraylist = new ArrayList();
	//   13   23:new             #140 <Class ArrayList>
	//   14   26:dup             
	//   15   27:invokespecial   #141 <Method void ArrayList()>
	//   16   30:astore_3        
		Iterator iterator = ((CopyOnWriteArrayList) (s)).iterator();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #99  <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   35:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   37:aload           4
	//   21   39:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            82
			zzv zzv1 = (zzv)iterator.next();
	//   23   47:aload           4
	//   24   49:invokeinterface #75  <Method Object Iterator.next()>
	//   25   54:checkcast       #101 <Class zzv>
	//   26   57:astore          5
			if(predicate.apply(((Object) (zzv1))))
	//*  27   59:aload_2         
	//*  28   60:aload           5
	//*  29   62:invokeinterface #146 <Method boolean Predicate.apply(Object)>
	//*  30   67:ifeq            37
				((List) (arraylist)).add(((Object) (zzv1)));
	//   31   70:aload_3         
	//   32   71:aload           5
	//   33   73:invokeinterface #149 <Method boolean List.add(Object)>
	//   34   78:pop             
		} while(true);
	//   35   79:goto            37
		((CopyOnWriteArrayList) (s)).removeAll(((java.util.Collection) (arraylist)));
	//   36   82:aload_1         
	//   37   83:aload_3         
	//   38   84:invokevirtual   #153 <Method boolean CopyOnWriteArrayList.removeAll(java.util.Collection)>
	//   39   87:pop             
		this;
	//   40   88:aload_0         
		JVM INSTR monitorexit ;
	//   41   89:monitorexit     
		return;
	//   42   90:return          
		s;
	//   43   91:astore_1        
	//*  44   92:aload_0         
		throw s;
	//   45   93:monitorexit     
	//   46   94:aload_1         
	//   47   95:athrow          
	}

	public final void zzb(String s, zzv zzv1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((CopyOnWriteArrayList)zzbpn.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field Map zzbpn>
	//    4    6:aload_1         
	//    5    7:invokeinterface #79  <Method Object Map.get(Object)>
	//    6   12:checkcast       #98  <Class CopyOnWriteArrayList>
	//    7   15:astore_1        
		if(s != null)
			break MISSING_BLOCK_LABEL_23;
	//    8   16:aload_1         
	//    9   17:ifnonnull       23
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		((CopyOnWriteArrayList) (s)).remove(((Object) (zzv1)));
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #157 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   16   28:pop             
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		s;
	//   20   32:astore_1        
	//*  21   33:aload_0         
		throw s;
	//   22   34:monitorexit     
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	public final boolean zzf(Uri uri)
	{
		if("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost()))
	//*   0    0:ldc1            #161 <String "gmsg">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #166 <Method String Uri.getScheme()>
	//*   3    6:invokevirtual   #170 <Method boolean String.equalsIgnoreCase(String)>
	//*   4    9:ifeq            44
	//*   5   12:ldc1            #172 <String "mobileads.google.com">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #175 <Method String Uri.getHost()>
	//*   8   18:invokevirtual   #170 <Method boolean String.equalsIgnoreCase(String)>
	//*   9   21:ifeq            44
		{
			String s = uri.getPath();
	//   10   24:aload_1         
	//   11   25:invokevirtual   #178 <Method String Uri.getPath()>
	//   12   28:astore_2        
			zzbv.zzek();
	//   13   29:invokestatic    #184 <Method zzakk zzbv.zzek()>
	//   14   32:pop             
			zzb(s, zzakk.zzg(uri));
	//   15   33:aload_0         
	//   16   34:aload_2         
	//   17   35:aload_1         
	//   18   36:invokestatic    #190 <Method Map zzakk.zzg(Uri)>
	//   19   39:invokespecial   #192 <Method void zzb(String, Map)>
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	private final Map zzbpn = new HashMap();
}
