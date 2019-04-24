// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfObject, PdfArray, PdfString

public class PdfArtifact
	implements IAccessibleElement
{
	public static final class ArtifactType extends Enum
	{

		public static ArtifactType valueOf(String s)
		{
			return (ArtifactType)Enum.valueOf(com/itextpdf/text/pdf/PdfArtifact$ArtifactType, s);
		//    0    0:ldc1            #2   <Class PdfArtifact$ArtifactType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfArtifact$ArtifactType>
		//    4    9:areturn         
		}

		public static ArtifactType[] values()
		{
			return (ArtifactType[])((ArtifactType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field PdfArtifact$ArtifactType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfArtifact$ArtifactType_3B_.clone()>
		//    2    6:checkcast       #46  <Class PdfArtifact$ArtifactType[]>
		//    3    9:areturn         
		}

		private static final ArtifactType $VALUES[];
		public static final ArtifactType BACKGROUND;
		public static final ArtifactType LAYOUT;
		public static final ArtifactType PAGE;
		public static final ArtifactType PAGINATION;

		static 
		{
			PAGINATION = new ArtifactType("PAGINATION", 0);
		//    0    0:new             #2   <Class PdfArtifact$ArtifactType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "PAGINATION">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void PdfArtifact$ArtifactType(String, int)>
		//    5   10:putstatic       #24  <Field PdfArtifact$ArtifactType PAGINATION>
			LAYOUT = new ArtifactType("LAYOUT", 1);
		//    6   13:new             #2   <Class PdfArtifact$ArtifactType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "LAYOUT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void PdfArtifact$ArtifactType(String, int)>
		//   11   23:putstatic       #27  <Field PdfArtifact$ArtifactType LAYOUT>
			PAGE = new ArtifactType("PAGE", 2);
		//   12   26:new             #2   <Class PdfArtifact$ArtifactType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "PAGE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void PdfArtifact$ArtifactType(String, int)>
		//   17   36:putstatic       #30  <Field PdfArtifact$ArtifactType PAGE>
			BACKGROUND = new ArtifactType("BACKGROUND", 3);
		//   18   39:new             #2   <Class PdfArtifact$ArtifactType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "BACKGROUND">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void PdfArtifact$ArtifactType(String, int)>
		//   23   49:putstatic       #33  <Field PdfArtifact$ArtifactType BACKGROUND>
			$VALUES = (new ArtifactType[] {
				PAGINATION, LAYOUT, PAGE, BACKGROUND
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       ArtifactType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field PdfArtifact$ArtifactType PAGINATION>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field PdfArtifact$ArtifactType LAYOUT>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field PdfArtifact$ArtifactType PAGE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field PdfArtifact$ArtifactType BACKGROUND>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field PdfArtifact$ArtifactType[] $VALUES>
		//*  43   83:return          
		}

		private ArtifactType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PdfArtifact()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		role = PdfName.ARTIFACT;
	//    2    4:aload_0         
	//    3    5:getstatic       #55  <Field PdfName PdfName.ARTIFACT>
	//    4    8:putfield        #57  <Field PdfName role>
		accessibleAttributes = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #59  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//    8   16:aload_0         
	//    9   17:new             #61  <Class AccessibleElementId>
	//   10   20:dup             
	//   11   21:invokespecial   #62  <Method void AccessibleElementId()>
	//   12   24:putfield        #64  <Field AccessibleElementId id>
	//   13   27:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #74  <Class PdfObject>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return accessibleAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public PdfArray getAttached()
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (PdfArray)accessibleAttributes.get(((Object) (PdfName.ATTACHED)));
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field HashMap accessibleAttributes>
	//    7   13:getstatic       #83  <Field PdfName PdfName.ATTACHED>
	//    8   16:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #85  <Class PdfArray>
	//   10   22:areturn         
	}

	public PdfArray getBBox()
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (PdfArray)accessibleAttributes.get(((Object) (PdfName.BBOX)));
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field HashMap accessibleAttributes>
	//    7   13:getstatic       #89  <Field PdfName PdfName.BBOX>
	//    8   16:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #85  <Class PdfArray>
	//   10   22:areturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field PdfName role>
	//    2    4:areturn         
	}

	public PdfString getType()
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (PdfString)accessibleAttributes.get(((Object) (PdfName.TYPE)));
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field HashMap accessibleAttributes>
	//    7   13:getstatic       #98  <Field PdfName PdfName.TYPE>
	//    8   16:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #100 <Class PdfString>
	//   10   22:areturn         
	}

	public boolean isInline()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #68  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #105 <Method void HashMap()>
	//    7   15:putfield        #59  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #59  <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #109 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setAttached(PdfArray pdfarray)
	{
		setAccessibleAttribute(PdfName.ATTACHED, ((PdfObject) (pdfarray)));
	//    0    0:aload_0         
	//    1    1:getstatic       #83  <Field PdfName PdfName.ATTACHED>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method void setAccessibleAttribute(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setBBox(PdfArray pdfarray)
	{
		setAccessibleAttribute(PdfName.BBOX, ((PdfObject) (pdfarray)));
	//    0    0:aload_0         
	//    1    1:getstatic       #89  <Field PdfName PdfName.BBOX>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method void setAccessibleAttribute(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
	//    0    0:return          
	}

	public void setType(ArtifactType artifacttype)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType = new int[ArtifactType.values().length];
			//    0    0:invokestatic    #18  <Method PdfArtifact$ArtifactType[] PdfArtifact$ArtifactType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType[ArtifactType.BACKGROUND.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
			//    5   12:getstatic       #24  <Field PdfArtifact$ArtifactType PdfArtifact$ArtifactType.BACKGROUND>
			//    6   15:invokevirtual   #28  <Method int PdfArtifact$ArtifactType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
			//*  10   23:getstatic       #31  <Field PdfArtifact$ArtifactType PdfArtifact$ArtifactType.LAYOUT>
			//*  11   26:invokevirtual   #28  <Method int PdfArtifact$ArtifactType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
			//*  15   34:getstatic       #34  <Field PdfArtifact$ArtifactType PdfArtifact$ArtifactType.PAGE>
			//*  16   37:invokevirtual   #28  <Method int PdfArtifact$ArtifactType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
			//*  20   45:getstatic       #37  <Field PdfArtifact$ArtifactType PdfArtifact$ArtifactType.PAGINATION>
			//*  21   48:invokevirtual   #28  <Method int PdfArtifact$ArtifactType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
			//*  25   54:astore_0        
			//*  26   55:return          
			//*  27   56:astore_0        
			//*  28   57:goto            42
			//*  29   60:astore_0        
			//*  30   61:goto            31
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   64:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType[ArtifactType.LAYOUT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType[ArtifactType.PAGE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType[ArtifactType.PAGINATION.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  32   65:goto            20
			}
		}

		_cls1..SwitchMap.com.itextpdf.text.pdf.PdfArtifact.ArtifactType[artifacttype.ordinal()];
	//    2    2:getstatic       #124 <Field int[] PdfArtifact$1.$SwitchMap$com$itextpdf$text$pdf$PdfArtifact$ArtifactType>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #128 <Method int PdfArtifact$ArtifactType.ordinal()>
	//    5    9:iaload          
		JVM INSTR tableswitch 1 4: default 40
	//	               1 51
	//	               2 64
	//	               3 77
	//	               4 90;
	//    6   10:tableswitch     1 4: default 40
	//	               1 51
	//	               2 64
	//	               3 77
	//	               4 90
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		artifacttype = ((ArtifactType) (obj));
	//    7   40:aload_2         
	//    8   41:astore_1        
_L7:
		setAccessibleAttribute(PdfName.TYPE, ((PdfObject) (artifacttype)));
	//    9   42:aload_0         
	//   10   43:getstatic       #98  <Field PdfName PdfName.TYPE>
	//   11   46:aload_1         
	//   12   47:invokevirtual   #113 <Method void setAccessibleAttribute(PdfName, PdfObject)>
		return;
	//   13   50:return          
_L2:
		artifacttype = ((ArtifactType) (new PdfString("Background")));
	//   14   51:new             #100 <Class PdfString>
	//   15   54:dup             
	//   16   55:ldc1            #35  <String "Background">
	//   17   57:invokespecial   #131 <Method void PdfString(String)>
	//   18   60:astore_1        
		continue; /* Loop/switch isn't completed */
	//   19   61:goto            42
_L3:
		artifacttype = ((ArtifactType) (new PdfString("Layout")));
	//   20   64:new             #100 <Class PdfString>
	//   21   67:dup             
	//   22   68:ldc1            #31  <String "Layout">
	//   23   70:invokespecial   #131 <Method void PdfString(String)>
	//   24   73:astore_1        
		continue; /* Loop/switch isn't completed */
	//   25   74:goto            42
_L4:
		artifacttype = ((ArtifactType) (new PdfString("Page")));
	//   26   77:new             #100 <Class PdfString>
	//   27   80:dup             
	//   28   81:ldc1            #33  <String "Page">
	//   29   83:invokespecial   #131 <Method void PdfString(String)>
	//   30   86:astore_1        
		continue; /* Loop/switch isn't completed */
	//   31   87:goto            42
_L5:
		artifacttype = ((ArtifactType) (new PdfString("Pagination")));
	//   32   90:new             #100 <Class PdfString>
	//   33   93:dup             
	//   34   94:ldc1            #29  <String "Pagination">
	//   35   96:invokespecial   #131 <Method void PdfString(String)>
	//   36   99:astore_1        
		if(true) goto _L7; else goto _L6
	//   37  100:goto            42
_L6:
	}

	public void setType(PdfString pdfstring)
	{
		if(!allowedArtifactTypes.contains(((Object) (pdfstring.toString()))))
	//*   0    0:getstatic       #47  <Field HashSet allowedArtifactTypes>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #136 <Method String PdfString.toString()>
	//*   3    7:invokevirtual   #140 <Method boolean HashSet.contains(Object)>
	//*   4   10:ifne            34
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.artifact.type.1.is.invalid", new Object[] {
				pdfstring
			}));
	//    5   13:new             #142 <Class IllegalArgumentException>
	//    6   16:dup             
	//    7   17:ldc1            #144 <String "the.artifact.type.1.is.invalid">
	//    8   19:iconst_1        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload_1         
	//   13   26:aastore         
	//   14   27:invokestatic    #150 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   30:invokespecial   #151 <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
		} else
		{
			setAccessibleAttribute(PdfName.TYPE, ((PdfObject) (pdfstring)));
	//   17   34:aload_0         
	//   18   35:getstatic       #98  <Field PdfName PdfName.TYPE>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #113 <Method void setAccessibleAttribute(PdfName, PdfObject)>
			return;
	//   21   42:return          
		}
	}

	private static final HashSet allowedArtifactTypes = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"Pagination", "Layout", "Page", "Background"
	}))))));
	protected HashMap accessibleAttributes;
	protected AccessibleElementId id;
	protected PdfName role;

	static 
	{
	//    0    0:new             #25  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #29  <String "Pagination">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #31  <String "Layout">
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #33  <String "Page">
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:ldc1            #35  <String "Background">
	//   19   27:aastore         
	//   20   28:invokestatic    #41  <Method java.util.List Arrays.asList(Object[])>
	//   21   31:invokespecial   #45  <Method void HashSet(java.util.Collection)>
	//   22   34:putstatic       #47  <Field HashSet allowedArtifactTypes>
	//*  23   37:return          
	}
}
