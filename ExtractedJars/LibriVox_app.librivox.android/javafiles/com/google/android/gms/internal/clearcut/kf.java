// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, kk, bt, 
//			ki, kh, kj, kg, 
//			ds

public final class kf extends br
	implements dj
{

	private kf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void br()>
	//    2    4:return          
	}

	static kf a()
	{
		return zzbf;
	//    0    0:getstatic       #22  <Field kf zzbf>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		kk.a[i - 1];
	//    0    0:getstatic       #35  <Field int[] kk.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 186
	//	               2 177
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 186
	//	               2 177
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #37  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #44  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #46  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/kf;
	//   19   71:ldc1            #2   <Class kf>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #46  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbf)))));
	//   27   84:new             #48  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field kf zzbf>
	//   30   91:invokespecial   #51  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #46  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/kf;
	//   34   99:ldc1            #2   <Class kf>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/kf;
	//   39  105:ldc1            #2   <Class kf>
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
		return ((Object) (zzbf));
	//   45  112:getstatic       #22  <Field kf zzbf>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ki.b()));
	//   47  116:invokestatic    #57  <Method cc ki.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (kh.b()));
	//   49  120:invokestatic    #60  <Method cc kh.b()>
	//   50  123:astore_3        
		cc cc = kj.b();
	//   51  124:invokestatic    #63  <Method cc kj.b()>
	//   52  127:astore          4
		return a(((dh) (zzbf)), "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\f\001\003\f\002", new Object[] {
			"zzbb", "zzbc", obj, "zzbd", obj1, "zzbe", cc
		});
	//   53  129:getstatic       #22  <Field kf zzbf>
	//   54  132:ldc1            #65  <String "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\f\001\003\f\002">
	//   55  134:bipush          7
	//   56  136:anewarray       Object[]
	//   57  139:dup             
	//   58  140:iconst_0        
	//   59  141:ldc1            #68  <String "zzbb">
	//   60  143:aastore         
	//   61  144:dup             
	//   62  145:iconst_1        
	//   63  146:ldc1            #69  <String "zzbc">
	//   64  148:aastore         
	//   65  149:dup             
	//   66  150:iconst_2        
	//   67  151:aload_2         
	//   68  152:aastore         
	//   69  153:dup             
	//   70  154:iconst_3        
	//   71  155:ldc1            #70  <String "zzbd">
	//   72  157:aastore         
	//   73  158:dup             
	//   74  159:iconst_4        
	//   75  160:aload_3         
	//   76  161:aastore         
	//   77  162:dup             
	//   78  163:iconst_5        
	//   79  164:ldc1            #71  <String "zzbe">
	//   80  166:aastore         
	//   81  167:dup             
	//   82  168:bipush          6
	//   83  170:aload           4
	//   84  172:aastore         
	//   85  173:invokestatic    #74  <Method Object a(dh, String, Object[])>
	//   86  176:areturn         
_L3:
		return ((Object) (new kg(((kk) (null)))));
	//   87  177:new             #76  <Class kg>
	//   88  180:dup             
	//   89  181:aconst_null     
	//   90  182:invokespecial   #79  <Method void kg(kk)>
	//   91  185:areturn         
_L2:
		return ((Object) (new kf()));
	//   92  186:new             #2   <Class kf>
	//   93  189:dup             
	//   94  190:invokespecial   #20  <Method void kf()>
	//   95  193:areturn         
	}

	private static final kf zzbf;
	private static volatile ds zzbg;
	private int zzbb;
	private int zzbc;
	private int zzbd;
	private int zzbe;

	static 
	{
		zzbf = new kf();
	//    0    0:new             #2   <Class kf>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void kf()>
	//    3    7:putstatic       #22  <Field kf zzbf>
		br.a(com/google/android/gms/internal/clearcut/kf, ((br) (zzbf)));
	//    4   10:ldc1            #2   <Class kf>
	//    5   12:getstatic       #22  <Field kf zzbf>
	//    6   15:invokestatic    #26  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
