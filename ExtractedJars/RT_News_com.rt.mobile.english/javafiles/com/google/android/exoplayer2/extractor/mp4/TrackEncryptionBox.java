// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import com.google.android.exoplayer2.util.Assertions;

public final class TrackEncryptionBox
{

	public TrackEncryptionBox(boolean flag, String s, int i, byte abyte0[], int j, int k, byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		boolean flag2 = false;
	//    2    4:iconst_0        
	//    3    5:istore          9
		boolean flag1;
		if(i == 0)
	//*   4    7:iload_3         
	//*   5    8:ifne            17
			flag1 = true;
	//    6   11:iconst_1        
	//    7   12:istore          8
		else
	//*   8   14:goto            20
			flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          8
		if(abyte1 == null)
	//*  11   20:aload           7
	//*  12   22:ifnonnull       28
			flag2 = true;
	//   13   25:iconst_1        
	//   14   26:istore          9
		Assertions.checkArgument(flag2 ^ flag1);
	//   15   28:iload           9
	//   16   30:iload           8
	//   17   32:ixor            
	//   18   33:invokestatic    #29  <Method void Assertions.checkArgument(boolean)>
		isEncrypted = flag;
	//   19   36:aload_0         
	//   20   37:iload_1         
	//   21   38:putfield        #31  <Field boolean isEncrypted>
		schemeType = s;
	//   22   41:aload_0         
	//   23   42:aload_2         
	//   24   43:putfield        #33  <Field String schemeType>
		initializationVectorSize = i;
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:putfield        #35  <Field int initializationVectorSize>
		defaultInitializationVector = abyte1;
	//   28   51:aload_0         
	//   29   52:aload           7
	//   30   54:putfield        #37  <Field byte[] defaultInitializationVector>
		cryptoData = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData(schemeToCryptoMode(s), abyte0, j, k);
	//   31   57:aload_0         
	//   32   58:new             #39  <Class com.google.android.exoplayer2.extractor.TrackOutput$CryptoData>
	//   33   61:dup             
	//   34   62:aload_2         
	//   35   63:invokestatic    #43  <Method int schemeToCryptoMode(String)>
	//   36   66:aload           4
	//   37   68:iload           5
	//   38   70:iload           6
	//   39   72:invokespecial   #46  <Method void com.google.android.exoplayer2.extractor.TrackOutput$CryptoData(int, byte[], int, int)>
	//   40   75:putfield        #48  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData cryptoData>
	//   41   78:return          
	}

	private static int schemeToCryptoMode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 1;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		byte byte0 = -1;
	//    4    6:iconst_m1       
	//    5    7:istore_1        
		int i = s.hashCode();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #56  <Method int String.hashCode()>
	//    8   12:istore_2        
		if(i != 0x2e7ccd)
	//*   9   13:iload_2         
	//*  10   14:ldc1            #57  <Int 0x2e7ccd>
	//*  11   16:icmpeq          82
		{
			if(i != 0x2e7d0f)
	//*  12   19:iload_2         
	//*  13   20:ldc1            #58  <Int 0x2e7d0f>
	//*  14   22:icmpeq          68
			{
				if(i != 0x2e8997)
	//*  15   25:iload_2         
	//*  16   26:ldc1            #59  <Int 0x2e8997>
	//*  17   28:icmpeq          54
				{
					if(i == 0x2e89a7 && s.equals("cens"))
	//*  18   31:iload_2         
	//*  19   32:ldc1            #60  <Int 0x2e89a7>
	//*  20   34:icmpeq          40
	//*  21   37:goto            93
	//*  22   40:aload_0         
	//*  23   41:ldc1            #62  <String "cens">
	//*  24   43:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  25   46:ifeq            93
						byte0 = 1;
	//   26   49:iconst_1        
	//   27   50:istore_1        
				} else
	//*  28   51:goto            93
				if(s.equals("cenc"))
	//*  29   54:aload_0         
	//*  30   55:ldc1            #68  <String "cenc">
	//*  31   57:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  32   60:ifeq            93
					byte0 = 0;
	//   33   63:iconst_0        
	//   34   64:istore_1        
			} else
	//*  35   65:goto            93
			if(s.equals("cbcs"))
	//*  36   68:aload_0         
	//*  37   69:ldc1            #70  <String "cbcs">
	//*  38   71:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  39   74:ifeq            93
				byte0 = 3;
	//   40   77:iconst_3        
	//   41   78:istore_1        
		} else
	//*  42   79:goto            93
		if(s.equals("cbc1"))
	//*  43   82:aload_0         
	//*  44   83:ldc1            #72  <String "cbc1">
	//*  45   85:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  46   88:ifeq            93
			byte0 = 2;
	//   47   91:iconst_2        
	//   48   92:istore_1        
		switch(byte0)
	//*  49   93:iload_1         
		{
	//*  50   94:tableswitch     0 3: default 124
	//	               0 166
	//	               1 166
	//	               2 164
	//	               3 164
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   51  124:new             #74  <Class StringBuilder>
	//   52  127:dup             
	//   53  128:invokespecial   #75  <Method void StringBuilder()>
	//   54  131:astore_3        
			stringbuilder.append("Unsupported protection scheme type '");
	//   55  132:aload_3         
	//   56  133:ldc1            #77  <String "Unsupported protection scheme type '">
	//   57  135:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   58  138:pop             
			stringbuilder.append(s);
	//   59  139:aload_3         
	//   60  140:aload_0         
	//   61  141:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   62  144:pop             
			stringbuilder.append("'. Assuming AES-CTR crypto mode.");
	//   63  145:aload_3         
	//   64  146:ldc1            #83  <String "'. Assuming AES-CTR crypto mode.">
	//   65  148:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   66  151:pop             
			Log.w("TrackEncryptionBox", stringbuilder.toString());
	//   67  152:ldc1            #8   <String "TrackEncryptionBox">
	//   68  154:aload_3         
	//   69  155:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   70  158:invokestatic    #93  <Method int Log.w(String, String)>
	//   71  161:pop             
			return 1;
	//   72  162:iconst_1        
	//   73  163:ireturn         

		case 2: // '\002'
		case 3: // '\003'
			return 2;
	//   74  164:iconst_2        
	//   75  165:ireturn         

		case 0: // '\0'
		case 1: // '\001'
			return 1;
	//   76  166:iconst_1        
	//   77  167:ireturn         
		}
	}

	private static final String TAG = "TrackEncryptionBox";
	public final com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
	public final byte defaultInitializationVector[];
	public final int initializationVectorSize;
	public final boolean isEncrypted;
	public final String schemeType;
}
