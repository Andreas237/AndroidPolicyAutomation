// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$InverseStore
{

	public String getDefaultName()
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore_1        
		do
		{
			obj = ((XfaForm$InverseStore) (obj)).follow.get(0);
	//    2    2:aload_1         
	//    3    3:getfield        #23  <Field ArrayList follow>
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #30  <Method Object ArrayList.get(int)>
	//    6   10:astore_1        
			if(obj instanceof String)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #32  <Class String>
	//*   9   15:ifeq            23
				return (String)obj;
	//   10   18:aload_1         
	//   11   19:checkcast       #32  <Class String>
	//   12   22:areturn         
			obj = ((Object) ((XfaForm$InverseStore)obj));
	//   13   23:aload_1         
	//   14   24:checkcast       #2   <Class XfaForm$InverseStore>
	//   15   27:astore_1        
		} while(true);
	//   16   28:goto            2
	}

	public boolean isSimilar(String s)
	{
		s = s.substring(0, s.indexOf('[') + 1);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:bipush          91
	//    4    5:invokevirtual   #38  <Method int String.indexOf(int)>
	//    5    8:iconst_1        
	//    6    9:iadd            
	//    7   10:invokevirtual   #42  <Method String String.substring(int, int)>
	//    8   13:astore_1        
		for(int i = 0; i < part.size(); i++)
	//*   9   14:iconst_0        
	//*  10   15:istore_2        
	//*  11   16:iload_2         
	//*  12   17:aload_0         
	//*  13   18:getfield        #21  <Field ArrayList part>
	//*  14   21:invokevirtual   #46  <Method int ArrayList.size()>
	//*  15   24:icmpge          54
			if(((String)part.get(i)).startsWith(s))
	//*  16   27:aload_0         
	//*  17   28:getfield        #21  <Field ArrayList part>
	//*  18   31:iload_2         
	//*  19   32:invokevirtual   #30  <Method Object ArrayList.get(int)>
	//*  20   35:checkcast       #32  <Class String>
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #49  <Method boolean String.startsWith(String)>
	//*  23   42:ifeq            47
				return true;
	//   24   45:iconst_1        
	//   25   46:ireturn         

	//   26   47:iload_2         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:istore_2        
	//*  30   51:goto            16
		return false;
	//   31   54:iconst_0        
	//   32   55:ireturn         
	}

	protected ArrayList follow;
	protected ArrayList part;

	public XfaForm$InverseStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		part = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field ArrayList part>
		follow = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #18  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void ArrayList()>
	//   11   23:putfield        #23  <Field ArrayList follow>
	//   12   26:return          
	}
}
