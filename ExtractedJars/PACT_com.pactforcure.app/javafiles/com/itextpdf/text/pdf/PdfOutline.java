// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfString, PdfName, PdfDestination, 
//			PdfWriter, PdfArray, PdfNumber, PdfAction, 
//			PdfIndirectReference

public class PdfOutline extends PdfDictionary
{

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, Paragraph paragraph)
	{
		this(pdfoutline, pdfaction, paragraph, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #31  <Method void PdfOutline(PdfOutline, PdfAction, Paragraph, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, Paragraph paragraph, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PdfDictionary()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int count>
		kids = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void ArrayList()>
	//    9   17:putfield        #42  <Field ArrayList kids>
		style = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field int style>
		StringBuffer stringbuffer = new StringBuffer();
	//   13   25:new             #46  <Class StringBuffer>
	//   14   28:dup             
	//   15   29:invokespecial   #47  <Method void StringBuffer()>
	//   16   32:astore          5
		for(paragraph = ((Paragraph) (paragraph.getChunks().iterator())); ((Iterator) (paragraph)).hasNext(); stringbuffer.append(((Chunk)((Iterator) (paragraph)).next()).getContent()));
	//   17   34:aload_3         
	//   18   35:invokevirtual   #53  <Method List Paragraph.getChunks()>
	//   19   38:invokeinterface #59  <Method Iterator List.iterator()>
	//   20   43:astore_3        
	//   21   44:aload_3         
	//   22   45:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   23   50:ifeq            74
	//   24   53:aload           5
	//   25   55:aload_3         
	//   26   56:invokeinterface #69  <Method Object Iterator.next()>
	//   27   61:checkcast       #71  <Class Chunk>
	//   28   64:invokevirtual   #75  <Method String Chunk.getContent()>
	//   29   67:invokevirtual   #79  <Method StringBuffer StringBuffer.append(String)>
	//   30   70:pop             
	//*  31   71:goto            44
		action = pdfaction;
	//   32   74:aload_0         
	//   33   75:aload_2         
	//   34   76:putfield        #81  <Field PdfAction action>
		initOutline(pdfoutline, stringbuffer.toString(), flag);
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:aload           5
	//   38   83:invokevirtual   #84  <Method String StringBuffer.toString()>
	//   39   86:iload           4
	//   40   88:invokevirtual   #88  <Method void initOutline(PdfOutline, String, boolean)>
	//   41   91:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, PdfString pdfstring)
	{
		this(pdfoutline, pdfaction, pdfstring, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #92  <Method void PdfOutline(PdfOutline, PdfAction, PdfString, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, PdfString pdfstring, boolean flag)
	{
		this(pdfoutline, pdfaction, pdfstring.toString(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #95  <Method String PdfString.toString()>
	//    5    7:iload           4
	//    6    9:invokespecial   #98  <Method void PdfOutline(PdfOutline, PdfAction, String, boolean)>
	//    7   12:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, String s)
	{
		this(pdfoutline, pdfaction, s, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #98  <Method void PdfOutline(PdfOutline, PdfAction, String, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfAction pdfaction, String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PdfDictionary()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int count>
		kids = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void ArrayList()>
	//    9   17:putfield        #42  <Field ArrayList kids>
		style = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field int style>
		action = pdfaction;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #81  <Field PdfAction action>
		initOutline(pdfoutline, s, flag);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:iload           4
	//   20   35:invokevirtual   #88  <Method void initOutline(PdfOutline, String, boolean)>
	//   21   38:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, Paragraph paragraph)
	{
		this(pdfoutline, pdfdestination, paragraph, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #103 <Method void PdfOutline(PdfOutline, PdfDestination, Paragraph, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, Paragraph paragraph, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PdfDictionary()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int count>
		kids = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void ArrayList()>
	//    9   17:putfield        #42  <Field ArrayList kids>
		style = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field int style>
		StringBuffer stringbuffer = new StringBuffer();
	//   13   25:new             #46  <Class StringBuffer>
	//   14   28:dup             
	//   15   29:invokespecial   #47  <Method void StringBuffer()>
	//   16   32:astore          5
		for(paragraph = ((Paragraph) (paragraph.getChunks().iterator())); ((Iterator) (paragraph)).hasNext(); stringbuffer.append(((Chunk)((Iterator) (paragraph)).next()).getContent()));
	//   17   34:aload_3         
	//   18   35:invokevirtual   #53  <Method List Paragraph.getChunks()>
	//   19   38:invokeinterface #59  <Method Iterator List.iterator()>
	//   20   43:astore_3        
	//   21   44:aload_3         
	//   22   45:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   23   50:ifeq            74
	//   24   53:aload           5
	//   25   55:aload_3         
	//   26   56:invokeinterface #69  <Method Object Iterator.next()>
	//   27   61:checkcast       #71  <Class Chunk>
	//   28   64:invokevirtual   #75  <Method String Chunk.getContent()>
	//   29   67:invokevirtual   #79  <Method StringBuffer StringBuffer.append(String)>
	//   30   70:pop             
	//*  31   71:goto            44
		destination = pdfdestination;
	//   32   74:aload_0         
	//   33   75:aload_2         
	//   34   76:putfield        #105 <Field PdfDestination destination>
		initOutline(pdfoutline, stringbuffer.toString(), flag);
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:aload           5
	//   38   83:invokevirtual   #84  <Method String StringBuffer.toString()>
	//   39   86:iload           4
	//   40   88:invokevirtual   #88  <Method void initOutline(PdfOutline, String, boolean)>
	//   41   91:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, PdfString pdfstring)
	{
		this(pdfoutline, pdfdestination, pdfstring, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #109 <Method void PdfOutline(PdfOutline, PdfDestination, PdfString, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, PdfString pdfstring, boolean flag)
	{
		this(pdfoutline, pdfdestination, pdfstring.toString(), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #95  <Method String PdfString.toString()>
	//    5    7:iconst_1        
	//    6    8:invokespecial   #112 <Method void PdfOutline(PdfOutline, PdfDestination, String, boolean)>
	//    7   11:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, String s)
	{
		this(pdfoutline, pdfdestination, s, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #112 <Method void PdfOutline(PdfOutline, PdfDestination, String, boolean)>
	//    6    8:return          
	}

	public PdfOutline(PdfOutline pdfoutline, PdfDestination pdfdestination, String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PdfDictionary()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int count>
		kids = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void ArrayList()>
	//    9   17:putfield        #42  <Field ArrayList kids>
		style = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field int style>
		destination = pdfdestination;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #105 <Field PdfDestination destination>
		initOutline(pdfoutline, s, flag);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:iload           4
	//   20   35:invokevirtual   #88  <Method void initOutline(PdfOutline, String, boolean)>
	//   21   38:return          
	}

	PdfOutline(PdfWriter pdfwriter)
	{
		super(OUTLINES);
	//    0    0:aload_0         
	//    1    1:getstatic       #118 <Field PdfName OUTLINES>
	//    2    4:invokespecial   #121 <Method void PdfDictionary(PdfName)>
		count = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #37  <Field int count>
		kids = new ArrayList();
	//    6   12:aload_0         
	//    7   13:new             #39  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #40  <Method void ArrayList()>
	//   10   20:putfield        #42  <Field ArrayList kids>
		style = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #44  <Field int style>
		open = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #123 <Field boolean open>
		parent = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #125 <Field PdfOutline parent>
		writer = pdfwriter;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #127 <Field PdfWriter writer>
	//   23   43:return          
	}

	public void addKid(PdfOutline pdfoutline)
	{
		kids.add(((Object) (pdfoutline)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList kids>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public BaseColor getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field BaseColor color>
	//    2    4:areturn         
	}

	int getCount()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int count>
	//    2    4:ireturn         
	}

	public ArrayList getKids()
	{
		return kids;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList kids>
	//    2    4:areturn         
	}

	public PdfDestination getPdfDestination()
	{
		return destination;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field PdfDestination destination>
	//    2    4:areturn         
	}

	public int getStyle()
	{
		return style;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int style>
	//    2    4:ireturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String tag>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return ((PdfString)get(PdfName.TITLE)).toString();
	//    0    0:aload_0         
	//    1    1:getstatic       #155 <Field PdfName PdfName.TITLE>
	//    2    4:invokevirtual   #159 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #94  <Class PdfString>
	//    4   10:invokevirtual   #95  <Method String PdfString.toString()>
	//    5   13:areturn         
	}

	public PdfIndirectReference indirectReference()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field PdfIndirectReference reference>
	//    2    4:areturn         
	}

	void initOutline(PdfOutline pdfoutline, String s, boolean flag)
	{
		open = flag;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #123 <Field boolean open>
		parent = pdfoutline;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #125 <Field PdfOutline parent>
		writer = pdfoutline.writer;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #127 <Field PdfWriter writer>
	//    9   15:putfield        #127 <Field PdfWriter writer>
		put(PdfName.TITLE, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   10   18:aload_0         
	//   11   19:getstatic       #155 <Field PdfName PdfName.TITLE>
	//   12   22:new             #94  <Class PdfString>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:ldc1            #165 <String "UnicodeBig">
	//   16   29:invokespecial   #168 <Method void PdfString(String, String)>
	//   17   32:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		pdfoutline.addKid(this);
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #174 <Method void addKid(PdfOutline)>
		if(destination != null && !destination.hasPage())
	//*  21   40:aload_0         
	//*  22   41:getfield        #105 <Field PdfDestination destination>
	//*  23   44:ifnull          69
	//*  24   47:aload_0         
	//*  25   48:getfield        #105 <Field PdfDestination destination>
	//*  26   51:invokevirtual   #179 <Method boolean PdfDestination.hasPage()>
	//*  27   54:ifne            69
			setDestinationPage(writer.getCurrentPage());
	//   28   57:aload_0         
	//   29   58:aload_0         
	//   30   59:getfield        #127 <Field PdfWriter writer>
	//   31   62:invokevirtual   #184 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//   32   65:invokevirtual   #188 <Method boolean setDestinationPage(PdfIndirectReference)>
	//   33   68:pop             
	//   34   69:return          
	}

	public boolean isOpen()
	{
		return open;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean open>
	//    2    4:ireturn         
	}

	public int level()
	{
		if(parent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field PdfOutline parent>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return parent.level() + 1;
	//    5    9:aload_0         
	//    6   10:getfield        #125 <Field PdfOutline parent>
	//    7   13:invokevirtual   #192 <Method int level()>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:ireturn         
	}

	public PdfOutline parent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field PdfOutline parent>
	//    2    4:areturn         
	}

	public void setColor(BaseColor basecolor)
	{
		color = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field BaseColor color>
	//    3    5:return          
	}

	void setCount(int i)
	{
		count = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int count>
	//    3    5:return          
	}

	public boolean setDestinationPage(PdfIndirectReference pdfindirectreference)
	{
		if(destination == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field PdfDestination destination>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return destination.addPage(pdfindirectreference);
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field PdfDestination destination>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #200 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//    9   17:ireturn         
	}

	public void setIndirectReference(PdfIndirectReference pdfindirectreference)
	{
		reference = pdfindirectreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field PdfIndirectReference reference>
	//    3    5:return          
	}

	public void setKids(ArrayList arraylist)
	{
		kids = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field ArrayList kids>
	//    3    5:return          
	}

	public void setOpen(boolean flag)
	{
		open = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean open>
	//    3    5:return          
	}

	public void setStyle(int i)
	{
		style = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int style>
	//    3    5:return          
	}

	public void setTag(String s)
	{
		tag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field String tag>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		put(PdfName.TITLE, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #155 <Field PdfName PdfName.TITLE>
	//    2    4:new             #94  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #165 <String "UnicodeBig">
	//    6   11:invokespecial   #168 <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		if(color != null && !color.equals(((Object) (BaseColor.BLACK))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field BaseColor color>
	//*   2    4:ifnull          79
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field BaseColor color>
	//*   5   11:getstatic       #220 <Field BaseColor BaseColor.BLACK>
	//*   6   14:invokevirtual   #223 <Method boolean BaseColor.equals(Object)>
	//*   7   17:ifne            79
			put(PdfName.C, ((PdfObject) (new PdfArray(new float[] {
				(float)color.getRed() / 255F, (float)color.getGreen() / 255F, (float)color.getBlue() / 255F
			}))));
	//    8   20:aload_0         
	//    9   21:getstatic       #226 <Field PdfName PdfName.C>
	//   10   24:new             #228 <Class PdfArray>
	//   11   27:dup             
	//   12   28:iconst_3        
	//   13   29:newarray        float[]
	//   14   31:dup             
	//   15   32:iconst_0        
	//   16   33:aload_0         
	//   17   34:getfield        #137 <Field BaseColor color>
	//   18   37:invokevirtual   #231 <Method int BaseColor.getRed()>
	//   19   40:i2f             
	//   20   41:ldc1            #232 <Float 255F>
	//   21   43:fdiv            
	//   22   44:fastore         
	//   23   45:dup             
	//   24   46:iconst_1        
	//   25   47:aload_0         
	//   26   48:getfield        #137 <Field BaseColor color>
	//   27   51:invokevirtual   #235 <Method int BaseColor.getGreen()>
	//   28   54:i2f             
	//   29   55:ldc1            #232 <Float 255F>
	//   30   57:fdiv            
	//   31   58:fastore         
	//   32   59:dup             
	//   33   60:iconst_2        
	//   34   61:aload_0         
	//   35   62:getfield        #137 <Field BaseColor color>
	//   36   65:invokevirtual   #238 <Method int BaseColor.getBlue()>
	//   37   68:i2f             
	//   38   69:ldc1            #232 <Float 255F>
	//   39   71:fdiv            
	//   40   72:fastore         
	//   41   73:invokespecial   #241 <Method void PdfArray(float[])>
	//   42   76:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		int i = 0;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if((style & 1) != 0)
	//*  45   81:aload_0         
	//*  46   82:getfield        #44  <Field int style>
	//*  47   85:iconst_1        
	//*  48   86:iand            
	//*  49   87:ifeq            94
			i = 0 | 2;
	//   50   90:iconst_0        
	//   51   91:iconst_2        
	//   52   92:ior             
	//   53   93:istore_3        
		int j = i;
	//   54   94:iload_3         
	//   55   95:istore          4
		if((style & 2) != 0)
	//*  56   97:aload_0         
	//*  57   98:getfield        #44  <Field int style>
	//*  58  101:iconst_2        
	//*  59  102:iand            
	//*  60  103:ifeq            111
			j = i | 1;
	//   61  106:iload_3         
	//   62  107:iconst_1        
	//   63  108:ior             
	//   64  109:istore          4
		if(j != 0)
	//*  65  111:iload           4
	//*  66  113:ifeq            132
			put(PdfName.F, ((PdfObject) (new PdfNumber(j))));
	//   67  116:aload_0         
	//   68  117:getstatic       #244 <Field PdfName PdfName.F>
	//   69  120:new             #246 <Class PdfNumber>
	//   70  123:dup             
	//   71  124:iload           4
	//   72  126:invokespecial   #248 <Method void PdfNumber(int)>
	//   73  129:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		if(parent != null)
	//*  74  132:aload_0         
	//*  75  133:getfield        #125 <Field PdfOutline parent>
	//*  76  136:ifnull          153
			put(PdfName.PARENT, ((PdfObject) (parent.indirectReference())));
	//   77  139:aload_0         
	//   78  140:getstatic       #251 <Field PdfName PdfName.PARENT>
	//   79  143:aload_0         
	//   80  144:getfield        #125 <Field PdfOutline parent>
	//   81  147:invokevirtual   #253 <Method PdfIndirectReference indirectReference()>
	//   82  150:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		if(destination != null && destination.hasPage())
	//*  83  153:aload_0         
	//*  84  154:getfield        #105 <Field PdfDestination destination>
	//*  85  157:ifnull          181
	//*  86  160:aload_0         
	//*  87  161:getfield        #105 <Field PdfDestination destination>
	//*  88  164:invokevirtual   #179 <Method boolean PdfDestination.hasPage()>
	//*  89  167:ifeq            181
			put(PdfName.DEST, ((PdfObject) (destination)));
	//   90  170:aload_0         
	//   91  171:getstatic       #256 <Field PdfName PdfName.DEST>
	//   92  174:aload_0         
	//   93  175:getfield        #105 <Field PdfDestination destination>
	//   94  178:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		if(action != null)
	//*  95  181:aload_0         
	//*  96  182:getfield        #81  <Field PdfAction action>
	//*  97  185:ifnull          199
			put(PdfName.A, ((PdfObject) (action)));
	//   98  188:aload_0         
	//   99  189:getstatic       #259 <Field PdfName PdfName.A>
	//  100  192:aload_0         
	//  101  193:getfield        #81  <Field PdfAction action>
	//  102  196:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		if(count != 0)
	//* 103  199:aload_0         
	//* 104  200:getfield        #37  <Field int count>
	//* 105  203:ifeq            224
			put(PdfName.COUNT, ((PdfObject) (new PdfNumber(count))));
	//  106  206:aload_0         
	//  107  207:getstatic       #262 <Field PdfName PdfName.COUNT>
	//  108  210:new             #246 <Class PdfNumber>
	//  109  213:dup             
	//  110  214:aload_0         
	//  111  215:getfield        #37  <Field int count>
	//  112  218:invokespecial   #248 <Method void PdfNumber(int)>
	//  113  221:invokevirtual   #172 <Method void put(PdfName, PdfObject)>
		super.toPdf(pdfwriter, outputstream);
	//  114  224:aload_0         
	//  115  225:aload_1         
	//  116  226:aload_2         
	//  117  227:invokespecial   #264 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//  118  230:return          
	}

	private PdfAction action;
	private BaseColor color;
	private int count;
	private PdfDestination destination;
	protected ArrayList kids;
	private boolean open;
	private PdfOutline parent;
	private PdfIndirectReference reference;
	private int style;
	private String tag;
	protected PdfWriter writer;
}
