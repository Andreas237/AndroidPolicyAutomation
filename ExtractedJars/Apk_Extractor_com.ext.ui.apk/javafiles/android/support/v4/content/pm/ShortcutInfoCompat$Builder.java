// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutInfoCompat

public static class ShortcutInfoCompat$Builder
{

	public ShortcutInfoCompat build()
	{
		if(TextUtils.isEmpty(ShortcutInfoCompat.access$300(mInfo)))
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
		if(ShortcutInfoCompat.access$600(mInfo) == null || ShortcutInfoCompat.access$600(mInfo).length == 0)
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

	public ShortcutInfoCompat$Builder setActivity(ComponentName componentname)
	{
		ShortcutInfoCompat.access$802(mInfo, componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #62  <Method ComponentName ShortcutInfoCompat.access$802(ShortcutInfoCompat, ComponentName)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShortcutInfoCompat$Builder setDisabledMessage(CharSequence charsequence)
	{
		ShortcutInfoCompat.access$502(mInfo, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #68  <Method CharSequence ShortcutInfoCompat.access$502(ShortcutInfoCompat, CharSequence)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShortcutInfoCompat$Builder setIcon(int i)
	{
		return setIcon(IconCompat.createWithResource(ShortcutInfoCompat.access$100(mInfo), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    3    5:invokestatic    #75  <Method Context ShortcutInfoCompat.access$100(ShortcutInfoCompat)>
	//    4    8:iload_1         
	//    5    9:invokestatic    #81  <Method IconCompat IconCompat.createWithResource(Context, int)>
	//    6   12:invokevirtual   #84  <Method ShortcutInfoCompat$Builder setIcon(IconCompat)>
	//    7   15:areturn         
	}

	public ShortcutInfoCompat$Builder setIcon(Bitmap bitmap)
	{
		return setIcon(IconCompat.createWithBitmap(bitmap));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #89  <Method IconCompat IconCompat.createWithBitmap(Bitmap)>
	//    3    5:invokevirtual   #84  <Method ShortcutInfoCompat$Builder setIcon(IconCompat)>
	//    4    8:areturn         
	}

	public ShortcutInfoCompat$Builder setIcon(IconCompat iconcompat)
	{
		ShortcutInfoCompat.access$702(mInfo, iconcompat);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #93  <Method IconCompat ShortcutInfoCompat.access$702(ShortcutInfoCompat, IconCompat)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShortcutInfoCompat$Builder setIntent(Intent intent)
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
	//    7    9:invokevirtual   #101 <Method ShortcutInfoCompat$Builder setIntents(Intent[])>
	//    8   12:areturn         
	}

	public ShortcutInfoCompat$Builder setIntents(Intent aintent[])
	{
		ShortcutInfoCompat.access$602(mInfo, aintent);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #105 <Method Intent[] ShortcutInfoCompat.access$602(ShortcutInfoCompat, Intent[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShortcutInfoCompat$Builder setLongLabel(CharSequence charsequence)
	{
		ShortcutInfoCompat.access$402(mInfo, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method CharSequence ShortcutInfoCompat.access$402(ShortcutInfoCompat, CharSequence)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShortcutInfoCompat$Builder setShortLabel(CharSequence charsequence)
	{
		ShortcutInfoCompat.access$302(mInfo, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:invokestatic    #113 <Method CharSequence ShortcutInfoCompat.access$302(ShortcutInfoCompat, CharSequence)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private final ShortcutInfoCompat mInfo = new ShortcutInfoCompat(((ShortcutInfoCompat._cls1) (null)));

	public ShortcutInfoCompat$Builder(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ShortcutInfoCompat>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #18  <Method void ShortcutInfoCompat(ShortcutInfoCompat$1)>
	//    7   13:putfield        #20  <Field ShortcutInfoCompat mInfo>
		ShortcutInfoCompat.access$102(mInfo, context);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//   10   20:aload_1         
	//   11   21:invokestatic    #24  <Method Context ShortcutInfoCompat.access$102(ShortcutInfoCompat, Context)>
	//   12   24:pop             
		ShortcutInfoCompat.access$202(mInfo, s);
	//   13   25:aload_0         
	//   14   26:getfield        #20  <Field ShortcutInfoCompat mInfo>
	//   15   29:aload_2         
	//   16   30:invokestatic    #28  <Method String ShortcutInfoCompat.access$202(ShortcutInfoCompat, String)>
	//   17   33:pop             
	//   18   34:return          
	}
}
