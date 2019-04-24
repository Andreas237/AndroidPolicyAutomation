// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import com.ext.ui.ExtractorApplication;
import java.io.File;

// Referenced classes of package android.support.v7:
//			ci

public class cf
{

	public cf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		a = ExtractorApplication.a.getCacheDir();
	//    2    4:aload_0         
	//    3    5:getstatic       #15  <Field Context ExtractorApplication.a>
	//    4    8:invokevirtual   #21  <Method File Context.getCacheDir()>
	//    5   11:putfield        #23  <Field File a>
		if(a != null && !a.exists())
	//*   6   14:aload_0         
	//*   7   15:getfield        #23  <Field File a>
	//*   8   18:ifnull          69
	//*   9   21:aload_0         
	//*  10   22:getfield        #23  <Field File a>
	//*  11   25:invokevirtual   #29  <Method boolean File.exists()>
	//*  12   28:ifne            69
		{
			a.mkdirs();
	//   13   31:aload_0         
	//   14   32:getfield        #23  <Field File a>
	//   15   35:invokevirtual   #32  <Method boolean File.mkdirs()>
	//   16   38:pop             
			ci.a("123456", (new StringBuilder()).append("").append(a.getAbsolutePath()).toString());
	//   17   39:ldc1            #34  <String "123456">
	//   18   41:new             #36  <Class StringBuilder>
	//   19   44:dup             
	//   20   45:invokespecial   #37  <Method void StringBuilder()>
	//   21   48:ldc1            #39  <String "">
	//   22   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:aload_0         
	//   24   54:getfield        #23  <Field File a>
	//   25   57:invokevirtual   #47  <Method String File.getAbsolutePath()>
	//   26   60:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   63:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   28   66:invokestatic    #55  <Method void ci.a(String, String)>
		}
	//   29   69:return          
	}

	public File a(String s)
	{
		int i = s.hashCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method int String.hashCode()>
	//    2    4:istore_2        
		return new File(a, String.valueOf(i));
	//    3    5:new             #25  <Class File>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field File a>
	//    7   13:iload_2         
	//    8   14:invokestatic    #67  <Method String String.valueOf(int)>
	//    9   17:invokespecial   #70  <Method void File(File, String)>
	//   10   20:areturn         
	}

	public void a()
	{
		File afile[] = a.listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field File a>
	//    2    4:invokevirtual   #74  <Method File[] File.listFiles()>
	//    3    7:astore_3        
		if(afile != null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			int j = afile.length;
	//    7   13:aload_3         
	//    8   14:arraylength     
	//    9   15:istore_2        
			int i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_1        
			while(i < j) 
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          12
			{
				afile[i].delete();
	//   15   23:aload_3         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokevirtual   #77  <Method boolean File.delete()>
	//   19   29:pop             
				i++;
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
			}
		}
	//*  24   34:goto            18
	}

	private File a;
}
