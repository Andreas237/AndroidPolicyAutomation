// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.graphics.drawable.Drawable;
import android.support.v4.os.BuildCompat;
import android.text.Editable;
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

	static class TextViewCompatApi16Impl extends TextViewCompatBaseImpl
	{

		public int getMaxLines(TextView textview)
		{
			return textview.getMaxLines();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int TextView.getMaxLines()>
		//    2    4:ireturn         
		}

		public int getMinLines(TextView textview)
		{
			return textview.getMinLines();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int TextView.getMinLines()>
		//    2    4:ireturn         
		}

		TextViewCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi17Impl extends TextViewCompatApi16Impl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			int i = textview.getLayoutDirection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//    2    4:istore_3        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_2        
			if(i != 1)
		//*   5    7:iload_3         
		//*   6    8:iconst_1        
		//*   7    9:icmpne          15
		//*   8   12:goto            17
				flag = false;
		//    9   15:iconst_0        
		//   10   16:istore_2        
			textview = ((TextView) (textview.getCompoundDrawables()));
		//   11   17:aload_1         
		//   12   18:invokevirtual   #28  <Method Drawable[] TextView.getCompoundDrawables()>
		//   13   21:astore_1        
			if(flag)
		//*  14   22:iload_2         
		//*  15   23:ifeq            46
			{
				Object obj = textview[2];
		//   16   26:aload_1         
		//   17   27:iconst_2        
		//   18   28:aaload          
		//   19   29:astore          4
				Object obj1 = textview[0];
		//   20   31:aload_1         
		//   21   32:iconst_0        
		//   22   33:aaload          
		//   23   34:astore          5
				textview[0] = obj;
		//   24   36:aload_1         
		//   25   37:iconst_0        
		//   26   38:aload           4
		//   27   40:aastore         
				textview[2] = obj1;
		//   28   41:aload_1         
		//   29   42:iconst_2        
		//   30   43:aload           5
		//   31   45:aastore         
			}
			return ((Drawable []) (textview));
		//   32   46:aload_1         
		//   33   47:areturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			int i = textview.getLayoutDirection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//    2    4:istore          7
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore          6
			if(i != 1)
		//*   5    9:iload           7
		//*   6   11:iconst_1        
		//*   7   12:icmpne          18
		//*   8   15:goto            21
				flag = false;
		//    9   18:iconst_0        
		//   10   19:istore          6
			Drawable drawable4;
			if(flag)
		//*  11   21:iload           6
		//*  12   23:ifeq            33
				drawable4 = drawable2;
		//   13   26:aload           4
		//   14   28:astore          8
			else
		//*  15   30:goto            36
				drawable4 = drawable;
		//   16   33:aload_2         
		//   17   34:astore          8
			if(!flag)
		//*  18   36:iload           6
		//*  19   38:ifeq            44
		//*  20   41:goto            47
				drawable = drawable2;
		//   21   44:aload           4
		//   22   46:astore_2        
			textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
		//   23   47:aload_1         
		//   24   48:aload           8
		//   25   50:aload_3         
		//   26   51:aload_2         
		//   27   52:aload           5
		//   28   54:invokevirtual   #36  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		//   29   57:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			int i1 = textview.getLayoutDirection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//    2    4:istore          7
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore          6
			if(i1 != 1)
		//*   5    9:iload           7
		//*   6   11:iconst_1        
		//*   7   12:icmpne          18
		//*   8   15:goto            21
				flag = false;
		//    9   18:iconst_0        
		//   10   19:istore          6
			if(flag)
		//*  11   21:iload           6
		//*  12   23:ifeq            33
				i1 = k;
		//   13   26:iload           4
		//   14   28:istore          7
			else
		//*  15   30:goto            36
				i1 = i;
		//   16   33:iload_2         
		//   17   34:istore          7
			if(!flag)
		//*  18   36:iload           6
		//*  19   38:ifeq            44
		//*  20   41:goto            47
				i = k;
		//   21   44:iload           4
		//   22   46:istore_2        
			textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
		//   23   47:aload_1         
		//   24   48:iload           7
		//   25   50:iload_3         
		//   26   51:iload_2         
		//   27   52:iload           5
		//   28   54:invokevirtual   #43  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		//   29   57:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			int i = textview.getLayoutDirection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//    2    4:istore          7
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore          6
			if(i != 1)
		//*   5    9:iload           7
		//*   6   11:iconst_1        
		//*   7   12:icmpne          18
		//*   8   15:goto            21
				flag = false;
		//    9   18:iconst_0        
		//   10   19:istore          6
			Drawable drawable4;
			if(flag)
		//*  11   21:iload           6
		//*  12   23:ifeq            33
				drawable4 = drawable2;
		//   13   26:aload           4
		//   14   28:astore          8
			else
		//*  15   30:goto            36
				drawable4 = drawable;
		//   16   33:aload_2         
		//   17   34:astore          8
			if(!flag)
		//*  18   36:iload           6
		//*  19   38:ifeq            44
		//*  20   41:goto            47
				drawable = drawable2;
		//   21   44:aload           4
		//   22   46:astore_2        
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
		//   23   47:aload_1         
		//   24   48:aload           8
		//   25   50:aload_3         
		//   26   51:aload_2         
		//   27   52:aload           5
		//   28   54:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//   29   57:return          
		}

		TextViewCompatApi17Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi18Impl extends TextViewCompatApi17Impl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return textview.getCompoundDrawablesRelative();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #23  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
		//    2    4:areturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #30  <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #36  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #38  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		TextViewCompatApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi17Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi23Impl extends TextViewCompatApi18Impl
	{

		public void setTextAppearance(TextView textview, int i)
		{
			textview.setTextAppearance(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #24  <Method void TextView.setTextAppearance(int)>
		//    3    5:return          
		}

		TextViewCompatApi23Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi18Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi26Impl extends TextViewCompatApi23Impl
	{

		public void setCustomSelectionActionModeCallback(TextView textview, final android.view.ActionMode.Callback callback)
		{
			if(android.os.Build.VERSION.SDK_INT != 26 && android.os.Build.VERSION.SDK_INT != 27)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          26
		//*   2    5:icmpeq          23
		//*   3    8:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   11:bipush          27
		//*   5   13:icmpeq          23
			{
				super.setCustomSelectionActionModeCallback(textview, callback);
		//    6   16:aload_0         
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokespecial   #27  <Method void TextViewCompat$TextViewCompatApi23Impl.setCustomSelectionActionModeCallback(TextView, android.view.ActionMode$Callback)>
				return;
		//   10   22:return          
			} else
			{
				textview.setCustomSelectionActionModeCallback(((_cls1) (textview)). new android.view.ActionMode.Callback() {

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
					final TextViewCompatApi26Impl this$0;
					final android.view.ActionMode.Callback val$callback;
					final TextView val$textView;

			
			{
				this$0 = final_textviewcompatapi26impl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field TextViewCompat$TextViewCompatApi26Impl this$0>
				callback = callback1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field android.view.ActionMode$Callback val$callback>
				textView = TextView.this;
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

		TextViewCompatApi26Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void TextViewCompat$TextViewCompatApi23Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi27Impl extends TextViewCompatApi26Impl
	{

		public int getAutoSizeMaxTextSize(TextView textview)
		{
			return textview.getAutoSizeMaxTextSize();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int TextView.getAutoSizeMaxTextSize()>
		//    2    4:ireturn         
		}

		public int getAutoSizeMinTextSize(TextView textview)
		{
			return textview.getAutoSizeMinTextSize();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int TextView.getAutoSizeMinTextSize()>
		//    2    4:ireturn         
		}

		public int getAutoSizeStepGranularity(TextView textview)
		{
			return textview.getAutoSizeStepGranularity();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #28  <Method int TextView.getAutoSizeStepGranularity()>
		//    2    4:ireturn         
		}

		public int[] getAutoSizeTextAvailableSizes(TextView textview)
		{
			return textview.getAutoSizeTextAvailableSizes();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
		//    2    4:areturn         
		}

		public int getAutoSizeTextType(TextView textview)
		{
			return textview.getAutoSizeTextType();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method int TextView.getAutoSizeTextType()>
		//    2    4:ireturn         
		}

		public void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
			throws IllegalArgumentException
		{
			textview.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #43  <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
		//    6   10:return          
		}

		public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
			throws IllegalArgumentException
		{
			textview.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokevirtual   #50  <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		//    4    6:return          
		}

		public void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
		{
			textview.setAutoSizeTextTypeWithDefaults(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #56  <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
		//    3    5:return          
		}

		TextViewCompatApi27Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi26Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatBaseImpl
	{

		private static Field retrieveField(String s)
		{
			Field field = ((Class) (android/widget/TextView)).getDeclaredField(s);
		//    0    0:ldc1            #35  <Class TextView>
		//    1    2:aload_0         
		//    2    3:invokevirtual   #40  <Method Field Class.getDeclaredField(String)>
		//    3    6:astore_1        
			field.setAccessible(true);
		//    4    7:aload_1         
		//    5    8:iconst_1        
		//    6    9:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
			return field;
		//    7   12:aload_1         
		//    8   13:areturn         
_L1:
			field = null;
		//    9   14:aconst_null     
		//   10   15:astore_1        
_L2:
			StringBuilder stringbuilder = new StringBuilder();
		//   11   16:new             #48  <Class StringBuilder>
		//   12   19:dup             
		//   13   20:invokespecial   #49  <Method void StringBuilder()>
		//   14   23:astore_2        
			stringbuilder.append("Could not retrieve ");
		//   15   24:aload_2         
		//   16   25:ldc1            #51  <String "Could not retrieve ">
		//   17   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   18   30:pop             
			stringbuilder.append(s);
		//   19   31:aload_2         
		//   20   32:aload_0         
		//   21   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   22   36:pop             
			stringbuilder.append(" field.");
		//   23   37:aload_2         
		//   24   38:ldc1            #57  <String " field.">
		//   25   40:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   26   43:pop             
			Log.e("TextViewCompatBase", stringbuilder.toString());
		//   27   44:ldc1            #14  <String "TextViewCompatBase">
		//   28   46:aload_2         
		//   29   47:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   30   50:invokestatic    #67  <Method int Log.e(String, String)>
		//   31   53:pop             
			return field;
		//   32   54:aload_1         
		//   33   55:areturn         
			NoSuchFieldException nosuchfieldexception;
			nosuchfieldexception;
		//   34   56:astore_1        
			  goto _L1
		//*  35   57:goto            14
			NoSuchFieldException nosuchfieldexception1;
			nosuchfieldexception1;
		//   36   60:astore_2        
			  goto _L2
		//*  37   61:goto            16
		}

		private static int retrieveIntFromField(Field field, TextView textview)
		{
			int i;
			try
			{
				i = field.getInt(((Object) (textview)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #75  <Method int Field.getInt(Object)>
		//    3    5:istore_2        
			}
		//*   4    6:iload_2         
		//*   5    7:ireturn         
		//*   6    8:new             #48  <Class StringBuilder>
		//*   7   11:dup             
		//*   8   12:invokespecial   #49  <Method void StringBuilder()>
		//*   9   15:astore_1        
		//*  10   16:aload_1         
		//*  11   17:ldc1            #77  <String "Could not retrieve value of ">
		//*  12   19:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//*  13   22:pop             
		//*  14   23:aload_1         
		//*  15   24:aload_0         
		//*  16   25:invokevirtual   #80  <Method String Field.getName()>
		//*  17   28:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//*  18   31:pop             
		//*  19   32:aload_1         
		//*  20   33:ldc1            #57  <String " field.">
		//*  21   35:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//*  22   38:pop             
		//*  23   39:ldc1            #14  <String "TextViewCompatBase">
		//*  24   41:aload_1         
		//*  25   42:invokevirtual   #61  <Method String StringBuilder.toString()>
		//*  26   45:invokestatic    #83  <Method int Log.d(String, String)>
		//*  27   48:pop             
		//*  28   49:iconst_m1       
		//*  29   50:ireturn         
			// Misplaced declaration of an exception variable
			catch(TextView textview)
			{
				textview = ((TextView) (new StringBuilder()));
				((StringBuilder) (textview)).append("Could not retrieve value of ");
				((StringBuilder) (textview)).append(field.getName());
				((StringBuilder) (textview)).append(" field.");
				Log.d("TextViewCompatBase", ((StringBuilder) (textview)).toString());
				return -1;
			}
			return i;
		//*  30   51:astore_1        
		//*  31   52:goto            8
		}

		public int getAutoSizeMaxTextSize(TextView textview)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				return ((AutoSizeableTextView)textview).getAutoSizeMaxTextSize();
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:invokeinterface #90  <Method int AutoSizeableTextView.getAutoSizeMaxTextSize()>
		//    6   16:ireturn         
			else
				return -1;
		//    7   17:iconst_m1       
		//    8   18:ireturn         
		}

		public int getAutoSizeMinTextSize(TextView textview)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				return ((AutoSizeableTextView)textview).getAutoSizeMinTextSize();
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:invokeinterface #93  <Method int AutoSizeableTextView.getAutoSizeMinTextSize()>
		//    6   16:ireturn         
			else
				return -1;
		//    7   17:iconst_m1       
		//    8   18:ireturn         
		}

		public int getAutoSizeStepGranularity(TextView textview)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				return ((AutoSizeableTextView)textview).getAutoSizeStepGranularity();
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:invokeinterface #96  <Method int AutoSizeableTextView.getAutoSizeStepGranularity()>
		//    6   16:ireturn         
			else
				return -1;
		//    7   17:iconst_m1       
		//    8   18:ireturn         
		}

		public int[] getAutoSizeTextAvailableSizes(TextView textview)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				return ((AutoSizeableTextView)textview).getAutoSizeTextAvailableSizes();
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:invokeinterface #101 <Method int[] AutoSizeableTextView.getAutoSizeTextAvailableSizes()>
		//    6   16:areturn         
			else
				return new int[0];
		//    7   17:iconst_0        
		//    8   18:newarray        int[]
		//    9   20:areturn         
		}

		public int getAutoSizeTextType(TextView textview)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				return ((AutoSizeableTextView)textview).getAutoSizeTextType();
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:invokeinterface #104 <Method int AutoSizeableTextView.getAutoSizeTextType()>
		//    6   16:ireturn         
			else
				return 0;
		//    7   17:iconst_0        
		//    8   18:ireturn         
		}

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return textview.getCompoundDrawables();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #111 <Method Drawable[] TextView.getCompoundDrawables()>
		//    2    4:areturn         
		}

		public int getMaxLines(TextView textview)
		{
			if(!sMaxModeFieldFetched)
		//*   0    0:getstatic       #115 <Field boolean sMaxModeFieldFetched>
		//*   1    3:ifne            18
			{
				sMaxModeField = retrieveField("mMaxMode");
		//    2    6:ldc1            #117 <String "mMaxMode">
		//    3    8:invokestatic    #119 <Method Field retrieveField(String)>
		//    4   11:putstatic       #121 <Field Field sMaxModeField>
				sMaxModeFieldFetched = true;
		//    5   14:iconst_1        
		//    6   15:putstatic       #115 <Field boolean sMaxModeFieldFetched>
			}
			if(sMaxModeField != null && retrieveIntFromField(sMaxModeField, textview) == 1)
		//*   7   18:getstatic       #121 <Field Field sMaxModeField>
		//*   8   21:ifnull          67
		//*   9   24:getstatic       #121 <Field Field sMaxModeField>
		//*  10   27:aload_1         
		//*  11   28:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
		//*  12   31:iconst_1        
		//*  13   32:icmpne          67
			{
				if(!sMaximumFieldFetched)
		//*  14   35:getstatic       #125 <Field boolean sMaximumFieldFetched>
		//*  15   38:ifne            53
				{
					sMaximumField = retrieveField("mMaximum");
		//   16   41:ldc1            #127 <String "mMaximum">
		//   17   43:invokestatic    #119 <Method Field retrieveField(String)>
		//   18   46:putstatic       #129 <Field Field sMaximumField>
					sMaximumFieldFetched = true;
		//   19   49:iconst_1        
		//   20   50:putstatic       #125 <Field boolean sMaximumFieldFetched>
				}
				if(sMaximumField != null)
		//*  21   53:getstatic       #129 <Field Field sMaximumField>
		//*  22   56:ifnull          67
					return retrieveIntFromField(sMaximumField, textview);
		//   23   59:getstatic       #129 <Field Field sMaximumField>
		//   24   62:aload_1         
		//   25   63:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
		//   26   66:ireturn         
			}
			return -1;
		//   27   67:iconst_m1       
		//   28   68:ireturn         
		}

		public int getMinLines(TextView textview)
		{
			if(!sMinModeFieldFetched)
		//*   0    0:getstatic       #132 <Field boolean sMinModeFieldFetched>
		//*   1    3:ifne            18
			{
				sMinModeField = retrieveField("mMinMode");
		//    2    6:ldc1            #134 <String "mMinMode">
		//    3    8:invokestatic    #119 <Method Field retrieveField(String)>
		//    4   11:putstatic       #136 <Field Field sMinModeField>
				sMinModeFieldFetched = true;
		//    5   14:iconst_1        
		//    6   15:putstatic       #132 <Field boolean sMinModeFieldFetched>
			}
			if(sMinModeField != null && retrieveIntFromField(sMinModeField, textview) == 1)
		//*   7   18:getstatic       #136 <Field Field sMinModeField>
		//*   8   21:ifnull          67
		//*   9   24:getstatic       #136 <Field Field sMinModeField>
		//*  10   27:aload_1         
		//*  11   28:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
		//*  12   31:iconst_1        
		//*  13   32:icmpne          67
			{
				if(!sMinimumFieldFetched)
		//*  14   35:getstatic       #138 <Field boolean sMinimumFieldFetched>
		//*  15   38:ifne            53
				{
					sMinimumField = retrieveField("mMinimum");
		//   16   41:ldc1            #140 <String "mMinimum">
		//   17   43:invokestatic    #119 <Method Field retrieveField(String)>
		//   18   46:putstatic       #142 <Field Field sMinimumField>
					sMinimumFieldFetched = true;
		//   19   49:iconst_1        
		//   20   50:putstatic       #138 <Field boolean sMinimumFieldFetched>
				}
				if(sMinimumField != null)
		//*  21   53:getstatic       #142 <Field Field sMinimumField>
		//*  22   56:ifnull          67
					return retrieveIntFromField(sMinimumField, textview);
		//   23   59:getstatic       #142 <Field Field sMinimumField>
		//   24   62:aload_1         
		//   25   63:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
		//   26   66:ireturn         
			}
			return -1;
		//   27   67:iconst_m1       
		//   28   68:ireturn         
		}

		public void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
			throws IllegalArgumentException
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            22
				((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:iload_2         
		//    6   12:iload_3         
		//    7   13:iload           4
		//    8   15:iload           5
		//    9   17:invokeinterface #149 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
		//   10   22:return          
		}

		public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
			throws IllegalArgumentException
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            18
				((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:aload_2         
		//    6   12:iload_3         
		//    7   13:invokeinterface #155 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		//    8   18:return          
		}

		public void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
		{
			if(textview instanceof AutoSizeableTextView)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
		//*   2    4:ifeq            17
				((AutoSizeableTextView)textview).setAutoSizeTextTypeWithDefaults(i);
		//    3    7:aload_1         
		//    4    8:checkcast       #87  <Class AutoSizeableTextView>
		//    5   11:iload_2         
		//    6   12:invokeinterface #160 <Method void AutoSizeableTextView.setAutoSizeTextTypeWithDefaults(int)>
		//    7   17:return          
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #167 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #172 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #174 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCustomSelectionActionModeCallback(TextView textview, android.view.ActionMode.Callback callback)
		{
			textview.setCustomSelectionActionModeCallback(callback);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #179 <Method void TextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
		//    3    5:return          
		}

		public void setTextAppearance(TextView textview, int i)
		{
			textview.setTextAppearance(textview.getContext(), i);
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #185 <Method Context TextView.getContext()>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #188 <Method void TextView.setTextAppearance(Context, int)>
		//    5    9:return          
		}

		private static final int LINES = 1;
		private static final String LOG_TAG = "TextViewCompatBase";
		private static Field sMaxModeField;
		private static boolean sMaxModeFieldFetched;
		private static Field sMaximumField;
		private static boolean sMaximumFieldFetched;
		private static Field sMinModeField;
		private static boolean sMinModeFieldFetched;
		private static Field sMinimumField;
		private static boolean sMinimumFieldFetched;

		TextViewCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}
	}


	private TextViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static int getAutoSizeMaxTextSize(TextView textview)
	{
		return IMPL.getAutoSizeMaxTextSize(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #68  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeMaxTextSize(TextView)>
	//    3    7:ireturn         
	}

	public static int getAutoSizeMinTextSize(TextView textview)
	{
		return IMPL.getAutoSizeMinTextSize(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #72  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeMinTextSize(TextView)>
	//    3    7:ireturn         
	}

	public static int getAutoSizeStepGranularity(TextView textview)
	{
		return IMPL.getAutoSizeStepGranularity(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #75  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeStepGranularity(TextView)>
	//    3    7:ireturn         
	}

	public static int[] getAutoSizeTextAvailableSizes(TextView textview)
	{
		return IMPL.getAutoSizeTextAvailableSizes(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #79  <Method int[] TextViewCompat$TextViewCompatBaseImpl.getAutoSizeTextAvailableSizes(TextView)>
	//    3    7:areturn         
	}

	public static int getAutoSizeTextType(TextView textview)
	{
		return IMPL.getAutoSizeTextType(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #83  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeTextType(TextView)>
	//    3    7:ireturn         
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return IMPL.getCompoundDrawablesRelative(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #87  <Method Drawable[] TextViewCompat$TextViewCompatBaseImpl.getCompoundDrawablesRelative(TextView)>
	//    3    7:areturn         
	}

	public static int getMaxLines(TextView textview)
	{
		return IMPL.getMaxLines(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #90  <Method int TextViewCompat$TextViewCompatBaseImpl.getMaxLines(TextView)>
	//    3    7:ireturn         
	}

	public static int getMinLines(TextView textview)
	{
		return IMPL.getMinLines(textview);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #93  <Method int TextViewCompat$TextViewCompatBaseImpl.getMinLines(TextView)>
	//    3    7:ireturn         
	}

	public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		IMPL.setAutoSizeTextTypeUniformWithConfiguration(textview, i, j, k, l);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #99  <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeUniformWithConfiguration(TextView, int, int, int, int)>
	//    7   12:return          
	}

	public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
		throws IllegalArgumentException
	{
		IMPL.setAutoSizeTextTypeUniformWithPresetSizes(textview, ai, i);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #104 <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeUniformWithPresetSizes(TextView, int[], int)>
	//    5    9:return          
	}

	public static void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
	{
		IMPL.setAutoSizeTextTypeWithDefaults(textview, i);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeWithDefaults(TextView, int)>
	//    4    8:return          
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #113 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   12:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #117 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
	//    7   12:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #119 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   12:return          
	}

	public static void setCustomSelectionActionModeCallback(TextView textview, android.view.ActionMode.Callback callback)
	{
		IMPL.setCustomSelectionActionModeCallback(textview, callback);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method void TextViewCompat$TextViewCompatBaseImpl.setCustomSelectionActionModeCallback(TextView, android.view.ActionMode$Callback)>
	//    4    8:return          
	}

	public static void setTextAppearance(TextView textview, int i)
	{
		IMPL.setTextAppearance(textview, i);
	//    0    0:getstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method void TextViewCompat$TextViewCompatBaseImpl.setTextAppearance(TextView, int)>
	//    4    8:return          
	}

	public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
	public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
	static final TextViewCompatBaseImpl IMPL;

	static 
	{
		if(BuildCompat.isAtLeastOMR1())
	//*   0    0:invokestatic    #45  <Method boolean BuildCompat.isAtLeastOMR1()>
	//*   1    3:ifeq            17
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi27Impl()));
	//    2    6:new             #26  <Class TextViewCompat$TextViewCompatApi27Impl>
	//    3    9:dup             
	//    4   10:invokespecial   #48  <Method void TextViewCompat$TextViewCompatApi27Impl()>
	//    5   13:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    6   16:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          36
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi26Impl()));
	//   10   25:new             #21  <Class TextViewCompat$TextViewCompatApi26Impl>
	//   11   28:dup             
	//   12   29:invokespecial   #56  <Method void TextViewCompat$TextViewCompatApi26Impl()>
	//   13   32:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   14   35:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  15   36:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   39:bipush          23
	//*  17   41:icmplt          55
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi23Impl()));
	//   18   44:new             #18  <Class TextViewCompat$TextViewCompatApi23Impl>
	//   19   47:dup             
	//   20   48:invokespecial   #57  <Method void TextViewCompat$TextViewCompatApi23Impl()>
	//   21   51:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   22   54:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  23   55:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   58:bipush          18
	//*  25   60:icmplt          74
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi18Impl()));
	//   26   63:new             #15  <Class TextViewCompat$TextViewCompatApi18Impl>
	//   27   66:dup             
	//   28   67:invokespecial   #58  <Method void TextViewCompat$TextViewCompatApi18Impl()>
	//   29   70:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   30   73:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  31   74:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  32   77:bipush          17
	//*  33   79:icmplt          93
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi17Impl()));
	//   34   82:new             #12  <Class TextViewCompat$TextViewCompatApi17Impl>
	//   35   85:dup             
	//   36   86:invokespecial   #59  <Method void TextViewCompat$TextViewCompatApi17Impl()>
	//   37   89:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   38   92:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  39   93:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  40   96:bipush          16
	//*  41   98:icmplt          112
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi16Impl()));
	//   42  101:new             #9   <Class TextViewCompat$TextViewCompatApi16Impl>
	//   43  104:dup             
	//   44  105:invokespecial   #60  <Method void TextViewCompat$TextViewCompatApi16Impl()>
	//   45  108:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   46  111:return          
		else
			IMPL = new TextViewCompatBaseImpl();
	//   47  112:new             #29  <Class TextViewCompat$TextViewCompatBaseImpl>
	//   48  115:dup             
	//   49  116:invokespecial   #61  <Method void TextViewCompat$TextViewCompatBaseImpl()>
	//   50  119:putstatic       #50  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//*  51  122:return          
	}
}
