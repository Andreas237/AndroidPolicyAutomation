// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom

public final class PsshAtomUtil
{
	private static class PsshAtom
	{

		private final byte schemeData[];
		private final UUID uuid;
		private final int version;


/*
		static UUID access$000(PsshAtom psshatom)
		{
			return psshatom.uuid;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field UUID uuid>
		//    2    4:areturn         
		}

*/


/*
		static int access$100(PsshAtom psshatom)
		{
			return psshatom.version;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int version>
		//    2    4:ireturn         
		}

*/


/*
		static byte[] access$200(PsshAtom psshatom)
		{
			return psshatom.schemeData;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field byte[] schemeData>
		//    2    4:areturn         
		}

*/

		public PsshAtom(UUID uuid1, int i, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			uuid = uuid1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field UUID uuid>
			version = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int version>
			schemeData = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field byte[] schemeData>
		//   11   19:return          
		}
	}


	private PsshAtomUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] buildPsshAtom(UUID uuid, byte abyte0[])
	{
		return buildPsshAtom(uuid, ((UUID []) (null)), abyte0);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #22  <Method byte[] buildPsshAtom(UUID, UUID[], byte[])>
	//    4    6:areturn         
	}

	public static byte[] buildPsshAtom(UUID uuid, UUID auuid[], byte abyte0[])
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		boolean flag;
		if(auuid != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          13
			flag = true;
	//    4    7:iconst_1        
	//    5    8:istore          4
		else
	//*   6   10:goto            16
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore          4
		int i;
		if(abyte0 != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          26
			i = abyte0.length;
	//   11   20:aload_2         
	//   12   21:arraylength     
	//   13   22:istore_3        
		else
	//*  14   23:goto            28
			i = 0;
	//   15   26:iconst_0        
	//   16   27:istore_3        
		int i1 = 32 + i;
	//   17   28:bipush          32
	//   18   30:iload_3         
	//   19   31:iadd            
	//   20   32:istore          7
		int k = i1;
	//   21   34:iload           7
	//   22   36:istore          5
		if(flag)
	//*  23   38:iload           4
	//*  24   40:ifeq            55
			k = i1 + (4 + auuid.length * 16);
	//   25   43:iload           7
	//   26   45:iconst_4        
	//   27   46:aload_1         
	//   28   47:arraylength     
	//   29   48:bipush          16
	//   30   50:imul            
	//   31   51:iadd            
	//   32   52:iadd            
	//   33   53:istore          5
		ByteBuffer bytebuffer = ByteBuffer.allocate(k);
	//   34   55:iload           5
	//   35   57:invokestatic    #29  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   36   60:astore          8
		bytebuffer.putInt(k);
	//   37   62:aload           8
	//   38   64:iload           5
	//   39   66:invokevirtual   #32  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   40   69:pop             
		bytebuffer.putInt(Atom.TYPE_pssh);
	//   41   70:aload           8
	//   42   72:getstatic       #38  <Field int Atom.TYPE_pssh>
	//   43   75:invokevirtual   #32  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   44   78:pop             
		if(flag)
	//*  45   79:iload           4
	//*  46   81:ifeq            91
			k = 0x1000000;
	//   47   84:ldc1            #39  <Int 0x1000000>
	//   48   86:istore          5
		else
	//*  49   88:goto            94
			k = 0;
	//   50   91:iconst_0        
	//   51   92:istore          5
		bytebuffer.putInt(k);
	//   52   94:aload           8
	//   53   96:iload           5
	//   54   98:invokevirtual   #32  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   55  101:pop             
		bytebuffer.putLong(uuid.getMostSignificantBits());
	//   56  102:aload           8
	//   57  104:aload_0         
	//   58  105:invokevirtual   #45  <Method long UUID.getMostSignificantBits()>
	//   59  108:invokevirtual   #49  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   60  111:pop             
		bytebuffer.putLong(uuid.getLeastSignificantBits());
	//   61  112:aload           8
	//   62  114:aload_0         
	//   63  115:invokevirtual   #52  <Method long UUID.getLeastSignificantBits()>
	//   64  118:invokevirtual   #49  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   65  121:pop             
		if(flag)
	//*  66  122:iload           4
	//*  67  124:ifeq            184
		{
			bytebuffer.putInt(auuid.length);
	//   68  127:aload           8
	//   69  129:aload_1         
	//   70  130:arraylength     
	//   71  131:invokevirtual   #32  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   72  134:pop             
			int l = auuid.length;
	//   73  135:aload_1         
	//   74  136:arraylength     
	//   75  137:istore          5
			for(int j = ((int) (flag1)); j < l; j++)
	//*  76  139:iload           6
	//*  77  141:istore          4
	//*  78  143:iload           4
	//*  79  145:iload           5
	//*  80  147:icmpge          184
			{
				uuid = auuid[j];
	//   81  150:aload_1         
	//   82  151:iload           4
	//   83  153:aaload          
	//   84  154:astore_0        
				bytebuffer.putLong(uuid.getMostSignificantBits());
	//   85  155:aload           8
	//   86  157:aload_0         
	//   87  158:invokevirtual   #45  <Method long UUID.getMostSignificantBits()>
	//   88  161:invokevirtual   #49  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   89  164:pop             
				bytebuffer.putLong(uuid.getLeastSignificantBits());
	//   90  165:aload           8
	//   91  167:aload_0         
	//   92  168:invokevirtual   #52  <Method long UUID.getLeastSignificantBits()>
	//   93  171:invokevirtual   #49  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   94  174:pop             
			}

	//   95  175:iload           4
	//   96  177:iconst_1        
	//   97  178:iadd            
	//   98  179:istore          4
		}
	//*  99  181:goto            143
		if(i != 0)
	//* 100  184:iload_3         
	//* 101  185:ifeq            203
		{
			bytebuffer.putInt(abyte0.length);
	//  102  188:aload           8
	//  103  190:aload_2         
	//  104  191:arraylength     
	//  105  192:invokevirtual   #32  <Method ByteBuffer ByteBuffer.putInt(int)>
	//  106  195:pop             
			bytebuffer.put(abyte0);
	//  107  196:aload           8
	//  108  198:aload_2         
	//  109  199:invokevirtual   #56  <Method ByteBuffer ByteBuffer.put(byte[])>
	//  110  202:pop             
		}
		return bytebuffer.array();
	//  111  203:aload           8
	//  112  205:invokevirtual   #60  <Method byte[] ByteBuffer.array()>
	//  113  208:areturn         
	}

	private static PsshAtom parsePsshAtom(byte abyte0[])
	{
		abyte0 = ((byte []) (new ParsableByteArray(abyte0)));
	//    0    0:new             #64  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method void ParsableByteArray(byte[])>
	//    4    8:astore_0        
		if(((ParsableByteArray) (abyte0)).limit() < 32)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #71  <Method int ParsableByteArray.limit()>
	//*   7   13:bipush          32
	//*   8   15:icmpge          20
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
		((ParsableByteArray) (abyte0)).setPosition(0);
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #75  <Method void ParsableByteArray.setPosition(int)>
		if(((ParsableByteArray) (abyte0)).readInt() != ((ParsableByteArray) (abyte0)).bytesLeft() + 4)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #78  <Method int ParsableByteArray.readInt()>
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #81  <Method int ParsableByteArray.bytesLeft()>
	//*  18   33:iconst_4        
	//*  19   34:iadd            
	//*  20   35:icmpeq          40
			return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
		if(((ParsableByteArray) (abyte0)).readInt() != Atom.TYPE_pssh)
	//*  23   40:aload_0         
	//*  24   41:invokevirtual   #78  <Method int ParsableByteArray.readInt()>
	//*  25   44:getstatic       #38  <Field int Atom.TYPE_pssh>
	//*  26   47:icmpeq          52
			return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
		int i = Atom.parseFullAtomVersion(((ParsableByteArray) (abyte0)).readInt());
	//   29   52:aload_0         
	//   30   53:invokevirtual   #78  <Method int ParsableByteArray.readInt()>
	//   31   56:invokestatic    #85  <Method int Atom.parseFullAtomVersion(int)>
	//   32   59:istore_1        
		if(i > 1)
	//*  33   60:iload_1         
	//*  34   61:iconst_1        
	//*  35   62:icmple          98
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//   36   65:new             #87  <Class StringBuilder>
	//   37   68:dup             
	//   38   69:invokespecial   #88  <Method void StringBuilder()>
	//   39   72:astore_0        
			((StringBuilder) (abyte0)).append("Unsupported pssh version: ");
	//   40   73:aload_0         
	//   41   74:ldc1            #90  <String "Unsupported pssh version: ">
	//   42   76:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
			((StringBuilder) (abyte0)).append(i);
	//   44   80:aload_0         
	//   45   81:iload_1         
	//   46   82:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   47   85:pop             
			Log.w("PsshAtomUtil", ((StringBuilder) (abyte0)).toString());
	//   48   86:ldc1            #11  <String "PsshAtomUtil">
	//   49   88:aload_0         
	//   50   89:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   51   92:invokestatic    #107 <Method int Log.w(String, String)>
	//   52   95:pop             
			return null;
	//   53   96:aconst_null     
	//   54   97:areturn         
		}
		UUID uuid = new UUID(((ParsableByteArray) (abyte0)).readLong(), ((ParsableByteArray) (abyte0)).readLong());
	//   55   98:new             #41  <Class UUID>
	//   56  101:dup             
	//   57  102:aload_0         
	//   58  103:invokevirtual   #110 <Method long ParsableByteArray.readLong()>
	//   59  106:aload_0         
	//   60  107:invokevirtual   #110 <Method long ParsableByteArray.readLong()>
	//   61  110:invokespecial   #113 <Method void UUID(long, long)>
	//   62  113:astore_3        
		if(i == 1)
	//*  63  114:iload_1         
	//*  64  115:iconst_1        
	//*  65  116:icmpne          130
			((ParsableByteArray) (abyte0)).skipBytes(16 * ((ParsableByteArray) (abyte0)).readUnsignedIntToInt());
	//   66  119:aload_0         
	//   67  120:bipush          16
	//   68  122:aload_0         
	//   69  123:invokevirtual   #116 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   70  126:imul            
	//   71  127:invokevirtual   #119 <Method void ParsableByteArray.skipBytes(int)>
		int j = ((ParsableByteArray) (abyte0)).readUnsignedIntToInt();
	//   72  130:aload_0         
	//   73  131:invokevirtual   #116 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   74  134:istore_2        
		if(j != ((ParsableByteArray) (abyte0)).bytesLeft())
	//*  75  135:iload_2         
	//*  76  136:aload_0         
	//*  77  137:invokevirtual   #81  <Method int ParsableByteArray.bytesLeft()>
	//*  78  140:icmpeq          145
		{
			return null;
	//   79  143:aconst_null     
	//   80  144:areturn         
		} else
		{
			byte abyte1[] = new byte[j];
	//   81  145:iload_2         
	//   82  146:newarray        byte[]
	//   83  148:astore          4
			((ParsableByteArray) (abyte0)).readBytes(abyte1, 0, j);
	//   84  150:aload_0         
	//   85  151:aload           4
	//   86  153:iconst_0        
	//   87  154:iload_2         
	//   88  155:invokevirtual   #123 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			return new PsshAtom(uuid, i, abyte1);
	//   89  158:new             #6   <Class PsshAtomUtil$PsshAtom>
	//   90  161:dup             
	//   91  162:aload_3         
	//   92  163:iload_1         
	//   93  164:aload           4
	//   94  166:invokespecial   #126 <Method void PsshAtomUtil$PsshAtom(UUID, int, byte[])>
	//   95  169:areturn         
		}
	}

	public static byte[] parseSchemeSpecificData(byte abyte0[], UUID uuid)
	{
		abyte0 = ((byte []) (parsePsshAtom(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method PsshAtomUtil$PsshAtom parsePsshAtom(byte[])>
	//    2    4:astore_0        
		if(abyte0 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(uuid != null && !uuid.equals(((Object) (((PsshAtom) (abyte0)).uuid))))
	//*   7   11:aload_1         
	//*   8   12:ifnull          82
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:invokestatic    #135 <Method UUID PsshAtomUtil$PsshAtom.access$000(PsshAtomUtil$PsshAtom)>
	//*  12   20:invokevirtual   #139 <Method boolean UUID.equals(Object)>
	//*  13   23:ifne            82
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #87  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #88  <Method void StringBuilder()>
	//   17   33:astore_2        
			stringbuilder.append("UUID mismatch. Expected: ");
	//   18   34:aload_2         
	//   19   35:ldc1            #141 <String "UUID mismatch. Expected: ">
	//   20   37:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(((Object) (uuid)));
	//   22   41:aload_2         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
			stringbuilder.append(", got: ");
	//   26   47:aload_2         
	//   27   48:ldc1            #146 <String ", got: ">
	//   28   50:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(((Object) (((PsshAtom) (abyte0)).uuid)));
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:invokestatic    #135 <Method UUID PsshAtomUtil$PsshAtom.access$000(PsshAtomUtil$PsshAtom)>
	//   33   59:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
			stringbuilder.append(".");
	//   35   63:aload_2         
	//   36   64:ldc1            #148 <String ".">
	//   37   66:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
			Log.w("PsshAtomUtil", stringbuilder.toString());
	//   39   70:ldc1            #11  <String "PsshAtomUtil">
	//   40   72:aload_2         
	//   41   73:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   42   76:invokestatic    #107 <Method int Log.w(String, String)>
	//   43   79:pop             
			return null;
	//   44   80:aconst_null     
	//   45   81:areturn         
		} else
		{
			return ((PsshAtom) (abyte0)).schemeData;
	//   46   82:aload_0         
	//   47   83:invokestatic    #152 <Method byte[] PsshAtomUtil$PsshAtom.access$200(PsshAtomUtil$PsshAtom)>
	//   48   86:areturn         
		}
	}

	public static UUID parseUuid(byte abyte0[])
	{
		abyte0 = ((byte []) (parsePsshAtom(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method PsshAtomUtil$PsshAtom parsePsshAtom(byte[])>
	//    2    4:astore_0        
		if(abyte0 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((PsshAtom) (abyte0)).uuid;
	//    7   11:aload_0         
	//    8   12:invokestatic    #135 <Method UUID PsshAtomUtil$PsshAtom.access$000(PsshAtomUtil$PsshAtom)>
	//    9   15:areturn         
	}

	public static int parseVersion(byte abyte0[])
	{
		abyte0 = ((byte []) (parsePsshAtom(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method PsshAtomUtil$PsshAtom parsePsshAtom(byte[])>
	//    2    4:astore_0        
		if(abyte0 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return ((PsshAtom) (abyte0)).version;
	//    7   11:aload_0         
	//    8   12:invokestatic    #160 <Method int PsshAtomUtil$PsshAtom.access$100(PsshAtomUtil$PsshAtom)>
	//    9   15:ireturn         
	}

	private static final String TAG = "PsshAtomUtil";
}
