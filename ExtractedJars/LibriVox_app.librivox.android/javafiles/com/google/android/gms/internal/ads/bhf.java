// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bgj

public final class bhf
{

	public static UUID a(byte abyte0[])
	{
		abyte0 = ((byte []) (new bno(abyte0)));
	//    0    0:new             #8   <Class bno>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void bno(byte[])>
	//    4    8:astore_0        
		if(((bno) (abyte0)).c() < 32)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #16  <Method int bno.c()>
	//*   7   13:bipush          32
	//*   8   15:icmpge          23
		{
			abyte0 = null;
	//    9   18:aconst_null     
	//   10   19:astore_0        
		} else
	//*  11   20:goto            178
		{
			((bno) (abyte0)).c(0);
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #19  <Method void bno.c(int)>
			if(((bno) (abyte0)).l() != ((bno) (abyte0)).b() + 4)
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #22  <Method int bno.l()>
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #25  <Method int bno.b()>
	//*  19   36:iconst_4        
	//*  20   37:iadd            
	//*  21   38:icmpeq          46
				abyte0 = null;
	//   22   41:aconst_null     
	//   23   42:astore_0        
			else
	//*  24   43:goto            178
			if(((bno) (abyte0)).l() != bgj.U)
	//*  25   46:aload_0         
	//*  26   47:invokevirtual   #22  <Method int bno.l()>
	//*  27   50:getstatic       #31  <Field int bgj.U>
	//*  28   53:icmpeq          61
			{
				abyte0 = null;
	//   29   56:aconst_null     
	//   30   57:astore_0        
			} else
	//*  31   58:goto            178
			{
				int i = bgj.a(((bno) (abyte0)).l());
	//   32   61:aload_0         
	//   33   62:invokevirtual   #22  <Method int bno.l()>
	//   34   65:invokestatic    #34  <Method int bgj.a(int)>
	//   35   68:istore_1        
				if(i > 1)
	//*  36   69:iload_1         
	//*  37   70:iconst_1        
	//*  38   71:icmple          112
				{
					abyte0 = ((byte []) (new StringBuilder(37)));
	//   39   74:new             #36  <Class StringBuilder>
	//   40   77:dup             
	//   41   78:bipush          37
	//   42   80:invokespecial   #38  <Method void StringBuilder(int)>
	//   43   83:astore_0        
					((StringBuilder) (abyte0)).append("Unsupported pssh version: ");
	//   44   84:aload_0         
	//   45   85:ldc1            #40  <String "Unsupported pssh version: ">
	//   46   87:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
					((StringBuilder) (abyte0)).append(i);
	//   48   91:aload_0         
	//   49   92:iload_1         
	//   50   93:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   51   96:pop             
					Log.w("PsshAtomUtil", ((StringBuilder) (abyte0)).toString());
	//   52   97:ldc1            #49  <String "PsshAtomUtil">
	//   53   99:aload_0         
	//   54  100:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   55  103:invokestatic    #59  <Method int Log.w(String, String)>
	//   56  106:pop             
					abyte0 = null;
	//   57  107:aconst_null     
	//   58  108:astore_0        
				} else
	//*  59  109:goto            178
				{
					UUID uuid = new UUID(((bno) (abyte0)).m(), ((bno) (abyte0)).m());
	//   60  112:new             #61  <Class UUID>
	//   61  115:dup             
	//   62  116:aload_0         
	//   63  117:invokevirtual   #65  <Method long bno.m()>
	//   64  120:aload_0         
	//   65  121:invokevirtual   #65  <Method long bno.m()>
	//   66  124:invokespecial   #68  <Method void UUID(long, long)>
	//   67  127:astore_2        
					if(i == 1)
	//*  68  128:iload_1         
	//*  69  129:iconst_1        
	//*  70  130:icmpne          143
						((bno) (abyte0)).d(((bno) (abyte0)).o() << 4);
	//   71  133:aload_0         
	//   72  134:aload_0         
	//   73  135:invokevirtual   #71  <Method int bno.o()>
	//   74  138:iconst_4        
	//   75  139:ishl            
	//   76  140:invokevirtual   #74  <Method void bno.d(int)>
					i = ((bno) (abyte0)).o();
	//   77  143:aload_0         
	//   78  144:invokevirtual   #71  <Method int bno.o()>
	//   79  147:istore_1        
					if(i != ((bno) (abyte0)).b())
	//*  80  148:iload_1         
	//*  81  149:aload_0         
	//*  82  150:invokevirtual   #25  <Method int bno.b()>
	//*  83  153:icmpeq          161
					{
						abyte0 = null;
	//   84  156:aconst_null     
	//   85  157:astore_0        
					} else
	//*  86  158:goto            178
					{
						byte abyte1[] = new byte[i];
	//   87  161:iload_1         
	//   88  162:newarray        byte[]
	//   89  164:astore_3        
						((bno) (abyte0)).a(abyte1, 0, i);
	//   90  165:aload_0         
	//   91  166:aload_3         
	//   92  167:iconst_0        
	//   93  168:iload_1         
	//   94  169:invokevirtual   #77  <Method void bno.a(byte[], int, int)>
						abyte0 = ((byte []) (Pair.create(((Object) (uuid)), ((Object) (abyte1)))));
	//   95  172:aload_2         
	//   96  173:aload_3         
	//   97  174:invokestatic    #83  <Method Pair Pair.create(Object, Object)>
	//   98  177:astore_0        
					}
				}
			}
		}
		if(abyte0 == null)
	//*  99  178:aload_0         
	//* 100  179:ifnonnull       184
			return null;
	//  101  182:aconst_null     
	//  102  183:areturn         
		else
			return (UUID)((Pair) (abyte0)).first;
	//  103  184:aload_0         
	//  104  185:getfield        #87  <Field Object Pair.first>
	//  105  188:checkcast       #61  <Class UUID>
	//  106  191:areturn         
	}

