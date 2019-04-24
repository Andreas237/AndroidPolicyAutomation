// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

private class FilePickerActivity$a
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(!(new File(file, s)).isDirectory()) goto _L2; else goto _L1
	//    2    3:new             #26  <Class File>
	//    3    6:dup             
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #29  <Method void File(File, String)>
	//    7   12:invokevirtual   #33  <Method boolean File.isDirectory()>
	//    8   15:ifeq            24
_L1:
		boolean flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
_L4:
		return flag;
	//   11   21:iload           4
	//   12   23:ireturn         
_L2:
label0:
		{
			if(b == null || b.length <= 0)
				break label0;
	//   13   24:aload_0         
	//   14   25:getfield        #21  <Field String[] b>
	//   15   28:ifnull          76
	//   16   31:aload_0         
	//   17   32:getfield        #21  <Field String[] b>
	//   18   35:arraylength     
	//   19   36:ifle            76
			int i = 0;
	//   20   39:iconst_0        
	//   21   40:istore_3        
			do
			{
				flag = flag1;
	//   22   41:iload           5
	//   23   43:istore          4
				if(i >= b.length)
					break;
	//   24   45:iload_3         
	//   25   46:aload_0         
	//   26   47:getfield        #21  <Field String[] b>
	//   27   50:arraylength     
	//   28   51:icmpge          21
				if(s.endsWith(b[i]))
	//*  29   54:aload_2         
	//*  30   55:aload_0         
	//*  31   56:getfield        #21  <Field String[] b>
	//*  32   59:iload_3         
	//*  33   60:aaload          
	//*  34   61:invokevirtual   #39  <Method boolean String.endsWith(String)>
	//*  35   64:ifeq            69
					return true;
	//   36   67:iconst_1        
	//   37   68:ireturn         
				i++;
	//   38   69:iload_3         
	//   39   70:iconst_1        
	//   40   71:iadd            
	//   41   72:istore_3        
			} while(true);
	//   42   73:goto            41
		}
		if(true) goto _L4; else goto _L3
_L3:
		return true;
	//   43   76:iconst_1        
	//   44   77:ireturn         
	}

	final FilePickerActivity a;
	private String b[];

	public FilePickerActivity$a(FilePickerActivity filepickeractivity, String as[])
	{
		a = filepickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field FilePickerActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		b = as;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String[] b>
	//    8   14:return          
	}
}
