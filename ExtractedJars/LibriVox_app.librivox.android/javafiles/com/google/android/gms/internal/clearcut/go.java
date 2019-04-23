// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gq, gp, ds

public final class go extends br
	implements dj
{

	private go()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void br()>
		zztz = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zztz>
		zzua = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #31  <String "">
	//    7   13:putfield        #35  <Field String zzua>
	//    8   16:return          
	}

	static go a()
	{
		return zzub;
	//    0    0:getstatic       #23  <Field go zzub>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #42  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #44  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #45  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #51  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #53  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/go;
	//   19   71:ldc1            #2   <Class go>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #53  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzub)))));
	//   27   84:new             #55  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field go zzub>
	//   30   91:invokespecial   #58  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #53  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/go;
	//   34   99:ldc1            #2   <Class go>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/go;
	//   39  105:ldc1            #2   <Class go>
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
		return ((Object) (zzub));
	//   45  112:getstatic       #23  <Field go zzub>
	//   46  115:areturn         
_L4:
		obj = ((Object) (gq.b()));
	//   47  116:invokestatic    #64  <Method cc gq.b()>
	//   48  119:astore_2        
		return a(((dh) (zzub)), "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\b\001\003\b\002", new Object[] {
			"zzbb", "zzty", obj, "zztz", "zzua"
		});
	//   49  120:getstatic       #23  <Field go zzub>
	//   50  123:ldc1            #66  <String "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\b\001\003\b\002">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #69  <String "zzbb">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #70  <String "zzty">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #71  <String "zztz">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #72  <String "zzua">
	//   72  152:aastore         
	//   73  153:invokestatic    #75  <Method Object a(dh, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new gp(((ip) (null)))));
	//   75  157:new             #77  <Class gp>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #80  <Method void gp(ip)>
	//   79  165:areturn         
_L2:
		return ((Object) (new go()));
	//   80  166:new             #2   <Class go>
	//   81  169:dup             
	//   82  170:invokespecial   #21  <Method void go()>
	//   83  173:areturn         
	}

	private static volatile ds zzbg;
	private static final go zzub;
	private int zzbb;
	private int zzty;
	private String zztz;
	private String zzua;

	static 
	{
		zzub = new go();
	//    0    0:new             #2   <Class go>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void go()>
	//    3    7:putstatic       #23  <Field go zzub>
		br.a(com/google/android/gms/internal/clearcut/go, ((br) (zzub)));
	//    4   10:ldc1            #2   <Class go>
	//    5   12:getstatic       #23  <Field go zzub>
	//    6   15:invokestatic    #27  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
