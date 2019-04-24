// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.internal;

import com.itextpdf.text.DocWriter;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.interfaces.PdfVersion;
import java.io.IOException;

public class PdfVersionImp
	implements PdfVersion
{

	public PdfVersionImp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		headerWasWritten = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #42  <Field boolean headerWasWritten>
		appendmode = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field boolean appendmode>
		header_version = '4';
	//    8   14:aload_0         
	//    9   15:bipush          52
	//   10   17:putfield        #46  <Field char header_version>
		catalog_version = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #48  <Field PdfName catalog_version>
		version = '4';
	//   14   25:aload_0         
	//   15   26:bipush          52
	//   16   28:putfield        #50  <Field char version>
		extensions = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #52  <Field PdfDictionary extensions>
	//   20   36:return          
	}

	public void addDeveloperExtension(PdfDeveloperExtension pdfdeveloperextension)
	{
		if(extensions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field PdfDictionary extensions>
	//*   2    4:ifnonnull       34
		{
			extensions = new PdfDictionary();
	//    3    7:aload_0         
	//    4    8:new             #56  <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #57  <Method void PdfDictionary()>
	//    7   15:putfield        #52  <Field PdfDictionary extensions>
		} else
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field PdfDictionary extensions>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #63  <Method PdfName PdfDeveloperExtension.getPrefix()>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #67  <Method PdfDictionary PdfDeveloperExtension.getDeveloperExtensions()>
	//*  14   30:invokevirtual   #71  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//*  15   33:return          
		{
			PdfDictionary pdfdictionary = extensions.getAsDict(pdfdeveloperextension.getPrefix());
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field PdfDictionary extensions>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #63  <Method PdfName PdfDeveloperExtension.getPrefix()>
	//   20   42:invokevirtual   #75  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   21   45:astore_2        
			if(pdfdictionary != null)
	//*  22   46:aload_2         
	//*  23   47:ifnull          18
				if(pdfdeveloperextension.getBaseversion().compareTo(pdfdictionary.getAsName(PdfName.BASEVERSION)) < 0 || pdfdeveloperextension.getExtensionLevel() - pdfdictionary.getAsNumber(PdfName.EXTENSIONLEVEL).intValue() <= 0)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #78  <Method PdfName PdfDeveloperExtension.getBaseversion()>
	//*  26   54:aload_2         
	//*  27   55:getstatic       #83  <Field PdfName PdfName.BASEVERSION>
	//*  28   58:invokevirtual   #87  <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  29   61:invokevirtual   #91  <Method int PdfName.compareTo(PdfName)>
	//*  30   64:iflt            33
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #95  <Method int PdfDeveloperExtension.getExtensionLevel()>
	//*  33   71:aload_2         
	//*  34   72:getstatic       #98  <Field PdfName PdfName.EXTENSIONLEVEL>
	//*  35   75:invokevirtual   #102 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  36   78:invokevirtual   #107 <Method int PdfNumber.intValue()>
	//*  37   81:isub            
	//*  38   82:ifgt            18
					return;
	//   39   85:return          
		}
		extensions.put(pdfdeveloperextension.getPrefix(), ((com.itextpdf.text.pdf.PdfObject) (pdfdeveloperextension.getDeveloperExtensions())));
	}

	public void addToCatalog(PdfDictionary pdfdictionary)
	{
		if(catalog_version != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field PdfName catalog_version>
	//*   2    4:ifnull          18
			pdfdictionary.put(PdfName.VERSION, ((com.itextpdf.text.pdf.PdfObject) (catalog_version)));
	//    3    7:aload_1         
	//    4    8:getstatic       #112 <Field PdfName PdfName.VERSION>
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field PdfName catalog_version>
	//    7   15:invokevirtual   #71  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		if(extensions != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field PdfDictionary extensions>
	//*  10   22:ifnull          36
			pdfdictionary.put(PdfName.EXTENSIONS, ((com.itextpdf.text.pdf.PdfObject) (extensions)));
	//   11   25:aload_1         
	//   12   26:getstatic       #115 <Field PdfName PdfName.EXTENSIONS>
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field PdfDictionary extensions>
	//   15   33:invokevirtual   #71  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   16   36:return          
	}

	public char getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field char version>
	//    2    4:ireturn         
	}

	public byte[] getVersionAsByteArray(char c)
	{
		return DocWriter.getISOBytes(getVersionAsName(c).toString().substring(1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #123 <Method PdfName getVersionAsName(char)>
	//    3    5:invokevirtual   #127 <Method String PdfName.toString()>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #133 <Method String String.substring(int)>
	//    6   12:invokestatic    #30  <Method byte[] DocWriter.getISOBytes(String)>
	//    7   15:areturn         
	}

	public PdfName getVersionAsName(char c)
	{
		switch(c)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     50 55: default 40
	//	               50 44
	//	               51 48
	//	               52 52
	//	               53 56
	//	               54 60
	//	               55 64
		default:
			return PdfWriter.PDF_VERSION_1_4;
	//    2   40:getstatic       #138 <Field PdfName PdfWriter.PDF_VERSION_1_4>
	//    3   43:areturn         

		case 50: // '2'
			return PdfWriter.PDF_VERSION_1_2;
	//    4   44:getstatic       #141 <Field PdfName PdfWriter.PDF_VERSION_1_2>
	//    5   47:areturn         

		case 51: // '3'
			return PdfWriter.PDF_VERSION_1_3;
	//    6   48:getstatic       #144 <Field PdfName PdfWriter.PDF_VERSION_1_3>
	//    7   51:areturn         

		case 52: // '4'
			return PdfWriter.PDF_VERSION_1_4;
	//    8   52:getstatic       #138 <Field PdfName PdfWriter.PDF_VERSION_1_4>
	//    9   55:areturn         

		case 53: // '5'
			return PdfWriter.PDF_VERSION_1_5;
	//   10   56:getstatic       #147 <Field PdfName PdfWriter.PDF_VERSION_1_5>
	//   11   59:areturn         

		case 54: // '6'
			return PdfWriter.PDF_VERSION_1_6;
	//   12   60:getstatic       #150 <Field PdfName PdfWriter.PDF_VERSION_1_6>
	//   13   63:areturn         

		case 55: // '7'
			return PdfWriter.PDF_VERSION_1_7;
	//   14   64:getstatic       #153 <Field PdfName PdfWriter.PDF_VERSION_1_7>
	//   15   67:areturn         
		}
	}

	public void setAppendmode(boolean flag)
	{
		appendmode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean appendmode>
	//    3    5:return          
	}

	public void setAtLeastPdfVersion(char c)
	{
		if(c > header_version)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #46  <Field char header_version>
	//*   3    5:icmple          13
			setPdfVersion(c);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #160 <Method void setPdfVersion(char)>
	//    7   13:return          
	}

	public void setPdfVersion(char c)
	{
		version = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field char version>
		if(headerWasWritten || appendmode)
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field boolean headerWasWritten>
	//*   5    9:ifne            19
	//*   6   12:aload_0         
	//*   7   13:getfield        #44  <Field boolean appendmode>
	//*   8   16:ifeq            29
		{
			setPdfVersion(getVersionAsName(c));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokevirtual   #123 <Method PdfName getVersionAsName(char)>
	//   13   25:invokevirtual   #163 <Method void setPdfVersion(PdfName)>
			return;
	//   14   28:return          
		} else
		{
			header_version = c;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:putfield        #46  <Field char header_version>
			return;
	//   18   34:return          
		}
	}

	public void setPdfVersion(PdfName pdfname)
	{
		if(catalog_version == null || catalog_version.compareTo(pdfname) < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field PdfName catalog_version>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field PdfName catalog_version>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #91  <Method int PdfName.compareTo(PdfName)>
	//*   7   15:ifge            23
			catalog_version = pdfname;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #48  <Field PdfName catalog_version>
	//   11   23:return          
	}

	public void writeHeader(OutputStreamCounter outputstreamcounter)
		throws IOException
	{
		if(appendmode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean appendmode>
	//*   2    4:ifeq            17
		{
			outputstreamcounter.write(HEADER[0]);
	//    3    7:aload_1         
	//    4    8:getstatic       #36  <Field byte[][] HEADER>
	//    5   11:iconst_0        
	//    6   12:aaload          
	//    7   13:invokevirtual   #173 <Method void OutputStreamCounter.write(byte[])>
			return;
	//    8   16:return          
		} else
		{
			outputstreamcounter.write(HEADER[1]);
	//    9   17:aload_1         
	//   10   18:getstatic       #36  <Field byte[][] HEADER>
	//   11   21:iconst_1        
	//   12   22:aaload          
	//   13   23:invokevirtual   #173 <Method void OutputStreamCounter.write(byte[])>
			outputstreamcounter.write(getVersionAsByteArray(header_version));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #46  <Field char header_version>
	//   18   32:invokevirtual   #175 <Method byte[] getVersionAsByteArray(char)>
	//   19   35:invokevirtual   #173 <Method void OutputStreamCounter.write(byte[])>
			outputstreamcounter.write(HEADER[2]);
	//   20   38:aload_1         
	//   21   39:getstatic       #36  <Field byte[][] HEADER>
	//   22   42:iconst_2        
	//   23   43:aaload          
	//   24   44:invokevirtual   #173 <Method void OutputStreamCounter.write(byte[])>
			headerWasWritten = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #42  <Field boolean headerWasWritten>
			return;
	//   28   52:return          
		}
	}

	public static final byte HEADER[][] = {
		DocWriter.getISOBytes("\n"), DocWriter.getISOBytes("%PDF-"), DocWriter.getISOBytes("\n%\342\343\317\323\n")
	};
	protected boolean appendmode;
	protected PdfName catalog_version;
	protected PdfDictionary extensions;
	protected boolean headerWasWritten;
	protected char header_version;
	protected char version;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       byte[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #24  <String "\n">
	//    5    8:invokestatic    #30  <Method byte[] DocWriter.getISOBytes(String)>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc1            #32  <String "%PDF-">
	//   10   16:invokestatic    #30  <Method byte[] DocWriter.getISOBytes(String)>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #34  <String "\n%\342\343\317\323\n">
	//   15   24:invokestatic    #30  <Method byte[] DocWriter.getISOBytes(String)>
	//   16   27:aastore         
	//   17   28:putstatic       #36  <Field byte[][] HEADER>
	//*  18   31:return          
	}
}
