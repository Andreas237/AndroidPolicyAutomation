// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			aod, aoe, asj, aof, 
//			aug, aqq

public final class aoc extends ash
	implements atx
{

	private aoc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	public static aoc a(aqq aqq)
	{
		return (aoc)ash.a(((ash) (zzfhx)), aqq);
	//    0    0:getstatic       #21  <Field aoc zzfhx>
	//    1    3:aload_0         
	//    2    4:invokestatic    #31  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class aoc>
	//    4   10:areturn         
	}

	static void a(aoc aoc1, int i)
	{
		aoc1.b(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #36  <Method void b(int)>
	//    3    5:return          
	}

	static void a(aoc aoc1, aof aof1)
	{
		aoc1.a(aof1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void a(aof)>
	//    3    5:return          
	}

	private final void a(aof aof1)
	{
		if(aof1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfhw = aof1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field aof zzfhw>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #44  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #45  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int zzfea>
	//    3    5:return          
	}

	public static aod c()
	{
		return (aod)(asi)((ash) (zzfhx)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #21  <Field aoc zzfhx>
	//    1    3:getstatic       #54  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #57  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #59  <Class asi>
	//    6   14:checkcast       #61  <Class aod>
	//    7   17:areturn         
	}

	static aoc d()
	{
		return zzfhx;
	//    0    0:getstatic       #21  <Field aoc zzfhx>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		aoe.a[i - 1];
	//    0    0:getstatic       #69  <Field int[] aoe.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #71  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #72  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #78  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #80  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/aoc;
	//   19   71:ldc1            #2   <Class aoc>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #80  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhx)))));
	//   27   84:new             #82  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field aoc zzfhx>
	//   30   91:invokespecial   #85  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #80  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/aoc;
	//   34   99:ldc1            #2   <Class aoc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/aoc;
	//   39  105:ldc1            #2   <Class aoc>
		JVM INSTR monitorexit ;
	//   40  107:monitorexit     
		throw obj;
	//   41  108:aload_2         
	//   42  109:athrow          
_L10:
		return obj;
	//   43  110:aload_2         
	//   44  111:areturn         
_L5:
		return ((Object) (zzfhx));
	//   45  112:getstatic       #21  <Field aoc zzfhx>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhx)), "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] {
			"zzfea", "zzfhw"
		});
	//   47  116:getstatic       #21  <Field aoc zzfhx>
	//   48  119:ldc1            #87  <String "\000\002\000\000\001\002\002\000\000\000\001\013\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #90  <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #91  <String "zzfhw">
	//   58  134:aastore         
	//   59  135:invokestatic    #94  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new aod(((aoe) (null)))));
	//   61  139:new             #61  <Class aod>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #97  <Method void aod(aoe)>
	//   65  147:areturn         
_L2:
		return ((Object) (new aoc()));
	//   66  148:new             #2   <Class aoc>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void aoc()>
	//   69  155:areturn         
	}

	public final aof b()
	{
		aof aof2 = zzfhw;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field aof zzfhw>
	//    2    4:astore_2        
		aof aof1 = aof2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(aof2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			aof1 = aof.c();
	//    7   11:invokestatic    #102 <Method aof aof.c()>
	//    8   14:astore_1        
		return aof1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static volatile aug zzcas;
	private static final aoc zzfhx;
	private int zzfea;
	private aof zzfhw;

	static 
	{
		zzfhx = new aoc();
	//    0    0:new             #2   <Class aoc>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void aoc()>
	//    3    7:putstatic       #21  <Field aoc zzfhx>
		ash.a(com/google/android/gms/internal/ads/aoc, ((ash) (zzfhx)));
	//    4   10:ldc1            #2   <Class aoc>
	//    5   12:getstatic       #21  <Field aoc zzfhx>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
