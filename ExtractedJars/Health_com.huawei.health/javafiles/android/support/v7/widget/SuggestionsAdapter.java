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
	static final class ChildViewCache
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
	//*   9   18:goto            34
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  10   21:astore_1        
		{
			Log.w("SuggestionsAdapter", ((android.content.pm.PackageManager.NameNotFoundException) (componentname)).toString());
	//   11   22:ldc1            #19  <String "SuggestionsAdapter">
	//   12   24:aload_1         
	//   13   25:invokevirtual   #194 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   14   28:invokestatic    #200 <Method int Log.w(String, String)>
	//   15   31:pop             
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		}
		int i = activityinfo.getIconResource();
	//   18   34:aload           4
	//   19   36:invokevirtual   #205 <Method int ActivityInfo.getIconResource()>
	//   20   39:istore_2        
		if(i == 0)
	//*  21   40:iload_2         
	//*  22   41:ifne            46
			return null;
	//   23   44:aconst_null     
	//   24   45:areturn         
		obj = ((Object) (((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo)));
	//   25   46:aload_3         
	//   26   47:aload_1         
	//   27   48:invokevirtual   #210 <Method String ComponentName.getPackageName()>
	//   28   51:iload_2         
	//   29   52:aload           4
	//   30   54:getfield        #214 <Field android.content.pm.ApplicationInfo ActivityInfo.applicationInfo>
	//   31   57:invokevirtual   #218 <Method Drawable PackageManager.getDrawable(String, int, android.content.pm.ApplicationInfo)>
	//   32   60:astore_3        
		if(obj == null)
	//*  33   61:aload_3         
	//*  34   62:ifnonnull       104
		{
			Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i).append(" for ").append(componentname.flattenToShortString()).toString());
	//   35   65:ldc1            #19  <String "SuggestionsAdapter">
	//   36   67:new             #220 <Class StringBuilder>
	//   37   70:dup             
	//   38   71:invokespecial   #221 <Method void StringBuilder()>
	//   39   74:ldc1            #223 <String "Invalid icon resource ">
	//   40   76:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:iload_2         
	//   42   80:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   43   83:ldc1            #232 <String " for ">
	//   44   85:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   45   88:aload_1         
	//   46   89:invokevirtual   #235 <Method String ComponentName.flattenToShortString()>
	//   47   92:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   48   95:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   49   98:invokestatic    #200 <Method int Log.w(String, String)>
	//   50  101:pop             
			return null;
	//   51  102:aconst_null     
	//   52  103:areturn         
		} else
		{
			return ((Drawable) (obj));
	//   53  104:aload_3         
	//   54  105:areturn         
		}
	}

	private Drawable getActivityIconWithCache(ComponentName componentname)
	{
		String s = componentname.flattenToShortString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #235 <Method String ComponentName.flattenToShortString()>
	//    2    4:astore_2        
		if(mOutsideDrawablesCache.containsKey(((Object) (s))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #241 <Method boolean WeakHashMap.containsKey(Object)>
	//*   7   13:ifeq            46
		{
			componentname = ((ComponentName) ((android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(((Object) (s)))));
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #114 <Method Object WeakHashMap.get(Object)>
	//   12   24:checkcast       #116 <Class android.graphics.drawable.Drawable$ConstantState>
	//   13   27:astore_1        
			if(componentname == null)
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       34
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			else
				return ((android.graphics.drawable.Drawable.ConstantState) (componentname)).newDrawable(mProviderContext.getResources());
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #101 <Field Context mProviderContext>
	//   21   39:invokevirtual   #148 <Method Resources Context.getResources()>
	//   22   42:invokevirtual   #244 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   23   45:areturn         
		}
		Drawable drawable = getActivityIcon(componentname);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #246 <Method Drawable getActivityIcon(ComponentName)>
	//   27   51:astore_3        
		if(drawable == null)
	//*  28   52:aload_3         
	//*  29   53:ifnonnull       61
			componentname = null;
	//   30   56:aconst_null     
	//   31   57:astore_1        
		else
	//*  32   58:goto            66
			componentname = ((ComponentName) (drawable.getConstantState()));
	//   33   61:aload_3         
	//   34   62:invokevirtual   #252 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   35   65:astore_1        
		mOutsideDrawablesCache.put(((Object) (s)), ((Object) (componentname)));
	//   36   66:aload_0         
	//   37   67:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   38   70:aload_2         
	//   39   71:aload_1         
	//   40   72:invokevirtual   #256 <Method Object WeakHashMap.put(Object, Object)>
	//   41   75:pop             
		return drawable;
	//   42   76:aload_3         
	//   43   77:areturn         
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
			break MISSING_BLOCK_LABEL_52;
	//    5   11:iload_2         
	//    6   12:ifeq            52
		Object obj = ((Object) (getDrawableFromResourceUri(uri)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #303 <Method Drawable getDrawableFromResourceUri(Uri)>
	//   10   20:astore_3        
		return ((Drawable) (obj));
	//   11   21:aload_3         
	//   12   22:areturn         
		android.content.res.Resources.NotFoundException notfoundexception;
		notfoundexception;
	//   13   23:astore_3        
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
		notfoundexception = ((android.content.res.Resources.NotFoundException) (mProviderContext.getContentResolver().openInputStream(uri)));
	//   26   52:aload_0         
	//   27   53:getfield        #101 <Field Context mProviderContext>
	//   28   56:invokevirtual   #315 <Method ContentResolver Context.getContentResolver()>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #321 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   31   63:astore_3        
		if(notfoundexception == null)
	//*  32   64:aload_3         
	//*  33   65:ifnonnull       96
		{
			IOException ioexception;
			Drawable drawable;
			Exception exception;
			try
			{
				throw new FileNotFoundException((new StringBuilder()).append("Failed to open ").append(((Object) (uri))).toString());
	//   34   68:new             #284 <Class FileNotFoundException>
	//   35   71:dup             
	//   36   72:new             #220 <Class StringBuilder>
	//   37   75:dup             
	//   38   76:invokespecial   #221 <Method void StringBuilder()>
	//   39   79:ldc2            #323 <String "Failed to open ">
	//   40   82:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:aload_1         
	//   42   86:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   43   89:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   44   92:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   45   95:athrow          
			}
	//*  46   96:aload_3         
	//*  47   97:aconst_null     
	//*  48   98:invokestatic    #327 <Method Drawable Drawable.createFromStream(InputStream, String)>
	//*  49  101:astore          4
	//*  50  103:aload_3         
	//*  51  104:invokevirtual   #332 <Method void InputStream.close()>
	//*  52  107:aload           4
	//*  53  109:areturn         
	//*  54  110:astore_3        
	//*  55  111:ldc1            #19  <String "SuggestionsAdapter">
	//*  56  113:new             #220 <Class StringBuilder>
	//*  57  116:dup             
	//*  58  117:invokespecial   #221 <Method void StringBuilder()>
	//*  59  120:ldc2            #334 <String "Error closing icon stream for ">
	//*  60  123:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  61  126:aload_1         
	//*  62  127:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  63  130:invokevirtual   #236 <Method String StringBuilder.toString()>
	//*  64  133:aload_3         
	//*  65  134:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//*  66  137:pop             
	//*  67  138:aload           4
	//*  68  140:areturn         
	//*  69  141:astore          4
	//*  70  143:aload_3         
	//*  71  144:invokevirtual   #332 <Method void InputStream.close()>
	//*  72  147:goto            178
	//*  73  150:astore_3        
	//*  74  151:ldc1            #19  <String "SuggestionsAdapter">
	//*  75  153:new             #220 <Class StringBuilder>
	//*  76  156:dup             
	//*  77  157:invokespecial   #221 <Method void StringBuilder()>
	//*  78  160:ldc2            #334 <String "Error closing icon stream for ">
	//*  79  163:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  80  166:aload_1         
	//*  81  167:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  82  170:invokevirtual   #236 <Method String StringBuilder.toString()>
	//*  83  173:aload_3         
	//*  84  174:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//*  85  177:pop             
	//*  86  178:aload           4
	//*  87  180:athrow          
			catch(FileNotFoundException filenotfoundexception)
	//*  88  181:astore_3        
			{
				Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon not found: ").append(((Object) (uri))).append(", ").append(filenotfoundexception.getMessage()).toString());
	//   89  182:ldc1            #19  <String "SuggestionsAdapter">
	//   90  184:new             #220 <Class StringBuilder>
	//   91  187:dup             
	//   92  188:invokespecial   #221 <Method void StringBuilder()>
	//   93  191:ldc2            #340 <String "Icon not found: ">
	//   94  194:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   95  197:aload_1         
	//   96  198:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   97  201:ldc2            #342 <String ", ">
	//   98  204:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   99  207:aload_3         
	//  100  208:invokevirtual   #345 <Method String FileNotFoundException.getMessage()>
	//  101  211:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  102  214:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  103  217:invokestatic    #200 <Method int Log.w(String, String)>
	//  104  220:pop             
			}
			break MISSING_BLOCK_LABEL_221;
		}
		drawable = Drawable.createFromStream(((InputStream) (notfoundexception)), ((String) (null)));
		((InputStream) (notfoundexception)).close();
		return drawable;
		notfoundexception;
		Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(((Object) (uri))).toString(), ((Throwable) (notfoundexception)));
		return drawable;
		exception;
		((InputStream) (notfoundexception)).close();
		break MISSING_BLOCK_LABEL_178;
		ioexception;
		Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(((Object) (uri))).toString(), ((Throwable) (ioexception)));
		throw exception;
		return null;
	//  105  221:aconst_null     
	//  106  222:areturn         
	}

	private Drawable getDrawableFromResourceValue(String s)
	{
		if(s == null || s.length() == 0 || "0".equals(((Object) (s))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #349 <Method int String.length()>
	//*   4    8:ifeq            21
	//*   5   11:ldc2            #351 <String "0">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*   8   18:ifeq            23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		int i;
		String s1;
		Drawable drawable2;
		try
		{
			i = Integer.parseInt(s);
	//   11   23:aload_1         
	//   12   24:invokestatic    #356 <Method int Integer.parseInt(String)>
	//   13   27:istore_2        
			s1 = (new StringBuilder()).append("android.resource://").append(mProviderContext.getPackageName()).append("/").append(i).toString();
	//   14   28:new             #220 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #221 <Method void StringBuilder()>
	//   17   35:ldc2            #358 <String "android.resource://">
	//   18   38:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #101 <Field Context mProviderContext>
	//   21   45:invokevirtual   #359 <Method String Context.getPackageName()>
	//   22   48:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:ldc2            #361 <String "/">
	//   24   54:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:iload_2         
	//   26   58:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   27   61:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   28   64:astore_3        
			drawable2 = checkIconCache(s1);
	//   29   65:aload_0         
	//   30   66:aload_3         
	//   31   67:invokespecial   #363 <Method Drawable checkIconCache(String)>
	//   32   70:astore          4
		}
	//*  33   72:aload           4
	//*  34   74:ifnull          80
	//*  35   77:aload           4
	//*  36   79:areturn         
	//*  37   80:aload_0         
	//*  38   81:getfield        #101 <Field Context mProviderContext>
	//*  39   84:iload_2         
	//*  40   85:invokestatic    #368 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  41   88:astore          4
	//*  42   90:aload_0         
	//*  43   91:aload_3         
	//*  44   92:aload           4
	//*  45   94:invokespecial   #372 <Method void storeInIconCache(String, Drawable)>
	//*  46   97:aload           4
	//*  47   99:areturn         
		catch(NumberFormatException numberformatexception)
	//*  48  100:astore_3        
		{
			Drawable drawable = checkIconCache(s);
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:invokespecial   #363 <Method Drawable checkIconCache(String)>
	//   52  106:astore_3        
			if(drawable != null)
	//*  53  107:aload_3         
	//*  54  108:ifnull          113
			{
				return drawable;
	//   55  111:aload_3         
	//   56  112:areturn         
			} else
			{
				Drawable drawable1 = getDrawable(Uri.parse(s));
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:invokestatic    #376 <Method Uri Uri.parse(String)>
	//   60  118:invokespecial   #378 <Method Drawable getDrawable(Uri)>
	//   61  121:astore_3        
				storeInIconCache(s, drawable1);
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:aload_3         
	//   65  125:invokespecial   #372 <Method void storeInIconCache(String, Drawable)>
				return drawable1;
	//   66  128:aload_3         
	//   67  129:areturn         
			}
		}
		catch(android.content.res.Resources.NotFoundException notfoundexception)
	//*  68  130:astore_3        
		{
			Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s).toString());
	//   69  131:ldc1            #19  <String "SuggestionsAdapter">
	//   70  133:new             #220 <Class StringBuilder>
	//   71  136:dup             
	//   72  137:invokespecial   #221 <Method void StringBuilder()>
	//   73  140:ldc2            #380 <String "Icon resource not found: ">
	//   74  143:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   75  146:aload_1         
	//   76  147:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   77  150:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   78  153:invokestatic    #200 <Method int Log.w(String, String)>
	//   79  156:pop             
			return null;
	//   80  157:aconst_null     
	//   81  158:areturn         
		}
		if(drawable2 != null)
			return drawable2;
		drawable2 = ContextCompat.getDrawable(mProviderContext, i);
		storeInIconCache(s1, drawable2);
		return drawable2;
	}

	private Drawable getIcon1(Cursor cursor)
	{
		if(mIconName1Col == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int mIconName1Col>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		Drawable drawable = getDrawableFromResourceValue(cursor.getString(mIconName1Col));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #71  <Field int mIconName1Col>
	//   10   16:invokeinterface #385 <Method String Cursor.getString(int)>
	//   11   21:invokespecial   #387 <Method Drawable getDrawableFromResourceValue(String)>
	//   12   24:astore_2        
		if(drawable != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          31
			return drawable;
	//   15   29:aload_2         
	//   16   30:areturn         
		else
			return getDefaultIcon1(cursor);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #389 <Method Drawable getDefaultIcon1(Cursor)>
	//   20   36:areturn         
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
	//   10   16:invokeinterface #385 <Method String Cursor.getString(int)>
	//   11   21:invokespecial   #387 <Method Drawable getDrawableFromResourceValue(String)>
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
	//    7    9:invokeinterface #385 <Method String Cursor.getString(int)>
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
	//   13   20:ldc2            #394 <String "unexpected error retrieving valid column from cursor, did the remote process die?">
	//   14   23:aload_0         
	//   15   24:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
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
	//    2    2:invokevirtual   #402 <Method void ImageView.setImageDrawable(Drawable)>
		if(drawable == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			imageview.setVisibility(i);
	//    5    9:aload_1         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #406 <Method void ImageView.setVisibility(int)>
			return;
	//    8   14:return          
		} else
		{
			imageview.setVisibility(0);
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #406 <Method void ImageView.setVisibility(int)>
			drawable.setVisible(false, false);
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #410 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   16   26:pop             
			drawable.setVisible(true, false);
	//   17   27:aload_2         
	//   18   28:iconst_1        
	//   19   29:iconst_0        
	//   20   30:invokevirtual   #410 <Method boolean Drawable.setVisible(boolean, boolean)>
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
	//    2    2:invokevirtual   #417 <Method void TextView.setText(CharSequence)>
		if(TextUtils.isEmpty(charsequence))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #423 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            19
		{
			textview.setVisibility(8);
	//    6   12:aload_1         
	//    7   13:bipush          8
	//    8   15:invokevirtual   #424 <Method void TextView.setVisibility(int)>
			return;
	//    9   18:return          
		} else
		{
			textview.setVisibility(0);
	//   10   19:aload_1         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #424 <Method void TextView.setVisibility(int)>
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
	//    6   10:invokevirtual   #252 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    7   13:invokevirtual   #256 <Method Object WeakHashMap.put(Object, Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void updateSpinnerState(Cursor cursor)
	{
		if(cursor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			cursor = ((Cursor) (cursor.getExtras()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #430 <Method Bundle Cursor.getExtras()>
	//    4   10:astore_1        
		else
	//*   5   11:goto            16
			cursor = null;
	//    6   14:aconst_null     
	//    7   15:astore_1        
		if(cursor != null && ((Bundle) (cursor)).getBoolean("in_progress"))
	//*   8   16:aload_1         
	//*   9   17:ifnull          31
	//*  10   20:aload_1         
	//*  11   21:ldc2            #432 <String "in_progress">
	//*  12   24:invokevirtual   #438 <Method boolean Bundle.getBoolean(String)>
	//*  13   27:ifeq            31
			return;
	//   14   30:return          
		else
			return;
	//   15   31:return          
	}

	public void bindView(View view, Context context, Cursor cursor)
	{
		context = ((Context) ((ChildViewCache)view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #446 <Method Object View.getTag()>
	//    2    4:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore          4
		if(mFlagsCol != -1)
	//*   6   11:aload_0         
	//*   7   12:getfield        #75  <Field int mFlagsCol>
	//*   8   15:iconst_m1       
	//*   9   16:icmpeq          31
			i = cursor.getInt(mFlagsCol);
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:getfield        #75  <Field int mFlagsCol>
	//   13   24:invokeinterface #450 <Method int Cursor.getInt(int)>
	//   14   29:istore          4
		if(((ChildViewCache) (context)).mText1 != null)
	//*  15   31:aload_2         
	//*  16   32:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  17   35:ifnull          56
		{
			view = ((View) (getStringOrNull(cursor, mText1Col)));
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:getfield        #65  <Field int mText1Col>
	//   21   43:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   22   46:astore_1        
			setViewText(((ChildViewCache) (context)).mText1, ((CharSequence) (view)));
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   26   52:aload_1         
	//   27   53:invokespecial   #456 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mText2 != null)
	//*  28   56:aload_2         
	//*  29   57:getfield        #459 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//*  30   60:ifnull          159
		{
			view = ((View) (getStringOrNull(cursor, mText2UrlCol)));
	//   31   63:aload_3         
	//   32   64:aload_0         
	//   33   65:getfield        #69  <Field int mText2UrlCol>
	//   34   68:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   35   71:astore_1        
			if(view != null)
	//*  36   72:aload_1         
	//*  37   73:ifnull          85
				view = ((View) (formatUrl(((CharSequence) (view)))));
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokespecial   #461 <Method CharSequence formatUrl(CharSequence)>
	//   41   81:astore_1        
			else
	//*  42   82:goto            94
				view = ((View) (getStringOrNull(cursor, mText2Col)));
	//   43   85:aload_3         
	//   44   86:aload_0         
	//   45   87:getfield        #67  <Field int mText2Col>
	//   46   90:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   47   93:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (view))))
	//*  48   94:aload_1         
	//*  49   95:invokestatic    #423 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  50   98:ifeq            127
			{
				if(((ChildViewCache) (context)).mText1 != null)
	//*  51  101:aload_2         
	//*  52  102:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  53  105:ifnull          150
				{
					((ChildViewCache) (context)).mText1.setSingleLine(false);
	//   54  108:aload_2         
	//   55  109:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   56  112:iconst_0        
	//   57  113:invokevirtual   #465 <Method void TextView.setSingleLine(boolean)>
					((ChildViewCache) (context)).mText1.setMaxLines(2);
	//   58  116:aload_2         
	//   59  117:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   60  120:iconst_2        
	//   61  121:invokevirtual   #468 <Method void TextView.setMaxLines(int)>
				}
			} else
	//*  62  124:goto            150
			if(((ChildViewCache) (context)).mText1 != null)
	//*  63  127:aload_2         
	//*  64  128:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  65  131:ifnull          150
			{
				((ChildViewCache) (context)).mText1.setSingleLine(true);
	//   66  134:aload_2         
	//   67  135:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   68  138:iconst_1        
	//   69  139:invokevirtual   #465 <Method void TextView.setSingleLine(boolean)>
				((ChildViewCache) (context)).mText1.setMaxLines(1);
	//   70  142:aload_2         
	//   71  143:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   72  146:iconst_1        
	//   73  147:invokevirtual   #468 <Method void TextView.setMaxLines(int)>
			}
			setViewText(((ChildViewCache) (context)).mText2, ((CharSequence) (view)));
	//   74  150:aload_0         
	//   75  151:aload_2         
	//   76  152:getfield        #459 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//   77  155:aload_1         
	//   78  156:invokespecial   #456 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mIcon1 != null)
	//*  79  159:aload_2         
	//*  80  160:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//*  81  163:ifnull          180
			setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
	//   82  166:aload_0         
	//   83  167:aload_2         
	//   84  168:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//   85  171:aload_0         
	//   86  172:aload_3         
	//   87  173:invokespecial   #474 <Method Drawable getIcon1(Cursor)>
	//   88  176:iconst_4        
	//   89  177:invokespecial   #476 <Method void setViewDrawable(ImageView, Drawable, int)>
		if(((ChildViewCache) (context)).mIcon2 != null)
	//*  90  180:aload_2         
	//*  91  181:getfield        #479 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//*  92  184:ifnull          202
			setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
	//   93  187:aload_0         
	//   94  188:aload_2         
	//   95  189:getfield        #479 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//   96  192:aload_0         
	//   97  193:aload_3         
	//   98  194:invokespecial   #481 <Method Drawable getIcon2(Cursor)>
	//   99  197:bipush          8
	//  100  199:invokespecial   #476 <Method void setViewDrawable(ImageView, Drawable, int)>
		if(mQueryRefinement == 2 || mQueryRefinement == 1 && (i & 1) != 0)
	//* 101  202:aload_0         
	//* 102  203:getfield        #63  <Field int mQueryRefinement>
	//* 103  206:iconst_2        
	//* 104  207:icmpeq          225
	//* 105  210:aload_0         
	//* 106  211:getfield        #63  <Field int mQueryRefinement>
	//* 107  214:iconst_1        
	//* 108  215:icmpne          256
	//* 109  218:iload           4
	//* 110  220:iconst_1        
	//* 111  221:iand            
	//* 112  222:ifeq            256
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(0);
	//  113  225:aload_2         
	//  114  226:getfield        #484 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  115  229:iconst_0        
	//  116  230:invokevirtual   #406 <Method void ImageView.setVisibility(int)>
			((ChildViewCache) (context)).mIconRefine.setTag(((Object) (((ChildViewCache) (context)).mText1.getText())));
	//  117  233:aload_2         
	//  118  234:getfield        #484 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  119  237:aload_2         
	//  120  238:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//  121  241:invokevirtual   #488 <Method CharSequence TextView.getText()>
	//  122  244:invokevirtual   #492 <Method void ImageView.setTag(Object)>
			((ChildViewCache) (context)).mIconRefine.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//  123  247:aload_2         
	//  124  248:getfield        #484 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  125  251:aload_0         
	//  126  252:invokevirtual   #496 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//  127  255:return          
		} else
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(8);
	//  128  256:aload_2         
	//  129  257:getfield        #484 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  130  260:bipush          8
	//  131  262:invokevirtual   #406 <Method void ImageView.setVisibility(int)>
			return;
	//  132  265:return          
		}
	}

	public void changeCursor(Cursor cursor)
	{
		if(mClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field boolean mClosed>
	//*   2    4:ifeq            27
		{
			Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
	//    3    7:ldc1            #19  <String "SuggestionsAdapter">
	//    4    9:ldc2            #499 <String "Tried to change cursor after adapter was closed.">
	//    5   12:invokestatic    #200 <Method int Log.w(String, String)>
	//    6   15:pop             
			if(cursor != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          26
				cursor.close();
	//    9   20:aload_1         
	//   10   21:invokeinterface #500 <Method void Cursor.close()>
			return;
	//   11   26:return          
		}
		try
		{
			super.changeCursor(cursor);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #502 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
		}
	//*  15   32:aload_1         
	//*  16   33:ifnull          114
	//*  17   36:aload_0         
	//*  18   37:aload_1         
	//*  19   38:ldc2            #504 <String "suggest_text_1">
	//*  20   41:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  21   46:putfield        #65  <Field int mText1Col>
	//*  22   49:aload_0         
	//*  23   50:aload_1         
	//*  24   51:ldc2            #506 <String "suggest_text_2">
	//*  25   54:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  26   59:putfield        #67  <Field int mText2Col>
	//*  27   62:aload_0         
	//*  28   63:aload_1         
	//*  29   64:ldc2            #508 <String "suggest_text_2_url">
	//*  30   67:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  31   72:putfield        #69  <Field int mText2UrlCol>
	//*  32   75:aload_0         
	//*  33   76:aload_1         
	//*  34   77:ldc2            #510 <String "suggest_icon_1">
	//*  35   80:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  36   85:putfield        #71  <Field int mIconName1Col>
	//*  37   88:aload_0         
	//*  38   89:aload_1         
	//*  39   90:ldc2            #512 <String "suggest_icon_2">
	//*  40   93:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  41   98:putfield        #73  <Field int mIconName2Col>
	//*  42  101:aload_0         
	//*  43  102:aload_1         
	//*  44  103:ldc2            #514 <String "suggest_flags">
	//*  45  106:invokeinterface #264 <Method int Cursor.getColumnIndex(String)>
	//*  46  111:putfield        #75  <Field int mFlagsCol>
	//*  47  114:return          
		// Misplaced declaration of an exception variable
		catch(Cursor cursor)
	//*  48  115:astore_1        
		{
			Log.e("SuggestionsAdapter", "error changing cursor and caching columns", ((Throwable) (cursor)));
	//   49  116:ldc1            #19  <String "SuggestionsAdapter">
	//   50  118:ldc2            #516 <String "error changing cursor and caching columns">
	//   51  121:aload_1         
	//   52  122:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//   53  125:pop             
			return;
	//   54  126:return          
		}
		if(cursor == null)
			break MISSING_BLOCK_LABEL_114;
		mText1Col = cursor.getColumnIndex("suggest_text_1");
		mText2Col = cursor.getColumnIndex("suggest_text_2");
		mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
		mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
		mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
		mFlagsCol = cursor.getColumnIndex("suggest_flags");
	}

	public void close()
	{
		changeCursor(((Cursor) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #517 <Method void changeCursor(Cursor)>
		mClosed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #61  <Field boolean mClosed>
	//    6   10:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		if(cursor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		String s = getColumnString(cursor, "suggest_intent_query");
	//    4    6:aload_1         
	//    5    7:ldc2            #521 <String "suggest_intent_query">
	//    6   10:invokestatic    #523 <Method String getColumnString(Cursor, String)>
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
	//*  14   24:invokevirtual   #527 <Method boolean SearchableInfo.shouldRewriteQueryFromData()>
	//*  15   27:ifeq            44
		{
			String s1 = getColumnString(cursor, "suggest_intent_data");
	//   16   30:aload_1         
	//   17   31:ldc2            #529 <String "suggest_intent_data">
	//   18   34:invokestatic    #523 <Method String getColumnString(Cursor, String)>
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
	//*  26   48:invokevirtual   #532 <Method boolean SearchableInfo.shouldRewriteQueryFromText()>
	//*  27   51:ifeq            68
		{
			cursor = ((Cursor) (getColumnString(cursor, "suggest_text_1")));
	//   28   54:aload_1         
	//   29   55:ldc2            #504 <String "suggest_text_1">
	//   30   58:invokestatic    #523 <Method String getColumnString(Cursor, String)>
	//   31   61:astore_1        
			if(cursor != null)
	//*  32   62:aload_1         
	//*  33   63:ifnull          68
				return ((CharSequence) (cursor));
	//   34   66:aload_1         
	//   35   67:areturn         
		}
		return null;
	//   36   68:aconst_null     
	//   37   69:areturn         
	}

	Drawable getDrawableFromResourceUri(Uri uri)
		throws FileNotFoundException
	{
		Object obj = ((Object) (uri.getAuthority()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #535 <Method String Uri.getAuthority()>
	//    2    4:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #423 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            40
			throw new FileNotFoundException((new StringBuilder()).append("No authority: ").append(((Object) (uri))).toString());
	//    6   12:new             #284 <Class FileNotFoundException>
	//    7   15:dup             
	//    8   16:new             #220 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #221 <Method void StringBuilder()>
	//   11   23:ldc2            #537 <String "No authority: ">
	//   12   26:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   15   33:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   17   39:athrow          
		Resources resources;
		try
		{
			resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
	//   18   40:aload_0         
	//   19   41:getfield        #78  <Field Context mContext>
	//   20   44:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//   21   47:aload_3         
	//   22   48:invokevirtual   #541 <Method Resources PackageManager.getResourcesForApplication(String)>
	//   23   51:astore          4
		}
	//*  24   53:goto            85
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  25   56:astore_3        
		{
			throw new FileNotFoundException((new StringBuilder()).append("No package found for authority: ").append(((Object) (uri))).toString());
	//   26   57:new             #284 <Class FileNotFoundException>
	//   27   60:dup             
	//   28   61:new             #220 <Class StringBuilder>
	//   29   64:dup             
	//   30   65:invokespecial   #221 <Method void StringBuilder()>
	//   31   68:ldc2            #543 <String "No package found for authority: ">
	//   32   71:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   33   74:aload_1         
	//   34   75:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   35   78:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   36   81:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   37   84:athrow          
		}
		List list = uri.getPathSegments();
	//   38   85:aload_1         
	//   39   86:invokevirtual   #547 <Method List Uri.getPathSegments()>
	//   40   89:astore          5
		if(list == null)
	//*  41   91:aload           5
	//*  42   93:ifnonnull       124
			throw new FileNotFoundException((new StringBuilder()).append("No path: ").append(((Object) (uri))).toString());
	//   43   96:new             #284 <Class FileNotFoundException>
	//   44   99:dup             
	//   45  100:new             #220 <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #221 <Method void StringBuilder()>
	//   48  107:ldc2            #549 <String "No path: ">
	//   49  110:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   50  113:aload_1         
	//   51  114:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   52  117:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   53  120:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   54  123:athrow          
		int i = list.size();
	//   55  124:aload           5
	//   56  126:invokeinterface #554 <Method int List.size()>
	//   57  131:istore_2        
		if(i == 1)
	//*  58  132:iload_2         
	//*  59  133:iconst_1        
	//*  60  134:icmpne          184
			try
			{
				i = Integer.parseInt((String)list.get(0));
	//   61  137:aload           5
	//   62  139:iconst_0        
	//   63  140:invokeinterface #557 <Method Object List.get(int)>
	//   64  145:checkcast       #297 <Class String>
	//   65  148:invokestatic    #356 <Method int Integer.parseInt(String)>
	//   66  151:istore_2        
			}
	//*  67  152:goto            249
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  68  155:astore_3        
			{
				throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(((Object) (uri))).toString());
	//   69  156:new             #284 <Class FileNotFoundException>
	//   70  159:dup             
	//   71  160:new             #220 <Class StringBuilder>
	//   72  163:dup             
	//   73  164:invokespecial   #221 <Method void StringBuilder()>
	//   74  167:ldc2            #559 <String "Single path segment is not a resource ID: ">
	//   75  170:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   76  173:aload_1         
	//   77  174:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   78  177:invokevirtual   #236 <Method String StringBuilder.toString()>
	//   79  180:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   80  183:athrow          
			}
		else
		if(i == 2)
	//*  81  184:iload_2         
	//*  82  185:iconst_2        
	//*  83  186:icmpne          221
			i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
	//   84  189:aload           4
	//   85  191:aload           5
	//   86  193:iconst_1        
	//   87  194:invokeinterface #557 <Method Object List.get(int)>
	//   88  199:checkcast       #297 <Class String>
	//   89  202:aload           5
	//   90  204:iconst_0        
	//   91  205:invokeinterface #557 <Method Object List.get(int)>
	//   92  210:checkcast       #297 <Class String>
	//   93  213:aload_3         
	//   94  214:invokevirtual   #563 <Method int Resources.getIdentifier(String, String, String)>
	//   95  217:istore_2        
		else
	//*  96  218:goto            249
			throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(((Object) (uri))).toString());
	//   97  221:new             #284 <Class FileNotFoundException>
	//   98  224:dup             
	//   99  225:new             #220 <Class StringBuilder>
	//  100  228:dup             
	//  101  229:invokespecial   #221 <Method void StringBuilder()>
	//  102  232:ldc2            #565 <String "More than two path segments: ">
	//  103  235:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  104  238:aload_1         
	//  105  239:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//  106  242:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  107  245:invokespecial   #311 <Method void FileNotFoundException(String)>
	//  108  248:athrow          
		if(i == 0)
	//* 109  249:iload_2         
	//* 110  250:ifne            281
			throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(((Object) (uri))).toString());
	//  111  253:new             #284 <Class FileNotFoundException>
	//  112  256:dup             
	//  113  257:new             #220 <Class StringBuilder>
	//  114  260:dup             
	//  115  261:invokespecial   #221 <Method void StringBuilder()>
	//  116  264:ldc2            #567 <String "No resource found for: ">
	//  117  267:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  118  270:aload_1         
	//  119  271:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//  120  274:invokevirtual   #236 <Method String StringBuilder.toString()>
	//  121  277:invokespecial   #311 <Method void FileNotFoundException(String)>
	//  122  280:athrow          
		else
			return resources.getDrawable(i);
	//  123  281:aload           4
	//  124  283:iload_2         
	//  125  284:invokevirtual   #570 <Method Drawable Resources.getDrawable(int)>
	//  126  287:areturn         
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
		if(searchableinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (searchableinfo.getSuggestAuthority()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #577 <Method String SearchableInfo.getSuggestAuthority()>
	//    6   10:astore          4
		if(obj == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		obj = ((Object) ((new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("")));
	//   11   19:new             #579 <Class android.net.Uri$Builder>
	//   12   22:dup             
	//   13   23:invokespecial   #580 <Method void android.net.Uri$Builder()>
	//   14   26:ldc2            #582 <String "content">
	//   15   29:invokevirtual   #586 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   16   32:aload           4
	//   17   34:invokevirtual   #589 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   18   37:ldc2            #591 <String "">
	//   19   40:invokevirtual   #594 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//   20   43:ldc2            #591 <String "">
	//   21   46:invokevirtual   #597 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   22   49:astore          4
		String s1 = searchableinfo.getSuggestPath();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #600 <Method String SearchableInfo.getSuggestPath()>
	//   25   55:astore          5
		if(s1 != null)
	//*  26   57:aload           5
	//*  27   59:ifnull          70
			((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokevirtual   #603 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   31   69:pop             
		((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
	//   32   70:aload           4
	//   33   72:ldc2            #605 <String "search_suggest_query">
	//   34   75:invokevirtual   #608 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   35   78:pop             
		s1 = searchableinfo.getSuggestSelection();
	//   36   79:aload_1         
	//   37   80:invokevirtual   #611 <Method String SearchableInfo.getSuggestSelection()>
	//   38   83:astore          5
		searchableinfo = null;
	//   39   85:aconst_null     
	//   40   86:astore_1        
		if(s1 != null)
	//*  41   87:aload           5
	//*  42   89:ifnull          104
		{
			searchableinfo = ((SearchableInfo) (new String[1]));
	//   43   92:iconst_1        
	//   44   93:anewarray       String[]
	//   45   96:astore_1        
			searchableinfo[0] = ((/*<invalid signature>*/java.lang.Object) (s));
	//   46   97:aload_1         
	//   47   98:iconst_0        
	//   48   99:aload_2         
	//   49  100:aastore         
		} else
	//*  50  101:goto            111
		{
			((android.net.Uri.Builder) (obj)).appendPath(s);
	//   51  104:aload           4
	//   52  106:aload_2         
	//   53  107:invokevirtual   #608 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   54  110:pop             
		}
		if(i > 0)
	//*  55  111:iload_3         
	//*  56  112:ifle            128
			((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i));
	//   57  115:aload           4
	//   58  117:ldc2            #613 <String "limit">
	//   59  120:iload_3         
	//   60  121:invokestatic    #616 <Method String String.valueOf(int)>
	//   61  124:invokevirtual   #620 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   62  127:pop             
		s = ((String) (((android.net.Uri.Builder) (obj)).build()));
	//   63  128:aload           4
	//   64  130:invokevirtual   #624 <Method Uri android.net.Uri$Builder.build()>
	//   65  133:astore_2        
		return mContext.getContentResolver().query(((Uri) (s)), ((String []) (null)), s1, ((String []) (searchableinfo)), ((String) (null)));
	//   66  134:aload_0         
	//   67  135:getfield        #78  <Field Context mContext>
	//   68  138:invokevirtual   #315 <Method ContentResolver Context.getContentResolver()>
	//   69  141:aload_2         
	//   70  142:aconst_null     
	//   71  143:aload           5
	//   72  145:aload_1         
	//   73  146:aconst_null     
	//   74  147:invokevirtual   #627 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   75  150:areturn         
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
	//    4    4:invokespecial   #633 <Method View ResourceCursorAdapter.getView(int, View, ViewGroup)>
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
	//   10   13:ldc2            #635 <String "Search suggestions cursor threw exception.">
	//   11   16:aload_2         
	//   12   17:invokestatic    #637 <Method int Log.w(String, String, Throwable)>
	//   13   20:pop             
			viewgroup = ((ViewGroup) (newView(mContext, mCursor, viewgroup)));
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #78  <Field Context mContext>
	//   17   26:aload_0         
	//   18   27:getfield        #641 <Field Cursor mCursor>
	//   19   30:aload_3         
	//   20   31:invokevirtual   #645 <Method View newView(Context, Cursor, ViewGroup)>
	//   21   34:astore_3        
			if(viewgroup != null)
	//*  22   35:aload_3         
	//*  23   36:ifnull          56
				((ChildViewCache)((View) (viewgroup)).getTag()).mText1.setText(((CharSequence) (((RuntimeException) (view)).toString())));
	//   24   39:aload_3         
	//   25   40:invokevirtual   #446 <Method Object View.getTag()>
	//   26   43:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//   27   46:getfield        #454 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #646 <Method String RuntimeException.toString()>
	//   30   53:invokevirtual   #417 <Method void TextView.setText(CharSequence)>
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
	//    4    4:invokespecial   #648 <Method View ResourceCursorAdapter.newView(Context, Cursor, ViewGroup)>
	//    5    7:astore_1        
		((View) (context)).setTag(((Object) (new ChildViewCache(((View) (context))))));
	//    6    8:aload_1         
	//    7    9:new             #8   <Class SuggestionsAdapter$ChildViewCache>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #651 <Method void SuggestionsAdapter$ChildViewCache(View)>
	//   11   17:invokevirtual   #652 <Method void View.setTag(Object)>
		((ImageView)((View) (context)).findViewById(android.support.v7.appcompat.R.id.edit_query)).setImageResource(mCommitIconResId);
	//   12   20:aload_1         
	//   13   21:getstatic       #657 <Field int android.support.v7.appcompat.R$id.edit_query>
	//   14   24:invokevirtual   #661 <Method View View.findViewById(int)>
	//   15   27:checkcast       #398 <Class ImageView>
	//   16   30:aload_0         
	//   17   31:getfield        #99  <Field int mCommitIconResId>
	//   18   34:invokevirtual   #664 <Method void ImageView.setImageResource(int)>
		return ((View) (context));
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public void notifyDataSetChanged()
	{
		super.notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #667 <Method void ResourceCursorAdapter.notifyDataSetChanged()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #671 <Method Cursor getCursor()>
	//    5    9:invokespecial   #673 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void notifyDataSetInvalidated()
	{
		super.notifyDataSetInvalidated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #676 <Method void ResourceCursorAdapter.notifyDataSetInvalidated()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #671 <Method Cursor getCursor()>
	//    5    9:invokespecial   #673 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void onClick(View view)
	{
		view = ((View) (view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #446 <Method Object View.getTag()>
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
	//   10   20:invokevirtual   #680 <Method void SearchView.onQueryRefine(CharSequence)>
	//   11   23:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
			charsequence = "";
	//    2    4:ldc2            #591 <String "">
	//    3    7:astore_1        
		else
	//*   4    8:goto            18
			charsequence = ((CharSequence) (charsequence.toString()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #683 <Method String CharSequence.toString()>
	//    7   17:astore_1        
		if(mSearchView.getVisibility() != 0 || mSearchView.getWindowVisibility() != 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #92  <Field SearchView mSearchView>
	//*  10   22:invokevirtual   #686 <Method int SearchView.getVisibility()>
	//*  11   25:ifne            38
	//*  12   28:aload_0         
	//*  13   29:getfield        #92  <Field SearchView mSearchView>
	//*  14   32:invokevirtual   #689 <Method int SearchView.getWindowVisibility()>
	//*  15   35:ifeq            40
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		charsequence = ((CharSequence) (getSearchManagerSuggestions(mSearchable, ((String) (charsequence)), 50)));
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #94  <Field SearchableInfo mSearchable>
	//   21   45:aload_1         
	//   22   46:bipush          50
	//   23   48:invokevirtual   #691 <Method Cursor getSearchManagerSuggestions(SearchableInfo, String, int)>
	//   24   51:astore_1        
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_79;
	//   25   52:aload_1         
	//   26   53:ifnull          65
		((Cursor) (charsequence)).getCount();
	//   27   56:aload_1         
	//   28   57:invokeinterface #694 <Method int Cursor.getCount()>
	//   29   62:pop             
		return ((Cursor) (charsequence));
	//   30   63:aload_1         
	//   31   64:areturn         
	//*  32   65:goto            79
		charsequence;
	//   33   68:astore_1        
		Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", ((Throwable) (charsequence)));
	//   34   69:ldc1            #19  <String "SuggestionsAdapter">
	//   35   71:ldc2            #696 <String "Search suggestions query threw an exception.">
	//   36   74:aload_1         
	//   37   75:invokestatic    #637 <Method int Log.w(String, String, Throwable)>
	//   38   78:pop             
		return null;
	//   39   79:aconst_null     
	//   40   80:areturn         
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
