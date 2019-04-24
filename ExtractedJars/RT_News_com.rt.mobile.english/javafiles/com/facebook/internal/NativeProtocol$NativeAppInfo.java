// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import java.util.HashSet;
import java.util.TreeSet;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol, Utility

private static abstract class NativeProtocol$NativeAppInfo
{

	private static HashSet buildAppSignatureHashes()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #45  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void HashSet()>
	//    3    7:astore_0        
		hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
	//    4    8:aload_0         
	//    5    9:ldc1            #17  <String "8a3c4b262d721acd49a4bf97d5213199c86fa2b9">
	//    6   11:invokevirtual   #50  <Method boolean HashSet.add(Object)>
	//    7   14:pop             
		hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
	//    8   15:aload_0         
	//    9   16:ldc1            #11  <String "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc">
	//   10   18:invokevirtual   #50  <Method boolean HashSet.add(Object)>
	//   11   21:pop             
		hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
	//   12   22:aload_0         
	//   13   23:ldc1            #14  <String "5e8f16062ea3cd2c4a0d547876baa6f38cabf625">
	//   14   25:invokevirtual   #50  <Method boolean HashSet.add(Object)>
	//   15   28:pop             
		return hashset;
	//   16   29:aload_0         
	//   17   30:areturn         
	}

	private void fetchAvailableVersions(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(flag)
			break MISSING_BLOCK_LABEL_16;
	//    2    2:iload_1         
	//    3    3:ifne            16
		if(availableVersions != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #54  <Field TreeSet availableVersions>
	//*   6   10:ifnonnull       24
			break MISSING_BLOCK_LABEL_24;
	//    7   13:goto            16
		availableVersions = NativeProtocol.access$000(this);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokestatic    #58  <Method TreeSet NativeProtocol.access$000(NativeProtocol$NativeAppInfo)>
	//   11   21:putfield        #54  <Field TreeSet availableVersions>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
	//*  15   27:aload_0         
_L2:
		Exception exception;
		throw exception;
	//   16   28:monitorexit     
	//   17   29:aload_2         
	//   18   30:athrow          
		exception;
	//   19   31:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   32:goto            27
	}

	public TreeSet getAvailableVersions()
	{
		if(availableVersions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field TreeSet availableVersions>
	//*   2    4:ifnonnull       12
			fetchAvailableVersions(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #43  <Method void fetchAvailableVersions(boolean)>
		return availableVersions;
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field TreeSet availableVersions>
	//    8   16:areturn         
	}

	protected abstract String getPackage();

	public boolean validateSignature(Context context, String s)
	{
		String s1 = Build.BRAND;
	//    0    0:getstatic       #72  <Field String Build.BRAND>
	//    1    3:astore          5
		int i = context.getApplicationInfo().flags;
	//    2    5:aload_1         
	//    3    6:invokevirtual   #78  <Method ApplicationInfo Context.getApplicationInfo()>
	//    4    9:getfield        #84  <Field int ApplicationInfo.flags>
	//    5   12:istore_3        
		if(s1.startsWith("generic") && (i & 2) != 0)
	//*   6   13:aload           5
	//*   7   15:ldc1            #86  <String "generic">
	//*   8   17:invokevirtual   #92  <Method boolean String.startsWith(String)>
	//*   9   20:ifeq            31
	//*  10   23:iload_3         
	//*  11   24:iconst_2        
	//*  12   25:iand            
	//*  13   26:ifeq            31
			return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
		int k;
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s, 64)));
	//   16   31:aload_1         
	//   17   32:invokevirtual   #96  <Method PackageManager Context.getPackageManager()>
	//   18   35:aload_2         
	//   19   36:bipush          64
	//   20   38:invokevirtual   #102 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   21   41:astore_1        
		}
	//*  22   42:aload_1         
	//*  23   43:getfield        #108 <Field Signature[] PackageInfo.signatures>
	//*  24   46:astore_1        
	//*  25   47:aload_1         
	//*  26   48:arraylength     
	//*  27   49:istore          4
	//*  28   51:iconst_0        
	//*  29   52:istore_3        
	//*  30   53:iload_3         
	//*  31   54:iload           4
	//*  32   56:icmpge          88
	//*  33   59:aload_1         
	//*  34   60:iload_3         
	//*  35   61:aaload          
	//*  36   62:invokevirtual   #114 <Method byte[] Signature.toByteArray()>
	//*  37   65:invokestatic    #120 <Method String Utility.sha1hash(byte[])>
	//*  38   68:astore_2        
	//*  39   69:getstatic       #31  <Field HashSet validAppSignatureHashes>
	//*  40   72:aload_2         
	//*  41   73:invokevirtual   #123 <Method boolean HashSet.contains(Object)>
	//*  42   76:ifeq            81
	//*  43   79:iconst_1        
	//*  44   80:ireturn         
	//*  45   81:iload_3         
	//*  46   82:iconst_1        
	//*  47   83:iadd            
	//*  48   84:istore_3        
	//*  49   85:goto            53
	//*  50   88:iconst_0        
	//*  51   89:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  52   90:astore_1        
		{
			return false;
	//   53   91:iconst_0        
	//   54   92:ireturn         
		}
		context = ((Context) (((PackageInfo) (context)).signatures));
		k = context.length;
		for(int j = 0; j < k; j++)
		{
			s = Utility.sha1hash(((Signature) (context[j])).toByteArray());
			if(validAppSignatureHashes.contains(((Object) (s))))
				return true;
		}

		return false;
	}

	private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
	private static final String FBL_HASH = "5e8f16062ea3cd2c4a0d547876baa6f38cabf625";
	private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
	private static final HashSet validAppSignatureHashes = buildAppSignatureHashes();
	private TreeSet availableVersions;

	static 
	{
	//    0    0:invokestatic    #29  <Method HashSet buildAppSignatureHashes()>
	//    1    3:putstatic       #31  <Field HashSet validAppSignatureHashes>
	//*   2    6:return          
	}


/*
	static void access$600(NativeProtocol$NativeAppInfo nativeprotocol$nativeappinfo, boolean flag)
	{
		nativeprotocol$nativeappinfo.fetchAvailableVersions(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #43  <Method void fetchAvailableVersions(boolean)>
		return;
	//    3    5:return          
	}

*/

	private NativeProtocol$NativeAppInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	NativeProtocol$NativeAppInfo(NativeProtocol._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void NativeProtocol$NativeAppInfo()>
	//    2    4:return          
	}
}
