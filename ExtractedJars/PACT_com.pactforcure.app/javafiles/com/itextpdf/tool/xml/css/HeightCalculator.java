// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssUtils

public class HeightCalculator
{

	public HeightCalculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #16  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #18  <Field CssUtils utils>
	//    5   11:return          
	}

	public Float getHeight(Tag tag, float f)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		Object obj = ((Object) ((String)tag.getCSS().get("height")));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #27  <Method Map Tag.getCSS()>
	//    4    7:ldc1            #29  <String "height">
	//    5    9:invokeinterface #35  <Method Object Map.get(Object)>
	//    6   14:checkcast       #37  <Class String>
	//    7   17:astore          4
		String s = ((String) (obj));
	//    8   19:aload           4
	//    9   21:astore_3        
		if(obj == null)
	//*  10   22:aload           4
	//*  11   24:ifnonnull       42
			s = (String)tag.getAttributes().get("height");
	//   12   27:aload_1         
	//   13   28:invokevirtual   #40  <Method Map Tag.getAttributes()>
	//   14   31:ldc1            #29  <String "height">
	//   15   33:invokeinterface #35  <Method Object Map.get(Object)>
	//   16   38:checkcast       #37  <Class String>
	//   17   41:astore_3        
		obj = ((Object) (obj1));
	//   18   42:aload           5
	//   19   44:astore          4
		if(s != null)
	//*  20   46:aload_3         
	//*  21   47:ifnull          85
			if(utils.isNumericValue(s) || utils.isMetricValue(s))
	//*  22   50:aload_0         
	//*  23   51:getfield        #18  <Field CssUtils utils>
	//*  24   54:aload_3         
	//*  25   55:invokevirtual   #44  <Method boolean CssUtils.isNumericValue(String)>
	//*  26   58:ifne            72
	//*  27   61:aload_0         
	//*  28   62:getfield        #18  <Field CssUtils utils>
	//*  29   65:aload_3         
	//*  30   66:invokevirtual   #47  <Method boolean CssUtils.isMetricValue(String)>
	//*  31   69:ifeq            88
			{
				obj = ((Object) (Float.valueOf(utils.parsePxInCmMmPcToPt(s))));
	//   32   72:aload_0         
	//   33   73:getfield        #18  <Field CssUtils utils>
	//   34   76:aload_3         
	//   35   77:invokevirtual   #51  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   36   80:invokestatic    #57  <Method Float Float.valueOf(float)>
	//   37   83:astore          4
			} else
	//*  38   85:aload           4
	//*  39   87:areturn         
			{
				obj = ((Object) (obj1));
	//   40   88:aload           5
	//   41   90:astore          4
				if(utils.isRelativeValue(s))
	//*  42   92:aload_0         
	//*  43   93:getfield        #18  <Field CssUtils utils>
	//*  44   96:aload_3         
	//*  45   97:invokevirtual   #60  <Method boolean CssUtils.isRelativeValue(String)>
	//*  46  100:ifeq            85
				{
					Float float1;
					for(float1 = null; float1 == null && tag.getParent() != null; float1 = getHeight(tag, f))
	//*  47  103:aconst_null     
	//*  48  104:astore          4
	//*  49  106:aload           4
	//*  50  108:ifnonnull       134
	//*  51  111:aload_1         
	//*  52  112:invokevirtual   #64  <Method Tag Tag.getParent()>
	//*  53  115:ifnull          134
						tag = tag.getParent();
	//   54  118:aload_1         
	//   55  119:invokevirtual   #64  <Method Tag Tag.getParent()>
	//   56  122:astore_1        

	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:fload_2         
	//   60  126:invokevirtual   #66  <Method Float getHeight(Tag, float)>
	//   61  129:astore          4
	//*  62  131:goto            106
					if(float1 == null)
	//*  63  134:aload           4
	//*  64  136:ifnonnull       152
						return Float.valueOf(utils.parseRelativeValue(s, f));
	//   65  139:aload_0         
	//   66  140:getfield        #18  <Field CssUtils utils>
	//   67  143:aload_3         
	//   68  144:fload_2         
	//   69  145:invokevirtual   #70  <Method float CssUtils.parseRelativeValue(String, float)>
	//   70  148:invokestatic    #57  <Method Float Float.valueOf(float)>
	//   71  151:areturn         
					else
						return Float.valueOf(utils.parseRelativeValue(s, float1.floatValue()));
	//   72  152:aload_0         
	//   73  153:getfield        #18  <Field CssUtils utils>
	//   74  156:aload_3         
	//   75  157:aload           4
	//   76  159:invokevirtual   #74  <Method float Float.floatValue()>
	//   77  162:invokevirtual   #70  <Method float CssUtils.parseRelativeValue(String, float)>
	//   78  165:invokestatic    #57  <Method Float Float.valueOf(float)>
	//   79  168:areturn         
				}
			}
		return ((Float) (obj));
	}

	private final CssUtils utils = CssUtils.getInstance();
}
