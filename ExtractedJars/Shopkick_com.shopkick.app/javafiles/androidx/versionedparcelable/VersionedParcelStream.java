// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.*;
import android.util.SparseArray;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcel

class VersionedParcelStream extends VersionedParcel
{
	private static class FieldBuffer
	{

		void flushField()
			throws IOException
		{
			mDataStream.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field DataOutputStream mDataStream>
		//    2    4:invokevirtual   #42  <Method void DataOutputStream.flush()>
			int j = mOutput.size();
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field ByteArrayOutputStream mOutput>
		//    5   11:invokevirtual   #46  <Method int ByteArrayOutputStream.size()>
		//    6   14:istore_2        
			int k = mFieldId;
		//    7   15:aload_0         
		//    8   16:getfield        #33  <Field int mFieldId>
		//    9   19:istore_3        
			int i;
			if(j >= 65535)
		//*  10   20:iload_2         
		//*  11   21:ldc1            #47  <Int 65535>
		//*  12   23:icmplt          32
				i = 65535;
		//   13   26:ldc1            #47  <Int 65535>
		//   14   28:istore_1        
			else
		//*  15   29:goto            34
				i = j;
		//   16   32:iload_2         
		//   17   33:istore_1        
			mTarget.writeInt(k << 16 | i);
		//   18   34:aload_0         
		//   19   35:getfield        #35  <Field DataOutputStream mTarget>
		//   20   38:iload_3         
		//   21   39:bipush          16
		//   22   41:ishl            
		//   23   42:iload_1         
		//   24   43:ior             
		//   25   44:invokevirtual   #51  <Method void DataOutputStream.writeInt(int)>
			if(j >= 65535)
		//*  26   47:iload_2         
		//*  27   48:ldc1            #47  <Int 65535>
		//*  28   50:icmplt          61
				mTarget.writeInt(j);
		//   29   53:aload_0         
		//   30   54:getfield        #35  <Field DataOutputStream mTarget>
		//   31   57:iload_2         
		//   32   58:invokevirtual   #51  <Method void DataOutputStream.writeInt(int)>
			mOutput.writeTo(((OutputStream) (mTarget)));
		//   33   61:aload_0         
		//   34   62:getfield        #24  <Field ByteArrayOutputStream mOutput>
		//   35   65:aload_0         
		//   36   66:getfield        #35  <Field DataOutputStream mTarget>
		//   37   69:invokevirtual   #54  <Method void ByteArrayOutputStream.writeTo(OutputStream)>
		//   38   72:return          
		}

		final DataOutputStream mDataStream;
		private final int mFieldId;
		final ByteArrayOutputStream mOutput = new ByteArrayOutputStream();
		private final DataOutputStream mTarget;

		FieldBuffer(int i, DataOutputStream dataoutputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class ByteArrayOutputStream>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void ByteArrayOutputStream()>
		//    6   12:putfield        #24  <Field ByteArrayOutputStream mOutput>
			mDataStream = new DataOutputStream(((OutputStream) (mOutput)));
		//    7   15:aload_0         
		//    8   16:new             #26  <Class DataOutputStream>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:getfield        #24  <Field ByteArrayOutputStream mOutput>
		//   12   24:invokespecial   #29  <Method void DataOutputStream(OutputStream)>
		//   13   27:putfield        #31  <Field DataOutputStream mDataStream>
			mFieldId = i;
		//   14   30:aload_0         
		//   15   31:iload_1         
		//   16   32:putfield        #33  <Field int mFieldId>
			mTarget = dataoutputstream;
		//   17   35:aload_0         
		//   18   36:aload_2         
		//   19   37:putfield        #35  <Field DataOutputStream mTarget>
		//   20   40:return          
		}
	}

	private static class InputBuffer
	{

		final int mFieldId;
		final DataInputStream mInputStream;
		private final int mSize;

