// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.text.TextUtils;

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
			if(mInfo.mIntents == null || mInfo.mIntents.length == 0)
		//*  10   23:aload_0         
		//*  11   24:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//*  12   27:invokestatic    #53  <Method Intent[] ShortcutInfoCompat.access$600(ShortcutInfoCompat)>
		//*  13   30:ifnull          44
		//*  14   33:aload_0         
		//*  15   34:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//*  16   37:invokestatic    #53  <Method Intent[] ShortcutInfoCompat.access$600(ShortcutInfoCompat)>
		//*  17   40:arraylength     
		//*  18   41:ifne            54
				throw new IllegalArgumentException("Shortcut much have an intent");
		//   19   44:new             #44  <Class IllegalArgumentException>
		//   20   47:dup             
		//   21   48:ldc1            #55  <String "Shortcut much have an intent">
		//   22   50:invokespecial   #49  <Method void IllegalArgumentException(String)>
		//   23   53:athrow          
			else
				return mInfo;
		//   24   54:aload_0         
		//   25   55:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//   26   58:areturn         
		}

		public Builder setActivity(ComponentName componentname)
		{
			mInfo.mActivity = componentname;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #62  <Method ComponentName ShortcutInfoCompat.access$902(ShortcutInfoCompat, ComponentName)>
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
		//    3    5:invokestatic    #68  <Method CharSequence ShortcutInfoCompat.access$502(ShortcutInfoCompat, CharSequence)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setIcon(int i)
		{
			mInfo.mIconId = i;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:iload_1         
		//    3    5:invokestatic    #75  <Method int ShortcutInfoCompat.access$802(ShortcutInfoCompat, int)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setIcon(Bitmap bitmap)
		{
			mInfo.mIconBitmap = bitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
		//    2    4:aload_1         
		//    3    5:invokestatic    #80  <Method Bitmap ShortcutInfoCompat.access$702(ShortcutInfoCompat, Bitmap)>
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
	//    1    1:ldc1            #74  <String "android.intent.extra.shortcut.INTENT">
	//    2    3:aload_0         
	//    3    4:getfield        #56  <Field Intent[] mIntents>
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field Intent[] mIntents>
	//    6   11:arraylength     
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:aaload          
	//   10   15:invokevirtual   #80  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   11   18:ldc1            #82  <String "android.intent.extra.shortcut.NAME">
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field CharSequence mLabel>
	//   14   24:invokeinterface #88  <Method String CharSequence.toString()>
	//   15   29:invokevirtual   #91  <Method Intent Intent.putExtra(String, String)>
	//   16   32:pop             
		if(mIconId != 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #66  <Field int mIconId>
	//*  19   37:ifeq            58
			intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ((android.os.Parcelable) (android.content.Intent.ShortcutIconResource.fromContext(mContext, mIconId))));
	//   20   40:aload_1         
	//   21   41:ldc1            #93  <String "android.intent.extra.shortcut.ICON_RESOURCE">
	//   22   43:aload_0         
	//   23   44:getfield        #36  <Field Context mContext>
	//   24   47:aload_0         
	//   25   48:getfield        #66  <Field int mIconId>
	//   26   51:invokestatic    #99  <Method android.content.Intent$ShortcutIconResource android.content.Intent$ShortcutIconResource.fromContext(Context, int)>
	//   27   54:invokevirtual   #80  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   28   57:pop             
		if(mIconBitmap != null)
	//*  29   58:aload_0         
	//*  30   59:getfield        #62  <Field Bitmap mIconBitmap>
	//*  31   62:ifnull          76
			intent.putExtra("android.intent.extra.shortcut.ICON", ((android.os.Parcelable) (mIconBitmap)));
	//   32   65:aload_1         
	//   33   66:ldc1            #101 <String "android.intent.extra.shortcut.ICON">
	//   34   68:aload_0         
	//   35   69:getfield        #62  <Field Bitmap mIconBitmap>
	//   36   72:invokevirtual   #80  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   37   75:pop             
		return intent;
	//   38   76:aload_1         
	//   39   77:areturn         
	}

	ShortcutInfo toShortcutInfo()
	{
		android.content.pm.ShortcutInfo.Builder builder = (new android.content.pm.ShortcutInfo.Builder(mContext, mId)).setShortLabel(mLabel).setIntents(mIntents);
	//    0    0:new             #108 <Class android.content.pm.ShortcutInfo$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field String mId>
	//    6   12:invokespecial   #111 <Method void android.content.pm.ShortcutInfo$Builder(Context, String)>
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field CharSequence mLabel>
	//    9   19:invokevirtual   #115 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setShortLabel(CharSequence)>
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field Intent[] mIntents>
	//   12   26:invokevirtual   #119 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIntents(Intent[])>
	//   13   29:astore_1        
		if(mIconId != 0)
	//*  14   30:aload_0         
	//*  15   31:getfield        #66  <Field int mIconId>
	//*  16   34:ifeq            56
			builder.setIcon(Icon.createWithResource(mContext, mIconId));
	//   17   37:aload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field Context mContext>
	//   20   42:aload_0         
	//   21   43:getfield        #66  <Field int mIconId>
	//   22   46:invokestatic    #125 <Method Icon Icon.createWithResource(Context, int)>
	//   23   49:invokevirtual   #129 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIcon(Icon)>
	//   24   52:pop             
		else
	//*  25   53:goto            75
		if(mIconBitmap != null)
	//*  26   56:aload_0         
	//*  27   57:getfield        #62  <Field Bitmap mIconBitmap>
	//*  28   60:ifnull          75
			builder.setIcon(Icon.createWithBitmap(mIconBitmap));
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:getfield        #62  <Field Bitmap mIconBitmap>
	//   32   68:invokestatic    #133 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   33   71:invokevirtual   #129 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setIcon(Icon)>
	//   34   74:pop             
		if(!TextUtils.isEmpty(mLongLabel))
	//*  35   75:aload_0         
	//*  36   76:getfield        #49  <Field CharSequence mLongLabel>
	//*  37   79:invokestatic    #139 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   82:ifne            94
			builder.setLongLabel(mLongLabel);
	//   39   85:aload_1         
	//   40   86:aload_0         
	//   41   87:getfield        #49  <Field CharSequence mLongLabel>
	//   42   90:invokevirtual   #142 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setLongLabel(CharSequence)>
	//   43   93:pop             
		if(!TextUtils.isEmpty(mDisabledMessage))
	//*  44   94:aload_0         
	//*  45   95:getfield        #52  <Field CharSequence mDisabledMessage>
	//*  46   98:invokestatic    #139 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47  101:ifne            113
			builder.setDisabledMessage(mDisabledMessage);
	//   48  104:aload_1         
	//   49  105:aload_0         
	//   50  106:getfield        #52  <Field CharSequence mDisabledMessage>
	//   51  109:invokevirtual   #145 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setDisabledMessage(CharSequence)>
	//   52  112:pop             
		if(mActivity != null)
	//*  53  113:aload_0         
	//*  54  114:getfield        #70  <Field ComponentName mActivity>
	//*  55  117:ifnull          129
			builder.setActivity(mActivity);
	//   56  120:aload_1         
	//   57  121:aload_0         
	//   58  122:getfield        #70  <Field ComponentName mActivity>
	//   59  125:invokevirtual   #149 <Method android.content.pm.ShortcutInfo$Builder android.content.pm.ShortcutInfo$Builder.setActivity(ComponentName)>
	//   60  128:pop             
		return builder.build();
	//   61  129:aload_1         
	//   62  130:invokevirtual   #152 <Method ShortcutInfo android.content.pm.ShortcutInfo$Builder.build()>
	//   63  133:areturn         
	}

	private ComponentName mActivity;
	private Context mContext;
	private CharSequence mDisabledMessage;
	private Bitmap mIconBitmap;
	private int mIconId;
	private String mId;
	private Intent mIntents[];
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
	static Bitmap access$702(ShortcutInfoCompat shortcutinfocompat, Bitmap bitmap)
	{
		shortcutinfocompat.mIconBitmap = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Bitmap mIconBitmap>
		return bitmap;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$802(ShortcutInfoCompat shortcutinfocompat, int i)
	{
		shortcutinfocompat.mIconId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int mIconId>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static ComponentName access$902(ShortcutInfoCompat shortcutinfocompat, ComponentName componentname)
	{
		shortcutinfocompat.mActivity = componentname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field ComponentName mActivity>
		return componentname;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
