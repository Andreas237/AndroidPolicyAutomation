// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.*;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadException, DownloaderConstructorHelper, Downloader

public abstract class DownloadAction
{
	public static abstract class Deserializer
	{

		public abstract DownloadAction readFromStream(int i, DataInputStream datainputstream)
			throws IOException;

		public final String type;
		public final int version;

		public Deserializer(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			type = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String type>
			version = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field int version>
		//    8   14:return          
		}
	}


	protected DownloadAction(String s, int i, Uri uri1, boolean flag, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		type = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String type>
		version = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int version>
		uri = uri1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Uri uri>
		isRemoveAction = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #31  <Field boolean isRemoveAction>
		if(abyte0 == null)
	//*  14   25:aload           5
	//*  15   27:ifnull          33
	//*  16   30:goto            38
			abyte0 = new byte[0];
	//   17   33:iconst_0        
	//   18   34:newarray        byte[]
	//   19   36:astore          5
		data = abyte0;
	//   20   38:aload_0         
	//   21   39:aload           5
	//   22   41:putfield        #33  <Field byte[] data>
	//   23   44:return          
	}

	public static DownloadAction deserializeFromStream(Deserializer adeserializer[], InputStream inputstream)
		throws IOException
	{
		DataInputStream datainputstream = new DataInputStream(inputstream);
	//    0    0:new             #41  <Class DataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #44  <Method void DataInputStream(InputStream)>
	//    4    8:astore          5
		inputstream = ((InputStream) (datainputstream.readUTF()));
	//    5   10:aload           5
	//    6   12:invokevirtual   #48  <Method String DataInputStream.readUTF()>
	//    7   15:astore_1        
		int j = datainputstream.readInt();
	//    8   16:aload           5
	//    9   18:invokevirtual   #52  <Method int DataInputStream.readInt()>
	//   10   21:istore_3        
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		for(int k = adeserializer.length; i < k; i++)
	//*  13   24:aload_0         
	//*  14   25:arraylength     
	//*  15   26:istore          4
	//*  16   28:iload_2         
	//*  17   29:iload           4
	//*  18   31:icmpge          76
		{
			Deserializer deserializer = adeserializer[i];
	//   19   34:aload_0         
	//   20   35:iload_2         
	//   21   36:aaload          
	//   22   37:astore          6
			if(((String) (inputstream)).equals(((Object) (deserializer.type))) && deserializer.version >= j)
	//*  23   39:aload_1         
	//*  24   40:aload           6
	//*  25   42:getfield        #53  <Field String DownloadAction$Deserializer.type>
	//*  26   45:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  27   48:ifeq            69
	//*  28   51:aload           6
	//*  29   53:getfield        #60  <Field int DownloadAction$Deserializer.version>
	//*  30   56:iload_3         
	//*  31   57:icmplt          69
				return deserializer.readFromStream(j, datainputstream);
	//   32   60:aload           6
	//   33   62:iload_3         
	//   34   63:aload           5
	//   35   65:invokevirtual   #64  <Method DownloadAction DownloadAction$Deserializer.readFromStream(int, DataInputStream)>
	//   36   68:areturn         
		}

	//   37   69:iload_2         
	//   38   70:iconst_1        
	//   39   71:iadd            
	//   40   72:istore_2        
	//*  41   73:goto            28
		adeserializer = ((Deserializer []) (new StringBuilder()));
	//   42   76:new             #66  <Class StringBuilder>
	//   43   79:dup             
	//   44   80:invokespecial   #67  <Method void StringBuilder()>
	//   45   83:astore_0        
		((StringBuilder) (adeserializer)).append("No deserializer found for:");
	//   46   84:aload_0         
	//   47   85:ldc1            #69  <String "No deserializer found for:">
	//   48   87:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
		((StringBuilder) (adeserializer)).append(((String) (inputstream)));
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		((StringBuilder) (adeserializer)).append(", ");
	//   54   97:aload_0         
	//   55   98:ldc1            #75  <String ", ">
	//   56  100:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   57  103:pop             
		((StringBuilder) (adeserializer)).append(j);
	//   58  104:aload_0         
	//   59  105:iload_3         
	//   60  106:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   61  109:pop             
		throw new DownloadException(((StringBuilder) (adeserializer)).toString());
	//   62  110:new             #80  <Class DownloadException>
	//   63  113:dup             
	//   64  114:aload_0         
	//   65  115:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   66  118:invokespecial   #86  <Method void DownloadException(String)>
	//   67  121:athrow          
	}

