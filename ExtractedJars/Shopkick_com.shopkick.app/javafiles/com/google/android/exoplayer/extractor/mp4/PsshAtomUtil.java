// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			Atom

public final class PsshAtomUtil
{

	private PsshAtomUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] buildPsshAtom(UUID uuid, byte abyte0[])
	{
		int i = abyte0.length + 32;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:bipush          32
	//    3    4:iadd            
	//    4    5:istore_2        
		ByteBuffer bytebuffer = ByteBuffer.allocate(i);
	//    5    6:iload_2         
	//    6    7:invokestatic    #21  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    7   10:astore_3        
		bytebuffer.putInt(i);
	//    8   11:aload_3         
	//    9   12:iload_2         
	//   10   13:invokevirtual   #24  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   11   16:pop             
		bytebuffer.putInt(Atom.TYPE_pssh);
	//   12   17:aload_3         
	//   13   18:getstatic       #30  <Field int Atom.TYPE_pssh>
	//   14   21:invokevirtual   #24  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   15   24:pop             
		bytebuffer.putInt(0);
	//   16   25:aload_3         
	//   17   26:iconst_0        
	//   18   27:invokevirtual   #24  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   19   30:pop             
		bytebuffer.putLong(uuid.getMostSignificantBits());
	//   20   31:aload_3         
	//   21   32:aload_0         
	//   22   33:invokevirtual   #36  <Method long UUID.getMostSignificantBits()>
	//   23   36:invokevirtual   #40  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   24   39:pop             
		bytebuffer.putLong(uuid.getLeastSignificantBits());
	//   25   40:aload_3         
	//   26   41:aload_0         
	//   27   42:invokevirtual   #43  <Method long UUID.getLeastSignificantBits()>
	//   28   45:invokevirtual   #40  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   29   48:pop             
		bytebuffer.putInt(abyte0.length);
	//   30   49:aload_3         
	//   31   50:aload_1         
	//   32   51:arraylength     
	//   33   52:invokevirtual   #24  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   34   55:pop             
		bytebuffer.put(abyte0);
	//   35   56:aload_3         
	//   36   57:aload_1         
	//   37   58:invokevirtual   #47  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   38   61:pop             
		return bytebuffer.array();
	//   39   62:aload_3         
	//   40   63:invokevirtual   #51  <Method byte[] ByteBuffer.array()>
	//   41   66:areturn         
	}

	private static Pair parsePsshAtom(byte abyte0[])
	{
		abyte0 = ((byte []) (new ParsableByteArray(abyte0)));
	//    0    0:new             #55  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #58  <Method void ParsableByteArray(byte[])>
	//    4    8:astore_0        
		if(((ParsableByteArray) (abyte0)).limit() < 32)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #62  <Method int ParsableByteArray.limit()>
	//*   7   13:bipush          32
	//*   8   15:icmpge          20
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
		((ParsableByteArray) (abyte0)).setPosition(0);
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #66  <Method void ParsableByteArray.setPosition(int)>
		if(((ParsableByteArray) (abyte0)).readInt() != ((ParsableByteArray) (abyte0)).bytesLeft() + 4)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #69  <Method int ParsableByteArray.readInt()>
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #72  <Method int ParsableByteArray.bytesLeft()>
	//*  18   33:iconst_4        
	//*  19   34:iadd            
	//*  20   35:icmpeq          40
			return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
		if(((ParsableByteArray) (abyte0)).readInt() != Atom.TYPE_pssh)
	//*  23   40:aload_0         
	//*  24   41:invokevirtual   #69  <Method int ParsableByteArray.readInt()>
	//*  25   44:getstatic       #30  <Field int Atom.TYPE_pssh>
	//*  26   47:icmpeq          52
			return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
		int i = Atom.parseFullAtomVersion(((ParsableByteArray) (abyte0)).readInt());
	//   29   52:aload_0         
	//   30   53:invokevirtual   #69  <Method int ParsableByteArray.readInt()>
	//   31   56:invokestatic    #76  <Method int Atom.parseFullAtomVersion(int)>
	//   32   59:istore_1        
		if(i > 1)
	//*  33   60:iload_1         
	//*  34   61:iconst_1        
	//*  35   62:icmple          98
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//   36   65:new             #78  <Class StringBuilder>
	//   37   68:dup             
	//   38   69:invokespecial   #79  <Method void StringBuilder()>
	//   39   72:astore_0        
			((StringBuilder) (abyte0)).append("Unsupported pssh version: ");
	//   40   73:aload_0         
	//   41   74:ldc1            #81  <String "Unsupported pssh version: ">
	//   42   76:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
			((StringBuilder) (abyte0)).append(i);
	//   44   80:aload_0         
	//   45   81:iload_1         
	//   46   82:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   47   85:pop             
			Log.w("PsshAtomUtil", ((StringBuilder) (abyte0)).toString());
	//   48   86:ldc1            #8   <String "PsshAtomUtil">
	//   49   88:aload_0         
	//   50   89:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   51   92:invokestatic    #98  <Method int Log.w(String, String)>
	//   52   95:pop             
			return null;
	//   53   96:aconst_null     
	//   54   97:areturn         
		}
		UUID uuid = new UUID(((ParsableByteArray) (abyte0)).readLong(), ((ParsableByteArray) (abyte0)).readLong());
	//   55   98:new             #32  <Class UUID>
	//   56  101:dup             
	//   57  102:aload_0         
	//   58  103:invokevirtual   #101 <Method long ParsableByteArray.readLong()>
	//   59  106:aload_0         
	//   60  107:invokevirtual   #101 <Method long ParsableByteArray.readLong()>
	//   61  110:invokespecial   #104 <Method void UUID(long, long)>
	//   62  113:astore_2        
		if(i == 1)
	//*  63  114:iload_1         
	//*  64  115:iconst_1        
	//*  65  116:icmpne          130
			((ParsableByteArray) (abyte0)).skipBytes(((ParsableByteArray) (abyte0)).readUnsignedIntToInt() * 16);
	//   66  119:aload_0         
	//   67  120:aload_0         
	//   68  121:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   69  124:bipush          16
	//   70  126:imul            
	//   71  127:invokevirtual   #110 <Method void ParsableByteArray.skipBytes(int)>
		i = ((ParsableByteArray) (abyte0)).readUnsignedIntToInt();
	//   72  130:aload_0         
	//   73  131:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   74  134:istore_1        
		if(i != ((ParsableByteArray) (abyte0)).bytesLeft())
	//*  75  135:iload_1         
	//*  76  136:aload_0         
	//*  77  137:invokevirtual   #72  <Method int ParsableByteArray.bytesLeft()>
	//*  78  140:icmpeq          145
		{
			return null;
	//   79  143:aconst_null     
	//   80  144:areturn         
		} else
		{
			byte abyte1[] = new byte[i];
	//   81  145:iload_1         
	//   82  146:newarray        byte[]
	//   83  148:astore_3        
			((ParsableByteArray) (abyte0)).readBytes(abyte1, 0, i);
	//   84  149:aload_0         
	//   85  150:aload_3         
	//   86  151:iconst_0        
	//   87  152:iload_1         
	//   88  153:invokevirtual   #114 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			return Pair.create(((Object) (uuid)), ((Object) (abyte1)));
	//   89  156:aload_2         
	//   90  157:aload_3         
	//   91  158:invokestatic    #120 <Method Pair Pair.create(Object, Object)>
	//   92  161:areturn         
		}
	}

	public static byte[] parseSchemeSpecificData(byte abyte0[], UUID uuid)
	{
		abyte0 = ((byte []) (parsePsshAtom(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method Pair parsePsshAtom(byte[])>
	//    2    4:astore_0        
		if(abyte0 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(uuid != null && !uuid.equals(((Pair) (abyte0)).first))
	//*   7   11:aload_1         
	//*   8   12:ifnull          82
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #130 <Field Object Pair.first>
	//*  12   20:invokevirtual   #134 <Method boolean UUID.equals(Object)>
	//*  13   23:ifne            82
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #78  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #79  <Method void StringBuilder()>
	//   17   33:astore_2        
			stringbuilder.append("UUID mismatch. Expected: ");
	//   18   34:aload_2         
	//   19   35:ldc1            #136 <String "UUID mismatch. Expected: ">
	//   20   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(((Object) (uuid)));
	//   22   41:aload_2         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
			stringbuilder.append(", got: ");
	//   26   47:aload_2         
	//   27   48:ldc1            #141 <String ", got: ">
	//   28   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(((Pair) (abyte0)).first);
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #130 <Field Object Pair.first>
	//   33   59:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
			stringbuilder.append(".");
	//   35   63:aload_2         
	//   36   64:ldc1            #143 <String ".">
	//   37   66:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
			Log.w("PsshAtomUtil", stringbuilder.toString());
	//   39   70:ldc1            #8   <String "PsshAtomUtil">
	//   40   72:aload_2         
	//   41   73:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   42   76:invokestatic    #98  <Method int Log.w(String, String)>
	//   43   79:pop             
			return null;
	//   44   80:aconst_null     
	//   45   81:areturn         
		} else
		{
			return (byte[])((Pair) (abyte0)).second;
	//   46   82:aload_0         
	//   47   83:getfield        #146 <Field Object Pair.second>
	//   48   86:checkcast       #148 <Class byte[]>
	//   49   89:areturn         
		}
	}

	public static UUID parseUuid(byte abyte0[])
	{
		abyte0 = ((byte []) (parsePsshAtom(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method Pair parsePsshAtom(byte[])>
	//    2    4:astore_0        
		if(abyte0 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (UUID)((Pair) (abyte0)).first;
	//    7   11:aload_0         
	//    8   12:getfield        #130 <Field Object Pair.first>
	//    9   15:checkcast       #32  <Class UUID>
	//   10   18:areturn         
	}

	private static final String TAG = "PsshAtomUtil";
}
