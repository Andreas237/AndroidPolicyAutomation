// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			bv, dj, br, ge, 
//			bt, gd, ds

public final class gc extends bv
	implements dj
{

	private gc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void bv()>
		zzsf = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #29  <Field byte zzsf>
	//    5    9:return          
	}

	public static gc a()
	{
		return zzsg;
	//    0    0:getstatic       #19  <Field gc zzsg>
	//    1    3:areturn         
	}

	static gc l()
	{
		return zzsg;
	//    0    0:getstatic       #19  <Field gc zzsg>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		boolean flag;
		obj1 = ((Object) (ge.a));
	//    0    0:getstatic       #37  <Field int[] ge.a>
	//    1    3:astore_3        
		flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		obj1[i - 1];
	//    4    7:aload_3         
	//    5    8:iload_1         
	//    6    9:iconst_1        
	//    7   10:isub            
	//    8   11:iaload          
		JVM INSTR tableswitch 1 7: default 56
	//	               1 161
	//	               2 152
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   12:tableswitch     1 7: default 56
	//	               1 161
	//	               2 152
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #39  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #40  <Method void UnsupportedOperationException()>
	//   13   63:athrow          
_L8:
		i = ((int) (flag));
	//   14   64:iload           4
	//   15   66:istore_1        
		if(obj == null)
	//*  16   67:aload_2         
	//*  17   68:ifnonnull       73
			i = 0;
	//   18   71:iconst_0        
	//   19   72:istore_1        
		zzsf = (byte)i;
	//   20   73:aload_0         
	//   21   74:iload_1         
	//   22   75:int2byte        
	//   23   76:putfield        #29  <Field byte zzsf>
		return ((Object) (null));
	//   24   79:aconst_null     
	//   25   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzsf)));
	//   26   81:aload_0         
	//   27   82:getfield        #29  <Field byte zzsf>
	//   28   85:invokestatic    #46  <Method Byte Byte.valueOf(byte)>
	//   29   88:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   30   89:getstatic       #48  <Field ds zzbg>
	//   31   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   32   93:aload_2         
	//   33   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/clearcut/gc;
	//   34   97:ldc1            #2   <Class gc>
		JVM INSTR monitorenter ;
	//   35   99:monitorenter    
		obj1 = ((Object) (zzbg));
	//   36  100:getstatic       #48  <Field ds zzbg>
	//   37  103:astore_3        
		obj = obj1;
	//   38  104:aload_3         
	//   39  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   40  106:aload_3         
	//   41  107:ifnonnull       125
_L11:
		obj = ((Object) (new bt(((br) (zzsg)))));
	//   42  110:new             #50  <Class bt>
	//   43  113:dup             
	//   44  114:getstatic       #19  <Field gc zzsg>
	//   45  117:invokespecial   #53  <Method void bt(br)>
	//   46  120:astore_2        
		zzbg = ((ds) (obj));
	//   47  121:aload_2         
	//   48  122:putstatic       #48  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gc;
	//   49  125:ldc1            #2   <Class gc>
		JVM INSTR monitorexit ;
	//   50  127:monitorexit     
		return obj;
	//   51  128:aload_2         
	//   52  129:areturn         
		obj;
	//   53  130:astore_2        
		com/google/android/gms/internal/clearcut/gc;
	//   54  131:ldc1            #2   <Class gc>
		JVM INSTR monitorexit ;
	//   55  133:monitorexit     
		throw obj;
	//   56  134:aload_2         
	//   57  135:athrow          
_L10:
		return obj;
	//   58  136:aload_2         
	//   59  137:areturn         
_L5:
		return ((Object) (zzsg));
	//   60  138:getstatic       #19  <Field gc zzsg>
	//   61  141:areturn         
_L4:
		return a(((dh) (zzsg)), "\003\0", ((Object []) (null)));
	//   62  142:getstatic       #19  <Field gc zzsg>
	//   63  145:ldc1            #55  <String "\003\0">
	//   64  147:aconst_null     
	//   65  148:invokestatic    #58  <Method Object a(dh, String, Object[])>
	//   66  151:areturn         
_L3:
		return ((Object) (new gd(((ge) (null)))));
	//   67  152:new             #60  <Class gd>
	//   68  155:dup             
	//   69  156:aconst_null     
	//   70  157:invokespecial   #63  <Method void gd(ge)>
	//   71  160:areturn         
_L2:
		return ((Object) (new gc()));
	//   72  161:new             #2   <Class gc>
	//   73  164:dup             
	//   74  165:invokespecial   #17  <Method void gc()>
	//   75  168:areturn         
	}

	private static volatile ds zzbg;
	private static final gc zzsg;
	private byte zzsf;

	static 
	{
		zzsg = new gc();
	//    0    0:new             #2   <Class gc>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void gc()>
	//    3    7:putstatic       #19  <Field gc zzsg>
		br.a(com/google/android/gms/internal/clearcut/gc, ((br) (zzsg)));
	//    4   10:ldc1            #2   <Class gc>
	//    5   12:getstatic       #19  <Field gc zzsg>
	//    6   15:invokestatic    #25  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
