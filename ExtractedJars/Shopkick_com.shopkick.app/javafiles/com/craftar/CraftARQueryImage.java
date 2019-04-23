// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.*;

// Referenced classes of package com.craftar:
//			NV21, UtilsImage

public class CraftARQueryImage
{
	class Type
	{

		static final int BITMAP = 3;
		static final int FILE_PATH = 4;
		static final int JPEG_ARRAY = 1;
		static final int NV21_DATA = 2;
		static final int PNG_ARRAY = 5;
		final CraftARQueryImage this$0;

		Type()
		{
			this$0 = CraftARQueryImage.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field CraftARQueryImage this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
		//    5    9:return          
		}
	}


	public CraftARQueryImage(Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataBmp = bitmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Bitmap dataBmp>
		mType = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #26  <Field int mType>
	//    8   14:return          
	}

	CraftARQueryImage(NV21 nv21)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataNV21 = nv21;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field NV21 dataNV21>
		mType = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #26  <Field int mType>
	//    8   14:return          
	}

	CraftARQueryImage(ByteArrayOutputStream bytearrayoutputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataBuffer = bytearrayoutputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field ByteArrayOutputStream dataBuffer>
		mType = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #26  <Field int mType>
	//    8   14:return          
	}

	CraftARQueryImage(ByteArrayOutputStream bytearrayoutputstream, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataBuffer = bytearrayoutputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field ByteArrayOutputStream dataBuffer>
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            19
		{
			mType = 5;
	//    7   13:aload_0         
	//    8   14:iconst_5        
	//    9   15:putfield        #26  <Field int mType>
			return;
	//   10   18:return          
		} else
		{
			mType = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #26  <Field int mType>
			return;
	//   14   24:return          
		}
	}

	public CraftARQueryImage(String s)
		throws FileNotFoundException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		File file = new File(s);
	//    2    4:new             #39  <Class File>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void File(String)>
	//    6   12:astore_2        
		if(file.exists())
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #45  <Method boolean File.exists()>
	//*   9   17:ifeq            125
		{
			if(file.canRead())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #48  <Method boolean File.canRead()>
	//*  12   24:ifeq            85
			{
				if(!file.isDirectory())
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #51  <Method boolean File.isDirectory()>
	//*  15   31:ifne            45
				{
					dataPath = s;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #53  <Field String dataPath>
					mType = 4;
	//   19   39:aload_0         
	//   20   40:iconst_4        
	//   21   41:putfield        #26  <Field int mType>
					return;
	//   22   44:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #55  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #56  <Method void StringBuilder()>
	//   26   52:astore_2        
					stringbuilder.append("File ");
	//   27   53:aload_2         
	//   28   54:ldc1            #58  <String "File ">
	//   29   56:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
					stringbuilder.append(s);
	//   31   60:aload_2         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
					stringbuilder.append(" is a directory, not an regular file.");
	//   35   66:aload_2         
	//   36   67:ldc1            #64  <String " is a directory, not an regular file.">
	//   37   69:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
					throw new FileNotFoundException(stringbuilder.toString());
	//   39   73:new             #37  <Class FileNotFoundException>
	//   40   76:dup             
	//   41   77:aload_2         
	//   42   78:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #69  <Method void FileNotFoundException(String)>
	//   44   84:athrow          
				}
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   45   85:new             #55  <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #56  <Method void StringBuilder()>
	//   48   92:astore_2        
				stringbuilder1.append("File ");
	//   49   93:aload_2         
	//   50   94:ldc1            #58  <String "File ">
	//   51   96:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   52   99:pop             
				stringbuilder1.append(s);
	//   53  100:aload_2         
	//   54  101:aload_1         
	//   55  102:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   56  105:pop             
				stringbuilder1.append(" cannot be read");
	//   57  106:aload_2         
	//   58  107:ldc1            #71  <String " cannot be read">
	//   59  109:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   60  112:pop             
				throw new FileNotFoundException(stringbuilder1.toString());
	//   61  113:new             #37  <Class FileNotFoundException>
	//   62  116:dup             
	//   63  117:aload_2         
	//   64  118:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   65  121:invokespecial   #69  <Method void FileNotFoundException(String)>
	//   66  124:athrow          
			}
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   67  125:new             #55  <Class StringBuilder>
	//   68  128:dup             
	//   69  129:invokespecial   #56  <Method void StringBuilder()>
	//   70  132:astore_2        
			stringbuilder2.append("File ");
	//   71  133:aload_2         
	//   72  134:ldc1            #58  <String "File ">
	//   73  136:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   74  139:pop             
			stringbuilder2.append(s);
	//   75  140:aload_2         
	//   76  141:aload_1         
	//   77  142:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   78  145:pop             
			stringbuilder2.append(" not found");
	//   79  146:aload_2         
	//   80  147:ldc1            #73  <String " not found">
	//   81  149:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   82  152:pop             
			throw new FileNotFoundException(stringbuilder2.toString());
	//   83  153:new             #37  <Class FileNotFoundException>
	//   84  156:dup             
	//   85  157:aload_2         
	//   86  158:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   87  161:invokespecial   #69  <Method void FileNotFoundException(String)>
	//   88  164:athrow          
		}
	}

	int getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mType>
	//    2    4:ireturn         
	}

	public Bitmap toBitmap()
	{
		switch(mType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int mType>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 136
	//	               2 71
	//	               3 66
	//	               4 58
	//	               5 42
		default:
			return null;
	//    3   40:aconst_null     
	//    4   41:areturn         

		case 5: // '\005'
			byte abyte0[] = dataBuffer.toByteArray();
	//    5   42:aload_0         
	//    6   43:getfield        #33  <Field ByteArrayOutputStream dataBuffer>
	//    7   46:invokevirtual   #84  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    8   49:astore_3        
			return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
	//    9   50:aload_3         
	//   10   51:iconst_0        
	//   11   52:aload_3         
	//   12   53:arraylength     
	//   13   54:invokestatic    #90  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//   14   57:areturn         

		case 4: // '\004'
			return BitmapFactory.decodeFile(dataPath);
	//   15   58:aload_0         
	//   16   59:getfield        #53  <Field String dataPath>
	//   17   62:invokestatic    #94  <Method Bitmap BitmapFactory.decodeFile(String)>
	//   18   65:areturn         

		case 3: // '\003'
			return dataBmp;
	//   19   66:aload_0         
	//   20   67:getfield        #24  <Field Bitmap dataBmp>
	//   21   70:areturn         

		case 2: // '\002'
			if(dataBmp == null)
	//*  22   71:aload_0         
	//*  23   72:getfield        #24  <Field Bitmap dataBmp>
	//*  24   75:ifnonnull       131
			{
				int i = dataNV21.width;
	//   25   78:aload_0         
	//   26   79:getfield        #30  <Field NV21 dataNV21>
	//   27   82:getfield        #99  <Field int NV21.width>
	//   28   85:istore_1        
				int j = dataNV21.height;
	//   29   86:aload_0         
	//   30   87:getfield        #30  <Field NV21 dataNV21>
	//   31   90:getfield        #102 <Field int NV21.height>
	//   32   93:istore_2        
				int ai[] = new int[i * j * 3];
	//   33   94:iload_1         
	//   34   95:iload_2         
	//   35   96:imul            
	//   36   97:iconst_3        
	//   37   98:imul            
	//   38   99:newarray        int[]
	//   39  101:astore_3        
				UtilsImage.Instance().decodeYUV420SPtoRGBA(dataNV21.data, i, j, ai);
	//   40  102:invokestatic    #108 <Method UtilsImage UtilsImage.Instance()>
	//   41  105:aload_0         
	//   42  106:getfield        #30  <Field NV21 dataNV21>
	//   43  109:getfield        #112 <Field byte[] NV21.data>
	//   44  112:iload_1         
	//   45  113:iload_2         
	//   46  114:aload_3         
	//   47  115:invokevirtual   #116 <Method void UtilsImage.decodeYUV420SPtoRGBA(byte[], int, int, int[])>
				dataBmp = Bitmap.createBitmap(ai, i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   48  118:aload_0         
	//   49  119:aload_3         
	//   50  120:iload_1         
	//   51  121:iload_2         
	//   52  122:getstatic       #122 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   53  125:invokestatic    #128 <Method Bitmap Bitmap.createBitmap(int[], int, int, android.graphics.Bitmap$Config)>
	//   54  128:putfield        #24  <Field Bitmap dataBmp>
			}
			return dataBmp;
	//   55  131:aload_0         
	//   56  132:getfield        #24  <Field Bitmap dataBmp>
	//   57  135:areturn         

		case 1: // '\001'
			byte abyte1[] = dataBuffer.toByteArray();
	//   58  136:aload_0         
	//   59  137:getfield        #33  <Field ByteArrayOutputStream dataBuffer>
	//   60  140:invokevirtual   #84  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   61  143:astore_3        
			return BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length);
	//   62  144:aload_3         
	//   63  145:iconst_0        
	//   64  146:aload_3         
	//   65  147:arraylength     
	//   66  148:invokestatic    #90  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//   67  151:areturn         
		}
	}

	public byte[] toJPEGByteArray()
	{
		int i = mType;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mType>
	//    2    4:istore_1        
		byte abyte0[] = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		ByteArrayOutputStream bytearrayoutputstream;
		switch(i)
	//*   5    7:iload_1         
		{
	//*   6    8:tableswitch     1 5: default 44
	//	               1 105
	//	               2 91
	//	               3 77
	//	               4 63
	//	               5 49
		default:
			bytearrayoutputstream = null;
	//    7   44:aconst_null     
	//    8   45:astore_2        
			break;

	//*   9   46:goto            110
		case 5: // '\005'
			bytearrayoutputstream = UtilsImage.Instance().processPicture(toBitmap());
	//   10   49:invokestatic    #108 <Method UtilsImage UtilsImage.Instance()>
	//   11   52:aload_0         
	//   12   53:invokevirtual   #131 <Method Bitmap toBitmap()>
	//   13   56:invokevirtual   #135 <Method ByteArrayOutputStream UtilsImage.processPicture(Bitmap)>
	//   14   59:astore_2        
			break;

	//*  15   60:goto            110
		case 4: // '\004'
			bytearrayoutputstream = UtilsImage.Instance().processPicture(dataPath);
	//   16   63:invokestatic    #108 <Method UtilsImage UtilsImage.Instance()>
	//   17   66:aload_0         
	//   18   67:getfield        #53  <Field String dataPath>
	//   19   70:invokevirtual   #138 <Method ByteArrayOutputStream UtilsImage.processPicture(String)>
	//   20   73:astore_2        
			break;

	//*  21   74:goto            110
		case 3: // '\003'
			bytearrayoutputstream = UtilsImage.Instance().processPicture(dataBmp);
	//   22   77:invokestatic    #108 <Method UtilsImage UtilsImage.Instance()>
	//   23   80:aload_0         
	//   24   81:getfield        #24  <Field Bitmap dataBmp>
	//   25   84:invokevirtual   #135 <Method ByteArrayOutputStream UtilsImage.processPicture(Bitmap)>
	//   26   87:astore_2        
			break;

	//*  27   88:goto            110
		case 2: // '\002'
			bytearrayoutputstream = UtilsImage.Instance().processPicture(dataNV21);
	//   28   91:invokestatic    #108 <Method UtilsImage UtilsImage.Instance()>
	//   29   94:aload_0         
	//   30   95:getfield        #30  <Field NV21 dataNV21>
	//   31   98:invokevirtual   #141 <Method ByteArrayOutputStream UtilsImage.processPicture(NV21)>
	//   32  101:astore_2        
			break;

	//*  33  102:goto            110
		case 1: // '\001'
			bytearrayoutputstream = dataBuffer;
	//   34  105:aload_0         
	//   35  106:getfield        #33  <Field ByteArrayOutputStream dataBuffer>
	//   36  109:astore_2        
			break;
		}
		if(bytearrayoutputstream != null)
	//*  37  110:aload_2         
	//*  38  111:ifnull          119
			abyte0 = bytearrayoutputstream.toByteArray();
	//   39  114:aload_2         
	//   40  115:invokevirtual   #84  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   41  118:astore_3        
		return abyte0;
	//   42  119:aload_3         
	//   43  120:areturn         
	}

	Bitmap dataBmp;
	ByteArrayOutputStream dataBuffer;
	NV21 dataNV21;
	String dataPath;
	int mType;
}
