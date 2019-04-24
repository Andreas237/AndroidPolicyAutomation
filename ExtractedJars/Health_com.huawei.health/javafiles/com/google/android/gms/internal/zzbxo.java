// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxv, zzbxl, zzbxt, zzbxw, 
//			zzbxm

public class zzbxo
{

	private zzbxo(int i, Class class1, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int type>
		zzckM = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Class zzckM>
		tag = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int tag>
		zzcuJ = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field boolean zzcuJ>
	//   14   25:return          
	}

	public static zzbxo zza(int i, Class class1, long l)
	{
		return new zzbxo(i, class1, (int)l, false);
	//    0    0:new             #2   <Class zzbxo>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:l2i             
	//    6    8:iconst_0        
	//    7    9:invokespecial   #33  <Method void zzbxo(int, Class, int, boolean)>
	//    8   12:areturn         
	}

	private Object zzad(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ArrayList()>
	//    3    7:astore          4
		for(int i = 0; i < list.size(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:aload_1         
	//*   8   13:invokeinterface #45  <Method int List.size()>
	//*   9   18:icmpge          57
		{
			zzbxv zzbxv1 = (zzbxv)list.get(i);
	//   10   21:aload_1         
	//   11   22:iload_2         
	//   12   23:invokeinterface #49  <Method Object List.get(int)>
	//   13   28:checkcast       #51  <Class zzbxv>
	//   14   31:astore          5
			if(zzbxv1.zzbxZ.length != 0)
	//*  15   33:aload           5
	//*  16   35:getfield        #55  <Field byte[] zzbxv.zzbxZ>
	//*  17   38:arraylength     
	//*  18   39:ifeq            50
				zza(zzbxv1, ((List) (arraylist)));
	//   19   42:aload_0         
	//   20   43:aload           5
	//   21   45:aload           4
	//   22   47:invokevirtual   #58  <Method void zza(zzbxv, List)>
		}

	//   23   50:iload_2         
	//   24   51:iconst_1        
	//   25   52:iadd            
	//   26   53:istore_2        
	//*  27   54:goto            11
		int k = ((List) (arraylist)).size();
	//   28   57:aload           4
	//   29   59:invokeinterface #45  <Method int List.size()>
	//   30   64:istore_3        
		if(k == 0)
	//*  31   65:iload_3         
	//*  32   66:ifne            71
			return ((Object) (null));
	//   33   69:aconst_null     
	//   34   70:areturn         
		list = ((List) (zzckM.cast(Array.newInstance(zzckM.getComponentType(), k))));
	//   35   71:aload_0         
	//   36   72:getfield        #22  <Field Class zzckM>
	//   37   75:aload_0         
	//   38   76:getfield        #22  <Field Class zzckM>
	//   39   79:invokevirtual   #64  <Method Class Class.getComponentType()>
	//   40   82:iload_3         
	//   41   83:invokestatic    #70  <Method Object Array.newInstance(Class, int)>
	//   42   86:invokevirtual   #74  <Method Object Class.cast(Object)>
	//   43   89:astore_1        
		for(int j = 0; j < k; j++)
	//*  44   90:iconst_0        
	//*  45   91:istore_2        
	//*  46   92:iload_2         
	//*  47   93:iload_3         
	//*  48   94:icmpge          117
			Array.set(((Object) (list)), j, ((List) (arraylist)).get(j));
	//   49   97:aload_1         
	//   50   98:iload_2         
	//   51   99:aload           4
	//   52  101:iload_2         
	//   53  102:invokeinterface #49  <Method Object List.get(int)>
	//   54  107:invokestatic    #78  <Method void Array.set(Object, int, Object)>

	//   55  110:iload_2         
	//   56  111:iconst_1        
	//   57  112:iadd            
	//   58  113:istore_2        
	//*  59  114:goto            92
		return ((Object) (list));
	//   60  117:aload_1         
	//   61  118:areturn         
	}

	private Object zzae(List list)
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
			list = ((List) ((zzbxv)list.get(list.size() - 1)));
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:invokeinterface #45  <Method int List.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:invokeinterface #49  <Method Object List.get(int)>
	//   11   25:checkcast       #51  <Class zzbxv>
	//   12   28:astore_1        
			return zzckM.cast(zzaN(zzbxl.zzaf(((zzbxv) (list)).zzbxZ)));
	//   13   29:aload_0         
	//   14   30:getfield        #22  <Field Class zzckM>
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getfield        #55  <Field byte[] zzbxv.zzbxZ>
	//   18   38:invokestatic    #90  <Method zzbxl zzbxl.zzaf(byte[])>
	//   19   41:invokevirtual   #94  <Method Object zzaN(zzbxl)>
	//   20   44:invokevirtual   #74  <Method Object Class.cast(Object)>
	//   21   47:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzbxo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbxo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbxo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbxo>
	//   12   20:astore_1        
		return type == ((zzbxo) (obj)).type && zzckM == ((zzbxo) (obj)).zzckM && tag == ((zzbxo) (obj)).tag && zzcuJ == ((zzbxo) (obj)).zzcuJ;
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #20  <Field int type>
	//   17   29:icmpne          67
	//   18   32:aload_0         
	//   19   33:getfield        #22  <Field Class zzckM>
	//   20   36:aload_1         
	//   21   37:getfield        #22  <Field Class zzckM>
	//   22   40:if_acmpne       67
	//   23   43:aload_0         
	//   24   44:getfield        #24  <Field int tag>
	//   25   47:aload_1         
	//   26   48:getfield        #24  <Field int tag>
	//   27   51:icmpne          67
	//   28   54:aload_0         
	//   29   55:getfield        #26  <Field boolean zzcuJ>
	//   30   58:aload_1         
	//   31   59:getfield        #26  <Field boolean zzcuJ>
	//   32   62:icmpne          67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	public int hashCode()
	{
		int j = type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int type>
	//    2    4:istore_2        
		int k = ((Object) (zzckM)).hashCode();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Class zzckM>
	//    5    9:invokevirtual   #99  <Method int Object.hashCode()>
	//    6   12:istore_3        
		int l = tag;
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field int tag>
	//    9   17:istore          4
		int i;
		if(zzcuJ)
	//*  10   19:aload_0         
	//*  11   20:getfield        #26  <Field boolean zzcuJ>
	//*  12   23:ifeq            31
			i = 1;
	//   13   26:iconst_1        
	//   14   27:istore_1        
		else
	//*  15   28:goto            33
			i = 0;
	//   16   31:iconst_0        
	//   17   32:istore_1        
		return (((j + 1147) * 31 + k) * 31 + l) * 31 + i;
	//   18   33:iload_2         
	//   19   34:sipush          1147
	//   20   37:iadd            
	//   21   38:bipush          31
	//   22   40:imul            
	//   23   41:iload_3         
	//   24   42:iadd            
	//   25   43:bipush          31
	//   26   45:imul            
	//   27   46:iload           4
	//   28   48:iadd            
	//   29   49:bipush          31
	//   30   51:imul            
	//   31   52:iload_1         
	//   32   53:iadd            
	//   33   54:ireturn         
	}

	protected void zza(zzbxv zzbxv1, List list)
	{
		list.add(zzaN(zzbxl.zzaf(zzbxv1.zzbxZ)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:getfield        #55  <Field byte[] zzbxv.zzbxZ>
	//    4    6:invokestatic    #90  <Method zzbxl zzbxl.zzaf(byte[])>
	//    5    9:invokevirtual   #94  <Method Object zzaN(zzbxl)>
	//    6   12:invokeinterface #102 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	void zza(Object obj, zzbxm zzbxm1)
		throws IOException
	{
		if(zzcuJ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcuJ>
	//*   2    4:ifeq            14
		{
			zzc(obj, zzbxm1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #109 <Method void zzc(Object, zzbxm)>
			return;
	//    7   13:return          
		} else
		{
			zzb(obj, zzbxm1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #112 <Method void zzb(Object, zzbxm)>
			return;
	//   12   20:return          
		}
	}

	protected Object zzaN(zzbxl zzbxl1)
	{
		Object obj;
		if(zzcuJ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcuJ>
	//*   2    4:ifeq            18
			obj = ((Object) (zzckM.getComponentType()));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Class zzckM>
	//    5   11:invokevirtual   #64  <Method Class Class.getComponentType()>
	//    6   14:astore_3        
		else
	//*   7   15:goto            23
			obj = ((Object) (zzckM));
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field Class zzckM>
	//   10   22:astore_3        
		type;
	//   11   23:aload_0         
	//   12   24:getfield        #20  <Field int type>
		JVM INSTR lookupswitch 2: default 229
	//	               10: 52
	//	               11: 77;
	//   13   27:lookupswitch    2: default 229
	//	               10: 52
	//	               11: 77
		   goto _L1 _L2 _L3
_L2:
		zzbxt zzbxt1;
		zzbxt1 = (zzbxt)((Class) (obj)).newInstance();
	//   14   52:aload_3         
	//   15   53:invokevirtual   #120 <Method Object Class.newInstance()>
	//   16   56:checkcast       #122 <Class zzbxt>
	//   17   59:astore          4
		zzbxl1.zza(zzbxt1, zzbxw.zzrs(tag));
	//   18   61:aload_1         
	//   19   62:aload           4
	//   20   64:aload_0         
	//   21   65:getfield        #24  <Field int tag>
	//   22   68:invokestatic    #128 <Method int zzbxw.zzrs(int)>
	//   23   71:invokevirtual   #131 <Method void zzbxl.zza(zzbxt, int)>
		return ((Object) (zzbxt1));
	//   24   74:aload           4
	//   25   76:areturn         
_L3:
		zzbxt1 = (zzbxt)((Class) (obj)).newInstance();
	//   26   77:aload_3         
	//   27   78:invokevirtual   #120 <Method Object Class.newInstance()>
	//   28   81:checkcast       #122 <Class zzbxt>
	//   29   84:astore          4
		zzbxl1.zza(zzbxt1);
	//   30   86:aload_1         
	//   31   87:aload           4
	//   32   89:invokevirtual   #134 <Method void zzbxl.zza(zzbxt)>
		return ((Object) (zzbxt1));
	//   33   92:aload           4
	//   34   94:areturn         
_L1:
		try
		{
			int i = type;
	//   35   95:aload_0         
	//   36   96:getfield        #20  <Field int type>
	//   37   99:istore_2        
			throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
	//   38  100:new             #136 <Class IllegalArgumentException>
	//   39  103:dup             
	//   40  104:new             #138 <Class StringBuilder>
	//   41  107:dup             
	//   42  108:bipush          24
	//   43  110:invokespecial   #141 <Method void StringBuilder(int)>
	//   44  113:ldc1            #143 <String "Unknown type ">
	//   45  115:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   46  118:iload_2         
	//   47  119:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   48  122:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   49  125:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   50  128:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzbxl zzbxl1)
	//*  51  129:astore_1        
		{
			obj = ((Object) (String.valueOf(obj)));
	//   52  130:aload_3         
	//   53  131:invokestatic    #163 <Method String String.valueOf(Object)>
	//   54  134:astore_3        
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), ((Throwable) (zzbxl1)));
	//   55  135:new             #136 <Class IllegalArgumentException>
	//   56  138:dup             
	//   57  139:new             #138 <Class StringBuilder>
	//   58  142:dup             
	//   59  143:aload_3         
	//   60  144:invokestatic    #163 <Method String String.valueOf(Object)>
	//   61  147:invokevirtual   #166 <Method int String.length()>
	//   62  150:bipush          33
	//   63  152:iadd            
	//   64  153:invokespecial   #141 <Method void StringBuilder(int)>
	//   65  156:ldc1            #168 <String "Error creating instance of class ">
	//   66  158:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   67  161:aload_3         
	//   68  162:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   69  165:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   70  168:aload_1         
	//   71  169:invokespecial   #171 <Method void IllegalArgumentException(String, Throwable)>
	//   72  172:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzbxl zzbxl1)
	//*  73  173:astore_1        
		{
			obj = ((Object) (String.valueOf(obj)));
	//   74  174:aload_3         
	//   75  175:invokestatic    #163 <Method String String.valueOf(Object)>
	//   76  178:astore_3        
		}
	//*  77  179:new             #136 <Class IllegalArgumentException>
	//*  78  182:dup             
	//*  79  183:new             #138 <Class StringBuilder>
	//*  80  186:dup             
	//*  81  187:aload_3         
	//*  82  188:invokestatic    #163 <Method String String.valueOf(Object)>
	//*  83  191:invokevirtual   #166 <Method int String.length()>
	//*  84  194:bipush          33
	//*  85  196:iadd            
	//*  86  197:invokespecial   #141 <Method void StringBuilder(int)>
	//*  87  200:ldc1            #168 <String "Error creating instance of class ">
	//*  88  202:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//*  89  205:aload_3         
	//*  90  206:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//*  91  209:invokevirtual   #154 <Method String StringBuilder.toString()>
	//*  92  212:aload_1         
	//*  93  213:invokespecial   #171 <Method void IllegalArgumentException(String, Throwable)>
	//*  94  216:athrow          
		// Misplaced declaration of an exception variable
		catch(zzbxl zzbxl1)
	//*  95  217:astore_1        
		{
			throw new IllegalArgumentException("Error reading extension field", ((Throwable) (zzbxl1)));
	//   96  218:new             #136 <Class IllegalArgumentException>
	//   97  221:dup             
	//   98  222:ldc1            #173 <String "Error reading extension field">
	//   99  224:aload_1         
	//  100  225:invokespecial   #171 <Method void IllegalArgumentException(String, Throwable)>
	//  101  228:athrow          
		}
		throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), ((Throwable) (zzbxl1)));
	//* 102  229:goto            95
	}

	int zzaU(Object obj)
	{
		if(zzcuJ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzcuJ>
	//*   2    4:ifeq            13
			return zzaV(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #178 <Method int zzaV(Object)>
	//    6   12:ireturn         
		else
			return zzaW(obj);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #181 <Method int zzaW(Object)>
	//   10   18:ireturn         
	}

	protected int zzaV(Object obj)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int l = Array.getLength(obj);
	//    2    2:aload_1         
	//    3    3:invokestatic    #184 <Method int Array.getLength(Object)>
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
	//*  14   21:invokestatic    #187 <Method Object Array.get(Object, int)>
	//*  15   24:ifnull          40
				k = j + zzaW(Array.get(obj, i));
	//   16   27:iload_3         
	//   17   28:aload_0         
	//   18   29:aload_1         
	//   19   30:iload_2         
	//   20   31:invokestatic    #187 <Method Object Array.get(Object, int)>
	//   21   34:invokevirtual   #181 <Method int zzaW(Object)>
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

	protected int zzaW(Object obj)
	{
		int i = zzbxw.zzrs(tag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int tag>
	//    2    4:invokestatic    #128 <Method int zzbxw.zzrs(int)>
	//    3    7:istore_2        
		switch(type)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field int type>
		{
	//*   6   12:lookupswitch    2: default 40
	//	               10: 43
	//	               11: 52
	//*   7   40:goto            61
		case 10: // '\n'
			return zzbxm.zzb(i, (zzbxt)obj);
	//    8   43:iload_2         
	//    9   44:aload_1         
	//   10   45:checkcast       #122 <Class zzbxt>
	//   11   48:invokestatic    #192 <Method int zzbxm.zzb(int, zzbxt)>
	//   12   51:ireturn         

		case 11: // '\013'
			return zzbxm.zzc(i, (zzbxt)obj);
	//   13   52:iload_2         
	//   14   53:aload_1         
	//   15   54:checkcast       #122 <Class zzbxt>
	//   16   57:invokestatic    #194 <Method int zzbxm.zzc(int, zzbxt)>
	//   17   60:ireturn         
		}
		i = type;
	//   18   61:aload_0         
	//   19   62:getfield        #20  <Field int type>
	//   20   65:istore_2        
		throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
	//   21   66:new             #136 <Class IllegalArgumentException>
	//   22   69:dup             
	//   23   70:new             #138 <Class StringBuilder>
	//   24   73:dup             
	//   25   74:bipush          24
	//   26   76:invokespecial   #141 <Method void StringBuilder(int)>
	//   27   79:ldc1            #143 <String "Unknown type ">
	//   28   81:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   29   84:iload_2         
	//   30   85:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   31   88:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   32   91:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   33   94:athrow          
	}

	final Object zzac(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(zzcuJ)
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field boolean zzcuJ>
	//*   6   10:ifeq            19
			return zzad(list);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #197 <Method Object zzad(List)>
	//   10   18:areturn         
		else
			return zzae(list);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #199 <Method Object zzae(List)>
	//   14   24:areturn         
	}

	protected void zzb(Object obj, zzbxm zzbxm1)
	{
		zzbxm1.zzrk(tag);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field int tag>
	//    3    5:invokevirtual   #202 <Method void zzbxm.zzrk(int)>
		type;
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int type>
		JVM INSTR lookupswitch 2: default 123
	//	               10: 40
	//	               11: 67;
	//    6   12:lookupswitch    2: default 123
	//	               10: 40
	//	               11: 67
		   goto _L1 _L2 _L3
_L2:
		obj = ((Object) ((zzbxt)obj));
	//    7   40:aload_1         
	//    8   41:checkcast       #122 <Class zzbxt>
	//    9   44:astore_1        
		int i = zzbxw.zzrs(tag);
	//   10   45:aload_0         
	//   11   46:getfield        #24  <Field int tag>
	//   12   49:invokestatic    #128 <Method int zzbxw.zzrs(int)>
	//   13   52:istore_3        
		zzbxm1.zzb(((zzbxt) (obj)));
	//   14   53:aload_2         
	//   15   54:aload_1         
	//   16   55:invokevirtual   #204 <Method void zzbxm.zzb(zzbxt)>
		zzbxm1.zzN(i, 4);
	//   17   58:aload_2         
	//   18   59:iload_3         
	//   19   60:iconst_4        
	//   20   61:invokevirtual   #208 <Method void zzbxm.zzN(int, int)>
		break; /* Loop/switch isn't completed */
	//   21   64:goto            112
_L3:
		int j;
		try
		{
			zzbxm1.zzc((zzbxt)obj);
	//   22   67:aload_2         
	//   23   68:aload_1         
	//   24   69:checkcast       #122 <Class zzbxt>
	//   25   72:invokevirtual   #210 <Method void zzbxm.zzc(zzbxt)>
		}
	//*  26   75:goto            112
	//*  27   78:aload_0         
	//*  28   79:getfield        #20  <Field int type>
	//*  29   82:istore_3        
	//*  30   83:new             #136 <Class IllegalArgumentException>
	//*  31   86:dup             
	//*  32   87:new             #138 <Class StringBuilder>
	//*  33   90:dup             
	//*  34   91:bipush          24
	//*  35   93:invokespecial   #141 <Method void StringBuilder(int)>
	//*  36   96:ldc1            #143 <String "Unknown type ">
	//*  37   98:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//*  38  101:iload_3         
	//*  39  102:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//*  40  105:invokevirtual   #154 <Method String StringBuilder.toString()>
	//*  41  108:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//*  42  111:athrow          
	//*  43  112:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  44  113:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//   45  114:new             #212 <Class IllegalStateException>
	//   46  117:dup             
	//   47  118:aload_1         
	//   48  119:invokespecial   #215 <Method void IllegalStateException(Throwable)>
	//   49  122:athrow          
		}
		break; /* Loop/switch isn't completed */
	//   50  123:goto            78
_L1:
		j = type;
		throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(j).toString());
	}

	protected void zzc(Object obj, zzbxm zzbxm1)
	{
		int j = Array.getLength(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #184 <Method int Array.getLength(Object)>
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
	//   10   16:invokestatic    #187 <Method Object Array.get(Object, int)>
	//   11   19:astore          5
			if(obj1 != null)
	//*  12   21:aload           5
	//*  13   23:ifnull          33
				zzb(obj1, zzbxm1);
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:aload_2         
	//   17   30:invokevirtual   #112 <Method void zzb(Object, zzbxm)>
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
	protected final Class zzckM;
	protected final boolean zzcuJ;
}
