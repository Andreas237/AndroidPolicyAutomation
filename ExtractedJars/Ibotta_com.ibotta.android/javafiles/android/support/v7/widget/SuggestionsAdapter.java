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
	//    3    3:invokevirtual   #41  <Method int SearchView.getSuggestionRowLayout()>
	//    4    6:aconst_null     
	//    5    7:iconst_1        
	//    6    8:invokespecial   #44  <Method void ResourceCursorAdapter(Context, int, Cursor, boolean)>
		mClosed = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #46  <Field boolean mClosed>
		mQueryRefinement = 1;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #48  <Field int mQueryRefinement>
		mText1Col = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #50  <Field int mText1Col>
		mText2Col = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #52  <Field int mText2Col>
		mText2UrlCol = -1;
	//   19   31:aload_0         
	//   20   32:iconst_m1       
	//   21   33:putfield        #54  <Field int mText2UrlCol>
		mIconName1Col = -1;
	//   22   36:aload_0         
	//   23   37:iconst_m1       
	//   24   38:putfield        #56  <Field int mIconName1Col>
		mIconName2Col = -1;
	//   25   41:aload_0         
	//   26   42:iconst_m1       
	//   27   43:putfield        #58  <Field int mIconName2Col>
		mFlagsCol = -1;
	//   28   46:aload_0         
	//   29   47:iconst_m1       
	//   30   48:putfield        #60  <Field int mFlagsCol>
		mSearchManager = (SearchManager)mContext.getSystemService("search");
	//   31   51:aload_0         
	//   32   52:aload_0         
	//   33   53:getfield        #63  <Field Context mContext>
	//   34   56:ldc1            #65  <String "search">
	//   35   58:invokevirtual   #71  <Method Object Context.getSystemService(String)>
	//   36   61:checkcast       #73  <Class SearchManager>
	//   37   64:putfield        #75  <Field SearchManager mSearchManager>
		mSearchView = searchview;
	//   38   67:aload_0         
	//   39   68:aload_2         
	//   40   69:putfield        #77  <Field SearchView mSearchView>
		mSearchable = searchableinfo;
	//   41   72:aload_0         
	//   42   73:aload_3         
	//   43   74:putfield        #79  <Field SearchableInfo mSearchable>
		mCommitIconResId = searchview.getSuggestionCommitIconResId();
	//   44   77:aload_0         
	//   45   78:aload_2         
	//   46   79:invokevirtual   #82  <Method int SearchView.getSuggestionCommitIconResId()>
	//   47   82:putfield        #84  <Field int mCommitIconResId>
		mProviderContext = context;
	//   48   85:aload_0         
	//   49   86:aload_1         
	//   50   87:putfield        #86  <Field Context mProviderContext>
		mOutsideDrawablesCache = weakhashmap;
	//   51   90:aload_0         
	//   52   91:aload           4
	//   53   93:putfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//   54   96:return          
	}

	private Drawable checkIconCache(String s)
	{
		s = ((String) ((android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method Object WeakHashMap.get(Object)>
	//    4    8:checkcast       #101 <Class android.graphics.drawable.Drawable$ConstantState>
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
	//   11   19:invokevirtual   #105 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   12   22:areturn         
	}

	private CharSequence formatUrl(CharSequence charsequence)
	{
		if(mUrlColor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field ColorStateList mUrlColor>
	//*   2    4:ifnonnull       49
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #111 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #114 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.textColorSearchUrl, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field Context mContext>
	//    9   19:invokevirtual   #118 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #123 <Field int android.support.v7.appcompat.R$attr.textColorSearchUrl>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #129 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			mUrlColor = mContext.getResources().getColorStateList(typedvalue.resourceId);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #63  <Field Context mContext>
	//   18   36:invokevirtual   #133 <Method Resources Context.getResources()>
	//   19   39:aload_2         
	//   20   40:getfield        #136 <Field int TypedValue.resourceId>
	//   21   43:invokevirtual   #142 <Method ColorStateList Resources.getColorStateList(int)>
	//   22   46:putfield        #109 <Field ColorStateList mUrlColor>
		}
		SpannableString spannablestring = new SpannableString(charsequence);
	//   23   49:new             #144 <Class SpannableString>
	//   24   52:dup             
	//   25   53:aload_1         
	//   26   54:invokespecial   #147 <Method void SpannableString(CharSequence)>
	//   27   57:astore_2        
		spannablestring.setSpan(((Object) (new TextAppearanceSpan(((String) (null)), 0, 0, mUrlColor, ((ColorStateList) (null))))), 0, charsequence.length(), 33);
	//   28   58:aload_2         
	//   29   59:new             #149 <Class TextAppearanceSpan>
	//   30   62:dup             
	//   31   63:aconst_null     
	//   32   64:iconst_0        
	//   33   65:iconst_0        
	//   34   66:aload_0         
	//   35   67:getfield        #109 <Field ColorStateList mUrlColor>
	//   36   70:aconst_null     
	//   37   71:invokespecial   #152 <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//   38   74:iconst_0        
	//   39   75:aload_1         
	//   40   76:invokeinterface #157 <Method int CharSequence.length()>
	//   41   81:bipush          33
	//   42   83:invokevirtual   #161 <Method void SpannableString.setSpan(Object, int, int, int)>
		return ((CharSequence) (spannablestring));
	//   43   86:aload_2         
	//   44   87:areturn         
	}

	private Drawable getActivityIcon(ComponentName componentname)
	{
		Object obj = ((Object) (mContext.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Context mContext>
	//    2    4:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//    3    7:astore_3        
		int i;
		ActivityInfo activityinfo;
		try
		{
			activityinfo = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:sipush          128
	//    7   13:invokevirtual   #175 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//    8   16:astore          4
		}
	//*   9   18:aload           4
	//*  10   20:invokevirtual   #180 <Method int ActivityInfo.getIconResource()>
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:ifne            30
	//*  14   28:aconst_null     
	//*  15   29:areturn         
	//*  16   30:aload_3         
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #186 <Method String ComponentName.getPackageName()>
	//*  19   35:iload_2         
	//*  20   36:aload           4
	//*  21   38:getfield        #190 <Field android.content.pm.ApplicationInfo ActivityInfo.applicationInfo>
	//*  22   41:invokevirtual   #194 <Method Drawable PackageManager.getDrawable(String, int, android.content.pm.ApplicationInfo)>
	//*  23   44:astore_3        
	//*  24   45:aload_3         
	//*  25   46:ifnonnull       98
	//*  26   49:new             #196 <Class StringBuilder>
	//*  27   52:dup             
	//*  28   53:invokespecial   #197 <Method void StringBuilder()>
	//*  29   56:astore_3        
	//*  30   57:aload_3         
	//*  31   58:ldc1            #199 <String "Invalid icon resource ">
	//*  32   60:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  33   63:pop             
	//*  34   64:aload_3         
	//*  35   65:iload_2         
	//*  36   66:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//*  37   69:pop             
	//*  38   70:aload_3         
	//*  39   71:ldc1            #208 <String " for ">
	//*  40   73:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  41   76:pop             
	//*  42   77:aload_3         
	//*  43   78:aload_1         
	//*  44   79:invokevirtual   #211 <Method String ComponentName.flattenToShortString()>
	//*  45   82:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  46   85:pop             
	//*  47   86:ldc1            #213 <String "SuggestionsAdapter">
	//*  48   88:aload_3         
	//*  49   89:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  50   92:invokestatic    #222 <Method int Log.w(String, String)>
	//*  51   95:pop             
	//*  52   96:aconst_null     
	//*  53   97:areturn         
	//*  54   98:aload_3         
	//*  55   99:areturn         
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  56  100:astore_1        
		{
			Log.w("SuggestionsAdapter", ((android.content.pm.PackageManager.NameNotFoundException) (componentname)).toString());
	//   57  101:ldc1            #213 <String "SuggestionsAdapter">
	//   58  103:aload_1         
	//   59  104:invokevirtual   #223 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   60  107:invokestatic    #222 <Method int Log.w(String, String)>
	//   61  110:pop             
			return null;
	//   62  111:aconst_null     
	//   63  112:areturn         
		}
		i = activityinfo.getIconResource();
		if(i == 0)
			return null;
		obj = ((Object) (((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo)));
		if(obj == null)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Invalid icon resource ");
			((StringBuilder) (obj)).append(i);
			((StringBuilder) (obj)).append(" for ");
			((StringBuilder) (obj)).append(componentname.flattenToShortString());
			Log.w("SuggestionsAdapter", ((StringBuilder) (obj)).toString());
			return null;
		} else
		{
			return ((Drawable) (obj));
		}
	}

	private Drawable getActivityIconWithCache(ComponentName componentname)
	{
		String s = componentname.flattenToShortString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #211 <Method String ComponentName.flattenToShortString()>
	//    2    4:astore          4
		boolean flag = mOutsideDrawablesCache.containsKey(((Object) (s)));
	//    3    6:aload_0         
	//    4    7:getfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//    5   10:aload           4
	//    6   12:invokevirtual   #228 <Method boolean WeakHashMap.containsKey(Object)>
	//    7   15:istore_2        
		Object obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_3        
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            53
		{
			componentname = ((ComponentName) ((android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(((Object) (s)))));
	//   12   22:aload_0         
	//   13   23:getfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//   14   26:aload           4
	//   15   28:invokevirtual   #99  <Method Object WeakHashMap.get(Object)>
	//   16   31:checkcast       #101 <Class android.graphics.drawable.Drawable$ConstantState>
	//   17   34:astore_1        
			if(componentname == null)
	//*  18   35:aload_1         
	//*  19   36:ifnonnull       41
				return null;
	//   20   39:aconst_null     
	//   21   40:areturn         
			else
				return ((android.graphics.drawable.Drawable.ConstantState) (componentname)).newDrawable(mProviderContext.getResources());
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:getfield        #86  <Field Context mProviderContext>
	//   25   46:invokevirtual   #133 <Method Resources Context.getResources()>
	//   26   49:invokevirtual   #231 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   27   52:areturn         
		}
		Drawable drawable = getActivityIcon(componentname);
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:invokespecial   #233 <Method Drawable getActivityIcon(ComponentName)>
	//   31   58:astore          5
		if(drawable == null)
	//*  32   60:aload           5
	//*  33   62:ifnonnull       70
			componentname = ((ComponentName) (obj));
	//   34   65:aload_3         
	//   35   66:astore_1        
		else
	//*  36   67:goto            76
			componentname = ((ComponentName) (drawable.getConstantState()));
	//   37   70:aload           5
	//   38   72:invokevirtual   #239 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   39   75:astore_1        
		mOutsideDrawablesCache.put(((Object) (s)), ((Object) (componentname)));
	//   40   76:aload_0         
	//   41   77:getfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//   42   80:aload           4
	//   43   82:aload_1         
	//   44   83:invokevirtual   #243 <Method Object WeakHashMap.put(Object, Object)>
	//   45   86:pop             
		return drawable;
	//   46   87:aload           5
	//   47   89:areturn         
	}

	public static String getColumnString(Cursor cursor, String s)
	{
		return getStringOrNull(cursor, cursor.getColumnIndex(s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//    4    8:invokestatic    #255 <Method String getStringOrNull(Cursor, int)>
	//    5   11:areturn         
	}

	private Drawable getDefaultIcon1(Cursor cursor)
	{
		cursor = ((Cursor) (getActivityIconWithCache(mSearchable.getSearchActivity())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field SearchableInfo mSearchable>
	//    3    5:invokevirtual   #263 <Method ComponentName SearchableInfo.getSearchActivity()>
	//    4    8:invokespecial   #265 <Method Drawable getActivityIconWithCache(ComponentName)>
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
	//   11   19:getfield        #63  <Field Context mContext>
	//   12   22:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//   13   25:invokevirtual   #268 <Method Drawable PackageManager.getDefaultActivityIcon()>
	//   14   28:areturn         
	}

	private Drawable getDrawable(Uri uri)
	{
		boolean flag;
		Object obj;
		Object obj1;
		Object obj2;
		IOException ioexception;
		try
		{
			flag = "android.resource".equals(((Object) (uri.getScheme())));
	//    0    0:ldc2            #277 <String "android.resource">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #282 <Method String Uri.getScheme()>
	//    3    7:invokevirtual   #287 <Method boolean String.equals(Object)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ifeq            57
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #290 <Method Drawable getDrawableFromResourceUri(Uri)>
	//*  10   20:astore_3        
	//*  11   21:aload_3         
	//*  12   22:areturn         
	//*  13   23:new             #196 <Class StringBuilder>
	//*  14   26:dup             
	//*  15   27:invokespecial   #197 <Method void StringBuilder()>
	//*  16   30:astore_3        
	//*  17   31:aload_3         
	//*  18   32:ldc2            #292 <String "Resource does not exist: ">
	//*  19   35:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  20   38:pop             
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  24   44:pop             
	//*  25   45:new             #271 <Class FileNotFoundException>
	//*  26   48:dup             
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  29   53:invokespecial   #298 <Method void FileNotFoundException(String)>
	//*  30   56:athrow          
	//*  31   57:aload_0         
	//*  32   58:getfield        #86  <Field Context mProviderContext>
	//*  33   61:invokevirtual   #302 <Method ContentResolver Context.getContentResolver()>
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #308 <Method InputStream ContentResolver.openInputStream(Uri)>
	//*  36   68:astore          4
	//*  37   70:aload           4
	//*  38   72:ifnull          182
	//*  39   75:aload           4
	//*  40   77:aconst_null     
	//*  41   78:invokestatic    #312 <Method Drawable Drawable.createFromStream(InputStream, String)>
	//*  42   81:astore_3        
	//*  43   82:aload           4
	//*  44   84:invokevirtual   #317 <Method void InputStream.close()>
	//*  45   87:aload_3         
	//*  46   88:areturn         
	//*  47   89:astore          4
	//*  48   91:new             #196 <Class StringBuilder>
	//*  49   94:dup             
	//*  50   95:invokespecial   #197 <Method void StringBuilder()>
	//*  51   98:astore          5
	//*  52  100:aload           5
	//*  53  102:ldc2            #319 <String "Error closing icon stream for ">
	//*  54  105:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  55  108:pop             
	//*  56  109:aload           5
	//*  57  111:aload_1         
	//*  58  112:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  59  115:pop             
	//*  60  116:ldc1            #213 <String "SuggestionsAdapter">
	//*  61  118:aload           5
	//*  62  120:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  63  123:aload           4
	//*  64  125:invokestatic    #323 <Method int Log.e(String, String, Throwable)>
	//*  65  128:pop             
	//*  66  129:aload_3         
	//*  67  130:areturn         
	//*  68  131:astore_3        
	//*  69  132:aload           4
	//*  70  134:invokevirtual   #317 <Method void InputStream.close()>
	//*  71  137:goto            180
	//*  72  140:astore          4
	//*  73  142:new             #196 <Class StringBuilder>
	//*  74  145:dup             
	//*  75  146:invokespecial   #197 <Method void StringBuilder()>
	//*  76  149:astore          5
	//*  77  151:aload           5
	//*  78  153:ldc2            #319 <String "Error closing icon stream for ">
	//*  79  156:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  80  159:pop             
	//*  81  160:aload           5
	//*  82  162:aload_1         
	//*  83  163:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  84  166:pop             
	//*  85  167:ldc1            #213 <String "SuggestionsAdapter">
	//*  86  169:aload           5
	//*  87  171:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  88  174:aload           4
	//*  89  176:invokestatic    #323 <Method int Log.e(String, String, Throwable)>
	//*  90  179:pop             
	//*  91  180:aload_3         
	//*  92  181:athrow          
	//*  93  182:new             #196 <Class StringBuilder>
	//*  94  185:dup             
	//*  95  186:invokespecial   #197 <Method void StringBuilder()>
	//*  96  189:astore_3        
	//*  97  190:aload_3         
	//*  98  191:ldc2            #325 <String "Failed to open ">
	//*  99  194:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 100  197:pop             
	//* 101  198:aload_3         
	//* 102  199:aload_1         
	//* 103  200:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//* 104  203:pop             
	//* 105  204:new             #271 <Class FileNotFoundException>
	//* 106  207:dup             
	//* 107  208:aload_3         
	//* 108  209:invokevirtual   #216 <Method String StringBuilder.toString()>
	//* 109  212:invokespecial   #298 <Method void FileNotFoundException(String)>
	//* 110  215:athrow          
		// Misplaced declaration of an exception variable
		catch(StringBuilder stringbuilder)
	//* 111  216:astore_3        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  112  217:new             #196 <Class StringBuilder>
	//  113  220:dup             
	//  114  221:invokespecial   #197 <Method void StringBuilder()>
	//  115  224:astore          4
			stringbuilder1.append("Icon not found: ");
	//  116  226:aload           4
	//  117  228:ldc2            #327 <String "Icon not found: ">
	//  118  231:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  119  234:pop             
			stringbuilder1.append(((Object) (uri)));
	//  120  235:aload           4
	//  121  237:aload_1         
	//  122  238:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//  123  241:pop             
			stringbuilder1.append(", ");
	//  124  242:aload           4
	//  125  244:ldc2            #329 <String ", ">
	//  126  247:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  127  250:pop             
			stringbuilder1.append(((FileNotFoundException) (stringbuilder)).getMessage());
	//  128  251:aload           4
	//  129  253:aload_3         
	//  130  254:invokevirtual   #332 <Method String FileNotFoundException.getMessage()>
	//  131  257:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  132  260:pop             
			Log.w("SuggestionsAdapter", stringbuilder1.toString());
	//  133  261:ldc1            #213 <String "SuggestionsAdapter">
	//  134  263:aload           4
	//  135  265:invokevirtual   #216 <Method String StringBuilder.toString()>
	//  136  268:invokestatic    #222 <Method int Log.w(String, String)>
	//  137  271:pop             
			return null;
	//  138  272:aconst_null     
	//  139  273:areturn         
		}
		if(!flag) goto _L2; else goto _L1
_L1:
		obj = ((Object) (getDrawableFromResourceUri(uri)));
		return ((Drawable) (obj));
_L4:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Resource does not exist: ");
		((StringBuilder) (obj)).append(((Object) (uri)));
		throw new FileNotFoundException(((StringBuilder) (obj)).toString());
_L2:
		obj2 = ((Object) (mProviderContext.getContentResolver().openInputStream(uri)));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_182;
		obj = ((Object) (Drawable.createFromStream(((InputStream) (obj2)), ((String) (null)))));
		((InputStream) (obj2)).close();
		return ((Drawable) (obj));
		obj2;
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("Error closing icon stream for ");
		stringbuilder2.append(((Object) (uri)));
		Log.e("SuggestionsAdapter", stringbuilder2.toString(), ((Throwable) (obj2)));
		return ((Drawable) (obj));
		obj1;
		((InputStream) (obj2)).close();
		break MISSING_BLOCK_LABEL_180;
		ioexception;
		StringBuilder stringbuilder3 = new StringBuilder();
		stringbuilder3.append("Error closing icon stream for ");
		stringbuilder3.append(((Object) (uri)));
		Log.e("SuggestionsAdapter", stringbuilder3.toString(), ((Throwable) (ioexception)));
		throw obj1;
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Failed to open ");
		stringbuilder.append(((Object) (uri)));
		throw new FileNotFoundException(stringbuilder.toString());
		stringbuilder;
	//  140  274:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//* 141  275:goto            23
	}

	private Drawable getDrawableFromResourceValue(String s)
	{
		if(s == null || s.isEmpty())
			break MISSING_BLOCK_LABEL_173;
	//    0    0:aload_1         
	//    1    1:ifnull          173
	//    2    4:aload_1         
	//    3    5:invokevirtual   #339 <Method boolean String.isEmpty()>
	//    4    8:ifne            173
		if("0".equals(((Object) (s))))
	//*   5   11:ldc2            #341 <String "0">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #287 <Method boolean String.equals(Object)>
	//*   8   18:ifeq            23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		int i;
		Object obj;
		Drawable drawable;
		try
		{
			i = Integer.parseInt(s);
	//   11   23:aload_1         
	//   12   24:invokestatic    #346 <Method int Integer.parseInt(String)>
	//   13   27:istore_2        
			obj = ((Object) (new StringBuilder()));
	//   14   28:new             #196 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #197 <Method void StringBuilder()>
	//   17   35:astore_3        
			((StringBuilder) (obj)).append("android.resource://");
	//   18   36:aload_3         
	//   19   37:ldc2            #348 <String "android.resource://">
	//   20   40:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			((StringBuilder) (obj)).append(mProviderContext.getPackageName());
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #86  <Field Context mProviderContext>
	//   25   49:invokevirtual   #349 <Method String Context.getPackageName()>
	//   26   52:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			((StringBuilder) (obj)).append("/");
	//   28   56:aload_3         
	//   29   57:ldc2            #351 <String "/">
	//   30   60:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			((StringBuilder) (obj)).append(i);
	//   32   64:aload_3         
	//   33   65:iload_2         
	//   34   66:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   35   69:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   36   70:aload_3         
	//   37   71:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   38   74:astore_3        
			drawable = checkIconCache(((String) (obj)));
	//   39   75:aload_0         
	//   40   76:aload_3         
	//   41   77:invokespecial   #353 <Method Drawable checkIconCache(String)>
	//   42   80:astore          4
		}
	//*  43   82:aload           4
	//*  44   84:ifnull          90
	//*  45   87:aload           4
	//*  46   89:areturn         
	//*  47   90:aload_0         
	//*  48   91:getfield        #86  <Field Context mProviderContext>
	//*  49   94:iload_2         
	//*  50   95:invokestatic    #358 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  51   98:astore          4
	//*  52  100:aload_0         
	//*  53  101:aload_3         
	//*  54  102:aload           4
	//*  55  104:invokespecial   #362 <Method void storeInIconCache(String, Drawable)>
	//*  56  107:aload           4
	//*  57  109:areturn         
	//*  58  110:new             #196 <Class StringBuilder>
	//*  59  113:dup             
	//*  60  114:invokespecial   #197 <Method void StringBuilder()>
	//*  61  117:astore_3        
	//*  62  118:aload_3         
	//*  63  119:ldc2            #364 <String "Icon resource not found: ">
	//*  64  122:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  65  125:pop             
	//*  66  126:aload_3         
	//*  67  127:aload_1         
	//*  68  128:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  69  131:pop             
	//*  70  132:ldc1            #213 <String "SuggestionsAdapter">
	//*  71  134:aload_3         
	//*  72  135:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  73  138:invokestatic    #222 <Method int Log.w(String, String)>
	//*  74  141:pop             
	//*  75  142:aconst_null     
	//*  76  143:areturn         
	//*  77  144:aload_0         
	//*  78  145:aload_1         
	//*  79  146:invokespecial   #353 <Method Drawable checkIconCache(String)>
	//*  80  149:astore_3        
	//*  81  150:aload_3         
	//*  82  151:ifnull          156
	//*  83  154:aload_3         
	//*  84  155:areturn         
	//*  85  156:aload_0         
	//*  86  157:aload_1         
	//*  87  158:invokestatic    #368 <Method Uri Uri.parse(String)>
	//*  88  161:invokespecial   #370 <Method Drawable getDrawable(Uri)>
	//*  89  164:astore_3        
	//*  90  165:aload_0         
	//*  91  166:aload_1         
	//*  92  167:aload_3         
	//*  93  168:invokespecial   #362 <Method void storeInIconCache(String, Drawable)>
	//*  94  171:aload_3         
	//*  95  172:areturn         
	//*  96  173:aconst_null     
	//*  97  174:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (checkIconCache(s)));
			if(obj != null)
			{
				return ((Drawable) (obj));
			} else
			{
				obj = ((Object) (getDrawable(Uri.parse(s))));
				storeInIconCache(s, ((Drawable) (obj)));
				return ((Drawable) (obj));
			}
		}
	//*  98  175:astore_3        
	//*  99  176:goto            144
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Icon resource not found: ");
			((StringBuilder) (obj)).append(s);
			Log.w("SuggestionsAdapter", ((StringBuilder) (obj)).toString());
			return null;
		}
		if(drawable != null)
			return drawable;
		drawable = ContextCompat.getDrawable(mProviderContext, i);
		storeInIconCache(((String) (obj)), drawable);
		return drawable;
		Object obj1;
		return null;
	//* 100  179:astore_3        
	//* 101  180:goto            110
	}

	private Drawable getIcon1(Cursor cursor)
	{
		int i = mIconName1Col;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int mIconName1Col>
	//    2    4:istore_2        
		if(i == -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		Drawable drawable = getDrawableFromResourceValue(cursor.getString(i));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokeinterface #375 <Method String Cursor.getString(int)>
	//   12   20:invokespecial   #377 <Method Drawable getDrawableFromResourceValue(String)>
	//   13   23:astore_3        
		if(drawable != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          30
			return drawable;
	//   16   28:aload_3         
	//   17   29:areturn         
		else
			return getDefaultIcon1(cursor);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokespecial   #379 <Method Drawable getDefaultIcon1(Cursor)>
	//   21   35:areturn         
	}

	private Drawable getIcon2(Cursor cursor)
	{
		int i = mIconName2Col;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mIconName2Col>
	//    2    4:istore_2        
		if(i == -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return getDrawableFromResourceValue(cursor.getString(i));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokeinterface #375 <Method String Cursor.getString(int)>
	//   12   20:invokespecial   #377 <Method Drawable getDrawableFromResourceValue(String)>
	//   13   23:areturn         
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
	//    7    9:invokeinterface #375 <Method String Cursor.getString(int)>
	//    8   14:astore_0        
		}
	//*   9   15:aload_0         
	//*  10   16:areturn         
		// Misplaced declaration of an exception variable
		catch(Cursor cursor)
	//*  11   17:astore_0        
		{
			Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", ((Throwable) (cursor)));
	//   12   18:ldc1            #213 <String "SuggestionsAdapter">
	//   13   20:ldc2            #384 <String "unexpected error retrieving valid column from cursor, did the remote process die?">
	//   14   23:aload_0         
	//   15   24:invokestatic    #323 <Method int Log.e(String, String, Throwable)>
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
	//    2    2:invokevirtual   #392 <Method void ImageView.setImageDrawable(Drawable)>
		if(drawable == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			imageview.setVisibility(i);
	//    5    9:aload_1         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #396 <Method void ImageView.setVisibility(int)>
			return;
	//    8   14:return          
		} else
		{
			imageview.setVisibility(0);
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #396 <Method void ImageView.setVisibility(int)>
			drawable.setVisible(false, false);
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #400 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   16   26:pop             
			drawable.setVisible(true, false);
	//   17   27:aload_2         
	//   18   28:iconst_1        
	//   19   29:iconst_0        
	//   20   30:invokevirtual   #400 <Method boolean Drawable.setVisible(boolean, boolean)>
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
	//    2    2:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
		if(TextUtils.isEmpty(charsequence))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #412 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            19
		{
			textview.setVisibility(8);
	//    6   12:aload_1         
	//    7   13:bipush          8
	//    8   15:invokevirtual   #413 <Method void TextView.setVisibility(int)>
			return;
	//    9   18:return          
		} else
		{
			textview.setVisibility(0);
	//   10   19:aload_1         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #413 <Method void TextView.setVisibility(int)>
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
	//    3    5:getfield        #88  <Field WeakHashMap mOutsideDrawablesCache>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #239 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    7   13:invokevirtual   #243 <Method Object WeakHashMap.put(Object, Object)>
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
	//    3    5:invokeinterface #419 <Method Bundle Cursor.getExtras()>
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
	//*  11   21:ldc2            #421 <String "in_progress">
	//*  12   24:invokevirtual   #427 <Method boolean Bundle.getBoolean(String)>
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
	//    1    1:invokevirtual   #435 <Method Object View.getTag()>
	//    2    4:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//    3    7:astore_2        
		int i = mFlagsCol;
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field int mFlagsCol>
	//    6   12:istore          4
		if(i != -1)
	//*   7   14:iload           4
	//*   8   16:iconst_m1       
	//*   9   17:icmpeq          33
			i = cursor.getInt(i);
	//   10   20:aload_3         
	//   11   21:iload           4
	//   12   23:invokeinterface #439 <Method int Cursor.getInt(int)>
	//   13   28:istore          4
		else
	//*  14   30:goto            36
			i = 0;
	//   15   33:iconst_0        
	//   16   34:istore          4
		if(((ChildViewCache) (context)).mText1 != null)
	//*  17   36:aload_2         
	//*  18   37:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  19   40:ifnull          61
		{
			view = ((View) (getStringOrNull(cursor, mText1Col)));
	//   20   43:aload_3         
	//   21   44:aload_0         
	//   22   45:getfield        #50  <Field int mText1Col>
	//   23   48:invokestatic    #255 <Method String getStringOrNull(Cursor, int)>
	//   24   51:astore_1        
			setViewText(((ChildViewCache) (context)).mText1, ((CharSequence) (view)));
	//   25   52:aload_0         
	//   26   53:aload_2         
	//   27   54:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   57:aload_1         
	//   29   58:invokespecial   #445 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mText2 != null)
	//*  30   61:aload_2         
	//*  31   62:getfield        #448 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//*  32   65:ifnull          164
		{
			view = ((View) (getStringOrNull(cursor, mText2UrlCol)));
	//   33   68:aload_3         
	//   34   69:aload_0         
	//   35   70:getfield        #54  <Field int mText2UrlCol>
	//   36   73:invokestatic    #255 <Method String getStringOrNull(Cursor, int)>
	//   37   76:astore_1        
			if(view != null)
	//*  38   77:aload_1         
	//*  39   78:ifnull          90
				view = ((View) (formatUrl(((CharSequence) (view)))));
	//   40   81:aload_0         
	//   41   82:aload_1         
	//   42   83:invokespecial   #450 <Method CharSequence formatUrl(CharSequence)>
	//   43   86:astore_1        
			else
	//*  44   87:goto            99
				view = ((View) (getStringOrNull(cursor, mText2Col)));
	//   45   90:aload_3         
	//   46   91:aload_0         
	//   47   92:getfield        #52  <Field int mText2Col>
	//   48   95:invokestatic    #255 <Method String getStringOrNull(Cursor, int)>
	//   49   98:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (view))))
	//*  50   99:aload_1         
	//*  51  100:invokestatic    #412 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  103:ifeq            132
			{
				if(((ChildViewCache) (context)).mText1 != null)
	//*  53  106:aload_2         
	//*  54  107:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  55  110:ifnull          155
				{
					((ChildViewCache) (context)).mText1.setSingleLine(false);
	//   56  113:aload_2         
	//   57  114:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   58  117:iconst_0        
	//   59  118:invokevirtual   #454 <Method void TextView.setSingleLine(boolean)>
					((ChildViewCache) (context)).mText1.setMaxLines(2);
	//   60  121:aload_2         
	//   61  122:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   62  125:iconst_2        
	//   63  126:invokevirtual   #457 <Method void TextView.setMaxLines(int)>
				}
			} else
	//*  64  129:goto            155
			if(((ChildViewCache) (context)).mText1 != null)
	//*  65  132:aload_2         
	//*  66  133:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  67  136:ifnull          155
			{
				((ChildViewCache) (context)).mText1.setSingleLine(true);
	//   68  139:aload_2         
	//   69  140:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   70  143:iconst_1        
	//   71  144:invokevirtual   #454 <Method void TextView.setSingleLine(boolean)>
				((ChildViewCache) (context)).mText1.setMaxLines(1);
	//   72  147:aload_2         
	//   73  148:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   74  151:iconst_1        
	//   75  152:invokevirtual   #457 <Method void TextView.setMaxLines(int)>
			}
			setViewText(((ChildViewCache) (context)).mText2, ((CharSequence) (view)));
	//   76  155:aload_0         
	//   77  156:aload_2         
	//   78  157:getfield        #448 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//   79  160:aload_1         
	//   80  161:invokespecial   #445 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mIcon1 != null)
	//*  81  164:aload_2         
	//*  82  165:getfield        #461 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//*  83  168:ifnull          185
			setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
	//   84  171:aload_0         
	//   85  172:aload_2         
	//   86  173:getfield        #461 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//   87  176:aload_0         
	//   88  177:aload_3         
	//   89  178:invokespecial   #463 <Method Drawable getIcon1(Cursor)>
	//   90  181:iconst_4        
	//   91  182:invokespecial   #465 <Method void setViewDrawable(ImageView, Drawable, int)>
		if(((ChildViewCache) (context)).mIcon2 != null)
	//*  92  185:aload_2         
	//*  93  186:getfield        #468 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//*  94  189:ifnull          207
			setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
	//   95  192:aload_0         
	//   96  193:aload_2         
	//   97  194:getfield        #468 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//   98  197:aload_0         
	//   99  198:aload_3         
	//  100  199:invokespecial   #470 <Method Drawable getIcon2(Cursor)>
	//  101  202:bipush          8
	//  102  204:invokespecial   #465 <Method void setViewDrawable(ImageView, Drawable, int)>
		int j = mQueryRefinement;
	//  103  207:aload_0         
	//  104  208:getfield        #48  <Field int mQueryRefinement>
	//  105  211:istore          5
		if(j != 2 && (j != 1 || (i & 1) == 0))
	//* 106  213:iload           5
	//* 107  215:iconst_2        
	//* 108  216:icmpeq          245
	//* 109  219:iload           5
	//* 110  221:iconst_1        
	//* 111  222:icmpne          235
	//* 112  225:iload           4
	//* 113  227:iconst_1        
	//* 114  228:iand            
	//* 115  229:ifeq            235
	//* 116  232:goto            245
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(8);
	//  117  235:aload_2         
	//  118  236:getfield        #473 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  119  239:bipush          8
	//  120  241:invokevirtual   #396 <Method void ImageView.setVisibility(int)>
			return;
	//  121  244:return          
		} else
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(0);
	//  122  245:aload_2         
	//  123  246:getfield        #473 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  124  249:iconst_0        
	//  125  250:invokevirtual   #396 <Method void ImageView.setVisibility(int)>
			((ChildViewCache) (context)).mIconRefine.setTag(((Object) (((ChildViewCache) (context)).mText1.getText())));
	//  126  253:aload_2         
	//  127  254:getfield        #473 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  128  257:aload_2         
	//  129  258:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//  130  261:invokevirtual   #477 <Method CharSequence TextView.getText()>
	//  131  264:invokevirtual   #481 <Method void ImageView.setTag(Object)>
			((ChildViewCache) (context)).mIconRefine.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//  132  267:aload_2         
	//  133  268:getfield        #473 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  134  271:aload_0         
	//  135  272:invokevirtual   #485 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//  136  275:return          
		}
	}

	public void changeCursor(Cursor cursor)
	{
		if(mClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean mClosed>
	//*   2    4:ifeq            27
		{
			Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
	//    3    7:ldc1            #213 <String "SuggestionsAdapter">
	//    4    9:ldc2            #488 <String "Tried to change cursor after adapter was closed.">
	//    5   12:invokestatic    #222 <Method int Log.w(String, String)>
	//    6   15:pop             
			if(cursor != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          26
				cursor.close();
	//    9   20:aload_1         
	//   10   21:invokeinterface #489 <Method void Cursor.close()>
			return;
	//   11   26:return          
		}
		super.changeCursor(cursor);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #491 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
		if(cursor != null)
	//*  15   32:aload_1         
	//*  16   33:ifnull          126
			try
			{
				mText1Col = cursor.getColumnIndex("suggest_text_1");
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:ldc2            #493 <String "suggest_text_1">
	//   20   41:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   21   46:putfield        #50  <Field int mText1Col>
				mText2Col = cursor.getColumnIndex("suggest_text_2");
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:ldc2            #495 <String "suggest_text_2">
	//   25   54:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   26   59:putfield        #52  <Field int mText2Col>
				mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
	//   27   62:aload_0         
	//   28   63:aload_1         
	//   29   64:ldc2            #497 <String "suggest_text_2_url">
	//   30   67:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   31   72:putfield        #54  <Field int mText2UrlCol>
				mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
	//   32   75:aload_0         
	//   33   76:aload_1         
	//   34   77:ldc2            #499 <String "suggest_icon_1">
	//   35   80:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   36   85:putfield        #56  <Field int mIconName1Col>
				mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
	//   37   88:aload_0         
	//   38   89:aload_1         
	//   39   90:ldc2            #501 <String "suggest_icon_2">
	//   40   93:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   41   98:putfield        #58  <Field int mIconName2Col>
				mFlagsCol = cursor.getColumnIndex("suggest_flags");
	//   42  101:aload_0         
	//   43  102:aload_1         
	//   44  103:ldc2            #503 <String "suggest_flags">
	//   45  106:invokeinterface #251 <Method int Cursor.getColumnIndex(String)>
	//   46  111:putfield        #60  <Field int mFlagsCol>
				return;
	//   47  114:return          
			}
			// Misplaced declaration of an exception variable
			catch(Cursor cursor)
	//*  48  115:astore_1        
			{
				Log.e("SuggestionsAdapter", "error changing cursor and caching columns", ((Throwable) (cursor)));
	//   49  116:ldc1            #213 <String "SuggestionsAdapter">
	//   50  118:ldc2            #505 <String "error changing cursor and caching columns">
	//   51  121:aload_1         
	//   52  122:invokestatic    #323 <Method int Log.e(String, String, Throwable)>
	//   53  125:pop             
			}
		return;
	//   54  126:return          
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
	//    5    7:ldc2            #509 <String "suggest_intent_query">
	//    6   10:invokestatic    #511 <Method String getColumnString(Cursor, String)>
	//    7   13:astore_2        
		if(s != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          20
			return ((CharSequence) (s));
	//   10   18:aload_2         
	//   11   19:areturn         
		if(mSearchable.shouldRewriteQueryFromData())
	//*  12   20:aload_0         
	//*  13   21:getfield        #79  <Field SearchableInfo mSearchable>
	//*  14   24:invokevirtual   #514 <Method boolean SearchableInfo.shouldRewriteQueryFromData()>
	//*  15   27:ifeq            44
		{
			String s1 = getColumnString(cursor, "suggest_intent_data");
	//   16   30:aload_1         
	//   17   31:ldc2            #516 <String "suggest_intent_data">
	//   18   34:invokestatic    #511 <Method String getColumnString(Cursor, String)>
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
	//*  25   45:getfield        #79  <Field SearchableInfo mSearchable>
	//*  26   48:invokevirtual   #519 <Method boolean SearchableInfo.shouldRewriteQueryFromText()>
	//*  27   51:ifeq            68
		{
			cursor = ((Cursor) (getColumnString(cursor, "suggest_text_1")));
	//   28   54:aload_1         
	//   29   55:ldc2            #493 <String "suggest_text_1">
	//   30   58:invokestatic    #511 <Method String getColumnString(Cursor, String)>
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
		Object obj1;
label0:
		{
label1:
			{
label2:
				{
					Object obj = ((Object) (uri.getAuthority()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #522 <Method String Uri.getAuthority()>
	//    2    4:astore_3        
					if(TextUtils.isEmpty(((CharSequence) (obj))))
						break label0;
	//    3    5:aload_3         
	//    4    6:invokestatic    #412 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5    9:ifne            282
					int i;
					Resources resources;
					List list;
					try
					{
						resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field Context mContext>
	//    8   16:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #526 <Method Resources PackageManager.getResourcesForApplication(String)>
	//   11   23:astore          4
					}
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #530 <Method List Uri.getPathSegments()>
	//*  14   29:astore          5
	//*  15   31:aload           5
	//*  16   33:ifnull          214
	//*  17   36:aload           5
	//*  18   38:invokeinterface #535 <Method int List.size()>
	//*  19   43:istore_2        
	//*  20   44:iload_2         
	//*  21   45:iconst_1        
	//*  22   46:icmpne          101
	//*  23   49:aload           5
	//*  24   51:iconst_0        
	//*  25   52:invokeinterface #538 <Method Object List.get(int)>
	//*  26   57:checkcast       #284 <Class String>
	//*  27   60:invokestatic    #346 <Method int Integer.parseInt(String)>
	//*  28   63:istore_2        
	//*  29   64:goto            135
	//*  30   67:new             #196 <Class StringBuilder>
	//*  31   70:dup             
	//*  32   71:invokespecial   #197 <Method void StringBuilder()>
	//*  33   74:astore_3        
	//*  34   75:aload_3         
	//*  35   76:ldc2            #540 <String "Single path segment is not a resource ID: ">
	//*  36   79:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  37   82:pop             
	//*  38   83:aload_3         
	//*  39   84:aload_1         
	//*  40   85:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  41   88:pop             
	//*  42   89:new             #271 <Class FileNotFoundException>
	//*  43   92:dup             
	//*  44   93:aload_3         
	//*  45   94:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  46   97:invokespecial   #298 <Method void FileNotFoundException(String)>
	//*  47  100:athrow          
	//*  48  101:iload_2         
	//*  49  102:iconst_2        
	//*  50  103:icmpne          180
	//*  51  106:aload           4
	//*  52  108:aload           5
	//*  53  110:iconst_1        
	//*  54  111:invokeinterface #538 <Method Object List.get(int)>
	//*  55  116:checkcast       #284 <Class String>
	//*  56  119:aload           5
	//*  57  121:iconst_0        
	//*  58  122:invokeinterface #538 <Method Object List.get(int)>
	//*  59  127:checkcast       #284 <Class String>
	//*  60  130:aload_3         
	//*  61  131:invokevirtual   #544 <Method int Resources.getIdentifier(String, String, String)>
	//*  62  134:istore_2        
	//*  63  135:iload_2         
	//*  64  136:ifeq            146
	//*  65  139:aload           4
	//*  66  141:iload_2         
	//*  67  142:invokevirtual   #547 <Method Drawable Resources.getDrawable(int)>
	//*  68  145:areturn         
	//*  69  146:new             #196 <Class StringBuilder>
	//*  70  149:dup             
	//*  71  150:invokespecial   #197 <Method void StringBuilder()>
	//*  72  153:astore_3        
	//*  73  154:aload_3         
	//*  74  155:ldc2            #549 <String "No resource found for: ">
	//*  75  158:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  76  161:pop             
	//*  77  162:aload_3         
	//*  78  163:aload_1         
	//*  79  164:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  80  167:pop             
	//*  81  168:new             #271 <Class FileNotFoundException>
	//*  82  171:dup             
	//*  83  172:aload_3         
	//*  84  173:invokevirtual   #216 <Method String StringBuilder.toString()>
	//*  85  176:invokespecial   #298 <Method void FileNotFoundException(String)>
	//*  86  179:athrow          
	//*  87  180:new             #196 <Class StringBuilder>
	//*  88  183:dup             
	//*  89  184:invokespecial   #197 <Method void StringBuilder()>
	//*  90  187:astore_3        
	//*  91  188:aload_3         
	//*  92  189:ldc2            #551 <String "More than two path segments: ">
	//*  93  192:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  94  195:pop             
	//*  95  196:aload_3         
	//*  96  197:aload_1         
	//*  97  198:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  98  201:pop             
	//*  99  202:new             #271 <Class FileNotFoundException>
	//* 100  205:dup             
	//* 101  206:aload_3         
	//* 102  207:invokevirtual   #216 <Method String StringBuilder.toString()>
	//* 103  210:invokespecial   #298 <Method void FileNotFoundException(String)>
	//* 104  213:athrow          
	//* 105  214:new             #196 <Class StringBuilder>
	//* 106  217:dup             
	//* 107  218:invokespecial   #197 <Method void StringBuilder()>
	//* 108  221:astore_3        
	//* 109  222:aload_3         
	//* 110  223:ldc2            #553 <String "No path: ">
	//* 111  226:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 112  229:pop             
	//* 113  230:aload_3         
	//* 114  231:aload_1         
	//* 115  232:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//* 116  235:pop             
	//* 117  236:new             #271 <Class FileNotFoundException>
	//* 118  239:dup             
	//* 119  240:aload_3         
	//* 120  241:invokevirtual   #216 <Method String StringBuilder.toString()>
	//* 121  244:invokespecial   #298 <Method void FileNotFoundException(String)>
	//* 122  247:athrow          
	//* 123  248:new             #196 <Class StringBuilder>
	//* 124  251:dup             
	//* 125  252:invokespecial   #197 <Method void StringBuilder()>
	//* 126  255:astore_3        
	//* 127  256:aload_3         
	//* 128  257:ldc2            #555 <String "No package found for authority: ">
	//* 129  260:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 130  263:pop             
	//* 131  264:aload_3         
	//* 132  265:aload_1         
	//* 133  266:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//* 134  269:pop             
	//* 135  270:new             #271 <Class FileNotFoundException>
	//* 136  273:dup             
	//* 137  274:aload_3         
	//* 138  275:invokevirtual   #216 <Method String StringBuilder.toString()>
	//* 139  278:invokespecial   #298 <Method void FileNotFoundException(String)>
	//* 140  281:athrow          
	//* 141  282:new             #196 <Class StringBuilder>
	//* 142  285:dup             
	//* 143  286:invokespecial   #197 <Method void StringBuilder()>
	//* 144  289:astore_3        
	//* 145  290:aload_3         
	//* 146  291:ldc2            #557 <String "No authority: ">
	//* 147  294:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 148  297:pop             
	//* 149  298:aload_3         
	//* 150  299:aload_1         
	//* 151  300:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//* 152  303:pop             
	//* 153  304:new             #271 <Class FileNotFoundException>
	//* 154  307:dup             
	//* 155  308:aload_3         
	//* 156  309:invokevirtual   #216 <Method String StringBuilder.toString()>
	//* 157  312:invokespecial   #298 <Method void FileNotFoundException(String)>
	//* 158  315:athrow          
					// Misplaced declaration of an exception variable
					catch(Object obj1)
					{
						obj = ((Object) (new StringBuilder()));
						((StringBuilder) (obj)).append("No package found for authority: ");
						((StringBuilder) (obj)).append(((Object) (uri)));
						throw new FileNotFoundException(((StringBuilder) (obj)).toString());
					}
					list = uri.getPathSegments();
					if(list == null)
						break label1;
					i = list.size();
					if(i == 1)
					{
						try
						{
							i = Integer.parseInt((String)list.get(0));
						}
	//* 159  316:astore_3        
	//* 160  317:goto            248
						// Misplaced declaration of an exception variable
						catch(Object obj1)
						{
							obj = ((Object) (new StringBuilder()));
							((StringBuilder) (obj)).append("Single path segment is not a resource ID: ");
							((StringBuilder) (obj)).append(((Object) (uri)));
							throw new FileNotFoundException(((StringBuilder) (obj)).toString());
						}
					} else
					{
						if(i != 2)
							break label2;
						i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
					}
					if(i != 0)
					{
						return resources.getDrawable(i);
					} else
					{
						obj = ((Object) (new StringBuilder()));
						((StringBuilder) (obj)).append("No resource found for: ");
						((StringBuilder) (obj)).append(((Object) (uri)));
						throw new FileNotFoundException(((StringBuilder) (obj)).toString());
					}
				}
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("More than two path segments: ");
				((StringBuilder) (obj)).append(((Object) (uri)));
				throw new FileNotFoundException(((StringBuilder) (obj)).toString());
			}
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("No path: ");
			((StringBuilder) (obj)).append(((Object) (uri)));
			throw new FileNotFoundException(((StringBuilder) (obj)).toString());
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("No authority: ");
		stringbuilder.append(((Object) (uri)));
		throw new FileNotFoundException(stringbuilder.toString());
	//* 161  320:astore_3        
	//* 162  321:goto            67
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
	//    4    4:invokespecial   #564 <Method View ResourceCursorAdapter.getDropDownView(int, View, ViewGroup)>
	//    5    7:astore_2        
		}
	//*   6    8:aload_2         
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   10:astore_2        
		{
			Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", ((Throwable) (view)));
	//    9   11:ldc1            #213 <String "SuggestionsAdapter">
	//   10   13:ldc2            #566 <String "Search suggestions cursor threw exception.">
	//   11   16:aload_2         
	//   12   17:invokestatic    #568 <Method int Log.w(String, String, Throwable)>
	//   13   20:pop             
			viewgroup = ((ViewGroup) (newDropDownView(mContext, mCursor, viewgroup)));
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #63  <Field Context mContext>
	//   17   26:aload_0         
	//   18   27:getfield        #572 <Field Cursor mCursor>
	//   19   30:aload_3         
	//   20   31:invokevirtual   #576 <Method View newDropDownView(Context, Cursor, ViewGroup)>
	//   21   34:astore_3        
			if(viewgroup != null)
	//*  22   35:aload_3         
	//*  23   36:ifnull          56
				((ChildViewCache)((View) (viewgroup)).getTag()).mText1.setText(((CharSequence) (((RuntimeException) (view)).toString())));
	//   24   39:aload_3         
	//   25   40:invokevirtual   #435 <Method Object View.getTag()>
	//   26   43:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//   27   46:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #577 <Method String RuntimeException.toString()>
	//   30   53:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
			return ((View) (viewgroup));
	//   31   56:aload_3         
	//   32   57:areturn         
		}
		return view;
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
	//    5    7:invokevirtual   #582 <Method String SearchableInfo.getSuggestAuthority()>
	//    6   10:astore          4
		if(obj == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		obj = ((Object) ((new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("")));
	//   11   19:new             #584 <Class android.net.Uri$Builder>
	//   12   22:dup             
	//   13   23:invokespecial   #585 <Method void android.net.Uri$Builder()>
	//   14   26:ldc2            #587 <String "content">
	//   15   29:invokevirtual   #591 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   16   32:aload           4
	//   17   34:invokevirtual   #594 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   18   37:ldc2            #596 <String "">
	//   19   40:invokevirtual   #599 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//   20   43:ldc2            #596 <String "">
	//   21   46:invokevirtual   #602 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   22   49:astore          4
		String s1 = searchableinfo.getSuggestPath();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #605 <Method String SearchableInfo.getSuggestPath()>
	//   25   55:astore          5
		if(s1 != null)
	//*  26   57:aload           5
	//*  27   59:ifnull          70
			((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokevirtual   #608 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   31   69:pop             
		((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
	//   32   70:aload           4
	//   33   72:ldc2            #610 <String "search_suggest_query">
	//   34   75:invokevirtual   #613 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   35   78:pop             
		s1 = searchableinfo.getSuggestSelection();
	//   36   79:aload_1         
	//   37   80:invokevirtual   #616 <Method String SearchableInfo.getSuggestSelection()>
	//   38   83:astore          5
		if(s1 != null)
	//*  39   85:aload           5
	//*  40   87:ifnull          102
		{
			searchableinfo = ((SearchableInfo) (new String[] {
				s
			}));
	//   41   90:iconst_1        
	//   42   91:anewarray       String[]
	//   43   94:dup             
	//   44   95:iconst_0        
	//   45   96:aload_2         
	//   46   97:aastore         
	//   47   98:astore_1        
		} else
	//*  48   99:goto            111
		{
			((android.net.Uri.Builder) (obj)).appendPath(s);
	//   49  102:aload           4
	//   50  104:aload_2         
	//   51  105:invokevirtual   #613 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   52  108:pop             
			searchableinfo = null;
	//   53  109:aconst_null     
	//   54  110:astore_1        
		}
		if(i > 0)
	//*  55  111:iload_3         
	//*  56  112:ifle            128
			((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i));
	//   57  115:aload           4
	//   58  117:ldc2            #618 <String "limit">
	//   59  120:iload_3         
	//   60  121:invokestatic    #621 <Method String String.valueOf(int)>
	//   61  124:invokevirtual   #625 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   62  127:pop             
		s = ((String) (((android.net.Uri.Builder) (obj)).build()));
	//   63  128:aload           4
	//   64  130:invokevirtual   #629 <Method Uri android.net.Uri$Builder.build()>
	//   65  133:astore_2        
		return mContext.getContentResolver().query(((Uri) (s)), ((String []) (null)), s1, ((String []) (searchableinfo)), ((String) (null)));
	//   66  134:aload_0         
	//   67  135:getfield        #63  <Field Context mContext>
	//   68  138:invokevirtual   #302 <Method ContentResolver Context.getContentResolver()>
	//   69  141:aload_2         
	//   70  142:aconst_null     
	//   71  143:aload           5
	//   72  145:aload_1         
	//   73  146:aconst_null     
	//   74  147:invokevirtual   #632 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
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
	//    4    4:invokespecial   #635 <Method View ResourceCursorAdapter.getView(int, View, ViewGroup)>
	//    5    7:astore_2        
		}
	//*   6    8:aload_2         
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   10:astore_2        
		{
			Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", ((Throwable) (view)));
	//    9   11:ldc1            #213 <String "SuggestionsAdapter">
	//   10   13:ldc2            #566 <String "Search suggestions cursor threw exception.">
	//   11   16:aload_2         
	//   12   17:invokestatic    #568 <Method int Log.w(String, String, Throwable)>
	//   13   20:pop             
			viewgroup = ((ViewGroup) (newView(mContext, mCursor, viewgroup)));
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #63  <Field Context mContext>
	//   17   26:aload_0         
	//   18   27:getfield        #572 <Field Cursor mCursor>
	//   19   30:aload_3         
	//   20   31:invokevirtual   #638 <Method View newView(Context, Cursor, ViewGroup)>
	//   21   34:astore_3        
			if(viewgroup != null)
	//*  22   35:aload_3         
	//*  23   36:ifnull          56
				((ChildViewCache)((View) (viewgroup)).getTag()).mText1.setText(((CharSequence) (((RuntimeException) (view)).toString())));
	//   24   39:aload_3         
	//   25   40:invokevirtual   #435 <Method Object View.getTag()>
	//   26   43:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//   27   46:getfield        #443 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   28   49:aload_2         
	//   29   50:invokevirtual   #577 <Method String RuntimeException.toString()>
	//   30   53:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
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
	//    4    4:invokespecial   #640 <Method View ResourceCursorAdapter.newView(Context, Cursor, ViewGroup)>
	//    5    7:astore_1        
		((View) (context)).setTag(((Object) (new ChildViewCache(((View) (context))))));
	//    6    8:aload_1         
	//    7    9:new             #8   <Class SuggestionsAdapter$ChildViewCache>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #643 <Method void SuggestionsAdapter$ChildViewCache(View)>
	//   11   17:invokevirtual   #644 <Method void View.setTag(Object)>
		((ImageView)((View) (context)).findViewById(android.support.v7.appcompat.R.id.edit_query)).setImageResource(mCommitIconResId);
	//   12   20:aload_1         
	//   13   21:getstatic       #649 <Field int android.support.v7.appcompat.R$id.edit_query>
	//   14   24:invokevirtual   #653 <Method View View.findViewById(int)>
	//   15   27:checkcast       #388 <Class ImageView>
	//   16   30:aload_0         
	//   17   31:getfield        #84  <Field int mCommitIconResId>
	//   18   34:invokevirtual   #656 <Method void ImageView.setImageResource(int)>
		return ((View) (context));
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public void notifyDataSetChanged()
	{
		super.notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #659 <Method void ResourceCursorAdapter.notifyDataSetChanged()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #663 <Method Cursor getCursor()>
	//    5    9:invokespecial   #665 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void notifyDataSetInvalidated()
	{
		super.notifyDataSetInvalidated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #668 <Method void ResourceCursorAdapter.notifyDataSetInvalidated()>
		updateSpinnerState(getCursor());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #663 <Method Cursor getCursor()>
	//    5    9:invokespecial   #665 <Method void updateSpinnerState(Cursor)>
	//    6   12:return          
	}

	public void onClick(View view)
	{
		view = ((View) (view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #435 <Method Object View.getTag()>
	//    2    4:astore_1        
		if(view instanceof CharSequence)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #154 <Class CharSequence>
	//*   5    9:ifeq            23
			mSearchView.onQueryRefine((CharSequence)view);
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field SearchView mSearchView>
	//    8   16:aload_1         
	//    9   17:checkcast       #154 <Class CharSequence>
	//   10   20:invokevirtual   #672 <Method void SearchView.onQueryRefine(CharSequence)>
	//   11   23:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
			charsequence = "";
	//    2    4:ldc2            #596 <String "">
	//    3    7:astore_1        
		else
	//*   4    8:goto            18
			charsequence = ((CharSequence) (charsequence.toString()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #675 <Method String CharSequence.toString()>
	//    7   17:astore_1        
		if(mSearchView.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_78;
	//    8   18:aload_0         
	//    9   19:getfield        #77  <Field SearchView mSearchView>
	//   10   22:invokevirtual   #678 <Method int SearchView.getVisibility()>
	//   11   25:ifne            78
		if(mSearchView.getWindowVisibility() != 0)
	//*  12   28:aload_0         
	//*  13   29:getfield        #77  <Field SearchView mSearchView>
	//*  14   32:invokevirtual   #681 <Method int SearchView.getWindowVisibility()>
	//*  15   35:ifeq            40
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		charsequence = ((CharSequence) (getSearchManagerSuggestions(mSearchable, ((String) (charsequence)), 50)));
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #79  <Field SearchableInfo mSearchable>
	//   21   45:aload_1         
	//   22   46:bipush          50
	//   23   48:invokevirtual   #683 <Method Cursor getSearchManagerSuggestions(SearchableInfo, String, int)>
	//   24   51:astore_1        
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_76;
	//   25   52:aload_1         
	//   26   53:ifnull          76
		((Cursor) (charsequence)).getCount();
	//   27   56:aload_1         
	//   28   57:invokeinterface #686 <Method int Cursor.getCount()>
	//   29   62:pop             
		return ((Cursor) (charsequence));
	//   30   63:aload_1         
	//   31   64:areturn         
		charsequence;
	//   32   65:astore_1        
		Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", ((Throwable) (charsequence)));
	//   33   66:ldc1            #213 <String "SuggestionsAdapter">
	//   34   68:ldc2            #688 <String "Search suggestions query threw an exception.">
	//   35   71:aload_1         
	//   36   72:invokestatic    #568 <Method int Log.w(String, String, Throwable)>
	//   37   75:pop             
		return null;
	//   38   76:aconst_null     
	//   39   77:areturn         
		return null;
	//   40   78:aconst_null     
	//   41   79:areturn         
	}

	public void setQueryRefinement(int i)
	{
		mQueryRefinement = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int mQueryRefinement>
	//    3    5:return          
	}

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
