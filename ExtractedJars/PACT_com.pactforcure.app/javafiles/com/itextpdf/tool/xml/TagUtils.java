// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.NoSiblingException;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml:
//			Tag

public class TagUtils
{

	public TagUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static TagUtils getInstance()
	{
		return myself;
	//    0    0:getstatic       #13  <Field TagUtils myself>
	//    1    3:areturn         
	}

	public Tag getSibling(Tag tag, int i)
		throws NoSiblingException
	{
		Object obj;
		try
		{
			obj = ((Object) (tag.getParent().getChildren()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Tag Tag.getParent()>
	//    2    4:invokevirtual   #33  <Method List Tag.getChildren()>
	//    3    7:astore_3        
			obj = ((Object) ((Tag)((List) (obj)).get(((List) (obj)).indexOf(((Object) (tag))) + i)));
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #39  <Method int List.indexOf(Object)>
	//    8   16:iload_2         
	//    9   17:iadd            
	//   10   18:invokeinterface #43  <Method Object List.get(int)>
	//   11   23:checkcast       #25  <Class Tag>
	//   12   26:astore_3        
		}
	//*  13   27:aload_3         
	//*  14   28:areturn         
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  15   29:astore_3        
		{
			throw new NoSiblingException(String.format(LocaleMessages.getInstance().getMessage("tag.nosibling"), new Object[] {
				tag.getName(), Integer.valueOf(i)
			}), ((Throwable) (indexoutofboundsexception)));
	//   16   30:new             #21  <Class NoSiblingException>
	//   17   33:dup             
	//   18   34:invokestatic    #48  <Method LocaleMessages LocaleMessages.getInstance()>
	//   19   37:ldc1            #50  <String "tag.nosibling">
	//   20   39:invokevirtual   #54  <Method String LocaleMessages.getMessage(String)>
	//   21   42:iconst_2        
	//   22   43:anewarray       Object[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:aload_1         
	//   26   49:invokevirtual   #58  <Method String Tag.getName()>
	//   27   52:aastore         
	//   28   53:dup             
	//   29   54:iconst_1        
	//   30   55:iload_2         
	//   31   56:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   32   59:aastore         
	//   33   60:invokestatic    #70  <Method String String.format(String, Object[])>
	//   34   63:aload_3         
	//   35   64:invokespecial   #73  <Method void NoSiblingException(String, Throwable)>
	//   36   67:athrow          
		}
		return ((Tag) (obj));
	}

	private static final TagUtils myself = new TagUtils();

	static 
	{
	//    0    0:new             #2   <Class TagUtils>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void TagUtils()>
	//    3    7:putstatic       #13  <Field TagUtils myself>
	//*   4   10:return          
	}
}
