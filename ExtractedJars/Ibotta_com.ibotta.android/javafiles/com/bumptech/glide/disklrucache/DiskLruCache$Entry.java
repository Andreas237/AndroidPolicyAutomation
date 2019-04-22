// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

private final class DiskLruCache$Entry
{

	private IOException invalidLengths(String as[])
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("unexpected journal line: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #119 <String "unexpected journal line: ">
	//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Arrays.toString(((Object []) (as))));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokestatic    #124 <Method String Arrays.toString(Object[])>
	//   11   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		throw new IOException(stringbuilder.toString());
	//   13   24:new             #109 <Class IOException>
	//   14   27:dup             
	//   15   28:aload_2         
	//   16   29:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #125 <Method void IOException(String)>
	//   18   35:athrow          
	}

	private void setLengths(String as[])
		throws IOException
	{
		NumberFormatException numberformatexception;
		if(as.length == DiskLruCache.access$1900(DiskLruCache.this))
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #26  <Field DiskLruCache this$0>
	//*   4    6:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//*   5    9:icmpne          46
		{
			int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
			do
			{
				try
				{
					if(i >= as.length)
						break;
	//    8   14:iload_2         
	//    9   15:aload_1         
	//   10   16:arraylength     
	//   11   17:icmpge          39
					lengths[i] = Long.parseLong(as[i]);
	//   12   20:aload_0         
	//   13   21:getfield        #37  <Field long[] lengths>
	//   14   24:iload_2         
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:invokestatic    #133 <Method long Long.parseLong(String)>
	//   19   31:lastore         
				}
	//*  20   32:iload_2         
	//*  21   33:iconst_1        
	//*  22   34:iadd            
	//*  23   35:istore_2        
	//*  24   36:goto            14
	//*  25   39:return          
	//*  26   40:aload_0         
	//*  27   41:aload_1         
	//*  28   42:invokespecial   #135 <Method IOException invalidLengths(String[])>
	//*  29   45:athrow          
	//*  30   46:aload_0         
	//*  31   47:aload_1         
	//*  32   48:invokespecial   #135 <Method IOException invalidLengths(String[])>
	//*  33   51:athrow          
				// Misplaced declaration of an exception variable
				catch(NumberFormatException numberformatexception)
				{
					throw invalidLengths(as);
				}
				i++;
			} while(true);
			return;
		} else
		{
			throw invalidLengths(as);
		}
	//*  34   52:astore_3        
	//*  35   53:goto            40
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
	//*  14   23:icmpge          53
		{
			long l = al[i];
	//   15   26:aload           6
	//   16   28:iload_1         
	//   17   29:laload          
	//   18   30:lstore_3        
			stringbuilder.append(' ');
	//   19   31:aload           5
	//   20   33:bipush          32
	//   21   35:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   22   38:pop             
			stringbuilder.append(l);
	//   23   39:aload           5
	//   24   41:lload_3         
	//   25   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
	//   26   45:pop             
		}

	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_1        
	//*  31   50:goto            21
		return stringbuilder.toString();
	//   32   53:aload           5
	//   33   55:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   34   58:areturn         
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
		s = ((String) (new StringBuilder(s)));
	//   23   46:new             #45  <Class StringBuilder>
	//   24   49:dup             
	//   25   50:aload_2         
	//   26   51:invokespecial   #48  <Method void StringBuilder(String)>
	//   27   54:astore_2        
		((StringBuilder) (s)).append('.');
	//   28   55:aload_2         
	//   29   56:bipush          46
	//   30   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   31   61:pop             
		int j = ((StringBuilder) (s)).length();
	//   32   62:aload_2         
	//   33   63:invokevirtual   #56  <Method int StringBuilder.length()>
	//   34   66:istore          4
		for(int i = 0; i < DiskLruCache.access$1900(DiskLruCache.this); i++)
	//*  35   68:iconst_0        
	//*  36   69:istore_3        
	//*  37   70:iload_3         
	//*  38   71:aload_1         
	//*  39   72:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
	//*  40   75:icmpge          146
		{
			((StringBuilder) (s)).append(i);
	//   41   78:aload_2         
	//   42   79:iload_3         
	//   43   80:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   44   83:pop             
			cleanFiles[i] = new File(DiskLruCache.access$2000(DiskLruCache.this), ((StringBuilder) (s)).toString());
	//   45   84:aload_0         
	//   46   85:getfield        #41  <Field File[] cleanFiles>
	//   47   88:iload_3         
	//   48   89:new             #39  <Class File>
	//   49   92:dup             
	//   50   93:aload_1         
	//   51   94:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//   52   97:aload_2         
	//   53   98:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   54  101:invokespecial   #70  <Method void File(File, String)>
	//   55  104:aastore         
			((StringBuilder) (s)).append(".tmp");
	//   56  105:aload_2         
	//   57  106:ldc1            #72  <String ".tmp">
	//   58  108:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
			dirtyFiles[i] = new File(DiskLruCache.access$2000(DiskLruCache.this), ((StringBuilder) (s)).toString());
	//   60  112:aload_0         
	//   61  113:getfield        #43  <Field File[] dirtyFiles>
	//   62  116:iload_3         
	//   63  117:new             #39  <Class File>
	//   64  120:dup             
	//   65  121:aload_1         
	//   66  122:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//   67  125:aload_2         
	//   68  126:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   69  129:invokespecial   #70  <Method void File(File, String)>
	//   70  132:aastore         
			((StringBuilder) (s)).setLength(j);
	//   71  133:aload_2         
	//   72  134:iload           4
	//   73  136:invokevirtual   #79  <Method void StringBuilder.setLength(int)>
		}

	//   74  139:iload_3         
	//   75  140:iconst_1        
	//   76  141:iadd            
	//   77  142:istore_3        
	//*  78  143:goto            70
	//   79  146:return          
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
