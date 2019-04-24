// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import java.util.HashMap;
import java.util.Map;

public final class CSS
{
	public static final class Property
	{

		public static final String AFTER = "after";
		public static final String BACKGROUND = "background";
		public static final String BACKGROUND_ATTACHMENT = "background-attachment";
		public static final String BACKGROUND_COLOR = "background-color";
		public static final String BACKGROUND_IMAGE = "background-image";
		public static final String BACKGROUND_POSITION = "background-position";
		public static final String BACKGROUND_REPEAT = "background-repeat";
		public static final String BEFORE = "before";
		public static final String BORDER = "border";
		public static final String BORDER_BOTTOM = "border-bottom";
		public static final String BORDER_BOTTOM_COLOR = "border-bottom-color";
		public static final String BORDER_BOTTOM_STYLE = "border-bottom-style";
		public static final String BORDER_BOTTOM_WIDTH = "border-bottom-width";
		public static final String BORDER_COLLAPSE = "border-collapse";
		public static final String BORDER_COLOR = "border-color";
		public static final String BORDER_LEFT = "border-left";
		public static final String BORDER_LEFT_COLOR = "border-left-color";
		public static final String BORDER_LEFT_STYLE = "border-left-style";
		public static final String BORDER_LEFT_WIDTH = "border-left-width";
		public static final String BORDER_RIGHT = "border-right";
		public static final String BORDER_RIGHT_COLOR = "border-right-color";
		public static final String BORDER_RIGHT_STYLE = "border-right-style";
		public static final String BORDER_RIGHT_WIDTH = "border-right-width";
		public static final String BORDER_SPACING = "border-spacing";
		public static final String BORDER_STYLE = "border-style";
		public static final String BORDER_TOP = "border-top";
		public static final String BORDER_TOP_COLOR = "border-top-color";
		public static final String BORDER_TOP_STYLE = "border-top-style";
		public static final String BORDER_TOP_WIDTH = "border-top-width";
		public static final String BORDER_WIDTH = "border-width";
		public static final String BOTTOM = "bottom";
		public static final String CAPTION_SIDE = "caption-side";
		public static final String CELLPADDING = "cellpadding";
		public static final String CELLPADDING_BOTTOM = "cellpadding-bottom";
		public static final String CELLPADDING_LEFT = "cellpadding-left";
		public static final String CELLPADDING_RIGHT = "cellpadding-right";
		public static final String CELLPADDING_TOP = "cellpadding-top";
		public static final String COLOR = "color";
		public static final String DIRECTION = "direction";
		public static final String DISPLAY = "display";
		public static final String EMPTY_CELLS = "empty-cells";
		public static final String FLOAT = "float";
		public static final String FONT = "font";
		public static final String FONT_FAMILY = "font-family";
		public static final String FONT_SIZE = "font-size";
		public static final String FONT_STYLE = "font-style";
		public static final String FONT_WEIGHT = "font-weight";
		public static final String HEIGHT = "height";
		public static final String LEFT = "left";
		public static final String LETTER_SPACING = "letter-spacing";
		public static final String LINE_HEIGHT = "line-height";
		public static final String LIST_STYLE = "list-style";
		public static final String LIST_STYLE_IMAGE = "list-style-image";
		public static final String LIST_STYLE_POSITION = "list-style-position";
		public static final String LIST_STYLE_TYPE = "list-style-type";
		public static final String MARGIN = "margin";
		public static final String MARGIN_BOTTOM = "margin-bottom";
		public static final String MARGIN_LEFT = "margin-left";
		public static final String MARGIN_RIGHT = "margin-right";
		public static final String MARGIN_TOP = "margin-top";
		public static final String MAX_HEIGHT = "max-height";
		public static final String MAX_WIDTH = "max-width";
		public static final String MIN_HEIGHT = "min-height";
		public static final String MIN_WIDTH = "min-width";
		public static final String PADDING = "padding";
		public static final String PADDING_BOTTOM = "padding-bottom";
		public static final String PADDING_LEFT = "padding-left";
		public static final String PADDING_RIGHT = "padding-right";
		public static final String PADDING_TOP = "padding-top";
		public static final String PAGE_BREAK_AFTER = "page-break-after";
		public static final String PAGE_BREAK_BEFORE = "page-break-before";
		public static final String PAGE_BREAK_INSIDE = "page-break-inside";
		public static final String POSITION = "position";
		public static final String REPEAT_FOOTER = "repeat-footer";
		public static final String REPEAT_HEADER = "repeat-header";
		public static final String RIGHT = "right";
		public static final String TAB_INTERVAL = "tab-interval";
		public static final String TAB_STOPS = "tab-stops";
		public static final String TEXT_ALIGN = "text-align";
		public static final String TEXT_DECORATION = "text-decoration";
		public static final String TEXT_INDENT = "text-indent";
		public static final String TEXT_VALIGN = "text-valign";
		public static final String TOP = "top";
		public static final String VERTICAL_ALIGN = "vertical-align";
		public static final String WIDTH = "width";
		public static final String XFA_FONT_HORIZONTAL_SCALE = "xfa-font-horizontal-scale";
		public static final String XFA_FONT_VERTICAL_SCALE = "xfa-font-vertical-scale";
		public static final String XFA_TAB_COUNT = "xfa-tab-count";
		public static final String XFA_TAB_STOPS = "xfa-tab-stops";

