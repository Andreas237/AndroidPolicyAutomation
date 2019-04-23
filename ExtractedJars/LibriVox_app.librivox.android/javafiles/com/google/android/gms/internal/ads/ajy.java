// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ait, ajv, aiz

final class ajy
	implements ait
{

	public ajy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final aiz a(String s, String s1, int i)
	{
		String s2 = s1.toLowerCase();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #19  <Method String String.toLowerCase()>
	//    2    4:astore          6
		int j = s2.hashCode();
	//    3    6:aload           6
	//    4    8:invokevirtual   #23  <Method int String.hashCode()>
	//    5   11:istore          4
		byte byte1 = -1;
	//    6   13:iconst_m1       
	//    7   14:istore          5
		if(j == 0x54acdce9 && s2.equals("hybridencrypt"))
	//*   8   16:iload           4
	//*   9   18:ldc1            #24  <Int 0x54acdce9>
	//*  10   20:icmpeq          26
	//*  11   23:goto            42
	//*  12   26:aload           6
	//*  13   28:ldc1            #26  <String "hybridencrypt">
	//*  14   30:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            42
			j = 0;
	//   16   36:iconst_0        
	//   17   37:istore          4
		else
	//*  18   39:goto            45
			j = -1;
	//   19   42:iconst_m1       
	//   20   43:istore          4
		if(j == 0)
	//*  21   45:iload           4
	//*  22   47:ifne            150
		{
			byte byte0;
			if(s.hashCode() != 0x17a169bf)
	//*  23   50:aload_1         
	//*  24   51:invokevirtual   #23  <Method int String.hashCode()>
	//*  25   54:ldc1            #31  <Int 0x17a169bf>
	//*  26   56:icmpeq          66
			{
				byte0 = byte1;
	//   27   59:iload           5
	//   28   61:istore          4
			} else
	//*  29   63:goto            82
			{
				byte0 = byte1;
	//   30   66:iload           5
	//   31   68:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"))
	//*  32   70:aload_1         
	//*  33   71:ldc1            #33  <String "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey">
	//*  34   73:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  35   76:ifeq            82
					byte0 = 0;
	//   36   79:iconst_0        
	//   37   80:istore          4
			}
			if(byte0 == 0)
	//*  38   82:iload           4
	//*  39   84:ifne            129
			{
				s1 = ((String) (new ajv()));
	//   40   87:new             #35  <Class ajv>
	//   41   90:dup             
	//   42   91:invokespecial   #36  <Method void ajv()>
	//   43   94:astore_2        
				if(i <= 0)
	//*  44   95:iload_3         
	//*  45   96:ifgt            101
					return ((aiz) (s1));
	//   46   99:aload_2         
	//   47  100:areturn         
				else
					throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[] {
						s, Integer.valueOf(i)
					}));
	//   48  101:new             #38  <Class GeneralSecurityException>
	//   49  104:dup             
	//   50  105:ldc1            #40  <String "No key manager for key type '%s' with version at least %d.">
	//   51  107:iconst_2        
	//   52  108:anewarray       Object[]
	//   53  111:dup             
	//   54  112:iconst_0        
	//   55  113:aload_1         
	//   56  114:aastore         
	//   57  115:dup             
	//   58  116:iconst_1        
	//   59  117:iload_3         
	//   60  118:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   61  121:aastore         
	//   62  122:invokestatic    #50  <Method String String.format(String, Object[])>
	//   63  125:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   64  128:athrow          
			} else
			{
				throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[] {
					s
				}));
	//   65  129:new             #38  <Class GeneralSecurityException>
	//   66  132:dup             
	//   67  133:ldc1            #55  <String "No support for primitive 'HybridEncrypt' with key type '%s'.">
	//   68  135:iconst_1        
	//   69  136:anewarray       Object[]
	//   70  139:dup             
	//   71  140:iconst_0        
	//   72  141:aload_1         
	//   73  142:aastore         
	//   74  143:invokestatic    #50  <Method String String.format(String, Object[])>
	//   75  146:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   76  149:athrow          
			}
		} else
		{
			throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[] {
				s1
			}));
	//   77  150:new             #38  <Class GeneralSecurityException>
	//   78  153:dup             
	//   79  154:ldc1            #57  <String "No support for primitive '%s'.">
	//   80  156:iconst_1        
	//   81  157:anewarray       Object[]
	//   82  160:dup             
	//   83  161:iconst_0        
	//   84  162:aload_2         
	//   85  163:aastore         
	//   86  164:invokestatic    #50  <Method String String.format(String, Object[])>
	//   87  167:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   88  170:athrow          
		}
	}
}
