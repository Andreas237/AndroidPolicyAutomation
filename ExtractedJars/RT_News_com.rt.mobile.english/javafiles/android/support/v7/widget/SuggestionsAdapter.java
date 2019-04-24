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
	//*  13   25:ifne            30
	//*  14   28:aconst_null     
	//*  15   29:areturn         
	//*  16   30:aload_3         
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #201 <Method String ComponentName.getPackageName()>
	//*  19   35:iload_2         
	//*  20   36:aload           4
	//*  21   38:getfield        #205 <Field android.content.pm.ApplicationInfo ActivityInfo.applicationInfo>
	//*  22   41:invokevirtual   #209 <Method Drawable PackageManager.getDrawable(String, int, android.content.pm.ApplicationInfo)>
	//*  23   44:astore_3        
	//*  24   45:aload_3         
	//*  25   46:ifnonnull       98
	//*  26   49:new             #211 <Class StringBuilder>
	//*  27   52:dup             
	//*  28   53:invokespecial   #212 <Method void StringBuilder()>
	//*  29   56:astore_3        
	//*  30   57:aload_3         
	//*  31   58:ldc1            #214 <String "Invalid icon resource ">
	//*  32   60:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  33   63:pop             
	//*  34   64:aload_3         
	//*  35   65:iload_2         
	//*  36   66:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//*  37   69:pop             
	//*  38   70:aload_3         
	//*  39   71:ldc1            #223 <String " for ">
	//*  40   73:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  41   76:pop             
	//*  42   77:aload_3         
	//*  43   78:aload_1         
	//*  44   79:invokevirtual   #226 <Method String ComponentName.flattenToShortString()>
	//*  45   82:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  46   85:pop             
	//*  47   86:ldc1            #19  <String "SuggestionsAdapter">
	//*  48   88:aload_3         
	//*  49   89:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  50   92:invokestatic    #235 <Method int Log.w(String, String)>
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
	//   57  101:ldc1            #19  <String "SuggestionsAdapter">
	//   58  103:aload_1         
	//   59  104:invokevirtual   #236 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   60  107:invokestatic    #235 <Method int Log.w(String, String)>
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
	//    1    1:invokevirtual   #226 <Method String ComponentName.flattenToShortString()>
	//    2    4:astore          4
		boolean flag = mOutsideDrawablesCache.containsKey(((Object) (s)));
	//    3    6:aload_0         
	//    4    7:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//    5   10:aload           4
	//    6   12:invokevirtual   #241 <Method boolean WeakHashMap.containsKey(Object)>
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
	//   13   23:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   14   26:aload           4
	//   15   28:invokevirtual   #114 <Method Object WeakHashMap.get(Object)>
	//   16   31:checkcast       #116 <Class android.graphics.drawable.Drawable$ConstantState>
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
	//   24   43:getfield        #101 <Field Context mProviderContext>
	//   25   46:invokevirtual   #148 <Method Resources Context.getResources()>
	//   26   49:invokevirtual   #244 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   27   52:areturn         
		}
		Drawable drawable = getActivityIcon(componentname);
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:invokespecial   #246 <Method Drawable getActivityIcon(ComponentName)>
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
	//   38   72:invokevirtual   #252 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   39   75:astore_1        
		mOutsideDrawablesCache.put(((Object) (s)), ((Object) (componentname)));
	//   40   76:aload_0         
	//   41   77:getfield        #103 <Field WeakHashMap mOutsideDrawablesCache>
	//   42   80:aload           4
	//   43   82:aload_1         
	//   44   83:invokevirtual   #256 <Method Object WeakHashMap.put(Object, Object)>
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
		boolean flag;
		Object obj;
		Object obj1;
		Object obj2;
		IOException ioexception;
		try
		{
			flag = "android.resource".equals(((Object) (uri.getScheme())));
	//    0    0:ldc2            #290 <String "android.resource">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #295 <Method String Uri.getScheme()>
	//    3    7:invokevirtual   #300 <Method boolean String.equals(Object)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ifeq            57
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #303 <Method Drawable getDrawableFromResourceUri(Uri)>
	//*  10   20:astore_3        
	//*  11   21:aload_3         
	//*  12   22:areturn         
	//*  13   23:new             #211 <Class StringBuilder>
	//*  14   26:dup             
	//*  15   27:invokespecial   #212 <Method void StringBuilder()>
	//*  16   30:astore_3        
	//*  17   31:aload_3         
	//*  18   32:ldc2            #305 <String "Resource does not exist: ">
	//*  19   35:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  20   38:pop             
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  24   44:pop             
	//*  25   45:new             #284 <Class FileNotFoundException>
	//*  26   48:dup             
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  29   53:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  30   56:athrow          
	//*  31   57:aload_0         
	//*  32   58:getfield        #101 <Field Context mProviderContext>
	//*  33   61:invokevirtual   #315 <Method ContentResolver Context.getContentResolver()>
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #321 <Method InputStream ContentResolver.openInputStream(Uri)>
	//*  36   68:astore          4
	//*  37   70:aload           4
	//*  38   72:ifnonnull       109
	//*  39   75:new             #211 <Class StringBuilder>
	//*  40   78:dup             
	//*  41   79:invokespecial   #212 <Method void StringBuilder()>
	//*  42   82:astore_3        
	//*  43   83:aload_3         
	//*  44   84:ldc2            #323 <String "Failed to open ">
	//*  45   87:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  46   90:pop             
	//*  47   91:aload_3         
	//*  48   92:aload_1         
	//*  49   93:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  50   96:pop             
	//*  51   97:new             #284 <Class FileNotFoundException>
	//*  52  100:dup             
	//*  53  101:aload_3         
	//*  54  102:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  55  105:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  56  108:athrow          
	//*  57  109:aload           4
	//*  58  111:aconst_null     
	//*  59  112:invokestatic    #327 <Method Drawable Drawable.createFromStream(InputStream, String)>
	//*  60  115:astore_3        
	//*  61  116:aload           4
	//*  62  118:invokevirtual   #332 <Method void InputStream.close()>
	//*  63  121:aload_3         
	//*  64  122:areturn         
	//*  65  123:astore          4
	//*  66  125:new             #211 <Class StringBuilder>
	//*  67  128:dup             
	//*  68  129:invokespecial   #212 <Method void StringBuilder()>
	//*  69  132:astore          5
	//*  70  134:aload           5
	//*  71  136:ldc2            #334 <String "Error closing icon stream for ">
	//*  72  139:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  73  142:pop             
	//*  74  143:aload           5
	//*  75  145:aload_1         
	//*  76  146:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  77  149:pop             
	//*  78  150:ldc1            #19  <String "SuggestionsAdapter">
	//*  79  152:aload           5
	//*  80  154:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  81  157:aload           4
	//*  82  159:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//*  83  162:pop             
	//*  84  163:aload_3         
	//*  85  164:areturn         
	//*  86  165:astore_3        
	//*  87  166:aload           4
	//*  88  168:invokevirtual   #332 <Method void InputStream.close()>
	//*  89  171:goto            214
	//*  90  174:astore          4
	//*  91  176:new             #211 <Class StringBuilder>
	//*  92  179:dup             
	//*  93  180:invokespecial   #212 <Method void StringBuilder()>
	//*  94  183:astore          5
	//*  95  185:aload           5
	//*  96  187:ldc2            #334 <String "Error closing icon stream for ">
	//*  97  190:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  98  193:pop             
	//*  99  194:aload           5
	//* 100  196:aload_1         
	//* 101  197:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//* 102  200:pop             
	//* 103  201:ldc1            #19  <String "SuggestionsAdapter">
	//* 104  203:aload           5
	//* 105  205:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 106  208:aload           4
	//* 107  210:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//* 108  213:pop             
	//* 109  214:aload_3         
	//* 110  215:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 111  216:astore_3        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  112  217:new             #211 <Class StringBuilder>
	//  113  220:dup             
	//  114  221:invokespecial   #212 <Method void StringBuilder()>
	//  115  224:astore          4
			stringbuilder.append("Icon not found: ");
	//  116  226:aload           4
	//  117  228:ldc2            #340 <String "Icon not found: ">
	//  118  231:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  119  234:pop             
			stringbuilder.append(((Object) (uri)));
	//  120  235:aload           4
	//  121  237:aload_1         
	//  122  238:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//  123  241:pop             
			stringbuilder.append(", ");
	//  124  242:aload           4
	//  125  244:ldc2            #342 <String ", ">
	//  126  247:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  127  250:pop             
			stringbuilder.append(((FileNotFoundException) (obj1)).getMessage());
	//  128  251:aload           4
	//  129  253:aload_3         
	//  130  254:invokevirtual   #345 <Method String FileNotFoundException.getMessage()>
	//  131  257:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  132  260:pop             
			Log.w("SuggestionsAdapter", stringbuilder.toString());
	//  133  261:ldc1            #19  <String "SuggestionsAdapter">
	//  134  263:aload           4
	//  135  265:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  136  268:invokestatic    #235 <Method int Log.w(String, String)>
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
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_109;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Failed to open ");
		((StringBuilder) (obj)).append(((Object) (uri)));
		throw new FileNotFoundException(((StringBuilder) (obj)).toString());
		obj = ((Object) (Drawable.createFromStream(((InputStream) (obj2)), ((String) (null)))));
		((InputStream) (obj2)).close();
		return ((Drawable) (obj));
		obj2;
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error closing icon stream for ");
		stringbuilder1.append(((Object) (uri)));
		Log.e("SuggestionsAdapter", stringbuilder1.toString(), ((Throwable) (obj2)));
		return ((Drawable) (obj));
		obj1;
		((InputStream) (obj2)).close();
		break MISSING_BLOCK_LABEL_214;
		ioexception;
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("Error closing icon stream for ");
		stringbuilder2.append(((Object) (uri)));
		Log.e("SuggestionsAdapter", stringbuilder2.toString(), ((Throwable) (ioexception)));
		throw obj1;
		obj1;
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
	//    3    5:invokevirtual   #352 <Method boolean String.isEmpty()>
	//    4    8:ifne            173
		if("0".equals(((Object) (s))))
	//*   5   11:ldc2            #354 <String "0">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #300 <Method boolean String.equals(Object)>
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
	//   12   24:invokestatic    #359 <Method int Integer.parseInt(String)>
	//   13   27:istore_2        
			obj = ((Object) (new StringBuilder()));
	//   14   28:new             #211 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #212 <Method void StringBuilder()>
	//   17   35:astore_3        
			((StringBuilder) (obj)).append("android.resource://");
	//   18   36:aload_3         
	//   19   37:ldc2            #361 <String "android.resource://">
	//   20   40:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			((StringBuilder) (obj)).append(mProviderContext.getPackageName());
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #101 <Field Context mProviderContext>
	//   25   49:invokevirtual   #362 <Method String Context.getPackageName()>
	//   26   52:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			((StringBuilder) (obj)).append("/");
	//   28   56:aload_3         
	//   29   57:ldc2            #364 <String "/">
	//   30   60:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			((StringBuilder) (obj)).append(i);
	//   32   64:aload_3         
	//   33   65:iload_2         
	//   34   66:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   35   69:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   36   70:aload_3         
	//   37   71:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   38   74:astore_3        
			drawable = checkIconCache(((String) (obj)));
	//   39   75:aload_0         
	//   40   76:aload_3         
	//   41   77:invokespecial   #366 <Method Drawable checkIconCache(String)>
	//   42   80:astore          4
		}
	//*  43   82:aload           4
	//*  44   84:ifnull          90
	//*  45   87:aload           4
	//*  46   89:areturn         
	//*  47   90:aload_0         
	//*  48   91:getfield        #101 <Field Context mProviderContext>
	//*  49   94:iload_2         
	//*  50   95:invokestatic    #371 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  51   98:astore          4
	//*  52  100:aload_0         
	//*  53  101:aload_3         
	//*  54  102:aload           4
	//*  55  104:invokespecial   #375 <Method void storeInIconCache(String, Drawable)>
	//*  56  107:aload           4
	//*  57  109:areturn         
	//*  58  110:new             #211 <Class StringBuilder>
	//*  59  113:dup             
	//*  60  114:invokespecial   #212 <Method void StringBuilder()>
	//*  61  117:astore_3        
	//*  62  118:aload_3         
	//*  63  119:ldc2            #377 <String "Icon resource not found: ">
	//*  64  122:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  65  125:pop             
	//*  66  126:aload_3         
	//*  67  127:aload_1         
	//*  68  128:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  69  131:pop             
	//*  70  132:ldc1            #19  <String "SuggestionsAdapter">
	//*  71  134:aload_3         
	//*  72  135:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  73  138:invokestatic    #235 <Method int Log.w(String, String)>
	//*  74  141:pop             
	//*  75  142:aconst_null     
	//*  76  143:areturn         
	//*  77  144:aload_0         
	//*  78  145:aload_1         
	//*  79  146:invokespecial   #366 <Method Drawable checkIconCache(String)>
	//*  80  149:astore_3        
	//*  81  150:aload_3         
	//*  82  151:ifnull          156
	//*  83  154:aload_3         
	//*  84  155:areturn         
	//*  85  156:aload_0         
	//*  86  157:aload_1         
	//*  87  158:invokestatic    #381 <Method Uri Uri.parse(String)>
	//*  88  161:invokespecial   #383 <Method Drawable getDrawable(Uri)>
	//*  89  164:astore_3        
	//*  90  165:aload_0         
	//*  91  166:aload_1         
	//*  92  167:aload_3         
	//*  93  168:invokespecial   #375 <Method void storeInIconCache(String, Drawable)>
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
	//   10   16:invokeinterface #388 <Method String Cursor.getString(int)>
	//   11   21:invokespecial   #390 <Method Drawable getDrawableFromResourceValue(String)>
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
	//   19   33:invokespecial   #392 <Method Drawable getDefaultIcon1(Cursor)>
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
	//    3    5:invokeinterface #432 <Method Bundle Cursor.getExtras()>
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
	//*  11   21:ldc2            #434 <String "in_progress">
	//*  12   24:invokevirtual   #440 <Method boolean Bundle.getBoolean(String)>
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
	//    1    1:invokevirtual   #448 <Method Object View.getTag()>
	//    2    4:checkcast       #8   <Class SuggestionsAdapter$ChildViewCache>
	//    3    7:astore_2        
		int i;
		if(mFlagsCol != -1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field int mFlagsCol>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          31
			i = cursor.getInt(mFlagsCol);
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field int mFlagsCol>
	//   11   21:invokeinterface #452 <Method int Cursor.getInt(int)>
	//   12   26:istore          4
		else
	//*  13   28:goto            34
			i = 0;
	//   14   31:iconst_0        
	//   15   32:istore          4
		if(((ChildViewCache) (context)).mText1 != null)
	//*  16   34:aload_2         
	//*  17   35:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  18   38:ifnull          59
		{
			view = ((View) (getStringOrNull(cursor, mText1Col)));
	//   19   41:aload_3         
	//   20   42:aload_0         
	//   21   43:getfield        #65  <Field int mText1Col>
	//   22   46:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   23   49:astore_1        
			setViewText(((ChildViewCache) (context)).mText1, ((CharSequence) (view)));
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   27   55:aload_1         
	//   28   56:invokespecial   #458 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mText2 != null)
	//*  29   59:aload_2         
	//*  30   60:getfield        #461 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//*  31   63:ifnull          162
		{
			view = ((View) (getStringOrNull(cursor, mText2UrlCol)));
	//   32   66:aload_3         
	//   33   67:aload_0         
	//   34   68:getfield        #69  <Field int mText2UrlCol>
	//   35   71:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   36   74:astore_1        
			if(view != null)
	//*  37   75:aload_1         
	//*  38   76:ifnull          88
				view = ((View) (formatUrl(((CharSequence) (view)))));
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokespecial   #463 <Method CharSequence formatUrl(CharSequence)>
	//   42   84:astore_1        
			else
	//*  43   85:goto            97
				view = ((View) (getStringOrNull(cursor, mText2Col)));
	//   44   88:aload_3         
	//   45   89:aload_0         
	//   46   90:getfield        #67  <Field int mText2Col>
	//   47   93:invokestatic    #268 <Method String getStringOrNull(Cursor, int)>
	//   48   96:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (view))))
	//*  49   97:aload_1         
	//*  50   98:invokestatic    #425 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  51  101:ifeq            130
			{
				if(((ChildViewCache) (context)).mText1 != null)
	//*  52  104:aload_2         
	//*  53  105:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  54  108:ifnull          153
				{
					((ChildViewCache) (context)).mText1.setSingleLine(false);
	//   55  111:aload_2         
	//   56  112:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   57  115:iconst_0        
	//   58  116:invokevirtual   #467 <Method void TextView.setSingleLine(boolean)>
					((ChildViewCache) (context)).mText1.setMaxLines(2);
	//   59  119:aload_2         
	//   60  120:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   61  123:iconst_2        
	//   62  124:invokevirtual   #470 <Method void TextView.setMaxLines(int)>
				}
			} else
	//*  63  127:goto            153
			if(((ChildViewCache) (context)).mText1 != null)
	//*  64  130:aload_2         
	//*  65  131:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//*  66  134:ifnull          153
			{
				((ChildViewCache) (context)).mText1.setSingleLine(true);
	//   67  137:aload_2         
	//   68  138:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   69  141:iconst_1        
	//   70  142:invokevirtual   #467 <Method void TextView.setSingleLine(boolean)>
				((ChildViewCache) (context)).mText1.setMaxLines(1);
	//   71  145:aload_2         
	//   72  146:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//   73  149:iconst_1        
	//   74  150:invokevirtual   #470 <Method void TextView.setMaxLines(int)>
			}
			setViewText(((ChildViewCache) (context)).mText2, ((CharSequence) (view)));
	//   75  153:aload_0         
	//   76  154:aload_2         
	//   77  155:getfield        #461 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
	//   78  158:aload_1         
	//   79  159:invokespecial   #458 <Method void setViewText(TextView, CharSequence)>
		}
		if(((ChildViewCache) (context)).mIcon1 != null)
	//*  80  162:aload_2         
	//*  81  163:getfield        #474 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//*  82  166:ifnull          183
			setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
	//   83  169:aload_0         
	//   84  170:aload_2         
	//   85  171:getfield        #474 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
	//   86  174:aload_0         
	//   87  175:aload_3         
	//   88  176:invokespecial   #476 <Method Drawable getIcon1(Cursor)>
	//   89  179:iconst_4        
	//   90  180:invokespecial   #478 <Method void setViewDrawable(ImageView, Drawable, int)>
		if(((ChildViewCache) (context)).mIcon2 != null)
	//*  91  183:aload_2         
	//*  92  184:getfield        #481 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//*  93  187:ifnull          205
			setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
	//   94  190:aload_0         
	//   95  191:aload_2         
	//   96  192:getfield        #481 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
	//   97  195:aload_0         
	//   98  196:aload_3         
	//   99  197:invokespecial   #483 <Method Drawable getIcon2(Cursor)>
	//  100  200:bipush          8
	//  101  202:invokespecial   #478 <Method void setViewDrawable(ImageView, Drawable, int)>
		if(mQueryRefinement != 2 && (mQueryRefinement != 1 || (i & 1) == 0))
	//* 102  205:aload_0         
	//* 103  206:getfield        #63  <Field int mQueryRefinement>
	//* 104  209:iconst_2        
	//* 105  210:icmpeq          241
	//* 106  213:aload_0         
	//* 107  214:getfield        #63  <Field int mQueryRefinement>
	//* 108  217:iconst_1        
	//* 109  218:icmpne          231
	//* 110  221:iload           4
	//* 111  223:iconst_1        
	//* 112  224:iand            
	//* 113  225:ifeq            231
	//* 114  228:goto            241
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(8);
	//  115  231:aload_2         
	//  116  232:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  117  235:bipush          8
	//  118  237:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
			return;
	//  119  240:return          
		} else
		{
			((ChildViewCache) (context)).mIconRefine.setVisibility(0);
	//  120  241:aload_2         
	//  121  242:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  122  245:iconst_0        
	//  123  246:invokevirtual   #409 <Method void ImageView.setVisibility(int)>
			((ChildViewCache) (context)).mIconRefine.setTag(((Object) (((ChildViewCache) (context)).mText1.getText())));
	//  124  249:aload_2         
	//  125  250:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  126  253:aload_2         
	//  127  254:getfield        #456 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
	//  128  257:invokevirtual   #490 <Method CharSequence TextView.getText()>
	//  129  260:invokevirtual   #494 <Method void ImageView.setTag(Object)>
			((ChildViewCache) (context)).mIconRefine.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//  130  263:aload_2         
	//  131  264:getfield        #486 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
	//  132  267:aload_0         
	//  133  268:invokevirtual   #498 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//  134  271:return          
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
	//    4    9:ldc2            #501 <String "Tried to change cursor after adapter was closed.">
	//    5   12:invokestatic    #235 <Method int Log.w(String, String)>
	//    6   15:pop             
			if(cursor != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          26
				cursor.close();
	//    9   20:aload_1         
	//   10   21:invokeinterface #502 <Method void Cursor.close()>
			return;
	//   11   26:return          
		}
		super.changeCursor(cursor);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #504 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
		if(cursor != null)
	//*  15   32:aload_1         
	//*  16   33:ifnull          126
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
	//   52  122:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//   53  125:pop             
			}
		return;
	//   54  126:return          
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
		if(cursor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
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
	//*  27   51:ifeq            68
		{
			cursor = ((Cursor) (getColumnString(cursor, "suggest_text_1")));
	//   28   54:aload_1         
	//   29   55:ldc2            #506 <String "suggest_text_1">
	//   30   58:invokestatic    #525 <Method String getColumnString(Cursor, String)>
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
			Object obj = ((Object) (uri.getAuthority()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #536 <Method String Uri.getAuthority()>
	//    2    4:astore_3        
			if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #425 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            46
			{
				obj = ((Object) (new StringBuilder()));
	//    6   12:new             #211 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #212 <Method void StringBuilder()>
	//    9   19:astore_3        
				((StringBuilder) (obj)).append("No authority: ");
	//   10   20:aload_3         
	//   11   21:ldc2            #538 <String "No authority: ">
	//   12   24:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
				((StringBuilder) (obj)).append(((Object) (uri)));
	//   14   28:aload_3         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//   17   33:pop             
				throw new FileNotFoundException(((StringBuilder) (obj)).toString());
	//   18   34:new             #284 <Class FileNotFoundException>
	//   19   37:dup             
	//   20   38:aload_3         
	//   21   39:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #311 <Method void FileNotFoundException(String)>
	//   23   45:athrow          
			}
			int i;
			Resources resources;
			List list;
			try
			{
				resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
	//   24   46:aload_0         
	//   25   47:getfield        #78  <Field Context mContext>
	//   26   50:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//   27   53:aload_3         
	//   28   54:invokevirtual   #542 <Method Resources PackageManager.getResourcesForApplication(String)>
	//   29   57:astore          4
			}
	//*  30   59:aload_1         
	//*  31   60:invokevirtual   #546 <Method List Uri.getPathSegments()>
	//*  32   63:astore          5
	//*  33   65:aload           5
	//*  34   67:ifnonnull       104
	//*  35   70:new             #211 <Class StringBuilder>
	//*  36   73:dup             
	//*  37   74:invokespecial   #212 <Method void StringBuilder()>
	//*  38   77:astore_3        
	//*  39   78:aload_3         
	//*  40   79:ldc2            #548 <String "No path: ">
	//*  41   82:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  42   85:pop             
	//*  43   86:aload_3         
	//*  44   87:aload_1         
	//*  45   88:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  46   91:pop             
	//*  47   92:new             #284 <Class FileNotFoundException>
	//*  48   95:dup             
	//*  49   96:aload_3         
	//*  50   97:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  51  100:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  52  103:athrow          
	//*  53  104:aload           5
	//*  54  106:invokeinterface #553 <Method int List.size()>
	//*  55  111:istore_2        
	//*  56  112:iload_2         
	//*  57  113:iconst_1        
	//*  58  114:icmpne          169
	//*  59  117:aload           5
	//*  60  119:iconst_0        
	//*  61  120:invokeinterface #556 <Method Object List.get(int)>
	//*  62  125:checkcast       #297 <Class String>
	//*  63  128:invokestatic    #359 <Method int Integer.parseInt(String)>
	//*  64  131:istore_2        
	//*  65  132:goto            203
	//*  66  135:new             #211 <Class StringBuilder>
	//*  67  138:dup             
	//*  68  139:invokespecial   #212 <Method void StringBuilder()>
	//*  69  142:astore_3        
	//*  70  143:aload_3         
	//*  71  144:ldc2            #558 <String "Single path segment is not a resource ID: ">
	//*  72  147:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//*  73  150:pop             
	//*  74  151:aload_3         
	//*  75  152:aload_1         
	//*  76  153:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//*  77  156:pop             
	//*  78  157:new             #284 <Class FileNotFoundException>
	//*  79  160:dup             
	//*  80  161:aload_3         
	//*  81  162:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  82  165:invokespecial   #311 <Method void FileNotFoundException(String)>
	//*  83  168:athrow          
	//*  84  169:iload_2         
	//*  85  170:iconst_2        
	//*  86  171:icmpne          248
	//*  87  174:aload           4
	//*  88  176:aload           5
	//*  89  178:iconst_1        
	//*  90  179:invokeinterface #556 <Method Object List.get(int)>
	//*  91  184:checkcast       #297 <Class String>
	//*  92  187:aload           5
	//*  93  189:iconst_0        
	//*  94  190:invokeinterface #556 <Method Object List.get(int)>
	//*  95  195:checkcast       #297 <Class String>
	//*  96  198:aload_3         
	//*  97  199:invokevirtual   #562 <Method int Resources.getIdentifier(String, String, String)>
	//*  98  202:istore_2        
	//*  99  203:iload_2         
	//* 100  204:ifne            241
	//* 101  207:new             #211 <Class StringBuilder>
	//* 102  210:dup             
	//* 103  211:invokespecial   #212 <Method void StringBuilder()>
	//* 104  214:astore_3        
	//* 105  215:aload_3         
	//* 106  216:ldc2            #564 <String "No resource found for: ">
	//* 107  219:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//* 108  222:pop             
	//* 109  223:aload_3         
	//* 110  224:aload_1         
	//* 111  225:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//* 112  228:pop             
	//* 113  229:new             #284 <Class FileNotFoundException>
	//* 114  232:dup             
	//* 115  233:aload_3         
	//* 116  234:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 117  237:invokespecial   #311 <Method void FileNotFoundException(String)>
	//* 118  240:athrow          
	//* 119  241:aload           4
	//* 120  243:iload_2         
	//* 121  244:invokevirtual   #567 <Method Drawable Resources.getDrawable(int)>
	//* 122  247:areturn         
	//* 123  248:new             #211 <Class StringBuilder>
	//* 124  251:dup             
	//* 125  252:invokespecial   #212 <Method void StringBuilder()>
	//* 126  255:astore_3        
	//* 127  256:aload_3         
	//* 128  257:ldc2            #569 <String "More than two path segments: ">
	//* 129  260:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//* 130  263:pop             
	//* 131  264:aload_3         
	//* 132  265:aload_1         
	//* 133  266:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//* 134  269:pop             
	//* 135  270:new             #284 <Class FileNotFoundException>
	//* 136  273:dup             
	//* 137  274:aload_3         
	//* 138  275:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 139  278:invokespecial   #311 <Method void FileNotFoundException(String)>
	//* 140  281:athrow          
	//* 141  282:new             #211 <Class StringBuilder>
	//* 142  285:dup             
	//* 143  286:invokespecial   #212 <Method void StringBuilder()>
	//* 144  289:astore_3        
	//* 145  290:aload_3         
	//* 146  291:ldc2            #571 <String "No package found for authority: ">
	//* 147  294:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//* 148  297:pop             
	//* 149  298:aload_3         
	//* 150  299:aload_1         
	//* 151  300:invokevirtual   #308 <Method StringBuilder StringBuilder.append(Object)>
	//* 152  303:pop             
	//* 153  304:new             #284 <Class FileNotFoundException>
	//* 154  307:dup             
	//* 155  308:aload_3         
	//* 156  309:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 157  312:invokespecial   #311 <Method void FileNotFoundException(String)>
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
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("No path: ");
				((StringBuilder) (obj)).append(((Object) (uri)));
				throw new FileNotFoundException(((StringBuilder) (obj)).toString());
			}
			i = list.size();
			if(i == 1)
			{
				try
				{
					i = Integer.parseInt((String)list.get(0));
				}
	//* 159  316:astore_3        
	//* 160  317:goto            282
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
					break label0;
				i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
			}
			if(i == 0)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("No resource found for: ");
				((StringBuilder) (obj)).append(((Object) (uri)));
				throw new FileNotFoundException(((StringBuilder) (obj)).toString());
			} else
			{
				return resources.getDrawable(i);
			}
		}
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("More than two path segments: ");
		((StringBuilder) (obj)).append(((Object) (uri)));
		throw new FileNotFoundException(((StringBuilder) (obj)).toString());
	//* 161  320:astore_3        
	//* 162  321:goto            135
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
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(searchableinfo == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
		Object obj1 = ((Object) (searchableinfo.getSuggestAuthority()));
	//    6    9:aload_1         
	//    7   10:invokevirtual   #597 <Method String SearchableInfo.getSuggestAuthority()>
	//    8   13:astore          5
		if(obj1 == null)
	//*   9   15:aload           5
	//*  10   17:ifnonnull       22
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		obj1 = ((Object) ((new android.net.Uri.Builder()).scheme("content").authority(((String) (obj1))).query("").fragment("")));
	//   13   22:new             #599 <Class android.net.Uri$Builder>
	//   14   25:dup             
	//   15   26:invokespecial   #600 <Method void android.net.Uri$Builder()>
	//   16   29:ldc2            #602 <String "content">
	//   17   32:invokevirtual   #606 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   18   35:aload           5
	//   19   37:invokevirtual   #609 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   20   40:ldc2            #611 <String "">
	//   21   43:invokevirtual   #614 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//   22   46:ldc2            #611 <String "">
	//   23   49:invokevirtual   #617 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
	//   24   52:astore          5
		String s1 = searchableinfo.getSuggestPath();
	//   25   54:aload_1         
	//   26   55:invokevirtual   #620 <Method String SearchableInfo.getSuggestPath()>
	//   27   58:astore          6
		if(s1 != null)
	//*  28   60:aload           6
	//*  29   62:ifnull          73
			((android.net.Uri.Builder) (obj1)).appendEncodedPath(s1);
	//   30   65:aload           5
	//   31   67:aload           6
	//   32   69:invokevirtual   #623 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   33   72:pop             
		((android.net.Uri.Builder) (obj1)).appendPath("search_suggest_query");
	//   34   73:aload           5
	//   35   75:ldc2            #625 <String "search_suggest_query">
	//   36   78:invokevirtual   #628 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   37   81:pop             
		s1 = searchableinfo.getSuggestSelection();
	//   38   82:aload_1         
	//   39   83:invokevirtual   #631 <Method String SearchableInfo.getSuggestSelection()>
	//   40   86:astore          6
		if(s1 != null)
	//*  41   88:aload           6
	//*  42   90:ifnull          105
		{
			searchableinfo = ((SearchableInfo) (new String[1]));
	//   43   93:iconst_1        
	//   44   94:anewarray       String[]
	//   45   97:astore_1        
			searchableinfo[0] = ((/*<invalid signature>*/java.lang.Object) (s));
	//   46   98:aload_1         
	//   47   99:iconst_0        
	//   48  100:aload_2         
	//   49  101:aastore         
		} else
	//*  50  102:goto            118
		{
			((android.net.Uri.Builder) (obj1)).appendPath(s);
	//   51  105:aload           5
	//   52  107:aload_2         
	//   53  108:invokevirtual   #628 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   54  111:pop             
			searchableinfo = ((SearchableInfo) (obj));
	//   55  112:aload           4
	//   56  114:astore_1        
		}
	//*  57  115:goto            102
		if(i > 0)
	//*  58  118:iload_3         
	//*  59  119:ifle            135
			((android.net.Uri.Builder) (obj1)).appendQueryParameter("limit", String.valueOf(i));
	//   60  122:aload           5
	//   61  124:ldc2            #633 <String "limit">
	//   62  127:iload_3         
	//   63  128:invokestatic    #636 <Method String String.valueOf(int)>
	//   64  131:invokevirtual   #640 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   65  134:pop             
		s = ((String) (((android.net.Uri.Builder) (obj1)).build()));
	//   66  135:aload           5
	//   67  137:invokevirtual   #644 <Method Uri android.net.Uri$Builder.build()>
	//   68  140:astore_2        
		return mContext.getContentResolver().query(((Uri) (s)), ((String []) (null)), s1, ((String []) (searchableinfo)), ((String) (null)));
	//   69  141:aload_0         
	//   70  142:getfield        #78  <Field Context mContext>
	//   71  145:invokevirtual   #315 <Method ContentResolver Context.getContentResolver()>
	//   72  148:aload_2         
	//   73  149:aconst_null     
	//   74  150:aload           6
	//   75  152:aload_1         
	//   76  153:aconst_null     
	//   77  154:invokevirtual   #647 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   78  157:areturn         
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
	//*   1    1:ifnonnull       11
			charsequence = "";
	//    2    4:ldc2            #611 <String "">
	//    3    7:astore_1        
		else
	//*   4    8:goto            18
			charsequence = ((CharSequence) (charsequence.toString()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #690 <Method String CharSequence.toString()>
	//    7   17:astore_1        
		if(mSearchView.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_78;
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field SearchView mSearchView>
	//   10   22:invokevirtual   #693 <Method int SearchView.getVisibility()>
	//   11   25:ifne            78
		if(mSearchView.getWindowVisibility() != 0)
	//*  12   28:aload_0         
	//*  13   29:getfield        #92  <Field SearchView mSearchView>
	//*  14   32:invokevirtual   #696 <Method int SearchView.getWindowVisibility()>
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
		return null;
	//   40   78:aconst_null     
	//   41   79:areturn         
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
