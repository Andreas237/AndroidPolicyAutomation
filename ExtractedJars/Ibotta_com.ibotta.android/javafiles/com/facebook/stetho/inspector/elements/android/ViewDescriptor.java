// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.*;
import com.facebook.stetho.inspector.helper.IntegerFormatter;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor, MethodInvoker

final class ViewDescriptor extends AbstractChainedDescriptor
	implements HighlightableDescriptor
{
	private final class FieldBackedCSSProperty extends ViewCSSProperty
	{

		public Object getValue(View view)
			throws InvocationTargetException, IllegalAccessException
		{
			return mField.get(((Object) (view)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Field mField>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method Object Field.get(Object)>
		//    4    8:areturn         
		}

		private final Field mField;
		final ViewDescriptor this$0;

		public FieldBackedCSSProperty(Field field, String s, android.view.ViewDebug.ExportedProperty exportedproperty)
		{
			this$0 = ViewDescriptor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ViewDescriptor this$0>
			super(s, exportedproperty);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:invokespecial   #19  <Method void ViewDescriptor$ViewCSSProperty(ViewDescriptor, String, android.view.ViewDebug$ExportedProperty)>
			mField = field;
		//    8   13:aload_0         
		//    9   14:aload_2         
		//   10   15:putfield        #21  <Field Field mField>
			mField.setAccessible(true);
		//   11   18:aload_0         
		//   12   19:getfield        #21  <Field Field mField>
		//   13   22:iconst_1        
		//   14   23:invokevirtual   #27  <Method void Field.setAccessible(boolean)>
		//   15   26:return          
		}
	}

	private final class MethodBackedCSSProperty extends ViewCSSProperty
	{

		public Object getValue(View view)
			throws InvocationTargetException, IllegalAccessException
		{
			return mMethod.invoke(((Object) (view)), new Object[0]);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Method mMethod>
		//    2    4:aload_1         
		//    3    5:iconst_0        
		//    4    6:anewarray       Object[]
		//    5    9:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
		//    6   12:areturn         
		}

		private final Method mMethod;
		final ViewDescriptor this$0;

		public MethodBackedCSSProperty(Method method, String s, android.view.ViewDebug.ExportedProperty exportedproperty)
		{
			this$0 = ViewDescriptor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ViewDescriptor this$0>
			super(s, exportedproperty);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:invokespecial   #19  <Method void ViewDescriptor$ViewCSSProperty(ViewDescriptor, String, android.view.ViewDebug$ExportedProperty)>
			mMethod = method;
		//    8   13:aload_0         
		//    9   14:aload_2         
		//   10   15:putfield        #21  <Field Method mMethod>
			mMethod.setAccessible(true);
		//   11   18:aload_0         
		//   12   19:getfield        #21  <Field Method mMethod>
		//   13   22:iconst_1        
		//   14   23:invokevirtual   #27  <Method void Method.setAccessible(boolean)>
		//   15   26:return          
		}
	}

	private abstract class ViewCSSProperty
	{

		public final android.view.ViewDebug.ExportedProperty getAnnotation()
		{
			return mAnnotation;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field android.view.ViewDebug$ExportedProperty mAnnotation>
		//    2    4:areturn         
		}

		public final String getCSSName()
		{
			return mCSSName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String mCSSName>
		//    2    4:areturn         
		}

		public abstract Object getValue(View view)
			throws InvocationTargetException, IllegalAccessException;

		private final android.view.ViewDebug.ExportedProperty mAnnotation;
		private final String mCSSName;
		final ViewDescriptor this$0;

		public ViewCSSProperty(String s, android.view.ViewDebug.ExportedProperty exportedproperty)
		{
			this$0 = ViewDescriptor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field ViewDescriptor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			mCSSName = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String mCSSName>
			mAnnotation = exportedproperty;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field android.view.ViewDebug$ExportedProperty mAnnotation>
		//   11   19:return          
		}
	}


	public ViewDescriptor()
	{
		this(new MethodInvoker());
	//    0    0:aload_0         
	//    1    1:new             #43  <Class MethodInvoker>
	//    2    4:dup             
	//    3    5:invokespecial   #45  <Method void MethodInvoker()>
	//    4    8:invokespecial   #48  <Method void ViewDescriptor(MethodInvoker)>
	//    5   11:return          
	}

	public ViewDescriptor(MethodInvoker methodinvoker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbstractChainedDescriptor()>
		mMethodInvoker = methodinvoker;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field MethodInvoker mMethodInvoker>
	//    5    9:return          
	}

	private static boolean canFlagsBeMappedToString(android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		return exportedproperty != null && exportedproperty.flagMapping() != null && exportedproperty.flagMapping().length > 0;
	//    0    0:aload_0         
	//    1    1:ifnull          25
	//    2    4:aload_0         
	//    3    5:invokeinterface #60  <Method android.view.ViewDebug$FlagToString[] android.view.ViewDebug$ExportedProperty.flagMapping()>
	//    4   10:ifnull          25
	//    5   13:aload_0         
	//    6   14:invokeinterface #60  <Method android.view.ViewDebug$FlagToString[] android.view.ViewDebug$ExportedProperty.flagMapping()>
	//    7   19:arraylength     
	//    8   20:ifle            25
	//    9   23:iconst_1        
	//   10   24:ireturn         
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	private static boolean canIntBeMappedToString(android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		return exportedproperty != null && exportedproperty.mapping() != null && exportedproperty.mapping().length > 0;
	//    0    0:aload_0         
	//    1    1:ifnull          25
	//    2    4:aload_0         
	//    3    5:invokeinterface #66  <Method android.view.ViewDebug$IntToString[] android.view.ViewDebug$ExportedProperty.mapping()>
	//    4   10:ifnull          25
	//    5   13:aload_0         
	//    6   14:invokeinterface #66  <Method android.view.ViewDebug$IntToString[] android.view.ViewDebug$ExportedProperty.mapping()>
	//    7   19:arraylength     
	//    8   20:ifle            25
	//    9   23:iconst_1        
	//   10   24:ireturn         
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	private static String capitalize(String s)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #74  <Method int String.length()>
	//*   4    8:ifeq            51
		{
			if(Character.isTitleCase(s.charAt(0)))
	//*   5   11:aload_0         
	//*   6   12:iconst_0        
	//*   7   13:invokevirtual   #78  <Method char String.charAt(int)>
	//*   8   16:invokestatic    #84  <Method boolean Character.isTitleCase(char)>
	//*   9   19:ifeq            24
			{
				return s;
	//   10   22:aload_0         
	//   11   23:areturn         
			} else
			{
				s = ((String) (new StringBuilder(s)));
	//   12   24:new             #86  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #89  <Method void StringBuilder(String)>
	//   16   32:astore_0        
				((StringBuilder) (s)).setCharAt(0, Character.toTitleCase(((StringBuilder) (s)).charAt(0)));
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #90  <Method char StringBuilder.charAt(int)>
	//   22   40:invokestatic    #94  <Method char Character.toTitleCase(char)>
	//   23   43:invokevirtual   #98  <Method void StringBuilder.setCharAt(int, char)>
				return ((StringBuilder) (s)).toString();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   26   50:areturn         
			}
		} else
		{
			return s;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	private String convertViewPropertyNameToCSSName(String s)
	{
		s = ((String) (getWordBoundaryPattern().split(((CharSequence) (s)))));
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method Pattern getWordBoundaryPattern()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method String[] Pattern.split(CharSequence)>
	//    4    8:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #86  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #114 <Method void StringBuilder()>
	//    8   16:astore_3        
		for(int i = 0; i < s.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:aload_1         
	//*  13   21:arraylength     
	//*  14   22:icmpge          83
		{
			if(((String) (s[i])).equals("get") || ((String) (s[i])).equals("m"))
	//*  15   25:aload_1         
	//*  16   26:iload_2         
	//*  17   27:aaload          
	//*  18   28:ldc1            #116 <String "get">
	//*  19   30:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  20   33:ifne            76
	//*  21   36:aload_1         
	//*  22   37:iload_2         
	//*  23   38:aaload          
	//*  24   39:ldc1            #122 <String "m">
	//*  25   41:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  26   44:ifeq            50
				continue;
	//   27   47:goto            76
			stringbuilder.append(((String) (s[i])).toLowerCase());
	//   28   50:aload_3         
	//   29   51:aload_1         
	//   30   52:iload_2         
	//   31   53:aaload          
	//   32   54:invokevirtual   #125 <Method String String.toLowerCase()>
	//   33   57:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
			if(i < s.length - 1)
	//*  35   61:iload_2         
	//*  36   62:aload_1         
	//*  37   63:arraylength     
	//*  38   64:iconst_1        
	//*  39   65:isub            
	//*  40   66:icmpge          76
				stringbuilder.append('-');
	//   41   69:aload_3         
	//   42   70:bipush          45
	//   43   72:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   44   75:pop             
		}

	//   45   76:iload_2         
	//   46   77:iconst_1        
	//   47   78:iadd            
	//   48   79:istore_2        
	//*  49   80:goto            19
		return stringbuilder.toString();
	//   50   83:aload_3         
	//   51   84:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   52   87:areturn         
	}

	private static String getIdAttribute(View view)
	{
		int i = view.getId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method int View.getId()>
	//    2    4:istore_1        
		if(i == -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ResourcesUtil.getIdStringQuietly(((Object) (view)), view.getResources(), i);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:invokevirtual   #143 <Method android.content.res.Resources View.getResources()>
	//   11   17:iload_1         
	//   12   18:invokestatic    #149 <Method String ResourcesUtil.getIdStringQuietly(Object, android.content.res.Resources, int)>
	//   13   21:areturn         
	}

	private void getIdStyle(View view, StyleAccumulator styleaccumulator)
	{
		view = ((View) (getIdAttribute(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method String getIdAttribute(View)>
	//    2    4:astore_1        
		if(view == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       21
		{
			styleaccumulator.store("id", "(none)", false);
	//    5    9:aload_2         
	//    6   10:ldc1            #22  <String "id">
	//    7   12:ldc1            #28  <String "(none)">
	//    8   14:iconst_0        
	//    9   15:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
			return;
	//   10   20:return          
		} else
		{
			styleaccumulator.store("id", ((String) (view)), false);
	//   11   21:aload_2         
	//   12   22:ldc1            #22  <String "id">
	//   13   24:aload_1         
	//   14   25:iconst_0        
	//   15   26:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
			return;
	//   16   31:return          
		}
	}

	private void getStyleFromFloat(String s, Float float1, android.view.ViewDebug.ExportedProperty exportedproperty, StyleAccumulator styleaccumulator)
	{
		styleaccumulator.store(s, String.valueOf(((Object) (float1))), isDefaultValue(float1));
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokestatic    #166 <Method String String.valueOf(Object)>
	//    4    7:aload_2         
	//    5    8:invokestatic    #170 <Method boolean isDefaultValue(Float)>
	//    6   11:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
	//    7   16:return          
	}

	private void getStyleFromInteger(String s, Integer integer, android.view.ViewDebug.ExportedProperty exportedproperty, StyleAccumulator styleaccumulator)
	{
		String s1 = IntegerFormatter.getInstance().format(integer, exportedproperty);
	//    0    0:invokestatic    #178 <Method IntegerFormatter IntegerFormatter.getInstance()>
	//    1    3:aload_2         
	//    2    4:aload_3         
	//    3    5:invokevirtual   #182 <Method String IntegerFormatter.format(Integer, android.view.ViewDebug$ExportedProperty)>
	//    4    8:astore          5
		if(canIntBeMappedToString(exportedproperty))
	//*   5   10:aload_3         
	//*   6   11:invokestatic    #184 <Method boolean canIntBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//*   7   14:ifeq            79
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #86  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #114 <Method void StringBuilder()>
	//   11   24:astore          6
			stringbuilder.append(s1);
	//   12   26:aload           6
	//   13   28:aload           5
	//   14   30:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(" (");
	//   16   34:aload           6
	//   17   36:ldc1            #186 <String " (">
	//   18   38:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(mapIntToStringUsingAnnotation(integer.intValue(), exportedproperty));
	//   20   42:aload           6
	//   21   44:aload_2         
	//   22   45:invokevirtual   #191 <Method int Integer.intValue()>
	//   23   48:aload_3         
	//   24   49:invokestatic    #195 <Method String mapIntToStringUsingAnnotation(int, android.view.ViewDebug$ExportedProperty)>
	//   25   52:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			stringbuilder.append(")");
	//   27   56:aload           6
	//   28   58:ldc1            #197 <String ")">
	//   29   60:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
			styleaccumulator.store(s, stringbuilder.toString(), false);
	//   31   64:aload           4
	//   32   66:aload_1         
	//   33   67:aload           6
	//   34   69:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   35   72:iconst_0        
	//   36   73:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
			return;
	//   37   78:return          
		}
		if(canFlagsBeMappedToString(exportedproperty))
	//*  38   79:aload_3         
	//*  39   80:invokestatic    #199 <Method boolean canFlagsBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//*  40   83:ifeq            148
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   86:new             #86  <Class StringBuilder>
	//   42   89:dup             
	//   43   90:invokespecial   #114 <Method void StringBuilder()>
	//   44   93:astore          6
			stringbuilder1.append(s1);
	//   45   95:aload           6
	//   46   97:aload           5
	//   47   99:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
			stringbuilder1.append(" (");
	//   49  103:aload           6
	//   50  105:ldc1            #186 <String " (">
	//   51  107:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   52  110:pop             
			stringbuilder1.append(mapFlagsToStringUsingAnnotation(integer.intValue(), exportedproperty));
	//   53  111:aload           6
	//   54  113:aload_2         
	//   55  114:invokevirtual   #191 <Method int Integer.intValue()>
	//   56  117:aload_3         
	//   57  118:invokestatic    #202 <Method String mapFlagsToStringUsingAnnotation(int, android.view.ViewDebug$ExportedProperty)>
	//   58  121:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:pop             
			stringbuilder1.append(")");
	//   60  125:aload           6
	//   61  127:ldc1            #197 <String ")">
	//   62  129:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   63  132:pop             
			styleaccumulator.store(s, stringbuilder1.toString(), false);
	//   64  133:aload           4
	//   65  135:aload_1         
	//   66  136:aload           6
	//   67  138:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   68  141:iconst_0        
	//   69  142:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
			return;
	//   70  147:return          
		} else
		{
			styleaccumulator.store(s, s1, isDefaultValue(integer, exportedproperty));
	//   71  148:aload           4
	//   72  150:aload_1         
	//   73  151:aload           5
	//   74  153:aload_2         
	//   75  154:aload_3         
	//   76  155:invokestatic    #205 <Method boolean isDefaultValue(Integer, android.view.ViewDebug$ExportedProperty)>
	//   77  158:invokeinterface #160 <Method void StyleAccumulator.store(String, String, boolean)>
			return;
	//   78  163:return          
		}
	}

	private void getStyleFromValue(View view, String s, Object obj, android.view.ViewDebug.ExportedProperty exportedproperty, StyleAccumulator styleaccumulator)
	{
		if(s.equals("id"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #22  <String "id">
	//*   2    3:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            17
		{
			getIdStyle(view, styleaccumulator);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload           5
	//    7   13:invokespecial   #209 <Method void getIdStyle(View, StyleAccumulator)>
			return;
	//    8   16:return          
		}
		if(obj instanceof Integer)
	//*   9   17:aload_3         
	//*  10   18:instanceof      #188 <Class Integer>
	//*  11   21:ifeq            38
		{
			getStyleFromInteger(s, (Integer)obj, exportedproperty, styleaccumulator);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:checkcast       #188 <Class Integer>
	//   16   30:aload           4
	//   17   32:aload           5
	//   18   34:invokespecial   #211 <Method void getStyleFromInteger(String, Integer, android.view.ViewDebug$ExportedProperty, StyleAccumulator)>
			return;
	//   19   37:return          
		}
		if(obj instanceof Float)
	//*  20   38:aload_3         
	//*  21   39:instanceof      #213 <Class Float>
	//*  22   42:ifeq            59
		{
			getStyleFromFloat(s, (Float)obj, exportedproperty, styleaccumulator);
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:checkcast       #213 <Class Float>
	//   27   51:aload           4
	//   28   53:aload           5
	//   29   55:invokespecial   #215 <Method void getStyleFromFloat(String, Float, android.view.ViewDebug$ExportedProperty, StyleAccumulator)>
			return;
	//   30   58:return          
		} else
		{
			getStylesFromObject(view, s, obj, exportedproperty, styleaccumulator);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:aload_2         
	//   34   62:aload_3         
	//   35   63:aload           4
	//   36   65:aload           5
	//   37   67:invokespecial   #218 <Method void getStylesFromObject(View, String, Object, android.view.ViewDebug$ExportedProperty, StyleAccumulator)>
			return;
	//   38   70:return          
		}
	}

	private void getStylesFromObject(View view, String s, Object obj, android.view.ViewDebug.ExportedProperty exportedproperty, StyleAccumulator styleaccumulator)
	{
label0:
		{
			if(exportedproperty == null || !exportedproperty.deepExport() || obj == null)
	//*   0    0:aload           4
	//*   1    2:ifnull          407
	//*   2    5:aload           4
	//*   3    7:invokeinterface #224 <Method boolean android.view.ViewDebug$ExportedProperty.deepExport()>
	//*   4   12:ifeq            407
	//*   5   15:aload_3         
	//*   6   16:ifnonnull       22
				break label0;
	//    7   19:goto            407
			Field afield[] = obj.getClass().getFields();
	//    8   22:aload_3         
	//    9   23:invokevirtual   #230 <Method Class Object.getClass()>
	//   10   26:invokevirtual   #236 <Method Field[] Class.getFields()>
	//   11   29:astore          11
			int j = afield.length;
	//   12   31:aload           11
	//   13   33:arraylength     
	//   14   34:istore          8
			int i = 0;
	//   15   36:iconst_0        
	//   16   37:istore          7
label1:
			do
			{
label2:
				{
label3:
					{
						if(i >= j)
							break label1;
	//   17   39:iload           7
	//   18   41:iload           8
	//   19   43:icmpge          406
						Field field = afield[i];
	//   20   46:aload           11
	//   21   48:iload           7
	//   22   50:aaload          
	//   23   51:astore          12
						if(Modifier.isStatic(field.getModifiers()))
	//*  24   53:aload           12
	//*  25   55:invokevirtual   #241 <Method int Field.getModifiers()>
	//*  26   58:invokestatic    #247 <Method boolean Modifier.isStatic(int)>
	//*  27   61:ifeq            67
							break label2;
	//   28   64:goto            342
						byte byte0 = 1;
	//   29   67:iconst_1        
	//   30   68:istore          6
						int k;
						String s1;
						Object obj1;
						String s2;
						StringBuilder stringbuilder;
						try
						{
							field.setAccessible(true);
	//   31   70:aload           12
	//   32   72:iconst_1        
	//   33   73:invokevirtual   #251 <Method void Field.setAccessible(boolean)>
							obj1 = field.get(obj);
	//   34   76:aload           12
	//   35   78:aload_3         
	//   36   79:invokevirtual   #254 <Method Object Field.get(Object)>
	//   37   82:astore          13
						}
	//*  38   84:aload           12
	//*  39   86:invokevirtual   #257 <Method String Field.getName()>
	//*  40   89:astore          10
	//*  41   91:aload           10
	//*  42   93:invokevirtual   #260 <Method int String.hashCode()>
	//*  43   96:istore          9
	//*  44   98:iload           9
	//*  45  100:ldc2            #261 <Int 0xdc3e2eea>
	//*  46  103:icmpeq          181
	//*  47  106:iload           9
	//*  48  108:ldc2            #262 <Int 0xe7501f63>
	//*  49  111:icmpeq          167
	//*  50  114:iload           9
	//*  51  116:ldc2            #263 <Int 0x72f7b095>
	//*  52  119:icmpeq          150
	//*  53  122:iload           9
	//*  54  124:ldc2            #264 <Int 0x7b0f7fb9>
	//*  55  127:icmpeq          133
	//*  56  130:goto            198
	//*  57  133:aload           10
	//*  58  135:ldc2            #266 <String "bottomMargin">
	//*  59  138:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  60  141:ifeq            198
	//*  61  144:iconst_0        
	//*  62  145:istore          6
	//*  63  147:goto            201
	//*  64  150:aload           10
	//*  65  152:ldc2            #268 <String "leftMargin">
	//*  66  155:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  67  158:ifeq            198
	//*  68  161:iconst_2        
	//*  69  162:istore          6
	//*  70  164:goto            201
	//*  71  167:aload           10
	//*  72  169:ldc2            #270 <String "topMargin">
	//*  73  172:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  74  175:ifeq            198
	//*  75  178:goto            201
	//*  76  181:aload           10
	//*  77  183:ldc2            #272 <String "rightMargin">
	//*  78  186:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  79  189:ifeq            198
	//*  80  192:iconst_3        
	//*  81  193:istore          6
	//*  82  195:goto            201
	//*  83  198:iconst_m1       
	//*  84  199:istore          6
	//*  85  201:iload           6
	//*  86  203:tableswitch     0 3: default 232
	//	               0 273
	//	               1 265
	//	               2 257
	//	               3 249
	//*  87  232:aload           4
	//*  88  234:invokeinterface #275 <Method String android.view.ViewDebug$ExportedProperty.prefix()>
	//*  89  239:astore          14
	//*  90  241:aload           14
	//*  91  243:ifnonnull       281
	//*  92  246:goto            313
	//*  93  249:ldc2            #277 <String "margin-right">
	//*  94  252:astore          10
	//*  95  254:goto            321
	//*  96  257:ldc2            #279 <String "margin-left">
	//*  97  260:astore          10
	//*  98  262:goto            321
	//*  99  265:ldc2            #281 <String "margin-top">
	//* 100  268:astore          10
	//* 101  270:goto            321
	//* 102  273:ldc2            #283 <String "margin-bottom">
	//* 103  276:astore          10
	//* 104  278:goto            321
	//* 105  281:new             #86  <Class StringBuilder>
	//* 106  284:dup             
	//* 107  285:invokespecial   #114 <Method void StringBuilder()>
	//* 108  288:astore          15
	//* 109  290:aload           15
	//* 110  292:aload           14
	//* 111  294:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//* 112  297:pop             
	//* 113  298:aload           15
	//* 114  300:aload           10
	//* 115  302:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//* 116  305:pop             
	//* 117  306:aload           15
	//* 118  308:invokevirtual   #102 <Method String StringBuilder.toString()>
	//* 119  311:astore          10
	//* 120  313:aload_0         
	//* 121  314:aload           10
	//* 122  316:invokespecial   #285 <Method String convertViewPropertyNameToCSSName(String)>
	//* 123  319:astore          10
	//* 124  321:aload_0         
	//* 125  322:aload_1         
	//* 126  323:aload           10
	//* 127  325:aload           13
	//* 128  327:aload           12
	//* 129  329:ldc1            #56  <Class android.view.ViewDebug$ExportedProperty>
	//* 130  331:invokevirtual   #289 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//* 131  334:checkcast       #56  <Class android.view.ViewDebug$ExportedProperty>
	//* 132  337:aload           5
	//* 133  339:invokespecial   #291 <Method void getStyleFromValue(View, String, Object, android.view.ViewDebug$ExportedProperty, StyleAccumulator)>
	//* 134  342:iload           7
	//* 135  344:iconst_1        
	//* 136  345:iadd            
	//* 137  346:istore          7
	//* 138  348:goto            39
						// Misplaced declaration of an exception variable
						catch(View view)
	//* 139  351:astore_1        
						{
							exportedproperty = ((android.view.ViewDebug.ExportedProperty) (new StringBuilder()));
	//  140  352:new             #86  <Class StringBuilder>
	//  141  355:dup             
	//  142  356:invokespecial   #114 <Method void StringBuilder()>
	//  143  359:astore          4
							((StringBuilder) (exportedproperty)).append("failed to get property of name: \"");
	//  144  361:aload           4
	//  145  363:ldc2            #293 <String "failed to get property of name: \"">
	//  146  366:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  147  369:pop             
							((StringBuilder) (exportedproperty)).append(s);
	//  148  370:aload           4
	//  149  372:aload_2         
	//  150  373:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  151  376:pop             
							((StringBuilder) (exportedproperty)).append("\" of object: ");
	//  152  377:aload           4
	//  153  379:ldc2            #295 <String "\" of object: ">
	//  154  382:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  155  385:pop             
							((StringBuilder) (exportedproperty)).append(String.valueOf(obj));
	//  156  386:aload           4
	//  157  388:aload_3         
	//  158  389:invokestatic    #166 <Method String String.valueOf(Object)>
	//  159  392:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  160  395:pop             
							LogUtil.e(((Throwable) (view)), ((StringBuilder) (exportedproperty)).toString());
	//  161  396:aload_1         
	//  162  397:aload           4
	//  163  399:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  164  402:invokestatic    #301 <Method void LogUtil.e(Throwable, String)>
							return;
	//  165  405:return          
						}
						s1 = field.getName();
						k = s1.hashCode();
						if(k != 0xdc3e2eea)
						{
							if(k != 0xe7501f63)
							{
								if(k != 0x72f7b095)
								{
									if(k == 0x7b0f7fb9 && s1.equals("bottomMargin"))
									{
										byte0 = 0;
										break label3;
									}
								} else
								if(s1.equals("leftMargin"))
								{
									byte0 = 2;
									break label3;
								}
							} else
							if(s1.equals("topMargin"))
								break label3;
						} else
						if(s1.equals("rightMargin"))
						{
							byte0 = 3;
							break label3;
						}
						byte0 = -1;
					}
					switch(byte0)
					{
					default:
						s2 = exportedproperty.prefix();
						if(s2 != null)
						{
							stringbuilder = new StringBuilder();
							stringbuilder.append(s2);
							stringbuilder.append(s1);
							s1 = stringbuilder.toString();
						}
						s1 = convertViewPropertyNameToCSSName(s1);
						break;

					case 3: // '\003'
						s1 = "margin-right";
						break;

					case 2: // '\002'
						s1 = "margin-left";
						break;

					case 1: // '\001'
						s1 = "margin-top";
						break;

					case 0: // '\0'
						s1 = "margin-bottom";
						break;
					}
					getStyleFromValue(view, s1, obj1, (android.view.ViewDebug.ExportedProperty)field.getAnnotation(android/view/ViewDebug$ExportedProperty), styleaccumulator);
				}
				i++;
			} while(true);
			return;
	//  166  406:return          
		}
	//  167  407:return          
	}

	private List getViewProperties()
	{
		if(mViewProperties != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #305 <Field List mViewProperties>
	//    2    4:ifnonnull       207
_L1:
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(mViewProperties != null) goto _L4; else goto _L3
	//    5    9:aload_0         
	//    6   10:getfield        #305 <Field List mViewProperties>
	//    7   13:ifnonnull       195
_L3:
		int j;
		ArrayList arraylist;
		Object aobj[];
		arraylist = new ArrayList();
	//    8   16:new             #307 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #308 <Method void ArrayList()>
	//   11   23:astore          4
		aobj = ((Object []) (((Class) (android/view/View)).getDeclaredMethods()));
	//   12   25:ldc1            #136 <Class View>
	//   13   27:invokevirtual   #312 <Method Method[] Class.getDeclaredMethods()>
	//   14   30:astore          5
		j = aobj.length;
	//   15   32:aload           5
	//   16   34:arraylength     
	//   17   35:istore_3        
		int i;
		boolean flag;
		flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_2        
		i = 0;
	//   20   38:iconst_0        
	//   21   39:istore_1        
_L10:
		if(i >= j) goto _L6; else goto _L5
	//   22   40:iload_1         
	//   23   41:iload_3         
	//   24   42:icmpge          100
_L5:
		Method method = aobj[i];
	//   25   45:aload           5
	//   26   47:iload_1         
	//   27   48:aaload          
	//   28   49:astore          6
		android.view.ViewDebug.ExportedProperty exportedproperty = (android.view.ViewDebug.ExportedProperty)method.getAnnotation(android/view/ViewDebug$ExportedProperty);
	//   29   51:aload           6
	//   30   53:ldc1            #56  <Class android.view.ViewDebug$ExportedProperty>
	//   31   55:invokevirtual   #315 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//   32   58:checkcast       #56  <Class android.view.ViewDebug$ExportedProperty>
	//   33   61:astore          7
		if(exportedproperty == null) goto _L8; else goto _L7
	//   34   63:aload           7
	//   35   65:ifnull          212
_L7:
		((List) (arraylist)).add(((Object) (new MethodBackedCSSProperty(method, convertViewPropertyNameToCSSName(method.getName()), exportedproperty))));
	//   36   68:aload           4
	//   37   70:new             #14  <Class ViewDescriptor$MethodBackedCSSProperty>
	//   38   73:dup             
	//   39   74:aload_0         
	//   40   75:aload           6
	//   41   77:aload_0         
	//   42   78:aload           6
	//   43   80:invokevirtual   #316 <Method String Method.getName()>
	//   44   83:invokespecial   #285 <Method String convertViewPropertyNameToCSSName(String)>
	//   45   86:aload           7
	//   46   88:invokespecial   #319 <Method void ViewDescriptor$MethodBackedCSSProperty(ViewDescriptor, Method, String, android.view.ViewDebug$ExportedProperty)>
	//   47   91:invokeinterface #324 <Method boolean List.add(Object)>
	//   48   96:pop             
		  goto _L8
	//*  49   97:goto            212
_L6:
		aobj = ((Object []) (((Class) (android/view/View)).getDeclaredFields()));
	//   50  100:ldc1            #136 <Class View>
	//   51  102:invokevirtual   #327 <Method Field[] Class.getDeclaredFields()>
	//   52  105:astore          5
		j = aobj.length;
	//   53  107:aload           5
	//   54  109:arraylength     
	//   55  110:istore_3        
		Exception exception;
		Field field;
		android.view.ViewDebug.ExportedProperty exportedproperty1;
		for(i = ((int) (flag)); i >= j; i++)
			break MISSING_BLOCK_LABEL_173;

	//   56  111:iload_2         
	//   57  112:istore_1        
	//   58  113:iload_1         
	//   59  114:iload_3         
	//   60  115:icmpge          173
	//   61  118:aload           5
	//   62  120:iload_1         
	//   63  121:aaload          
	//   64  122:astore          6
	//   65  124:aload           6
	//   66  126:ldc1            #56  <Class android.view.ViewDebug$ExportedProperty>
	//   67  128:invokevirtual   #289 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//   68  131:checkcast       #56  <Class android.view.ViewDebug$ExportedProperty>
	//   69  134:astore          7
	//   70  136:aload           7
	//   71  138:ifnull          219
	//   72  141:aload           4
	//   73  143:new             #11  <Class ViewDescriptor$FieldBackedCSSProperty>
	//   74  146:dup             
	//   75  147:aload_0         
	//   76  148:aload           6
	//   77  150:aload_0         
	//   78  151:aload           6
	//   79  153:invokevirtual   #257 <Method String Field.getName()>
	//   80  156:invokespecial   #285 <Method String convertViewPropertyNameToCSSName(String)>
	//   81  159:aload           7
	//   82  161:invokespecial   #330 <Method void ViewDescriptor$FieldBackedCSSProperty(ViewDescriptor, Field, String, android.view.ViewDebug$ExportedProperty)>
	//   83  164:invokeinterface #324 <Method boolean List.add(Object)>
	//   84  169:pop             
	//   85  170:goto            219
	//   86  173:aload           4
	//   87  175:new             #9   <Class ViewDescriptor$1>
	//   88  178:dup             
	//   89  179:aload_0         
	//   90  180:invokespecial   #333 <Method void ViewDescriptor$1(ViewDescriptor)>
	//   91  183:invokestatic    #339 <Method void Collections.sort(List, Comparator)>
	//   92  186:aload_0         
	//   93  187:aload           4
	//   94  189:invokestatic    #343 <Method List Collections.unmodifiableList(List)>
	//   95  192:putfield        #305 <Field List mViewProperties>
	//   96  195:aload_0         
	//   97  196:monitorexit     
	//   98  197:goto            207
	//   99  200:astore          4
	//  100  202:aload_0         
	//  101  203:monitorexit     
	//  102  204:aload           4
	//  103  206:athrow          
	//  104  207:aload_0         
	//  105  208:getfield        #305 <Field List mViewProperties>
	//  106  211:areturn         
	//  107  212:iload_1         
	//  108  213:iconst_1        
	//  109  214:iadd            
	//  110  215:istore_1        
	//  111  216:goto            40
	//  112  219:iload_1         
	//  113  220:iconst_1        
	//  114  221:iadd            
	//  115  222:istore_1        
		field = aobj[i];
		exportedproperty1 = (android.view.ViewDebug.ExportedProperty)field.getAnnotation(android/view/ViewDebug$ExportedProperty);
		if(exportedproperty1 == null)
			break MISSING_BLOCK_LABEL_219;
		((List) (arraylist)).add(((Object) (new FieldBackedCSSProperty(field, convertViewPropertyNameToCSSName(field.getName()), exportedproperty1))));
		break MISSING_BLOCK_LABEL_219;
		Collections.sort(((List) (arraylist)), new Comparator() {

			public int compare(ViewCSSProperty viewcssproperty, ViewCSSProperty viewcssproperty1)
			{
				return viewcssproperty.getCSSName().compareTo(viewcssproperty1.getCSSName());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #30  <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #30  <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
			//    4    8:invokevirtual   #36  <Method int String.compareTo(String)>
			//    5   11:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((ViewCSSProperty)obj, (ViewCSSProperty)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class ViewDescriptor$ViewCSSProperty>
			//    3    5:aload_2         
			//    4    6:checkcast       #26  <Class ViewDescriptor$ViewCSSProperty>
			//    5    9:invokevirtual   #39  <Method int compare(ViewDescriptor$ViewCSSProperty, ViewDescriptor$ViewCSSProperty)>
			//    6   12:ireturn         
			}

			final ViewDescriptor this$0;

			
			{
				this$0 = ViewDescriptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ViewDescriptor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
		mViewProperties = Collections.unmodifiableList(((List) (arraylist)));
_L4:
		this;
		JVM INSTR monitorexit ;
		  goto _L2
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
_L2:
		return mViewProperties;
_L8:
		i++;
		if(true) goto _L10; else goto _L9
_L9:
	//* 116  223:goto            113
	}

	private Pattern getWordBoundaryPattern()
	{
		if(mWordBoundaryPattern == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #347 <Field Pattern mWordBoundaryPattern>
	//*   2    4:ifnonnull       17
			mWordBoundaryPattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})");
	//    3    7:aload_0         
	//    4    8:ldc2            #349 <String "(?<=\\p{Lower})(?=\\p{Upper})">
	//    5   11:invokestatic    #353 <Method Pattern Pattern.compile(String)>
	//    6   14:putfield        #347 <Field Pattern mWordBoundaryPattern>
		return mWordBoundaryPattern;
	//    7   17:aload_0         
	//    8   18:getfield        #347 <Field Pattern mWordBoundaryPattern>
	//    9   21:areturn         
	}

	private static boolean isDefaultValue(Float float1)
	{
		return float1.floatValue() == 0.0F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #357 <Method float Float.floatValue()>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	private static boolean isDefaultValue(Integer integer, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		boolean flag1 = canFlagsBeMappedToString(exportedproperty);
	//    0    0:aload_1         
	//    1    1:invokestatic    #199 <Method boolean canFlagsBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(!flag1)
	//*   5    7:iload_3         
	//*   6    8:ifne            31
		{
			if(canIntBeMappedToString(exportedproperty))
	//*   7   11:aload_1         
	//*   8   12:invokestatic    #184 <Method boolean canIntBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//*   9   15:ifeq            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			if(integer.intValue() == 0)
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #191 <Method int Integer.intValue()>
	//*  14   24:ifne            29
				flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_2        
			return flag;
	//   17   29:iload_2         
	//   18   30:ireturn         
		} else
		{
			return false;
	//   19   31:iconst_0        
	//   20   32:ireturn         
		}
	}

	private static String mapFlagsToStringUsingAnnotation(int i, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		if(canFlagsBeMappedToString(exportedproperty))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #199 <Method boolean canFlagsBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//*   2    4:ifeq            158
		{
			android.view.ViewDebug.FlagToString aflagtostring[] = exportedproperty.flagMapping();
	//    3    7:aload_1         
	//    4    8:invokeinterface #60  <Method android.view.ViewDebug$FlagToString[] android.view.ViewDebug$ExportedProperty.flagMapping()>
	//    5   13:astore          9
			int k = aflagtostring.length;
	//    6   15:aload           9
	//    7   17:arraylength     
	//    8   18:istore          5
			exportedproperty = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
			int j = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
			boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
			while(j < k) 
	//*  15   26:iload_2         
	//*  16   27:iload           5
	//*  17   29:icmpge          146
			{
				android.view.ViewDebug.FlagToString flagtostring = aflagtostring[j];
	//   18   32:aload           9
	//   19   34:iload_2         
	//   20   35:aaload          
	//   21   36:astore          10
				boolean flag3 = flagtostring.outputIf();
	//   22   38:aload           10
	//   23   40:invokeinterface #362 <Method boolean android.view.ViewDebug$FlagToString.outputIf()>
	//   24   45:istore          7
				boolean flag2;
				if((flagtostring.mask() & i) == flagtostring.equals())
	//*  25   47:aload           10
	//*  26   49:invokeinterface #365 <Method int android.view.ViewDebug$FlagToString.mask()>
	//*  27   54:iload_0         
	//*  28   55:iand            
	//*  29   56:aload           10
	//*  30   58:invokeinterface #367 <Method int android.view.ViewDebug$FlagToString.equals()>
	//*  31   63:icmpne          72
					flag2 = true;
	//   32   66:iconst_1        
	//   33   67:istore          6
				else
	//*  34   69:goto            75
					flag2 = false;
	//   35   72:iconst_0        
	//   36   73:istore          6
				boolean flag1 = flag;
	//   37   75:iload_3         
	//   38   76:istore          4
				Object obj = ((Object) (exportedproperty));
	//   39   78:aload_1         
	//   40   79:astore          8
				if(flag3 == flag2)
	//*  41   81:iload           7
	//*  42   83:iload           6
	//*  43   85:icmpne          133
				{
					obj = ((Object) (exportedproperty));
	//   44   88:aload_1         
	//   45   89:astore          8
					if(exportedproperty == null)
	//*  46   91:aload_1         
	//*  47   92:ifnonnull       104
						obj = ((Object) (new StringBuilder()));
	//   48   95:new             #86  <Class StringBuilder>
	//   49   98:dup             
	//   50   99:invokespecial   #114 <Method void StringBuilder()>
	//   51  102:astore          8
					if(flag)
	//*  52  104:iload_3         
	//*  53  105:ifeq            117
						((StringBuilder) (obj)).append(" | ");
	//   54  108:aload           8
	//   55  110:ldc2            #369 <String " | ">
	//   56  113:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   57  116:pop             
					((StringBuilder) (obj)).append(flagtostring.name());
	//   58  117:aload           8
	//   59  119:aload           10
	//   60  121:invokeinterface #372 <Method String android.view.ViewDebug$FlagToString.name()>
	//   61  126:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   62  129:pop             
					flag1 = true;
	//   63  130:iconst_1        
	//   64  131:istore          4
				}
				j++;
	//   65  133:iload_2         
	//   66  134:iconst_1        
	//   67  135:iadd            
	//   68  136:istore_2        
				flag = flag1;
	//   69  137:iload           4
	//   70  139:istore_3        
				exportedproperty = ((android.view.ViewDebug.ExportedProperty) (obj));
	//   71  140:aload           8
	//   72  142:astore_1        
			}
	//*  73  143:goto            26
			if(flag)
	//*  74  146:iload_3         
	//*  75  147:ifeq            155
				return ((StringBuilder) (exportedproperty)).toString();
	//   76  150:aload_1         
	//   77  151:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   78  154:areturn         
			else
				return "<no mapping>";
	//   79  155:ldc1            #25  <String "<no mapping>">
	//   80  157:areturn         
		} else
		{
			throw new IllegalStateException("Cannot map using this annotation");
	//   81  158:new             #374 <Class IllegalStateException>
	//   82  161:dup             
	//   83  162:ldc2            #376 <String "Cannot map using this annotation">
	//   84  165:invokespecial   #377 <Method void IllegalStateException(String)>
	//   85  168:athrow          
		}
	}

	private static String mapIntToStringUsingAnnotation(int i, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		if(canIntBeMappedToString(exportedproperty))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #184 <Method boolean canIntBeMappedToString(android.view.ViewDebug$ExportedProperty)>
	//*   2    4:ifeq            58
		{
			exportedproperty = ((android.view.ViewDebug.ExportedProperty) (exportedproperty.mapping()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #66  <Method android.view.ViewDebug$IntToString[] android.view.ViewDebug$ExportedProperty.mapping()>
	//    5   13:astore_1        
			int k = exportedproperty.length;
	//    6   14:aload_1         
	//    7   15:arraylength     
	//    8   16:istore_3        
			for(int j = 0; j < k; j++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          55
			{
				android.view.ViewDebug.IntToString inttostring = ((android.view.ViewDebug.IntToString) (exportedproperty[j]));
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:astore          4
				if(inttostring.from() == i)
	//*  18   29:aload           4
	//*  19   31:invokeinterface #382 <Method int android.view.ViewDebug$IntToString.from()>
	//*  20   36:iload_0         
	//*  21   37:icmpne          48
					return inttostring.to();
	//   22   40:aload           4
	//   23   42:invokeinterface #385 <Method String android.view.ViewDebug$IntToString.to()>
	//   24   47:areturn         
			}

	//   25   48:iload_2         
	//   26   49:iconst_1        
	//   27   50:iadd            
	//   28   51:istore_2        
	//*  29   52:goto            19
			return "<no mapping>";
	//   30   55:ldc1            #25  <String "<no mapping>">
	//   31   57:areturn         
		} else
		{
			throw new IllegalStateException("Cannot map using this annotation");
	//   32   58:new             #374 <Class IllegalStateException>
	//   33   61:dup             
	//   34   62:ldc2            #376 <String "Cannot map using this annotation">
	//   35   65:invokespecial   #377 <Method void IllegalStateException(String)>
	//   36   68:athrow          
		}
	}

	public View getViewForHighlighting(Object obj)
	{
		return (View)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #136 <Class View>
	//    2    4:areturn         
	}

	protected void onGetAttributes(View view, AttributeAccumulator attributeaccumulator)
	{
		view = ((View) (getIdAttribute(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method String getIdAttribute(View)>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			attributeaccumulator.store("id", ((String) (view)));
	//    5    9:aload_2         
	//    6   10:ldc1            #22  <String "id">
	//    7   12:aload_1         
	//    8   13:invokeinterface #394 <Method void AttributeAccumulator.store(String, String)>
	//    9   18:return          
	}

	protected volatile void onGetAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
		onGetAttributes((View)obj, attributeaccumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #136 <Class View>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #397 <Method void onGetAttributes(View, AttributeAccumulator)>
	//    5    9:return          
	}

	protected String onGetNodeName(View view)
	{
		view = ((View) (((Object) (view)).getClass().getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #230 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #399 <Method String Class.getName()>
	//    3    7:astore_1        
		return StringUtil.removePrefix(((String) (view)), "android.view.", StringUtil.removePrefix(((String) (view)), "android.widget."));
	//    4    8:aload_1         
	//    5    9:ldc2            #401 <String "android.view.">
	//    6   12:aload_1         
	//    7   13:ldc2            #403 <String "android.widget.">
	//    8   16:invokestatic    #409 <Method String StringUtil.removePrefix(String, String)>
	//    9   19:invokestatic    #412 <Method String StringUtil.removePrefix(String, String, String)>
	//   10   22:areturn         
	}

	protected volatile String onGetNodeName(Object obj)
	{
		return onGetNodeName((View)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #136 <Class View>
	//    3    5:invokevirtual   #414 <Method String onGetNodeName(View)>
	//    4    8:areturn         
	}

	protected void onGetStyles(View view, StyleAccumulator styleaccumulator)
	{
		int i;
		int j;
		List list;
		list = getViewProperties();
	//    0    0:aload_0         
	//    1    1:invokespecial   #419 <Method List getViewProperties()>
	//    2    4:astore          6
		j = list.size();
	//    3    6:aload           6
	//    4    8:invokeinterface #422 <Method int List.size()>
	//    5   13:istore          4
		i = 0;
	//    6   15:iconst_0        
	//    7   16:istore_3        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//    8   17:iload_3         
	//    9   18:iload           4
	//   10   20:icmpge          133
_L1:
		ViewCSSProperty viewcssproperty = (ViewCSSProperty)list.get(i);
	//   11   23:aload           6
	//   12   25:iload_3         
	//   13   26:invokeinterface #425 <Method Object List.get(int)>
	//   14   31:checkcast       #17  <Class ViewDescriptor$ViewCSSProperty>
	//   15   34:astore          7
		getStyleFromValue(view, viewcssproperty.getCSSName(), viewcssproperty.getValue(view), viewcssproperty.getAnnotation(), styleaccumulator);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload           7
	//   19   40:invokevirtual   #428 <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
	//   20   43:aload           7
	//   21   45:aload_1         
	//   22   46:invokevirtual   #432 <Method Object ViewDescriptor$ViewCSSProperty.getValue(View)>
	//   23   49:aload           7
	//   24   51:invokevirtual   #435 <Method android.view.ViewDebug$ExportedProperty ViewDescriptor$ViewCSSProperty.getAnnotation()>
	//   25   54:aload_2         
	//   26   55:invokespecial   #291 <Method void getStyleFromValue(View, String, Object, android.view.ViewDebug$ExportedProperty, StyleAccumulator)>
		continue; /* Loop/switch isn't completed */
	//   27   58:goto            126
		Object obj;
		obj;
	//   28   61:astore          5
		break MISSING_BLOCK_LABEL_68;
	//   29   63:goto            68
		obj;
	//   30   66:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   31   68:new             #86  <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #114 <Method void StringBuilder()>
	//   34   75:astore          8
		stringbuilder.append("failed to get style property ");
	//   35   77:aload           8
	//   36   79:ldc2            #437 <String "failed to get style property ">
	//   37   82:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
		stringbuilder.append(viewcssproperty.getCSSName());
	//   39   86:aload           8
	//   40   88:aload           7
	//   41   90:invokevirtual   #428 <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
	//   42   93:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   43   96:pop             
		stringbuilder.append(" of element= ");
	//   44   97:aload           8
	//   45   99:ldc2            #439 <String " of element= ">
	//   46  102:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   47  105:pop             
		stringbuilder.append(view.toString());
	//   48  106:aload           8
	//   49  108:aload_1         
	//   50  109:invokevirtual   #440 <Method String View.toString()>
	//   51  112:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   52  115:pop             
		LogUtil.e(((Throwable) (obj)), stringbuilder.toString());
	//   53  116:aload           5
	//   54  118:aload           8
	//   55  120:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   56  123:invokestatic    #301 <Method void LogUtil.e(Throwable, String)>
		i++;
	//   57  126:iload_3         
	//   58  127:iconst_1        
	//   59  128:iadd            
	//   60  129:istore_3        
		  goto _L3
	//*  61  130:goto            17
_L2:
	//   62  133:return          
	}

	protected volatile void onGetStyles(Object obj, StyleAccumulator styleaccumulator)
	{
		onGetStyles((View)obj, styleaccumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #136 <Class View>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #443 <Method void onGetStyles(View, StyleAccumulator)>
	//    5    9:return          
	}

	protected void onSetAttributesAsText(View view, String s)
	{
		Object obj;
		Object obj1;
		for(s = ((String) (parseSetAttributesAsTextArg(s).entrySet().iterator())); ((Iterator) (s)).hasNext(); mMethodInvoker.invoke(((Object) (view)), ((String) (obj1)), ((String) (obj))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #449 <Method Map parseSetAttributesAsTextArg(String)>
	//*   2    4:invokeinterface #455 <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #461 <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #466 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            101
		{
			obj = ((Object) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//    8   24:aload_2         
	//    9   25:invokeinterface #470 <Method Object Iterator.next()>
	//   10   30:checkcast       #472 <Class java.util.Map$Entry>
	//   11   33:astore_3        
			obj1 = ((Object) (new StringBuilder()));
	//   12   34:new             #86  <Class StringBuilder>
	//   13   37:dup             
	//   14   38:invokespecial   #114 <Method void StringBuilder()>
	//   15   41:astore          4
			((StringBuilder) (obj1)).append("set");
	//   16   43:aload           4
	//   17   45:ldc2            #474 <String "set">
	//   18   48:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   51:pop             
			((StringBuilder) (obj1)).append(capitalize((String)((java.util.Map.Entry) (obj)).getKey()));
	//   20   52:aload           4
	//   21   54:aload_3         
	//   22   55:invokeinterface #477 <Method Object java.util.Map$Entry.getKey()>
	//   23   60:checkcast       #70  <Class String>
	//   24   63:invokestatic    #479 <Method String capitalize(String)>
	//   25   66:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   26   69:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   27   70:aload           4
	//   28   72:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   29   75:astore          4
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   30   77:aload_3         
	//   31   78:invokeinterface #481 <Method Object java.util.Map$Entry.getValue()>
	//   32   83:checkcast       #70  <Class String>
	//   33   86:astore_3        
		}

	//   34   87:aload_0         
	//   35   88:getfield        #52  <Field MethodInvoker mMethodInvoker>
	//   36   91:aload_1         
	//   37   92:aload           4
	//   38   94:aload_3         
	//   39   95:invokevirtual   #485 <Method void MethodInvoker.invoke(Object, String, String)>
	//*  40   98:goto            15
	//   41  101:return          
	}

	protected volatile void onSetAttributesAsText(Object obj, String s)
	{
		onSetAttributesAsText((View)obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #136 <Class View>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #488 <Method void onSetAttributesAsText(View, String)>
	//    5    9:return          
	}

	private static final String ID_NAME = "id";
	private static final String NONE_MAPPING = "<no mapping>";
	private static final String NONE_VALUE = "(none)";
	private final MethodInvoker mMethodInvoker;
	private volatile List mViewProperties;
	private Pattern mWordBoundaryPattern;
}
