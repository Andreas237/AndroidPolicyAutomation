// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.net.URL;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			Element, DocumentException, ElementListener

public class Annotation
	implements Element
{

	private Annotation(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		annotationAttributes = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #84  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #85  <Method void HashMap()>
	//    6   12:putfield        #87  <Field HashMap annotationAttributes>
		llx = (0.0F / 0.0F);
	//    7   15:aload_0         
	//    8   16:ldc1            #88  <Float (0.0F / 0.0F)>
	//    9   18:putfield        #90  <Field float llx>
		lly = (0.0F / 0.0F);
	//   10   21:aload_0         
	//   11   22:ldc1            #88  <Float (0.0F / 0.0F)>
	//   12   24:putfield        #92  <Field float lly>
		urx = (0.0F / 0.0F);
	//   13   27:aload_0         
	//   14   28:ldc1            #88  <Float (0.0F / 0.0F)>
	//   15   30:putfield        #94  <Field float urx>
		ury = (0.0F / 0.0F);
	//   16   33:aload_0         
	//   17   34:ldc1            #88  <Float (0.0F / 0.0F)>
	//   18   36:putfield        #96  <Field float ury>
		llx = f;
	//   19   39:aload_0         
	//   20   40:fload_1         
	//   21   41:putfield        #90  <Field float llx>
		lly = f1;
	//   22   44:aload_0         
	//   23   45:fload_2         
	//   24   46:putfield        #92  <Field float lly>
		urx = f2;
	//   25   49:aload_0         
	//   26   50:fload_3         
	//   27   51:putfield        #94  <Field float urx>
		ury = f3;
	//   28   54:aload_0         
	//   29   55:fload           4
	//   30   57:putfield        #96  <Field float ury>
	//   31   60:return          
	}

	public Annotation(float f, float f1, float f2, float f3, int i)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 5;
	//    6    9:aload_0         
	//    7   10:iconst_5        
	//    8   11:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("named", ((Object) (Integer.valueOf(i))));
	//    9   14:aload_0         
	//   10   15:getfield        #87  <Field HashMap annotationAttributes>
	//   11   18:ldc1            #41  <String "named">
	//   12   20:iload           5
	//   13   22:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   14   25:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   15   28:pop             
	//   16   29:return          
	}

	public Annotation(float f, float f1, float f2, float f3, String s)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 2;
	//    6    9:aload_0         
	//    7   10:iconst_2        
	//    8   11:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("file", ((Object) (s)));
	//    9   14:aload_0         
	//   10   15:getfield        #87  <Field HashMap annotationAttributes>
	//   11   18:ldc1            #22  <String "file">
	//   12   20:aload           5
	//   13   22:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   25:pop             
	//   15   26:return          
	}

	public Annotation(float f, float f1, float f2, float f3, String s, int i)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 4;
	//    6    9:aload_0         
	//    7   10:iconst_4        
	//    8   11:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("file", ((Object) (s)));
	//    9   14:aload_0         
	//   10   15:getfield        #87  <Field HashMap annotationAttributes>
	//   11   18:ldc1            #22  <String "file">
	//   12   20:aload           5
	//   13   22:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   25:pop             
		annotationAttributes.put("page", ((Object) (Integer.valueOf(i))));
	//   15   26:aload_0         
	//   16   27:getfield        #87  <Field HashMap annotationAttributes>
	//   17   30:ldc1            #49  <String "page">
	//   18   32:iload           6
	//   19   34:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   20   37:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   21   40:pop             
	//   22   41:return          
	}

	public Annotation(float f, float f1, float f2, float f3, String s, String s1)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 3;
	//    6    9:aload_0         
	//    7   10:iconst_3        
	//    8   11:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("file", ((Object) (s)));
	//    9   14:aload_0         
	//   10   15:getfield        #87  <Field HashMap annotationAttributes>
	//   11   18:ldc1            #22  <String "file">
	//   12   20:aload           5
	//   13   22:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   25:pop             
		annotationAttributes.put("destination", ((Object) (s1)));
	//   15   26:aload_0         
	//   16   27:getfield        #87  <Field HashMap annotationAttributes>
	//   17   30:ldc1            #19  <String "destination">
	//   18   32:aload           6
	//   19   34:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   20   37:pop             
	//   21   38:return          
	}

	public Annotation(float f, float f1, float f2, float f3, String s, String s1, String s2, 
			String s3)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 6;
	//    6    9:aload_0         
	//    7   10:bipush          6
	//    8   12:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("application", ((Object) (s)));
	//    9   15:aload_0         
	//   10   16:getfield        #87  <Field HashMap annotationAttributes>
	//   11   19:ldc1            #10  <String "application">
	//   12   21:aload           5
	//   13   23:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   26:pop             
		annotationAttributes.put("parameters", ((Object) (s1)));
	//   15   27:aload_0         
	//   16   28:getfield        #87  <Field HashMap annotationAttributes>
	//   17   31:ldc1            #52  <String "parameters">
	//   18   33:aload           6
	//   19   35:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   20   38:pop             
		annotationAttributes.put("operation", ((Object) (s2)));
	//   21   39:aload_0         
	//   22   40:getfield        #87  <Field HashMap annotationAttributes>
	//   23   43:ldc1            #46  <String "operation">
	//   24   45:aload           7
	//   25   47:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   26   50:pop             
		annotationAttributes.put("defaultdir", ((Object) (s3)));
	//   27   51:aload_0         
	//   28   52:getfield        #87  <Field HashMap annotationAttributes>
	//   29   55:ldc1            #16  <String "defaultdir">
	//   30   57:aload           8
	//   31   59:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   32   62:pop             
	//   33   63:return          
	}

	public Annotation(float f, float f1, float f2, float f3, String s, String s1, boolean flag)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 7;
	//    6    9:aload_0         
	//    7   10:bipush          7
	//    8   12:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("file", ((Object) (s)));
	//    9   15:aload_0         
	//   10   16:getfield        #87  <Field HashMap annotationAttributes>
	//   11   19:ldc1            #22  <String "file">
	//   12   21:aload           5
	//   13   23:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   26:pop             
		annotationAttributes.put("mime", ((Object) (s1)));
	//   15   27:aload_0         
	//   16   28:getfield        #87  <Field HashMap annotationAttributes>
	//   17   31:ldc1            #38  <String "mime">
	//   18   33:aload           6
	//   19   35:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   20   38:pop             
		annotationAttributes.put("parameters", ((Object) (new boolean[] {
			false, flag
		})));
	//   21   39:aload_0         
	//   22   40:getfield        #87  <Field HashMap annotationAttributes>
	//   23   43:ldc1            #52  <String "parameters">
	//   24   45:iconst_2        
	//   25   46:newarray        boolean[]
	//   26   48:dup             
	//   27   49:iconst_0        
	//   28   50:iconst_0        
	//   29   51:bastore         
	//   30   52:dup             
	//   31   53:iconst_1        
	//   32   54:iload           7
	//   33   56:bastore         
	//   34   57:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   35   60:pop             
	//   36   61:return          
	}

	public Annotation(float f, float f1, float f2, float f3, URL url)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 1;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("url", ((Object) (url)));
	//    9   14:aload_0         
	//   10   15:getfield        #87  <Field HashMap annotationAttributes>
	//   11   18:ldc1            #62  <String "url">
	//   12   20:aload           5
	//   13   22:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   25:pop             
	//   15   26:return          
	}

	public Annotation(Annotation annotation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		annotationAttributes = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #84  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #85  <Method void HashMap()>
	//    6   12:putfield        #87  <Field HashMap annotationAttributes>
		llx = (0.0F / 0.0F);
	//    7   15:aload_0         
	//    8   16:ldc1            #88  <Float (0.0F / 0.0F)>
	//    9   18:putfield        #90  <Field float llx>
		lly = (0.0F / 0.0F);
	//   10   21:aload_0         
	//   11   22:ldc1            #88  <Float (0.0F / 0.0F)>
	//   12   24:putfield        #92  <Field float lly>
		urx = (0.0F / 0.0F);
	//   13   27:aload_0         
	//   14   28:ldc1            #88  <Float (0.0F / 0.0F)>
	//   15   30:putfield        #94  <Field float urx>
		ury = (0.0F / 0.0F);
	//   16   33:aload_0         
	//   17   34:ldc1            #88  <Float (0.0F / 0.0F)>
	//   18   36:putfield        #96  <Field float ury>
		annotationtype = annotation.annotationtype;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #102 <Field int annotationtype>
	//   22   44:putfield        #102 <Field int annotationtype>
		annotationAttributes = annotation.annotationAttributes;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #87  <Field HashMap annotationAttributes>
	//   26   52:putfield        #87  <Field HashMap annotationAttributes>
		llx = annotation.llx;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #90  <Field float llx>
	//   30   60:putfield        #90  <Field float llx>
		lly = annotation.lly;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #92  <Field float lly>
	//   34   68:putfield        #92  <Field float lly>
		urx = annotation.urx;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #94  <Field float urx>
	//   38   76:putfield        #94  <Field float urx>
		ury = annotation.ury;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:getfield        #96  <Field float ury>
	//   42   84:putfield        #96  <Field float ury>
	//   43   87:return          
	}

	public Annotation(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		annotationAttributes = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #84  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #85  <Method void HashMap()>
	//    6   12:putfield        #87  <Field HashMap annotationAttributes>
		llx = (0.0F / 0.0F);
	//    7   15:aload_0         
	//    8   16:ldc1            #88  <Float (0.0F / 0.0F)>
	//    9   18:putfield        #90  <Field float llx>
		lly = (0.0F / 0.0F);
	//   10   21:aload_0         
	//   11   22:ldc1            #88  <Float (0.0F / 0.0F)>
	//   12   24:putfield        #92  <Field float lly>
		urx = (0.0F / 0.0F);
	//   13   27:aload_0         
	//   14   28:ldc1            #88  <Float (0.0F / 0.0F)>
	//   15   30:putfield        #94  <Field float urx>
		ury = (0.0F / 0.0F);
	//   16   33:aload_0         
	//   17   34:ldc1            #88  <Float (0.0F / 0.0F)>
	//   18   36:putfield        #96  <Field float ury>
		annotationtype = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("title", ((Object) (s)));
	//   22   44:aload_0         
	//   23   45:getfield        #87  <Field HashMap annotationAttributes>
	//   24   48:ldc1            #59  <String "title">
	//   25   50:aload_1         
	//   26   51:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   27   54:pop             
		annotationAttributes.put("content", ((Object) (s1)));
	//   28   55:aload_0         
	//   29   56:getfield        #87  <Field HashMap annotationAttributes>
	//   30   59:ldc1            #13  <String "content">
	//   31   61:aload_2         
	//   32   62:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   33   65:pop             
	//   34   66:return          
	}

	public Annotation(String s, String s1, float f, float f1, float f2, float f3)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_3         
	//    2    2:fload           4
	//    3    4:fload           5
	//    4    6:fload           6
	//    5    8:invokespecial   #100 <Method void Annotation(float, float, float, float)>
		annotationtype = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #102 <Field int annotationtype>
		annotationAttributes.put("title", ((Object) (s)));
	//    9   16:aload_0         
	//   10   17:getfield        #87  <Field HashMap annotationAttributes>
	//   11   20:ldc1            #59  <String "title">
	//   12   22:aload_1         
	//   13   23:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   14   26:pop             
		annotationAttributes.put("content", ((Object) (s1)));
	//   15   27:aload_0         
	//   16   28:getfield        #87  <Field HashMap annotationAttributes>
	//   17   31:ldc1            #13  <String "content">
	//   18   33:aload_2         
	//   19   34:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//   20   37:pop             
	//   21   38:return          
	}

	public int annotationType()
	{
		return annotationtype;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int annotationtype>
	//    2    4:ireturn         
	}

	public HashMap attributes()
	{
		return annotationAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field HashMap annotationAttributes>
	//    2    4:areturn         
	}

	public String content()
	{
		String s1 = (String)annotationAttributes.get("content");
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field HashMap annotationAttributes>
	//    2    4:ldc1            #13  <String "content">
	//    3    6:invokevirtual   #132 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #134 <Class String>
	//    5   12:astore_2        
		String s = s1;
	//    6   13:aload_2         
	//    7   14:astore_1        
		if(s1 == null)
	//*   8   15:aload_2         
	//*   9   16:ifnonnull       22
			s = "";
	//   10   19:ldc1            #136 <String "">
	//   11   21:astore_1        
		return s;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public List getChunks()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #140 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public float llx()
	{
		return llx;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float llx>
	//    2    4:freturn         
	}

	public float llx(float f)
	{
		if(Float.isNaN(llx))
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field float llx>
	//*   2    4:invokestatic    #153 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            12
			return f;
	//    4   10:fload_1         
	//    5   11:freturn         
		else
			return llx;
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field float llx>
	//    8   16:freturn         
	}

	public float lly()
	{
		return lly;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float lly>
	//    2    4:freturn         
	}

	public float lly(float f)
	{
		if(Float.isNaN(lly))
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field float lly>
	//*   2    4:invokestatic    #153 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            12
			return f;
	//    4   10:fload_1         
	//    5   11:freturn         
		else
			return lly;
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field float lly>
	//    8   16:freturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #163 <Method boolean ElementListener.add(Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public void setDimensions(float f, float f1, float f2, float f3)
	{
		llx = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #90  <Field float llx>
		lly = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #92  <Field float lly>
		urx = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #94  <Field float urx>
		ury = f3;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #96  <Field float ury>
	//   12   21:return          
	}

	public String title()
	{
		String s1 = (String)annotationAttributes.get("title");
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field HashMap annotationAttributes>
	//    2    4:ldc1            #59  <String "title">
	//    3    6:invokevirtual   #132 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #134 <Class String>
	//    5   12:astore_2        
		String s = s1;
	//    6   13:aload_2         
	//    7   14:astore_1        
		if(s1 == null)
	//*   8   15:aload_2         
	//*   9   16:ifnonnull       22
			s = "";
	//   10   19:ldc1            #136 <String "">
	//   11   21:astore_1        
		return s;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public int type()
	{
		return 29;
	//    0    0:bipush          29
	//    1    2:ireturn         
	}

	public float urx()
	{
		return urx;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float urx>
	//    2    4:freturn         
	}

	public float urx(float f)
	{
		if(Float.isNaN(urx))
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field float urx>
	//*   2    4:invokestatic    #153 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            12
			return f;
	//    4   10:fload_1         
	//    5   11:freturn         
		else
			return urx;
	//    6   12:aload_0         
	//    7   13:getfield        #94  <Field float urx>
	//    8   16:freturn         
	}

	public float ury()
	{
		return ury;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field float ury>
	//    2    4:freturn         
	}

	public float ury(float f)
	{
		if(Float.isNaN(ury))
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field float ury>
	//*   2    4:invokestatic    #153 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            12
			return f;
	//    4   10:fload_1         
	//    5   11:freturn         
		else
			return ury;
	//    6   12:aload_0         
	//    7   13:getfield        #96  <Field float ury>
	//    8   16:freturn         
	}

	public static final String APPLICATION = "application";
	public static final String CONTENT = "content";
	public static final String DEFAULTDIR = "defaultdir";
	public static final String DESTINATION = "destination";
	public static final String FILE = "file";
	public static final int FILE_DEST = 3;
	public static final int FILE_PAGE = 4;
	public static final int LAUNCH = 6;
	public static final String LLX = "llx";
	public static final String LLY = "lly";
	public static final String MIMETYPE = "mime";
	public static final String NAMED = "named";
	public static final int NAMED_DEST = 5;
	public static final String OPERATION = "operation";
	public static final String PAGE = "page";
	public static final String PARAMETERS = "parameters";
	public static final int SCREEN = 7;
	public static final int TEXT = 0;
	public static final String TITLE = "title";
	public static final String URL = "url";
	public static final int URL_AS_STRING = 2;
	public static final int URL_NET = 1;
	public static final String URX = "urx";
	public static final String URY = "ury";
	protected HashMap annotationAttributes;
	protected int annotationtype;
	protected float llx;
	protected float lly;
	protected float urx;
	protected float ury;
}