	public static byte[] a(UUID uuid, byte abyte0[])
	{
		int i = abyte0.length + 32;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:bipush          32
	//    3    4:iadd            
	//    4    5:istore_2        
		ByteBuffer bytebuffer = ByteBuffer.allocate(i);
	//    5    6:iload_2         
	//    6    7:invokestatic    #95  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    7   10:astore_3        
		bytebuffer.putInt(i);
	//    8   11:aload_3         
	//    9   12:iload_2         
	//   10   13:invokevirtual   #98  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   11   16:pop             
		bytebuffer.putInt(bgj.U);
	//   12   17:aload_3         
	//   13   18:getstatic       #31  <Field int bgj.U>
	//   14   21:invokevirtual   #98  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   15   24:pop             
		bytebuffer.putInt(0);
	//   16   25:aload_3         
	//   17   26:iconst_0        
	//   18   27:invokevirtual   #98  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   19   30:pop             
		bytebuffer.putLong(uuid.getMostSignificantBits());
	//   20   31:aload_3         
	//   21   32:aload_0         
	//   22   33:invokevirtual   #101 <Method long UUID.getMostSignificantBits()>
	//   23   36:invokevirtual   #105 <Method ByteBuffer ByteBuffer.putLong(long)>
	//   24   39:pop             
		bytebuffer.putLong(uuid.getLeastSignificantBits());
	//   25   40:aload_3         
	//   26   41:aload_0         
	//   27   42:invokevirtual   #108 <Method long UUID.getLeastSignificantBits()>
	//   28   45:invokevirtual   #105 <Method ByteBuffer ByteBuffer.putLong(long)>
	//   29   48:pop             
		bytebuffer.putInt(abyte0.length);
	//   30   49:aload_3         
	//   31   50:aload_1         
	//   32   51:arraylength     
	//   33   52:invokevirtual   #98  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   34   55:pop             
		bytebuffer.put(abyte0);
	//   35   56:aload_3         
	//   36   57:aload_1         
	//   37   58:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   38   61:pop             
		return bytebuffer.array();
	//   39   62:aload_3         
	//   40   63:invokevirtual   #116 <Method byte[] ByteBuffer.array()>
	//   41   66:areturn         
	}
}
