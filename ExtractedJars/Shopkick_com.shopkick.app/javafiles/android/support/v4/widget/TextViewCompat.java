// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.support.v4.text.PrecomputedTextCompat;
import android.support.v4.util.Preconditions;
import android.text.*;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.*;
import android.widget.TextView;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package android.support.v4.widget:
//			AutoSizeableTextView

public final class TextViewCompat
{
	public static interface AutoSizeTextType
		extends Annotation
	{
	}

	private static class OreoCallback
		implements android.view.ActionMode.Callback
	{

		private Intent createProcessTextIntent()
		{
			return (new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
		//    0    0:new             #42  <Class Intent>
		//    1    3:dup             
		//    2    4:invokespecial   #43  <Method void Intent()>
		//    3    7:ldc1            #45  <String "android.intent.action.PROCESS_TEXT">
		//    4    9:invokevirtual   #49  <Method Intent Intent.setAction(String)>
		//    5   12:ldc1            #51  <String "text/plain">
		//    6   14:invokevirtual   #54  <Method Intent Intent.setType(String)>
		//    7   17:areturn         
		}

		private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveinfo, TextView textview)
		{
			return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", isEditable(textview) ^ true).setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
		//    0    0:aload_0         
		//    1    1:invokespecial   #58  <Method Intent createProcessTextIntent()>
		//    2    4:ldc1            #60  <String "android.intent.extra.PROCESS_TEXT_READONLY">
		//    3    6:aload_0         
		//    4    7:aload_2         
		//    5    8:invokespecial   #64  <Method boolean isEditable(TextView)>
		//    6   11:iconst_1        
		//    7   12:ixor            
		//    8   13:invokevirtual   #68  <Method Intent Intent.putExtra(String, boolean)>
		//    9   16:aload_1         
		//   10   17:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//   11   20:getfield        #80  <Field String ActivityInfo.packageName>
		//   12   23:aload_1         
		//   13   24:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//   14   27:getfield        #83  <Field String ActivityInfo.name>
		//   15   30:invokevirtual   #87  <Method Intent Intent.setClassName(String, String)>
		//   16   33:areturn         
		}

		private List getSupportedActivities(Context context, PackageManager packagemanager)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #91  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #92  <Method void ArrayList()>
		//    3    7:astore_3        
			if(!(context instanceof Activity))
		//*   4    8:aload_1         
		//*   5    9:instanceof      #94  <Class Activity>
		//*   6   12:ifne            17
				return ((List) (arraylist));
		//    7   15:aload_3         
		//    8   16:areturn         
			packagemanager = ((PackageManager) (packagemanager.queryIntentActivities(createProcessTextIntent(), 0).iterator()));
		//    9   17:aload_2         
		//   10   18:aload_0         
		//   11   19:invokespecial   #58  <Method Intent createProcessTextIntent()>
		//   12   22:iconst_0        
		//   13   23:invokevirtual   #100 <Method List PackageManager.queryIntentActivities(Intent, int)>
		//   14   26:invokeinterface #106 <Method Iterator List.iterator()>
		//   15   31:astore_2        
			do
			{
				if(!((Iterator) (packagemanager)).hasNext())
					break;
		//   16   32:aload_2         
		//   17   33:invokeinterface #112 <Method boolean Iterator.hasNext()>
		//   18   38:ifeq            74
				ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (packagemanager)).next();
		//   19   41:aload_2         
		//   20   42:invokeinterface #116 <Method Object Iterator.next()>
		//   21   47:checkcast       #70  <Class ResolveInfo>
		//   22   50:astore          4
				if(isSupportedActivity(resolveinfo, context))
		//*  23   52:aload_0         
		//*  24   53:aload           4
		//*  25   55:aload_1         
		//*  26   56:invokespecial   #120 <Method boolean isSupportedActivity(ResolveInfo, Context)>
		//*  27   59:ifeq            32
					((List) (arraylist)).add(((Object) (resolveinfo)));
		//   28   62:aload_3         
		//   29   63:aload           4
		//   30   65:invokeinterface #124 <Method boolean List.add(Object)>
		//   31   70:pop             
			} while(true);
		//   32   71:goto            32
			return ((List) (arraylist));
		//   33   74:aload_3         
		//   34   75:areturn         
		}

		private boolean isEditable(TextView textview)
		{
			return (textview instanceof Editable) && textview.onCheckIsTextEditor() && textview.isEnabled();
		//    0    0:aload_1         
		//    1    1:instanceof      #128 <Class Editable>
		//    2    4:ifeq            23
		//    3    7:aload_1         
		//    4    8:invokevirtual   #133 <Method boolean TextView.onCheckIsTextEditor()>
		//    5   11:ifeq            23
		//    6   14:aload_1         
		//    7   15:invokevirtual   #136 <Method boolean TextView.isEnabled()>
		//    8   18:ifeq            23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		private boolean isSupportedActivity(ResolveInfo resolveinfo, Context context)
		{
			boolean flag1 = context.getPackageName().equals(((Object) (resolveinfo.activityInfo.packageName)));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #142 <Method String Context.getPackageName()>
		//    2    4:aload_1         
		//    3    5:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//    4    8:getfield        #80  <Field String ActivityInfo.packageName>
		//    5   11:invokevirtual   #147 <Method boolean String.equals(Object)>
		//    6   14:istore          4
			boolean flag = true;
		//    7   16:iconst_1        
		//    8   17:istore_3        
			if(flag1)
		//*   9   18:iload           4
		//*  10   20:ifeq            25
				return true;
		//   11   23:iconst_1        
		//   12   24:ireturn         
			if(!resolveinfo.activityInfo.exported)
		//*  13   25:aload_1         
		//*  14   26:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//*  15   29:getfield        #150 <Field boolean ActivityInfo.exported>
		//*  16   32:ifne            37
				return false;
		//   17   35:iconst_0        
		//   18   36:ireturn         
			if(resolveinfo.activityInfo.permission != null)
		//*  19   37:aload_1         
		//*  20   38:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//*  21   41:getfield        #153 <Field String ActivityInfo.permission>
		//*  22   44:ifnull          65
			{
				if(context.checkSelfPermission(resolveinfo.activityInfo.permission) == 0)
		//*  23   47:aload_2         
		//*  24   48:aload_1         
		//*  25   49:getfield        #74  <Field ActivityInfo ResolveInfo.activityInfo>
		//*  26   52:getfield        #153 <Field String ActivityInfo.permission>
		//*  27   55:invokevirtual   #157 <Method int Context.checkSelfPermission(String)>
		//*  28   58:ifne            63
					return true;
		//   29   61:iconst_1        
		//   30   62:ireturn         
				flag = false;
		//   31   63:iconst_0        
		//   32   64:istore_3        
			}
			return flag;
		//   33   65:iload_3         
		//   34   66:ireturn         
		}

		private void recomputeProcessTextMenuItems(Menu menu)
		{
			PackageManager packagemanager;
			Object obj2;
			obj2 = ((Object) (mTextView.getContext()));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field TextView mTextView>
		//    2    4:invokevirtual   #171 <Method Context TextView.getContext()>
		//    3    7:astore          5
			packagemanager = ((Context) (obj2)).getPackageManager();
		//    4    9:aload           5
		//    5   11:invokevirtual   #175 <Method PackageManager Context.getPackageManager()>
		//    6   14:astore          4
			if(mInitializedMenuBuilderReferences)
				break MISSING_BLOCK_LABEL_83;
		//    7   16:aload_0         
		//    8   17:getfield        #37  <Field boolean mInitializedMenuBuilderReferences>
		//    9   20:ifne            83
			mInitializedMenuBuilderReferences = true;
		//   10   23:aload_0         
		//   11   24:iconst_1        
		//   12   25:putfield        #37  <Field boolean mInitializedMenuBuilderReferences>
			try
			{
				mMenuBuilderClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
		//   13   28:aload_0         
		//   14   29:ldc1            #177 <String "com.android.internal.view.menu.MenuBuilder">
		//   15   31:invokestatic    #183 <Method Class Class.forName(String)>
		//   16   34:putfield        #185 <Field Class mMenuBuilderClass>
				mMenuBuilderRemoveItemAtMethod = mMenuBuilderClass.getDeclaredMethod("removeItemAt", new Class[] {
					Integer.TYPE
				});
		//   17   37:aload_0         
		//   18   38:aload_0         
		//   19   39:getfield        #185 <Field Class mMenuBuilderClass>
		//   20   42:ldc1            #187 <String "removeItemAt">
		//   21   44:iconst_1        
		//   22   45:anewarray       Class[]
		//   23   48:dup             
		//   24   49:iconst_0        
		//   25   50:getstatic       #192 <Field Class Integer.TYPE>
		//   26   53:aastore         
		//   27   54:invokevirtual   #196 <Method Method Class.getDeclaredMethod(String, Class[])>
		//   28   57:putfield        #198 <Field Method mMenuBuilderRemoveItemAtMethod>
				mCanUseMenuBuilderReferences = true;
		//   29   60:aload_0         
		//   30   61:iconst_1        
		//   31   62:putfield        #200 <Field boolean mCanUseMenuBuilderReferences>
			}
		//*  32   65:goto            83
		//*  33   68:aload_0         
		//*  34   69:aconst_null     
		//*  35   70:putfield        #185 <Field Class mMenuBuilderClass>
		//*  36   73:aload_0         
		//*  37   74:aconst_null     
		//*  38   75:putfield        #198 <Field Method mMenuBuilderRemoveItemAtMethod>
		//*  39   78:aload_0         
		//*  40   79:iconst_0        
		//*  41   80:putfield        #200 <Field boolean mCanUseMenuBuilderReferences>
		//*  42   83:aload_0         
		//*  43   84:getfield        #200 <Field boolean mCanUseMenuBuilderReferences>
		//*  44   87:ifeq            109
		//*  45   90:aload_0         
		//*  46   91:getfield        #185 <Field Class mMenuBuilderClass>
		//*  47   94:aload_1         
		//*  48   95:invokevirtual   #203 <Method boolean Class.isInstance(Object)>
		//*  49   98:ifeq            109
		//*  50  101:aload_0         
		//*  51  102:getfield        #198 <Field Method mMenuBuilderRemoveItemAtMethod>
		//*  52  105:astore_3        
		//*  53  106:goto            129
		//*  54  109:aload_1         
		//*  55  110:invokevirtual   #207 <Method Class Object.getClass()>
		//*  56  113:ldc1            #187 <String "removeItemAt">
		//*  57  115:iconst_1        
		//*  58  116:anewarray       Class[]
		//*  59  119:dup             
		//*  60  120:iconst_0        
		//*  61  121:getstatic       #192 <Field Class Integer.TYPE>
		//*  62  124:aastore         
		//*  63  125:invokevirtual   #196 <Method Method Class.getDeclaredMethod(String, Class[])>
		//*  64  128:astore_3        
		//*  65  129:aload_1         
		//*  66  130:invokeinterface #213 <Method int Menu.size()>
		//*  67  135:iconst_1        
		//*  68  136:isub            
		//*  69  137:istore_2        
		//*  70  138:iload_2         
		//*  71  139:iflt            203
		//*  72  142:aload_1         
		//*  73  143:iload_2         
		//*  74  144:invokeinterface #217 <Method MenuItem Menu.getItem(int)>
		//*  75  149:astore          6
		//*  76  151:aload           6
		//*  77  153:invokeinterface #222 <Method Intent MenuItem.getIntent()>
		//*  78  158:ifnull          196
		//*  79  161:ldc1            #45  <String "android.intent.action.PROCESS_TEXT">
		//*  80  163:aload           6
		//*  81  165:invokeinterface #222 <Method Intent MenuItem.getIntent()>
		//*  82  170:invokevirtual   #225 <Method String Intent.getAction()>
		//*  83  173:invokevirtual   #147 <Method boolean String.equals(Object)>
		//*  84  176:ifeq            196
		//*  85  179:aload_3         
		//*  86  180:aload_1         
		//*  87  181:iconst_1        
		//*  88  182:anewarray       Object[]
		//*  89  185:dup             
		//*  90  186:iconst_0        
		//*  91  187:iload_2         
		//*  92  188:invokestatic    #229 <Method Integer Integer.valueOf(int)>
		//*  93  191:aastore         
		//*  94  192:invokevirtual   #235 <Method Object Method.invoke(Object, Object[])>
		//*  95  195:pop             
		//*  96  196:iload_2         
		//*  97  197:iconst_1        
		//*  98  198:isub            
		//*  99  199:istore_2        
		//* 100  200:goto            138
		//* 101  203:aload_0         
		//* 102  204:aload           5
		//* 103  206:aload           4
		//* 104  208:invokespecial   #237 <Method List getSupportedActivities(Context, PackageManager)>
		//* 105  211:astore_3        
		//* 106  212:iconst_0        
		//* 107  213:istore_2        
		//* 108  214:iload_2         
		//* 109  215:aload_3         
		//* 110  216:invokeinterface #238 <Method int List.size()>
		//* 111  221:icmpge          283
		//* 112  224:aload_3         
		//* 113  225:iload_2         
		//* 114  226:invokeinterface #242 <Method Object List.get(int)>
		//* 115  231:checkcast       #70  <Class ResolveInfo>
		//* 116  234:astore          5
		//* 117  236:aload_1         
		//* 118  237:iconst_0        
		//* 119  238:iconst_0        
		//* 120  239:iload_2         
		//* 121  240:bipush          100
		//* 122  242:iadd            
		//* 123  243:aload           5
		//* 124  245:aload           4
		//* 125  247:invokevirtual   #246 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
		//* 126  250:invokeinterface #249 <Method MenuItem Menu.add(int, int, int, CharSequence)>
		//* 127  255:aload_0         
		//* 128  256:aload           5
		//* 129  258:aload_0         
		//* 130  259:getfield        #35  <Field TextView mTextView>
		//* 131  262:invokespecial   #251 <Method Intent createProcessTextIntentForResolveInfo(ResolveInfo, TextView)>
		//* 132  265:invokeinterface #255 <Method MenuItem MenuItem.setIntent(Intent)>
		//* 133  270:iconst_1        
		//* 134  271:invokeinterface #259 <Method void MenuItem.setShowAsAction(int)>
		//* 135  276:iload_2         
		//* 136  277:iconst_1        
		//* 137  278:iadd            
		//* 138  279:istore_2        
		//* 139  280:goto            214
		//* 140  283:return          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				mMenuBuilderClass = null;
				mMenuBuilderRemoveItemAtMethod = null;
				mCanUseMenuBuilderReferences = false;
			}
			Object obj;
			if(mCanUseMenuBuilderReferences && mMenuBuilderClass.isInstance(((Object) (menu))))
			{
				obj = ((Object) (mMenuBuilderRemoveItemAtMethod));
				break MISSING_BLOCK_LABEL_129;
			}
			obj = ((Object) (((Object) (menu)).getClass().getDeclaredMethod("removeItemAt", new Class[] {
				Integer.TYPE
			})));
			int i = menu.size() - 1;
_L3:
			if(i < 0) goto _L2; else goto _L1
_L1:
			Object obj1;
			try
			{
				MenuItem menuitem = menu.getItem(i);
				if(menuitem.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(((Object) (menuitem.getIntent().getAction()))))
					((Method) (obj)).invoke(((Object) (menu)), new Object[] {
						Integer.valueOf(i)
					});
			}
		//* 141  284:astore_3        
		//* 142  285:goto            68
			// Misplaced declaration of an exception variable
			catch(Menu menu)
		//* 143  288:astore_1        
			{
				return;
		//  144  289:return          
			}
			i--;
			  goto _L3
_L2:
			obj = ((Object) (getSupportedActivities(((Context) (obj2)), packagemanager)));
			for(i = 0; i < ((List) (obj)).size(); i++)
			{
				obj2 = ((Object) ((ResolveInfo)((List) (obj)).get(i)));
				menu.add(0, 0, i + 100, ((ResolveInfo) (obj2)).loadLabel(packagemanager)).setIntent(createProcessTextIntentForResolveInfo(((ResolveInfo) (obj2)), mTextView)).setShowAsAction(1);
			}

			return;
		}

		public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
		{
			return mCallback.onActionItemClicked(actionmode, menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field android.view.ActionMode$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #263 <Method boolean android.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
		//    5   11:ireturn         
		}

		public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
		{
			return mCallback.onCreateActionMode(actionmode, menu);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field android.view.ActionMode$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #267 <Method boolean android.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
		//    5   11:ireturn         
		}

		public void onDestroyActionMode(ActionMode actionmode)
		{
			mCallback.onDestroyActionMode(actionmode);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field android.view.ActionMode$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #271 <Method void android.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
		//    4   10:return          
		}

		public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
		{
			recomputeProcessTextMenuItems(menu);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #274 <Method void recomputeProcessTextMenuItems(Menu)>
			return mCallback.onPrepareActionMode(actionmode, menu);
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field android.view.ActionMode$Callback mCallback>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #276 <Method boolean android.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
		//    8   16:ireturn         
		}

		private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
		private final android.view.ActionMode.Callback mCallback;
		private boolean mCanUseMenuBuilderReferences;
		private boolean mInitializedMenuBuilderReferences;
		private Class mMenuBuilderClass;
		private Method mMenuBuilderRemoveItemAtMethod;
		private final TextView mTextView;

		OreoCallback(android.view.ActionMode.Callback callback, TextView textview)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mCallback = callback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field android.view.ActionMode$Callback mCallback>
			mTextView = textview;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field TextView mTextView>
			mInitializedMenuBuilderReferences = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #37  <Field boolean mInitializedMenuBuilderReferences>
		//   11   19:return          
		}
	}


	private TextViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static int getAutoSizeMaxTextSize(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			return textview.getAutoSizeMaxTextSize();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #48  <Method int TextView.getAutoSizeMaxTextSize()>
	//    5   12:ireturn         
		if(textview instanceof AutoSizeableTextView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #50  <Class AutoSizeableTextView>
	//*   8   17:ifeq            30
			return ((AutoSizeableTextView)textview).getAutoSizeMaxTextSize();
	//    9   20:aload_0         
	//   10   21:checkcast       #50  <Class AutoSizeableTextView>
	//   11   24:invokeinterface #51  <Method int AutoSizeableTextView.getAutoSizeMaxTextSize()>
	//   12   29:ireturn         
		else
			return -1;
	//   13   30:iconst_m1       
	//   14   31:ireturn         
	}

	public static int getAutoSizeMinTextSize(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			return textview.getAutoSizeMinTextSize();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #55  <Method int TextView.getAutoSizeMinTextSize()>
	//    5   12:ireturn         
		if(textview instanceof AutoSizeableTextView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #50  <Class AutoSizeableTextView>
	//*   8   17:ifeq            30
			return ((AutoSizeableTextView)textview).getAutoSizeMinTextSize();
	//    9   20:aload_0         
	//   10   21:checkcast       #50  <Class AutoSizeableTextView>
	//   11   24:invokeinterface #56  <Method int AutoSizeableTextView.getAutoSizeMinTextSize()>
	//   12   29:ireturn         
		else
			return -1;
	//   13   30:iconst_m1       
	//   14   31:ireturn         
	}

	public static int getAutoSizeStepGranularity(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			return textview.getAutoSizeStepGranularity();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #59  <Method int TextView.getAutoSizeStepGranularity()>
	//    5   12:ireturn         
		if(textview instanceof AutoSizeableTextView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #50  <Class AutoSizeableTextView>
	//*   8   17:ifeq            30
			return ((AutoSizeableTextView)textview).getAutoSizeStepGranularity();
	//    9   20:aload_0         
	//   10   21:checkcast       #50  <Class AutoSizeableTextView>
	//   11   24:invokeinterface #60  <Method int AutoSizeableTextView.getAutoSizeStepGranularity()>
	//   12   29:ireturn         
		else
			return -1;
	//   13   30:iconst_m1       
	//   14   31:ireturn         
	}

	public static int[] getAutoSizeTextAvailableSizes(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			return textview.getAutoSizeTextAvailableSizes();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #65  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
	//    5   12:areturn         
		if(textview instanceof AutoSizeableTextView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #50  <Class AutoSizeableTextView>
	//*   8   17:ifeq            30
			return ((AutoSizeableTextView)textview).getAutoSizeTextAvailableSizes();
	//    9   20:aload_0         
	//   10   21:checkcast       #50  <Class AutoSizeableTextView>
	//   11   24:invokeinterface #66  <Method int[] AutoSizeableTextView.getAutoSizeTextAvailableSizes()>
	//   12   29:areturn         
		else
			return new int[0];
	//   13   30:iconst_0        
	//   14   31:newarray        int[]
	//   15   33:areturn         
	}

	public static int getAutoSizeTextType(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			return textview.getAutoSizeTextType();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #70  <Method int TextView.getAutoSizeTextType()>
	//    5   12:ireturn         
		if(textview instanceof AutoSizeableTextView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #50  <Class AutoSizeableTextView>
	//*   8   17:ifeq            30
			return ((AutoSizeableTextView)textview).getAutoSizeTextType();
	//    9   20:aload_0         
	//   10   21:checkcast       #50  <Class AutoSizeableTextView>
	//   11   24:invokeinterface #71  <Method int AutoSizeableTextView.getAutoSizeTextType()>
	//   12   29:ireturn         
		else
			return 0;
	//   13   30:iconst_0        
	//   14   31:ireturn         
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return textview.getCompoundDrawablesRelative();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #76  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   6   13:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          17
	//*   8   18:icmplt          67
		{
			int i = textview.getLayoutDirection();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #79  <Method int TextView.getLayoutDirection()>
	//   11   25:istore_2        
			boolean flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_1        
			if(i != 1)
	//*  14   28:iload_2         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          36
	//*  17   33:goto            38
				flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_1        
			textview = ((TextView) (textview.getCompoundDrawables()));
	//   20   38:aload_0         
	//   21   39:invokevirtual   #82  <Method Drawable[] TextView.getCompoundDrawables()>
	//   22   42:astore_0        
			if(flag)
	//*  23   43:iload_1         
	//*  24   44:ifeq            65
			{
				Object obj = textview[2];
	//   25   47:aload_0         
	//   26   48:iconst_2        
	//   27   49:aaload          
	//   28   50:astore_3        
				Object obj1 = textview[0];
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:aaload          
	//   32   54:astore          4
				textview[0] = obj;
	//   33   56:aload_0         
	//   34   57:iconst_0        
	//   35   58:aload_3         
	//   36   59:aastore         
				textview[2] = obj1;
	//   37   60:aload_0         
	//   38   61:iconst_2        
	//   39   62:aload           4
	//   40   64:aastore         
			}
			return ((Drawable []) (textview));
	//   41   65:aload_0         
	//   42   66:areturn         
		} else
		{
			return textview.getCompoundDrawables();
	//   43   67:aload_0         
	//   44   68:invokevirtual   #82  <Method Drawable[] TextView.getCompoundDrawables()>
	//   45   71:areturn         
		}
	}

	public static int getFirstBaselineToTopHeight(TextView textview)
	{
		return textview.getPaddingTop() - textview.getPaint().getFontMetricsInt().top;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method int TextView.getPaddingTop()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//    4    8:invokevirtual   #96  <Method android.graphics.Paint$FontMetricsInt TextPaint.getFontMetricsInt()>
	//    5   11:getfield        #101 <Field int android.graphics.Paint$FontMetricsInt.top>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public static int getLastBaselineToBottomHeight(TextView textview)
	{
		return textview.getPaddingBottom() + textview.getPaint().getFontMetricsInt().bottom;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int TextView.getPaddingBottom()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//    4    8:invokevirtual   #96  <Method android.graphics.Paint$FontMetricsInt TextPaint.getFontMetricsInt()>
	//    5   11:getfield        #108 <Field int android.graphics.Paint$FontMetricsInt.bottom>
	//    6   14:iadd            
	//    7   15:ireturn         
	}

	public static int getMaxLines(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return textview.getMaxLines();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #111 <Method int TextView.getMaxLines()>
	//    5   12:ireturn         
		if(!sMaxModeFieldFetched)
	//*   6   13:getstatic       #113 <Field boolean sMaxModeFieldFetched>
	//*   7   16:ifne            31
		{
			sMaxModeField = retrieveField("mMaxMode");
	//    8   19:ldc1            #115 <String "mMaxMode">
	//    9   21:invokestatic    #119 <Method Field retrieveField(String)>
	//   10   24:putstatic       #121 <Field Field sMaxModeField>
			sMaxModeFieldFetched = true;
	//   11   27:iconst_1        
	//   12   28:putstatic       #113 <Field boolean sMaxModeFieldFetched>
		}
		Field field = sMaxModeField;
	//   13   31:getstatic       #121 <Field Field sMaxModeField>
	//   14   34:astore_1        
		if(field != null && retrieveIntFromField(field, textview) == 1)
	//*  15   35:aload_1         
	//*  16   36:ifnull          80
	//*  17   39:aload_1         
	//*  18   40:aload_0         
	//*  19   41:invokestatic    #125 <Method int retrieveIntFromField(Field, TextView)>
	//*  20   44:iconst_1        
	//*  21   45:icmpne          80
		{
			if(!sMaximumFieldFetched)
	//*  22   48:getstatic       #127 <Field boolean sMaximumFieldFetched>
	//*  23   51:ifne            66
			{
				sMaximumField = retrieveField("mMaximum");
	//   24   54:ldc1            #129 <String "mMaximum">
	//   25   56:invokestatic    #119 <Method Field retrieveField(String)>
	//   26   59:putstatic       #131 <Field Field sMaximumField>
				sMaximumFieldFetched = true;
	//   27   62:iconst_1        
	//   28   63:putstatic       #127 <Field boolean sMaximumFieldFetched>
			}
			Field field1 = sMaximumField;
	//   29   66:getstatic       #131 <Field Field sMaximumField>
	//   30   69:astore_1        
			if(field1 != null)
	//*  31   70:aload_1         
	//*  32   71:ifnull          80
				return retrieveIntFromField(field1, textview);
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:invokestatic    #125 <Method int retrieveIntFromField(Field, TextView)>
	//   36   79:ireturn         
		}
		return -1;
	//   37   80:iconst_m1       
	//   38   81:ireturn         
	}

	public static int getMinLines(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return textview.getMinLines();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #134 <Method int TextView.getMinLines()>
	//    5   12:ireturn         
		if(!sMinModeFieldFetched)
	//*   6   13:getstatic       #136 <Field boolean sMinModeFieldFetched>
	//*   7   16:ifne            31
		{
			sMinModeField = retrieveField("mMinMode");
	//    8   19:ldc1            #138 <String "mMinMode">
	//    9   21:invokestatic    #119 <Method Field retrieveField(String)>
	//   10   24:putstatic       #140 <Field Field sMinModeField>
			sMinModeFieldFetched = true;
	//   11   27:iconst_1        
	//   12   28:putstatic       #136 <Field boolean sMinModeFieldFetched>
		}
		Field field = sMinModeField;
	//   13   31:getstatic       #140 <Field Field sMinModeField>
	//   14   34:astore_1        
		if(field != null && retrieveIntFromField(field, textview) == 1)
	//*  15   35:aload_1         
	//*  16   36:ifnull          80
	//*  17   39:aload_1         
	//*  18   40:aload_0         
	//*  19   41:invokestatic    #125 <Method int retrieveIntFromField(Field, TextView)>
	//*  20   44:iconst_1        
	//*  21   45:icmpne          80
		{
			if(!sMinimumFieldFetched)
	//*  22   48:getstatic       #142 <Field boolean sMinimumFieldFetched>
	//*  23   51:ifne            66
			{
				sMinimumField = retrieveField("mMinimum");
	//   24   54:ldc1            #144 <String "mMinimum">
	//   25   56:invokestatic    #119 <Method Field retrieveField(String)>
	//   26   59:putstatic       #146 <Field Field sMinimumField>
				sMinimumFieldFetched = true;
	//   27   62:iconst_1        
	//   28   63:putstatic       #142 <Field boolean sMinimumFieldFetched>
			}
			Field field1 = sMinimumField;
	//   29   66:getstatic       #146 <Field Field sMinimumField>
	//   30   69:astore_1        
			if(field1 != null)
	//*  31   70:aload_1         
	//*  32   71:ifnull          80
				return retrieveIntFromField(field1, textview);
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:invokestatic    #125 <Method int retrieveIntFromField(Field, TextView)>
	//   36   79:ireturn         
		}
		return -1;
	//   37   80:iconst_m1       
	//   38   81:ireturn         
	}

	private static int getTextDirection(TextDirectionHeuristic textdirectionheuristic)
	{
		if(textdirectionheuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #157 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_RTL>
	//*   2    4:if_acmpne       9
			return 1;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)
	//*   5    9:aload_0         
	//*   6   10:getstatic       #160 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//*   7   13:if_acmpne       18
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.ANYRTL_LTR)
	//*  10   18:aload_0         
	//*  11   19:getstatic       #163 <Field TextDirectionHeuristic TextDirectionHeuristics.ANYRTL_LTR>
	//*  12   22:if_acmpne       27
			return 2;
	//   13   25:iconst_2        
	//   14   26:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.LTR)
	//*  15   27:aload_0         
	//*  16   28:getstatic       #166 <Field TextDirectionHeuristic TextDirectionHeuristics.LTR>
	//*  17   31:if_acmpne       36
			return 3;
	//   18   34:iconst_3        
	//   19   35:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.RTL)
	//*  20   36:aload_0         
	//*  21   37:getstatic       #169 <Field TextDirectionHeuristic TextDirectionHeuristics.RTL>
	//*  22   40:if_acmpne       45
			return 4;
	//   23   43:iconst_4        
	//   24   44:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.LOCALE)
	//*  25   45:aload_0         
	//*  26   46:getstatic       #172 <Field TextDirectionHeuristic TextDirectionHeuristics.LOCALE>
	//*  27   49:if_acmpne       54
			return 5;
	//   28   52:iconst_5        
	//   29   53:ireturn         
		if(textdirectionheuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)
	//*  30   54:aload_0         
	//*  31   55:getstatic       #160 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//*  32   58:if_acmpne       64
			return 6;
	//   33   61:bipush          6
	//   34   63:ireturn         
		return textdirectionheuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL ? 1 : 7;
	//   35   64:aload_0         
	//   36   65:getstatic       #157 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_RTL>
	//   37   68:if_acmpne       74
	//   38   71:bipush          7
	//   39   73:ireturn         
	//   40   74:iconst_1        
	//   41   75:ireturn         
	}

	private static TextDirectionHeuristic getTextDirectionHeuristic(TextView textview)
	{
		if(textview.getTransformationMethod() instanceof PasswordTransformationMethod)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #178 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//*   2    4:instanceof      #180 <Class PasswordTransformationMethod>
	//*   3    7:ifeq            14
			return TextDirectionHeuristics.LTR;
	//    4   10:getstatic       #166 <Field TextDirectionHeuristic TextDirectionHeuristics.LTR>
	//    5   13:areturn         
		int i = android.os.Build.VERSION.SDK_INT;
	//    6   14:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//    7   17:istore_2        
		byte byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		if(i >= 28 && (textview.getInputType() & 0xf) == 3)
	//*  10   20:iload_2         
	//*  11   21:bipush          28
	//*  12   23:icmplt          78
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #183 <Method int TextView.getInputType()>
	//*  15   30:bipush          15
	//*  16   32:iand            
	//*  17   33:iconst_3        
	//*  18   34:icmpne          78
		{
			byte0 = Character.getDirectionality(DecimalFormatSymbols.getInstance(textview.getTextLocale()).getDigitStrings()[0].codePointAt(0));
	//   19   37:aload_0         
	//   20   38:invokevirtual   #187 <Method java.util.Locale TextView.getTextLocale()>
	//   21   41:invokestatic    #193 <Method DecimalFormatSymbols DecimalFormatSymbols.getInstance(java.util.Locale)>
	//   22   44:invokevirtual   #197 <Method String[] DecimalFormatSymbols.getDigitStrings()>
	//   23   47:iconst_0        
	//   24   48:aaload          
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #203 <Method int String.codePointAt(int)>
	//   27   53:invokestatic    #209 <Method byte Character.getDirectionality(int)>
	//   28   56:istore_1        
			if(byte0 != 1 && byte0 != 2)
	//*  29   57:iload_1         
	//*  30   58:iconst_1        
	//*  31   59:icmpeq          74
	//*  32   62:iload_1         
	//*  33   63:iconst_2        
	//*  34   64:icmpne          70
	//*  35   67:goto            74
				return TextDirectionHeuristics.LTR;
	//   36   70:getstatic       #166 <Field TextDirectionHeuristic TextDirectionHeuristics.LTR>
	//   37   73:areturn         
			else
				return TextDirectionHeuristics.RTL;
	//   38   74:getstatic       #169 <Field TextDirectionHeuristic TextDirectionHeuristics.RTL>
	//   39   77:areturn         
		}
		if(textview.getLayoutDirection() == 1)
	//*  40   78:aload_0         
	//*  41   79:invokevirtual   #79  <Method int TextView.getLayoutDirection()>
	//*  42   82:iconst_1        
	//*  43   83:icmpne          88
			byte0 = 1;
	//   44   86:iconst_1        
	//   45   87:istore_1        
		switch(textview.getTextDirection())
	//*  46   88:aload_0         
	//*  47   89:invokevirtual   #211 <Method int TextView.getTextDirection()>
		{
	//*  48   92:tableswitch     2 7: default 132
	//	               2 160
	//	               3 156
	//	               4 152
	//	               5 148
	//	               6 144
	//	               7 140
		default:
			if(byte0 != 0)
	//*  49  132:iload_1         
	//*  50  133:ifeq            164
				return TextDirectionHeuristics.FIRSTSTRONG_RTL;
	//   51  136:getstatic       #157 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_RTL>
	//   52  139:areturn         
			else
	//*  53  140:getstatic       #157 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_RTL>
	//*  54  143:areturn         
	//*  55  144:getstatic       #160 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//*  56  147:areturn         
	//*  57  148:getstatic       #172 <Field TextDirectionHeuristic TextDirectionHeuristics.LOCALE>
	//*  58  151:areturn         
	//*  59  152:getstatic       #169 <Field TextDirectionHeuristic TextDirectionHeuristics.RTL>
	//*  60  155:areturn         
	//*  61  156:getstatic       #166 <Field TextDirectionHeuristic TextDirectionHeuristics.LTR>
	//*  62  159:areturn         
	//*  63  160:getstatic       #163 <Field TextDirectionHeuristic TextDirectionHeuristics.ANYRTL_LTR>
	//*  64  163:areturn         
				return TextDirectionHeuristics.FIRSTSTRONG_LTR;
	//   65  164:getstatic       #160 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//   66  167:areturn         

		case 7: // '\007'
			return TextDirectionHeuristics.FIRSTSTRONG_RTL;

		case 6: // '\006'
			return TextDirectionHeuristics.FIRSTSTRONG_LTR;

		case 5: // '\005'
			return TextDirectionHeuristics.LOCALE;

		case 4: // '\004'
			return TextDirectionHeuristics.RTL;

		case 3: // '\003'
			return TextDirectionHeuristics.LTR;

		case 2: // '\002'
			return TextDirectionHeuristics.ANYRTL_LTR;
		}
	}

	public static android.support.v4.text.PrecomputedTextCompat.Params getTextMetricsParams(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          20
			return new android.support.v4.text.PrecomputedTextCompat.Params(textview.getTextMetricsParams());
	//    3    8:new             #215 <Class android.support.v4.text.PrecomputedTextCompat$Params>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokevirtual   #218 <Method android.text.PrecomputedText$Params TextView.getTextMetricsParams()>
	//    7   16:invokespecial   #221 <Method void android.support.v4.text.PrecomputedTextCompat$Params(android.text.PrecomputedText$Params)>
	//    8   19:areturn         
		android.support.v4.text.PrecomputedTextCompat.Params.Builder builder = new android.support.v4.text.PrecomputedTextCompat.Params.Builder(new TextPaint(((android.graphics.Paint) (textview.getPaint()))));
	//    9   20:new             #223 <Class android.support.v4.text.PrecomputedTextCompat$Params$Builder>
	//   10   23:dup             
	//   11   24:new             #92  <Class TextPaint>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//   15   32:invokespecial   #226 <Method void TextPaint(android.graphics.Paint)>
	//   16   35:invokespecial   #229 <Method void android.support.v4.text.PrecomputedTextCompat$Params$Builder(TextPaint)>
	//   17   38:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  18   39:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   42:bipush          23
	//*  20   44:icmplt          65
		{
			builder.setBreakStrategy(textview.getBreakStrategy());
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:invokevirtual   #232 <Method int TextView.getBreakStrategy()>
	//   24   52:invokevirtual   #236 <Method android.support.v4.text.PrecomputedTextCompat$Params$Builder android.support.v4.text.PrecomputedTextCompat$Params$Builder.setBreakStrategy(int)>
	//   25   55:pop             
			builder.setHyphenationFrequency(textview.getHyphenationFrequency());
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:invokevirtual   #239 <Method int TextView.getHyphenationFrequency()>
	//   29   61:invokevirtual   #242 <Method android.support.v4.text.PrecomputedTextCompat$Params$Builder android.support.v4.text.PrecomputedTextCompat$Params$Builder.setHyphenationFrequency(int)>
	//   30   64:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  31   65:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  32   68:bipush          18
	//*  33   70:icmplt          82
			builder.setTextDirection(getTextDirectionHeuristic(textview));
	//   34   73:aload_1         
	//   35   74:aload_0         
	//   36   75:invokestatic    #244 <Method TextDirectionHeuristic getTextDirectionHeuristic(TextView)>
	//   37   78:invokevirtual   #248 <Method android.support.v4.text.PrecomputedTextCompat$Params$Builder android.support.v4.text.PrecomputedTextCompat$Params$Builder.setTextDirection(TextDirectionHeuristic)>
	//   38   81:pop             
		return builder.build();
	//   39   82:aload_1         
	//   40   83:invokevirtual   #252 <Method android.support.v4.text.PrecomputedTextCompat$Params android.support.v4.text.PrecomputedTextCompat$Params$Builder.build()>
	//   41   86:areturn         
	}

	private static Field retrieveField(String s)
	{
		Field field = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (((Class) (android/widget/TextView)).getDeclaredField(s)));
	//    2    2:ldc1            #45  <Class TextView>
	//    3    4:aload_0         
	//    4    5:invokevirtual   #259 <Method Field Class.getDeclaredField(String)>
	//    5    8:astore_2        
		}
	//*   6    9:aload_2         
	//*   7   10:astore_1        
	//*   8   11:aload_2         
	//*   9   12:iconst_1        
	//*  10   13:invokevirtual   #265 <Method void Field.setAccessible(boolean)>
	//*  11   16:aload_2         
	//*  12   17:areturn         
	//*  13   18:new             #267 <Class StringBuilder>
	//*  14   21:dup             
	//*  15   22:invokespecial   #268 <Method void StringBuilder()>
	//*  16   25:astore_2        
	//*  17   26:aload_2         
	//*  18   27:ldc2            #270 <String "Could not retrieve ">
	//*  19   30:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  20   33:pop             
	//*  21   34:aload_2         
	//*  22   35:aload_0         
	//*  23   36:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  24   39:pop             
	//*  25   40:aload_2         
	//*  26   41:ldc2            #276 <String " field.">
	//*  27   44:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  28   47:pop             
	//*  29   48:ldc1            #20  <String "TextViewCompat">
	//*  30   50:aload_2         
	//*  31   51:invokevirtual   #280 <Method String StringBuilder.toString()>
	//*  32   54:invokestatic    #286 <Method int Log.e(String, String)>
	//*  33   57:pop             
	//*  34   58:aload_1         
	//*  35   59:areturn         
		// Misplaced declaration of an exception variable
		catch(NoSuchFieldException nosuchfieldexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Could not retrieve ");
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append(" field.");
			Log.e("TextViewCompat", ((StringBuilder) (obj)).toString());
			return field;
		}
		field = ((Field) (obj));
		((Field) (obj)).setAccessible(true);
		NoSuchFieldException nosuchfieldexception;
		return ((Field) (obj));
	//*  36   60:astore_2        
	//*  37   61:goto            18
	}

	private static int retrieveIntFromField(Field field, TextView textview)
	{
		int i;
		try
		{
			i = field.getInt(((Object) (textview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #292 <Method int Field.getInt(Object)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
	//*   6    8:new             #267 <Class StringBuilder>
	//*   7   11:dup             
	//*   8   12:invokespecial   #268 <Method void StringBuilder()>
	//*   9   15:astore_1        
	//*  10   16:aload_1         
	//*  11   17:ldc2            #294 <String "Could not retrieve value of ">
	//*  12   20:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  13   23:pop             
	//*  14   24:aload_1         
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #297 <Method String Field.getName()>
	//*  17   29:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  18   32:pop             
	//*  19   33:aload_1         
	//*  20   34:ldc2            #276 <String " field.">
	//*  21   37:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//*  22   40:pop             
	//*  23   41:ldc1            #20  <String "TextViewCompat">
	//*  24   43:aload_1         
	//*  25   44:invokevirtual   #280 <Method String StringBuilder.toString()>
	//*  26   47:invokestatic    #300 <Method int Log.d(String, String)>
	//*  27   50:pop             
	//*  28   51:iconst_m1       
	//*  29   52:ireturn         
		// Misplaced declaration of an exception variable
		catch(TextView textview)
		{
			textview = ((TextView) (new StringBuilder()));
			((StringBuilder) (textview)).append("Could not retrieve value of ");
			((StringBuilder) (textview)).append(field.getName());
			((StringBuilder) (textview)).append(" field.");
			Log.d("TextViewCompat", ((StringBuilder) (textview)).toString());
			return -1;
		}
		return i;
	//*  30   53:astore_1        
	//*  31   54:goto            8
	}

	public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          18
		{
			textview.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #307 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
			return;
	//    9   17:return          
		}
		if(textview instanceof AutoSizeableTextView)
	//*  10   18:aload_0         
	//*  11   19:instanceof      #50  <Class AutoSizeableTextView>
	//*  12   22:ifeq            39
			((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//   13   25:aload_0         
	//   14   26:checkcast       #50  <Class AutoSizeableTextView>
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokeinterface #308 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//   20   39:return          
	}

	public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
		throws IllegalArgumentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          15
		{
			textview.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #314 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			return;
	//    7   14:return          
		}
		if(textview instanceof AutoSizeableTextView)
	//*   8   15:aload_0         
	//*   9   16:instanceof      #50  <Class AutoSizeableTextView>
	//*  10   19:ifeq            33
			((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//   11   22:aload_0         
	//   12   23:checkcast       #50  <Class AutoSizeableTextView>
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:invokeinterface #315 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//   16   33:return          
	}

	public static void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          14
		{
			textview.setAutoSizeTextTypeWithDefaults(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #320 <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
			return;
	//    6   13:return          
		}
		if(textview instanceof AutoSizeableTextView)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #50  <Class AutoSizeableTextView>
	//*   9   18:ifeq            31
			((AutoSizeableTextView)textview).setAutoSizeTextTypeWithDefaults(i);
	//   10   21:aload_0         
	//   11   22:checkcast       #50  <Class AutoSizeableTextView>
	//   12   25:iload_1         
	//   13   26:invokeinterface #321 <Method void AutoSizeableTextView.setAutoSizeTextTypeWithDefaults(int)>
	//   14   31:return          
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          18
		{
			textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokevirtual   #327 <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			return;
	//    9   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  10   18:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   21:bipush          17
	//*  12   23:icmplt          82
		{
			int i = textview.getLayoutDirection();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #79  <Method int TextView.getLayoutDirection()>
	//   15   30:istore          6
			boolean flag = true;
	//   16   32:iconst_1        
	//   17   33:istore          5
			if(i != 1)
	//*  18   35:iload           6
	//*  19   37:iconst_1        
	//*  20   38:icmpne          44
	//*  21   41:goto            47
				flag = false;
	//   22   44:iconst_0        
	//   23   45:istore          5
			Drawable drawable4;
			if(flag)
	//*  24   47:iload           5
	//*  25   49:ifeq            58
				drawable4 = drawable2;
	//   26   52:aload_3         
	//   27   53:astore          7
			else
	//*  28   55:goto            61
				drawable4 = drawable;
	//   29   58:aload_1         
	//   30   59:astore          7
			if(!flag)
	//*  31   61:iload           5
	//*  32   63:ifeq            69
	//*  33   66:goto            71
				drawable = drawable2;
	//   34   69:aload_3         
	//   35   70:astore_1        
			textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
	//   36   71:aload_0         
	//   37   72:aload           7
	//   38   74:aload_2         
	//   39   75:aload_1         
	//   40   76:aload           4
	//   41   78:invokevirtual   #330 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   42   81:return          
		} else
		{
			textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
	//   43   82:aload_0         
	//   44   83:aload_1         
	//   45   84:aload_2         
	//   46   85:aload_3         
	//   47   86:aload           4
	//   48   88:invokevirtual   #330 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   49   91:return          
		}
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          18
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #334 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
			return;
	//    9   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  10   18:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   21:bipush          17
	//*  12   23:icmplt          82
		{
			int i1 = textview.getLayoutDirection();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #79  <Method int TextView.getLayoutDirection()>
	//   15   30:istore          6
			boolean flag = true;
	//   16   32:iconst_1        
	//   17   33:istore          5
			if(i1 != 1)
	//*  18   35:iload           6
	//*  19   37:iconst_1        
	//*  20   38:icmpne          44
	//*  21   41:goto            47
				flag = false;
	//   22   44:iconst_0        
	//   23   45:istore          5
			if(flag)
	//*  24   47:iload           5
	//*  25   49:ifeq            58
				i1 = k;
	//   26   52:iload_3         
	//   27   53:istore          6
			else
	//*  28   55:goto            61
				i1 = i;
	//   29   58:iload_1         
	//   30   59:istore          6
			if(!flag)
	//*  31   61:iload           5
	//*  32   63:ifeq            69
	//*  33   66:goto            71
				i = k;
	//   34   69:iload_3         
	//   35   70:istore_1        
			textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
	//   36   71:aload_0         
	//   37   72:iload           6
	//   38   74:iload_2         
	//   39   75:iload_1         
	//   40   76:iload           4
	//   41   78:invokevirtual   #337 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			return;
	//   42   81:return          
		} else
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
	//   43   82:aload_0         
	//   44   83:iload_1         
	//   45   84:iload_2         
	//   46   85:iload_3         
	//   47   86:iload           4
	//   48   88:invokevirtual   #337 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			return;
	//   49   91:return          
		}
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          18
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokevirtual   #339 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			return;
	//    9   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  10   18:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   21:bipush          17
	//*  12   23:icmplt          82
		{
			int i = textview.getLayoutDirection();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #79  <Method int TextView.getLayoutDirection()>
	//   15   30:istore          6
			boolean flag = true;
	//   16   32:iconst_1        
	//   17   33:istore          5
			if(i != 1)
	//*  18   35:iload           6
	//*  19   37:iconst_1        
	//*  20   38:icmpne          44
	//*  21   41:goto            47
				flag = false;
	//   22   44:iconst_0        
	//   23   45:istore          5
			Drawable drawable4;
			if(flag)
	//*  24   47:iload           5
	//*  25   49:ifeq            58
				drawable4 = drawable2;
	//   26   52:aload_3         
	//   27   53:astore          7
			else
	//*  28   55:goto            61
				drawable4 = drawable;
	//   29   58:aload_1         
	//   30   59:astore          7
			if(!flag)
	//*  31   61:iload           5
	//*  32   63:ifeq            69
	//*  33   66:goto            71
				drawable = drawable2;
	//   34   69:aload_3         
	//   35   70:astore_1        
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
	//   36   71:aload_0         
	//   37   72:aload           7
	//   38   74:aload_2         
	//   39   75:aload_1         
	//   40   76:aload           4
	//   41   78:invokevirtual   #341 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   42   81:return          
		} else
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//   43   82:aload_0         
	//   44   83:aload_1         
	//   45   84:aload_2         
	//   46   85:aload_3         
	//   47   86:aload           4
	//   48   88:invokevirtual   #341 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   49   91:return          
		}
	}

	public static void setCustomSelectionActionModeCallback(TextView textview, android.view.ActionMode.Callback callback)
	{
		textview.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textview, callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #347 <Method android.view.ActionMode$Callback wrapCustomSelectionActionModeCallback(TextView, android.view.ActionMode$Callback)>
	//    4    6:invokevirtual   #350 <Method void TextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
	}

	public static void setFirstBaselineToTopHeight(TextView textview, int i)
	{
		Preconditions.checkArgumentNonnegative(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #361 <Method int Preconditions.checkArgumentNonnegative(int)>
	//    2    4:pop             
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   3    5:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          28
	//*   5   10:icmplt          19
		{
			textview.setFirstBaselineToTopHeight(i);
	//    6   13:aload_0         
	//    7   14:iload_1         
	//    8   15:invokevirtual   #363 <Method void TextView.setFirstBaselineToTopHeight(int)>
			return;
	//    9   18:return          
		}
		android.graphics.Paint.FontMetricsInt fontmetricsint = textview.getPaint().getFontMetricsInt();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//   12   23:invokevirtual   #96  <Method android.graphics.Paint$FontMetricsInt TextPaint.getFontMetricsInt()>
	//   13   26:astore_3        
		int j;
		if(android.os.Build.VERSION.SDK_INT >= 16 && !textview.getIncludeFontPadding())
	//*  14   27:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   30:bipush          16
	//*  16   32:icmplt          53
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #367 <Method boolean TextView.getIncludeFontPadding()>
	//*  19   39:ifeq            45
	//*  20   42:goto            53
			j = fontmetricsint.ascent;
	//   21   45:aload_3         
	//   22   46:getfield        #370 <Field int android.graphics.Paint$FontMetricsInt.ascent>
	//   23   49:istore_2        
		else
	//*  24   50:goto            58
			j = fontmetricsint.top;
	//   25   53:aload_3         
	//   26   54:getfield        #101 <Field int android.graphics.Paint$FontMetricsInt.top>
	//   27   57:istore_2        
		if(i > Math.abs(j))
	//*  28   58:iload_1         
	//*  29   59:iload_2         
	//*  30   60:invokestatic    #375 <Method int Math.abs(int)>
	//*  31   63:icmple          88
		{
			j = -j;
	//   32   66:iload_2         
	//   33   67:ineg            
	//   34   68:istore_2        
			textview.setPadding(textview.getPaddingLeft(), i - j, textview.getPaddingRight(), textview.getPaddingBottom());
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:invokevirtual   #378 <Method int TextView.getPaddingLeft()>
	//   38   74:iload_1         
	//   39   75:iload_2         
	//   40   76:isub            
	//   41   77:aload_0         
	//   42   78:invokevirtual   #381 <Method int TextView.getPaddingRight()>
	//   43   81:aload_0         
	//   44   82:invokevirtual   #105 <Method int TextView.getPaddingBottom()>
	//   45   85:invokevirtual   #384 <Method void TextView.setPadding(int, int, int, int)>
		}
	//   46   88:return          
	}

	public static void setLastBaselineToBottomHeight(TextView textview, int i)
	{
		Preconditions.checkArgumentNonnegative(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #361 <Method int Preconditions.checkArgumentNonnegative(int)>
	//    2    4:pop             
		android.graphics.Paint.FontMetricsInt fontmetricsint = textview.getPaint().getFontMetricsInt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//    5    9:invokevirtual   #96  <Method android.graphics.Paint$FontMetricsInt TextPaint.getFontMetricsInt()>
	//    6   12:astore_3        
		int j;
		if(android.os.Build.VERSION.SDK_INT >= 16 && !textview.getIncludeFontPadding())
	//*   7   13:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          16
	//*   9   18:icmplt          39
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #367 <Method boolean TextView.getIncludeFontPadding()>
	//*  12   25:ifeq            31
	//*  13   28:goto            39
			j = fontmetricsint.descent;
	//   14   31:aload_3         
	//   15   32:getfield        #388 <Field int android.graphics.Paint$FontMetricsInt.descent>
	//   16   35:istore_2        
		else
	//*  17   36:goto            44
			j = fontmetricsint.bottom;
	//   18   39:aload_3         
	//   19   40:getfield        #108 <Field int android.graphics.Paint$FontMetricsInt.bottom>
	//   20   43:istore_2        
		if(i > Math.abs(j))
	//*  21   44:iload_1         
	//*  22   45:iload_2         
	//*  23   46:invokestatic    #375 <Method int Math.abs(int)>
	//*  24   49:icmple          71
			textview.setPadding(textview.getPaddingLeft(), textview.getPaddingTop(), textview.getPaddingRight(), i - j);
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:invokevirtual   #378 <Method int TextView.getPaddingLeft()>
	//   28   57:aload_0         
	//   29   58:invokevirtual   #86  <Method int TextView.getPaddingTop()>
	//   30   61:aload_0         
	//   31   62:invokevirtual   #381 <Method int TextView.getPaddingRight()>
	//   32   65:iload_1         
	//   33   66:iload_2         
	//   34   67:isub            
	//   35   68:invokevirtual   #384 <Method void TextView.setPadding(int, int, int, int)>
	//   36   71:return          
	}

	public static void setLineHeight(TextView textview, int i)
	{
		Preconditions.checkArgumentNonnegative(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #361 <Method int Preconditions.checkArgumentNonnegative(int)>
	//    2    4:pop             
		int j = textview.getPaint().getFontMetricsInt(((android.graphics.Paint.FontMetricsInt) (null)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #392 <Method int TextPaint.getFontMetricsInt(android.graphics.Paint$FontMetricsInt)>
	//    7   13:istore_2        
		if(i != j)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpeq          28
			textview.setLineSpacing(i - j, 1.0F);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:iload_2         
	//   14   22:isub            
	//   15   23:i2f             
	//   16   24:fconst_1        
	//   17   25:invokevirtual   #396 <Method void TextView.setLineSpacing(float, float)>
	//   18   28:return          
	}

	public static void setPrecomputedText(TextView textview, PrecomputedTextCompat precomputedtextcompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          17
		{
			textview.setText(((CharSequence) (precomputedtextcompat.getPrecomputedText())));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #404 <Method android.text.PrecomputedText PrecomputedTextCompat.getPrecomputedText()>
	//    6   13:invokevirtual   #408 <Method void TextView.setText(CharSequence)>
			return;
	//    7   16:return          
		}
		if(getTextMetricsParams(textview).equals(((Object) (precomputedtextcompat.getParams()))))
	//*   8   17:aload_0         
	//*   9   18:invokestatic    #410 <Method android.support.v4.text.PrecomputedTextCompat$Params getTextMetricsParams(TextView)>
	//*  10   21:aload_1         
	//*  11   22:invokevirtual   #413 <Method android.support.v4.text.PrecomputedTextCompat$Params PrecomputedTextCompat.getParams()>
	//*  12   25:invokevirtual   #417 <Method boolean android.support.v4.text.PrecomputedTextCompat$Params.equals(Object)>
	//*  13   28:ifeq            37
		{
			textview.setText(((CharSequence) (precomputedtextcompat)));
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokevirtual   #408 <Method void TextView.setText(CharSequence)>
			return;
	//   17   36:return          
		} else
		{
			throw new IllegalArgumentException("Given text can not be applied to TextView.");
	//   18   37:new             #304 <Class IllegalArgumentException>
	//   19   40:dup             
	//   20   41:ldc2            #419 <String "Given text can not be applied to TextView.">
	//   21   44:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   22   47:athrow          
		}
	}

	public static void setTextAppearance(TextView textview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			textview.setTextAppearance(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #426 <Method void TextView.setTextAppearance(int)>
			return;
	//    6   13:return          
		} else
		{
			textview.setTextAppearance(textview.getContext(), i);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #430 <Method Context TextView.getContext()>
	//   10   19:iload_1         
	//   11   20:invokevirtual   #433 <Method void TextView.setTextAppearance(Context, int)>
			return;
	//   12   23:return          
		}
	}

	public static void setTextMetricsParams(TextView textview, android.support.v4.text.PrecomputedTextCompat.Params params)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			textview.setTextDirection(getTextDirection(params.getTextDirection()));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #438 <Method TextDirectionHeuristic android.support.v4.text.PrecomputedTextCompat$Params.getTextDirection()>
	//    6   13:invokestatic    #440 <Method int getTextDirection(TextDirectionHeuristic)>
	//    7   16:invokevirtual   #442 <Method void TextView.setTextDirection(int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*   8   19:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          23
	//*  10   24:icmpge          70
		{
			float f = params.getTextPaint().getTextScaleX();
	//   11   27:aload_1         
	//   12   28:invokevirtual   #445 <Method TextPaint android.support.v4.text.PrecomputedTextCompat$Params.getTextPaint()>
	//   13   31:invokevirtual   #449 <Method float TextPaint.getTextScaleX()>
	//   14   34:fstore_2        
			textview.getPaint().set(params.getTextPaint());
	//   15   35:aload_0         
	//   16   36:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #445 <Method TextPaint android.support.v4.text.PrecomputedTextCompat$Params.getTextPaint()>
	//   19   43:invokevirtual   #452 <Method void TextPaint.set(TextPaint)>
			if(f == textview.getTextScaleX())
	//*  20   46:fload_2         
	//*  21   47:aload_0         
	//*  22   48:invokevirtual   #453 <Method float TextView.getTextScaleX()>
	//*  23   51:fcmpl           
	//*  24   52:ifne            64
				textview.setTextScaleX(f / 2.0F + 1.0F);
	//   25   55:aload_0         
	//   26   56:fload_2         
	//   27   57:fconst_2        
	//   28   58:fdiv            
	//   29   59:fconst_1        
	//   30   60:fadd            
	//   31   61:invokevirtual   #457 <Method void TextView.setTextScaleX(float)>
			textview.setTextScaleX(f);
	//   32   64:aload_0         
	//   33   65:fload_2         
	//   34   66:invokevirtual   #457 <Method void TextView.setTextScaleX(float)>
			return;
	//   35   69:return          
		} else
		{
			textview.getPaint().set(params.getTextPaint());
	//   36   70:aload_0         
	//   37   71:invokevirtual   #90  <Method TextPaint TextView.getPaint()>
	//   38   74:aload_1         
	//   39   75:invokevirtual   #445 <Method TextPaint android.support.v4.text.PrecomputedTextCompat$Params.getTextPaint()>
	//   40   78:invokevirtual   #452 <Method void TextPaint.set(TextPaint)>
			textview.setBreakStrategy(params.getBreakStrategy());
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #458 <Method int android.support.v4.text.PrecomputedTextCompat$Params.getBreakStrategy()>
	//   44   86:invokevirtual   #460 <Method void TextView.setBreakStrategy(int)>
			textview.setHyphenationFrequency(params.getHyphenationFrequency());
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:invokevirtual   #461 <Method int android.support.v4.text.PrecomputedTextCompat$Params.getHyphenationFrequency()>
	//   48   94:invokevirtual   #463 <Method void TextView.setHyphenationFrequency(int)>
			return;
	//   49   97:return          
		}
	}

	public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textview, android.view.ActionMode.Callback callback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26 && android.os.Build.VERSION.SDK_INT <= 27)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          35
	//*   3    8:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          27
	//*   5   13:icmpgt          35
		{
			if(callback instanceof OreoCallback)
	//*   6   16:aload_1         
	//*   7   17:instanceof      #9   <Class TextViewCompat$OreoCallback>
	//*   8   20:ifeq            25
				return callback;
	//    9   23:aload_1         
	//   10   24:areturn         
			else
				return ((android.view.ActionMode.Callback) (new OreoCallback(callback, textview)));
	//   11   25:new             #9   <Class TextViewCompat$OreoCallback>
	//   12   28:dup             
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:invokespecial   #469 <Method void TextViewCompat$OreoCallback(android.view.ActionMode$Callback, TextView)>
	//   16   34:areturn         
		} else
		{
			return callback;
	//   17   35:aload_1         
	//   18   36:areturn         
		}
	}

	public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
	public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
	private static final int LINES = 1;
	private static final String LOG_TAG = "TextViewCompat";
	private static Field sMaxModeField;
	private static boolean sMaxModeFieldFetched;
	private static Field sMaximumField;
	private static boolean sMaximumFieldFetched;
	private static Field sMinModeField;
	private static boolean sMinModeFieldFetched;
	private static Field sMinimumField;
	private static boolean sMinimumFieldFetched;
}
