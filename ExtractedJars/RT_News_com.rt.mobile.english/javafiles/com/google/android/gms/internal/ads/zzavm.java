// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaua, zzavk, zzaug

final class zzavm
	implements zzaua
{

	public zzavm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final zzaug zzb(String s, String s1, int i)
		throws GeneralSecurityException
	{
		String s2 = s1.toLowerCase();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #22  <Method String String.toLowerCase()>
	//    2    4:astore          6
		int j = s2.hashCode();
	//    3    6:aload           6
	//    4    8:invokevirtual   #26  <Method int String.hashCode()>
	//    5   11:istore          4
		byte byte0 = -1;
	//    6   13:iconst_m1       
	//    7   14:istore          5
		if(j == 0x1a54f && s2.equals("mac"))
	//*   8   16:iload           4
	//*   9   18:ldc1            #27  <Int 0x1a54f>
	//*  10   20:icmpeq          26
	//*  11   23:goto            42
	//*  12   26:aload           6
	//*  13   28:ldc1            #29  <String "mac">
	//*  14   30:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            42
			j = 0;
	//   16   36:iconst_0        
	//   17   37:istore          4
		else
	//*  18   39:goto            45
			j = -1;
	//   19   42:iconst_m1       
	//   20   43:istore          4
		if(j != 0)
	//*  21   45:iload           4
	//*  22   47:ifeq            71
			throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[] {
				s1
			}));
	//   23   50:new             #16  <Class GeneralSecurityException>
	//   24   53:dup             
	//   25   54:ldc1            #35  <String "No support for primitive '%s'.">
	//   26   56:iconst_1        
	//   27   57:anewarray       Object[]
	//   28   60:dup             
	//   29   61:iconst_0        
	//   30   62:aload_2         
	//   31   63:aastore         
	//   32   64:invokestatic    #39  <Method String String.format(String, Object[])>
	//   33   67:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   34   70:athrow          
		if(s.hashCode() != 0x31ddd86a)
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #26  <Method int String.hashCode()>
	//*  37   75:ldc1            #43  <Int 0x31ddd86a>
	//*  38   77:icmpeq          87
		{
			j = ((int) (byte0));
	//   39   80:iload           5
	//   40   82:istore          4
		} else
	//*  41   84:goto            103
		{
			j = ((int) (byte0));
	//   42   87:iload           5
	//   43   89:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.HmacKey"))
	//*  44   91:aload_1         
	//*  45   92:ldc1            #45  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//*  46   94:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  47   97:ifeq            103
				j = 0;
	//   48  100:iconst_0        
	//   49  101:istore          4
		}
		if(j != 0)
	//*  50  103:iload           4
	//*  51  105:ifeq            129
			throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[] {
				s
			}));
	//   52  108:new             #16  <Class GeneralSecurityException>
	//   53  111:dup             
	//   54  112:ldc1            #47  <String "No support for primitive 'Mac' with key type '%s'.">
	//   55  114:iconst_1        
	//   56  115:anewarray       Object[]
	//   57  118:dup             
	//   58  119:iconst_0        
	//   59  120:aload_1         
	//   60  121:aastore         
	//   61  122:invokestatic    #39  <Method String String.format(String, Object[])>
	//   62  125:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   63  128:athrow          
		s1 = ((String) (new zzavk()));
	//   64  129:new             #49  <Class zzavk>
	//   65  132:dup             
	//   66  133:invokespecial   #50  <Method void zzavk()>
	//   67  136:astore_2        
		if(i > 0)
	//*  68  137:iload_3         
	//*  69  138:ifle            169
			throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[] {
				s, Integer.valueOf(i)
			}));
	//   70  141:new             #16  <Class GeneralSecurityException>
	//   71  144:dup             
	//   72  145:ldc1            #52  <String "No key manager for key type '%s' with version at least %d.">
	//   73  147:iconst_2        
	//   74  148:anewarray       Object[]
	//   75  151:dup             
	//   76  152:iconst_0        
	//   77  153:aload_1         
	//   78  154:aastore         
	//   79  155:dup             
	//   80  156:iconst_1        
	//   81  157:iload_3         
	//   82  158:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   83  161:aastore         
	//   84  162:invokestatic    #39  <Method String String.format(String, Object[])>
	//   85  165:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   86  168:athrow          
		else
			return ((zzaug) (s1));
	//   87  169:aload_2         
	//   88  170:areturn         
	}
}
