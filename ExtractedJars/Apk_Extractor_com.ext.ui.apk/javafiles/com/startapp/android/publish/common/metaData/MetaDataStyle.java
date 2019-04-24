// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import java.io.Serializable;
import java.util.*;

public class MetaDataStyle
	implements Serializable
{

	public MetaDataStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		name = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #79  <String "">
	//    4    7:putfield        #81  <Field String name>
		itemGradientTop = Integer.valueOf(0xff2a2939);
	//    5   10:aload_0         
	//    6   11:ldc1            #20  <Int 0xff2a2939>
	//    7   13:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//    8   16:putfield        #83  <Field Integer itemGradientTop>
		itemGradientBottom = Integer.valueOf(0xff7a7b89);
	//    9   19:aload_0         
	//   10   20:ldc1            #9   <Int 0xff7a7b89>
	//   11   22:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   12   25:putfield        #85  <Field Integer itemGradientBottom>
		itemTitleTextSize = DEFAULT_ITEM_TITLE_TEXT_SIZE;
	//   13   28:aload_0         
	//   14   29:getstatic       #47  <Field Integer DEFAULT_ITEM_TITLE_TEXT_SIZE>
	//   15   32:putfield        #87  <Field Integer itemTitleTextSize>
		itemTitleTextColor = DEFAULT_ITEM_TITLE_TEXT_COLOR;
	//   16   35:aload_0         
	//   17   36:getstatic       #49  <Field Integer DEFAULT_ITEM_TITLE_TEXT_COLOR>
	//   18   39:putfield        #89  <Field Integer itemTitleTextColor>
		itemTitleTextDecoration = DEFAULT_ITEM_TITLE_TEXT_DECORATION;
	//   19   42:aload_0         
	//   20   43:getstatic       #67  <Field Set DEFAULT_ITEM_TITLE_TEXT_DECORATION>
	//   21   46:putfield        #91  <Field Set itemTitleTextDecoration>
		itemDescriptionTextSize = DEFAULT_ITEM_DESC_TEXT_SIZE;
	//   22   49:aload_0         
	//   23   50:getstatic       #69  <Field Integer DEFAULT_ITEM_DESC_TEXT_SIZE>
	//   24   53:putfield        #93  <Field Integer itemDescriptionTextSize>
		itemDescriptionTextColor = DEFAULT_ITEM_DESC_TEXT_COLOR;
	//   25   56:aload_0         
	//   26   57:getstatic       #71  <Field Integer DEFAULT_ITEM_DESC_TEXT_COLOR>
	//   27   60:putfield        #95  <Field Integer itemDescriptionTextColor>
		itemDescriptionTextDecoration = DEFAULT_ITEM_DESC_TEXT_DECORATION;
	//   28   63:aload_0         
	//   29   64:getstatic       #75  <Field Set DEFAULT_ITEM_DESC_TEXT_DECORATION>
	//   30   67:putfield        #97  <Field Set itemDescriptionTextDecoration>
	//   31   70:return          
	}

	public Integer getItemDescriptionTextColor()
	{
		return itemDescriptionTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Integer itemDescriptionTextColor>
	//    2    4:areturn         
	}

	public Set getItemDescriptionTextDecoration()
	{
		return itemDescriptionTextDecoration;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Set itemDescriptionTextDecoration>
	//    2    4:areturn         
	}

	public Integer getItemDescriptionTextSize()
	{
		return itemDescriptionTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Integer itemDescriptionTextSize>
	//    2    4:areturn         
	}

	public Integer getItemGradientBottom()
	{
		return itemGradientBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Integer itemGradientBottom>
	//    2    4:areturn         
	}

	public Integer getItemGradientTop()
	{
		return itemGradientTop;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Integer itemGradientTop>
	//    2    4:areturn         
	}

	public Integer getItemTitleTextColor()
	{
		return itemTitleTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Integer itemTitleTextColor>
	//    2    4:areturn         
	}

	public Set getItemTitleTextDecoration()
	{
		return itemTitleTextDecoration;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Set itemTitleTextDecoration>
	//    2    4:areturn         
	}

	public Integer getItemTitleTextSize()
	{
		return itemTitleTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Integer itemTitleTextSize>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String name>
	//    2    4:areturn         
	}

	public void setItemDescriptionTextColor(Integer integer)
	{
		itemDescriptionTextColor = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field Integer itemDescriptionTextColor>
	//    3    5:return          
	}

	public void setItemDescriptionTextDecoration(Set set)
	{
		itemDescriptionTextDecoration = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Set itemDescriptionTextDecoration>
	//    3    5:return          
	}

	public void setItemDescriptionTextSize(Integer integer)
	{
		itemDescriptionTextSize = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field Integer itemDescriptionTextSize>
	//    3    5:return          
	}

	public void setItemGradientBottom(Integer integer)
	{
		itemGradientBottom = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field Integer itemGradientBottom>
	//    3    5:return          
	}

	public void setItemGradientTop(Integer integer)
	{
		itemGradientTop = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field Integer itemGradientTop>
	//    3    5:return          
	}

	public void setItemTitleTextColor(Integer integer)
	{
		itemTitleTextColor = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field Integer itemTitleTextColor>
	//    3    5:return          
	}

	public void setItemTitleTextDecoration(Set set)
	{
		itemTitleTextDecoration = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field Set itemTitleTextDecoration>
	//    3    5:return          
	}

	public void setItemTitleTextSize(Integer integer)
	{
		itemTitleTextSize = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field Integer itemTitleTextSize>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String name>
	//    3    5:return          
	}

	public static final int DEFAULT_ITEM_BOTTOM = 0xff7a7b89;
	public static final Integer DEFAULT_ITEM_DESC_TEXT_COLOR = Integer.valueOf(-1);
	public static final Set DEFAULT_ITEM_DESC_TEXT_DECORATION = new HashSet();
	public static final Integer DEFAULT_ITEM_DESC_TEXT_SIZE = Integer.valueOf(14);
	public static final Integer DEFAULT_ITEM_TITLE_TEXT_COLOR = Integer.valueOf(-1);
	public static final Set DEFAULT_ITEM_TITLE_TEXT_DECORATION = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"BOLD"
	}))))));
	public static final Integer DEFAULT_ITEM_TITLE_TEXT_SIZE = Integer.valueOf(18);
	public static final int DEFAULT_ITEM_TOP = 0xff2a2939;
	private static final long serialVersionUID = 1L;
	private Integer itemDescriptionTextColor;
	private Set itemDescriptionTextDecoration;
	private Integer itemDescriptionTextSize;
	private Integer itemGradientBottom;
	private Integer itemGradientTop;
	private Integer itemTitleTextColor;
	private Set itemTitleTextDecoration;
	private Integer itemTitleTextSize;
	private String name;

	static 
	{
	//    0    0:bipush          18
	//    1    2:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//    2    5:putstatic       #47  <Field Integer DEFAULT_ITEM_TITLE_TEXT_SIZE>
	//    3    8:iconst_m1       
	//    4    9:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//    5   12:putstatic       #49  <Field Integer DEFAULT_ITEM_TITLE_TEXT_COLOR>
	//    6   15:new             #51  <Class HashSet>
	//    7   18:dup             
	//    8   19:iconst_1        
	//    9   20:anewarray       String[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:ldc1            #55  <String "BOLD">
	//   13   27:aastore         
	//   14   28:invokestatic    #61  <Method java.util.List Arrays.asList(Object[])>
	//   15   31:invokespecial   #65  <Method void HashSet(java.util.Collection)>
	//   16   34:putstatic       #67  <Field Set DEFAULT_ITEM_TITLE_TEXT_DECORATION>
	//   17   37:bipush          14
	//   18   39:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   19   42:putstatic       #69  <Field Integer DEFAULT_ITEM_DESC_TEXT_SIZE>
	//   20   45:iconst_m1       
	//   21   46:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   22   49:putstatic       #71  <Field Integer DEFAULT_ITEM_DESC_TEXT_COLOR>
	//   23   52:new             #51  <Class HashSet>
	//   24   55:dup             
	//   25   56:invokespecial   #73  <Method void HashSet()>
	//   26   59:putstatic       #75  <Field Set DEFAULT_ITEM_DESC_TEXT_DECORATION>
	//*  27   62:return          
	}
}
