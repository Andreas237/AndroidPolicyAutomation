// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.support.v4.c.a.a;
import android.support.v4.view.d;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.*;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SupportMenuInflater extends MenuInflater
{

	public SupportMenuInflater(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void MenuInflater(Context)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #47  <Field Context mContext>
		mActionViewConstructorArguments = (new Object[] {
			context
		});
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:aastore         
	//   13   19:putfield        #51  <Field Object[] mActionViewConstructorArguments>
		mActionProviderConstructorArguments = mActionViewConstructorArguments;
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:getfield        #51  <Field Object[] mActionViewConstructorArguments>
	//   17   27:putfield        #53  <Field Object[] mActionProviderConstructorArguments>
	//   18   30:return          
	}

	private Object findRealOwner(Object obj)
	{
		if(obj instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #57  <Class Activity>
	//*   2    4:ifeq            9
			return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(obj instanceof ContextWrapper)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #59  <Class ContextWrapper>
	//*   7   13:ifeq            28
			return findRealOwner(((Object) (((ContextWrapper)obj).getBaseContext())));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #59  <Class ContextWrapper>
	//   11   21:invokevirtual   #63  <Method Context ContextWrapper.getBaseContext()>
	//   12   24:invokespecial   #65  <Method Object findRealOwner(Object)>
	//   13   27:areturn         
		else
			return obj;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	private void parseMenu(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
	{
		MenuState menustate = new MenuState(menu);
	//    0    0:new             #69  <Class SupportMenuInflater$MenuState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokespecial   #72  <Method void SupportMenuInflater$MenuState(SupportMenuInflater, Menu)>
	//    5    9:astore          10
		int i = xmlpullparser.getEventType();
	//    6   11:aload_1         
	//    7   12:invokeinterface #78  <Method int XmlPullParser.getEventType()>
	//    8   17:istore          4
		do
		{
			if(i == 2)
	//*   9   19:iload           4
	//*  10   21:iconst_2        
	//*  11   22:icmpne          85
			{
				menu = ((Menu) (xmlpullparser.getName()));
	//   12   25:aload_1         
	//   13   26:invokeinterface #82  <Method String XmlPullParser.getName()>
	//   14   31:astore_3        
				if(((String) (menu)).equals("menu"))
	//*  15   32:aload_3         
	//*  16   33:ldc1            #23  <String "menu">
	//*  17   35:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  18   38:ifeq            52
				{
					i = xmlpullparser.next();
	//   19   41:aload_1         
	//   20   42:invokeinterface #91  <Method int XmlPullParser.next()>
	//   21   47:istore          4
				} else
	//*  22   49:goto            107
				{
					xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//   23   52:new             #93  <Class StringBuilder>
	//   24   55:dup             
	//   25   56:invokespecial   #95  <Method void StringBuilder()>
	//   26   59:astore_1        
					((StringBuilder) (xmlpullparser)).append("Expecting menu, got ");
	//   27   60:aload_1         
	//   28   61:ldc1            #97  <String "Expecting menu, got ">
	//   29   63:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
					((StringBuilder) (xmlpullparser)).append(((String) (menu)));
	//   31   67:aload_1         
	//   32   68:aload_3         
	//   33   69:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
					throw new RuntimeException(((StringBuilder) (xmlpullparser)).toString());
	//   35   73:new             #103 <Class RuntimeException>
	//   36   76:dup             
	//   37   77:aload_1         
	//   38   78:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   39   81:invokespecial   #109 <Method void RuntimeException(String)>
	//   40   84:athrow          
				}
				break;
			}
			int j = xmlpullparser.next();
	//   41   85:aload_1         
	//   42   86:invokeinterface #91  <Method int XmlPullParser.next()>
	//   43   91:istore          5
			i = j;
	//   44   93:iload           5
	//   45   95:istore          4
			if(j != 1)
				continue;
	//   46   97:iload           5
	//   47   99:iconst_1        
	//   48  100:icmpne          19
			i = j;
	//   49  103:iload           5
	//   50  105:istore          4
			break;
		} while(true);
		Menu menu1 = null;
	//   51  107:aconst_null     
	//   52  108:astore          9
		boolean flag1 = false;
	//   53  110:iconst_0        
	//   54  111:istore          5
		boolean flag2 = false;
	//   55  113:iconst_0        
	//   56  114:istore          6
		int k = i;
	//   57  116:iload           4
	//   58  118:istore          8
		boolean flag3;
		for(; !flag1; flag1 = flag3)
	//*  59  120:iload           5
	//*  60  122:ifne            511
		{
			boolean flag;
			switch(k)
	//*  61  125:iload           8
			{
	//*  62  127:tableswitch     1 3: default 152
	//	               1 479
	//	               2 351
	//	               3 166
			default:
				flag = flag2;
	//   63  152:iload           6
	//   64  154:istore          4
				menu = menu1;
	//   65  156:aload           9
	//   66  158:astore_3        
				flag3 = flag1;
	//   67  159:iload           5
	//   68  161:istore          7
				break;
	//   69  163:goto            489

			case 3: // '\003'
				String s = xmlpullparser.getName();
	//   70  166:aload_1         
	//   71  167:invokeinterface #82  <Method String XmlPullParser.getName()>
	//   72  172:astore          11
				if(flag2 && s.equals(((Object) (menu1))))
	//*  73  174:iload           6
	//*  74  176:ifeq            201
	//*  75  179:aload           11
	//*  76  181:aload           9
	//*  77  183:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  78  186:ifeq            201
				{
					menu = null;
	//   79  189:aconst_null     
	//   80  190:astore_3        
					flag = false;
	//   81  191:iconst_0        
	//   82  192:istore          4
					flag3 = flag1;
	//   83  194:iload           5
	//   84  196:istore          7
					break;
	//   85  198:goto            489
				}
				if(s.equals("group"))
	//*  86  201:aload           11
	//*  87  203:ldc1            #17  <String "group">
	//*  88  205:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  89  208:ifeq            230
				{
					menustate.resetGroup();
	//   90  211:aload           10
	//   91  213:invokevirtual   #112 <Method void SupportMenuInflater$MenuState.resetGroup()>
					flag = flag2;
	//   92  216:iload           6
	//   93  218:istore          4
					menu = menu1;
	//   94  220:aload           9
	//   95  222:astore_3        
					flag3 = flag1;
	//   96  223:iload           5
	//   97  225:istore          7
					break;
	//   98  227:goto            489
				}
				if(s.equals("item"))
	//*  99  230:aload           11
	//* 100  232:ldc1            #20  <String "item">
	//* 101  234:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 102  237:ifeq            317
				{
					flag = flag2;
	//  103  240:iload           6
	//  104  242:istore          4
					menu = menu1;
	//  105  244:aload           9
	//  106  246:astore_3        
					flag3 = flag1;
	//  107  247:iload           5
	//  108  249:istore          7
					if(menustate.hasAddedItem())
						break;
	//  109  251:aload           10
	//  110  253:invokevirtual   #116 <Method boolean SupportMenuInflater$MenuState.hasAddedItem()>
	//  111  256:ifne            489
					if(menustate.itemActionProvider != null && menustate.itemActionProvider.hasSubMenu())
	//* 112  259:aload           10
	//* 113  261:getfield        #120 <Field d SupportMenuInflater$MenuState.itemActionProvider>
	//* 114  264:ifnull          298
	//* 115  267:aload           10
	//* 116  269:getfield        #120 <Field d SupportMenuInflater$MenuState.itemActionProvider>
	//* 117  272:invokevirtual   #125 <Method boolean d.hasSubMenu()>
	//* 118  275:ifeq            298
					{
						menustate.addSubMenuItem();
	//  119  278:aload           10
	//  120  280:invokevirtual   #129 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  121  283:pop             
						flag = flag2;
	//  122  284:iload           6
	//  123  286:istore          4
						menu = menu1;
	//  124  288:aload           9
	//  125  290:astore_3        
						flag3 = flag1;
	//  126  291:iload           5
	//  127  293:istore          7
					} else
	//* 128  295:goto            489
					{
						menustate.addItem();
	//  129  298:aload           10
	//  130  300:invokevirtual   #132 <Method void SupportMenuInflater$MenuState.addItem()>
						flag = flag2;
	//  131  303:iload           6
	//  132  305:istore          4
						menu = menu1;
	//  133  307:aload           9
	//  134  309:astore_3        
						flag3 = flag1;
	//  135  310:iload           5
	//  136  312:istore          7
					}
					break;
	//  137  314:goto            489
				}
				flag = flag2;
	//  138  317:iload           6
	//  139  319:istore          4
				menu = menu1;
	//  140  321:aload           9
	//  141  323:astore_3        
				flag3 = flag1;
	//  142  324:iload           5
	//  143  326:istore          7
				if(s.equals("menu"))
	//* 144  328:aload           11
	//* 145  330:ldc1            #23  <String "menu">
	//* 146  332:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 147  335:ifeq            489
				{
					flag3 = true;
	//  148  338:iconst_1        
	//  149  339:istore          7
					flag = flag2;
	//  150  341:iload           6
	//  151  343:istore          4
					menu = menu1;
	//  152  345:aload           9
	//  153  347:astore_3        
				}
				break;
	//  154  348:goto            489

			case 2: // '\002'
				if(flag2)
	//* 155  351:iload           6
	//* 156  353:ifeq            370
				{
					flag = flag2;
	//  157  356:iload           6
	//  158  358:istore          4
					menu = menu1;
	//  159  360:aload           9
	//  160  362:astore_3        
					flag3 = flag1;
	//  161  363:iload           5
	//  162  365:istore          7
					break;
	//  163  367:goto            489
				}
				menu = ((Menu) (xmlpullparser.getName()));
	//  164  370:aload_1         
	//  165  371:invokeinterface #82  <Method String XmlPullParser.getName()>
	//  166  376:astore_3        
				if(((String) (menu)).equals("group"))
	//* 167  377:aload_3         
	//* 168  378:ldc1            #17  <String "group">
	//* 169  380:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 170  383:ifeq            406
				{
					menustate.readGroup(attributeset);
	//  171  386:aload           10
	//  172  388:aload_2         
	//  173  389:invokevirtual   #136 <Method void SupportMenuInflater$MenuState.readGroup(AttributeSet)>
					flag = flag2;
	//  174  392:iload           6
	//  175  394:istore          4
					menu = menu1;
	//  176  396:aload           9
	//  177  398:astore_3        
					flag3 = flag1;
	//  178  399:iload           5
	//  179  401:istore          7
					break;
	//  180  403:goto            489
				}
				if(((String) (menu)).equals("item"))
	//* 181  406:aload_3         
	//* 182  407:ldc1            #20  <String "item">
	//* 183  409:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 184  412:ifeq            435
				{
					menustate.readItem(attributeset);
	//  185  415:aload           10
	//  186  417:aload_2         
	//  187  418:invokevirtual   #139 <Method void SupportMenuInflater$MenuState.readItem(AttributeSet)>
					flag = flag2;
	//  188  421:iload           6
	//  189  423:istore          4
					menu = menu1;
	//  190  425:aload           9
	//  191  427:astore_3        
					flag3 = flag1;
	//  192  428:iload           5
	//  193  430:istore          7
					break;
	//  194  432:goto            489
				}
				if(((String) (menu)).equals("menu"))
	//* 195  435:aload_3         
	//* 196  436:ldc1            #23  <String "menu">
	//* 197  438:invokevirtual   #88  <Method boolean String.equals(Object)>
	//* 198  441:ifeq            469
				{
					parseMenu(xmlpullparser, attributeset, ((Menu) (menustate.addSubMenuItem())));
	//  199  444:aload_0         
	//  200  445:aload_1         
	//  201  446:aload_2         
	//  202  447:aload           10
	//  203  449:invokevirtual   #129 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  204  452:invokespecial   #141 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
					flag = flag2;
	//  205  455:iload           6
	//  206  457:istore          4
					menu = menu1;
	//  207  459:aload           9
	//  208  461:astore_3        
					flag3 = flag1;
	//  209  462:iload           5
	//  210  464:istore          7
				} else
	//* 211  466:goto            489
				{
					flag = true;
	//  212  469:iconst_1        
	//  213  470:istore          4
					flag3 = flag1;
	//  214  472:iload           5
	//  215  474:istore          7
				}
				break;

	//* 216  476:goto            489
			case 1: // '\001'
				throw new RuntimeException("Unexpected end of document");
	//  217  479:new             #103 <Class RuntimeException>
	//  218  482:dup             
	//  219  483:ldc1            #143 <String "Unexpected end of document">
	//  220  485:invokespecial   #109 <Method void RuntimeException(String)>
	//  221  488:athrow          
			}
			k = xmlpullparser.next();
	//  222  489:aload_1         
	//  223  490:invokeinterface #91  <Method int XmlPullParser.next()>
	//  224  495:istore          8
			flag2 = flag;
	//  225  497:iload           4
	//  226  499:istore          6
			menu1 = menu;
	//  227  501:aload_3         
	//  228  502:astore          9
		}

	//  229  504:iload           7
	//  230  506:istore          5
	//* 231  508:goto            120
	//  232  511:return          
	}

	Object getRealOwner()
	{
		if(mRealOwner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field Object mRealOwner>
	//*   2    4:ifnonnull       19
			mRealOwner = findRealOwner(((Object) (mContext)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field Context mContext>
	//    7   13:invokespecial   #65  <Method Object findRealOwner(Object)>
	//    8   16:putfield        #147 <Field Object mRealOwner>
		return mRealOwner;
	//    9   19:aload_0         
	//   10   20:getfield        #147 <Field Object mRealOwner>
	//   11   23:areturn         
	}

	public void inflate(int i, Menu menu)
	{
		XmlResourceParser xmlresourceparser;
		XmlResourceParser xmlresourceparser1;
		XmlResourceParser xmlresourceparser2;
		if(!(menu instanceof a))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #155 <Class a>
	//*   2    4:ifne            14
		{
			super.inflate(i, menu);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #157 <Method void MenuInflater.inflate(int, Menu)>
			return;
	//    7   13:return          
		}
		xmlresourceparser1 = null;
	//    8   14:aconst_null     
	//    9   15:astore          4
		xmlresourceparser2 = null;
	//   10   17:aconst_null     
	//   11   18:astore          5
		xmlresourceparser = null;
	//   12   20:aconst_null     
	//   13   21:astore_3        
		XmlResourceParser xmlresourceparser3 = mContext.getResources().getLayout(i);
	//   14   22:aload_0         
	//   15   23:getfield        #47  <Field Context mContext>
	//   16   26:invokevirtual   #161 <Method Resources Context.getResources()>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #167 <Method XmlResourceParser Resources.getLayout(int)>
	//   19   33:astore          6
		xmlresourceparser = xmlresourceparser3;
	//   20   35:aload           6
	//   21   37:astore_3        
		xmlresourceparser1 = xmlresourceparser3;
	//   22   38:aload           6
	//   23   40:astore          4
		xmlresourceparser2 = xmlresourceparser3;
	//   24   42:aload           6
	//   25   44:astore          5
		parseMenu(((XmlPullParser) (xmlresourceparser3)), Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser3))), menu);
	//   26   46:aload_0         
	//   27   47:aload           6
	//   28   49:aload           6
	//   29   51:invokestatic    #173 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   30   54:aload_2         
	//   31   55:invokespecial   #141 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
		if(xmlresourceparser3 != null)
	//*  32   58:aload           6
	//*  33   60:ifnull          70
			xmlresourceparser3.close();
	//   34   63:aload           6
	//   35   65:invokeinterface #178 <Method void XmlResourceParser.close()>
		return;
	//   36   70:return          
		menu;
	//   37   71:astore_2        
		break MISSING_BLOCK_LABEL_105;
	//   38   72:goto            105
		menu;
	//   39   75:astore_2        
		xmlresourceparser = xmlresourceparser1;
	//   40   76:aload           4
	//   41   78:astore_3        
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
	//   42   79:new             #180 <Class InflateException>
	//   43   82:dup             
	//   44   83:ldc1            #182 <String "Error inflating menu XML">
	//   45   85:aload_2         
	//   46   86:invokespecial   #185 <Method void InflateException(String, Throwable)>
	//   47   89:athrow          
		menu;
	//   48   90:astore_2        
		xmlresourceparser = xmlresourceparser2;
	//   49   91:aload           5
	//   50   93:astore_3        
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
	//   51   94:new             #180 <Class InflateException>
	//   52   97:dup             
	//   53   98:ldc1            #182 <String "Error inflating menu XML">
	//   54  100:aload_2         
	//   55  101:invokespecial   #185 <Method void InflateException(String, Throwable)>
	//   56  104:athrow          
		if(xmlresourceparser != null)
	//*  57  105:aload_3         
	//*  58  106:ifnull          115
			xmlresourceparser.close();
	//   59  109:aload_3         
	//   60  110:invokeinterface #178 <Method void XmlResourceParser.close()>
		throw menu;
	//   61  115:aload_2         
	//   62  116:athrow          
	}

	static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[] = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
	static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[] = {
		android/content/Context
	};
	static final String LOG_TAG = "SupportMenuInflater";
	static final int NO_ID = 0;
	private static final String XML_GROUP = "group";
	private static final String XML_ITEM = "item";
	private static final String XML_MENU = "menu";
	final Object mActionProviderConstructorArguments[];
	final Object mActionViewConstructorArguments[];
	Context mContext;
	private Object mRealOwner;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #36  <Class Context>
	//    5    8:aastore         
	//    6    9:putstatic       #38  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//    7   12:getstatic       #38  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//    8   15:putstatic       #40  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
	//*   9   18:return          
	}

	private class MenuState
	{

		private char getShortcut(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return '\0';
		//    2    4:iconst_0        
		//    3    5:ireturn         
			else
				return s.charAt(0);
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:invokevirtual   #81  <Method char String.charAt(int)>
		//    7   11:ireturn         
		}

		private Object newInstance(String s, Class aclass[], Object aobj[])
		{
			try
			{
				aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass)));
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field SupportMenuInflater this$0>
		//    2    4:getfield        #91  <Field Context SupportMenuInflater.mContext>
		//    3    7:invokevirtual   #97  <Method ClassLoader Context.getClassLoader()>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #103 <Method Class ClassLoader.loadClass(String)>
		//    6   14:aload_2         
		//    7   15:invokevirtual   #109 <Method Constructor Class.getConstructor(Class[])>
		//    8   18:astore_2        
				((Constructor) (aclass)).setAccessible(true);
		//    9   19:aload_2         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #115 <Method void Constructor.setAccessible(boolean)>
				aclass = ((Class []) (((Constructor) (aclass)).newInstance(aobj)));
		//   12   24:aload_2         
		//   13   25:aload_3         
		//   14   26:invokevirtual   #118 <Method Object Constructor.newInstance(Object[])>
		//   15   29:astore_2        
			}
		//*  16   30:aload_2         
		//*  17   31:areturn         
			// Misplaced declaration of an exception variable
			catch(Class aclass[])
		//*  18   32:astore_2        
			{
				aobj = ((Object []) (new StringBuilder()));
		//   19   33:new             #120 <Class StringBuilder>
		//   20   36:dup             
		//   21   37:invokespecial   #121 <Method void StringBuilder()>
		//   22   40:astore_3        
				((StringBuilder) (aobj)).append("Cannot instantiate class: ");
		//   23   41:aload_3         
		//   24   42:ldc1            #123 <String "Cannot instantiate class: ">
		//   25   44:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
		//   26   47:pop             
				((StringBuilder) (aobj)).append(s);
		//   27   48:aload_3         
		//   28   49:aload_1         
		//   29   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
		//   30   53:pop             
				Log.w("SupportMenuInflater", ((StringBuilder) (aobj)).toString(), ((Throwable) (aclass)));
		//   31   54:ldc1            #129 <String "SupportMenuInflater">
		//   32   56:aload_3         
		//   33   57:invokevirtual   #133 <Method String StringBuilder.toString()>
		//   34   60:aload_2         
		//   35   61:invokestatic    #139 <Method int Log.w(String, String, Throwable)>
		//   36   64:pop             
				return ((Object) (null));
		//   37   65:aconst_null     
		//   38   66:areturn         
			}
			return ((Object) (aclass));
		}

		private void setItem(MenuItem menuitem)
		{
			Object obj = ((Object) (menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #143 <Field boolean itemChecked>
		//    3    5:invokeinterface #149 <Method MenuItem MenuItem.setChecked(boolean)>
		//    4   10:aload_0         
		//    5   11:getfield        #151 <Field boolean itemVisible>
		//    6   14:invokeinterface #154 <Method MenuItem MenuItem.setVisible(boolean)>
		//    7   19:aload_0         
		//    8   20:getfield        #156 <Field boolean itemEnabled>
		//    9   23:invokeinterface #159 <Method MenuItem MenuItem.setEnabled(boolean)>
		//   10   28:astore          5
			int i = itemCheckable;
		//   11   30:aload_0         
		//   12   31:getfield        #161 <Field int itemCheckable>
		//   13   34:istore_3        
			boolean flag = false;
		//   14   35:iconst_0        
		//   15   36:istore_2        
			boolean flag1;
			if(i >= 1)
		//*  16   37:iload_3         
		//*  17   38:iconst_1        
		//*  18   39:icmplt          48
				flag1 = true;
		//   19   42:iconst_1        
		//   20   43:istore          4
			else
		//*  21   45:goto            51
				flag1 = false;
		//   22   48:iconst_0        
		//   23   49:istore          4
			((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId);
		//   24   51:aload           5
		//   25   53:iload           4
		//   26   55:invokeinterface #164 <Method MenuItem MenuItem.setCheckable(boolean)>
		//   27   60:aload_0         
		//   28   61:getfield        #166 <Field CharSequence itemTitleCondensed>
		//   29   64:invokeinterface #170 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
		//   30   69:aload_0         
		//   31   70:getfield        #172 <Field int itemIconResId>
		//   32   73:invokeinterface #176 <Method MenuItem MenuItem.setIcon(int)>
		//   33   78:pop             
			i = itemShowAsAction;
		//   34   79:aload_0         
		//   35   80:getfield        #178 <Field int itemShowAsAction>
		//   36   83:istore_3        
			if(i >= 0)
		//*  37   84:iload_3         
		//*  38   85:iflt            95
				menuitem.setShowAsAction(i);
		//   39   88:aload_1         
		//   40   89:iload_3         
		//   41   90:invokeinterface #182 <Method void MenuItem.setShowAsAction(int)>
			if(itemListenerMethodName != null)
		//*  42   95:aload_0         
		//*  43   96:getfield        #184 <Field String itemListenerMethodName>
		//*  44   99:ifnull          153
				if(!mContext.isRestricted())
		//*  45  102:aload_0         
		//*  46  103:getfield        #60  <Field SupportMenuInflater this$0>
		//*  47  106:getfield        #91  <Field Context SupportMenuInflater.mContext>
		//*  48  109:invokevirtual   #188 <Method boolean Context.isRestricted()>
		//*  49  112:ifne            143
					menuitem.setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (new InflatedOnMenuItemClickListener(getRealOwner(), itemListenerMethodName))));
		//   50  115:aload_1         
		//   51  116:new             #190 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
		//   52  119:dup             
		//   53  120:aload_0         
		//   54  121:getfield        #60  <Field SupportMenuInflater this$0>
		//   55  124:invokevirtual   #194 <Method Object SupportMenuInflater.getRealOwner()>
		//   56  127:aload_0         
		//   57  128:getfield        #184 <Field String itemListenerMethodName>
		//   58  131:invokespecial   #197 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
		//   59  134:invokeinterface #201 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
		//   60  139:pop             
				else
		//*  61  140:goto            153
					throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
		//   62  143:new             #203 <Class IllegalStateException>
		//   63  146:dup             
		//   64  147:ldc1            #205 <String "The android:onClick attribute cannot be used within a restricted context">
		//   65  149:invokespecial   #208 <Method void IllegalStateException(String)>
		//   66  152:athrow          
			flag1 = menuitem instanceof MenuItemImpl;
		//   67  153:aload_1         
		//   68  154:instanceof      #210 <Class MenuItemImpl>
		//   69  157:istore          4
			if(flag1)
		//*  70  159:iload           4
		//*  71  161:ifeq            170
				obj = ((Object) ((MenuItemImpl)menuitem));
		//   72  164:aload_1         
		//   73  165:checkcast       #210 <Class MenuItemImpl>
		//   74  168:astore          5
			if(itemCheckable >= 2)
		//*  75  170:aload_0         
		//*  76  171:getfield        #161 <Field int itemCheckable>
		//*  77  174:iconst_2        
		//*  78  175:icmplt          209
				if(flag1)
		//*  79  178:iload           4
		//*  80  180:ifeq            194
					((MenuItemImpl)menuitem).setExclusiveCheckable(true);
		//   81  183:aload_1         
		//   82  184:checkcast       #210 <Class MenuItemImpl>
		//   83  187:iconst_1        
		//   84  188:invokevirtual   #213 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				else
		//*  85  191:goto            209
				if(menuitem instanceof MenuItemWrapperICS)
		//*  86  194:aload_1         
		//*  87  195:instanceof      #215 <Class MenuItemWrapperICS>
		//*  88  198:ifeq            209
					((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
		//   89  201:aload_1         
		//   90  202:checkcast       #215 <Class MenuItemWrapperICS>
		//   91  205:iconst_1        
		//   92  206:invokevirtual   #216 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
			obj = ((Object) (itemActionViewClassName));
		//   93  209:aload_0         
		//   94  210:getfield        #218 <Field String itemActionViewClassName>
		//   95  213:astore          5
			if(obj != null)
		//*  96  215:aload           5
		//*  97  217:ifnull          248
			{
				menuitem.setActionView((View)newInstance(((String) (obj)), SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
		//   98  220:aload_1         
		//   99  221:aload_0         
		//  100  222:aload           5
		//  101  224:getstatic       #222 <Field Class[] SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
		//  102  227:aload_0         
		//  103  228:getfield        #60  <Field SupportMenuInflater this$0>
		//  104  231:getfield        #226 <Field Object[] SupportMenuInflater.mActionViewConstructorArguments>
		//  105  234:invokespecial   #228 <Method Object newInstance(String, Class[], Object[])>
		//  106  237:checkcast       #230 <Class View>
		//  107  240:invokeinterface #234 <Method MenuItem MenuItem.setActionView(View)>
		//  108  245:pop             
				flag = true;
		//  109  246:iconst_1        
		//  110  247:istore_2        
			}
			i = itemActionViewLayout;
		//  111  248:aload_0         
		//  112  249:getfield        #236 <Field int itemActionViewLayout>
		//  113  252:istore_3        
			if(i > 0)
		//* 114  253:iload_3         
		//* 115  254:ifle            280
				if(!flag)
		//* 116  257:iload_2         
		//* 117  258:ifne            272
					menuitem.setActionView(i);
		//  118  261:aload_1         
		//  119  262:iload_3         
		//  120  263:invokeinterface #238 <Method MenuItem MenuItem.setActionView(int)>
		//  121  268:pop             
				else
		//* 122  269:goto            280
					Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
		//  123  272:ldc1            #129 <String "SupportMenuInflater">
		//  124  274:ldc1            #240 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
		//  125  276:invokestatic    #243 <Method int Log.w(String, String)>
		//  126  279:pop             
			obj = ((Object) (itemActionProvider));
		//  127  280:aload_0         
		//  128  281:getfield        #245 <Field d itemActionProvider>
		//  129  284:astore          5
			if(obj != null)
		//* 130  286:aload           5
		//* 131  288:ifnull          298
				q.a(menuitem, ((d) (obj)));
		//  132  291:aload_1         
		//  133  292:aload           5
		//  134  294:invokestatic    #251 <Method MenuItem q.a(MenuItem, d)>
		//  135  297:pop             
			q.a(menuitem, itemContentDescription);
		//  136  298:aload_1         
		//  137  299:aload_0         
		//  138  300:getfield        #253 <Field CharSequence itemContentDescription>
		//  139  303:invokestatic    #256 <Method void q.a(MenuItem, CharSequence)>
			q.b(menuitem, itemTooltipText);
		//  140  306:aload_1         
		//  141  307:aload_0         
		//  142  308:getfield        #258 <Field CharSequence itemTooltipText>
		//  143  311:invokestatic    #261 <Method void q.b(MenuItem, CharSequence)>
			q.b(menuitem, itemAlphabeticShortcut, itemAlphabeticModifiers);
		//  144  314:aload_1         
		//  145  315:aload_0         
		//  146  316:getfield        #263 <Field char itemAlphabeticShortcut>
		//  147  319:aload_0         
		//  148  320:getfield        #265 <Field int itemAlphabeticModifiers>
		//  149  323:invokestatic    #268 <Method void q.b(MenuItem, char, int)>
			q.a(menuitem, itemNumericShortcut, itemNumericModifiers);
		//  150  326:aload_1         
		//  151  327:aload_0         
		//  152  328:getfield        #270 <Field char itemNumericShortcut>
		//  153  331:aload_0         
		//  154  332:getfield        #272 <Field int itemNumericModifiers>
		//  155  335:invokestatic    #274 <Method void q.a(MenuItem, char, int)>
			obj = ((Object) (itemIconTintMode));
		//  156  338:aload_0         
		//  157  339:getfield        #67  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
		//  158  342:astore          5
			if(obj != null)
		//* 159  344:aload           5
		//* 160  346:ifnull          355
				q.a(menuitem, ((android.graphics.PorterDuff.Mode) (obj)));
		//  161  349:aload_1         
		//  162  350:aload           5
		//  163  352:invokestatic    #277 <Method void q.a(MenuItem, android.graphics.PorterDuff$Mode)>
			obj = ((Object) (itemIconTintList));
		//  164  355:aload_0         
		//  165  356:getfield        #65  <Field ColorStateList itemIconTintList>
		//  166  359:astore          5
			if(obj != null)
		//* 167  361:aload           5
		//* 168  363:ifnull          372
				q.a(menuitem, ((ColorStateList) (obj)));
		//  169  366:aload_1         
		//  170  367:aload           5
		//  171  369:invokestatic    #280 <Method void q.a(MenuItem, ColorStateList)>
		//  172  372:return          
		}

		public void addItem()
		{
			itemAdded = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #283 <Field boolean itemAdded>
			setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #69  <Field Menu menu>
		//    6   10:aload_0         
		//    7   11:getfield        #285 <Field int groupId>
		//    8   14:aload_0         
		//    9   15:getfield        #287 <Field int itemId>
		//   10   18:aload_0         
		//   11   19:getfield        #289 <Field int itemCategoryOrder>
		//   12   22:aload_0         
		//   13   23:getfield        #291 <Field CharSequence itemTitle>
		//   14   26:invokeinterface #297 <Method MenuItem Menu.add(int, int, int, CharSequence)>
		//   15   31:invokespecial   #299 <Method void setItem(MenuItem)>
		//   16   34:return          
		}

		public SubMenu addSubMenuItem()
		{
			itemAdded = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #283 <Field boolean itemAdded>
			SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
		//    3    5:aload_0         
		//    4    6:getfield        #69  <Field Menu menu>
		//    5    9:aload_0         
		//    6   10:getfield        #285 <Field int groupId>
		//    7   13:aload_0         
		//    8   14:getfield        #287 <Field int itemId>
		//    9   17:aload_0         
		//   10   18:getfield        #289 <Field int itemCategoryOrder>
		//   11   21:aload_0         
		//   12   22:getfield        #291 <Field CharSequence itemTitle>
		//   13   25:invokeinterface #305 <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
		//   14   30:astore_1        
			setItem(submenu.getItem());
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:invokeinterface #311 <Method MenuItem SubMenu.getItem()>
		//   18   38:invokespecial   #299 <Method void setItem(MenuItem)>
			return submenu;
		//   19   41:aload_1         
		//   20   42:areturn         
		}

		public boolean hasAddedItem()
		{
			return itemAdded;
		//    0    0:aload_0         
		//    1    1:getfield        #283 <Field boolean itemAdded>
		//    2    4:ireturn         
		}

		public void readGroup(AttributeSet attributeset)
		{
			attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuGroup)));
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field SupportMenuInflater this$0>
		//    2    4:getfield        #91  <Field Context SupportMenuInflater.mContext>
		//    3    7:aload_1         
		//    4    8:getstatic       #320 <Field int[] android.support.v7.appcompat.R$styleable.MenuGroup>
		//    5   11:invokevirtual   #324 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    6   14:astore_1        
			groupId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuGroup_android_id, 0);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:getstatic       #327 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_id>
		//   10   20:iconst_0        
		//   11   21:invokevirtual   #333 <Method int TypedArray.getResourceId(int, int)>
		//   12   24:putfield        #285 <Field int groupId>
			groupCategory = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_menuCategory, 0);
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:getstatic       #336 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_menuCategory>
		//   16   32:iconst_0        
		//   17   33:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
		//   18   36:putfield        #341 <Field int groupCategory>
			groupOrder = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_orderInCategory, 0);
		//   19   39:aload_0         
		//   20   40:aload_1         
		//   21   41:getstatic       #344 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_orderInCategory>
		//   22   44:iconst_0        
		//   23   45:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
		//   24   48:putfield        #346 <Field int groupOrder>
			groupCheckable = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_checkableBehavior, 0);
		//   25   51:aload_0         
		//   26   52:aload_1         
		//   27   53:getstatic       #349 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_checkableBehavior>
		//   28   56:iconst_0        
		//   29   57:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
		//   30   60:putfield        #351 <Field int groupCheckable>
			groupVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_visible, true);
		//   31   63:aload_0         
		//   32   64:aload_1         
		//   33   65:getstatic       #354 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_visible>
		//   34   68:iconst_1        
		//   35   69:invokevirtual   #358 <Method boolean TypedArray.getBoolean(int, boolean)>
		//   36   72:putfield        #360 <Field boolean groupVisible>
			groupEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_enabled, true);
		//   37   75:aload_0         
		//   38   76:aload_1         
		//   39   77:getstatic       #363 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_enabled>
		//   40   80:iconst_1        
		//   41   81:invokevirtual   #358 <Method boolean TypedArray.getBoolean(int, boolean)>
		//   42   84:putfield        #365 <Field boolean groupEnabled>
			((TypedArray) (attributeset)).recycle();
		//   43   87:aload_1         
		//   44   88:invokevirtual   #368 <Method void TypedArray.recycle()>
		//   45   91:return          
		}

		public void readItem(AttributeSet attributeset)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #371 <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc2            #373 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    7:invokespecial   #376 <Method void Runtime(String)>
		//    4   10:athrow          
		}

		public void resetGroup()
		{
			groupId = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #285 <Field int groupId>
			groupCategory = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #341 <Field int groupCategory>
			groupOrder = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #346 <Field int groupOrder>
			groupCheckable = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #351 <Field int groupCheckable>
			groupVisible = true;
		//   12   20:aload_0         
		//   13   21:iconst_1        
		//   14   22:putfield        #360 <Field boolean groupVisible>
			groupEnabled = true;
		//   15   25:aload_0         
		//   16   26:iconst_1        
		//   17   27:putfield        #365 <Field boolean groupEnabled>
		//   18   30:return          
		}

		private static final int defaultGroupId = 0;
		private static final int defaultItemCategory = 0;
		private static final int defaultItemCheckable = 0;
		private static final boolean defaultItemChecked = false;
		private static final boolean defaultItemEnabled = true;
		private static final int defaultItemId = 0;
		private static final int defaultItemOrder = 0;
		private static final boolean defaultItemVisible = true;
		private int groupCategory;
		private int groupCheckable;
		private boolean groupEnabled;
		private int groupId;
		private int groupOrder;
		private boolean groupVisible;
		d itemActionProvider;
		private String itemActionProviderClassName;
		private String itemActionViewClassName;
		private int itemActionViewLayout;
		private boolean itemAdded;
		private int itemAlphabeticModifiers;
		private char itemAlphabeticShortcut;
		private int itemCategoryOrder;
		private int itemCheckable;
		private boolean itemChecked;
		private CharSequence itemContentDescription;
		private boolean itemEnabled;
		private int itemIconResId;
		private ColorStateList itemIconTintList;
		private android.graphics.PorterDuff.Mode itemIconTintMode;
		private int itemId;
		private String itemListenerMethodName;
		private int itemNumericModifiers;
		private char itemNumericShortcut;
		private int itemShowAsAction;
		private CharSequence itemTitle;
		private CharSequence itemTitleCondensed;
		private CharSequence itemTooltipText;
		private boolean itemVisible;
		private Menu menu;
		final SupportMenuInflater this$0;

		public MenuState(Menu menu1)
		{
			this$0 = SupportMenuInflater.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #60  <Field SupportMenuInflater this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #63  <Method void Object()>
			itemIconTintList = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #65  <Field ColorStateList itemIconTintList>
			itemIconTintMode = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #67  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
			menu = menu1;
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:putfield        #69  <Field Menu menu>
			resetGroup();
		//   14   24:aload_0         
		//   15   25:invokevirtual   #72  <Method void resetGroup()>
		//   16   28:return          
		}

		private class InflatedOnMenuItemClickListener
			implements android.view.MenuItem.OnMenuItemClickListener
		{

			public boolean onMenuItemClick(MenuItem menuitem)
			{
				try
				{
					if(mMethod.getReturnType() == Boolean.TYPE)
			//*   0    0:aload_0         
			//*   1    1:getfield        #39  <Field Method mMethod>
			//*   2    4:invokevirtual   #73  <Method Class Method.getReturnType()>
			//*   3    7:getstatic       #79  <Field Class Boolean.TYPE>
			//*   4   10:if_acmpne       39
						return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
							menuitem
						})).booleanValue();
			//    5   13:aload_0         
			//    6   14:getfield        #39  <Field Method mMethod>
			//    7   17:aload_0         
			//    8   18:getfield        #29  <Field Object mRealOwner>
			//    9   21:iconst_1        
			//   10   22:anewarray       Object[]
			//   11   25:dup             
			//   12   26:iconst_0        
			//   13   27:aload_1         
			//   14   28:aastore         
			//   15   29:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
			//   16   32:checkcast       #75  <Class Boolean>
			//   17   35:invokevirtual   #87  <Method boolean Boolean.booleanValue()>
			//   18   38:ireturn         
					mMethod.invoke(mRealOwner, new Object[] {
						menuitem
					});
			//   19   39:aload_0         
			//   20   40:getfield        #39  <Field Method mMethod>
			//   21   43:aload_0         
			//   22   44:getfield        #29  <Field Object mRealOwner>
			//   23   47:iconst_1        
			//   24   48:anewarray       Object[]
			//   25   51:dup             
			//   26   52:iconst_0        
			//   27   53:aload_1         
			//   28   54:aastore         
			//   29   55:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
			//   30   58:pop             
				}
			//*  31   59:iconst_1        
			//*  32   60:ireturn         
				// Misplaced declaration of an exception variable
				catch(MenuItem menuitem)
			//*  33   61:astore_1        
				{
					throw new RuntimeException(((Throwable) (menuitem)));
			//   34   62:new             #89  <Class RuntimeException>
			//   35   65:dup             
			//   36   66:aload_1         
			//   37   67:invokespecial   #92  <Method void RuntimeException(Throwable)>
			//   38   70:athrow          
				}
				return true;
			}

			private static final Class PARAM_TYPES[] = {
				android/view/MenuItem
			};
			private Method mMethod;
			private Object mRealOwner;

			static 
			{
			//    0    0:iconst_1        
			//    1    1:anewarray       Class[]
			//    2    4:dup             
			//    3    5:iconst_0        
			//    4    6:ldc1            #18  <Class MenuItem>
			//    5    8:aastore         
			//    6    9:putstatic       #20  <Field Class[] PARAM_TYPES>
			//*   7   12:return          
			}

			public InflatedOnMenuItemClickListener(Object obj, String s)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #27  <Method void Object()>
				mRealOwner = obj;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #29  <Field Object mRealOwner>
				Class class1 = obj.getClass();
			//    5    9:aload_1         
			//    6   10:invokevirtual   #33  <Method Class Object.getClass()>
			//    7   13:astore_3        
				try
				{
					mMethod = class1.getMethod(s, PARAM_TYPES);
			//    8   14:aload_0         
			//    9   15:aload_3         
			//   10   16:aload_2         
			//   11   17:getstatic       #20  <Field Class[] PARAM_TYPES>
			//   12   20:invokevirtual   #37  <Method Method Class.getMethod(String, Class[])>
			//   13   23:putfield        #39  <Field Method mMethod>
					return;
			//   14   26:return          
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
			//*  15   27:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   16   28:new             #41  <Class StringBuilder>
			//   17   31:dup             
			//   18   32:invokespecial   #42  <Method void StringBuilder()>
			//   19   35:astore          4
					stringbuilder.append("Couldn't resolve menu item onClick handler ");
			//   20   37:aload           4
			//   21   39:ldc1            #44  <String "Couldn't resolve menu item onClick handler ">
			//   22   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   23   44:pop             
					stringbuilder.append(s);
			//   24   45:aload           4
			//   25   47:aload_2         
			//   26   48:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   27   51:pop             
					stringbuilder.append(" in class ");
			//   28   52:aload           4
			//   29   54:ldc1            #50  <String " in class ">
			//   30   56:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   31   59:pop             
					stringbuilder.append(class1.getName());
			//   32   60:aload           4
			//   33   62:aload_3         
			//   34   63:invokevirtual   #54  <Method String Class.getName()>
			//   35   66:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   36   69:pop             
					s = ((String) (new InflateException(stringbuilder.toString())));
			//   37   70:new             #56  <Class InflateException>
			//   38   73:dup             
			//   39   74:aload           4
			//   40   76:invokevirtual   #59  <Method String StringBuilder.toString()>
			//   41   79:invokespecial   #62  <Method void InflateException(String)>
			//   42   82:astore_2        
					((InflateException) (s)).initCause(((Throwable) (obj)));
			//   43   83:aload_2         
			//   44   84:aload_1         
			//   45   85:invokevirtual   #66  <Method Throwable InflateException.initCause(Throwable)>
			//   46   88:pop             
					throw s;
			//   47   89:aload_2         
			//   48   90:athrow          
				}
			}
		}

	}

}
