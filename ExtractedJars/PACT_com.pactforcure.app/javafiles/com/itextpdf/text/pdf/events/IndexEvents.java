// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.*;

public class IndexEvents extends PdfPageEventHelper
{
	public class Entry
	{

		public void addPageNumberAndTag(int i, String s)
		{
			pagenumbers.add(((Object) (Integer.valueOf(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List pagenumbers>
		//    2    4:iload_1         
		//    3    5:invokestatic    #50  <Method Integer Integer.valueOf(int)>
		//    4    8:invokeinterface #56  <Method boolean List.add(Object)>
		//    5   13:pop             
			tags.add(((Object) (s)));
		//    6   14:aload_0         
		//    7   15:getfield        #33  <Field List tags>
		//    8   18:aload_2         
		//    9   19:invokeinterface #56  <Method boolean List.add(Object)>
		//   10   24:pop             
		//   11   25:return          
		}

		public String getIn1()
		{
			return in1;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field String in1>
		//    2    4:areturn         
		}

		public String getIn2()
		{
			return in2;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String in2>
		//    2    4:areturn         
		}

		public String getIn3()
		{
			return in3;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String in3>
		//    2    4:areturn         
		}

		public String getKey()
		{
			return (new StringBuilder()).append(in1).append("!").append(in2).append("!").append(in3).toString();
		//    0    0:new             #63  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #64  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field String in1>
		//    5   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    6   14:ldc1            #70  <String "!">
		//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:aload_0         
		//    9   20:getfield        #37  <Field String in2>
		//   10   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   11   26:ldc1            #70  <String "!">
		//   12   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   13   31:aload_0         
		//   14   32:getfield        #39  <Field String in3>
		//   15   35:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   16   38:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   41:areturn         
		}

		public int getPageNumber()
		{
			int i = -1;
		//    0    0:iconst_m1       
		//    1    1:istore_1        
			Integer integer = (Integer)indextag.get(((Object) (tag)));
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field IndexEvents this$0>
		//    4    6:invokestatic    #79  <Method Map IndexEvents.access$000(IndexEvents)>
		//    5    9:aload_0         
		//    6   10:getfield        #41  <Field String tag>
		//    7   13:invokeinterface #85  <Method Object Map.get(Object)>
		//    8   18:checkcast       #46  <Class Integer>
		//    9   21:astore_2        
			if(integer != null)
		//*  10   22:aload_2         
		//*  11   23:ifnull          31
				i = integer.intValue();
		//   12   26:aload_2         
		//   13   27:invokevirtual   #88  <Method int Integer.intValue()>
		//   14   30:istore_1        
			return i;
		//   15   31:iload_1         
		//   16   32:ireturn         
		}

		public List getPagenumbers()
		{
			return pagenumbers;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List pagenumbers>
		//    2    4:areturn         
		}

		public String getTag()
		{
			return tag;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String tag>
		//    2    4:areturn         
		}

		public List getTags()
		{
			return tags;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field List tags>
		//    2    4:areturn         
		}

		public String toString()
		{
			StringBuffer stringbuffer = new StringBuffer();
		//    0    0:new             #97  <Class StringBuffer>
		//    1    3:dup             
		//    2    4:invokespecial   #98  <Method void StringBuffer()>
		//    3    7:astore_2        
			stringbuffer.append(in1).append(' ');
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #35  <Field String in1>
		//    7   13:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
		//    8   16:bipush          32
		//    9   18:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
		//   10   21:pop             
			stringbuffer.append(in2).append(' ');
		//   11   22:aload_2         
		//   12   23:aload_0         
		//   13   24:getfield        #37  <Field String in2>
		//   14   27:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
		//   15   30:bipush          32
		//   16   32:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
		//   17   35:pop             
			stringbuffer.append(in3).append(' ');
		//   18   36:aload_2         
		//   19   37:aload_0         
		//   20   38:getfield        #39  <Field String in3>
		//   21   41:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
		//   22   44:bipush          32
		//   23   46:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
		//   24   49:pop             
			for(int i = 0; i < pagenumbers.size(); i++)
		//*  25   50:iconst_0        
		//*  26   51:istore_1        
		//*  27   52:iload_1         
		//*  28   53:aload_0         
		//*  29   54:getfield        #31  <Field List pagenumbers>
		//*  30   57:invokeinterface #107 <Method int List.size()>
		//*  31   62:icmpge          92
				stringbuffer.append(pagenumbers.get(i)).append(' ');
		//   32   65:aload_2         
		//   33   66:aload_0         
		//   34   67:getfield        #31  <Field List pagenumbers>
		//   35   70:iload_1         
		//   36   71:invokeinterface #110 <Method Object List.get(int)>
		//   37   76:invokevirtual   #113 <Method StringBuffer StringBuffer.append(Object)>
		//   38   79:bipush          32
		//   39   81:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
		//   40   84:pop             

		//   41   85:iload_1         
		//   42   86:iconst_1        
		//   43   87:iadd            
		//   44   88:istore_1        
		//*  45   89:goto            52
			return stringbuffer.toString();
		//   46   92:aload_2         
		//   47   93:invokevirtual   #114 <Method String StringBuffer.toString()>
		//   48   96:areturn         
		}

		private String in1;
		private String in2;
		private String in3;
		private List pagenumbers;
		private String tag;
		private List tags;
		final IndexEvents this$0;

		public Entry(String s, String s1, String s2, String s3)
		{
			this$0 = IndexEvents.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field IndexEvents this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			pagenumbers = ((List) (new ArrayList()));
		//    5    9:aload_0         
		//    6   10:new             #28  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #29  <Method void ArrayList()>
		//    9   17:putfield        #31  <Field List pagenumbers>
			tags = ((List) (new ArrayList()));
		//   10   20:aload_0         
		//   11   21:new             #28  <Class ArrayList>
		//   12   24:dup             
		//   13   25:invokespecial   #29  <Method void ArrayList()>
		//   14   28:putfield        #33  <Field List tags>
			in1 = s;
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:putfield        #35  <Field String in1>
			in2 = s1;
		//   18   36:aload_0         
		//   19   37:aload_3         
		//   20   38:putfield        #37  <Field String in2>
			in3 = s2;
		//   21   41:aload_0         
		//   22   42:aload           4
		//   23   44:putfield        #39  <Field String in3>
			tag = s3;
		//   24   47:aload_0         
		//   25   48:aload           5
		//   26   50:putfield        #41  <Field String tag>
		//   27   53:return          
		}
	}


	public IndexEvents()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void PdfPageEventHelper()>
		indextag = ((Map) (new TreeMap()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void TreeMap()>
	//    6   12:putfield        #29  <Field Map indextag>
		indexcounter = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #31  <Field long indexcounter>
		indexentry = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #33  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #34  <Method void ArrayList()>
	//   14   28:putfield        #36  <Field List indexentry>
		comparator = new Comparator() {

			public int compare(Entry entry, Entry entry1)
			{
				boolean flag = false;
			//    0    0:iconst_0        
			//    1    1:istore          4
				int i = ((int) (flag));
			//    2    3:iload           4
			//    3    5:istore_3        
				if(entry.getIn1() != null)
			//*   4    6:aload_1         
			//*   5    7:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
			//*   6   10:ifnull          117
				{
					i = ((int) (flag));
			//    7   13:iload           4
			//    8   15:istore_3        
					if(entry1.getIn1() != null)
			//*   9   16:aload_2         
			//*  10   17:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
			//*  11   20:ifnull          117
					{
						int j = entry.getIn1().compareToIgnoreCase(entry1.getIn1());
			//   12   23:aload_1         
			//   13   24:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
			//   14   27:aload_2         
			//   15   28:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
			//   16   31:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
			//   17   34:istore          4
						i = j;
			//   18   36:iload           4
			//   19   38:istore_3        
						if(j == 0)
			//*  20   39:iload           4
			//*  21   41:ifne            117
						{
							i = j;
			//   22   44:iload           4
			//   23   46:istore_3        
							if(entry.getIn2() != null)
			//*  24   47:aload_1         
			//*  25   48:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
			//*  26   51:ifnull          117
							{
								i = j;
			//   27   54:iload           4
			//   28   56:istore_3        
								if(entry1.getIn2() != null)
			//*  29   57:aload_2         
			//*  30   58:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
			//*  31   61:ifnull          117
								{
									int k = entry.getIn2().compareToIgnoreCase(entry1.getIn2());
			//   32   64:aload_1         
			//   33   65:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
			//   34   68:aload_2         
			//   35   69:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
			//   36   72:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
			//   37   75:istore          4
									i = k;
			//   38   77:iload           4
			//   39   79:istore_3        
									if(k == 0)
			//*  40   80:iload           4
			//*  41   82:ifne            117
									{
										i = k;
			//   42   85:iload           4
			//   43   87:istore_3        
										if(entry.getIn3() != null)
			//*  44   88:aload_1         
			//*  45   89:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
			//*  46   92:ifnull          117
										{
											i = k;
			//   47   95:iload           4
			//   48   97:istore_3        
											if(entry1.getIn3() != null)
			//*  49   98:aload_2         
			//*  50   99:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
			//*  51  102:ifnull          117
												i = entry.getIn3().compareToIgnoreCase(entry1.getIn3());
			//   52  105:aload_1         
			//   53  106:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
			//   54  109:aload_2         
			//   55  110:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
			//   56  113:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
			//   57  116:istore_3        
										}
									}
								}
							}
						}
					}
				}
				return i;
			//   58  117:iload_3         
			//   59  118:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((Entry)obj, (Entry)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #23  <Class IndexEvents$Entry>
			//    3    5:aload_2         
			//    4    6:checkcast       #23  <Class IndexEvents$Entry>
			//    5    9:invokevirtual   #42  <Method int compare(IndexEvents$Entry, IndexEvents$Entry)>
			//    6   12:ireturn         
			}

			final IndexEvents this$0;

			
			{
				this$0 = IndexEvents.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field IndexEvents this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   15   31:aload_0         
	//   16   32:new             #6   <Class IndexEvents$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #39  <Method void IndexEvents$1(IndexEvents)>
	//   20   40:putfield        #41  <Field Comparator comparator>
	//   21   43:return          
	}

	public Chunk create(String s, String s1)
	{
		return create(s, s1, "", "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #48  <String "">
	//    4    5:ldc1            #48  <String "">
	//    5    7:invokevirtual   #51  <Method Chunk create(String, String, String, String)>
	//    6   10:areturn         
	}

	public Chunk create(String s, String s1, String s2)
	{
		return create(s, s1, s2, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #48  <String "">
	//    5    6:invokevirtual   #51  <Method Chunk create(String, String, String, String)>
	//    6    9:areturn         
	}

	public Chunk create(String s, String s1, String s2, String s3)
	{
		s = ((String) (new Chunk(s)));
	//    0    0:new             #54  <Class Chunk>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #57  <Method void Chunk(String)>
	//    4    8:astore_1        
		Object obj = ((Object) ((new StringBuilder()).append("idx_")));
	//    5    9:new             #59  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #60  <Method void StringBuilder()>
	//    8   16:ldc1            #62  <String "idx_">
	//    9   18:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:astore          7
		long l = indexcounter;
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field long indexcounter>
	//   13   27:lstore          5
		indexcounter = 1L + l;
	//   14   29:aload_0         
	//   15   30:lconst_1        
	//   16   31:lload           5
	//   17   33:ladd            
	//   18   34:putfield        #31  <Field long indexcounter>
		obj = ((Object) (((StringBuilder) (obj)).append(l).toString()));
	//   19   37:aload           7
	//   20   39:lload           5
	//   21   41:invokevirtual   #69  <Method StringBuilder StringBuilder.append(long)>
	//   22   44:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   23   47:astore          7
		((Chunk) (s)).setGenericTag(((String) (obj)));
	//   24   49:aload_1         
	//   25   50:aload           7
	//   26   52:invokevirtual   #77  <Method Chunk Chunk.setGenericTag(String)>
	//   27   55:pop             
		((Chunk) (s)).setLocalDestination(((String) (obj)));
	//   28   56:aload_1         
	//   29   57:aload           7
	//   30   59:invokevirtual   #80  <Method Chunk Chunk.setLocalDestination(String)>
	//   31   62:pop             
		s1 = ((String) (new Entry(s1, s2, s3, ((String) (obj)))));
	//   32   63:new             #8   <Class IndexEvents$Entry>
	//   33   66:dup             
	//   34   67:aload_0         
	//   35   68:aload_2         
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:aload           7
	//   39   74:invokespecial   #83  <Method void IndexEvents$Entry(IndexEvents, String, String, String, String)>
	//   40   77:astore_2        
		indexentry.add(((Object) (s1)));
	//   41   78:aload_0         
	//   42   79:getfield        #36  <Field List indexentry>
	//   43   82:aload_2         
	//   44   83:invokeinterface #89  <Method boolean List.add(Object)>
	//   45   88:pop             
		return ((Chunk) (s));
	//   46   89:aload_1         
	//   47   90:areturn         
	}

	public void create(Chunk chunk, String s)
	{
		create(chunk, s, "", "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #48  <String "">
	//    4    5:ldc1            #48  <String "">
	//    5    7:invokevirtual   #93  <Method void create(Chunk, String, String, String)>
	//    6   10:return          
	}

	public void create(Chunk chunk, String s, String s1)
	{
		create(chunk, s, s1, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #48  <String "">
	//    5    6:invokevirtual   #93  <Method void create(Chunk, String, String, String)>
	//    6    9:return          
	}

	public void create(Chunk chunk, String s, String s1, String s2)
	{
		Object obj = ((Object) ((new StringBuilder()).append("idx_")));
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:ldc1            #62  <String "idx_">
	//    4    9:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:astore          7
		long l = indexcounter;
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field long indexcounter>
	//    8   18:lstore          5
		indexcounter = 1L + l;
	//    9   20:aload_0         
	//   10   21:lconst_1        
	//   11   22:lload           5
	//   12   24:ladd            
	//   13   25:putfield        #31  <Field long indexcounter>
		obj = ((Object) (((StringBuilder) (obj)).append(l).toString()));
	//   14   28:aload           7
	//   15   30:lload           5
	//   16   32:invokevirtual   #69  <Method StringBuilder StringBuilder.append(long)>
	//   17   35:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   18   38:astore          7
		chunk.setGenericTag(((String) (obj)));
	//   19   40:aload_1         
	//   20   41:aload           7
	//   21   43:invokevirtual   #77  <Method Chunk Chunk.setGenericTag(String)>
	//   22   46:pop             
		chunk.setLocalDestination(((String) (obj)));
	//   23   47:aload_1         
	//   24   48:aload           7
	//   25   50:invokevirtual   #80  <Method Chunk Chunk.setLocalDestination(String)>
	//   26   53:pop             
		chunk = ((Chunk) (new Entry(s, s1, s2, ((String) (obj)))));
	//   27   54:new             #8   <Class IndexEvents$Entry>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:aload           4
	//   33   63:aload           7
	//   34   65:invokespecial   #83  <Method void IndexEvents$Entry(IndexEvents, String, String, String, String)>
	//   35   68:astore_1        
		indexentry.add(((Object) (chunk)));
	//   36   69:aload_0         
	//   37   70:getfield        #36  <Field List indexentry>
	//   38   73:aload_1         
	//   39   74:invokeinterface #89  <Method boolean List.add(Object)>
	//   40   79:pop             
	//   41   80:return          
	}

	public List getSortedEntries()
	{
		Object obj = ((Object) (new HashMap()));
	//    0    0:new             #98  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void HashMap()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		while(i < indexentry.size()) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #36  <Field List indexentry>
	//*   9   15:invokeinterface #103 <Method int List.size()>
	//*  10   20:icmpge          106
		{
			Entry entry = (Entry)indexentry.get(i);
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field List indexentry>
	//   13   27:iload_1         
	//   14   28:invokeinterface #107 <Method Object List.get(int)>
	//   15   33:checkcast       #8   <Class IndexEvents$Entry>
	//   16   36:astore_3        
			String s = entry.getKey();
	//   17   37:aload_3         
	//   18   38:invokevirtual   #110 <Method String IndexEvents$Entry.getKey()>
	//   19   41:astore          4
			Entry entry1 = (Entry)((Map) (obj)).get(((Object) (s)));
	//   20   43:aload_2         
	//   21   44:aload           4
	//   22   46:invokeinterface #115 <Method Object Map.get(Object)>
	//   23   51:checkcast       #8   <Class IndexEvents$Entry>
	//   24   54:astore          5
			if(entry1 != null)
	//*  25   56:aload           5
	//*  26   58:ifnull          81
			{
				entry1.addPageNumberAndTag(entry.getPageNumber(), entry.getTag());
	//   27   61:aload           5
	//   28   63:aload_3         
	//   29   64:invokevirtual   #118 <Method int IndexEvents$Entry.getPageNumber()>
	//   30   67:aload_3         
	//   31   68:invokevirtual   #121 <Method String IndexEvents$Entry.getTag()>
	//   32   71:invokevirtual   #125 <Method void IndexEvents$Entry.addPageNumberAndTag(int, String)>
			} else
	//*  33   74:iload_1         
	//*  34   75:iconst_1        
	//*  35   76:iadd            
	//*  36   77:istore_1        
	//*  37   78:goto            10
			{
				entry.addPageNumberAndTag(entry.getPageNumber(), entry.getTag());
	//   38   81:aload_3         
	//   39   82:aload_3         
	//   40   83:invokevirtual   #118 <Method int IndexEvents$Entry.getPageNumber()>
	//   41   86:aload_3         
	//   42   87:invokevirtual   #121 <Method String IndexEvents$Entry.getTag()>
	//   43   90:invokevirtual   #125 <Method void IndexEvents$Entry.addPageNumberAndTag(int, String)>
				((Map) (obj)).put(((Object) (s)), ((Object) (entry)));
	//   44   93:aload_2         
	//   45   94:aload           4
	//   46   96:aload_3         
	//   47   97:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   48  102:pop             
			}
			i++;
		}
	//*  49  103:goto            74
		obj = ((Object) (new ArrayList(((Map) (obj)).values())));
	//   50  106:new             #33  <Class ArrayList>
	//   51  109:dup             
	//   52  110:aload_2         
	//   53  111:invokeinterface #133 <Method java.util.Collection Map.values()>
	//   54  116:invokespecial   #136 <Method void ArrayList(java.util.Collection)>
	//   55  119:astore_2        
		Collections.sort(((List) (obj)), comparator);
	//   56  120:aload_2         
	//   57  121:aload_0         
	//   58  122:getfield        #41  <Field Comparator comparator>
	//   59  125:invokestatic    #142 <Method void Collections.sort(List, Comparator)>
		return ((List) (obj));
	//   60  128:aload_2         
	//   61  129:areturn         
	}

	public void onGenericTag(PdfWriter pdfwriter, Document document, Rectangle rectangle, String s)
	{
		indextag.put(((Object) (s)), ((Object) (Integer.valueOf(pdfwriter.getPageNumber()))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Map indextag>
	//    2    4:aload           4
	//    3    6:aload_1         
	//    4    7:invokevirtual   #149 <Method int PdfWriter.getPageNumber()>
	//    5   10:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//    6   13:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//    7   18:pop             
	//    8   19:return          
	}

	public void setComparator(Comparator comparator1)
	{
		comparator = comparator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Comparator comparator>
	//    3    5:return          
	}

	private Comparator comparator;
	private long indexcounter;
	private List indexentry;
	private Map indextag;


/*
	static Map access$000(IndexEvents indexevents)
	{
		return indexevents.indextag;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Map indextag>
	//    2    4:areturn         
	}

*/
}
