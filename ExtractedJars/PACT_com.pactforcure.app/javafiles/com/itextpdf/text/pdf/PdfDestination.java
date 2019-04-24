// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.StringTokenizer;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfName, PdfNumber, PdfNull, 
//			PdfIndirectReference

public class PdfDestination extends PdfArray
{

	public PdfDestination(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void PdfArray()>
		status = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean status>
		if(i == 5)
	//*   5    9:iload_1         
	//*   6   10:iconst_5        
	//*   7   11:icmpne          23
		{
			add(((PdfObject) (PdfName.FITB)));
	//    8   14:aload_0         
	//    9   15:getstatic       #35  <Field PdfName PdfName.FITB>
	//   10   18:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			add(((PdfObject) (PdfName.FIT)));
	//   13   23:aload_0         
	//   14   24:getstatic       #41  <Field PdfName PdfName.FIT>
	//   15   27:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   16   30:pop             
			return;
	//   17   31:return          
		}
	}

	public PdfDestination(int i, float f)
	{
		super(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #45  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_2         
	//    4    6:invokespecial   #48  <Method void PdfNumber(float)>
	//    5    9:invokespecial   #51  <Method void PdfArray(PdfObject)>
		status = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #30  <Field boolean status>
		switch(i)
	//*   9   17:iload_1         
		{
	//*  10   18:tableswitch     3 7: default 52
	//	               3 60
	//	               4 52
	//	               5 52
	//	               6 68
	//	               7 76
		case 4: // '\004'
		case 5: // '\005'
		default:
			addFirst(((PdfObject) (PdfName.FITH)));
	//   11   52:aload_0         
	//   12   53:getstatic       #53  <Field PdfName PdfName.FITH>
	//   13   56:invokevirtual   #56  <Method void addFirst(PdfObject)>
			return;
	//   14   59:return          

		case 3: // '\003'
			addFirst(((PdfObject) (PdfName.FITV)));
	//   15   60:aload_0         
	//   16   61:getstatic       #58  <Field PdfName PdfName.FITV>
	//   17   64:invokevirtual   #56  <Method void addFirst(PdfObject)>
			return;
	//   18   67:return          

		case 6: // '\006'
			addFirst(((PdfObject) (PdfName.FITBH)));
	//   19   68:aload_0         
	//   20   69:getstatic       #60  <Field PdfName PdfName.FITBH>
	//   21   72:invokevirtual   #56  <Method void addFirst(PdfObject)>
			return;
	//   22   75:return          

		case 7: // '\007'
			addFirst(((PdfObject) (PdfName.FITBV)));
	//   23   76:aload_0         
	//   24   77:getstatic       #62  <Field PdfName PdfName.FITBV>
	//   25   80:invokevirtual   #56  <Method void addFirst(PdfObject)>
			break;
		}
	//   26   83:return          
	}

	public PdfDestination(int i, float f, float f1, float f2)
	{
		super(((PdfObject) (PdfName.XYZ)));
	//    0    0:aload_0         
	//    1    1:getstatic       #65  <Field PdfName PdfName.XYZ>
	//    2    4:invokespecial   #51  <Method void PdfArray(PdfObject)>
		status = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #30  <Field boolean status>
		if(f < 0.0F)
	//*   6   12:fload_2         
	//*   7   13:fconst_0        
	//*   8   14:fcmpg           
	//*   9   15:ifge            55
			add(((PdfObject) (PdfNull.PDFNULL)));
	//   10   18:aload_0         
	//   11   19:getstatic       #71  <Field PdfNull PdfNull.PDFNULL>
	//   12   22:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   13   25:pop             
		else
	//*  14   26:fload_3         
	//*  15   27:fconst_0        
	//*  16   28:fcmpg           
	//*  17   29:ifge            71
	//*  18   32:aload_0         
	//*  19   33:getstatic       #71  <Field PdfNull PdfNull.PDFNULL>
	//*  20   36:invokevirtual   #39  <Method boolean add(PdfObject)>
	//*  21   39:pop             
	//*  22   40:aload_0         
	//*  23   41:new             #45  <Class PdfNumber>
	//*  24   44:dup             
	//*  25   45:fload           4
	//*  26   47:invokespecial   #48  <Method void PdfNumber(float)>
	//*  27   50:invokevirtual   #39  <Method boolean add(PdfObject)>
	//*  28   53:pop             
	//*  29   54:return          
			add(((PdfObject) (new PdfNumber(f))));
	//   30   55:aload_0         
	//   31   56:new             #45  <Class PdfNumber>
	//   32   59:dup             
	//   33   60:fload_2         
	//   34   61:invokespecial   #48  <Method void PdfNumber(float)>
	//   35   64:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   36   67:pop             
		if(f1 < 0.0F)
			add(((PdfObject) (PdfNull.PDFNULL)));
		else
	//*  37   68:goto            26
			add(((PdfObject) (new PdfNumber(f1))));
	//   38   71:aload_0         
	//   39   72:new             #45  <Class PdfNumber>
	//   40   75:dup             
	//   41   76:fload_3         
	//   42   77:invokespecial   #48  <Method void PdfNumber(float)>
	//   43   80:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   44   83:pop             
		add(((PdfObject) (new PdfNumber(f2))));
	//*  45   84:goto            40
	}

	public PdfDestination(int i, float f, float f1, float f2, float f3)
	{
		super(((PdfObject) (PdfName.FITR)));
	//    0    0:aload_0         
	//    1    1:getstatic       #74  <Field PdfName PdfName.FITR>
	//    2    4:invokespecial   #51  <Method void PdfArray(PdfObject)>
		status = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #30  <Field boolean status>
		add(((PdfObject) (new PdfNumber(f))));
	//    6   12:aload_0         
	//    7   13:new             #45  <Class PdfNumber>
	//    8   16:dup             
	//    9   17:fload_2         
	//   10   18:invokespecial   #48  <Method void PdfNumber(float)>
	//   11   21:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   12   24:pop             
		add(((PdfObject) (new PdfNumber(f1))));
	//   13   25:aload_0         
	//   14   26:new             #45  <Class PdfNumber>
	//   15   29:dup             
	//   16   30:fload_3         
	//   17   31:invokespecial   #48  <Method void PdfNumber(float)>
	//   18   34:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   19   37:pop             
		add(((PdfObject) (new PdfNumber(f2))));
	//   20   38:aload_0         
	//   21   39:new             #45  <Class PdfNumber>
	//   22   42:dup             
	//   23   43:fload           4
	//   24   45:invokespecial   #48  <Method void PdfNumber(float)>
	//   25   48:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   26   51:pop             
		add(((PdfObject) (new PdfNumber(f3))));
	//   27   52:aload_0         
	//   28   53:new             #45  <Class PdfNumber>
	//   29   56:dup             
	//   30   57:fload           5
	//   31   59:invokespecial   #48  <Method void PdfNumber(float)>
	//   32   62:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   33   65:pop             
	//   34   66:return          
	}

	public PdfDestination(PdfDestination pdfdestination)
	{
		super(((PdfArray) (pdfdestination)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void PdfArray(PdfArray)>
		status = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field boolean status>
		status = pdfdestination.status;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #30  <Field boolean status>
	//    9   15:putfield        #30  <Field boolean status>
	//   10   18:return          
	}

	public PdfDestination(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void PdfArray()>
		status = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean status>
		s = ((String) (new StringTokenizer(s)));
	//    5    9:new             #83  <Class StringTokenizer>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #85  <Method void StringTokenizer(String)>
	//    9   17:astore_1        
		if(((StringTokenizer) (s)).hasMoreTokens())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #89  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  12   22:ifeq            41
			add(((PdfObject) (new PdfName(((StringTokenizer) (s)).nextToken()))));
	//   13   25:aload_0         
	//   14   26:new             #32  <Class PdfName>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokevirtual   #93  <Method String StringTokenizer.nextToken()>
	//   18   34:invokespecial   #94  <Method void PdfName(String)>
	//   19   37:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   20   40:pop             
		while(((StringTokenizer) (s)).hasMoreTokens()) 
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #89  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  23   45:ifeq            109
		{
			String s1 = ((StringTokenizer) (s)).nextToken();
	//   24   48:aload_1         
	//   25   49:invokevirtual   #93  <Method String StringTokenizer.nextToken()>
	//   26   52:astore_2        
			if("null".equals(((Object) (s1))))
	//*  27   53:ldc1            #96  <String "null">
	//*  28   55:aload_2         
	//*  29   56:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  30   59:ifeq            77
				add(((PdfObject) (new PdfNull())));
	//   31   62:aload_0         
	//   32   63:new             #67  <Class PdfNull>
	//   33   66:dup             
	//   34   67:invokespecial   #103 <Method void PdfNull()>
	//   35   70:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   36   73:pop             
			else
	//*  37   74:goto            41
				try
				{
					add(((PdfObject) (new PdfNumber(s1))));
	//   38   77:aload_0         
	//   39   78:new             #45  <Class PdfNumber>
	//   40   81:dup             
	//   41   82:aload_2         
	//   42   83:invokespecial   #104 <Method void PdfNumber(String)>
	//   43   86:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   44   89:pop             
				}
	//*  45   90:goto            41
				catch(RuntimeException runtimeexception)
	//*  46   93:astore_2        
				{
					add(((PdfObject) (new PdfNull())));
	//   47   94:aload_0         
	//   48   95:new             #67  <Class PdfNull>
	//   49   98:dup             
	//   50   99:invokespecial   #103 <Method void PdfNull()>
	//   51  102:invokevirtual   #39  <Method boolean add(PdfObject)>
	//   52  105:pop             
				}
		}
	//*  53  106:goto            41
	//   54  109:return          
	}

	public boolean addPage(PdfIndirectReference pdfindirectreference)
	{
		if(!status)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean status>
	//*   2    4:ifne            19
		{
			addFirst(((PdfObject) (pdfindirectreference)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #56  <Method void addFirst(PdfObject)>
			status = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #30  <Field boolean status>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public boolean hasPage()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean status>
	//    2    4:ireturn         
	}

	public static final int FIT = 1;
	public static final int FITB = 5;
	public static final int FITBH = 6;
	public static final int FITBV = 7;
	public static final int FITH = 2;
	public static final int FITR = 4;
	public static final int FITV = 3;
	public static final int XYZ = 0;
	private boolean status;
}
