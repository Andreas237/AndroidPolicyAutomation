// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfNumber

public class PdfTextArray
{

	public PdfTextArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		arrayList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field ArrayList arrayList>
	//    7   15:return          
	}

	public PdfTextArray(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		arrayList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field ArrayList arrayList>
		add(s);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #25  <Method void add(String)>
	//   10   20:return          
	}

	private void replaceLast(Object obj)
	{
		arrayList.set(arrayList.size() - 1, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList arrayList>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ArrayList arrayList>
	//    4    8:invokevirtual   #31  <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method Object ArrayList.set(int, Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void add(float f)
	{
		if(f != 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            58
		{
			if(lastNum != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field Float lastNum>
	//*   6   10:ifnull          79
			{
				lastNum = new Float(lastNum.floatValue() + f);
	//    7   13:aload_0         
	//    8   14:new             #40  <Class Float>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #38  <Field Float lastNum>
	//   12   22:invokevirtual   #44  <Method float Float.floatValue()>
	//   13   25:fload_1         
	//   14   26:fadd            
	//   15   27:invokespecial   #46  <Method void Float(float)>
	//   16   30:putfield        #38  <Field Float lastNum>
				if(lastNum.floatValue() != 0.0F)
	//*  17   33:aload_0         
	//*  18   34:getfield        #38  <Field Float lastNum>
	//*  19   37:invokevirtual   #44  <Method float Float.floatValue()>
	//*  20   40:fconst_0        
	//*  21   41:fcmpl           
	//*  22   42:ifeq            59
					replaceLast(((Object) (lastNum)));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field Float lastNum>
	//   26   50:invokespecial   #48  <Method void replaceLast(Object)>
				else
	//*  27   53:aload_0         
	//*  28   54:aconst_null     
	//*  29   55:putfield        #50  <Field String lastStr>
	//*  30   58:return          
					arrayList.remove(arrayList.size() - 1);
	//   31   59:aload_0         
	//   32   60:getfield        #20  <Field ArrayList arrayList>
	//   33   63:aload_0         
	//   34   64:getfield        #20  <Field ArrayList arrayList>
	//   35   67:invokevirtual   #31  <Method int ArrayList.size()>
	//   36   70:iconst_1        
	//   37   71:isub            
	//   38   72:invokevirtual   #54  <Method Object ArrayList.remove(int)>
	//   39   75:pop             
			} else
	//*  40   76:goto            53
			{
				lastNum = new Float(f);
	//   41   79:aload_0         
	//   42   80:new             #40  <Class Float>
	//   43   83:dup             
	//   44   84:fload_1         
	//   45   85:invokespecial   #46  <Method void Float(float)>
	//   46   88:putfield        #38  <Field Float lastNum>
				arrayList.add(((Object) (lastNum)));
	//   47   91:aload_0         
	//   48   92:getfield        #20  <Field ArrayList arrayList>
	//   49   95:aload_0         
	//   50   96:getfield        #38  <Field Float lastNum>
	//   51   99:invokevirtual   #57  <Method boolean ArrayList.add(Object)>
	//   52  102:pop             
			}
			lastStr = null;
		}
	//*  53  103:goto            53
	}

	public void add(PdfNumber pdfnumber)
	{
		add((float)pdfnumber.doubleValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #64  <Method double PdfNumber.doubleValue()>
	//    3    5:d2f             
	//    4    6:invokevirtual   #66  <Method void add(float)>
	//    5    9:return          
	}

	public void add(String s)
	{
		if(s.length() > 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #71  <Method int String.length()>
	//*   2    4:ifle            52
		{
			if(lastStr != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field String lastStr>
	//*   5   11:ifnull          53
			{
				lastStr = (new StringBuilder()).append(lastStr).append(s).toString();
	//    6   14:aload_0         
	//    7   15:new             #73  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #74  <Method void StringBuilder()>
	//   10   22:aload_0         
	//   11   23:getfield        #50  <Field String lastStr>
	//   12   26:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   16   36:putfield        #50  <Field String lastStr>
				replaceLast(((Object) (lastStr)));
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #50  <Field String lastStr>
	//   20   44:invokespecial   #48  <Method void replaceLast(Object)>
			} else
	//*  21   47:aload_0         
	//*  22   48:aconst_null     
	//*  23   49:putfield        #38  <Field Float lastNum>
	//*  24   52:return          
			{
				lastStr = s;
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #50  <Field String lastStr>
				arrayList.add(((Object) (lastStr)));
	//   28   58:aload_0         
	//   29   59:getfield        #20  <Field ArrayList arrayList>
	//   30   62:aload_0         
	//   31   63:getfield        #50  <Field String lastStr>
	//   32   66:invokevirtual   #57  <Method boolean ArrayList.add(Object)>
	//   33   69:pop             
			}
			lastNum = null;
		}
	//*  34   70:goto            47
	}

	ArrayList getArrayList()
	{
		return arrayList;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList arrayList>
	//    2    4:areturn         
	}

	ArrayList arrayList;
	private Float lastNum;
	private String lastStr;
}
