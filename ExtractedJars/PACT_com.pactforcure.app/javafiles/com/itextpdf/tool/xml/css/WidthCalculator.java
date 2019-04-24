// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssUtils

public class WidthCalculator
{

	public WidthCalculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #16  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #18  <Field CssUtils utils>
	//    5   11:return          
	}

	public float getWidth(Tag tag, List list, float f)
	{
		return getWidth(tag, list, f, -1F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:ldc1            #22  <Float -1F>
	//    5    6:invokevirtual   #25  <Method float getWidth(Tag, List, float, float)>
	//    6    9:freturn         
	}

	public float getWidth(Tag tag, List list, float f, float f1)
	{
		float f2;
		String s;
		f2 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		String s1 = (String)tag.getCSS().get("width");
	//    2    3:aload_1         
	//    3    4:invokevirtual   #33  <Method Map Tag.getCSS()>
	//    4    7:ldc1            #35  <String "width">
	//    5    9:invokeinterface #41  <Method Object Map.get(Object)>
	//    6   14:checkcast       #43  <Class String>
	//    7   17:astore          7
		s = s1;
	//    8   19:aload           7
	//    9   21:astore          6
		if(s1 == null)
	//*  10   23:aload           7
	//*  11   25:ifnonnull       44
			s = (String)tag.getAttributes().get("width");
	//   12   28:aload_1         
	//   13   29:invokevirtual   #46  <Method Map Tag.getAttributes()>
	//   14   32:ldc1            #35  <String "width">
	//   15   34:invokeinterface #41  <Method Object Map.get(Object)>
	//   16   39:checkcast       #43  <Class String>
	//   17   42:astore          6
		if(s == null) goto _L2; else goto _L1
	//   18   44:aload           6
	//   19   46:ifnull          165
_L1:
		if(!utils.isNumericValue(s) && !utils.isMetricValue(s)) goto _L4; else goto _L3
	//   20   49:aload_0         
	//   21   50:getfield        #18  <Field CssUtils utils>
	//   22   53:aload           6
	//   23   55:invokevirtual   #50  <Method boolean CssUtils.isNumericValue(String)>
	//   24   58:ifne            73
	//   25   61:aload_0         
	//   26   62:getfield        #18  <Field CssUtils utils>
	//   27   65:aload           6
	//   28   67:invokevirtual   #53  <Method boolean CssUtils.isMetricValue(String)>
	//   29   70:ifeq            87
_L3:
		f2 = utils.parsePxInCmMmPcToPt(s);
	//   30   73:aload_0         
	//   31   74:getfield        #18  <Field CssUtils utils>
	//   32   77:aload           6
	//   33   79:invokevirtual   #57  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   34   82:fstore          5
_L6:
		return f2;
	//   35   84:fload           5
	//   36   86:freturn         
_L4:
		if(utils.isRelativeValue(s))
	//*  37   87:aload_0         
	//*  38   88:getfield        #18  <Field CssUtils utils>
	//*  39   91:aload           6
	//*  40   93:invokevirtual   #60  <Method boolean CssUtils.isRelativeValue(String)>
	//*  41   96:ifeq            84
		{
			float f3;
			for(f3 = 0.0F; f3 == 0.0F && tag.getParent() != null; f3 = getWidth(tag, list, f, f1))
	//*  42   99:fconst_0        
	//*  43  100:fstore          5
	//*  44  102:fload           5
	//*  45  104:fconst_0        
	//*  46  105:fcmpl           
	//*  47  106:ifne            135
	//*  48  109:aload_1         
	//*  49  110:invokevirtual   #64  <Method Tag Tag.getParent()>
	//*  50  113:ifnull          135
				tag = tag.getParent();
	//   51  116:aload_1         
	//   52  117:invokevirtual   #64  <Method Tag Tag.getParent()>
	//   53  120:astore_1        

	//   54  121:aload_0         
	//   55  122:aload_1         
	//   56  123:aload_2         
	//   57  124:fload_3         
	//   58  125:fload           4
	//   59  127:invokevirtual   #25  <Method float getWidth(Tag, List, float, float)>
	//   60  130:fstore          5
	//*  61  132:goto            102
			if(f3 == 0.0F)
	//*  62  135:fload           5
	//*  63  137:fconst_0        
	//*  64  138:fcmpl           
	//*  65  139:ifne            153
				return utils.parseRelativeValue(s, f);
	//   66  142:aload_0         
	//   67  143:getfield        #18  <Field CssUtils utils>
	//   68  146:aload           6
	//   69  148:fload_3         
	//   70  149:invokevirtual   #68  <Method float CssUtils.parseRelativeValue(String, float)>
	//   71  152:freturn         
			else
				return utils.parseRelativeValue(s, f3);
	//   72  153:aload_0         
	//   73  154:getfield        #18  <Field CssUtils utils>
	//   74  157:aload           6
	//   75  159:fload           5
	//   76  161:invokevirtual   #68  <Method float CssUtils.parseRelativeValue(String, float)>
	//   77  164:freturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(list.contains(((Object) (tag.getName()))))
	//*  78  165:aload_2         
	//*  79  166:aload_1         
	//*  80  167:invokevirtual   #72  <Method String Tag.getName()>
	//*  81  170:invokeinterface #78  <Method boolean List.contains(Object)>
	//*  82  175:ifeq            84
			if(Float.compare(f1, -1F) == 0)
	//*  83  178:fload           4
	//*  84  180:ldc1            #22  <Float -1F>
	//*  85  182:invokestatic    #84  <Method int Float.compare(float, float)>
	//*  86  185:ifne            190
				return f;
	//   87  188:fload_3         
	//   88  189:freturn         
			else
				return f1;
	//   89  190:fload           4
	//   90  192:freturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	private final CssUtils utils = CssUtils.getInstance();
}
