// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzbuv, zzbul, zzbut, zzbuw, 
//			zzbum

public class zzbuo
{

	private zzbuo(int i, Class class1, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int type>
		zzciF = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Class zzciF>
		tag = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int tag>
		zzcrY = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field boolean zzcrY>
	//   14   25:return          
	}

	public static zzbuo zza(int i, Class class1, long l)
	{
		return new zzbuo(i, class1, (int)l, false);
	//    0    0:new             #2   <Class zzbuo>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:l2i             
	//    6    8:iconst_0        
	//    7    9:invokespecial   #33  <Method void zzbuo(int, Class, int, boolean)>
	//    8   12:areturn         
	}

	private Object zzaa(List list)
	{
		boolean flag;
		int k;
		ArrayList arraylist;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		arraylist = new ArrayList();
	//    2    2:new             #38  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #39  <Method void ArrayList()>
	//    5    9:astore          6
		for(int i = 0; i < list.size(); i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_1         
	//*  10   15:invokeinterface #45  <Method int List.size()>
	//*  11   20:icmpge          59
		{
			zzbuv zzbuv1 = (zzbuv)list.get(i);
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:invokeinterface #49  <Method Object List.get(int)>
	//   15   30:checkcast       #51  <Class zzbuv>
	//   16   33:astore          5
			if(zzbuv1.zzcsh.length != 0)
	//*  17   35:aload           5
	//*  18   37:getfield        #55  <Field byte[] zzbuv.zzcsh>
	//*  19   40:arraylength     
	//*  20   41:ifeq            52
				zza(zzbuv1, ((List) (arraylist)));
	//   21   44:aload_0         
	//   22   45:aload           5
	//   23   47:aload           6
	//   24   49:invokevirtual   #58  <Method void zza(zzbuv, List)>
		}

	//   25   52:iload_2         
	//   26   53:iconst_1        
	//   27   54:iadd            
	//   28   55:istore_2        
	//*  29   56:goto            13
		k = ((List) (arraylist)).size();
	//   30   59:aload           6
	//   31   61:invokeinterface #45  <Method int List.size()>
	//   32   66:istore          4
		if(k != 0) goto _L2; else goto _L1
	//   33   68:iload           4
	//   34   70:ifne            77
_L1:
		list = null;
	//   35   73:aconst_null     
	//   36   74:astore_1        
_L4:
		return ((Object) (list));
	//   37   75:aload_1         
	//   38   76:areturn         
_L2:
		Object obj = zzciF.cast(Array.newInstance(zzciF.getComponentType(), k));
	//   39   77:aload_0         
	//   40   78:getfield        #22  <Field Class zzciF>
	//   41   81:aload_0         
	//   42   82:getfield        #22  <Field Class zzciF>
	//   43   85:invokevirtual   #64  <Method Class Class.getComponentType()>
	//   44   88:iload           4
	//   45   90:invokestatic    #70  <Method Object Array.newInstance(Class, int)>
	//   46   93:invokevirtual   #74  <Method Object Class.cast(Object)>
	//   47   96:astore          5
		int j = ((int) (flag));
	//   48   98:iload_3         
	//   49   99:istore_2        
		do
		{
			list = ((List) (obj));
	//   50  100:aload           5
	//   51  102:astore_1        
			if(j >= k)
				continue;
	//   52  103:iload_2         
	//   53  104:iload           4
	//   54  106:icmpge          75
			Array.set(obj, j, ((List) (arraylist)).get(j));
	//   55  109:aload           5
	//   56  111:iload_2         
	//   57  112:aload           6
	//   58  114:iload_2         
	//   59  115:invokeinterface #49  <Method Object List.get(int)>
	//   60  120:invokestatic    #78  <Method void Array.set(Object, int, Object)>
			j++;
	//   61  123:iload_2         
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:istore_2        
		} while(true);
	//   65  127:goto            100
		if(true) goto _L4; else goto _L3
_L3:
	}

	private Object zzab(List list)
	{
		if(list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #84  <Method boolean List.isEmpty()>
	//*   2    6:ifeq            11
		{
			return ((Object) (null));
	//    3    9:aconst_null     
	//    4   10:areturn         
		} else
		{
			list = ((List) ((zzbuv)list.get(list.size() - 1)));
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:invokeinterface #45  <Method int List.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:invokeinterface #49  <Method Object List.get(int)>
	//   11   25:checkcast       #51  <Class zzbuv>
	//   12   28:astore_1        
			return zzciF.cast(zzaM(zzbul.zzad(((zzbuv) (list)).zzcsh)));
	//   13   29:aload_0         
	//   14   30:getfield        #22  <Field Class zzciF>
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getfield        #55  <Field byte[] zzbuv.zzcsh>
	//   18   38:invokestatic    #90  <Method zzbul zzbul.zzad(byte[])>
	//   19   41:invokevirtual   #94  <Method Object zzaM(zzbul)>
	//   20   44:invokevirtual   #74  <Method Object Class.cast(Object)>
	//   21   47:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzbuo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbuo>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzbuo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbuo>
	//   12   20:astore_1        
			if(type != ((zzbuo) (obj)).type || zzciF != ((zzbuo) (obj)).zzciF || tag != ((zzbuo) (obj)).tag || zzcrY != ((zzbuo) (obj)).zzcrY)
	//*  13   21:aload_0         
	//*  14   22:getfield        #20  <Field int type>
	//*  15   25:aload_1         
	//*  16   26:getfield        #20  <Field int type>
	//*  17   29:icmpne          65
	//*  18   32:aload_0         
	//*  19   33:getfield        #22  <Field Class zzciF>
	//*  20   36:aload_1         
	//*  21   37:getfield        #22  <Field Class zzciF>
	//*  22   40:if_acmpne       65
	//*  23   43:aload_0         
	//*  24   44:getfield        #24  <Field int tag>
	//*  25   47:aload_1         
	//*  26   48:getfield        #24  <Field int tag>
	//*  27   51:icmpne          65
	//*  28   54:aload_0         
	//*  29   55:getfield        #26  <Field boolean zzcrY>
	//*  30   58:aload_1         
	//*  31   59:getfield        #26  <Field boolean zzcrY>
	//*  32   62:icmpeq          5
				return false;
	//   33   65:iconst_0        
	//   34   66:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		int j = type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int type>
	//    2    4:istore_2        
		int k = ((Object) (zzciF)).hashCode();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Class zzciF>
	//    5    9:invokevirtual   #99  <Method int Object.hashCode()>
	//    6   12:istore_3        
		int l = tag;
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field int tag>
	//    9   17:istore          4
		int i;
		if(zzcrY)
	//*  10   19:aload_0         
	//*  11   20:getfield        #26  <Field boolean zzcrY>
	//*  12   23:ifeq            50
			i = 1;
	//   13   26:iconst_1        
	//   14   27:istore_1        
		else
	//*  15   28:iload_1         
	//*  16   29:iload_2         
	//*  17   30:sipush          1147
	//*  18   33:iadd            
	//*  19   34:bipush          31
	//*  20   36:imul            
	//*  21   37:iload_3         
	//*  22   38:iadd            
	//*  23   39:bipush          31
	//*  24   41:imul            
	//*  25   42:iload           4
	//*  26   44:iadd            
	//*  27   45:bipush          31
	//*  28   47:imul            
	//*  29   48:iadd            
	//*  30   49:ireturn         
			i = 0;
	//   31   50:iconst_0        
	//   32   51:istore_1        
		return i + (((j + 1147) * 31 + k) * 31 + l) * 31;
	//*  33   52:goto            28
	}

	final Object zzZ(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(zzcrY)
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field boolean zzcrY>
	//*   6   10:ifeq            19
			return zzaa(list);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #102 <Method Object zzaa(List)>
	//   10   18:areturn         
		else
			return zzab(list);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #104 <Method Object zzab(List)>
	//   14   24:areturn         
	}

	protected void zza(zzbuv zzbuv1, List list)
	{
		list.add(zzaM(zzbul.zzad(zzbuv1.zzcsh)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:getfield        #55  <Field byte[] zzbuv.zzcsh>
	//    4    6:invokestatic    #90  <Method zzbul zzbul.zzad(byte[])>
	//    5    9:invokevirtual   #94  <Method Object zzaM(zzbul)>
	//    6   12:invokeinterface #107 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	void zza(Object obj, zzbum zzbum1)
		throws IOException
	{
		if(zzcrY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcrY>
	//*   2    4:ifeq            14
		{
			zzc(obj, zzbum1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #114 <Method void zzc(Object, zzbum)>
			return;
	//    7   13:return          
		} else
		{
			zzb(obj, zzbum1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #117 <Method void zzb(Object, zzbum)>
			return;
	//   12   20:return          
		}
	}

	protected Object zzaM(zzbul zzbul1)
	{
		Object obj;
		if(zzcrY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcrY>
	//*   2    4:ifeq            118
			obj = ((Object) (zzciF.getComponentType()));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Class zzciF>
	//    5   11:invokevirtual   #64  <Method Class Class.getComponentType()>
	//    6   14:astore_3        
		else
	//*   7   15:aload_0         
	//*   8   16:getfield        #20  <Field int type>
	//*   9   19:tableswitch     10 11: default 225
	//	               10 126
	//	               11 151
	//*  10   40:aload_0         
	//*  11   41:getfield        #20  <Field int type>
	//*  12   44:istore_2        
	//*  13   45:new             #124 <Class IllegalArgumentException>
	//*  14   48:dup             
	//*  15   49:new             #126 <Class StringBuilder>
	//*  16   52:dup             
	//*  17   53:bipush          24
	//*  18   55:invokespecial   #129 <Method void StringBuilder(int)>
	//*  19   58:ldc1            #131 <String "Unknown type ">
	//*  20   60:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//*  21   63:iload_2         
	//*  22   64:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//*  23   67:invokevirtual   #142 <Method String StringBuilder.toString()>
	//*  24   70:invokespecial   #145 <Method void IllegalArgumentException(String)>
	//*  25   73:athrow          
	//*  26   74:astore_1        
	//*  27   75:aload_3         
	//*  28   76:invokestatic    #151 <Method String String.valueOf(Object)>
	//*  29   79:astore_3        
	//*  30   80:new             #124 <Class IllegalArgumentException>
	//*  31   83:dup             
	//*  32   84:new             #126 <Class StringBuilder>
	//*  33   87:dup             
	//*  34   88:aload_3         
	//*  35   89:invokestatic    #151 <Method String String.valueOf(Object)>
	//*  36   92:invokevirtual   #154 <Method int String.length()>
	//*  37   95:bipush          33
	//*  38   97:iadd            
	//*  39   98:invokespecial   #129 <Method void StringBuilder(int)>
	//*  40  101:ldc1            #156 <String "Error creating instance of class ">
	//*  41  103:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//*  42  106:aload_3         
	//*  43  107:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//*  44  110:invokevirtual   #142 <Method String StringBuilder.toString()>
	//*  45  113:aload_1         
	//*  46  114:invokespecial   #159 <Method void IllegalArgumentException(String, Throwable)>
	//*  47  117:athrow          
			obj = ((Object) (zzciF));
	//   48  118:aload_0         
	//   49  119:getfield        #22  <Field Class zzciF>
	//   50  122:astore_3        
		type;
		JVM INSTR tableswitch 10 11: default 225
	//	               10 126
	//	               11 151;
		   goto _L1 _L2 _L3
_L1:
		int i = type;
		throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
	//*  51  123:goto            15
_L2:
		zzbut zzbut1;
		try
		{
			zzbut1 = (zzbut)((Class) (obj)).newInstance();
	//   52  126:aload_3         
	//   53  127:invokevirtual   #162 <Method Object Class.newInstance()>
	//   54  130:checkcast       #164 <Class zzbut>
	//   55  133:astore          4
			zzbul1.zza(zzbut1, zzbuw.zzqB(tag));
	//   56  135:aload_1         
	//   57  136:aload           4
	//   58  138:aload_0         
	//   59  139:getfield        #24  <Field int tag>
	//   60  142:invokestatic    #170 <Method int zzbuw.zzqB(int)>
	//   61  145:invokevirtual   #173 <Method void zzbul.zza(zzbut, int)>
		}
		// Misplaced declaration of an exception variable
		catch(zzbul zzbul1)
		{
			obj = ((Object) (String.valueOf(obj)));
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), ((Throwable) (zzbul1)));
		}
	//*  62  148:aload           4
	//*  63  150:areturn         
	//*  64  151:aload_3         
	//*  65  152:invokevirtual   #162 <Method Object Class.newInstance()>
	//*  66  155:checkcast       #164 <Class zzbut>
	//*  67  158:astore          4
	//*  68  160:aload_1         
	//*  69  161:aload           4
	//*  70  163:invokevirtual   #176 <Method void zzbul.zza(zzbut)>
	//*  71  166:aload           4
	//*  72  168:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbul zzbul1)
	//*  73  169:astore_1        
		{
			obj = ((Object) (String.valueOf(obj)));
	//   74  170:aload_3         
	//   75  171:invokestatic    #151 <Method String String.valueOf(Object)>
	//   76  174:astore_3        
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), ((Throwable) (zzbul1)));
	//   77  175:new             #124 <Class IllegalArgumentException>
	//   78  178:dup             
	//   79  179:new             #126 <Class StringBuilder>
	//   80  182:dup             
	//   81  183:aload_3         
	//   82  184:invokestatic    #151 <Method String String.valueOf(Object)>
	//   83  187:invokevirtual   #154 <Method int String.length()>
	//   84  190:bipush          33
	//   85  192:iadd            
	//   86  193:invokespecial   #129 <Method void StringBuilder(int)>
	//   87  196:ldc1            #156 <String "Error creating instance of class ">
	//   88  198:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   89  201:aload_3         
	//   90  202:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   91  205:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   92  208:aload_1         
	//   93  209:invokespecial   #159 <Method void IllegalArgumentException(String, Throwable)>
	//   94  212:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzbul zzbul1)
	//*  95  213:astore_1        
		{
			throw new IllegalArgumentException("Error reading extension field", ((Throwable) (zzbul1)));
	//   96  214:new             #124 <Class IllegalArgumentException>
	//   97  217:dup             
	//   98  218:ldc1            #178 <String "Error reading extension field">
	//   99  220:aload_1         
	//  100  221:invokespecial   #159 <Method void IllegalArgumentException(String, Throwable)>
	//  101  224:athrow          
		}
		return ((Object) (zzbut1));
_L3:
		zzbut1 = (zzbut)((Class) (obj)).newInstance();
		zzbul1.zza(zzbut1);
		return ((Object) (zzbut1));
	//* 102  225:goto            40
	}

	int zzaR(Object obj)
	{
		if(zzcrY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcrY>
	//*   2    4:ifeq            13
			return zzaS(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #183 <Method int zzaS(Object)>
	//    6   12:ireturn         
		else
			return zzaT(obj);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #186 <Method int zzaT(Object)>
	//   10   18:ireturn         
	}

	protected int zzaS(Object obj)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int l = Array.getLength(obj);
	//    2    2:aload_1         
	//    3    3:invokestatic    #189 <Method int Array.getLength(Object)>
	//    4    6:istore          5
		for(int i = 0; i < l;)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload           5
	//*   9   13:icmpge          50
		{
			int k = j;
	//   10   16:iload_3         
	//   11   17:istore          4
			if(Array.get(obj, i) != null)
	//*  12   19:aload_1         
	//*  13   20:iload_2         
	//*  14   21:invokestatic    #192 <Method Object Array.get(Object, int)>
	//*  15   24:ifnull          40
				k = j + zzaT(Array.get(obj, i));
	//   16   27:iload_3         
	//   17   28:aload_0         
	//   18   29:aload_1         
	//   19   30:iload_2         
	//   20   31:invokestatic    #192 <Method Object Array.get(Object, int)>
	//   21   34:invokevirtual   #186 <Method int zzaT(Object)>
	//   22   37:iadd            
	//   23   38:istore          4
			i++;
	//   24   40:iload_2         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_2        
			j = k;
	//   28   44:iload           4
	//   29   46:istore_3        
		}

	//*  30   47:goto            10
		return j;
	//   31   50:iload_3         
	//   32   51:ireturn         
	}

	protected int zzaT(Object obj)
	{
		int i = zzbuw.zzqB(tag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int tag>
	//    2    4:invokestatic    #170 <Method int zzbuw.zzqB(int)>
	//    3    7:istore_2        
		switch(type)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field int type>
		{
	//*   6   12:tableswitch     10 11: default 36
	//	               10 70
	//	               11 79
		default:
			i = type;
	//    7   36:aload_0         
	//    8   37:getfield        #20  <Field int type>
	//    9   40:istore_2        
			throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
	//   10   41:new             #124 <Class IllegalArgumentException>
	//   11   44:dup             
	//   12   45:new             #126 <Class StringBuilder>
	//   13   48:dup             
	//   14   49:bipush          24
	//   15   51:invokespecial   #129 <Method void StringBuilder(int)>
	//   16   54:ldc1            #131 <String "Unknown type ">
	//   17   56:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   18   59:iload_2         
	//   19   60:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   20   63:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   21   66:invokespecial   #145 <Method void IllegalArgumentException(String)>
	//   22   69:athrow          

		case 10: // '\n'
			return zzbum.zzb(i, (zzbut)obj);
	//   23   70:iload_2         
	//   24   71:aload_1         
	//   25   72:checkcast       #164 <Class zzbut>
	//   26   75:invokestatic    #197 <Method int zzbum.zzb(int, zzbut)>
	//   27   78:ireturn         

		case 11: // '\013'
			return zzbum.zzc(i, (zzbut)obj);
	//   28   79:iload_2         
	//   29   80:aload_1         
	//   30   81:checkcast       #164 <Class zzbut>
	//   31   84:invokestatic    #199 <Method int zzbum.zzc(int, zzbut)>
	//   32   87:ireturn         
		}
	}

	protected void zzb(Object obj, zzbum zzbum1)
	{
		zzbum1.zzqt(tag);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field int tag>
	//    3    5:invokevirtual   #202 <Method void zzbum.zzqt(int)>
		type;
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int type>
		JVM INSTR tableswitch 10 11: default 114
	//	               10 80
	//	               11 105;
	//    6   12:tableswitch     10 11: default 114
	//	               10 80
	//	               11 105
		   goto _L1 _L2 _L3
_L1:
		int i = type;
	//    7   36:aload_0         
	//    8   37:getfield        #20  <Field int type>
	//    9   40:istore_3        
		throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
	//   10   41:new             #124 <Class IllegalArgumentException>
	//   11   44:dup             
	//   12   45:new             #126 <Class StringBuilder>
	//   13   48:dup             
	//   14   49:bipush          24
	//   15   51:invokespecial   #129 <Method void StringBuilder(int)>
	//   16   54:ldc1            #131 <String "Unknown type ">
	//   17   56:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   18   59:iload_3         
	//   19   60:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   20   63:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   21   66:invokespecial   #145 <Method void IllegalArgumentException(String)>
	//   22   69:athrow          
	//*  23   70:astore_1        
	//*  24   71:new             #204 <Class IllegalStateException>
	//*  25   74:dup             
	//*  26   75:aload_1         
	//*  27   76:invokespecial   #207 <Method void IllegalStateException(Throwable)>
	//*  28   79:athrow          
_L2:
		try
		{
			obj = ((Object) ((zzbut)obj));
	//   29   80:aload_1         
	//   30   81:checkcast       #164 <Class zzbut>
	//   31   84:astore_1        
			int j = zzbuw.zzqB(tag);
	//   32   85:aload_0         
	//   33   86:getfield        #24  <Field int tag>
	//   34   89:invokestatic    #170 <Method int zzbuw.zzqB(int)>
	//   35   92:istore_3        
			zzbum1.zzb(((zzbut) (obj)));
	//   36   93:aload_2         
	//   37   94:aload_1         
	//   38   95:invokevirtual   #209 <Method void zzbum.zzb(zzbut)>
			zzbum1.zzJ(j, 4);
	//   39   98:aload_2         
	//   40   99:iload_3         
	//   41  100:iconst_4        
	//   42  101:invokevirtual   #213 <Method void zzbum.zzJ(int, int)>
			return;
	//   43  104:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new IllegalStateException(((Throwable) (obj)));
		}
_L3:
		zzbum1.zzc((zzbut)obj);
	//   44  105:aload_2         
	//   45  106:aload_1         
	//   46  107:checkcast       #164 <Class zzbut>
	//   47  110:invokevirtual   #215 <Method void zzbum.zzc(zzbut)>
		return;
	//   48  113:return          
	//*  49  114:goto            36
	}

	protected void zzc(Object obj, zzbum zzbum1)
	{
		int j = Array.getLength(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #189 <Method int Array.getLength(Object)>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          40
		{
			Object obj1 = Array.get(obj, i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokestatic    #192 <Method Object Array.get(Object, int)>
	//   11   19:astore          5
			if(obj1 != null)
	//*  12   21:aload           5
	//*  13   23:ifnull          33
				zzb(obj1, zzbum1);
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:aload_2         
	//   17   30:invokevirtual   #117 <Method void zzb(Object, zzbum)>
		}

	//   18   33:iload_3         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:istore_3        
	//*  22   37:goto            8
	//   23   40:return          
	}

	public final int tag;
	protected final int type;
	protected final Class zzciF;
	protected final boolean zzcrY;
}
