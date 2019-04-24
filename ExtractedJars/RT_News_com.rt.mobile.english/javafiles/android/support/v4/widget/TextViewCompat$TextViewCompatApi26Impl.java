// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.text.Editable;
import android.view.*;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi26Impl extends TextViewCompat$TextViewCompatApi23Impl
{

	public void setCustomSelectionActionModeCallback(final TextView textView, final android.view.ActionMode.Callback callback)
	{
		if(android.os.Build.VERSION.SDK_INT != 26 && android.os.Build.VERSION.SDK_INT != 27)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpeq          23
	//*   3    8:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          27
	//*   5   13:icmpeq          23
		{
			super.setCustomSelectionActionModeCallback(textView, callback);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokespecial   #27  <Method void TextViewCompat$TextViewCompatApi23Impl.setCustomSelectionActionModeCallback(TextView, android.view.ActionMode$Callback)>
			return;
	//   10   22:return          
		} else
		{
			textView.setCustomSelectionActionModeCallback(new android.view.ActionMode.Callback() {

				private Intent createProcessTextIntent()
				{
					return (new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
				//    0    0:new             #48  <Class Intent>
				//    1    3:dup             
				//    2    4:invokespecial   #49  <Method void Intent()>
				//    3    7:ldc1            #51  <String "android.intent.action.PROCESS_TEXT">
				//    4    9:invokevirtual   #55  <Method Intent Intent.setAction(String)>
				//    5   12:ldc1            #57  <String "text/plain">
				//    6   14:invokevirtual   #60  <Method Intent Intent.setType(String)>
				//    7   17:areturn         
				}

				private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveinfo, TextView textview)
				{
					return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", isEditable(textview) ^ true).setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
				//    0    0:aload_0         
				//    1    1:invokespecial   #64  <Method Intent createProcessTextIntent()>
				//    2    4:ldc1            #66  <String "android.intent.extra.PROCESS_TEXT_READONLY">
				//    3    6:aload_0         
				//    4    7:aload_2         
				//    5    8:invokespecial   #70  <Method boolean isEditable(TextView)>
				//    6   11:iconst_1        
				//    7   12:ixor            
				//    8   13:invokevirtual   #74  <Method Intent Intent.putExtra(String, boolean)>
				//    9   16:aload_1         
				//   10   17:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//   11   20:getfield        #86  <Field String ActivityInfo.packageName>
				//   12   23:aload_1         
				//   13   24:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//   14   27:getfield        #89  <Field String ActivityInfo.name>
				//   15   30:invokevirtual   #93  <Method Intent Intent.setClassName(String, String)>
				//   16   33:areturn         
				}

				private List getSupportedActivities(Context context, PackageManager packagemanager)
				{
					ArrayList arraylist = new ArrayList();
				//    0    0:new             #97  <Class ArrayList>
				//    1    3:dup             
				//    2    4:invokespecial   #98  <Method void ArrayList()>
				//    3    7:astore_3        
					if(!(context instanceof Activity))
				//*   4    8:aload_1         
				//*   5    9:instanceof      #100 <Class Activity>
				//*   6   12:ifne            17
						return ((List) (arraylist));
				//    7   15:aload_3         
				//    8   16:areturn         
					packagemanager = ((PackageManager) (packagemanager.queryIntentActivities(createProcessTextIntent(), 0).iterator()));
				//    9   17:aload_2         
				//   10   18:aload_0         
				//   11   19:invokespecial   #64  <Method Intent createProcessTextIntent()>
				//   12   22:iconst_0        
				//   13   23:invokevirtual   #106 <Method List PackageManager.queryIntentActivities(Intent, int)>
				//   14   26:invokeinterface #112 <Method Iterator List.iterator()>
				//   15   31:astore_2        
					do
					{
						if(!((Iterator) (packagemanager)).hasNext())
							break;
				//   16   32:aload_2         
				//   17   33:invokeinterface #118 <Method boolean Iterator.hasNext()>
				//   18   38:ifeq            74
						ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (packagemanager)).next();
				//   19   41:aload_2         
				//   20   42:invokeinterface #122 <Method Object Iterator.next()>
				//   21   47:checkcast       #76  <Class ResolveInfo>
				//   22   50:astore          4
						if(isSupportedActivity(resolveinfo, context))
				//*  23   52:aload_0         
				//*  24   53:aload           4
				//*  25   55:aload_1         
				//*  26   56:invokespecial   #126 <Method boolean isSupportedActivity(ResolveInfo, Context)>
				//*  27   59:ifeq            32
							((List) (arraylist)).add(((Object) (resolveinfo)));
				//   28   62:aload_3         
				//   29   63:aload           4
				//   30   65:invokeinterface #130 <Method boolean List.add(Object)>
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
				//    1    1:instanceof      #134 <Class Editable>
				//    2    4:ifeq            23
				//    3    7:aload_1         
				//    4    8:invokevirtual   #139 <Method boolean TextView.onCheckIsTextEditor()>
				//    5   11:ifeq            23
				//    6   14:aload_1         
				//    7   15:invokevirtual   #142 <Method boolean TextView.isEnabled()>
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
				//    1    1:invokevirtual   #148 <Method String Context.getPackageName()>
				//    2    4:aload_1         
				//    3    5:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//    4    8:getfield        #86  <Field String ActivityInfo.packageName>
				//    5   11:invokevirtual   #153 <Method boolean String.equals(Object)>
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
				//*  14   26:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//*  15   29:getfield        #156 <Field boolean ActivityInfo.exported>
				//*  16   32:ifne            37
						return false;
				//   17   35:iconst_0        
				//   18   36:ireturn         
					if(resolveinfo.activityInfo.permission != null)
				//*  19   37:aload_1         
				//*  20   38:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//*  21   41:getfield        #159 <Field String ActivityInfo.permission>
				//*  22   44:ifnull          65
					{
						if(context.checkSelfPermission(resolveinfo.activityInfo.permission) == 0)
				//*  23   47:aload_2         
				//*  24   48:aload_1         
				//*  25   49:getfield        #80  <Field ActivityInfo ResolveInfo.activityInfo>
				//*  26   52:getfield        #159 <Field String ActivityInfo.permission>
				//*  27   55:invokevirtual   #163 <Method int Context.checkSelfPermission(String)>
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
					obj2 = ((Object) (textView.getContext()));
				//    0    0:aload_0         
				//    1    1:getfield        #38  <Field TextView val$textView>
				//    2    4:invokevirtual   #177 <Method Context TextView.getContext()>
				//    3    7:astore          5
					packagemanager = ((Context) (obj2)).getPackageManager();
				//    4    9:aload           5
				//    5   11:invokevirtual   #181 <Method PackageManager Context.getPackageManager()>
				//    6   14:astore          4
					if(mInitializedMenuBuilderReferences)
						break MISSING_BLOCK_LABEL_83;
				//    7   16:aload_0         
				//    8   17:getfield        #43  <Field boolean mInitializedMenuBuilderReferences>
				//    9   20:ifne            83
					mInitializedMenuBuilderReferences = true;
				//   10   23:aload_0         
				//   11   24:iconst_1        
				//   12   25:putfield        #43  <Field boolean mInitializedMenuBuilderReferences>
					try
					{
						mMenuBuilderClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
				//   13   28:aload_0         
				//   14   29:ldc1            #183 <String "com.android.internal.view.menu.MenuBuilder">
				//   15   31:invokestatic    #189 <Method Class Class.forName(String)>
				//   16   34:putfield        #191 <Field Class mMenuBuilderClass>
						mMenuBuilderRemoveItemAtMethod = mMenuBuilderClass.getDeclaredMethod("removeItemAt", new Class[] {
							Integer.TYPE
						});
				//   17   37:aload_0         
				//   18   38:aload_0         
				//   19   39:getfield        #191 <Field Class mMenuBuilderClass>
				//   20   42:ldc1            #193 <String "removeItemAt">
				//   21   44:iconst_1        
				//   22   45:anewarray       Class[]
				//   23   48:dup             
				//   24   49:iconst_0        
				//   25   50:getstatic       #198 <Field Class Integer.TYPE>
				//   26   53:aastore         
				//   27   54:invokevirtual   #202 <Method Method Class.getDeclaredMethod(String, Class[])>
				//   28   57:putfield        #204 <Field Method mMenuBuilderRemoveItemAtMethod>
						mCanUseMenuBuilderReferences = true;
				//   29   60:aload_0         
				//   30   61:iconst_1        
				//   31   62:putfield        #206 <Field boolean mCanUseMenuBuilderReferences>
					}
				//*  32   65:goto            83
				//*  33   68:aload_0         
				//*  34   69:aconst_null     
				//*  35   70:putfield        #191 <Field Class mMenuBuilderClass>
				//*  36   73:aload_0         
				//*  37   74:aconst_null     
				//*  38   75:putfield        #204 <Field Method mMenuBuilderRemoveItemAtMethod>
				//*  39   78:aload_0         
				//*  40   79:iconst_0        
				//*  41   80:putfield        #206 <Field boolean mCanUseMenuBuilderReferences>
				//*  42   83:aload_0         
				//*  43   84:getfield        #206 <Field boolean mCanUseMenuBuilderReferences>
				//*  44   87:ifeq            109
				//*  45   90:aload_0         
				//*  46   91:getfield        #191 <Field Class mMenuBuilderClass>
				//*  47   94:aload_1         
				//*  48   95:invokevirtual   #209 <Method boolean Class.isInstance(Object)>
				//*  49   98:ifeq            109
				//*  50  101:aload_0         
				//*  51  102:getfield        #204 <Field Method mMenuBuilderRemoveItemAtMethod>
				//*  52  105:astore_3        
				//*  53  106:goto            129
				//*  54  109:aload_1         
				//*  55  110:invokevirtual   #213 <Method Class Object.getClass()>
				//*  56  113:ldc1            #193 <String "removeItemAt">
				//*  57  115:iconst_1        
				//*  58  116:anewarray       Class[]
				//*  59  119:dup             
				//*  60  120:iconst_0        
				//*  61  121:getstatic       #198 <Field Class Integer.TYPE>
				//*  62  124:aastore         
				//*  63  125:invokevirtual   #202 <Method Method Class.getDeclaredMethod(String, Class[])>
				//*  64  128:astore_3        
				//*  65  129:aload_1         
				//*  66  130:invokeinterface #219 <Method int Menu.size()>
				//*  67  135:iconst_1        
				//*  68  136:isub            
				//*  69  137:istore_2        
				//*  70  138:iload_2         
				//*  71  139:iflt            203
				//*  72  142:aload_1         
				//*  73  143:iload_2         
				//*  74  144:invokeinterface #223 <Method MenuItem Menu.getItem(int)>
				//*  75  149:astore          6
				//*  76  151:aload           6
				//*  77  153:invokeinterface #228 <Method Intent MenuItem.getIntent()>
				//*  78  158:ifnull          196
				//*  79  161:ldc1            #51  <String "android.intent.action.PROCESS_TEXT">
				//*  80  163:aload           6
				//*  81  165:invokeinterface #228 <Method Intent MenuItem.getIntent()>
				//*  82  170:invokevirtual   #231 <Method String Intent.getAction()>
				//*  83  173:invokevirtual   #153 <Method boolean String.equals(Object)>
				//*  84  176:ifeq            196
				//*  85  179:aload_3         
				//*  86  180:aload_1         
				//*  87  181:iconst_1        
				//*  88  182:anewarray       Object[]
				//*  89  185:dup             
				//*  90  186:iconst_0        
				//*  91  187:iload_2         
				//*  92  188:invokestatic    #235 <Method Integer Integer.valueOf(int)>
				//*  93  191:aastore         
				//*  94  192:invokevirtual   #241 <Method Object Method.invoke(Object, Object[])>
				//*  95  195:pop             
				//*  96  196:iload_2         
				//*  97  197:iconst_1        
				//*  98  198:isub            
				//*  99  199:istore_2        
				//* 100  200:goto            138
				//* 101  203:aload_0         
				//* 102  204:aload           5
				//* 103  206:aload           4
				//* 104  208:invokespecial   #243 <Method List getSupportedActivities(Context, PackageManager)>
				//* 105  211:astore_3        
				//* 106  212:iconst_0        
				//* 107  213:istore_2        
				//* 108  214:iload_2         
				//* 109  215:aload_3         
				//* 110  216:invokeinterface #244 <Method int List.size()>
				//* 111  221:icmpge          283
				//* 112  224:aload_3         
				//* 113  225:iload_2         
				//* 114  226:invokeinterface #248 <Method Object List.get(int)>
				//* 115  231:checkcast       #76  <Class ResolveInfo>
				//* 116  234:astore          5
				//* 117  236:aload_1         
				//* 118  237:iconst_0        
				//* 119  238:iconst_0        
				//* 120  239:bipush          100
				//* 121  241:iload_2         
				//* 122  242:iadd            
				//* 123  243:aload           5
				//* 124  245:aload           4
				//* 125  247:invokevirtual   #252 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
				//* 126  250:invokeinterface #255 <Method MenuItem Menu.add(int, int, int, CharSequence)>
				//* 127  255:aload_0         
				//* 128  256:aload           5
				//* 129  258:aload_0         
				//* 130  259:getfield        #38  <Field TextView val$textView>
				//* 131  262:invokespecial   #257 <Method Intent createProcessTextIntentForResolveInfo(ResolveInfo, TextView)>
				//* 132  265:invokeinterface #261 <Method MenuItem MenuItem.setIntent(Intent)>
				//* 133  270:iconst_1        
				//* 134  271:invokeinterface #265 <Method void MenuItem.setShowAsAction(int)>
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
						menu.add(0, 0, 100 + i, ((ResolveInfo) (obj2)).loadLabel(packagemanager)).setIntent(createProcessTextIntentForResolveInfo(((ResolveInfo) (obj2)), textView)).setShowAsAction(1);
					}

					return;
				}

				public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
				{
					return callback.onActionItemClicked(actionmode, menuitem);
				//    0    0:aload_0         
				//    1    1:getfield        #36  <Field android.view.ActionMode$Callback val$callback>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokeinterface #269 <Method boolean android.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
				//    5   11:ireturn         
				}

				public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
				{
					return callback.onCreateActionMode(actionmode, menu);
				//    0    0:aload_0         
				//    1    1:getfield        #36  <Field android.view.ActionMode$Callback val$callback>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokeinterface #273 <Method boolean android.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
				//    5   11:ireturn         
				}

				public void onDestroyActionMode(ActionMode actionmode)
				{
					callback.onDestroyActionMode(actionmode);
				//    0    0:aload_0         
				//    1    1:getfield        #36  <Field android.view.ActionMode$Callback val$callback>
				//    2    4:aload_1         
				//    3    5:invokeinterface #277 <Method void android.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
				//    4   10:return          
				}

				public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
				{
					recomputeProcessTextMenuItems(menu);
				//    0    0:aload_0         
				//    1    1:aload_2         
				//    2    2:invokespecial   #280 <Method void recomputeProcessTextMenuItems(Menu)>
					return callback.onPrepareActionMode(actionmode, menu);
				//    3    5:aload_0         
				//    4    6:getfield        #36  <Field android.view.ActionMode$Callback val$callback>
				//    5    9:aload_1         
				//    6   10:aload_2         
				//    7   11:invokeinterface #282 <Method boolean android.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
				//    8   16:ireturn         
				}

				private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
				private boolean mCanUseMenuBuilderReferences;
				private boolean mInitializedMenuBuilderReferences;
				private Class mMenuBuilderClass;
				private Method mMenuBuilderRemoveItemAtMethod;
				final TextViewCompat.TextViewCompatApi26Impl this$0;
				final android.view.ActionMode.Callback val$callback;
				final TextView val$textView;

			
			{
				this$0 = TextViewCompat.TextViewCompatApi26Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field TextViewCompat$TextViewCompatApi26Impl this$0>
				callback = callback1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field android.view.ActionMode$Callback val$callback>
				textView = textview;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #38  <Field TextView val$textView>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #41  <Method void Object()>
				mInitializedMenuBuilderReferences = false;
			//   11   19:aload_0         
			//   12   20:iconst_0        
			//   13   21:putfield        #43  <Field boolean mInitializedMenuBuilderReferences>
			//   14   24:return          
			}
			}
);
	//   11   23:aload_1         
	//   12   24:new             #9   <Class TextViewCompat$TextViewCompatApi26Impl$1>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokespecial   #30  <Method void TextViewCompat$TextViewCompatApi26Impl$1(TextViewCompat$TextViewCompatApi26Impl, android.view.ActionMode$Callback, TextView)>
	//   18   34:invokevirtual   #35  <Method void TextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
			return;
	//   19   37:return          
		}
	}

	TextViewCompat$TextViewCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void TextViewCompat$TextViewCompatApi23Impl()>
	//    2    4:return          
	}
}
