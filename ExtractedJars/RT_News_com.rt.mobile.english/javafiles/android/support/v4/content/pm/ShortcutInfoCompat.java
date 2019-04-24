// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.content.pm.*;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import java.util.Arrays;

public class ShortcutInfoCompat
{
	public static class Builder
	{

		public ShortcutInfoCompat build()
		{
			if(TextUtils.isEmpty(mInfo.mLabel))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//*   2    4:invokestatic    #36  <Method CharSequence ShortcutInfoCompat.access$300(ShortcutInfoCompat)>
		//*   3    7:invokestatic    #42  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   4   10:ifeq            23
				throw new IllegalArgumentException("Shortcut much have a non-empty label");
		//    5   13:new             #44  <Class IllegalArgumentException>
		//    6   16:dup             
		//    7   17:ldc1            #46  <String "Shortcut much have a non-empty label">
		//    8   19:invokespecial   #49  <Method void IllegalArgumentException(String)>
		//    9   22:athrow          
			if(mInfo.mIntents != null && mInfo.mIntents.length != 0)
		//*  10   23:aload_0         
		//*  11   24:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//*  12   27:invokestatic    #53  <Method Intent[] ShortcutInfoCompat.access$600(ShortcutInfoCompat)>
		//*  13   30:ifnull          52
		//*  14   33:aload_0         
		//*  15   34:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//*  16   37:invokestatic    #53  <Method Intent[] ShortcutInfoCompat.access$600(ShortcutInfoCompat)>
		//*  17   40:arraylength     
		//*  18   41:ifne            47
		//*  19   44:goto            52
				return mInfo;
		//   20   47:aload_0         
		//   21   48:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//   22   51:areturn         
			else
				throw new IllegalArgumentException("Shortcut much have an intent");
		//   23   52:new             #44  <Class IllegalArgumentException>
		//   24   55:dup             
		//   25   56:ldc1            #55  <String "Shortcut much have an intent">
		//   26   58:invokespecial   #49  <Method void IllegalArgumentException(String)>
		//   27   61:athrow          
		}

