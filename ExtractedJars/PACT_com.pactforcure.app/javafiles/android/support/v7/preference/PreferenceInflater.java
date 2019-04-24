// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.preference:
//			Preference, PreferenceGroup, PreferenceManager

class PreferenceInflater
{

	public PreferenceInflater(Context context, PreferenceManager preferencemanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:putfield        #50  <Field Object[] mConstructorArgs>
		mContext = context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #52  <Field Context mContext>
		init(preferencemanager);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #56  <Method void init(PreferenceManager)>
	//   12   22:return          
	}

	private Preference createItem(String s, String as[], AttributeSet attributeset)
		throws ClassNotFoundException, InflateException
	{
		Object obj;
		Constructor constructor;
		constructor = (Constructor)CONSTRUCTOR_MAP.get(((Object) (s)));
	//    0    0:getstatic       #45  <Field HashMap CONSTRUCTOR_MAP>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #70  <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #72  <Class Constructor>
	//    4   10:astore          7
		obj = ((Object) (constructor));
	//    5   12:aload           7
	//    6   14:astore          6
		if(constructor != null) goto _L2; else goto _L1
	//    7   16:aload           7
	//    8   18:ifnonnull       74
_L1:
		ClassLoader classloader = mContext.getClassLoader();
	//    9   21:aload_0         
	//   10   22:getfield        #52  <Field Context mContext>
	//   11   25:invokevirtual   #76  <Method ClassLoader Context.getClassLoader()>
	//   12   28:astore          9
		Object obj1 = null;
	//   13   30:aconst_null     
	//   14   31:astore          8
		if(as == null) goto _L4; else goto _L3
	//   15   33:aload_2         
	//   16   34:ifnull          42
_L3:
		if(as.length != 0) goto _L5; else goto _L4
	//   17   37:aload_2         
	//   18   38:arraylength     
	//   19   39:ifne            93
_L4:
		as = ((String []) (classloader.loadClass(s)));
	//   20   42:aload           9
	//   21   44:aload_1         
	//   22   45:invokevirtual   #82  <Method Class ClassLoader.loadClass(String)>
	//   23   48:astore_2        
_L7:
		obj = ((Object) (((Class) (as)).getConstructor(CONSTRUCTOR_SIGNATURE)));
	//   24   49:aload_2         
	//   25   50:getstatic       #38  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   26   53:invokevirtual   #86  <Method Constructor Class.getConstructor(Class[])>
	//   27   56:astore          6
		((Constructor) (obj)).setAccessible(true);
	//   28   58:aload           6
	//   29   60:iconst_1        
	//   30   61:invokevirtual   #90  <Method void Constructor.setAccessible(boolean)>
		CONSTRUCTOR_MAP.put(((Object) (s)), obj);
	//   31   64:getstatic       #45  <Field HashMap CONSTRUCTOR_MAP>
	//   32   67:aload_1         
	//   33   68:aload           6
	//   34   70:invokevirtual   #94  <Method Object HashMap.put(Object, Object)>
	//   35   73:pop             
_L2:
		as = ((String []) (mConstructorArgs));
	//   36   74:aload_0         
	//   37   75:getfield        #50  <Field Object[] mConstructorArgs>
	//   38   78:astore_2        
		as[1] = ((String) (attributeset));
	//   39   79:aload_2         
	//   40   80:iconst_1        
	//   41   81:aload_3         
	//   42   82:aastore         
		int i;
		int j;
		ClassNotFoundException classnotfoundexception;
		try
		{
			return (Preference)((Constructor) (obj)).newInstance(((Object []) (as)));
	//   43   83:aload           6
	//   44   85:aload_2         
	//   45   86:invokevirtual   #98  <Method Object Constructor.newInstance(Object[])>
	//   46   89:checkcast       #100 <Class Preference>
	//   47   92:areturn         
		}
	//*  48   93:aconst_null     
	//*  49   94:astore          7
	//*  50   96:aload_2         
	//*  51   97:arraylength     
	//*  52   98:istore          5
	//*  53  100:iconst_0        
	//*  54  101:istore          4
	//*  55  103:aload           8
	//*  56  105:astore          6
	//*  57  107:iload           4
	//*  58  109:iload           5
	//*  59  111:icmpge          146
	//*  60  114:aload_2         
	//*  61  115:iload           4
	//*  62  117:aaload          
	//*  63  118:astore          6
	//*  64  120:aload           9
	//*  65  122:new             #102 <Class StringBuilder>
	//*  66  125:dup             
	//*  67  126:invokespecial   #103 <Method void StringBuilder()>
	//*  68  129:aload           6
	//*  69  131:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  70  134:aload_1         
	//*  71  135:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  72  138:invokevirtual   #111 <Method String StringBuilder.toString()>
	//*  73  141:invokevirtual   #82  <Method Class ClassLoader.loadClass(String)>
	//*  74  144:astore          6
	//*  75  146:aload           6
	//*  76  148:astore_2        
	//*  77  149:aload           6
	//*  78  151:ifnonnull       49
	//*  79  154:aload           7
	//*  80  156:ifnonnull       209
	//*  81  159:new             #62  <Class InflateException>
	//*  82  162:dup             
	//*  83  163:new             #102 <Class StringBuilder>
	//*  84  166:dup             
	//*  85  167:invokespecial   #103 <Method void StringBuilder()>
	//*  86  170:aload_3         
	//*  87  171:invokeinterface #114 <Method String AttributeSet.getPositionDescription()>
	//*  88  176:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  89  179:ldc1            #116 <String ": Error inflating class ">
	//*  90  181:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  91  184:aload_1         
	//*  92  185:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  93  188:invokevirtual   #111 <Method String StringBuilder.toString()>
	//*  94  191:invokespecial   #119 <Method void InflateException(String)>
	//*  95  194:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  96  195:astore_1        
		{
			throw s;
	//   97  196:aload_1         
	//   98  197:athrow          
		}
	//*  99  198:astore          7
	//* 100  200:iload           4
	//* 101  202:iconst_1        
	//* 102  203:iadd            
	//* 103  204:istore          4
	//* 104  206:goto            103
	//* 105  209:aload           7
	//* 106  211:athrow          
		// Misplaced declaration of an exception variable
		catch(String as[])
	//* 107  212:astore_2        
		{
			s = ((String) (new InflateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error inflating class ").append(s).toString())));
	//  108  213:new             #62  <Class InflateException>
	//  109  216:dup             
	//  110  217:new             #102 <Class StringBuilder>
	//  111  220:dup             
	//  112  221:invokespecial   #103 <Method void StringBuilder()>
	//  113  224:aload_3         
	//  114  225:invokeinterface #114 <Method String AttributeSet.getPositionDescription()>
	//  115  230:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  116  233:ldc1            #116 <String ": Error inflating class ">
	//  117  235:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  118  238:aload_1         
	//  119  239:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  120  242:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  121  245:invokespecial   #119 <Method void InflateException(String)>
	//  122  248:astore_1        
		}
		break MISSING_BLOCK_LABEL_249;
_L5:
		classnotfoundexception = null;
		j = as.length;
		i = 0;
_L8:
		obj = ((Object) (obj1));
		if(i >= j)
			break MISSING_BLOCK_LABEL_146;
		obj = ((Object) (as[i]));
		obj = ((Object) (classloader.loadClass((new StringBuilder()).append(((String) (obj))).append(s).toString())));
		as = ((String []) (obj));
		if(obj != null) goto _L7; else goto _L6
_L6:
		if(classnotfoundexception != null)
			break MISSING_BLOCK_LABEL_209;
		throw new InflateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error inflating class ").append(s).toString());
		classnotfoundexception;
		i++;
		  goto _L8
		throw classnotfoundexception;
		((InflateException) (s)).initCause(((Throwable) (as)));
	//  123  249:aload_1         
	//  124  250:aload_2         
	//  125  251:invokevirtual   #123 <Method Throwable InflateException.initCause(Throwable)>
	//  126  254:pop             
		throw s;
	//  127  255:aload_1         
	//  128  256:athrow          
	}

	private Preference createItemFromTag(String s, AttributeSet attributeset)
	{
		Preference preference;
		try
		{
			if(-1 == s.indexOf('.'))
	//*   0    0:iconst_m1       
	//*   1    1:aload_1         
	//*   2    2:bipush          46
	//*   3    4:invokevirtual   #133 <Method int String.indexOf(int)>
	//*   4    7:icmpne          17
				return onCreateItem(s, attributeset);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #136 <Method Preference onCreateItem(String, AttributeSet)>
	//    9   16:areturn         
			preference = createItem(s, ((String []) (null)), attributeset);
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:aconst_null     
	//   13   20:aload_2         
	//   14   21:invokespecial   #138 <Method Preference createItem(String, String[], AttributeSet)>
	//   15   24:astore_3        
		}
	//*  16   25:aload_3         
	//*  17   26:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   27:astore_1        
		{
			throw s;
	//   19   28:aload_1         
	//   20   29:athrow          
		}
		catch(ClassNotFoundException classnotfoundexception)
	//*  21   30:astore_3        
		{
			s = ((String) (new InflateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error inflating class (not found)").append(s).toString())));
	//   22   31:new             #62  <Class InflateException>
	//   23   34:dup             
	//   24   35:new             #102 <Class StringBuilder>
	//   25   38:dup             
	//   26   39:invokespecial   #103 <Method void StringBuilder()>
	//   27   42:aload_2         
	//   28   43:invokeinterface #114 <Method String AttributeSet.getPositionDescription()>
	//   29   48:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   30   51:ldc1            #140 <String ": Error inflating class (not found)">
	//   31   53:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   32   56:aload_1         
	//   33   57:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   34   60:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   35   63:invokespecial   #119 <Method void InflateException(String)>
	//   36   66:astore_1        
			((InflateException) (s)).initCause(((Throwable) (classnotfoundexception)));
	//   37   67:aload_1         
	//   38   68:aload_3         
	//   39   69:invokevirtual   #123 <Method Throwable InflateException.initCause(Throwable)>
	//   40   72:pop             
			throw s;
	//   41   73:aload_1         
	//   42   74:athrow          
		}
		catch(Exception exception)
	//*  43   75:astore_3        
		{
			s = ((String) (new InflateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error inflating class ").append(s).toString())));
	//   44   76:new             #62  <Class InflateException>
	//   45   79:dup             
	//   46   80:new             #102 <Class StringBuilder>
	//   47   83:dup             
	//   48   84:invokespecial   #103 <Method void StringBuilder()>
	//   49   87:aload_2         
	//   50   88:invokeinterface #114 <Method String AttributeSet.getPositionDescription()>
	//   51   93:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   52   96:ldc1            #116 <String ": Error inflating class ">
	//   53   98:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   54  101:aload_1         
	//   55  102:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   56  105:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   57  108:invokespecial   #119 <Method void InflateException(String)>
	//   58  111:astore_1        
			((InflateException) (s)).initCause(((Throwable) (exception)));
	//   59  112:aload_1         
	//   60  113:aload_3         
	//   61  114:invokevirtual   #123 <Method Throwable InflateException.initCause(Throwable)>
	//   62  117:pop             
			throw s;
	//   63  118:aload_1         
	//   64  119:athrow          
		}
		return preference;
	}

	private void init(PreferenceManager preferencemanager)
	{
		mPreferenceManager = preferencemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field PreferenceManager mPreferenceManager>
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   3    5:getstatic       #148 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          14
	//*   5   10:icmplt          32
		{
			setDefaultPackages(new String[] {
				"android.support.v14.preference.", "android.support.v7.preference."
			});
	//    6   13:aload_0         
	//    7   14:iconst_2        
	//    8   15:anewarray       String[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:ldc1            #150 <String "android.support.v14.preference.">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:ldc1            #152 <String "android.support.v7.preference.">
	//   16   27:aastore         
	//   17   28:invokevirtual   #156 <Method void setDefaultPackages(String[])>
			return;
	//   18   31:return          
		} else
		{
			setDefaultPackages(new String[] {
				"android.support.v7.preference."
			});
	//   19   32:aload_0         
	//   20   33:iconst_1        
	//   21   34:anewarray       String[]
	//   22   37:dup             
	//   23   38:iconst_0        
	//   24   39:ldc1            #152 <String "android.support.v7.preference.">
	//   25   41:aastore         
	//   26   42:invokevirtual   #156 <Method void setDefaultPackages(String[])>
			return;
	//   27   45:return          
		}
	}

	private PreferenceGroup onMergeRoots(PreferenceGroup preferencegroup, PreferenceGroup preferencegroup1)
	{
		if(preferencegroup == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			preferencegroup1.onAttachedToHierarchy(mPreferenceManager);
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field PreferenceManager mPreferenceManager>
	//    5    9:invokevirtual   #163 <Method void PreferenceGroup.onAttachedToHierarchy(PreferenceManager)>
			return preferencegroup1;
	//    6   12:aload_2         
	//    7   13:areturn         
		} else
		{
			return preferencegroup;
	//    8   14:aload_1         
	//    9   15:areturn         
		}
	}

	private void rInflate(XmlPullParser xmlpullparser, Preference preference, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #176 <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
		do
		{
			int j = xmlpullparser.next();
	//    3    8:aload_1         
	//    4    9:invokeinterface #179 <Method int XmlPullParser.next()>
	//    5   14:istore          5
			if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
				break;
	//    6   16:iload           5
	//    7   18:iconst_3        
	//    8   19:icmpne          33
	//    9   22:aload_1         
	//   10   23:invokeinterface #176 <Method int XmlPullParser.getDepth()>
	//   11   28:iload           4
	//   12   30:icmple          187
	//   13   33:iload           5
	//   14   35:iconst_1        
	//   15   36:icmpeq          187
			if(j == 2)
	//*  16   39:iload           5
	//*  17   41:iconst_2        
	//*  18   42:icmpne          8
			{
				Object obj = ((Object) (xmlpullparser.getName()));
	//   19   45:aload_1         
	//   20   46:invokeinterface #182 <Method String XmlPullParser.getName()>
	//   21   51:astore          6
				if("intent".equals(obj))
	//*  22   53:ldc1            #17  <String "intent">
	//*  23   55:aload           6
	//*  24   57:invokevirtual   #186 <Method boolean String.equals(Object)>
	//*  25   60:ifeq            105
				{
					try
					{
						obj = ((Object) (Intent.parseIntent(getContext().getResources(), xmlpullparser, attributeset)));
	//   26   63:aload_0         
	//   27   64:invokevirtual   #190 <Method Context getContext()>
	//   28   67:invokevirtual   #194 <Method Resources Context.getResources()>
	//   29   70:aload_1         
	//   30   71:aload_3         
	//   31   72:invokestatic    #200 <Method Intent Intent.parseIntent(Resources, XmlPullParser, AttributeSet)>
	//   32   75:astore          6
					}
	//*  33   77:aload_2         
	//*  34   78:aload           6
	//*  35   80:invokevirtual   #204 <Method void Preference.setIntent(Intent)>
	//*  36   83:goto            8
					// Misplaced declaration of an exception variable
					catch(XmlPullParser xmlpullparser)
	//*  37   86:astore_1        
					{
						preference = ((Preference) (new XmlPullParserException("Error parsing preference")));
	//   38   87:new             #168 <Class XmlPullParserException>
	//   39   90:dup             
	//   40   91:ldc1            #206 <String "Error parsing preference">
	//   41   93:invokespecial   #207 <Method void XmlPullParserException(String)>
	//   42   96:astore_2        
						((XmlPullParserException) (preference)).initCause(((Throwable) (xmlpullparser)));
	//   43   97:aload_2         
	//   44   98:aload_1         
	//   45   99:invokevirtual   #208 <Method Throwable XmlPullParserException.initCause(Throwable)>
	//   46  102:pop             
						throw preference;
	//   47  103:aload_2         
	//   48  104:athrow          
					}
					preference.setIntent(((Intent) (obj)));
				} else
				if("extra".equals(obj))
	//*  49  105:ldc1            #14  <String "extra">
	//*  50  107:aload           6
	//*  51  109:invokevirtual   #186 <Method boolean String.equals(Object)>
	//*  52  112:ifeq            158
				{
					getContext().getResources().parseBundleExtra("extra", attributeset, preference.getExtras());
	//   53  115:aload_0         
	//   54  116:invokevirtual   #190 <Method Context getContext()>
	//   55  119:invokevirtual   #194 <Method Resources Context.getResources()>
	//   56  122:ldc1            #14  <String "extra">
	//   57  124:aload_3         
	//   58  125:aload_2         
	//   59  126:invokevirtual   #212 <Method android.os.Bundle Preference.getExtras()>
	//   60  129:invokevirtual   #218 <Method void Resources.parseBundleExtra(String, AttributeSet, android.os.Bundle)>
					try
					{
						skipCurrentTag(xmlpullparser);
	//   61  132:aload_1         
	//   62  133:invokestatic    #222 <Method void skipCurrentTag(XmlPullParser)>
					}
	//*  63  136:goto            8
					// Misplaced declaration of an exception variable
					catch(XmlPullParser xmlpullparser)
	//*  64  139:astore_1        
					{
						preference = ((Preference) (new XmlPullParserException("Error parsing preference")));
	//   65  140:new             #168 <Class XmlPullParserException>
	//   66  143:dup             
	//   67  144:ldc1            #206 <String "Error parsing preference">
	//   68  146:invokespecial   #207 <Method void XmlPullParserException(String)>
	//   69  149:astore_2        
						((XmlPullParserException) (preference)).initCause(((Throwable) (xmlpullparser)));
	//   70  150:aload_2         
	//   71  151:aload_1         
	//   72  152:invokevirtual   #208 <Method Throwable XmlPullParserException.initCause(Throwable)>
	//   73  155:pop             
						throw preference;
	//   74  156:aload_2         
	//   75  157:athrow          
					}
				} else
				{
					obj = ((Object) (createItemFromTag(((String) (obj)), attributeset)));
	//   76  158:aload_0         
	//   77  159:aload           6
	//   78  161:aload_3         
	//   79  162:invokespecial   #224 <Method Preference createItemFromTag(String, AttributeSet)>
	//   80  165:astore          6
					((PreferenceGroup)preference).addItemFromInflater(((Preference) (obj)));
	//   81  167:aload_2         
	//   82  168:checkcast       #160 <Class PreferenceGroup>
	//   83  171:aload           6
	//   84  173:invokevirtual   #228 <Method void PreferenceGroup.addItemFromInflater(Preference)>
					rInflate(xmlpullparser, ((Preference) (obj)), attributeset);
	//   85  176:aload_0         
	//   86  177:aload_1         
	//   87  178:aload           6
	//   88  180:aload_3         
	//   89  181:invokespecial   #230 <Method void rInflate(XmlPullParser, Preference, AttributeSet)>
				}
			}
		} while(true);
	//   90  184:goto            8
	//   91  187:return          
	}

	private static void skipCurrentTag(XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_0         
	//    1    1:invokeinterface #176 <Method int XmlPullParser.getDepth()>
	//    2    6:istore_1        
		int j;
		do
			j = xmlpullparser.next();
	//    3    7:aload_0         
	//    4    8:invokeinterface #179 <Method int XmlPullParser.next()>
	//    5   13:istore_2        
		while(j != 1 && (j != 3 || xmlpullparser.getDepth() > i));
	//    6   14:iload_2         
	//    7   15:iconst_1        
	//    8   16:icmpeq          34
	//    9   19:iload_2         
	//   10   20:iconst_3        
	//   11   21:icmpne          7
	//   12   24:aload_0         
	//   13   25:invokeinterface #176 <Method int XmlPullParser.getDepth()>
	//   14   30:iload_1         
	//   15   31:icmpgt          7
	//   16   34:return          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Context mContext>
	//    2    4:areturn         
	}

	public String[] getDefaultPackages()
	{
		return mDefaultPackages;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field String[] mDefaultPackages>
	//    2    4:areturn         
	}

	public Preference inflate(int i, PreferenceGroup preferencegroup)
	{
		XmlResourceParser xmlresourceparser = getContext().getResources().getXml(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method Context getContext()>
	//    2    4:invokevirtual   #194 <Method Resources Context.getResources()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #240 <Method XmlResourceParser Resources.getXml(int)>
	//    5   11:astore_3        
		preferencegroup = ((PreferenceGroup) (inflate(((XmlPullParser) (xmlresourceparser)), preferencegroup)));
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #243 <Method Preference inflate(XmlPullParser, PreferenceGroup)>
	//   10   18:astore_2        
		xmlresourceparser.close();
	//   11   19:aload_3         
	//   12   20:invokeinterface #248 <Method void XmlResourceParser.close()>
		return ((Preference) (preferencegroup));
	//   13   25:aload_2         
	//   14   26:areturn         
		preferencegroup;
	//   15   27:astore_2        
		xmlresourceparser.close();
	//   16   28:aload_3         
	//   17   29:invokeinterface #248 <Method void XmlResourceParser.close()>
		throw preferencegroup;
	//   18   34:aload_2         
	//   19   35:athrow          
	}

	public Preference inflate(XmlPullParser xmlpullparser, PreferenceGroup preferencegroup)
	{
		Object aobj[] = mConstructorArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Object[] mConstructorArgs>
	//    2    4:astore          4
		aobj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		AttributeSet attributeset;
		attributeset = Xml.asAttributeSet(xmlpullparser);
	//    5    9:aload_1         
	//    6   10:invokestatic    #254 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    7   13:astore          5
		mConstructorArgs[0] = ((Object) (mContext));
	//    8   15:aload_0         
	//    9   16:getfield        #50  <Field Object[] mConstructorArgs>
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:getfield        #52  <Field Context mContext>
	//   13   24:aastore         
		int i;
		do
			i = xmlpullparser.next();
	//   14   25:aload_1         
	//   15   26:invokeinterface #179 <Method int XmlPullParser.next()>
	//   16   31:istore_3        
		while(i != 2 && i != 1);
	//   17   32:iload_3         
	//   18   33:iconst_2        
	//   19   34:icmpeq          42
	//   20   37:iload_3         
	//   21   38:iconst_1        
	//   22   39:icmpne          25
		if(i == 2)
			break MISSING_BLOCK_LABEL_89;
	//   23   42:iload_3         
	//   24   43:iconst_2        
	//   25   44:icmpeq          89
		throw new InflateException((new StringBuilder()).append(xmlpullparser.getPositionDescription()).append(": No start tag found!").toString());
	//   26   47:new             #62  <Class InflateException>
	//   27   50:dup             
	//   28   51:new             #102 <Class StringBuilder>
	//   29   54:dup             
	//   30   55:invokespecial   #103 <Method void StringBuilder()>
	//   31   58:aload_1         
	//   32   59:invokeinterface #255 <Method String XmlPullParser.getPositionDescription()>
	//   33   64:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:ldc2            #257 <String ": No start tag found!">
	//   35   70:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   37   76:invokespecial   #119 <Method void InflateException(String)>
	//   38   79:athrow          
		xmlpullparser;
	//   39   80:astore_1        
		throw xmlpullparser;
	//   40   81:aload_1         
	//   41   82:athrow          
		xmlpullparser;
	//   42   83:astore_1        
		aobj;
	//   43   84:aload           4
		JVM INSTR monitorexit ;
	//   44   86:monitorexit     
		throw xmlpullparser;
	//   45   87:aload_1         
	//   46   88:athrow          
		preferencegroup = onMergeRoots(preferencegroup, (PreferenceGroup)createItemFromTag(xmlpullparser.getName(), attributeset));
	//   47   89:aload_0         
	//   48   90:aload_2         
	//   49   91:aload_0         
	//   50   92:aload_1         
	//   51   93:invokeinterface #182 <Method String XmlPullParser.getName()>
	//   52   98:aload           5
	//   53  100:invokespecial   #224 <Method Preference createItemFromTag(String, AttributeSet)>
	//   54  103:checkcast       #160 <Class PreferenceGroup>
	//   55  106:invokespecial   #259 <Method PreferenceGroup onMergeRoots(PreferenceGroup, PreferenceGroup)>
	//   56  109:astore_2        
		rInflate(xmlpullparser, ((Preference) (preferencegroup)), attributeset);
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:aload_2         
	//   60  113:aload           5
	//   61  115:invokespecial   #230 <Method void rInflate(XmlPullParser, Preference, AttributeSet)>
		aobj;
	//   62  118:aload           4
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		return ((Preference) (preferencegroup));
	//   64  121:aload_2         
	//   65  122:areturn         
		xmlpullparser;
	//   66  123:astore_1        
		preferencegroup = ((PreferenceGroup) (new InflateException(((XmlPullParserException) (xmlpullparser)).getMessage())));
	//   67  124:new             #62  <Class InflateException>
	//   68  127:dup             
	//   69  128:aload_1         
	//   70  129:invokevirtual   #262 <Method String XmlPullParserException.getMessage()>
	//   71  132:invokespecial   #119 <Method void InflateException(String)>
	//   72  135:astore_2        
		((InflateException) (preferencegroup)).initCause(((Throwable) (xmlpullparser)));
	//   73  136:aload_2         
	//   74  137:aload_1         
	//   75  138:invokevirtual   #123 <Method Throwable InflateException.initCause(Throwable)>
	//   76  141:pop             
		throw preferencegroup;
	//   77  142:aload_2         
	//   78  143:athrow          
		preferencegroup;
	//   79  144:astore_2        
		xmlpullparser = ((XmlPullParser) (new InflateException((new StringBuilder()).append(xmlpullparser.getPositionDescription()).append(": ").append(((IOException) (preferencegroup)).getMessage()).toString())));
	//   80  145:new             #62  <Class InflateException>
	//   81  148:dup             
	//   82  149:new             #102 <Class StringBuilder>
	//   83  152:dup             
	//   84  153:invokespecial   #103 <Method void StringBuilder()>
	//   85  156:aload_1         
	//   86  157:invokeinterface #255 <Method String XmlPullParser.getPositionDescription()>
	//   87  162:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   88  165:ldc2            #264 <String ": ">
	//   89  168:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   90  171:aload_2         
	//   91  172:invokevirtual   #265 <Method String IOException.getMessage()>
	//   92  175:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   93  178:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   94  181:invokespecial   #119 <Method void InflateException(String)>
	//   95  184:astore_1        
		((InflateException) (xmlpullparser)).initCause(((Throwable) (preferencegroup)));
	//   96  185:aload_1         
	//   97  186:aload_2         
	//   98  187:invokevirtual   #123 <Method Throwable InflateException.initCause(Throwable)>
	//   99  190:pop             
		throw xmlpullparser;
	//  100  191:aload_1         
	//  101  192:athrow          
	}

	protected Preference onCreateItem(String s, AttributeSet attributeset)
		throws ClassNotFoundException
	{
		return createItem(s, mDefaultPackages, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #234 <Field String[] mDefaultPackages>
	//    4    6:aload_2         
	//    5    7:invokespecial   #138 <Method Preference createItem(String, String[], AttributeSet)>
	//    6   10:areturn         
	}

	public void setDefaultPackages(String as[])
	{
		mDefaultPackages = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #234 <Field String[] mDefaultPackages>
	//    3    5:return          
	}

	private static final HashMap CONSTRUCTOR_MAP = new HashMap();
	private static final Class CONSTRUCTOR_SIGNATURE[] = {
		android/content/Context, android/util/AttributeSet
	};
	private static final String EXTRA_TAG_NAME = "extra";
	private static final String INTENT_TAG_NAME = "intent";
	private static final String TAG = "PreferenceInflater";
	private final Object mConstructorArgs[] = new Object[2];
	private final Context mContext;
	private String mDefaultPackages[];
	private PreferenceManager mPreferenceManager;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #34  <Class Context>
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #36  <Class AttributeSet>
	//    9   13:aastore         
	//   10   14:putstatic       #38  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   11   17:new             #40  <Class HashMap>
	//   12   20:dup             
	//   13   21:invokespecial   #43  <Method void HashMap()>
	//   14   24:putstatic       #45  <Field HashMap CONSTRUCTOR_MAP>
	//*  15   27:return          
	}
}
