// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzge, zznk, zzkb, zzni, 
//			zzajm, zzakd, zzakb

public final class zzgf
{

	public zzgf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Object()>
	//    6   12:putfield        #19  <Field Object mLock>
		zzahn = ((List) (new LinkedList()));
	//    7   15:aload_0         
	//    8   16:new             #21  <Class LinkedList>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void LinkedList()>
	//   11   23:putfield        #24  <Field List zzahn>
	//   12   26:return          
	}

	public final boolean zza(zzge zzge1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzahn.contains(((Object) (zzge1))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field List zzahn>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #33  <Method boolean List.contains(Object)>
	//*   9   17:ifeq            24
	//*  10   20:aload_2         
	//*  11   21:monitorexit     
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		obj;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return false;
	//   16   26:iconst_0        
	//   17   27:ireturn         
		zzge1;
	//   18   28:astore_1        
		obj;
	//   19   29:aload_2         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		throw zzge1;
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public final boolean zzb(zzge zzge1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = zzahn.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field List zzahn>
	//    7   11:invokeinterface #38  <Method Iterator List.iterator()>
	//    8   16:astore_3        
_L4:
		zzge zzge2;
		zzna zzna;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_167;
	//    9   17:aload_3         
	//   10   18:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            167
		zzge2 = (zzge)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #48  <Method Object Iterator.next()>
	//   14   32:checkcast       #50  <Class zzge>
	//   15   35:astore          4
		zzna = zznk.zzawq;
	//   16   37:getstatic       #56  <Field zzna zznk.zzawq>
	//   17   40:astore          5
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || zzbv.zzeo().zzqh().zzqu()) goto _L2; else goto _L1
	//   18   42:invokestatic    #62  <Method zzni zzkb.zzik()>
	//   19   45:aload           5
	//   20   47:invokevirtual   #68  <Method Object zzni.zzd(zzna)>
	//   21   50:checkcast       #70  <Class Boolean>
	//   22   53:invokevirtual   #73  <Method boolean Boolean.booleanValue()>
	//   23   56:ifeq            102
	//   24   59:invokestatic    #79  <Method zzajm zzbv.zzeo()>
	//   25   62:invokevirtual   #85  <Method zzakd zzajm.zzqh()>
	//   26   65:invokevirtual   #90  <Method boolean zzakd.zzqu()>
	//   27   68:ifne            102
_L1:
		if(zzge1 == zzge2) goto _L4; else goto _L3
	//   28   71:aload_1         
	//   29   72:aload           4
	//   30   74:if_acmpeq       17
_L3:
		if(!zzge2.getSignature().equals(((Object) (zzge1.getSignature())))) goto _L4; else goto _L5
	//   31   77:aload           4
	//   32   79:invokevirtual   #94  <Method String zzge.getSignature()>
	//   33   82:aload_1         
	//   34   83:invokevirtual   #94  <Method String zzge.getSignature()>
	//   35   86:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   36   89:ifeq            17
_L5:
		iterator.remove();
	//   37   92:aload_3         
	//   38   93:invokeinterface #102 <Method void Iterator.remove()>
		obj;
	//   39   98:aload_2         
		JVM INSTR monitorexit ;
	//   40   99:monitorexit     
		return true;
	//   41  100:iconst_1        
	//   42  101:ireturn         
_L2:
		zzna = zznk.zzaws;
	//   43  102:getstatic       #105 <Field zzna zznk.zzaws>
	//   44  105:astore          5
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || zzbv.zzeo().zzqh().zzqw() || zzge1 == zzge2) goto _L4; else goto _L6
	//   45  107:invokestatic    #62  <Method zzni zzkb.zzik()>
	//   46  110:aload           5
	//   47  112:invokevirtual   #68  <Method Object zzni.zzd(zzna)>
	//   48  115:checkcast       #70  <Class Boolean>
	//   49  118:invokevirtual   #73  <Method boolean Boolean.booleanValue()>
	//   50  121:ifeq            17
	//   51  124:invokestatic    #79  <Method zzajm zzbv.zzeo()>
	//   52  127:invokevirtual   #85  <Method zzakd zzajm.zzqh()>
	//   53  130:invokevirtual   #108 <Method boolean zzakd.zzqw()>
	//   54  133:ifne            17
	//   55  136:aload_1         
	//   56  137:aload           4
	//   57  139:if_acmpeq       17
_L6:
		if(!zzge2.zzgp().equals(((Object) (zzge1.zzgp())))) goto _L4; else goto _L7
	//   58  142:aload           4
	//   59  144:invokevirtual   #111 <Method String zzge.zzgp()>
	//   60  147:aload_1         
	//   61  148:invokevirtual   #111 <Method String zzge.zzgp()>
	//   62  151:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   63  154:ifeq            17
_L7:
		iterator.remove();
	//   64  157:aload_3         
	//   65  158:invokeinterface #102 <Method void Iterator.remove()>
		obj;
	//   66  163:aload_2         
		JVM INSTR monitorexit ;
	//   67  164:monitorexit     
		return true;
	//   68  165:iconst_1        
	//   69  166:ireturn         
		obj;
	//   70  167:aload_2         
		JVM INSTR monitorexit ;
	//   71  168:monitorexit     
		return false;
	//   72  169:iconst_0        
	//   73  170:ireturn         
		zzge1;
	//   74  171:astore_1        
		obj;
	//   75  172:aload_2         
		JVM INSTR monitorexit ;
	//   76  173:monitorexit     
		throw zzge1;
	//   77  174:aload_1         
	//   78  175:athrow          
	}

	public final void zzc(zzge zzge1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			if(zzahn.size() >= 10)
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field List zzahn>
	//*   7   11:invokeinterface #117 <Method int List.size()>
	//*   8   16:bipush          10
	//*   9   18:icmplt          76
			{
				int i = zzahn.size();
	//   10   21:aload_0         
	//   11   22:getfield        #24  <Field List zzahn>
	//   12   25:invokeinterface #117 <Method int List.size()>
	//   13   30:istore_2        
				StringBuilder stringbuilder = new StringBuilder(41);
	//   14   31:new             #119 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:bipush          41
	//   17   37:invokespecial   #122 <Method void StringBuilder(int)>
	//   18   40:astore          4
				stringbuilder.append("Queue is full, current size = ");
	//   19   42:aload           4
	//   20   44:ldc1            #124 <String "Queue is full, current size = ">
	//   21   46:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
				stringbuilder.append(i);
	//   23   50:aload           4
	//   24   52:iload_2         
	//   25   53:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   26   56:pop             
				zzakb.zzck(stringbuilder.toString());
	//   27   57:aload           4
	//   28   59:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #140 <Method void zzakb.zzck(String)>
				zzahn.remove(0);
	//   30   65:aload_0         
	//   31   66:getfield        #24  <Field List zzahn>
	//   32   69:iconst_0        
	//   33   70:invokeinterface #143 <Method Object List.remove(int)>
	//   34   75:pop             
			}
			int j = zzahm;
	//   35   76:aload_0         
	//   36   77:getfield        #145 <Field int zzahm>
	//   37   80:istore_2        
			zzahm = j + 1;
	//   38   81:aload_0         
	//   39   82:iload_2         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:putfield        #145 <Field int zzahm>
			zzge1.zzo(j);
	//   43   88:aload_1         
	//   44   89:iload_2         
	//   45   90:invokevirtual   #148 <Method void zzge.zzo(int)>
			zzahn.add(((Object) (zzge1)));
	//   46   93:aload_0         
	//   47   94:getfield        #24  <Field List zzahn>
	//   48   97:aload_1         
	//   49   98:invokeinterface #151 <Method boolean List.add(Object)>
	//   50  103:pop             
		}
	//   51  104:aload_3         
	//   52  105:monitorexit     
		return;
	//   53  106:return          
		zzge1;
	//   54  107:astore_1        
		obj;
	//   55  108:aload_3         
		JVM INSTR monitorexit ;
	//   56  109:monitorexit     
		throw zzge1;
	//   57  110:aload_1         
	//   58  111:athrow          
	}

	public final zzge zzgv()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mLock>
	//    2    4:astore          8
		obj;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = zzahn.size();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field List zzahn>
	//    7   13:invokeinterface #117 <Method int List.size()>
	//    8   18:istore_1        
		zzge zzge1;
		zzge1 = null;
	//    9   19:aconst_null     
	//   10   20:astore          6
		if(i != 0)
			break MISSING_BLOCK_LABEL_36;
	//   11   22:iload_1         
	//   12   23:ifne            36
		zzakb.zzck("Queue empty");
	//   13   26:ldc1            #156 <String "Queue empty">
	//   14   28:invokestatic    #140 <Method void zzakb.zzck(String)>
		obj;
	//   15   31:aload           8
		JVM INSTR monitorexit ;
	//   16   33:monitorexit     
		return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
		i = zzahn.size();
	//   19   36:aload_0         
	//   20   37:getfield        #24  <Field List zzahn>
	//   21   40:invokeinterface #117 <Method int List.size()>
	//   22   45:istore_1        
		int l = 0;
	//   23   46:iconst_0        
	//   24   47:istore          4
		if(i < 2) goto _L2; else goto _L1
	//   25   49:iload_1         
	//   26   50:iconst_2        
	//   27   51:icmplt          138
