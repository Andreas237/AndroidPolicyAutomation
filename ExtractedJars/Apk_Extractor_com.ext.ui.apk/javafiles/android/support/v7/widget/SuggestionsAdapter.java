// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.*;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SuggestionsAdapter extends ResourceCursorAdapter
	implements android.view.View.OnClickListener
{
	private static final class ChildViewCache
	{

		public final ImageView mIcon1;
		public final ImageView mIcon2;
		public final ImageView mIconRefine;
		public final TextView mText1;
		public final TextView mText2;

		public ChildViewCache(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mText1 = (TextView)view.findViewById(0x1020014);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #20  <Int 0x1020014>
		//    5    8:invokevirtual   #26  <Method View View.findViewById(int)>
		//    6   11:checkcast       #28  <Class TextView>
		//    7   14:putfield        #30  <Field TextView mText1>
			mText2 = (TextView)view.findViewById(0x1020015);
		//    8   17:aload_0         
		//    9   18:aload_1         
		//   10   19:ldc1            #31  <Int 0x1020015>
		//   11   21:invokevirtual   #26  <Method View View.findViewById(int)>
		//   12   24:checkcast       #28  <Class TextView>
		//   13   27:putfield        #33  <Field TextView mText2>
			mIcon1 = (ImageView)view.findViewById(0x1020007);
		//   14   30:aload_0         
		//   15   31:aload_1         
		//   16   32:ldc1            #34  <Int 0x1020007>
		//   17   34:invokevirtual   #26  <Method View View.findViewById(int)>
		//   18   37:checkcast       #36  <Class ImageView>
		//   19   40:putfield        #38  <Field ImageView mIcon1>
			mIcon2 = (ImageView)view.findViewById(0x1020008);
		//   20   43:aload_0         
		//   21   44:aload_1         
		//   22   45:ldc1            #39  <Int 0x1020008>
		//   23   47:invokevirtual   #26  <Method View View.findViewById(int)>
		//   24   50:checkcast       #36  <Class ImageView>
		//   25   53:putfield        #41  <Field ImageView mIcon2>
			mIconRefine = (ImageView)view.findViewById(android.support.v7.appcompat.R.id.edit_query);
		//   26   56:aload_0         
		//   27   57:aload_1         
		//   28   58:getstatic       #47  <Field int android.support.v7.appcompat.R$id.edit_query>
		//   29   61:invokevirtual   #26  <Method View View.findViewById(int)>
		//   30   64:checkcast       #36  <Class ImageView>
		//   31   67:putfield        #49  <Field ImageView mIconRefine>
		//   32   70:return          
		}
	}


	public SuggestionsAdapter(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
	{
		super(context, searchview.getSuggestionRowLayout(), ((Cursor) (null)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method int SearchView.getSuggestionRowLayout()>
	//    4    6:aconst_null     
	//    5    7:iconst_1        
	//    6    8:invokespecial   #59  <Method void ResourceCursorAdapter(Context, int, Cursor, boolean)>
		mClosed = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #61  <Field boolean mClosed>
		mQueryRefinement = 1;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #63  <Field int mQueryRefinement>
		mText1Col = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #65  <Field int mText1Col>
		mText2Col = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #67  <Field int mText2Col>
		mText2UrlCol = -1;
	//   19   31:aload_0         
	//   20   32:iconst_m1       
	//   21   33:putfield        #69  <Field int mText2UrlCol>
		mIconName1Col = -1;
	//   22   36:aload_0         
	//   23   37:iconst_m1       
	//   24   38:putfield        #71  <Field int mIconName1Col>
		mIconName2Col = -1;
	//   25   41:aload_0         
	//   26   42:iconst_m1       
	//   27   43:putfield        #73  <Field int mIconName2Col>
		mFlagsCol = -1;
	//   28   46:aload_0         
	//   29   47:iconst_m1       
	//   30   48:putfield        #75  <Field int mFlagsCol>
		mSearchManager = (SearchManager)mContext.getSystemService("search");
	//   31   51:aload_0         
	//   32   52:aload_0         
	//   33   53:getfield        #78  <Field Context mContext>
	//   34   56:ldc1            #80  <String "search">
	//   35   58:invokevirtual   #86  <Method Object Context.getSystemService(String)>
	//   36   61:checkcast       #88  <Class SearchManager>
	//   37   64:putfield        #90  <Field SearchManager mSearchManager>
		mSearchView = searchview;
	//   38   67:aload_0         
	//   39   68:aload_2         
	//   40   69:putfield        #92  <Field SearchView mSearchView>
		mSearchable = searchableinfo;
	//   41   72:aload_0         
	//   42   73:aload_3         
	//   43   74:putfield        #94  <Field SearchableInfo mSearchable>
		mCommitIconResId = searchview.getSuggestionCommitIconResId();
	//   44   77:aload_0         
	//   45   78:aload_2         
	//   46   79:invokevirtual   #97  <Method int SearchView.getSuggestionCommitIconResId()>
	//   47   82:putfield        #99  <Field int mCommitIconResId>
		mProviderContext = context;
	//   48   85:aload_0         
	//   49   86:aload_1         
	//   50   87:putfield        #101 <Field Context mProviderContext>
		mOutsideDrawablesCache = weakhashmap;
	//   51   90:aload_0         
	//   52   91:aload           4
	//   53   93:putfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   54   96:return          
	}

	private Drawable checkIconCache(String s)
	{
		s = ((String) ((android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method Object WeakHashMap.get(Object)>
	//    4    8:checkcast       #116 <Class android.graphics.drawable.Drawable$ConstantState>
	//    5   11:astore_1        
		if(s == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((android.graphics.drawable.Drawable.ConstantState) (s)).newDrawable();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #120 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   12   22:areturn         
	}

	private CharSequence formatUrl(CharSequence charsequence)
	{
		if(mUrlColor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field ColorStateList mUrlColor>
	//*   2    4:ifnonnull       49
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #126 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #129 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.textColorSearchUrl, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #78  <Field Context mContext>
	//    9   19:invokevirtual   #133 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #138 <Field int android.support.v7.appcompat.R$attr.textColorSearchUrl>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #144 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			mUrlColor = mContext.getResources().getColorStateList(typedvalue.resourceId);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #78  <Field Context mContext>
	//   18   36:invokevirtual   #148 <Method Resources Context.getResources()>
	//   19   39:aload_2         
	//   20   40:getfield        #151 <Field int TypedValue.resourceId>
	//   21   43:invokevirtual   #157 <Method ColorStateList Resources.getColorStateList(int)>
	//   22   46:putfield        #124 <Field ColorStateList mUrlColor>
		}
		SpannableString spannablestring = new SpannableString(charsequence);
	//   23   49:new             #159 <Class SpannableString>
	//   24   52:dup             
	//   25   53:aload_1         
	//   26   54:invokespecial   #162 <Method void SpannableString(CharSequence)>
	//   27   57:astore_2        
		spannablestring.setSpan(((Object) (new TextAppearanceSpan(((String) (null)), 0, 0, mUrlColor, ((ColorStateList) (null))))), 0, charsequence.length(), 33);
	//   28   58:aload_2         
	//   29   59:new             #164 <Class TextAppearanceSpan>
	//   30   62:dup             
	//   31   63:aconst_null     
	//   32   64:iconst_0        
	//   33   65:iconst_0        
	//   34   66:aload_0         
	//   35   67:getfield        #124 <Field ColorStateList mUrlColor>
	//   36   70:aconst_null     
	//   37   71:invokespecial   #167 <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//   38   74:iconst_0        
	//   39   75:aload_1         
	//   40   76:invokeinterface #172 <Method int CharSequence.length()>
	//   41   81:bipush          33
	//   42   83:invokevirtual   #176 <Method void SpannableString.setSpan(Object, int, int, int)>
		return ((CharSequence) (spannablestring));
	//   43   86:aload_2         
	//   44   87:areturn         
	}

	private Drawable getActivityIcon(ComponentName componentname)
	{
		Object obj = ((Object) (mContext.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Context mContext>
	//    2    4:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//    3    7:astore_3        
		int i;
		ActivityInfo activityinfo;
		try
		{
			activityinfo = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:sipush          128
	//    7   13:invokevirtual   #190 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//    8   16:astore          4
		}
	//*   9   18:aload           4
	//*  10   20:invokevirtual   #195 <Method int ActivityInfo.getIconResource()>
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:ifne            43
	//*  14   28:aconst_null     
	//*  15   29:areturn         
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  16   30:astore_1        
		{
			Log.w("SuggestionsAdapter", ((android.content.pm.PackageManager.NameNotFoundException) (componentname)).toString());
	//   17   31:ldc1            #19  <String "SuggestionsAdapter">
	//   18   33:aload_1         
	//   19   34:invokevirtual   #199 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   20   37:invokestatic    #205 <Method int Log.w(String, String)>
	//   21   40:pop             
			return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
		}
		i = activityinfo.getIconResource();
		if(i == 0)
			return null;
		obj = ((Object) (((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo)));
	//   24   43:aload_3         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #210 <Method String ComponentName.getPackageName()>
	//   27   48:iload_2         
	//   28   49:aload           4
	//   29   51:getfield        #214 <Field android.content.pm.ApplicationInfo ActivityInfo.applicationInfo>
	//   30   54:invokevirtual   #218 <Method Drawable PackageManager.getDrawable(String, int, android.content.pm.ApplicationInfo)>
	//   31   57:astore_3        
		if(obj == null)
	//*  32   58:aload_3         
	//*  33   59:ifnonnull       101
		{
			Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i).append(" for ").append(componentname.flattenToShortString()).toString());
	//   34   62:ldc1            #19  <String "SuggestionsAdapter">
	//   35   64:new             #220 <Class StringBuilder>
	//   36   67:dup             
	//   37   68:invokespecial   #221 <Method void StringBuilder()>
	//   38   71:ldc1            #223 <String "Invalid icon resource ">
	//   39   73:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   40   76:iload_2         
	//   41   77:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   42   80:ldc1            #232 <String " for ">
	//   43   82:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   44   85:aload_1         
	//   45   86:invokevirtual   #235 <Method String ComponentName.flattenToShortString()>
	//   46   89:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   48   95:invokestatic    #205 <Method int Log.w(String, String)>
	//   49   98:pop             
			return null;
	//   50   99:aconst_null     
	//   51  100:areturn         
		} else
		{
			return ((Drawable) (obj));
	//   52  101:aload_3         
	//   53  102:areturn         
		}
	}

	private Drawable getActivityIconWithCache(ComponentName componentname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		String s = componentname.flattenToShortString();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #235 <Method String ComponentName.flattenToShortString()>
	//    4    6:astore_3        
		if(mOutsideDrawablesCache.containsKey(((Object) (s))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #241 <Method boolean WeakHashMap.containsKey(Object)>
	//*   9   15:ifeq            48
		{
			componentname = ((ComponentName) ((android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(((Object) (s)))));
	//   10   18:aload_0         
	//   11   19:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   12   22:aload_3         
	//   13   23:invokevirtual   #114 <Method Object WeakHashMap.get(Object)>
	//   14   26:checkcast       #116 <Class android.graphics.drawable.Drawable$ConstantState>
	//   15   29:astore_1        
			if(componentname == null)
	//*  16   30:aload_1         
	//*  17   31:ifnonnull       36
				return null;
	//   18   34:aconst_null     
	//   19   35:areturn         
			else
				return ((android.graphics.drawable.Drawable.ConstantState) (componentname)).newDrawable(mProviderContext.getResources());
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:getfield        #101 <Field Context mProviderContext>
	//   23   41:invokevirtual   #148 <Method Resources Context.getResources()>
	//   24   44:invokevirtual   #244 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   25   47:areturn         
		}
		Drawable drawable = getActivityIcon(componentname);
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokespecial   #246 <Method Drawable getActivityIcon(ComponentName)>
	//   29   53:astore          4
		if(drawable == null)
	//*  30   55:aload           4
	//*  31   57:ifnonnull       75
			componentname = ((ComponentName) (obj));
	//   32   60:aload_2         
	//   33   61:astore_1        
		else
	//*  34   62:aload_0         
	//*  35   63:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//*  36   66:aload_3         
	//*  37   67:aload_1         
	//*  38   68:invokevirtual   #250 <Method Object WeakHashMap.put(Object, Object)>
	//*  39   71:pop             
	//*  40   72:aload           4
	//*  41   74:areturn         
			componentname = ((ComponentName) (drawable.getConstantState()));
	//   42   75:aload           4
	//   43   77:invokevirtual   #256 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   44   80:astore_1        
		mOutsideDrawablesCache.put(((Object) (s)), ((Object) (componentname)));
		return drawable;
	//*  45   81:goto            62
	}

	public static String getColumnString(Cursor cursor, String s)
	{
		return getStringOrNull(cursor, cursor.getColumnIndex(s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//    4    8:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//    5   11:areturn         
	}

	private Drawable getDefaultIcon1(Cursor cursor)
	{
		cursor = ((Cursor) (getActivityIconWithCache(mSearchable.getSearchActivity())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field SearchableInfo mSearchable>
	//    3    5:invokevirtual   #276 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    4    8:invokespecial   #278 <Method Drawable getActivityIconWithCache(ComponentName)>
	//    5   11:astore_1        
		if(cursor != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          18
			return ((Drawable) (cursor));
	//    8   16:aload_1         
	//    9   17:areturn         
		else
			return mContext.getPackageManager().getDefaultActivityIcon();
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field Context mContext>
	//   12   22:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//   13   25:invokevirtual   #281 <Method Drawable PackageManager.getDefaultActivityIcon()>
	//   14   28:areturn         
	}

	private Drawable getDrawable(Uri uri)
	{
		boolean flag = "android.resource".equals(((Object) (uri.getScheme())));
	//    0    0:ldc2            #290 <String "android.resource">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #295 <Method String Uri.getScheme()>
	//    3    7:invokevirtual   #300 <Method boolean String.equals(Object)>
	//    4   10:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_94;
	//    5   11:iload_2         
	//    6   12:ifeq            94
		Object obj = ((Object) (getDrawableFromResourceUri(uri)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #303 <Method Drawable getDrawableFromResourceUri(Uri)>
	//   10   20:astore_3        
		return ((Drawable) (obj));
	//   11   21:aload_3         
	//   12   22:areturn         
		Object obj1;
		obj1;
	//   13   23:astore_3        
		try
		{
			throw new FileNotFoundException((new StringBuilder()).append("Resource does not exist: ").append(((Object) (uri))).toString());
	//   14   24:new             #284 <Class FileNotFoundException>
	//   15   27:dup             
	//   16   28:new             #220 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #221 <Method void StringBuilder()>
	//   19   35:ldc2            #305 <String "Resource does not exist: ">
	//   20   38:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   23   45:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   24   48:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   25   51:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  26   52:astore_3        
		{
			Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon not found: ").append(((Object) (uri))).append(", ").append(((FileNotFoundException) (obj1)).getMessage()).toString());
	//   27   53:ldc1            #19  <String "SuggestionsAdapter">
	//   28   55:new             #220 <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #221 <Method void StringBuilder()>
	//   31   62:ldc2            #313 <String "Icon not found: ">
	//   32   65:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:aload_1         
	//   34   69:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   35   72:ldc2            #315 <String ", ">
	//   36   75:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:aload_3         
	//   38   79:invokevirtual   #318 <Method String FileNotFoundException.getMessage()>
	//   39   82:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   40   85:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   41   88:invokestatic    #205 <Method int Log.w(String, String)>
	//   42   91:pop             
		}
		return null;
	//   43   92:aconst_null     
	//   44   93:areturn         
		obj1 = ((Object) (mProviderContext.getContentResolver().openInputStream(uri)));
	//   45   94:aload_0         
	//   46   95:getfield        #101 <Field Context mProviderContext>
	//   47   98:invokevirtual   #322 <Method ContentResolver Context.getContentResolver()>
	//   48  101:aload_1         
	//   49  102:invokevirtual   #328 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   50  105:astore_3        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_138;
	//   51  106:aload_3         
	//   52  107:ifnonnull       138
		throw new FileNotFoundException((new StringBuilder()).append("Failed to open ").append(((Object) (uri))).toString());
	//   53  110:new             #284 <Class FileNotFoundException>
	//   54  113:dup             
	//   55  114:new             #220 <Class StringBuilder>
	//   56  117:dup             
	//   57  118:invokespecial   #221 <Method void StringBuilder()>
	//   58  121:ldc2            #330 <String "Failed to open ">
	//   59  124:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   60  127:aload_1         
	//   61  128:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   62  131:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   63  134:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   64  137:athrow          
		Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), ((String) (null)));
	//   65  138:aload_3         
	//   66  139:aconst_null     
	//   67  140:invokestatic    #334 <Method Drawable Drawable.createFromStream(InputStream, String)>
	//   68  143:astore          4
		((InputStream) (obj1)).close();
	//   69  145:aload_3         
	//   70  146:invokevirtual   #339 <Method void InputStream.close()>
		return drawable;
	//   71  149:aload           4
	//   72  151:areturn         
		obj1;
	//   73  152:astore_3        
		Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(((Object) (uri))).toString(), ((Throwable) (obj1)));
	//   74  153:ldc1            #19  <String "SuggestionsAdapter">
	//   75  155:new             #220 <Class StringBuilder>
	//   76  158:dup             
	//   77  159:invokespecial   #221 <Method void StringBuilder()>
	//   78  162:ldc2            #341 <String "Error closing icon stream for ">
	//   79  165:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   80  168:aload_1         
	//   81  169:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   82  172:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   83  175:aload_3         
	//   84  176:invokestatic    #345 <Method int Log.e(String, String, Throwable)>
	//   85  179:pop             
		return drawable;
	//   86  180:aload           4
	//   87  182:areturn         
		Exception exception;
		exception;
	//   88  183:astore          4
		((InputStream) (obj1)).close();
	//   89  185:aload_3         
	//   90  186:invokevirtual   #339 <Method void InputStream.close()>
_L1:
		throw exception;
	//   91  189:aload           4
	//   92  191:athrow          
		obj1;
	//   93  192:astore_3        
		Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(((Object) (uri))).toString(), ((Throwable) (obj1)));
	//   94  193:ldc1            #19  <String "SuggestionsAdapter">
	//   95  195:new             #220 <Class StringBuilder>
	//   96  198:dup             
	//   97  199:invokespecial   #221 <Method void StringBuilder()>
	//   98  202:ldc2            #341 <String "Error closing icon stream for ">
	//   99  205:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  100  208:aload_1         
	//  101  209:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//  102  212:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  103  215:aload_3         
	//  104  216:invokestatic    #345 <Method int Log.e(String, String, Throwable)>
	//  105  219:pop             
		  goto _L1
	//* 106  220:goto            189
	}

	private Drawable getDrawableFromResourceValue(String s)
	{
		if(s != null && !s.isEmpty() && !"0".equals(((Object) (s)))) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          21
	//    2    4:aload_1         
	//    3    5:invokevirtual   #352 <Method boolean String.isEmpty()>
	//    4    8:ifne            21
	//    5   11:ldc2            #354 <String "0">
	//    6   14:aload_1         
	//    7   15:invokevirtual   #300 <Method boolean String.equals(Object)>
	//    8   18:ifeq            25
_L1:
		Object obj = null;
	//    9   21:aconst_null     
	//   10   22:astore_3        
_L4:
		return ((Drawable) (obj));
	//   11   23:aload_3         
	//   12   24:areturn         
_L2:
		int i;
		Drawable drawable1;
		String s1;
		i = Integer.parseInt(s);
	//   13   25:aload_1         
	//   14   26:invokestatic    #359 <Method int Integer.parseInt(String)>
	//   15   29:istore_2        
		s1 = (new StringBuilder()).append("android.resource://").append(mProviderContext.getPackageName()).append("/").append(i).toString();
	//   16   30:new             #220 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #221 <Method void StringBuilder()>
	//   19   37:ldc2            #361 <String "android.resource://">
	//   20   40:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:aload_0         
	//   22   44:getfield        #101 <Field Context mProviderContext>
	//   23   47:invokevirtual   #362 <Method String Context.getPackageName()>
	//   24   50:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:ldc2            #364 <String "/">
	//   26   56:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:iload_2         
	//   28   60:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   30   66:astore          5
		drawable1 = checkIconCache(s1);
	//   31   68:aload_0         
	//   32   69:aload           5
	//   33   71:invokespecial   #366 <Method Drawable checkIconCache(String)>
	//   34   74:astore          4
		obj = ((Object) (drawable1));
	//   35   76:aload           4
	//   36   78:astore_3        
		if(drawable1 != null)
			continue; /* Loop/switch isn't completed */
	//   37   79:aload           4
	//   38   81:ifnonnull       23
		obj = ((Object) (ContextCompat.getDrawable(mProviderContext, i)));
	//   39   84:aload_0         
	//   40   85:getfield        #101 <Field Context mProviderContext>
	//   41   88:iload_2         
	//   42   89:invokestatic    #371 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   43   92:astore_3        
		storeInIconCache(s1, ((Drawable) (obj)));
	//   44   93:aload_0         
	//   45   94:aload           5
	//   46   96:aload_3         
	//   47   97:invokespecial   #375 <Method void storeInIconCache(String, Drawable)>
		return ((Drawable) (obj));
	//   48  100:aload_3         
	//   49  101:areturn         
		Object obj1;
		obj1;
	//   50  102:astore_3        
		Drawable drawable2 = checkIconCache(s);
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokespecial   #366 <Method Drawable checkIconCache(String)>
	//   54  108:astore          4
		obj1 = ((Object) (drawable2));
	//   55  110:aload           4
	//   56  112:astore_3        
		if(drawable2 == null)
	//*  57  113:aload           4
	//*  58  115:ifnonnull       23
		{
			Drawable drawable = getDrawable(Uri.parse(s));
	//   59  118:aload_0         
	//   60  119:aload_1         
	//   61  120:invokestatic    #379 <Method Uri Uri.parse(String)>
	//   62  123:invokespecial   #381 <Method Drawable getDrawable(Uri)>
	//   63  126:astore_3        
			storeInIconCache(s, drawable);
	//   64  127:aload_0         
	//   65  128:aload_1         
	//   66  129:aload_3         
	//   67  130:invokespecial   #375 <Method void storeInIconCache(String, Drawable)>
			return drawable;
	//   68  133:aload_3         
	//   69  134:areturn         
		}
		continue; /* Loop/switch isn't completed */
		drawable;
	//   70  135:astore_3        
		Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s).toString());
	//   71  136:ldc1            #19  <String "SuggestionsAdapter">
	//   72  138:new             #220 <Class StringBuilder>
	//   73  141:dup             
	//   74  142:invokespecial   #221 <Method void StringBuilder()>
	//   75  145:ldc2            #383 <String "Icon resource not found: ">
	//   76  148:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   77  151:aload_1         
	//   78  152:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   79  155:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   80  158:invokestatic    #205 <Method int Log.w(String, String)>
	//   81  161:pop             
		return null;
	//   82  162:aconst_null     
	//   83  163:areturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	private Drawable getIcon1(Cursor cursor)
	{
		Drawable drawable;
		if(mIconName1Col == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int mIconName1Col>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          12
		{
			drawable = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
		} else
	//*   6   10:aload_2         
	//*   7   11:areturn         
		{
			Drawable drawable1 = getDrawableFromResourceValue(cursor.getString(mIconName1Col));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_0         
	//   11   15:getfield        #71  <Field int mIconName1Col>
	//   12   18:invokeinterface #388 <Method String Cursor.getString(int)>
	//   13   23:invokespecial   #390 <Method Drawable getDrawableFromResourceValue(String)>
	//   14   26:astore_3        
			drawable = drawable1;
	//   15   27:aload_3         
	//   16   28:astore_2        
			if(drawable1 == null)
	//*  17   29:aload_3         
	//*  18   30:ifnonnull       10
				return getDefaultIcon1(cursor);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokespecial   #392 <Method Drawable getDefaultIcon1(Cursor)>
	//   22   38:areturn         
		}
		return drawable;
	}

	private Drawable getIcon2(Cursor cursor)
	{
		if(mIconName2Col == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int mIconName2Col>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return getDrawableFromResourceValue(cursor.getString(mIconName2Col));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #73  <Field int mIconName2Col>
	//   10   16:invokeinterface #388 <Method String Cursor.getString(int)>
	//   11   21:invokespecial   #390 <Method Drawable getDrawableFromResourceValue(String)>
	//   12   24:areturn         
	}

	private static String getStringOrNull(Cursor cursor, int i)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          7
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		try
		{
			cursor = ((Cursor) (cursor.getString(i)));
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokeinterface #388 <Method String Cursor.getString(int)>
	//    8   14:astore_0        
		}
	//*   9   15:aload_0         
	//*  10   16:areturn         
		// Misplaced declaration of an exception variable
		catch(Cursor cursor)
	//*  11   17:astore_0        
		{
			Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", ((Throwable) (cursor)));
	//   12   18:ldc1            #19  <String "SuggestionsAdapter">
	//   13   20:ldc2            #397 <String "unexpected error retrieving valid column from cursor, did the remote process die?">
	//   14   23:aload_0         
	//   15   24:invokestatic    #345 <Method int Log.e(String, String, Throwable)>
	//   16   27:pop             
			return null;
	//   17   28:aconst_null     
	//   18   29:areturn         
		}
		return ((String) (cursor));
	}

	private void setViewDrawable(ImageView imageview, Drawable drawable, int i)
	{
		imageview.setImageDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #405 <Method void ImageView.setImageDrawable(Drawable)>
		if(drawable == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			imageview.setVisibility(i);
	//    5    9:aload_1         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
			return;
	//    8   14:return          
		} else
		{
			imageview.setVisibility(0);
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
			drawable.setVisible(false, false);
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #413 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   16   26:pop             
			drawable.setVisible(true, false);
	//   17   27:aload_2         
	//   18   28:iconst_1        
	//   19   29:iconst_0        
	//   20   30:invokevirtual   #413 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   33:pop             
			return;
	//   22   34:return          
		}
	}

	private void setViewText(TextView textview, CharSequence charsequence)
	{
		textview.setText(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #420 <Method void TextView.setText(CharSequence)>
		if(TextUtils.isEmpty(charsequence))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #425 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            19
		{
			textview.setVisibility(8);
	//    6   12:aload_1         
	//    7   13:bipush          8
	//    8   15:invokevirtual   #426 <Method void TextView.setVisibility(int)>
			return;
	//    9   18:return          
		} else
		{
			textview.setVisibility(0);
	//   10   19:aload_1         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #426 <Method void TextView.setVisibility(int)>
			return;
	//   13   24:return          
		}
	}

	private void storeInIconCache(String s, Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          17
			mOutsideDrawablesCache.put(((Object) (s)), ((Object) (drawable.getConstantState())));
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #256 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    7   13:invokevirtual   #250 <Method Object WeakHashMap.put(Object, Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void updateSpinnerState(Cursor cursor)
	{
		if(cursor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
			cursor = ((Cursor) (cursor.getExtras()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #432 <Method Bundle Cursor.getExtras()>
	//    4   10:astore_1        
		else
	//*   5   11:aload_1         
	//*   6   12:ifnull          25
	//*   7   15:aload_1         
	//*   8   16:ldc2            #434 <String "in_progress">
	//*   9   19:invokevirtual   #440 <Method boolean Bundle.getBoolean(String)>
	//*  10   22:ifeq            25
	//*  11   25:return          
			cursor = null;
	//   12   26:aconst_null     
	//   13   27:astore_1        
		if(cursor != null)
			if(!((Bundle) (cursor)).getBoolean("in_progress"));
	//*  14   28:goto            11
	}

	public void bindView(View view, Context context, Cursor cursor)
	{
		context = ((Context) ((ChildViewCache)view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #448 <Method Object View.getTag()>
	//    2    4:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//    3    7:astore_2        
		int i;
		if(mFlagsCol != -1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field int mFlagsCol>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          263
			i = cursor.getInt(mFlagsCol);
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field int mFlagsCol>
	//   11   21:invokeinterface #452 <Method int Cursor.getInt(int)>
	//   12   26:istore          4
		else
	//*  13   28:aload_2         
	//*  14   29:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  15   32:ifnull          53
	//*  16   35:aload_3         
	//*  17   36:aload_0         
	//*  18   37:getfield        #65  <Field int mText1Col>
	//*  19   40:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//*  20   43:astore_1        
	//*  21   44:aload_0         
	//*  22   45:aload_2         
	//*  23   46:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  24   49:aload_1         
	//*  25   50:invokespecial   #458 <Method void setViewText(TextView, CharSequence)>
	//*  26   53:aload_2         
	//*  27   54:getfield        #461 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//*  28   57:ifnull          118
	//*  29   60:aload_3         
	//*  30   61:aload_0         
	//*  31   62:getfield        #69  <Field int mText2UrlCol>
	//*  32   65:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//*  33   68:astore_1        
	//*  34   69:aload_1         
	//*  35   70:ifnull          215
	//*  36   73:aload_0         
	//*  37   74:aload_1         
	//*  38   75:invokespecial   #463 <Method CharSequence formatUrl(CharSequence)>
	//*  39   78:astore_1        
	//*  40   79:aload_1         
	//*  41   80:invokestatic    #425 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  42   83:ifeq            227
	//*  43   86:aload_2         
	//*  44   87:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  45   90:ifnull          109
	//*  46   93:aload_2         
	//*  47   94:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  48   97:iconst_0        
	//*  49   98:invokevirtual   #467 <Method void TextView.setSingleLine(boolean)>
	//*  50  101:aload_2         
	//*  51  102:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  52  105:iconst_2        
	//*  53  106:invokevirtual   #470 <Method void TextView.setMaxLines(int)>
	//*  54  109:aload_0         
	//*  55  110:aload_2         
	//*  56  111:getfield        #461 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//*  57  114:aload_1         
	//*  58  115:invokespecial   #458 <Method void setViewText(TextView, CharSequence)>
	//*  59  118:aload_2         
	//*  60  119:getfield        #474 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//*  61  122:ifnull          139
	//*  62  125:aload_0         
	//*  63  126:aload_2         
	//*  64  127:getfield        #474 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//*  65  130:aload_0         
	//*  66  131:aload_3         
	//*  67  132:invokespecial   #476 <Method Drawable getIcon1(Cursor)>
	//*  68  135:iconst_4        
	//*  69  136:invokespecial   #478 <Method void setViewDrawable(ImageView, Drawable, int)>
	//*  70  139:aload_2         
	//*  71  140:getfield        #481 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//*  72  143:ifnull          161
	//*  73  146:aload_0         
	//*  74  147:aload_2         
	//*  75  148:getfield        #481 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//*  76  151:aload_0         
	//*  77  152:aload_3         
	//*  78  153:invokespecial   #483 <Method Drawable getIcon2(Cursor)>
	//*  79  156:bipush          8
	//*  80  158:invokespecial   #478 <Method void setViewDrawable(ImageView, Drawable, int)>
	//*  81  161:aload_0         
	//*  82  162:getfield        #63  <Field int mQueryRefinement>
	//*  83  165:iconst_2        
	//*  84  166:icmpeq          184
	//*  85  169:aload_0         
	//*  86  170:getfield        #63  <Field int mQueryRefinement>
	//*  87  173:iconst_1        
	//*  88  174:icmpne          253
	//*  89  177:iload           4
	//*  90  179:iconst_1        
	//*  91  180:iand            
	//*  92  181:ifeq            253
	//*  93  184:aload_2         
	//*  94  185:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//*  95  188:iconst_0        
	//*  96  189:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
	//*  97  192:aload_2         
	//*  98  193:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//*  99  196:aload_2         
	//* 100  197:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//* 101  200:invokevirtual   #490 <Method CharSequence TextView.getText()>
	//* 102  203:invokevirtual   #494 <Method void ImageView.setTag(Object)>
	//* 103  206:aload_2         
	//* 104  207:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//* 105  210:aload_0         
	//* 106  211:invokevirtual   #498 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
	//* 107  214:return          
	//* 108  215:aload_3         
	//* 109  216:aload_0         
	//* 110  217:getfield        #67  <Field int mText2Col>
	//* 111  220:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//* 112  223:astore_1        
	//* 113  224:goto            79
	//* 114  227:aload_2         
	//* 115  228:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//* 116  231:ifnull          109
	//* 117  234:aload_2         
	//* 118  235:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//* 119  238:iconst_1        
	//* 120  239:invokevirtual   #467 <Method void TextView.setSingleLine(boolean)>
	//* 121  242:aload_2         
	//* 122  243:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//* 123  246:iconst_1        
	//* 124  247:invokevirtual   #470 <Method void TextView.setMaxLines(int)>
	//* 125  250:goto            109
	//* 126  253:aload_2         
	//* 127  254:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//* 128  257:bipush          8
	//* 129  259:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
	//* 130  262:return          
			i = 0;
	//  131  263:iconst_0        
	//  132  264:istore          4
		if(((ChildViewCache) (context)).mText1 != null)
		{
			view = ((View) (getStringOrNull(cursor, mText1Col)));
			setViewText(((ChildViewCache) (context)).mText1, ((CharSequence) (view)));
		}
		if(((ChildViewCache) (context)).mText2 == null) goto _L2; else goto _L1
_L1:
		view = ((View) (getStringOrNull(cursor, mText2UrlCol)));
		if(view != null)
			view = ((View) (formatUrl(((CharSequence) (view)))));
		else
			view = ((View) (getStringOrNull(cursor, mText2Col)));
		if(!TextUtils.isEmpty(((CharSequence) (view)))) goto _L4; else goto _L3
_L3:
		if(((ChildViewCache) (context)).mText1 != null)
		{
			((ChildViewCache) (context)).mText1.setSingleLine(false);
			((ChildViewCache) (context)).mText1.setMaxLines(2);
		}
_L6:
		setViewText(((ChildViewCache) (context)).mText2, ((CharSequence) (view)));
_L2:
		if(((ChildViewCache) (context)).mIcon1 != null)
			setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
		if(((ChildViewCache) (context)).mIcon2 != null)
			setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
		if(mQueryRefinement == 2 || mQueryRefinement == 1 && (i & 1) != 0)
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(0);
			((ChildViewCache) (context)).mIconRefine.setTag(((Object) (((ChildViewCache) (context)).mText1.getText())));
			((ChildViewCache) (context)).mIconRefine.setOnClickListener(((android.view.View.OnClickListener) (this)));
			return;
		} else
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(8);
			return;
		}
_L4:
		if(((ChildViewCache) (context)).mText1 != null)
		{
			((ChildViewCache) (context)).mText1.setSingleLine(true);
			((ChildViewCache) (context)).mText1.setMaxLines(1);
		}
		if(true) goto _L6; else goto _L5
_L5:
	//* 133  266:goto            28
	}

	public void changeCursor(Cursor cursor)
	{
		if(!mClosed) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mClosed>
	//    2    4:ifeq            27
_L1:
		Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
	//    3    7:ldc1            #19  <String "SuggestionsAdapter">
	//    4    9:ldc2            #501 <String "Tried to change cursor after adapter was closed.">
	//    5   12:invokestatic    #205 <Method int Log.w(String, String)>
	//    6   15:pop             
		if(cursor != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          26
			cursor.close();
	//    9   20:aload_1         
	//   10   21:invokeinterface #502 <Method void Cursor.close()>
_L4:
		return;
	//   11   26:return          
_L2:
		super.changeCursor(cursor);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #504 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
		if(cursor != null)
	//*  15   32:aload_1         
	//*  16   33:ifnull          26
		{
			try
			{
				mText1Col = cursor.getColumnIndex("suggest_text_1");
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:ldc2            #506 <String "suggest_text_1">
	//   20   41:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   21   46:putfield        #65  <Field int mText1Col>
				mText2Col = cursor.getColumnIndex("suggest_text_2");
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:ldc2            #508 <String "suggest_text_2">
	//   25   54:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   26   59:putfield        #67  <Field int mText2Col>
				mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
	//   27   62:aload_0         
	//   28   63:aload_1         
	//   29   64:ldc2            #510 <String "suggest_text_2_url">
	//   30   67:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   31   72:putfield        #69  <Field int mText2UrlCol>
				mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
	//   32   75:aload_0         
	//   33   76:aload_1         
	//   34   77:ldc2            #512 <String "suggest_icon_1">
	//   35   80:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   36   85:putfield        #71  <Field int mIconName1Col>
				mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
	//   37   88:aload_0         
	//   38   89:aload_1         
	//   39   90:ldc2            #514 <String "suggest_icon_2">
	//   40   93:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   41   98:putfield        #73  <Field int mIconName2Col>
				mFlagsCol = cursor.getColumnIndex("suggest_flags");
	//   42  101:aload_0         
	//   43  102:aload_1         
	//   44  103:ldc2            #516 <String "suggest_flags">
	//   45  106:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//   46  111:putfield        #75  <Field int mFlagsCol>
				return;
	//   47  114:return          
			}
			// Misplaced declaration of an exception variable
			catch(Cursor cursor)
	//*  48  115:astore_1        
			{
				Log.e("SuggestionsAdapter", "error changing cursor and caching columns", ((Throwable) (cursor)));
	//   49  116:ldc1            #19  <String "SuggestionsAdapter">
	//   50  118:ldc2            #518 <String "error changing cursor and caching columns">
	//   51  121:aload_1         
	//   52  122:invokestatic    #345 <Method int Log.e(String, String, Throwable)>
	//   53  125:pop             
			}
			return;
	//   54  126:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public void close()
	{
		changeCursor(((Cursor) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #519 <Method void changeCursor(Cursor)>
		mClosed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #61  <Field boolean mClosed>
	//    6   10:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		if(cursor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
		{
			String s = getColumnString(cursor, "suggest_intent_query");
	//    4    6:aload_1         
	//    5    7:ldc2            #523 <String "suggest_intent_query">
	//    6   10:invokestatic    #525 <Method String getColumnString(Cursor, String)>
	//    7   13:astore_2        
			if(s != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          20
				return ((CharSequence) (s));
	//   10   18:aload_2         
	//   11   19:areturn         
			if(mSearchable.shouldRewriteQueryFromData())
	//*  12   20:aload_0         
	//*  13   21:getfield        #94  <Field SearchableInfo mSearchable>
	//*  14   24:invokevirtual   #528 <Method boolean SearchableInfo.shouldRewriteQueryFromData()>
	//*  15   27:ifeq            44
			{
				String s1 = getColumnString(cursor, "suggest_intent_data");
	//   16   30:aload_1         
	//   17   31:ldc2            #530 <String "suggest_intent_data">
	//   18   34:invokestatic    #525 <Method String getColumnString(Cursor, String)>
	//   19   37:astore_2        
				if(s1 != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          44
					return ((CharSequence) (s1));
	//   22   42:aload_2         
	//   23   43:areturn         
			}
			if(mSearchable.shouldRewriteQueryFromText())
	//*  24   44:aload_0         
	//*  25   45:getfield        #94  <Field SearchableInfo mSearchable>
	//*  26   48:invokevirtual   #533 <Method boolean SearchableInfo.shouldRewriteQueryFromText()>
	//*  27   51:ifeq            4
			{
				cursor = ((Cursor) (getColumnString(cursor, "suggest_text_1")));
	//   28   54:aload_1         
	//   29   55:ldc2            #506 <String "suggest_text_1">
	//   30   58:invokestatic    #525 <Method String getColumnString(Cursor, String)>
	//   31   61:astore_1        
				if(cursor != null)
	//*  32   62:aload_1         
	//*  33   63:ifnull          4
					return ((CharSequence) (cursor));
	//   34   66:aload_1         
	//   35   67:areturn         
			}
		}
		return null;
	}

	Drawable getDrawableFromResourceUri(Uri uri)
		throws FileNotFoundException
	{
		Object obj = ((Object) (uri.getAuthority()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #536 <Method String Uri.getAuthority()>
	//    2    4:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #425 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            40
			throw new FileNotFoundException((new StringBuilder()).append("No authority: ").append(((Object) (uri))).toString());
	//    6   12:new             #284 <Class FileNotFoundException>
	//    7   15:dup             
	//    8   16:new             #220 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #221 <Method void StringBuilder()>
	//   11   23:ldc2            #538 <String "No authority: ">
	//   12   26:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   15   33:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   17   39:athrow          
		Resources resources;
		List list;
		try
		{
			resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
	//   18   40:aload_0         
	//   19   41:getfield        #78  <Field Context mContext>
	//   20   44:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//   21   47:aload_3         
	//   22   48:invokevirtual   #542 <Method Resources PackageManager.getResourcesForApplication(String)>
	//   23   51:astore          4
		}
	//*  24   53:aload_1         
	//*  25   54:invokevirtual   #546 <Method List Uri.getPathSegments()>
	//*  26   57:astore          5
	//*  27   59:aload           5
	//*  28   61:ifnonnull       121
	//*  29   64:new             #284 <Class FileNotFoundException>
	//*  30   67:dup             
	//*  31   68:new             #220 <Class StringBuilder>
	//*  32   71:dup             
	//*  33   72:invokespecial   #221 <Method void StringBuilder()>
	//*  34   75:ldc2            #548 <String "No path: ">
	//*  35   78:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  36   81:aload_1         
	//*  37   82:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  38   85:invokevirtual   #236 <Method String StringBuilder.toString()>
	//*  39   88:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  40   91:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  41   92:astore_3        
		{
			throw new FileNotFoundException((new StringBuilder()).append("No package found for authority: ").append(((Object) (uri))).toString());
	//   42   93:new             #284 <Class FileNotFoundException>
	//   43   96:dup             
	//   44   97:new             #220 <Class StringBuilder>
	//   45  100:dup             
	//   46  101:invokespecial   #221 <Method void StringBuilder()>
	//   47  104:ldc2            #550 <String "No package found for authority: ">
	//   48  107:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   49  110:aload_1         
	//   50  111:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   51  114:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   52  117:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   53  120:athrow          
		}
		list = uri.getPathSegments();
		if(list == null)
			throw new FileNotFoundException((new StringBuilder()).append("No path: ").append(((Object) (uri))).toString());
		int i = list.size();
	//   54  121:aload           5
	//   55  123:invokeinterface #555 <Method int List.size()>
	//   56  128:istore_2        
		if(i == 1)
	//*  57  129:iload_2         
	//*  58  130:iconst_1        
	//*  59  131:icmpne          210
			try
			{
				i = Integer.parseInt((String)list.get(0));
	//   60  134:aload           5
	//   61  136:iconst_0        
	//   62  137:invokeinterface #558 <Method Object List.get(int)>
	//   63  142:checkcast       #297 <Class String>
	//   64  145:invokestatic    #359 <Method int Integer.parseInt(String)>
	//   65  148:istore_2        
			}
	//*  66  149:iload_2         
	//*  67  150:ifne            275
	//*  68  153:new             #284 <Class FileNotFoundException>
	//*  69  156:dup             
	//*  70  157:new             #220 <Class StringBuilder>
	//*  71  160:dup             
	//*  72  161:invokespecial   #221 <Method void StringBuilder()>
	//*  73  164:ldc2            #560 <String "No resource found for: ">
	//*  74  167:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  75  170:aload_1         
	//*  76  171:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  77  174:invokevirtual   #236 <Method String StringBuilder.toString()>
	//*  78  177:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  79  180:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  80  181:astore_3        
			{
				throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(((Object) (uri))).toString());
	//   81  182:new             #284 <Class FileNotFoundException>
	//   82  185:dup             
	//   83  186:new             #220 <Class StringBuilder>
	//   84  189:dup             
	//   85  190:invokespecial   #221 <Method void StringBuilder()>
	//   86  193:ldc2            #562 <String "Single path segment is not a resource ID: ">
	//   87  196:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   88  199:aload_1         
	//   89  200:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   90  203:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   91  206:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   92  209:athrow          
			}
		else
		if(i == 2)
	//*  93  210:iload_2         
	//*  94  211:iconst_2        
	//*  95  212:icmpne          247
			i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
	//   96  215:aload           4
	//   97  217:aload           5
	//   98  219:iconst_1        
	//   99  220:invokeinterface #558 <Method Object List.get(int)>
	//  100  225:checkcast       #297 <Class String>
	//  101  228:aload           5
	//  102  230:iconst_0        
	//  103  231:invokeinterface #558 <Method Object List.get(int)>
	//  104  236:checkcast       #297 <Class String>
	//  105  239:aload_3         
	//  106  240:invokevirtual   #566 <Method int Resources.getIdentifier(String, String, String)>
	//  107  243:istore_2        
		else
	//* 108  244:goto            149
			throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(((Object) (uri))).toString());
	//  109  247:new             #284 <Class FileNotFoundException>
	//  110  250:dup             
	//  111  251:new             #220 <Class StringBuilder>
	//  112  254:dup             
	//  113  255:invokespecial   #221 <Method void StringBuilder()>
	//  114  258:ldc2            #568 <String "More than two path segments: ">
	//  115  261:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  116  264:aload_1         
	//  117  265:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//  118  268:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  119  271:invokespecial   #311 <Method void FileNotFoundException(String)>
	//  120  274:athrow          
		if(i == 0)
			throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(((Object) (uri))).toString());
		else
			return resources.getDrawable(i);
	//  121  275:aload           4
	//  122  277:iload_2         
	//  123  278:invokevirtual   #571 <Method Drawable Resources.getDrawable(int)>
	//  124  281:areturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		try
		{
			view = super.getDropDownView(i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #578 <Method View ResourceCursorAdapter.getDropDownView(int, View, ViewGroup)>
	//    5    7:astore_2        
		}
	//*   6    8:aload_2         
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   10:astore_2        
		{
			Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", ((Throwable) (view)));
	//    9   11:ldc1            #19  <String "SuggestionsAdapter">
	//   10   13:ldc2            #580 <String "Search suggestions cursor threw exception.">
	//   11   16:aload_2         
	//   12   17:invokestatic    #582 <Method int Log.w(String, String, Throwable)>
	//   13   20:pop             
			viewgroup = ((ViewGroup) (newDropDownView(mContext, mCursor, viewgroup)));
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #78  <Field Context mContext>
	//   17   26:aload_0         
	//   18   27:getfield        #586 <Field Cursor mCursor>
	//   19   30:aload_3         
	//   20   31:invokevirtual   #590 <Method View newDropDownView(Context, Cursor, ViewGroup)>
	//   21   34:astore_3        
			if(viewgroup != null)
	//*  22   35:aload_3         
	//*  23   36:ifnull          56
				((ChildViewCache)((View) (viewgroup)).getTag()).mText1.setText(((CharSequence) (((RuntimeException) (view)).toString())));
	//   24   39:aload_3         
	//   25   40:invokevirtual   #448 <Method Object View.getTag()>
	//   26   43:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//   27   46:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #591 <Method String RuntimeException.toString()>
	//   30   53:invokevirtual   #420 <Method void TextView.setText(CharSequence)>
			return ((View) (viewgroup));
	//   31   56:aload_3         
	//   32   57:areturn         
		}
		return view;
	}

	public int getQueryRefinement()
	{
		return mQueryRefinement;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mQueryRefinement>
	//    2    4:ireturn         
	}

	Cursor getSearchManagerSuggestions(SearchableInfo searchableinfo, String s, int i)
	{
		Object obj;
		if(searchableinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #597 <Method String SearchableInfo.getSuggestAuthority()>
	//*   6   10:astore          4
			if((obj = ((Object) (searchableinfo.getSuggestAuthority()))) != null)
	//*   7   12:aload           4
	//*   8   14:ifnull          4
			{
				obj = ((Object) ((new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("")));
	//    9   17:new             #599 <Class android.net.Uri$Builder>
	//   10   20:dup             
	//   11   21:invokespecial   #600 <Method void android.net.Uri$Builder()>
	//   12   24:ldc2            #602 <String "content">
	//   13   27:invokevirtual   #606 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   14   30:aload           4
	//   15   32:invokevirtual   #609 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   16   35:ldc2            #611 <String "">
	//   17   38:invokevirtual   #614 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//   18   41:ldc2            #611 <String "">
	//   19   44:invokevirtual   #617 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   20   47:astore          4
				String s1 = searchableinfo.getSuggestPath();
	//   21   49:aload_1         
	//   22   50:invokevirtual   #620 <Method String SearchableInfo.getSuggestPath()>
	//   23   53:astore          5
				if(s1 != null)
	//*  24   55:aload           5
	//*  25   57:ifnull          68
					((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
	//   26   60:aload           4
	//   27   62:aload           5
	//   28   64:invokevirtual   #623 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   29   67:pop             
				((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
	//   30   68:aload           4
	//   31   70:ldc2            #625 <String "search_suggest_query">
	//   32   73:invokevirtual   #628 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   33   76:pop             
				s1 = searchableinfo.getSuggestSelection();
	//   34   77:aload_1         
	//   35   78:invokevirtual   #631 <Method String SearchableInfo.getSuggestSelection()>
	//   36   81:astore          5
				if(s1 != null)
	//*  37   83:aload           5
	//*  38   85:ifnull          137
				{
					searchableinfo = ((SearchableInfo) (new String[1]));
	//   39   88:iconst_1        
	//   40   89:anewarray       String[]
	//   41   92:astore_1        
					searchableinfo[0] = ((/*<invalid signature>*/java.lang.Object) (s));
	//   42   93:aload_1         
	//   43   94:iconst_0        
	//   44   95:aload_2         
	//   45   96:aastore         
				} else
	//*  46   97:iload_3         
	//*  47   98:ifle            114
	//*  48  101:aload           4
	//*  49  103:ldc2            #633 <String "limit">
	//*  50  106:iload_3         
	//*  51  107:invokestatic    #636 <Method String String.valueOf(int)>
	//*  52  110:invokevirtual   #640 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//*  53  113:pop             
	//*  54  114:aload           4
	//*  55  116:invokevirtual   #644 <Method Uri android.net.Uri$Builder.build()>
	//*  56  119:astore_2        
	//*  57  120:aload_0         
	//*  58  121:getfield        #78  <Field Context mContext>
	//*  59  124:invokevirtual   #322 <Method ContentResolver Context.getContentResolver()>
	//*  60  127:aload_2         
	//*  61  128:aconst_null     
	//*  62  129:aload           5
	//*  63  131:aload_1         
	//*  64  132:aconst_null     
	//*  65  133:invokevirtual   #647 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  66  136:areturn         
				{
					((android.net.Uri.Builder) (obj)).appendPath(s);
	//   67  137:aload           4
	//   68  139:aload_2         
	//   69  140:invokevirtual   #628 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   70  143:pop             
					searchableinfo = null;
	//   71  144:aconst_null     
	//   72  145:astore_1        
				}
				if(i > 0)
					((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i));
				s = ((String) (((android.net.Uri.Builder) (obj)).build()));
				return mContext.getContentResolver().query(((Uri) (s)), ((String []) (null)), s1, ((String []) (searchableinfo)), ((String) (null)));
			}
		return null;
	//*  73  146:goto            97
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		try
		{
			view = super.getView(i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #650 <Method View ResourceCursorAdapter.getView(int, View, ViewGroup)>
	//    5    7:astore_2        
		}
	//*   6    8:aload_2         
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   10:astore_2        
		{
			Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", ((Throwable) (view)));
	//    9   11:ldc1            #19  <String "SuggestionsAdapter">
	//   10   13:ldc2            #580 <String "Search suggestions cursor threw exception.">
	//   11   16:aload_2         
	//   12   17:invokestatic    #582 <Method int Log.w(String, String, Throwable)>
	//   13   20:pop             
			viewgroup = ((ViewGroup) (newView(mContext, mCursor, viewgroup)));
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #78  <Field Context mContext>
	//   17   26:aload_0         
	//   18   27:getfield        #586 <Field Cursor mCursor>
	//   19   30:aload_3         
	//   20   31:invokevirtual   #653 <Method View newView(Context, Cursor, ViewGroup)>
	//   21   34:astore_3        
			if(viewgroup != null)
	//*  22   35:aload_3         
	//*  23   36:ifnull          56
				((ChildViewCache)((View) (viewgroup)).getTag()).mText1.setText(((CharSequence) (((RuntimeException) (view)).toString())));
	//   24   39:aload_3         
	//   25   40:invokevirtual   #448 <Method Object View.getTag()>
	//   26   43:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//   27   46:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #591 <Method String RuntimeException.toString()>
	//   30   53:invokevirtual   #420 <Method void TextView.setText(CharSequence)>
			return ((View) (viewgroup));
	//   31   56:aload_3         
	//   32   57:areturn         
		}
		return view;
	}

	public boolean hasStableIds()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		context = ((Context) (super.newView(context, cursor, viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #655 <Method View ResourceCursorAdapter.newView(Context, Cursor, ViewGroup)>
	//    5    7:astore_1        
		((View) (context)).setTag(((Object) (new ChildViewCache(((View) (context))))));
	//    6    8:aload_1         
	//    7    9:new             #8   <Class SuggestionsAdapter$ChildViewCache>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #658 <Method void SuggestionsAdapter$ChildViewCache(View)>
	//   11   17:invokevirtual   #659 <Method void View.setTag(Object)>
		((ImageView)((View) (context)).findViewById(android.support.v7.appcompat.R.id.edit_query)).setImageResource(mCommitIconResId);
	//   12   20:aload_1         
	//   13   21:getstatic       #664 <Field int android.support.v7.appcompat.R$id.edit_query>
	//   14   24:invokevirtual   #668 <Method View View.findViewById(int)>
	//   15   27:checkcast       #401 <Class ImageView>
	//   16   30:aload_0         
	//   17   31:getfield        #99  <Field int mCommitIconResId>
	//   18   34:invokevirtual   #671 <Method void ImageView.setImageResource(int)>
		return ((View) (context));
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public void notifyDataSetChanged()
	{
		super.notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void ResourceCursorAdapter.notifyDataSetChanged()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #678 <Method Cursor getCursor()>
	//    5    9:invokespecial   #680 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void notifyDataSetInvalidated()
	{
		super.notifyDataSetInvalidated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #683 <Method void ResourceCursorAdapter.notifyDataSetInvalidated()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #678 <Method Cursor getCursor()>
	//    5    9:invokespecial   #680 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void onClick(View view)
	{
		view = ((View) (view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #448 <Method Object View.getTag()>
	//    2    4:astore_1        
		if(view instanceof CharSequence)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #169 <Class CharSequence>
	//*   5    9:ifeq            23
			mSearchView.onQueryRefine((CharSequence)view);
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field SearchView mSearchView>
	//    8   16:aload_1         
	//    9   17:checkcast       #169 <Class CharSequence>
	//   10   20:invokevirtual   #687 <Method void SearchView.onQueryRefine(CharSequence)>
	//   11   23:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       30
			charsequence = "";
	//    2    4:ldc2            #611 <String "">
	//    3    7:astore_1        
		else
	//*   4    8:aload_0         
	//*   5    9:getfield        #92  <Field SearchView mSearchView>
	//*   6   12:invokevirtual   #692 <Method int SearchView.getVisibility()>
	//*   7   15:ifne            28
	//*   8   18:aload_0         
	//*   9   19:getfield        #92  <Field SearchView mSearchView>
	//*  10   22:invokevirtual   #695 <Method int SearchView.getWindowVisibility()>
	//*  11   25:ifeq            40
	//*  12   28:aconst_null     
	//*  13   29:areturn         
			charsequence = ((CharSequence) (charsequence.toString()));
	//   14   30:aload_1         
	//   15   31:invokeinterface #696 <Method String CharSequence.toString()>
	//   16   36:astore_1        
		if(mSearchView.getVisibility() != 0 || mSearchView.getWindowVisibility() != 0)
			return null;
	//*  17   37:goto            8
		charsequence = ((CharSequence) (getSearchManagerSuggestions(mSearchable, ((String) (charsequence)), 50)));
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #94  <Field SearchableInfo mSearchable>
	//   21   45:aload_1         
	//   22   46:bipush          50
	//   23   48:invokevirtual   #698 <Method Cursor getSearchManagerSuggestions(SearchableInfo, String, int)>
	//   24   51:astore_1        
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_76;
	//   25   52:aload_1         
	//   26   53:ifnull          76
		((Cursor) (charsequence)).getCount();
	//   27   56:aload_1         
	//   28   57:invokeinterface #701 <Method int Cursor.getCount()>
	//   29   62:pop             
		return ((Cursor) (charsequence));
	//   30   63:aload_1         
	//   31   64:areturn         
		charsequence;
	//   32   65:astore_1        
		Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", ((Throwable) (charsequence)));
	//   33   66:ldc1            #19  <String "SuggestionsAdapter">
	//   34   68:ldc2            #703 <String "Search suggestions query threw an exception.">
	//   35   71:aload_1         
	//   36   72:invokestatic    #582 <Method int Log.w(String, String, Throwable)>
	//   37   75:pop             
		return null;
	//   38   76:aconst_null     
	//   39   77:areturn         
	}

	public void setQueryRefinement(int i)
	{
		mQueryRefinement = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int mQueryRefinement>
	//    3    5:return          
	}

	private static final boolean DBG = false;
	static final int INVALID_INDEX = -1;
	private static final String LOG_TAG = "SuggestionsAdapter";
	private static final int QUERY_LIMIT = 50;
	static final int REFINE_ALL = 2;
	static final int REFINE_BY_ENTRY = 1;
	static final int REFINE_NONE = 0;
	private boolean mClosed;
	private final int mCommitIconResId;
	private int mFlagsCol;
	private int mIconName1Col;
	private int mIconName2Col;
	private final WeakHashMap mOutsideDrawablesCache;
	private final Context mProviderContext;
	private int mQueryRefinement;
	private final SearchManager mSearchManager;
	private final SearchView mSearchView;
	private final SearchableInfo mSearchable;
	private int mText1Col;
	private int mText2Col;
	private int mText2UrlCol;
	private ColorStateList mUrlColor;
}