	public static void serializeToStream(DownloadAction downloadaction, OutputStream outputstream)
		throws IOException
	{
		outputstream = ((OutputStream) (new DataOutputStream(outputstream)));
	//    0    0:new             #91  <Class DataOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #94  <Method void DataOutputStream(OutputStream)>
	//    4    8:astore_1        
		((DataOutputStream) (outputstream)).writeUTF(downloadaction.type);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field String type>
	//    8   14:invokevirtual   #97  <Method void DataOutputStream.writeUTF(String)>
		((DataOutputStream) (outputstream)).writeInt(downloadaction.version);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field int version>
	//   12   22:invokevirtual   #101 <Method void DataOutputStream.writeInt(int)>
		downloadaction.writeToStream(((DataOutputStream) (outputstream)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #105 <Method void writeToStream(DataOutputStream)>
		((DataOutputStream) (outputstream)).flush();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #108 <Method void DataOutputStream.flush()>
	//   18   34:return          
	}

	protected abstract Downloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper);

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          102
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #114 <Method Class Object.getClass()>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #114 <Method Class Object.getClass()>
	//*   8   14:if_acmpeq       19
				return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
			obj = ((Object) ((DownloadAction)obj));
	//   11   19:aload_1         
	//   12   20:checkcast       #2   <Class DownloadAction>
	//   13   23:astore_1        
			boolean flag = flag1;
	//   14   24:iload_3         
	//   15   25:istore_2        
			if(type.equals(((Object) (((DownloadAction) (obj)).type))))
	//*  16   26:aload_0         
	//*  17   27:getfield        #25  <Field String type>
	//*  18   30:aload_1         
	//*  19   31:getfield        #25  <Field String type>
	//*  20   34:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  21   37:ifeq            100
			{
				flag = flag1;
	//   22   40:iload_3         
	//   23   41:istore_2        
				if(version == ((DownloadAction) (obj)).version)
	//*  24   42:aload_0         
	//*  25   43:getfield        #27  <Field int version>
	//*  26   46:aload_1         
	//*  27   47:getfield        #27  <Field int version>
	//*  28   50:icmpne          100
				{
					flag = flag1;
	//   29   53:iload_3         
	//   30   54:istore_2        
					if(uri.equals(((Object) (((DownloadAction) (obj)).uri))))
	//*  31   55:aload_0         
	//*  32   56:getfield        #29  <Field Uri uri>
	//*  33   59:aload_1         
	//*  34   60:getfield        #29  <Field Uri uri>
	//*  35   63:invokevirtual   #117 <Method boolean Uri.equals(Object)>
	//*  36   66:ifeq            100
					{
						flag = flag1;
	//   37   69:iload_3         
	//   38   70:istore_2        
						if(isRemoveAction == ((DownloadAction) (obj)).isRemoveAction)
	//*  39   71:aload_0         
	//*  40   72:getfield        #31  <Field boolean isRemoveAction>
	//*  41   75:aload_1         
	//*  42   76:getfield        #31  <Field boolean isRemoveAction>
	//*  43   79:icmpne          100
						{
							flag = flag1;
	//   44   82:iload_3         
	//   45   83:istore_2        
							if(Arrays.equals(data, ((DownloadAction) (obj)).data))
	//*  46   84:aload_0         
	//*  47   85:getfield        #33  <Field byte[] data>
	//*  48   88:aload_1         
	//*  49   89:getfield        #33  <Field byte[] data>
	//*  50   92:invokestatic    #122 <Method boolean Arrays.equals(byte[], byte[])>
	//*  51   95:ifeq            100
								flag = true;
	//   52   98:iconst_1        
	//   53   99:istore_2        
						}
					}
				}
			}
			return flag;
	//   54  100:iload_2         
	//   55  101:ireturn         
		} else
		{
			return false;
	//   56  102:iconst_0        
	//   57  103:ireturn         
		}
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #125 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #127 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #130 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean isSameMedia(DownloadAction downloadaction)
	{
		return uri.equals(((Object) (downloadaction.uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Uri uri>
	//    2    4:aload_1         
	//    3    5:getfield        #29  <Field Uri uri>
	//    4    8:invokevirtual   #117 <Method boolean Uri.equals(Object)>
	//    5   11:ireturn         
	}

	public final byte[] toByteArray()
	{
		IOException ioexception;
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #136 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		try
		{
			serializeToStream(this, ((OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #139 <Method void serializeToStream(DownloadAction, OutputStream)>
		}
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #141 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*   9   17:areturn         
	//*  10   18:new             #143 <Class IllegalStateException>
	//*  11   21:dup             
	//*  12   22:invokespecial   #144 <Method void IllegalStateException()>
	//*  13   25:athrow          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			throw new IllegalStateException();
		}
		return bytearrayoutputstream.toByteArray();
	//*  14   26:astore_1        
	//*  15   27:goto            18
	}

	protected abstract void writeToStream(DataOutputStream dataoutputstream)
		throws IOException;

	public final byte data[];
	public final boolean isRemoveAction;
	public final String type;
	public final Uri uri;
	public final int version;
}
