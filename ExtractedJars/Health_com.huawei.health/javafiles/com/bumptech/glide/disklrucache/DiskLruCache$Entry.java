// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

final class DiskLruCache$Entry
{

	private IOException invalidLengths(String as[])
		throws IOException
	{
		throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(((Object []) (as)))).toString());
	//    0    0:new             #109 <Class IOException>
	//    1    3:dup             
	//    2    4:new             #45  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #117 <Method void StringBuilder()>
	//    5   11:ldc1            #119 <String "unexpected journal line: ">
	//    6   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokestatic    #124 <Method String Arrays.toString(Object[])>
	//    9   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #125 <Method void IOException(String)>
	//   12   29:athrow          
	}

	private void setLengths(String as[])
		throws IOException
	{
		if(as.length != DiskLruCache.access$1900(DiskLruCache.this))
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #26  <Field DiskLruCache this$0>
	//*   4    6:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//*   5    9:icmpeq          18
			throw invalidLengths(as);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #129 <Method IOException invalidLengths(String[])>
	//    9   17:athrow          
		int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		do
		{
			try
			{
				if(i >= as.length)
					break;
	//   12   20:iload_2         
	//   13   21:aload_1         
	//   14   22:arraylength     
	//   15   23:icmpge          45
				lengths[i] = Long.parseLong(as[i]);
	//   16   26:aload_0         
	//   17   27:getfield        #37  <Field long[] lengths>
	//   18   30:iload_2         
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:aaload          
	//   22   34:invokestatic    #135 <Method long Long.parseLong(String)>
	//   23   37:lastore         
			}
	//*  24   38:iload_2         
	//*  25   39:iconst_1        
	//*  26   40:iadd            
	//*  27   41:istore_2        
	//*  28   42:goto            20
	//*  29   45:return          
			catch(NumberFormatException numberformatexception)
	//*  30   46:astore_3        
			{
				throw invalidLengths(as);
	//   31   47:aload_0         
	//   32   48:aload_1         
	//   33   49:invokespecial   #129 <Method IOException invalidLengths(String[])>
	//   34   52:athrow          
			}
			i++;
		} while(true);
	}

	public File getCleanFile(int i)
	{
		return cleanFiles[i];
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field File[] cleanFiles>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public File getDirtyFile(int i)
	{
		return dirtyFiles[i];
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field File[] dirtyFiles>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public String getLengths()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore          5
		long al[] = lengths;
	//    4    9:aload_0         
	//    5   10:getfield        #37  <Field long[] lengths>
	//    6   13:astore          6
		int j = al.length;
	//    7   15:aload           6
	//    8   17:arraylength     
	//    9   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore_1        
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:icmpge          50
		{
			long l = al[i];
	//   15   26:aload           6
	//   16   28:iload_1         
	//   17   29:laload          
	//   18   30:lstore_3        
			stringbuilder.append(' ').append(l);
	//   19   31:aload           5
	//   20   33:bipush          32
	//   21   35:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   22   38:lload_3         
	//   23   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
	//   24   42:pop             
		}

	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
	//*  29   47:goto            21
		return stringbuilder.toString();
	//   30   50:aload           5
	//   31   52:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   32   55:areturn         
	}

	File cleanFiles[];
	private  currentEditor;
	File dirtyFiles[];
	private final String key;
	private final long lengths[];
	private boolean readable;
	private long sequenceNumber;
	final DiskLruCache this$0;


/*
	static long[] access$1100(DiskLruCache$Entry disklrucache$entry)
	{
		return disklrucache$entry.lengths;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long[] lengths>
	//    2    4:areturn         
	}

*/


/*
	static String access$1200(DiskLruCache$Entry disklrucache$entry)
	{
		return disklrucache$entry.key;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String key>
	//    2    4:areturn         
	}

*/


/*
	static long access$1300(DiskLruCache$Entry disklrucache$entry)
	{
		return disklrucache$entry.sequenceNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field long sequenceNumber>
	//    2    4:lreturn         
	}

*/


/*
	static long access$1302(DiskLruCache$Entry disklrucache$entry, long l)
	{
		disklrucache$entry.sequenceNumber = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #91  <Field long sequenceNumber>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static boolean access$700(DiskLruCache$Entry disklrucache$entry)
	{
		return disklrucache$entry.readable;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean readable>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$702(DiskLruCache$Entry disklrucache$entry, boolean flag)
	{
		disklrucache$entry.readable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field boolean readable>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static  access$800(DiskLruCache$Entry disklrucache$entry)
	{
		return disklrucache$entry.currentEditor;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field DiskLruCache$Editor currentEditor>
	//    2    4:areturn         
	}

*/


/*
	static  access$802(DiskLruCache$Entry disklrucache$entry,  )
	{
		disklrucache$entry.currentEditor = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field DiskLruCache$Editor currentEditor>
		return ;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$900(DiskLruCache$Entry disklrucache$entry, String as[])
		throws IOException
	{
		disklrucache$entry.setLengths(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void setLengths(String[])>
		return;
	//    3    5:return          
	}

*/

	private DiskLruCache$Entry(String s)
	{
		this$0 = DiskLruCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field DiskLruCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void Object()>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String key>
		lengths = new long[DiskLruCache.access$1900(DiskLruCache.this)];
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//   11   19:newarray        long[]
	//   12   21:putfield        #37  <Field long[] lengths>
		cleanFiles = new File[DiskLruCache.access$1900(DiskLruCache.this)];
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//   16   29:anewarray       File[]
	//   17   32:putfield        #41  <Field File[] cleanFiles>
		dirtyFiles = new File[DiskLruCache.access$1900(DiskLruCache.this)];
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//   21   40:anewarray       File[]
	//   22   43:putfield        #43  <Field File[] dirtyFiles>
		s = ((String) ((new StringBuilder(s)).append('.')));
	//   23   46:new             #45  <Class StringBuilder>
	//   24   49:dup             
	//   25   50:aload_2         
	//   26   51:invokespecial   #48  <Method void StringBuilder(String)>
	//   27   54:bipush          46
	//   28   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   29   59:astore_2        
		int j = ((StringBuilder) (s)).length();
	//   30   60:aload_2         
	//   31   61:invokevirtual   #56  <Method int StringBuilder.length()>
	//   32   64:istore          4
		for(int i = 0; i < DiskLruCache.access$1900(DiskLruCache.this); i++)
	//*  33   66:iconst_0        
	//*  34   67:istore_3        
	//*  35   68:iload_3         
	//*  36   69:aload_1         
	//*  37   70:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//*  38   73:icmpge          144
		{
			((StringBuilder) (s)).append(i);
	//   39   76:aload_2         
	//   40   77:iload_3         
	//   41   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   42   81:pop             
			cleanFiles[i] = new File(DiskLruCache.access$2000(DiskLruCache.this), ((StringBuilder) (s)).toString());
	//   43   82:aload_0         
	//   44   83:getfield        #41  <Field File[] cleanFiles>
	//   45   86:iload_3         
	//   46   87:new             #39  <Class File>
	//   47   90:dup             
	//   48   91:aload_1         
	//   49   92:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//   50   95:aload_2         
	//   51   96:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   52   99:invokespecial   #70  <Method void File(File, String)>
	//   53  102:aastore         
			((StringBuilder) (s)).append(".tmp");
	//   54  103:aload_2         
	//   55  104:ldc1            #72  <String ".tmp">
	//   56  106:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
			dirtyFiles[i] = new File(DiskLruCache.access$2000(DiskLruCache.this), ((StringBuilder) (s)).toString());
	//   58  110:aload_0         
	//   59  111:getfield        #43  <Field File[] dirtyFiles>
	//   60  114:iload_3         
	//   61  115:new             #39  <Class File>
	//   62  118:dup             
	//   63  119:aload_1         
	//   64  120:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//   65  123:aload_2         
	//   66  124:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   67  127:invokespecial   #70  <Method void File(File, String)>
	//   68  130:aastore         
			((StringBuilder) (s)).setLength(j);
	//   69  131:aload_2         
	//   70  132:iload           4
	//   71  134:invokevirtual   #79  <Method void StringBuilder.setLength(int)>
		}

	//   72  137:iload_3         
	//   73  138:iconst_1        
	//   74  139:iadd            
	//   75  140:istore_3        
	//*  76  141:goto            68
	//   77  144:return          
	}

	DiskLruCache$Entry(String s, DiskLruCache._cls1 _pcls1)
	{
		this(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #83  <Method void DiskLruCache$Entry(DiskLruCache, String)>
	//    4    6:return          
	}
}