		private Property()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #279 <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class Value
	{

		public static final String ABSOLUTE = "absolute";
		public static final String ALWAYS = "always";
		public static final String AUTO = "auto";
		public static final String AVOID = "avoid";
		public static final String BLOCK = "block";
		public static final String BOLD = "bold";
		public static final String BOTTOM = "bottom";
		public static final String CENTER = "center";
		public static final String CIRCLE = "circle";
		public static final String CM = "cm";
		public static final String COLLAPSE = "collapse";
		public static final String DASHED = "dashed";
		public static final String DECIMAL = "decimal";
		public static final String DISC = "disc";
		public static final String DOTTED = "dotted";
		public static final String DOUBLE = "double";
		public static final String EM = "em";
		public static final String EX = "ex";
		public static final String FIXED = "fixed";
		public static final String GROOVE = "groove";
		public static final String HIDDEN = "hidden";
		public static final String HIDE = "hide";
		public static final String IN = "in";
		public static final String INHERIT = "inherit";
		public static final String INLINE = "inline";
		public static final String INLINE_BLOCK = "inline-block";
		public static final String INLINE_TABLE = "inline-table";
		public static final String INSET = "inset";
		public static final String INSIDE = "inside";
		public static final String ITALIC = "italic";
		public static final String JUSTIFY = "justify";
		public static final String LARGE = "large";
		public static final String LARGER = "larger";
		public static final String LEFT = "left";
		public static final String LINE_THROUGH = "line-through";
		public static final String LIST_ITEM = "list-item";
		public static final String LOWER_ALPHA = "lower-alpha";
		public static final String LOWER_GREEK = "lower-greek";
		public static final String LOWER_LATIN = "lower-latin";
		public static final String LOWER_ROMAN = "lower-roman";
		public static final String LTR = "ltr";
		public static final String MEDIUM = "medium";
		public static final String MM = "mm";
		public static final String NONE = "none";
		public static final String NO_REPEAT = "no-repeat";
		public static final String OBLIQUE = "oblique";
		public static final String OUTSET = "outset";
		public static final String OUTSIDE = "outside";
		public static final String PC = "pc";
		public static final String PERCENTAGE = "%";
		public static final String PT = "pt";
		public static final String PX = "px";
		public static final String RELATIVE = "relative";
		public static final String REPEAT = "repeat";
		public static final String REPEAT_X = "repeat-x";
		public static final String REPEAT_Y = "repeat-y";
		public static final String RIDGE = "ridge";
		public static final String RIGHT = "right";
		public static final String RTL = "rtl";
		public static final String RUN_IN = "run-in";
		public static final String SCROLL = "scroll";
		public static final String SEPARATE = "separate";
		public static final String SMALL = "small";
		public static final String SMALLER = "smaller";
		public static final String SOLID = "solid";
		public static final String SQUARE = "square";
		public static final String SUB = "sub";
		public static final String SUPER = "super";
		public static final String TABLE = "table";
		public static final String TABLE_CAPTION = "table-caption";
		public static final String TABLE_CELL = "table-cell";
		public static final String TABLE_COLUMN = "table-column";
		public static final String TABLE_COLUMN_GROUP = "table-column-group";
		public static final String TABLE_FOOTER_GROUP = "table-footer-group";
		public static final String TABLE_HEADER_GROUP = "table-header-group";
		public static final String TABLE_ROW = "table-row";
		public static final String TABLE_ROW_GROUP = "table-row-group";
		public static final String TEXT_BOTTOM = "text-bottom";
		public static final String TEXT_TOP = "text-top";
		public static final String THICK = "thick";
		public static final String THIN = "thin";
		public static final String TOP = "top";
		public static final String UNDERLINE = "underline";
		public static final String UPPER_ALPHA = "upper-alpha";
		public static final String UPPER_GREEK = "upper-greek";
		public static final String UPPER_LATIN = "upper-latin";
		public static final String UPPER_ROMAN = "upper-roman";
		public static final String XX_LARGE = "xx-large";
		public static final String XX_SMALL = "xx-small";
		public static final String X_LARGE = "x-large";
		public static final String X_SMALL = "x-small";

		private Value()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #285 <Method void Object()>
		//    2    4:return          
		}
	}


