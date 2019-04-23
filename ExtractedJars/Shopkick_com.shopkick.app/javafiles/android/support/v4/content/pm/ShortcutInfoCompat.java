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
			if(!TextUtils.isEmpty(mInfo.mLabel))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//*   2    4:getfield        #34  <Field CharSequence ShortcutInfoCompat.mLabel>
		//*   3    7:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   4   10:ifne            49
			{
				if(mInfo.mIntents != null && mInfo.mIntents.length != 0)
		//*   5   13:aload_0         
		//*   6   14:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//*   7   17:getfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
		//*   8   20:ifnull          39
		//*   9   23:aload_0         
		//*  10   24:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//*  11   27:getfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
		//*  12   30:arraylength     
		//*  13   31:ifeq            39
					return mInfo;
		//   14   34:aload_0         
		//   15   35:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//   16   38:areturn         
				else
					throw new IllegalArgumentException("Shortcut must have an intent");
		//   17   39:new             #46  <Class IllegalArgumentException>
		//   18   42:dup             
		//   19   43:ldc1            #48  <String "Shortcut must have an intent">
		//   20   45:invokespecial   #51  <Method void IllegalArgumentException(String)>
		//   21   48:athrow          
			} else
			{
				throw new IllegalArgumentException("Shortcut must have a non-empty label");
		//   22   49:new             #46  <Class IllegalArgumentException>
		//   23   52:dup             
		//   24   53:ldc1            #53  <String "Shortcut must have a non-empty label">
		//   25   55:invokespecial   #51  <Method void IllegalArgumentException(String)>
		//   26   58:athrow          
			}
		}

		public Builder setActivity(ComponentName componentname)
		{
			mInfo.mActivity = componentname;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #60  <Field ComponentName ShortcutInfoCompat.mActivity>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setAlwaysBadged()
		{
			mInfo.mIsAlwaysBadged = true;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:iconst_1        
		//    3    5:putfield        #66  <Field boolean ShortcutInfoCompat.mIsAlwaysBadged>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setDisabledMessage(CharSequence charsequence)
		{
			mInfo.mDisabledMessage = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #71  <Field CharSequence ShortcutInfoCompat.mDisabledMessage>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setIcon(IconCompat iconcompat)
		{
			mInfo.mIcon = iconcompat;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #77  <Field IconCompat ShortcutInfoCompat.mIcon>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
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
		//    7    9:invokevirtual   #85  <Method ShortcutInfoCompat$Builder setIntents(Intent[])>
		//    8   12:areturn         
		}

		public Builder setIntents(Intent aintent[])
		{
			mInfo.mIntents = aintent;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setLongLabel(CharSequence charsequence)
		{
			mInfo.mLongLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #89  <Field CharSequence ShortcutInfoCompat.mLongLabel>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setShortLabel(CharSequence charsequence)
		{
			mInfo.mLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:putfield        #34  <Field CharSequence ShortcutInfoCompat.mLabel>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final ShortcutInfoCompat mInfo = new ShortcutInfoCompat();

		public Builder(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #6   <Class ShortcutInfoCompat>
		//    4    8:dup             
		//    5    9:invokespecial   #16  <Method void ShortcutInfoCompat()>
		//    6   12:putfield        #18  <Field ShortcutInfoCompat mInfo>
			ShortcutInfoCompat shortcutinfocompat = mInfo;
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field ShortcutInfoCompat mInfo>
		//    9   19:astore_3        
			shortcutinfocompat.mContext = context;
		//   10   20:aload_3         
		//   11   21:aload_1         
		//   12   22:putfield        #22  <Field Context ShortcutInfoCompat.mContext>
			shortcutinfocompat.mId = s;
		//   13   25:aload_3         
		//   14   26:aload_2         
		//   15   27:putfield        #26  <Field String ShortcutInfoCompat.mId>
		//   16   30:return          
		}
	}


	ShortcutInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	Intent addToIntent(Intent intent)
	{
		Intent aintent[] = mIntents;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Intent[] mIntents>
	//    2    4:astore_2        
		intent.putExtra("android.intent.extra.shortcut.INTENT", ((android.os.Parcelable) (aintent[aintent.length - 1]))).putExtra("android.intent.extra.shortcut.NAME", mLabel.toString());
	//    3    5:aload_1         
	//    4    6:ldc1            #36  <String "android.intent.extra.shortcut.INTENT">
	//    5    8:aload_2         
	//    6    9:aload_2         
	//    7   10:arraylength     
	//    8   11:iconst_1        
	//    9   12:isub            
	//   10   13:aaload          
	//   11   14:invokevirtual   #42  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   12   17:ldc1            #44  <String "android.intent.extra.shortcut.NAME">
	//   13   19:aload_0         
	//   14   20:getfield        #46  <Field CharSequence mLabel>
	//   15   23:invokeinterface #52  <Method String CharSequence.toString()>
	//   16   28:invokevirtual   #55  <Method Intent Intent.putExtra(String, String)>
	//   17   31:pop             
		if(mIcon != null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #57  <Field IconCompat mIcon>
	//*  20   36:ifnull          111
		{
			Object obj = null;
	//   21   39:aconst_null     
	//   22   40:astore_3        
			Object obj1 = null;
	//   23   41:aconst_null     
	//   24   42:astore          4
			if(mIsAlwaysBadged)
	//*  25   44:aload_0         
	//*  26   45:getfield        #59  <Field boolean mIsAlwaysBadged>
	//*  27   48:ifeq            98
			{
				PackageManager packagemanager = mContext.getPackageManager();
	//   28   51:aload_0         
	//   29   52:getfield        #61  <Field Context mContext>
	//   30   55:invokevirtual   #67  <Method PackageManager Context.getPackageManager()>
	//   31   58:astore          5
				obj = ((Object) (mActivity));
	//   32   60:aload_0         
	//   33   61:getfield        #69  <Field ComponentName mActivity>
	//   34   64:astore_3        
				android.graphics.drawable.Drawable drawable = ((android.graphics.drawable.Drawable) (obj1));
	//   35   65:aload           4
	//   36   67:astore_2        
				if(obj != null)
	//*  37   68:aload_3         
	//*  38   69:ifnull          79
					try
					{
						drawable = packagemanager.getActivityIcon(((ComponentName) (obj)));
	//   39   72:aload           5
	//   40   74:aload_3         
	//   41   75:invokevirtual   #75  <Method android.graphics.drawable.Drawable PackageManager.getActivityIcon(ComponentName)>
	//   42   78:astore_2        
					}
	//*  43   79:aload_2         
	//*  44   80:astore_3        
	//*  45   81:aload_2         
	//*  46   82:ifnonnull       98
	//*  47   85:aload_0         
	//*  48   86:getfield        #61  <Field Context mContext>
	//*  49   89:invokevirtual   #79  <Method ApplicationInfo Context.getApplicationInfo()>
	//*  50   92:aload           5
	//*  51   94:invokevirtual   #85  <Method android.graphics.drawable.Drawable ApplicationInfo.loadIcon(PackageManager)>
	//*  52   97:astore_3        
	//*  53   98:aload_0         
	//*  54   99:getfield        #57  <Field IconCompat mIcon>
	//*  55  102:aload_1         
	//*  56  103:aload_3         
	//*  57  104:aload_0         
	//*  58  105:getfield        #61  <Field Context mContext>
	//*  59  108:invokevirtual   #91  <Method void IconCompat.addToShortcutIntent(Intent, android.graphics.drawable.Drawable, Context)>
	//*  60  111:aload_1         
	//*  61  112:areturn         
					catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  62  113:astore_2        
					{
						namenotfoundexception = ((android.content.pm.PackageManager.NameNotFoundException) (obj1));
	//   63  114:aload           4
	//   64  116:astore_2        
					}
				obj = ((Object) (drawable));
				if(drawable == null)
					obj = ((Object) (mContext.getApplicationInfo().loadIcon(packagemanager)));
			}
			mIcon.addToShortcutIntent(intent, ((android.graphics.drawable.Drawable) (obj)), mContext);
		}
		return intent;
	//*  65  117:goto            79
	}

	public ComponentName getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ComponentName mActivity>
	//    2    4:areturn         
	}

	public CharSequence getDisabledMessage()
	{
		return mDisabledMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CharSequence mDisabledMessage>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String mId>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		Intent aintent[] = mIntents;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Intent[] mIntents>
	//    2    4:astore_1        
		return aintent[aintent.length - 1];
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:iconst_1        
	//    7    9:isub            
	//    8   10:aaload          
	//    9   11:areturn         
	}

	public Intent[] getIntents()
	{
		Intent aintent[] = mIntents;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Intent[] mIntents>
	//    2    4:astore_1        
		return (Intent[])Arrays.copyOf(((Object []) (aintent)), aintent.length);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #113 <Method Object[] Arrays.copyOf(Object[], int)>
	//    7   11:checkcast       #114 <Class Intent[]>
	//    8   14:areturn         
	}

	public CharSequence getLongLabel()
	{
		return mLongLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field CharSequence mLongLabel>
	//    2    4:areturn         
	}

	public CharSequence getShortLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

	public ShortcutInfo toShortcutInfo()
	{
		android.content.pm.ShortcutInfo.Builder builder = (new android.content.pm.ShortcutInfo.Builder(mContext, mId)).setShortLabel(mLabel).setIntents(mIntents);
	//    0    0:new             #125 <Class android.content.pm.ShortcutInfo$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field String mId>
	//    6   12:invokespecial   #128 <Method void android.content.pm.ShortcutInfo$Builder(Context, String)>
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field CharSequence mLabel>
	//    9   19:invokevirtual   #132 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setShortLabel(CharSequence)>
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field Intent[] mIntents>
	//   12   26:invokevirtual   #136 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIntents(Intent[])>
	//   13   29:astore_1        
		Object obj = ((Object) (mIcon));
	//   14   30:aload_0         
	//   15   31:getfield        #57  <Field IconCompat mIcon>
	//   16   34:astore_2        
		if(obj != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          48
			builder.setIcon(((IconCompat) (obj)).toIcon());
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #140 <Method android.graphics.drawable.Icon IconCompat.toIcon()>
	//   22   44:invokevirtual   #144 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIcon(android.graphics.drawable.Icon)>
	//   23   47:pop             
		if(!TextUtils.isEmpty(mLongLabel))
	//*  24   48:aload_0         
	//*  25   49:getfield        #117 <Field CharSequence mLongLabel>
	//*  26   52:invokestatic    #150 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   55:ifne            67
			builder.setLongLabel(mLongLabel);
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #117 <Field CharSequence mLongLabel>
	//   31   63:invokevirtual   #153 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setLongLabel(CharSequence)>
	//   32   66:pop             
		if(!TextUtils.isEmpty(mDisabledMessage))
	//*  33   67:aload_0         
	//*  34   68:getfield        #99  <Field CharSequence mDisabledMessage>
	//*  35   71:invokestatic    #150 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   74:ifne            86
			builder.setDisabledMessage(mDisabledMessage);
	//   37   77:aload_1         
	//   38   78:aload_0         
	//   39   79:getfield        #99  <Field CharSequence mDisabledMessage>
	//   40   82:invokevirtual   #156 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setDisabledMessage(CharSequence)>
	//   41   85:pop             
		obj = ((Object) (mActivity));
	//   42   86:aload_0         
	//   43   87:getfield        #69  <Field ComponentName mActivity>
	//   44   90:astore_2        
		if(obj != null)
	//*  45   91:aload_2         
	//*  46   92:ifnull          101
			builder.setActivity(((ComponentName) (obj)));
	//   47   95:aload_1         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #160 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setActivity(ComponentName)>
	//   50  100:pop             
		return builder.build();
	//   51  101:aload_1         
	//   52  102:invokevirtual   #163 <Method ShortcutInfo android.content.pm.ShortcutInfo$Builder.build()>
	//   53  105:areturn         
	}

	ComponentName mActivity;
	Context mContext;
	CharSequence mDisabledMessage;
	IconCompat mIcon;
	String mId;
	Intent mIntents[];
	boolean mIsAlwaysBadged;
	CharSequence mLabel;
	CharSequence mLongLabel;
}