		public Builder setActivity(ComponentName componentname)
		{
			mInfo.mActivity = componentname;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #62  <Method ComponentName ShortcutInfoCompat.access$802(ShortcutInfoCompat, ComponentName)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setAlwaysBadged()
		{
			mInfo.mIsAlwaysBadged = true;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:iconst_1        
		//    3    5:invokestatic    #68  <Method boolean ShortcutInfoCompat.access$902(ShortcutInfoCompat, boolean)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setDisabledMessage(CharSequence charsequence)
		{
			mInfo.mDisabledMessage = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #74  <Method CharSequence ShortcutInfoCompat.access$502(ShortcutInfoCompat, CharSequence)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setIcon(IconCompat iconcompat)
		{
			mInfo.mIcon = iconcompat;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #80  <Method IconCompat ShortcutInfoCompat.access$702(ShortcutInfoCompat, IconCompat)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setIntent(Intent intent)
		{
			return setIntents(new Intent[] {
				intent
			});
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:anewarray       Intent[]
		//    3    5:dup             
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:aastore         
		//    7    9:invokevirtual   #88  <Method ShortcutInfoCompat$Builder setIntents(Intent[])>
		//    8   12:areturn         
		}

		public Builder setIntents(Intent aintent[])
		{
			mInfo.mIntents = aintent;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #92  <Method Intent[] ShortcutInfoCompat.access$602(ShortcutInfoCompat, Intent[])>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setLongLabel(CharSequence charsequence)
		{
			mInfo.mLongLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #96  <Method CharSequence ShortcutInfoCompat.access$402(ShortcutInfoCompat, CharSequence)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setShortLabel(CharSequence charsequence)
		{
			mInfo.mLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #100 <Method CharSequence ShortcutInfoCompat.access$302(ShortcutInfoCompat, CharSequence)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		private final ShortcutInfoCompat mInfo = new ShortcutInfoCompat();

		public Builder(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #6   <Class ShortcutInfoCompat>
		//    4    8:dup             
		//    5    9:aconst_null     
		//    6   10:invokespecial   #18  <Method void ShortcutInfoCompat(ShortcutInfoCompat$1)>
		//    7   13:putfield        #20  <Field ShortcutInfoCompat mInfo>
			mInfo.mContext = context;
		//    8   16:aload_0         
		//    9   17:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//   10   20:aload_1         
		//   11   21:invokestatic    #24  <Method Context ShortcutInfoCompat.access$102(ShortcutInfoCompat, Context)>
		//   12   24:pop             
			mInfo.mId = s;
		//   13   25:aload_0         
		//   14   26:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//   15   29:aload_2         
		//   16   30:invokestatic    #28  <Method String ShortcutInfoCompat.access$202(ShortcutInfoCompat, String)>
		//   17   33:pop             
		//   18   34:return          
		}
	}


	private ShortcutInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}


	Intent addToIntent(Intent intent)
	{
		intent.putExtra("android.intent.extra.shortcut.INTENT", ((android.os.Parcelable) (mIntents[mIntents.length - 1]))).putExtra("android.intent.extra.shortcut.NAME", mLabel.toString());
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "android.intent.extra.shortcut.INTENT">
	//    2    3:aload_0         
	//    3    4:getfield        #56  <Field Intent[] mIntents>
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field Intent[] mIntents>
	//    6   11:arraylength     
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:aaload          
	//   10   15:invokevirtual   #83  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   11   18:ldc1            #85  <String "android.intent.extra.shortcut.NAME">
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field CharSequence mLabel>
	//   14   24:invokeinterface #91  <Method String CharSequence.toString()>
	//   15   29:invokevirtual   #94  <Method Intent Intent.putExtra(String, String)>
	//   16   32:pop             
		if(mIcon != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #62  <Field IconCompat mIcon>
	//*  19   37:ifnull          109
		{
			android.graphics.drawable.Drawable drawable1 = null;
	//   20   40:aconst_null     
	//   21   41:astore_3        
			Object obj = null;
	//   22   42:aconst_null     
	//   23   43:astore          4
			if(mIsAlwaysBadged)
	//*  24   45:aload_0         
	//*  25   46:getfield        #70  <Field boolean mIsAlwaysBadged>
	//*  26   49:ifeq            100
			{
				PackageManager packagemanager = mContext.getPackageManager();
	//   27   52:aload_0         
	//   28   53:getfield        #36  <Field Context mContext>
	//   29   56:invokevirtual   #100 <Method PackageManager Context.getPackageManager()>
	//   30   59:astore          5
				android.graphics.drawable.Drawable drawable = ((android.graphics.drawable.Drawable) (obj));
	//   31   61:aload           4
	//   32   63:astore_2        
				if(mActivity != null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #66  <Field ComponentName mActivity>
	//*  35   68:ifnull          81
					try
					{
						drawable = packagemanager.getActivityIcon(mActivity);
	//   36   71:aload           5
	//   37   73:aload_0         
	//   38   74:getfield        #66  <Field ComponentName mActivity>
	//   39   77:invokevirtual   #106 <Method android.graphics.drawable.Drawable PackageManager.getActivityIcon(ComponentName)>
	//   40   80:astore_2        
					}
	//*  41   81:aload_2         
	//*  42   82:astore_3        
	//*  43   83:aload_2         
	//*  44   84:ifnonnull       100
	//*  45   87:aload_0         
	//*  46   88:getfield        #36  <Field Context mContext>
	//*  47   91:invokevirtual   #110 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  48   94:aload           5
	//*  49   96:invokevirtual   #116 <Method android.graphics.drawable.Drawable ApplicationInfo.loadIcon(PackageManager)>
	//*  50   99:astore_3        
	//*  51  100:aload_0         
	//*  52  101:getfield        #62  <Field IconCompat mIcon>
	//*  53  104:aload_1         
	//*  54  105:aload_3         
	//*  55  106:invokevirtual   #122 <Method void IconCompat.addToShortcutIntent(Intent, android.graphics.drawable.Drawable)>
	//*  56  109:aload_1         
	//*  57  110:areturn         
					catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  58  111:astore_2        
					{
						namenotfoundexception = ((android.content.pm.PackageManager.NameNotFoundException) (obj));
	//   59  112:aload           4
	//   60  114:astore_2        
					}
				drawable1 = drawable;
				if(drawable == null)
					drawable1 = mContext.getApplicationInfo().loadIcon(packagemanager);
			}
			mIcon.addToShortcutIntent(intent, drawable1);
		}
		return intent;
	//*  61  115:goto            81
	}

	public ComponentName getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ComponentName mActivity>
	//    2    4:areturn         
	}

	public CharSequence getDisabledMessage()
	{
		return mDisabledMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field CharSequence mDisabledMessage>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String mId>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		return mIntents[mIntents.length - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Intent[] mIntents>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Intent[] mIntents>
	//    4    8:arraylength     
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:aaload          
	//    8   12:areturn         
	}

	public Intent[] getIntents()
	{
		return (Intent[])Arrays.copyOf(((Object []) (mIntents)), mIntents.length);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Intent[] mIntents>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Intent[] mIntents>
	//    4    8:arraylength     
	//    5    9:invokestatic    #140 <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #141 <Class Intent[]>
	//    7   15:areturn         
	}

	public CharSequence getLongLabel()
	{
		return mLongLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field CharSequence mLongLabel>
	//    2    4:areturn         
	}

	public CharSequence getShortLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

	public ShortcutInfo toShortcutInfo()
	{
		android.content.pm.ShortcutInfo.Builder builder = (new android.content.pm.ShortcutInfo.Builder(mContext, mId)).setShortLabel(mLabel).setIntents(mIntents);
	//    0    0:new             #150 <Class android.content.pm.ShortcutInfo$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field String mId>
	//    6   12:invokespecial   #153 <Method void android.content.pm.ShortcutInfo$Builder(Context, String)>
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field CharSequence mLabel>
	//    9   19:invokevirtual   #157 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setShortLabel(CharSequence)>
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field Intent[] mIntents>
	//   12   26:invokevirtual   #161 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIntents(Intent[])>
	//   13   29:astore_1        
		if(mIcon != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #62  <Field IconCompat mIcon>
	//*  16   34:ifnull          49
			builder.setIcon(mIcon.toIcon());
	//   17   37:aload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #62  <Field IconCompat mIcon>
	//   20   42:invokevirtual   #165 <Method android.graphics.drawable.Icon IconCompat.toIcon()>
	//   21   45:invokevirtual   #169 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIcon(android.graphics.drawable.Icon)>
	//   22   48:pop             
		if(!TextUtils.isEmpty(mLongLabel))
	//*  23   49:aload_0         
	//*  24   50:getfield        #49  <Field CharSequence mLongLabel>
	//*  25   53:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   56:ifne            68
			builder.setLongLabel(mLongLabel);
	//   27   59:aload_1         
	//   28   60:aload_0         
	//   29   61:getfield        #49  <Field CharSequence mLongLabel>
	//   30   64:invokevirtual   #178 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setLongLabel(CharSequence)>
	//   31   67:pop             
		if(!TextUtils.isEmpty(mDisabledMessage))
	//*  32   68:aload_0         
	//*  33   69:getfield        #52  <Field CharSequence mDisabledMessage>
	//*  34   72:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   75:ifne            87
			builder.setDisabledMessage(mDisabledMessage);
	//   36   78:aload_1         
	//   37   79:aload_0         
	//   38   80:getfield        #52  <Field CharSequence mDisabledMessage>
	//   39   83:invokevirtual   #181 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setDisabledMessage(CharSequence)>
	//   40   86:pop             
		if(mActivity != null)
	//*  41   87:aload_0         
	//*  42   88:getfield        #66  <Field ComponentName mActivity>
	//*  43   91:ifnull          103
			builder.setActivity(mActivity);
	//   44   94:aload_1         
	//   45   95:aload_0         
	//   46   96:getfield        #66  <Field ComponentName mActivity>
	//   47   99:invokevirtual   #185 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setActivity(ComponentName)>
	//   48  102:pop             
		return builder.build();
	//   49  103:aload_1         
	//   50  104:invokevirtual   #188 <Method ShortcutInfo android.content.pm.ShortcutInfo$Builder.build()>
	//   51  107:areturn         
	}

	private ComponentName mActivity;
	private Context mContext;
	private CharSequence mDisabledMessage;
	private IconCompat mIcon;
	private String mId;
	private Intent mIntents[];
	private boolean mIsAlwaysBadged;
	private CharSequence mLabel;
	private CharSequence mLongLabel;


/*
	static Context access$102(ShortcutInfoCompat shortcutinfocompat, Context context)
	{
		shortcutinfocompat.mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Context mContext>
		return context;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$202(ShortcutInfoCompat shortcutinfocompat, String s)
	{
		shortcutinfocompat.mId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String mId>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CharSequence access$300(ShortcutInfoCompat shortcutinfocompat)
	{
		return shortcutinfocompat.mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

*/


/*
	static CharSequence access$302(ShortcutInfoCompat shortcutinfocompat, CharSequence charsequence)
	{
		shortcutinfocompat.mLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field CharSequence mLabel>
		return charsequence;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CharSequence access$402(ShortcutInfoCompat shortcutinfocompat, CharSequence charsequence)
	{
		shortcutinfocompat.mLongLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field CharSequence mLongLabel>
		return charsequence;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CharSequence access$502(ShortcutInfoCompat shortcutinfocompat, CharSequence charsequence)
	{
		shortcutinfocompat.mDisabledMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field CharSequence mDisabledMessage>
		return charsequence;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Intent[] access$600(ShortcutInfoCompat shortcutinfocompat)
	{
		return shortcutinfocompat.mIntents;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Intent[] mIntents>
	//    2    4:areturn         
	}

*/


/*
	static Intent[] access$602(ShortcutInfoCompat shortcutinfocompat, Intent aintent[])
	{
		shortcutinfocompat.mIntents = aintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Intent[] mIntents>
		return aintent;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static IconCompat access$702(ShortcutInfoCompat shortcutinfocompat, IconCompat iconcompat)
	{
		shortcutinfocompat.mIcon = iconcompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field IconCompat mIcon>
		return iconcompat;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ComponentName access$802(ShortcutInfoCompat shortcutinfocompat, ComponentName componentname)
	{
		shortcutinfocompat.mActivity = componentname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field ComponentName mActivity>
		return componentname;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$902(ShortcutInfoCompat shortcutinfocompat, boolean flag)
	{
		shortcutinfocompat.mIsAlwaysBadged = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean mIsAlwaysBadged>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
