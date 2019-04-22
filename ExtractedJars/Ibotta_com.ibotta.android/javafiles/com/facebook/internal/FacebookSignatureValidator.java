// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import java.util.HashSet;

// Referenced classes of package com.facebook.internal:
//			Utility

public class FacebookSignatureValidator
{

	private static HashSet buildAppSignatureHashes()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #18  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void HashSet()>
	//    3    7:astore_0        
		hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
	//    4    8:aload_0         
	//    5    9:ldc1            #23  <String "8a3c4b262d721acd49a4bf97d5213199c86fa2b9">
	//    6   11:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//    7   14:pop             
		hashset.add("cc2751449a350f668590264ed76692694a80308a");
	//    8   15:aload_0         
	//    9   16:ldc1            #29  <String "cc2751449a350f668590264ed76692694a80308a">
	//   10   18:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   11   21:pop             
		hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
	//   12   22:aload_0         
	//   13   23:ldc1            #31  <String "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc">
	//   14   25:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   15   28:pop             
		hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
	//   16   29:aload_0         
	//   17   30:ldc1            #33  <String "5e8f16062ea3cd2c4a0d547876baa6f38cabf625">
	//   18   32:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   19   35:pop             
		hashset.add("df6b721c8b4d3b6eb44c861d4415007e5a35fc95");
	//   20   36:aload_0         
	//   21   37:ldc1            #35  <String "df6b721c8b4d3b6eb44c861d4415007e5a35fc95">
	//   22   39:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   23   42:pop             
		hashset.add("9b8f518b086098de3d77736f9458a3d2f6f95a37");
	//   24   43:aload_0         
	//   25   44:ldc1            #37  <String "9b8f518b086098de3d77736f9458a3d2f6f95a37">
	//   26   46:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   27   49:pop             
		hashset.add("2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3");
	//   28   50:aload_0         
	//   29   51:ldc1            #39  <String "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3">
	//   30   53:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//   31   56:pop             
		return hashset;
	//   32   57:aload_0         
	//   33   58:areturn         
	}

	public static boolean validateSignature(Context context, String s)
	{
		String s1 = Build.BRAND;
	//    0    0:getstatic       #51  <Field String Build.BRAND>
	//    1    3:astore          4
		int i = context.getApplicationInfo().flags;
	//    2    5:aload_0         
	//    3    6:invokevirtual   #57  <Method ApplicationInfo Context.getApplicationInfo()>
	//    4    9:getfield        #63  <Field int ApplicationInfo.flags>
	//    5   12:istore_2        
		if(s1.startsWith("generic") && (i & 2) != 0)
	//*   6   13:aload           4
	//*   7   15:ldc1            #65  <String "generic">
	//*   8   17:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//*   9   20:ifeq            31
	//*  10   23:iload_2         
	//*  11   24:iconst_2        
	//*  12   25:iand            
	//*  13   26:ifeq            31
			return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s, 64)));
	//   16   31:aload_0         
	//   17   32:invokevirtual   #75  <Method PackageManager Context.getPackageManager()>
	//   18   35:aload_1         
	//   19   36:bipush          64
	//   20   38:invokevirtual   #81  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   21   41:astore_0        
		}
	//*  22   42:aload_0         
	//*  23   43:getfield        #87  <Field Signature[] PackageInfo.signatures>
	//*  24   46:ifnull          105
	//*  25   49:aload_0         
	//*  26   50:getfield        #87  <Field Signature[] PackageInfo.signatures>
	//*  27   53:arraylength     
	//*  28   54:ifgt            59
	//*  29   57:iconst_0        
	//*  30   58:ireturn         
	//*  31   59:aload_0         
	//*  32   60:getfield        #87  <Field Signature[] PackageInfo.signatures>
	//*  33   63:astore_0        
	//*  34   64:aload_0         
	//*  35   65:arraylength     
	//*  36   66:istore_3        
	//*  37   67:iconst_0        
	//*  38   68:istore_2        
	//*  39   69:iload_2         
	//*  40   70:iload_3         
	//*  41   71:icmpge          103
	//*  42   74:aload_0         
	//*  43   75:iload_2         
	//*  44   76:aaload          
	//*  45   77:invokevirtual   #93  <Method byte[] Signature.toByteArray()>
	//*  46   80:invokestatic    #99  <Method String Utility.sha1hash(byte[])>
	//*  47   83:astore_1        
	//*  48   84:getstatic       #15  <Field HashSet validAppSignatureHashes>
	//*  49   87:aload_1         
	//*  50   88:invokevirtual   #102 <Method boolean HashSet.contains(Object)>
	//*  51   91:ifne            96
	//*  52   94:iconst_0        
	//*  53   95:ireturn         
	//*  54   96:iload_2         
	//*  55   97:iconst_1        
	//*  56   98:iadd            
	//*  57   99:istore_2        
	//*  58  100:goto            69
	//*  59  103:iconst_1        
	//*  60  104:ireturn         
	//*  61  105:iconst_0        
	//*  62  106:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  63  107:astore_0        
		{
			return false;
	//   64  108:iconst_0        
	//   65  109:ireturn         
		}
		if(((PackageInfo) (context)).signatures != null)
		{
			if(((PackageInfo) (context)).signatures.length <= 0)
				return false;
			context = ((Context) (((PackageInfo) (context)).signatures));
			int k = context.length;
			for(int j = 0; j < k; j++)
			{
				s = Utility.sha1hash(((Signature) (context[j])).toByteArray());
				if(!validAppSignatureHashes.contains(((Object) (s))))
					return false;
			}

			return true;
		} else
		{
			return false;
		}
	}

	private static final HashSet validAppSignatureHashes = buildAppSignatureHashes();

	static 
	{
	//    0    0:invokestatic    #13  <Method HashSet buildAppSignatureHashes()>
	//    1    3:putstatic       #15  <Field HashSet validAppSignatureHashes>
	//*   2    6:return          
	}
}
