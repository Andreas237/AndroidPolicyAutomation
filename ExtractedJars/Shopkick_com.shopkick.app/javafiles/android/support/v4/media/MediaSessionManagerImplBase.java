// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.util.ObjectsCompat;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManager

class MediaSessionManagerImplBase
	implements MediaSessionManager.MediaSessionManagerImpl
{
	static class RemoteUserInfoImplBase
		implements MediaSessionManager.RemoteUserInfoImpl
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof RemoteUserInfoImplBase))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((RemoteUserInfoImplBase)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
		//   12   20:astore_1        
			return TextUtils.equals(((CharSequence) (mPackageName)), ((CharSequence) (((RemoteUserInfoImplBase) (obj)).mPackageName))) && mPid == ((RemoteUserInfoImplBase) (obj)).mPid && mUid == ((RemoteUserInfoImplBase) (obj)).mUid;
		//   13   21:aload_0         
		//   14   22:getfield        #21  <Field String mPackageName>
		//   15   25:aload_1         
		//   16   26:getfield        #21  <Field String mPackageName>
		//   17   29:invokestatic    #33  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//   18   32:ifeq            59
		//   19   35:aload_0         
		//   20   36:getfield        #23  <Field int mPid>
		//   21   39:aload_1         
		//   22   40:getfield        #23  <Field int mPid>
		//   23   43:icmpne          59
		//   24   46:aload_0         
		//   25   47:getfield        #25  <Field int mUid>
		//   26   50:aload_1         
		//   27   51:getfield        #25  <Field int mUid>
		//   28   54:icmpne          59
		//   29   57:iconst_1        
		//   30   58:ireturn         
		//   31   59:iconst_0        
		//   32   60:ireturn         
		}

		public String getPackageName()
		{
			return mPackageName;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String mPackageName>
		//    2    4:areturn         
		}

		public int getPid()
		{
			return mPid;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int mPid>
		//    2    4:ireturn         
		}

		public int getUid()
		{
			return mUid;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int mUid>
		//    2    4:ireturn         
		}

		public int hashCode()
		{
			return ObjectsCompat.hash(new Object[] {
				mPackageName, Integer.valueOf(mPid), Integer.valueOf(mUid)
			});
		//    0    0:iconst_3        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #21  <Field String mPackageName>
		//    6   10:aastore         
		//    7   11:dup             
		//    8   12:iconst_1        
		//    9   13:aload_0         
		//   10   14:getfield        #23  <Field int mPid>
		//   11   17:invokestatic    #45  <Method Integer Integer.valueOf(int)>
		//   12   20:aastore         
		//   13   21:dup             
		//   14   22:iconst_2        
		//   15   23:aload_0         
		//   16   24:getfield        #25  <Field int mUid>
		//   17   27:invokestatic    #45  <Method Integer Integer.valueOf(int)>
		//   18   30:aastore         
		//   19   31:invokestatic    #51  <Method int ObjectsCompat.hash(Object[])>
		//   20   34:ireturn         
		}

		private String mPackageName;
		private int mPid;
		private int mUid;

		RemoteUserInfoImplBase(String s, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mPackageName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String mPackageName>
			mPid = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int mPid>
			mUid = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int mUid>
		//   11   19:return          
		}
	}


	MediaSessionManagerImplBase(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Context mContext>
		mContentResolver = mContext.getContentResolver();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field Context mContext>
	//    8   14:invokevirtual   #48  <Method ContentResolver Context.getContentResolver()>
	//    9   17:putfield        #50  <Field ContentResolver mContentResolver>
	//   10   20:return          
	}

	private boolean isPermissionGranted(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl, String s)
	{
		if(remoteuserinfoimpl.getPid() < 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #58  <Method int MediaSessionManager$RemoteUserInfoImpl.getPid()>
	//*   2    6:ifge            33
			return mContext.getPackageManager().checkPermission(s, remoteuserinfoimpl.getPackageName()) == 0;
	//    3    9:aload_0         
	//    4   10:getfield        #42  <Field Context mContext>
	//    5   13:invokevirtual   #62  <Method PackageManager Context.getPackageManager()>
	//    6   16:aload_2         
	//    7   17:aload_1         
	//    8   18:invokeinterface #66  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//    9   23:invokevirtual   #72  <Method int PackageManager.checkPermission(String, String)>
	//   10   26:ifne            31
	//   11   29:iconst_1        
	//   12   30:ireturn         
	//   13   31:iconst_0        
	//   14   32:ireturn         
		return mContext.checkPermission(s, remoteuserinfoimpl.getPid(), remoteuserinfoimpl.getUid()) == 0;
	//   15   33:aload_0         
	//   16   34:getfield        #42  <Field Context mContext>
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokeinterface #58  <Method int MediaSessionManager$RemoteUserInfoImpl.getPid()>
	//   20   44:aload_1         
	//   21   45:invokeinterface #75  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//   22   50:invokevirtual   #78  <Method int Context.checkPermission(String, int, int)>
	//   23   53:ifne            58
	//   24   56:iconst_1        
	//   25   57:ireturn         
	//   26   58:iconst_0        
	//   27   59:ireturn         
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Context mContext>
	//    2    4:areturn         
	}

	boolean isEnabledNotificationListener(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl)
	{
		String s = android.provider.Settings.Secure.getString(mContentResolver, "enabled_notification_listeners");
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ContentResolver mContentResolver>
	//    2    4:ldc1            #15  <String "enabled_notification_listeners">
	//    3    6:invokestatic    #89  <Method String android.provider.Settings$Secure.getString(ContentResolver, String)>
	//    4    9:astore_3        
		if(s != null)
	//*   5   10:aload_3         
	//*   6   11:ifnull          68
		{
			String as[] = s.split(":");
	//    7   14:aload_3         
	//    8   15:ldc1            #91  <String ":">
	//    9   17:invokevirtual   #97  <Method String[] String.split(String)>
	//   10   20:astore_3        
			for(int i = 0; i < as.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:aload_3         
	//*  15   25:arraylength     
	//*  16   26:icmpge          68
			{
				ComponentName componentname = ComponentName.unflattenFromString(as[i]);
	//   17   29:aload_3         
	//   18   30:iload_2         
	//   19   31:aaload          
	//   20   32:invokestatic    #103 <Method ComponentName ComponentName.unflattenFromString(String)>
	//   21   35:astore          4
				if(componentname != null && componentname.getPackageName().equals(((Object) (remoteuserinfoimpl.getPackageName()))))
	//*  22   37:aload           4
	//*  23   39:ifnull          61
	//*  24   42:aload           4
	//*  25   44:invokevirtual   #104 <Method String ComponentName.getPackageName()>
	//*  26   47:aload_1         
	//*  27   48:invokeinterface #66  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//*  28   53:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*  29   56:ifeq            61
					return true;
	//   30   59:iconst_1        
	//   31   60:ireturn         
			}

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
		}
	//*  36   65:goto            23
		return false;
	//   37   68:iconst_0        
	//   38   69:ireturn         
	}

	public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl)
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		Object obj;
		try
		{
			obj = ((Object) (mContext.getPackageManager().getApplicationInfo(remoteuserinfoimpl.getPackageName(), 0)));
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field Context mContext>
	//    4    6:invokevirtual   #62  <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_1         
	//    6   10:invokeinterface #66  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #116 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_3        
		}
	//*  10   20:aload_3         
	//*  11   21:getfield        #122 <Field int ApplicationInfo.uid>
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #75  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//*  14   30:icmpeq          95
	//*  15   33:getstatic       #35  <Field boolean DEBUG>
	//*  16   36:ifeq            93
	//*  17   39:new             #124 <Class StringBuilder>
	//*  18   42:dup             
	//*  19   43:invokespecial   #125 <Method void StringBuilder()>
	//*  20   46:astore_3        
	//*  21   47:aload_3         
	//*  22   48:ldc1            #127 <String "Package name ">
	//*  23   50:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  24   53:pop             
	//*  25   54:aload_3         
	//*  26   55:aload_1         
	//*  27   56:invokeinterface #66  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//*  28   61:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  29   64:pop             
	//*  30   65:aload_3         
	//*  31   66:ldc1            #133 <String " doesn't match with the uid ">
	//*  32   68:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  33   71:pop             
	//*  34   72:aload_3         
	//*  35   73:aload_1         
	//*  36   74:invokeinterface #75  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//*  37   79:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//*  38   82:pop             
	//*  39   83:ldc1            #24  <String "MediaSessionManager">
	//*  40   85:aload_3         
	//*  41   86:invokevirtual   #139 <Method String StringBuilder.toString()>
	//*  42   89:invokestatic    #144 <Method int Log.d(String, String)>
	//*  43   92:pop             
	//*  44   93:iconst_0        
	//*  45   94:ireturn         
	//*  46   95:aload_0         
	//*  47   96:aload_1         
	//*  48   97:ldc1            #21  <String "android.permission.STATUS_BAR_SERVICE">
	//*  49   99:invokespecial   #146 <Method boolean isPermissionGranted(MediaSessionManager$RemoteUserInfoImpl, String)>
	//*  50  102:ifne            135
	//*  51  105:aload_0         
	//*  52  106:aload_1         
	//*  53  107:ldc1            #18  <String "android.permission.MEDIA_CONTENT_CONTROL">
	//*  54  109:invokespecial   #146 <Method boolean isPermissionGranted(MediaSessionManager$RemoteUserInfoImpl, String)>
	//*  55  112:ifne            135
	//*  56  115:aload_1         
	//*  57  116:invokeinterface #75  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//*  58  121:sipush          1000
	//*  59  124:icmpeq          135
	//*  60  127:aload_0         
	//*  61  128:aload_1         
	//*  62  129:invokevirtual   #148 <Method boolean isEnabledNotificationListener(MediaSessionManager$RemoteUserInfoImpl)>
	//*  63  132:ifeq            137
	//*  64  135:iconst_1        
	//*  65  136:istore_2        
	//*  66  137:iload_2         
	//*  67  138:ireturn         
	//*  68  139:getstatic       #35  <Field boolean DEBUG>
	//*  69  142:ifeq            188
	//*  70  145:new             #124 <Class StringBuilder>
	//*  71  148:dup             
	//*  72  149:invokespecial   #125 <Method void StringBuilder()>
	//*  73  152:astore_3        
	//*  74  153:aload_3         
	//*  75  154:ldc1            #150 <String "Package ">
	//*  76  156:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  77  159:pop             
	//*  78  160:aload_3         
	//*  79  161:aload_1         
	//*  80  162:invokeinterface #66  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//*  81  167:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  82  170:pop             
	//*  83  171:aload_3         
	//*  84  172:ldc1            #152 <String " doesn't exist">
	//*  85  174:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  86  177:pop             
	//*  87  178:ldc1            #24  <String "MediaSessionManager">
	//*  88  180:aload_3         
	//*  89  181:invokevirtual   #139 <Method String StringBuilder.toString()>
	//*  90  184:invokestatic    #144 <Method int Log.d(String, String)>
	//*  91  187:pop             
	//*  92  188:iconst_0        
	//*  93  189:ireturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			if(DEBUG)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Package ");
				((StringBuilder) (obj)).append(remoteuserinfoimpl.getPackageName());
				((StringBuilder) (obj)).append(" doesn't exist");
				Log.d("MediaSessionManager", ((StringBuilder) (obj)).toString());
			}
			return false;
		}
		if(((ApplicationInfo) (obj)).uid != remoteuserinfoimpl.getUid())
		{
			if(DEBUG)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Package name ");
				((StringBuilder) (obj)).append(remoteuserinfoimpl.getPackageName());
				((StringBuilder) (obj)).append(" doesn't match with the uid ");
				((StringBuilder) (obj)).append(remoteuserinfoimpl.getUid());
				Log.d("MediaSessionManager", ((StringBuilder) (obj)).toString());
			}
			return false;
		}
		if(isPermissionGranted(remoteuserinfoimpl, "android.permission.STATUS_BAR_SERVICE") || isPermissionGranted(remoteuserinfoimpl, "android.permission.MEDIA_CONTENT_CONTROL") || remoteuserinfoimpl.getUid() == 1000 || isEnabledNotificationListener(remoteuserinfoimpl))
			flag = true;
		return flag;
	//*  94  190:astore_3        
	//*  95  191:goto            139
	}

	private static final boolean DEBUG;
	private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
	private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
	private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
	private static final String TAG = "MediaSessionManager";
	ContentResolver mContentResolver;
	Context mContext;

	static 
	{
		DEBUG = MediaSessionManager.DEBUG;
	//    0    0:getstatic       #34  <Field boolean MediaSessionManager.DEBUG>
	//    1    3:putstatic       #35  <Field boolean DEBUG>
	//*   2    6:return          
	}
}