	private CSS()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static final int getElementAlignment(String s)
	{
		s = s.toLowerCase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method String String.toLowerCase()>
	//    2    4:astore_0        
		if(cssAlignMap.containsKey(((Object) (s))))
	//*   3    5:getstatic       #26  <Field Map cssAlignMap>
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #60  <Method boolean Map.containsKey(Object)>
	//*   6   14:ifeq            33
			return ((Integer)cssAlignMap.get(((Object) (s)))).intValue();
	//    7   17:getstatic       #26  <Field Map cssAlignMap>
	//    8   20:aload_0         
	//    9   21:invokeinterface #64  <Method Object Map.get(Object)>
	//   10   26:checkcast       #36  <Class Integer>
	//   11   29:invokevirtual   #68  <Method int Integer.intValue()>
	//   12   32:ireturn         
		else
			return ((Integer)cssAlignMap.get("default")).intValue();
	//   13   33:getstatic       #26  <Field Map cssAlignMap>
	//   14   36:ldc1            #14  <String "default">
	//   15   38:invokeinterface #64  <Method Object Map.get(Object)>
	//   16   43:checkcast       #36  <Class Integer>
	//   17   46:invokevirtual   #68  <Method int Integer.intValue()>
	//   18   49:ireturn         
	}

	private static final String DEFAULT = "default";
	private static final Map cssAlignMap;

	static 
	{
		cssAlignMap = ((Map) (new HashMap()));
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:putstatic       #26  <Field Map cssAlignMap>
		cssAlignMap.put(((Object) ("left".toLowerCase())), ((Object) (Integer.valueOf(0))));
	//    4   10:getstatic       #26  <Field Map cssAlignMap>
	//    5   13:ldc1            #28  <String "left">
	//    6   15:invokevirtual   #34  <Method String String.toLowerCase()>
	//    7   18:iconst_0        
	//    8   19:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//    9   22:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   10   27:pop             
		cssAlignMap.put(((Object) ("center".toLowerCase())), ((Object) (Integer.valueOf(1))));
	//   11   28:getstatic       #26  <Field Map cssAlignMap>
	//   12   31:ldc1            #48  <String "center">
	//   13   33:invokevirtual   #34  <Method String String.toLowerCase()>
	//   14   36:iconst_1        
	//   15   37:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   16   40:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   17   45:pop             
		cssAlignMap.put(((Object) ("right".toLowerCase())), ((Object) (Integer.valueOf(2))));
	//   18   46:getstatic       #26  <Field Map cssAlignMap>
	//   19   49:ldc1            #50  <String "right">
	//   20   51:invokevirtual   #34  <Method String String.toLowerCase()>
	//   21   54:iconst_2        
	//   22   55:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   23   58:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   24   63:pop             
		cssAlignMap.put(((Object) ("justify".toLowerCase())), ((Object) (Integer.valueOf(3))));
	//   25   64:getstatic       #26  <Field Map cssAlignMap>
	//   26   67:ldc1            #52  <String "justify">
	//   27   69:invokevirtual   #34  <Method String String.toLowerCase()>
	//   28   72:iconst_3        
	//   29   73:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   30   76:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   31   81:pop             
		cssAlignMap.put(((Object) ("default".toLowerCase())), ((Object) (Integer.valueOf(-1))));
	//   32   82:getstatic       #26  <Field Map cssAlignMap>
	//   33   85:ldc1            #14  <String "default">
	//   34   87:invokevirtual   #34  <Method String String.toLowerCase()>
	//   35   90:iconst_m1       
	//   36   91:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   37   94:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   38   99:pop             
	//*  39  100:return          
	}
}