		InputBuffer(int i, int j, DataInputStream datainputstream)
			throws IOException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mSize = j;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #21  <Field int mSize>
			mFieldId = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #23  <Field int mFieldId>
			byte abyte0[] = new byte[mSize];
		//    8   14:aload_0         
		//    9   15:getfield        #21  <Field int mSize>
		//   10   18:newarray        byte[]
		//   11   20:astore          4
			datainputstream.readFully(abyte0);
		//   12   22:aload_3         
		//   13   23:aload           4
		//   14   25:invokevirtual   #29  <Method void DataInputStream.readFully(byte[])>
			mInputStream = new DataInputStream(((InputStream) (new ByteArrayInputStream(abyte0))));
		//   15   28:aload_0         
		//   16   29:new             #25  <Class DataInputStream>
		//   17   32:dup             
		//   18   33:new             #31  <Class ByteArrayInputStream>
		//   19   36:dup             
		//   20   37:aload           4
		//   21   39:invokespecial   #33  <Method void ByteArrayInputStream(byte[])>
		//   22   42:invokespecial   #36  <Method void DataInputStream(InputStream)>
		//   23   45:putfield        #38  <Field DataInputStream mInputStream>
		//   24   48:return          
		}
	}


	public VersionedParcelStream(InputStream inputstream, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void VersionedParcel()>
	//    2    4:aload_0         
	//    3    5:new             #79  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #80  <Method void SparseArray()>
	//    6   12:putfield        #82  <Field SparseArray mCachedFields>
		Object obj = null;
	//    7   15:aconst_null     
	//    8   16:astore_3        
		if(inputstream != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          33
			inputstream = ((InputStream) (new DataInputStream(inputstream)));
	//   11   21:new             #84  <Class DataInputStream>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #87  <Method void DataInputStream(InputStream)>
	//   15   29:astore_1        
		else
	//*  16   30:goto            35
			inputstream = null;
	//   17   33:aconst_null     
	//   18   34:astore_1        
		mMasterInput = ((DataInputStream) (inputstream));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #89  <Field DataInputStream mMasterInput>
		inputstream = ((InputStream) (obj));
	//   22   40:aload_3         
	//   23   41:astore_1        
		if(outputstream != null)
	//*  24   42:aload_2         
	//*  25   43:ifnull          55
			inputstream = ((InputStream) (new DataOutputStream(outputstream)));
	//   26   46:new             #91  <Class DataOutputStream>
	//   27   49:dup             
	//   28   50:aload_2         
	//   29   51:invokespecial   #94  <Method void DataOutputStream(OutputStream)>
	//   30   54:astore_1        
		mMasterOutput = ((DataOutputStream) (inputstream));
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:putfield        #96  <Field DataOutputStream mMasterOutput>
		mCurrentInput = mMasterInput;
	//   34   60:aload_0         
	//   35   61:aload_0         
	//   36   62:getfield        #89  <Field DataInputStream mMasterInput>
	//   37   65:putfield        #98  <Field DataInputStream mCurrentInput>
		mCurrentOutput = mMasterOutput;
	//   38   68:aload_0         
	//   39   69:aload_0         
	//   40   70:getfield        #96  <Field DataOutputStream mMasterOutput>
	//   41   73:putfield        #100 <Field DataOutputStream mCurrentOutput>
	//   42   76:return          
	}

	private void readObject(int i, String s, Bundle bundle)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 14: default 76
	//	               0 256
	//	               1 246
	//	               2 236
	//	               3 226
	//	               4 209
	//	               5 199
	//	               6 189
	//	               7 179
	//	               8 169
	//	               9 159
	//	               10 149
	//	               11 139
	//	               12 129
	//	               13 119
	//	               14 109
		default:
			s = ((String) (new StringBuilder()));
	//    2   76:new             #104 <Class StringBuilder>
	//    3   79:dup             
	//    4   80:invokespecial   #105 <Method void StringBuilder()>
	//    5   83:astore_2        
			((StringBuilder) (s)).append("Unknown type ");
	//    6   84:aload_2         
	//    7   85:ldc1            #107 <String "Unknown type ">
	//    8   87:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    9   90:pop             
			((StringBuilder) (s)).append(i);
	//   10   91:aload_2         
	//   11   92:iload_1         
	//   12   93:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   13   96:pop             
			throw new RuntimeException(((StringBuilder) (s)).toString());
	//   14   97:new             #116 <Class RuntimeException>
	//   15  100:dup             
	//   16  101:aload_2         
	//   17  102:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   18  105:invokespecial   #123 <Method void RuntimeException(String)>
	//   19  108:athrow          

		case 14: // '\016'
			bundle.putFloatArray(s, readFloatArray());
	//   20  109:aload_3         
	//   21  110:aload_2         
	//   22  111:aload_0         
	//   23  112:invokevirtual   #127 <Method float[] readFloatArray()>
	//   24  115:invokevirtual   #133 <Method void Bundle.putFloatArray(String, float[])>
			return;
	//   25  118:return          

		case 13: // '\r'
			bundle.putFloat(s, readFloat());
	//   26  119:aload_3         
	//   27  120:aload_2         
	//   28  121:aload_0         
	//   29  122:invokevirtual   #137 <Method float readFloat()>
	//   30  125:invokevirtual   #141 <Method void Bundle.putFloat(String, float)>
			return;
	//   31  128:return          

		case 12: // '\f'
			bundle.putLongArray(s, readLongArray());
	//   32  129:aload_3         
	//   33  130:aload_2         
	//   34  131:aload_0         
	//   35  132:invokevirtual   #145 <Method long[] readLongArray()>
	//   36  135:invokevirtual   #149 <Method void Bundle.putLongArray(String, long[])>
			return;
	//   37  138:return          

		case 11: // '\013'
			bundle.putLong(s, readLong());
	//   38  139:aload_3         
	//   39  140:aload_2         
	//   40  141:aload_0         
	//   41  142:invokevirtual   #153 <Method long readLong()>
	//   42  145:invokevirtual   #157 <Method void Bundle.putLong(String, long)>
			return;
	//   43  148:return          

		case 10: // '\n'
			bundle.putIntArray(s, readIntArray());
	//   44  149:aload_3         
	//   45  150:aload_2         
	//   46  151:aload_0         
	//   47  152:invokevirtual   #161 <Method int[] readIntArray()>
	//   48  155:invokevirtual   #165 <Method void Bundle.putIntArray(String, int[])>
			return;
	//   49  158:return          

		case 9: // '\t'
			bundle.putInt(s, readInt());
	//   50  159:aload_3         
	//   51  160:aload_2         
	//   52  161:aload_0         
	//   53  162:invokevirtual   #169 <Method int readInt()>
	//   54  165:invokevirtual   #173 <Method void Bundle.putInt(String, int)>
			return;
	//   55  168:return          

		case 8: // '\b'
			bundle.putDoubleArray(s, readDoubleArray());
	//   56  169:aload_3         
	//   57  170:aload_2         
	//   58  171:aload_0         
	//   59  172:invokevirtual   #177 <Method double[] readDoubleArray()>
	//   60  175:invokevirtual   #181 <Method void Bundle.putDoubleArray(String, double[])>
			return;
	//   61  178:return          

		case 7: // '\007'
			bundle.putDouble(s, readDouble());
	//   62  179:aload_3         
	//   63  180:aload_2         
	//   64  181:aload_0         
	//   65  182:invokevirtual   #185 <Method double readDouble()>
	//   66  185:invokevirtual   #189 <Method void Bundle.putDouble(String, double)>
			return;
	//   67  188:return          

		case 6: // '\006'
			bundle.putBooleanArray(s, readBooleanArray());
	//   68  189:aload_3         
	//   69  190:aload_2         
	//   70  191:aload_0         
	//   71  192:invokevirtual   #193 <Method boolean[] readBooleanArray()>
	//   72  195:invokevirtual   #197 <Method void Bundle.putBooleanArray(String, boolean[])>
			return;
	//   73  198:return          

		case 5: // '\005'
			bundle.putBoolean(s, readBoolean());
	//   74  199:aload_3         
	//   75  200:aload_2         
	//   76  201:aload_0         
	//   77  202:invokevirtual   #201 <Method boolean readBoolean()>
	//   78  205:invokevirtual   #205 <Method void Bundle.putBoolean(String, boolean)>
			return;
	//   79  208:return          

		case 4: // '\004'
			bundle.putStringArray(s, (String[])readArray(((Object []) (new String[0]))));
	//   80  209:aload_3         
	//   81  210:aload_2         
	//   82  211:aload_0         
	//   83  212:iconst_0        
	//   84  213:anewarray       String[]
	//   85  216:invokevirtual   #211 <Method Object[] readArray(Object[])>
	//   86  219:checkcast       #213 <Class String[]>
	//   87  222:invokevirtual   #217 <Method void Bundle.putStringArray(String, String[])>
			return;
	//   88  225:return          

		case 3: // '\003'
			bundle.putString(s, readString());
	//   89  226:aload_3         
	//   90  227:aload_2         
	//   91  228:aload_0         
	//   92  229:invokevirtual   #220 <Method String readString()>
	//   93  232:invokevirtual   #224 <Method void Bundle.putString(String, String)>
			return;
	//   94  235:return          

		case 2: // '\002'
			bundle.putBundle(s, readBundle());
	//   95  236:aload_3         
	//   96  237:aload_2         
	//   97  238:aload_0         
	//   98  239:invokevirtual   #228 <Method Bundle readBundle()>
	//   99  242:invokevirtual   #232 <Method void Bundle.putBundle(String, Bundle)>
			return;
	//  100  245:return          

		case 1: // '\001'
			bundle.putBundle(s, readBundle());
	//  101  246:aload_3         
	//  102  247:aload_2         
	//  103  248:aload_0         
	//  104  249:invokevirtual   #228 <Method Bundle readBundle()>
	//  105  252:invokevirtual   #232 <Method void Bundle.putBundle(String, Bundle)>
			return;
	//  106  255:return          

		case 0: // '\0'
			bundle.putParcelable(s, ((Parcelable) (null)));
	//  107  256:aload_3         
	//  108  257:aload_2         
	//  109  258:aconst_null     
	//  110  259:invokevirtual   #236 <Method void Bundle.putParcelable(String, Parcelable)>
			return;
	//  111  262:return          
		}
	}

	private void writeObject(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			writeInt(0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #242 <Method void writeInt(int)>
			return;
	//    5    9:return          
		}
		if(obj instanceof Bundle)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #129 <Class Bundle>
	//*   8   14:ifeq            31
		{
			writeInt(1);
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #242 <Method void writeInt(int)>
			writeBundle((Bundle)obj);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:checkcast       #129 <Class Bundle>
	//   15   27:invokevirtual   #246 <Method void writeBundle(Bundle)>
			return;
	//   16   30:return          
		}
		if(obj instanceof String)
	//*  17   31:aload_1         
	//*  18   32:instanceof      #207 <Class String>
	//*  19   35:ifeq            52
		{
			writeInt(3);
	//   20   38:aload_0         
	//   21   39:iconst_3        
	//   22   40:invokevirtual   #242 <Method void writeInt(int)>
			writeString((String)obj);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:checkcast       #207 <Class String>
	//   26   48:invokevirtual   #249 <Method void writeString(String)>
			return;
	//   27   51:return          
		}
		if(obj instanceof String[])
	//*  28   52:aload_1         
	//*  29   53:instanceof      #213 <Class String[]>
	//*  30   56:ifeq            73
		{
			writeInt(4);
	//   31   59:aload_0         
	//   32   60:iconst_4        
	//   33   61:invokevirtual   #242 <Method void writeInt(int)>
			writeArray(((Object []) ((String[])obj)));
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:checkcast       #213 <Class String[]>
	//   37   69:invokevirtual   #253 <Method void writeArray(Object[])>
			return;
	//   38   72:return          
		}
		if(obj instanceof Boolean)
	//*  39   73:aload_1         
	//*  40   74:instanceof      #255 <Class Boolean>
	//*  41   77:ifeq            97
		{
			writeInt(5);
	//   42   80:aload_0         
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #242 <Method void writeInt(int)>
			writeBoolean(((Boolean)obj).booleanValue());
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:checkcast       #255 <Class Boolean>
	//   48   90:invokevirtual   #258 <Method boolean Boolean.booleanValue()>
	//   49   93:invokevirtual   #262 <Method void writeBoolean(boolean)>
			return;
	//   50   96:return          
		}
		if(obj instanceof boolean[])
	//*  51   97:aload_1         
	//*  52   98:instanceof      #264 <Class boolean[]>
	//*  53  101:ifeq            119
		{
			writeInt(6);
	//   54  104:aload_0         
	//   55  105:bipush          6
	//   56  107:invokevirtual   #242 <Method void writeInt(int)>
			writeBooleanArray((boolean[])obj);
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:checkcast       #264 <Class boolean[]>
	//   60  115:invokevirtual   #268 <Method void writeBooleanArray(boolean[])>
			return;
	//   61  118:return          
		}
		if(obj instanceof Double)
	//*  62  119:aload_1         
	//*  63  120:instanceof      #270 <Class Double>
	//*  64  123:ifeq            144
		{
			writeInt(7);
	//   65  126:aload_0         
	//   66  127:bipush          7
	//   67  129:invokevirtual   #242 <Method void writeInt(int)>
			writeDouble(((Double)obj).doubleValue());
	//   68  132:aload_0         
	//   69  133:aload_1         
	//   70  134:checkcast       #270 <Class Double>
	//   71  137:invokevirtual   #273 <Method double Double.doubleValue()>
	//   72  140:invokevirtual   #277 <Method void writeDouble(double)>
			return;
	//   73  143:return          
		}
		if(obj instanceof double[])
	//*  74  144:aload_1         
	//*  75  145:instanceof      #279 <Class double[]>
	//*  76  148:ifeq            166
		{
			writeInt(8);
	//   77  151:aload_0         
	//   78  152:bipush          8
	//   79  154:invokevirtual   #242 <Method void writeInt(int)>
			writeDoubleArray((double[])obj);
	//   80  157:aload_0         
	//   81  158:aload_1         
	//   82  159:checkcast       #279 <Class double[]>
	//   83  162:invokevirtual   #283 <Method void writeDoubleArray(double[])>
			return;
	//   84  165:return          
		}
		if(obj instanceof Integer)
	//*  85  166:aload_1         
	//*  86  167:instanceof      #285 <Class Integer>
	//*  87  170:ifeq            191
		{
			writeInt(9);
	//   88  173:aload_0         
	//   89  174:bipush          9
	//   90  176:invokevirtual   #242 <Method void writeInt(int)>
			writeInt(((Integer)obj).intValue());
	//   91  179:aload_0         
	//   92  180:aload_1         
	//   93  181:checkcast       #285 <Class Integer>
	//   94  184:invokevirtual   #288 <Method int Integer.intValue()>
	//   95  187:invokevirtual   #242 <Method void writeInt(int)>
			return;
	//   96  190:return          
		}
		if(obj instanceof int[])
	//*  97  191:aload_1         
	//*  98  192:instanceof      #290 <Class int[]>
	//*  99  195:ifeq            213
		{
			writeInt(10);
	//  100  198:aload_0         
	//  101  199:bipush          10
	//  102  201:invokevirtual   #242 <Method void writeInt(int)>
			writeIntArray((int[])obj);
	//  103  204:aload_0         
	//  104  205:aload_1         
	//  105  206:checkcast       #290 <Class int[]>
	//  106  209:invokevirtual   #294 <Method void writeIntArray(int[])>
			return;
	//  107  212:return          
		}
		if(obj instanceof Long)
	//* 108  213:aload_1         
	//* 109  214:instanceof      #296 <Class Long>
	//* 110  217:ifeq            238
		{
			writeInt(11);
	//  111  220:aload_0         
	//  112  221:bipush          11
	//  113  223:invokevirtual   #242 <Method void writeInt(int)>
			writeLong(((Long)obj).longValue());
	//  114  226:aload_0         
	//  115  227:aload_1         
	//  116  228:checkcast       #296 <Class Long>
	//  117  231:invokevirtual   #299 <Method long Long.longValue()>
	//  118  234:invokevirtual   #303 <Method void writeLong(long)>
			return;
	//  119  237:return          
		}
		if(obj instanceof long[])
	//* 120  238:aload_1         
	//* 121  239:instanceof      #305 <Class long[]>
	//* 122  242:ifeq            260
		{
			writeInt(12);
	//  123  245:aload_0         
	//  124  246:bipush          12
	//  125  248:invokevirtual   #242 <Method void writeInt(int)>
			writeLongArray((long[])obj);
	//  126  251:aload_0         
	//  127  252:aload_1         
	//  128  253:checkcast       #305 <Class long[]>
	//  129  256:invokevirtual   #309 <Method void writeLongArray(long[])>
			return;
	//  130  259:return          
		}
		if(obj instanceof Float)
	//* 131  260:aload_1         
	//* 132  261:instanceof      #311 <Class Float>
	//* 133  264:ifeq            285
		{
			writeInt(13);
	//  134  267:aload_0         
	//  135  268:bipush          13
	//  136  270:invokevirtual   #242 <Method void writeInt(int)>
			writeFloat(((Float)obj).floatValue());
	//  137  273:aload_0         
	//  138  274:aload_1         
	//  139  275:checkcast       #311 <Class Float>
	//  140  278:invokevirtual   #314 <Method float Float.floatValue()>
	//  141  281:invokevirtual   #318 <Method void writeFloat(float)>
			return;
	//  142  284:return          
		}
		if(obj instanceof float[])
	//* 143  285:aload_1         
	//* 144  286:instanceof      #320 <Class float[]>
	//* 145  289:ifeq            307
		{
			writeInt(14);
	//  146  292:aload_0         
	//  147  293:bipush          14
	//  148  295:invokevirtual   #242 <Method void writeInt(int)>
			writeFloatArray((float[])obj);
	//  149  298:aload_0         
	//  150  299:aload_1         
	//  151  300:checkcast       #320 <Class float[]>
	//  152  303:invokevirtual   #324 <Method void writeFloatArray(float[])>
			return;
	//  153  306:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  154  307:new             #104 <Class StringBuilder>
	//  155  310:dup             
	//  156  311:invokespecial   #105 <Method void StringBuilder()>
	//  157  314:astore_2        
			stringbuilder.append("Unsupported type ");
	//  158  315:aload_2         
	//  159  316:ldc2            #326 <String "Unsupported type ">
	//  160  319:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//  161  322:pop             
			stringbuilder.append(((Object) (obj.getClass())));
	//  162  323:aload_2         
	//  163  324:aload_1         
	//  164  325:invokevirtual   #332 <Method Class Object.getClass()>
	//  165  328:invokevirtual   #335 <Method StringBuilder StringBuilder.append(Object)>
	//  166  331:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  167  332:new             #337 <Class IllegalArgumentException>
	//  168  335:dup             
	//  169  336:aload_2         
	//  170  337:invokevirtual   #120 <Method String StringBuilder.toString()>
	//  171  340:invokespecial   #338 <Method void IllegalArgumentException(String)>
	//  172  343:athrow          
		}
	}

	public void closeField()
	{
		FieldBuffer fieldbuffer = mFieldBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field VersionedParcelStream$FieldBuffer mFieldBuffer>
	//    2    4:astore_1        
		if(fieldbuffer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          42
		{
			try
			{
				if(fieldbuffer.mOutput.size() != 0)
	//*   5    9:aload_1         
	//*   6   10:getfield        #347 <Field ByteArrayOutputStream VersionedParcelStream$FieldBuffer.mOutput>
	//*   7   13:invokevirtual   #352 <Method int ByteArrayOutputStream.size()>
	//*   8   16:ifeq            26
					mFieldBuffer.flushField();
	//    9   19:aload_0         
	//   10   20:getfield        #343 <Field VersionedParcelStream$FieldBuffer mFieldBuffer>
	//   11   23:invokevirtual   #355 <Method void VersionedParcelStream$FieldBuffer.flushField()>
			}
	//*  12   26:aload_0         
	//*  13   27:aconst_null     
	//*  14   28:putfield        #343 <Field VersionedParcelStream$FieldBuffer mFieldBuffer>
	//*  15   31:return          
			catch(IOException ioexception)
	//*  16   32:astore_1        
			{
				throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//   17   33:new             #357 <Class VersionedParcel$ParcelException>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   21   41:athrow          
			}
			mFieldBuffer = null;
			return;
		} else
		{
			return;
	//   22   42:return          
		}
	}

	protected VersionedParcel createSubParcel()
	{
		return ((VersionedParcel) (new VersionedParcelStream(((InputStream) (mCurrentInput)), ((OutputStream) (mCurrentOutput)))));
	//    0    0:new             #2   <Class VersionedParcelStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field DataInputStream mCurrentInput>
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    6   12:invokespecial   #364 <Method void VersionedParcelStream(InputStream, OutputStream)>
	//    7   15:areturn         
	}

	public boolean isStream()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean readBoolean()
	{
		boolean flag;
		try
		{
			flag = mCurrentInput.readBoolean();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #366 <Method boolean DataInputStream.readBoolean()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    7   11:new             #357 <Class VersionedParcel$ParcelException>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   11   19:athrow          
		}
		return flag;
	}

	public Bundle readBundle()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Bundle bundle = new Bundle();
	//    7   11:new             #129 <Class Bundle>
	//    8   14:dup             
	//    9   15:invokespecial   #367 <Method void Bundle()>
	//   10   18:astore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          50
		{
			String s = readString();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #220 <Method String readString()>
	//   18   30:astore          4
			readObject(readInt(), s, bundle);
	//   19   32:aload_0         
	//   20   33:aload_0         
	//   21   34:invokevirtual   #169 <Method int readInt()>
	//   22   37:aload           4
	//   23   39:aload_3         
	//   24   40:invokespecial   #369 <Method void readObject(int, String, Bundle)>
		}

	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
	//*  29   47:goto            21
		return bundle;
	//   30   50:aload_3         
	//   31   51:areturn         
	}

	public byte[] readByteArray()
	{
		int i;
		byte abyte0[];
		try
		{
			i = mCurrentInput.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #372 <Method int DataInputStream.readInt()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ifle            26
	//*   6   12:iload_1         
	//*   7   13:newarray        byte[]
	//*   8   15:astore_2        
	//*   9   16:aload_0         
	//*  10   17:getfield        #98  <Field DataInputStream mCurrentInput>
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #376 <Method void DataInputStream.readFully(byte[])>
	//*  13   24:aload_2         
	//*  14   25:areturn         
	//*  15   26:aconst_null     
	//*  16   27:areturn         
		catch(IOException ioexception)
	//*  17   28:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//   18   29:new             #357 <Class VersionedParcel$ParcelException>
	//   19   32:dup             
	//   20   33:aload_2         
	//   21   34:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   22   37:athrow          
		}
		if(i <= 0)
			break MISSING_BLOCK_LABEL_26;
		abyte0 = new byte[i];
		mCurrentInput.readFully(abyte0);
		return abyte0;
		return null;
	}

	public double readDouble()
	{
		double d;
		try
		{
			d = mCurrentInput.readDouble();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #377 <Method double DataInputStream.readDouble()>
	//    3    7:dstore_1        
		}
	//*   4    8:dload_1         
	//*   5    9:dreturn         
		catch(IOException ioexception)
	//*   6   10:astore_3        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    7   11:new             #357 <Class VersionedParcel$ParcelException>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   11   19:athrow          
		}
		return d;
	}

	public boolean readField(int i)
	{
		InputBuffer inputbuffer = (InputBuffer)mCachedFields.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SparseArray mCachedFields>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #383 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #9   <Class VersionedParcelStream$InputBuffer>
	//    5   11:astore          5
		if(inputbuffer != null)
	//*   6   13:aload           5
	//*   7   15:ifnull          37
		{
			mCachedFields.remove(i);
	//    8   18:aload_0         
	//    9   19:getfield        #82  <Field SparseArray mCachedFields>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #386 <Method void SparseArray.remove(int)>
			mCurrentInput = inputbuffer.mInputStream;
	//   12   26:aload_0         
	//   13   27:aload           5
	//   14   29:getfield        #389 <Field DataInputStream VersionedParcelStream$InputBuffer.mInputStream>
	//   15   32:putfield        #98  <Field DataInputStream mCurrentInput>
			return true;
	//   16   35:iconst_1        
	//   17   36:ireturn         
		}
_L1:
		int j;
		int k;
		int l;
		InputBuffer inputbuffer1;
		try
		{
			l = mMasterInput.readInt();
	//   18   37:aload_0         
	//   19   38:getfield        #89  <Field DataInputStream mMasterInput>
	//   20   41:invokevirtual   #372 <Method int DataInputStream.readInt()>
	//   21   44:istore          4
		}
	//*  22   46:iload           4
	//*  23   48:ldc2            #390 <Int 65535>
	//*  24   51:iand            
	//*  25   52:istore_3        
	//*  26   53:iload_3         
	//*  27   54:istore_2        
	//*  28   55:iload_3         
	//*  29   56:ldc2            #390 <Int 65535>
	//*  30   59:icmpne          70
	//*  31   62:aload_0         
	//*  32   63:getfield        #89  <Field DataInputStream mMasterInput>
	//*  33   66:invokevirtual   #372 <Method int DataInputStream.readInt()>
	//*  34   69:istore_2        
	//*  35   70:new             #9   <Class VersionedParcelStream$InputBuffer>
	//*  36   73:dup             
	//*  37   74:iload           4
	//*  38   76:bipush          16
	//*  39   78:ishr            
	//*  40   79:ldc2            #390 <Int 65535>
	//*  41   82:iand            
	//*  42   83:iload_2         
	//*  43   84:aload_0         
	//*  44   85:getfield        #89  <Field DataInputStream mMasterInput>
	//*  45   88:invokespecial   #393 <Method void VersionedParcelStream$InputBuffer(int, int, DataInputStream)>
	//*  46   91:astore          5
	//*  47   93:aload           5
	//*  48   95:getfield        #396 <Field int VersionedParcelStream$InputBuffer.mFieldId>
	//*  49   98:iload_1         
	//*  50   99:icmpne          113
	//*  51  102:aload_0         
	//*  52  103:aload           5
	//*  53  105:getfield        #389 <Field DataInputStream VersionedParcelStream$InputBuffer.mInputStream>
	//*  54  108:putfield        #98  <Field DataInputStream mCurrentInput>
	//*  55  111:iconst_1        
	//*  56  112:ireturn         
	//*  57  113:aload_0         
	//*  58  114:getfield        #82  <Field SparseArray mCachedFields>
	//*  59  117:aload           5
	//*  60  119:getfield        #396 <Field int VersionedParcelStream$InputBuffer.mFieldId>
	//*  61  122:aload           5
	//*  62  124:invokevirtual   #400 <Method void SparseArray.put(int, Object)>
	//*  63  127:goto            37
	//*  64  130:iconst_0        
	//*  65  131:ireturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			return false;
		}
		k = l & 0xffff;
		j = k;
		if(k != 65535)
			break MISSING_BLOCK_LABEL_70;
		j = mMasterInput.readInt();
		inputbuffer1 = new InputBuffer(l >> 16 & 0xffff, j, mMasterInput);
		if(inputbuffer1.mFieldId != i)
			break MISSING_BLOCK_LABEL_113;
		mCurrentInput = inputbuffer1.mInputStream;
		return true;
		IOException ioexception;
		mCachedFields.put(inputbuffer1.mFieldId, ((Object) (inputbuffer1)));
		  goto _L1
	//*  66  132:astore          5
	//*  67  134:goto            130
	}

	public float readFloat()
	{
		float f;
		try
		{
			f = mCurrentInput.readFloat();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #401 <Method float DataInputStream.readFloat()>
	//    3    7:fstore_1        
		}
	//*   4    8:fload_1         
	//*   5    9:freturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    7   11:new             #357 <Class VersionedParcel$ParcelException>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   11   19:athrow          
		}
		return f;
	}

	public int readInt()
	{
		int i;
		try
		{
			i = mCurrentInput.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #372 <Method int DataInputStream.readInt()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    7   11:new             #357 <Class VersionedParcel$ParcelException>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   11   19:athrow          
		}
		return i;
	}

	public long readLong()
	{
		long l;
		try
		{
			l = mCurrentInput.readLong();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #402 <Method long DataInputStream.readLong()>
	//    3    7:lstore_1        
		}
	//*   4    8:lload_1         
	//*   5    9:lreturn         
		catch(IOException ioexception)
	//*   6   10:astore_3        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    7   11:new             #357 <Class VersionedParcel$ParcelException>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   11   19:athrow          
		}
		return l;
	}

	public Parcelable readParcelable()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String readString()
	{
		int i;
		byte abyte0[];
		String s;
		try
		{
			i = mCurrentInput.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field DataInputStream mCurrentInput>
	//    2    4:invokevirtual   #372 <Method int DataInputStream.readInt()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ifle            38
	//*   6   12:iload_1         
	//*   7   13:newarray        byte[]
	//*   8   15:astore_2        
	//*   9   16:aload_0         
	//*  10   17:getfield        #98  <Field DataInputStream mCurrentInput>
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #376 <Method void DataInputStream.readFully(byte[])>
	//*  13   24:new             #207 <Class String>
	//*  14   27:dup             
	//*  15   28:aload_2         
	//*  16   29:getstatic       #72  <Field Charset UTF_16>
	//*  17   32:invokespecial   #409 <Method void String(byte[], Charset)>
	//*  18   35:astore_2        
	//*  19   36:aload_2         
	//*  20   37:areturn         
	//*  21   38:aconst_null     
	//*  22   39:areturn         
		catch(IOException ioexception)
	//*  23   40:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//   24   41:new             #357 <Class VersionedParcel$ParcelException>
	//   25   44:dup             
	//   26   45:aload_2         
	//   27   46:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   28   49:athrow          
		}
		if(i <= 0)
			break MISSING_BLOCK_LABEL_38;
		abyte0 = new byte[i];
		mCurrentInput.readFully(abyte0);
		s = new String(abyte0, UTF_16);
		return s;
		return null;
	}

	public IBinder readStrongBinder()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setOutputField(int i)
	{
		closeField();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method void closeField()>
		mFieldBuffer = new FieldBuffer(i, mMasterOutput);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class VersionedParcelStream$FieldBuffer>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #96  <Field DataOutputStream mMasterOutput>
	//    8   14:invokespecial   #417 <Method void VersionedParcelStream$FieldBuffer(int, DataOutputStream)>
	//    9   17:putfield        #343 <Field VersionedParcelStream$FieldBuffer mFieldBuffer>
		mCurrentOutput = mFieldBuffer.mDataStream;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #343 <Field VersionedParcelStream$FieldBuffer mFieldBuffer>
	//   13   25:getfield        #420 <Field DataOutputStream VersionedParcelStream$FieldBuffer.mDataStream>
	//   14   28:putfield        #100 <Field DataOutputStream mCurrentOutput>
	//   15   31:return          
	}

	public void setSerializationFlags(boolean flag, boolean flag1)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
		{
			mIgnoreParcelables = flag1;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #424 <Field boolean mIgnoreParcelables>
			return;
	//    5    9:return          
		} else
		{
			throw new RuntimeException("Serialization of this object is not allowed");
	//    6   10:new             #116 <Class RuntimeException>
	//    7   13:dup             
	//    8   14:ldc2            #426 <String "Serialization of this object is not allowed">
	//    9   17:invokespecial   #123 <Method void RuntimeException(String)>
	//   10   20:athrow          
		}
	}

	public void writeBoolean(boolean flag)
	{
		try
		{
			mCurrentOutput.writeBoolean(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #427 <Method void DataOutputStream.writeBoolean(boolean)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    6   10:new             #357 <Class VersionedParcel$ParcelException>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void writeBundle(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			try
			{
				Object obj = ((Object) (bundle.keySet()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #431 <Method Set Bundle.keySet()>
	//    4    8:astore_2        
				mCurrentOutput.writeInt(((Set) (obj)).size());
	//    5    9:aload_0         
	//    6   10:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    7   13:aload_2         
	//    8   14:invokeinterface #434 <Method int Set.size()>
	//    9   19:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
				String s;
				for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); writeObject(bundle.get(s)))
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #439 <Method Iterator Set.iterator()>
	//*  12   28:astore_2        
	//*  13   29:aload_2         
	//*  14   30:invokeinterface #444 <Method boolean Iterator.hasNext()>
	//*  15   35:ifeq            73
				{
					s = (String)((Iterator) (obj)).next();
	//   16   38:aload_2         
	//   17   39:invokeinterface #448 <Method Object Iterator.next()>
	//   18   44:checkcast       #207 <Class String>
	//   19   47:astore_3        
					writeString(s);
	//   20   48:aload_0         
	//   21   49:aload_3         
	//   22   50:invokevirtual   #249 <Method void writeString(String)>
				}

	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:aload_3         
	//   26   56:invokevirtual   #451 <Method Object Bundle.get(String)>
	//   27   59:invokespecial   #453 <Method void writeObject(Object)>
			}
	//*  28   62:goto            29
	//*  29   65:aload_0         
	//*  30   66:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//*  31   69:iconst_m1       
	//*  32   70:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
	//*  33   73:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*  34   74:astore_1        
			{
				throw new VersionedParcel.ParcelException(((Throwable) (bundle)));
	//   35   75:new             #357 <Class VersionedParcel$ParcelException>
	//   36   78:dup             
	//   37   79:aload_1         
	//   38   80:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   39   83:athrow          
			}
			break MISSING_BLOCK_LABEL_73;
		}
		mCurrentOutput.writeInt(-1);
	}

	public void writeByteArray(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
			try
			{
				mCurrentOutput.writeInt(abyte0.length);
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
				mCurrentOutput.write(abyte0);
	//    7   13:aload_0         
	//    8   14:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #457 <Method void DataOutputStream.write(byte[])>
				return;
	//   11   21:return          
			}
	//*  12   22:aload_0         
	//*  13   23:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//*  14   26:iconst_m1       
	//*  15   27:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
	//*  16   30:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  17   31:astore_1        
			{
				throw new VersionedParcel.ParcelException(((Throwable) (abyte0)));
	//   18   32:new             #357 <Class VersionedParcel$ParcelException>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   22   40:athrow          
			}
		mCurrentOutput.writeInt(-1);
		return;
	}

	public void writeByteArray(byte abyte0[], int i, int j)
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
			try
			{
				mCurrentOutput.writeInt(j);
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    4    8:iload_3         
	//    5    9:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
				mCurrentOutput.write(abyte0, i, j);
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:invokevirtual   #460 <Method void DataOutputStream.write(byte[], int, int)>
				return;
	//   12   22:return          
			}
	//*  13   23:aload_0         
	//*  14   24:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//*  15   27:iconst_m1       
	//*  16   28:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
	//*  17   31:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  18   32:astore_1        
			{
				throw new VersionedParcel.ParcelException(((Throwable) (abyte0)));
	//   19   33:new             #357 <Class VersionedParcel$ParcelException>
	//   20   36:dup             
	//   21   37:aload_1         
	//   22   38:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   23   41:athrow          
			}
		mCurrentOutput.writeInt(-1);
		return;
	}

	public void writeDouble(double d)
	{
		try
		{
			mCurrentOutput.writeDouble(d);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #461 <Method void DataOutputStream.writeDouble(double)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_3        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    6   10:new             #357 <Class VersionedParcel$ParcelException>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void writeFloat(float f)
	{
		try
		{
			mCurrentOutput.writeFloat(f);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #462 <Method void DataOutputStream.writeFloat(float)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    6   10:new             #357 <Class VersionedParcel$ParcelException>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void writeInt(int i)
	{
		try
		{
			mCurrentOutput.writeInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_2        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    6   10:new             #357 <Class VersionedParcel$ParcelException>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void writeLong(long l)
	{
		try
		{
			mCurrentOutput.writeLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #463 <Method void DataOutputStream.writeLong(long)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_3        
		{
			throw new VersionedParcel.ParcelException(((Throwable) (ioexception)));
	//    6   10:new             #357 <Class VersionedParcel$ParcelException>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void writeParcelable(Parcelable parcelable)
	{
		if(mIgnoreParcelables)
	//*   0    0:aload_0         
	//*   1    1:getfield        #424 <Field boolean mIgnoreParcelables>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new RuntimeException("Parcelables cannot be written to an OutputStream");
	//    4    8:new             #116 <Class RuntimeException>
	//    5   11:dup             
	//    6   12:ldc2            #467 <String "Parcelables cannot be written to an OutputStream">
	//    7   15:invokespecial   #123 <Method void RuntimeException(String)>
	//    8   18:athrow          
	}

	public void writeString(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
			try
			{
				s = ((String) (s.getBytes(UTF_16)));
	//    2    4:aload_1         
	//    3    5:getstatic       #72  <Field Charset UTF_16>
	//    4    8:invokevirtual   #471 <Method byte[] String.getBytes(Charset)>
	//    5   11:astore_1        
				mCurrentOutput.writeInt(s.length);
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
				mCurrentOutput.write(((byte []) (s)));
	//   11   21:aload_0         
	//   12   22:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #457 <Method void DataOutputStream.write(byte[])>
				return;
	//   15   29:return          
			}
	//*  16   30:aload_0         
	//*  17   31:getfield        #100 <Field DataOutputStream mCurrentOutput>
	//*  18   34:iconst_m1       
	//*  19   35:invokevirtual   #435 <Method void DataOutputStream.writeInt(int)>
	//*  20   38:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  21   39:astore_1        
			{
				throw new VersionedParcel.ParcelException(((Throwable) (s)));
	//   22   40:new             #357 <Class VersionedParcel$ParcelException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #360 <Method void VersionedParcel$ParcelException(Throwable)>
	//   26   48:athrow          
			}
		mCurrentOutput.writeInt(-1);
		return;
	}

	public void writeStrongBinder(IBinder ibinder)
	{
		if(mIgnoreParcelables)
	//*   0    0:aload_0         
	//*   1    1:getfield        #424 <Field boolean mIgnoreParcelables>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new RuntimeException("Binders cannot be written to an OutputStream");
	//    4    8:new             #116 <Class RuntimeException>
	//    5   11:dup             
	//    6   12:ldc2            #475 <String "Binders cannot be written to an OutputStream">
	//    7   15:invokespecial   #123 <Method void RuntimeException(String)>
	//    8   18:athrow          
	}

	public void writeStrongInterface(IInterface iinterface)
	{
		if(mIgnoreParcelables)
	//*   0    0:aload_0         
	//*   1    1:getfield        #424 <Field boolean mIgnoreParcelables>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new RuntimeException("Binders cannot be written to an OutputStream");
	//    4    8:new             #116 <Class RuntimeException>
	//    5   11:dup             
	//    6   12:ldc2            #475 <String "Binders cannot be written to an OutputStream">
	//    7   15:invokespecial   #123 <Method void RuntimeException(String)>
	//    8   18:athrow          
	}

	private static final int TYPE_BOOLEAN = 5;
	private static final int TYPE_BOOLEAN_ARRAY = 6;
	private static final int TYPE_DOUBLE = 7;
	private static final int TYPE_DOUBLE_ARRAY = 8;
	private static final int TYPE_FLOAT = 13;
	private static final int TYPE_FLOAT_ARRAY = 14;
	private static final int TYPE_INT = 9;
	private static final int TYPE_INT_ARRAY = 10;
	private static final int TYPE_LONG = 11;
	private static final int TYPE_LONG_ARRAY = 12;
	private static final int TYPE_NULL = 0;
	private static final int TYPE_STRING = 3;
	private static final int TYPE_STRING_ARRAY = 4;
	private static final int TYPE_SUB_BUNDLE = 1;
	private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
	private static final Charset UTF_16 = Charset.forName("UTF-16");
	private final SparseArray mCachedFields = new SparseArray();
	private DataInputStream mCurrentInput;
	private DataOutputStream mCurrentOutput;
	private FieldBuffer mFieldBuffer;
	private boolean mIgnoreParcelables;
	private final DataInputStream mMasterInput;
	private final DataOutputStream mMasterOutput;

	static 
	{
	//    0    0:ldc1            #64  <String "UTF-16">
	//    1    2:invokestatic    #70  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #72  <Field Charset UTF_16>
	//*   3    8:return          
	}
}