_L1:
		int k = 0x80000000;
	//   28   54:ldc1            #157 <Int 0x80000000>
	//   29   56:istore_3        
		Iterator iterator = zzahn.iterator();
	//   30   57:aload_0         
	//   31   58:getfield        #24  <Field List zzahn>
	//   32   61:invokeinterface #38  <Method Iterator List.iterator()>
	//   33   66:astore          9
		i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_1        
_L4:
		int i1;
		zzge zzge2;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_120;
	//   36   70:aload           9
	//   37   72:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//   38   77:ifeq            120
		zzge2 = (zzge)iterator.next();
	//   39   80:aload           9
	//   40   82:invokeinterface #48  <Method Object Iterator.next()>
	//   41   87:checkcast       #50  <Class zzge>
	//   42   90:astore          7
		i1 = zzge2.getScore();
	//   43   92:aload           7
	//   44   94:invokevirtual   #160 <Method int zzge.getScore()>
	//   45   97:istore          5
		int j = k;
	//   46   99:iload_3         
	//   47  100:istore_2        
		Exception exception;
		if(i1 > k)
	//*  48  101:iload           5
	//*  49  103:iload_3         
	//*  50  104:icmple          172
		{
			l = i;
	//   51  107:iload_1         
	//   52  108:istore          4
			zzge1 = zzge2;
	//   53  110:aload           7
	//   54  112:astore          6
			j = i1;
	//   55  114:iload           5
	//   56  116:istore_2        
		}
	//*  57  117:goto            172
	//*  58  120:aload_0         
	//*  59  121:getfield        #24  <Field List zzahn>
	//*  60  124:iload           4
	//*  61  126:invokeinterface #143 <Method Object List.remove(int)>
	//*  62  131:pop             
	//*  63  132:aload           8
	//*  64  134:monitorexit     
	//*  65  135:aload           6
	//*  66  137:areturn         
	//*  67  138:aload_0         
	//*  68  139:getfield        #24  <Field List zzahn>
	//*  69  142:iconst_0        
	//*  70  143:invokeinterface #163 <Method Object List.get(int)>
	//*  71  148:checkcast       #50  <Class zzge>
	//*  72  151:astore          6
	//*  73  153:aload           6
	//*  74  155:invokevirtual   #166 <Method void zzge.zzgq()>
	//*  75  158:aload           8
	//*  76  160:monitorexit     
	//*  77  161:aload           6
	//*  78  163:areturn         
	//*  79  164:astore          6
	//*  80  166:aload           8
	//*  81  168:monitorexit     
	//*  82  169:aload           6
	//*  83  171:athrow          
		i++;
	//   84  172:iload_1         
	//   85  173:iconst_1        
	//   86  174:iadd            
	//   87  175:istore_1        
		k = j;
	//   88  176:iload_2         
	//   89  177:istore_3        
		continue; /* Loop/switch isn't completed */
	//   90  178:goto            70
		zzahn.remove(l);
		obj;
		JVM INSTR monitorexit ;
		return zzge1;
_L2:
		zzge1 = (zzge)zzahn.get(0);
		zzge1.zzgq();
		obj;
		JVM INSTR monitorexit ;
		return zzge1;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
		if(true) goto _L4; else goto _L3
_L3:
	}

	private final Object mLock = new Object();
	private int zzahm;
	private List zzahn;
}
