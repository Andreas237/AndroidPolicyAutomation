// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			anu, and, aoi, anv, 
//			asj, aug

public final class ant extends ash
	implements atx
{

	private ant()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfgk = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzfgk>
	//    5   10:return          
	}

	public static anu a()
	{
		return (anu)(asi)((ash) (zzfhr)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field ant zzfhr>
	//    1    3:getstatic       #39  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #42  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #44  <Class asi>
	//    6   14:checkcast       #46  <Class anu>
	//    7   17:areturn         
	}

	private final void a(and and1)
	{
		if(and1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			zzfhm = and1.a();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #52  <Method int and.a()>
	//    5    9:putfield        #54  <Field int zzfhm>
			return;
	//    6   12:return          
		} else
		{
			throw new NullPointerException();
	//    7   13:new             #56  <Class NullPointerException>
	//    8   16:dup             
	//    9   17:invokespecial   #57  <Method void NullPointerException()>
	//   10   20:athrow          
		}
	}

	static void a(ant ant1, int i)
	{
		ant1.b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #62  <Method void b(int)>
	//    3    5:return          
	}

	static void a(ant ant1, and and1)
	{
		ant1.a(and1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void a(and)>
	//    3    5:return          
	}

	static void a(ant ant1, aoi aoi1)
	{
		ant1.a(aoi1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void a(aoi)>
	//    3    5:return          
	}

	static void a(ant ant1, String s)
	{
		ant1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(aoi aoi1)
	{
		if(aoi1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			zzfhb = aoi1.a();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #76  <Method int aoi.a()>
	//    5    9:putfield        #78  <Field int zzfhb>
			return;
	//    6   12:return          
		} else
		{
			throw new NullPointerException();
	//    7   13:new             #56  <Class NullPointerException>
	//    8   16:dup             
	//    9   17:invokespecial   #57  <Method void NullPointerException()>
	//   10   20:athrow          
		}
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfgk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String zzfgk>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #56  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #57  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	static ant b()
	{
		return zzfhr;
	//    0    0:getstatic       #23  <Field ant zzfhr>
	//    1    3:areturn         
	}

	private final void b(int i)
	{
		zzfhn = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int zzfhn>
	//    3    5:return          
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anv.a[i - 1];
	//    0    0:getstatic       #86  <Field int[] anv.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #88  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #89  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #95  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #97  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ant;
	//   19   71:ldc1            #2   <Class ant>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #97  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhr)))));
	//   27   84:new             #99  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field ant zzfhr>
	//   30   91:invokespecial   #102 <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #97  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ant;
	//   34   99:ldc1            #2   <Class ant>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ant;
	//   39  105:ldc1            #2   <Class ant>
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
		return ((Object) (zzfhr));
	//   45  112:getstatic       #23  <Field ant zzfhr>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhr)), "\000\004\000\000\001\004\004\000\000\000\001\u0208\002\f\003\013\004\f", new Object[] {
			"zzfgk", "zzfhm", "zzfhn", "zzfhb"
		});
	//   47  116:getstatic       #23  <Field ant zzfhr>
	//   48  119:ldc1            #104 <String "\000\004\000\000\001\004\004\000\000\000\001\u0208\002\f\003\013\004\f">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #107 <String "zzfgk">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #108 <String "zzfhm">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #109 <String "zzfhn">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #110 <String "zzfhb">
	//   66  144:aastore         
	//   67  145:invokestatic    #113 <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new anu(((anv) (null)))));
	//   69  149:new             #46  <Class anu>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #116 <Method void anu(anv)>
	//   73  157:areturn         
_L2:
		return ((Object) (new ant()));
	//   74  158:new             #2   <Class ant>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void ant()>
	//   77  165:areturn         
	}

	private static volatile aug zzcas;
	private static final ant zzfhr;
	private String zzfgk;
	private int zzfhb;
	private int zzfhm;
	private int zzfhn;

	static 
	{
		zzfhr = new ant();
	//    0    0:new             #2   <Class ant>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ant()>
	//    3    7:putstatic       #23  <Field ant zzfhr>
		ash.a(com/google/android/gms/internal/ads/ant, ((ash) (zzfhr)));
	//    4   10:ldc1            #2   <Class ant>
	//    5   12:getstatic       #23  <Field ant zzfhr>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
