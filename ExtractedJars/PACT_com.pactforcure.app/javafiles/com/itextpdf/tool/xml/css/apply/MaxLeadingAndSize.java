// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.css.FontSizeTranslator;
import java.util.*;

public final class MaxLeadingAndSize
{

	public MaxLeadingAndSize()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #23  <Field CssUtils utils>
	//    5   11:aload_0         
	//    6   12:invokestatic    #28  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    7   15:putfield        #30  <Field FontSizeTranslator fontSizeTranslator>
	//    8   18:return          
	}

	private float getLargestLeadingFromChildren(List list)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   2    2:aload_1         
	//*   3    3:invokeinterface #39  <Method Iterator List.iterator()>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*   7   15:ifeq            70
		{
			Tag tag = (Tag)((Iterator) (list)).next();
	//    8   18:aload_1         
	//    9   19:invokeinterface #49  <Method Object Iterator.next()>
	//   10   24:checkcast       #51  <Class Tag>
	//   11   27:astore          4
			Float float1 = calculateLeading(tag);
	//   12   29:aload_0         
	//   13   30:aload           4
	//   14   32:invokevirtual   #55  <Method Float calculateLeading(Tag)>
	//   15   35:astore          5
			float f1 = f;
	//   16   37:fload_2         
	//   17   38:fstore_3        
			if(float1.floatValue() > f)
	//*  18   39:aload           5
	//*  19   41:invokevirtual   #61  <Method float Float.floatValue()>
	//*  20   44:fload_2         
	//*  21   45:fcmpl           
	//*  22   46:ifle            55
				f1 = float1.floatValue();
	//   23   49:aload           5
	//   24   51:invokevirtual   #61  <Method float Float.floatValue()>
	//   25   54:fstore_3        
			getLargestLeadingFromChildren(tag.getChildren());
	//   26   55:aload_0         
	//   27   56:aload           4
	//   28   58:invokevirtual   #65  <Method List Tag.getChildren()>
	//   29   61:invokespecial   #67  <Method float getLargestLeadingFromChildren(List)>
	//   30   64:pop             
			f = f1;
	//   31   65:fload_3         
	//   32   66:fstore_2        
		}

	//*  33   67:goto            9
		return f;
	//   34   70:fload_2         
	//   35   71:freturn         
	}

	public Float calculateLeading(Tag tag)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		Map map = tag.getCSS();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #73  <Method Map Tag.getCSS()>
	//    4    6:astore          5
		float f2 = fontSizeTranslator.getFontSize(tag);
	//    5    8:aload_0         
	//    6    9:getfield        #30  <Field FontSizeTranslator fontSizeTranslator>
	//    7   12:aload_1         
	//    8   13:invokevirtual   #77  <Method float FontSizeTranslator.getFontSize(Tag)>
	//    9   16:fstore          4
		float f1;
		if(map.get("line-height") != null)
	//*  10   18:aload           5
	//*  11   20:ldc1            #79  <String "line-height">
	//*  12   22:invokeinterface #85  <Method Object Map.get(Object)>
	//*  13   27:ifnull          129
		{
			tag = ((Tag) ((String)map.get("line-height")));
	//   14   30:aload           5
	//   15   32:ldc1            #79  <String "line-height">
	//   16   34:invokeinterface #85  <Method Object Map.get(Object)>
	//   17   39:checkcast       #87  <Class String>
	//   18   42:astore_1        
			if(utils.isNumericValue(((String) (tag))))
	//*  19   43:aload_0         
	//*  20   44:getfield        #23  <Field CssUtils utils>
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #91  <Method boolean CssUtils.isNumericValue(String)>
	//*  23   51:ifeq            81
				f = Float.parseFloat(((String) (tag))) * f2;
	//   24   54:aload_1         
	//   25   55:invokestatic    #95  <Method float Float.parseFloat(String)>
	//   26   58:fload           4
	//   27   60:fmul            
	//   28   61:fstore_2        
			else
	//*  29   62:fload_2         
	//*  30   63:fstore_3        
	//*  31   64:fload_2         
	//*  32   65:fconst_0        
	//*  33   66:fcmpl           
	//*  34   67:ifne            76
	//*  35   70:fload           4
	//*  36   72:ldc1            #96  <Float 1.5F>
	//*  37   74:fmul            
	//*  38   75:fstore_3        
	//*  39   76:fload_3         
	//*  40   77:invokestatic    #100 <Method Float Float.valueOf(float)>
	//*  41   80:areturn         
			if(utils.isRelativeValue(((String) (tag))))
	//*  42   81:aload_0         
	//*  43   82:getfield        #23  <Field CssUtils utils>
	//*  44   85:aload_1         
	//*  45   86:invokevirtual   #103 <Method boolean CssUtils.isRelativeValue(String)>
	//*  46   89:ifeq            106
				f = utils.parseRelativeValue(((String) (tag)), f2);
	//   47   92:aload_0         
	//   48   93:getfield        #23  <Field CssUtils utils>
	//   49   96:aload_1         
	//   50   97:fload           4
	//   51   99:invokevirtual   #107 <Method float CssUtils.parseRelativeValue(String, float)>
	//   52  102:fstore_2        
			else
	//*  53  103:goto            62
			if(utils.isMetricValue(((String) (tag))))
	//*  54  106:aload_0         
	//*  55  107:getfield        #23  <Field CssUtils utils>
	//*  56  110:aload_1         
	//*  57  111:invokevirtual   #110 <Method boolean CssUtils.isMetricValue(String)>
	//*  58  114:ifeq            62
				f = utils.parsePxInCmMmPcToPt(((String) (tag)));
	//   59  117:aload_0         
	//   60  118:getfield        #23  <Field CssUtils utils>
	//   61  121:aload_1         
	//   62  122:invokevirtual   #113 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   63  125:fstore_2        
			f1 = f;
			if(f == 0.0F)
				f1 = f2 * 1.5F;
		} else
	//*  64  126:goto            62
		{
			f1 = f2 * 1.5F;
	//   65  129:fload           4
	//   66  131:ldc1            #96  <Float 1.5F>
	//   67  133:fmul            
	//   68  134:fstore_3        
		}
		return Float.valueOf(f1);
	//*  69  135:goto            76
	}

	public float getLargestFont()
	{
		return largestFont;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field float largestFont>
	//    2    4:freturn         
	}

	public float getLargestFontFromChildren(List list)
	{
		float f = 12F;
	//    0    0:ldc1            #118 <Float 12F>
	//    1    2:fstore_2        
		list = ((List) (list.iterator()));
	//    2    3:aload_1         
	//    3    4:invokeinterface #39  <Method Iterator List.iterator()>
	//    4    9:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    5   10:aload_1         
	//    6   11:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    7   16:ifeq            51
			Tag tag = (Tag)((Iterator) (list)).next();
	//    8   19:aload_1         
	//    9   20:invokeinterface #49  <Method Object Iterator.next()>
	//   10   25:checkcast       #51  <Class Tag>
	//   11   28:astore          4
			float f1 = fontSizeTranslator.getFontSize(tag);
	//   12   30:aload_0         
	//   13   31:getfield        #30  <Field FontSizeTranslator fontSizeTranslator>
	//   14   34:aload           4
	//   15   36:invokevirtual   #77  <Method float FontSizeTranslator.getFontSize(Tag)>
	//   16   39:fstore_3        
			if(f1 > f)
	//*  17   40:fload_3         
	//*  18   41:fload_2         
	//*  19   42:fcmpl           
	//*  20   43:ifle            10
				f = f1;
	//   21   46:fload_3         
	//   22   47:fstore_2        
		} while(true);
	//   23   48:goto            10
		return f;
	//   24   51:fload_2         
	//   25   52:freturn         
	}

	public float getLargestLeading()
	{
		return largestLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field float largestLeading>
	//    2    4:freturn         
	}

	public void setLeading(Tag tag)
	{
		largestLeading = calculateLeading(tag).floatValue();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #55  <Method Float calculateLeading(Tag)>
	//    4    6:invokevirtual   #61  <Method float Float.floatValue()>
	//    5    9:putfield        #121 <Field float largestLeading>
	//    6   12:return          
	}

	public void setVariablesBasedOnChildren(Tag tag)
	{
		float f = fontSizeTranslator.getFontSize(tag);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field FontSizeTranslator fontSizeTranslator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method float FontSizeTranslator.getFontSize(Tag)>
	//    4    8:fstore_2        
		float f1 = getLargestFontFromChildren(tag.getChildren());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #65  <Method List Tag.getChildren()>
	//    8   14:invokevirtual   #126 <Method float getLargestFontFromChildren(List)>
	//    9   17:fstore_3        
		if(f <= f1)
	//*  10   18:fload_2         
	//*  11   19:fload_3         
	//*  12   20:fcmpl           
	//*  13   21:ifle            59
	//*  14   24:aload_0         
	//*  15   25:fload_2         
	//*  16   26:putfield        #116 <Field float largestFont>
	//*  17   29:aload_0         
	//*  18   30:aload_1         
	//*  19   31:invokevirtual   #55  <Method Float calculateLeading(Tag)>
	//*  20   34:invokevirtual   #61  <Method float Float.floatValue()>
	//*  21   37:fstore_2        
	//*  22   38:aload_0         
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #65  <Method List Tag.getChildren()>
	//*  25   43:invokespecial   #67  <Method float getLargestLeadingFromChildren(List)>
	//*  26   46:fstore_3        
	//*  27   47:fload_2         
	//*  28   48:fload_3         
	//*  29   49:fcmpl           
	//*  30   50:ifle            64
	//*  31   53:aload_0         
	//*  32   54:fload_2         
	//*  33   55:putfield        #121 <Field float largestLeading>
	//*  34   58:return          
			f = f1;
	//   35   59:fload_3         
	//   36   60:fstore_2        
		largestFont = f;
		f = calculateLeading(tag).floatValue();
		f1 = getLargestLeadingFromChildren(tag.getChildren());
		if(f <= f1)
	//*  37   61:goto            24
			f = f1;
	//   38   64:fload_3         
	//   39   65:fstore_2        
		largestLeading = f;
	//*  40   66:goto            53
	}

	private final FontSizeTranslator fontSizeTranslator = FontSizeTranslator.getInstance();
	private float largestFont;
	private float largestLeading;
	private final CssUtils utils = CssUtils.getInstance();
}
