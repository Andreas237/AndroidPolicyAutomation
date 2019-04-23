// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

class NotificationCompatJellybean
{

	private NotificationCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
	//    2    4:return          
	}

	public static SparseArray buildActionExtrasMap(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #89  <Method int List.size()>
	//    2    6:istore_2        
		SparseArray sparsearray = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		for(int i = 0; i < j;)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          70
		{
			Bundle bundle = (Bundle)list.get(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokeinterface #93  <Method Object List.get(int)>
	//   13   23:checkcast       #95  <Class Bundle>
	//   14   26:astore          5
			SparseArray sparsearray1 = sparsearray;
	//   15   28:aload_3         
	//   16   29:astore          4
			if(bundle != null)
	//*  17   31:aload           5
	//*  18   33:ifnull          60
			{
				sparsearray1 = sparsearray;
	//   19   36:aload_3         
	//   20   37:astore          4
				if(sparsearray == null)
	//*  21   39:aload_3         
	//*  22   40:ifnonnull       52
					sparsearray1 = new SparseArray();
	//   23   43:new             #97  <Class SparseArray>
	//   24   46:dup             
	//   25   47:invokespecial   #98  <Method void SparseArray()>
	//   26   50:astore          4
				sparsearray1.put(i, ((Object) (bundle)));
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aload           5
	//   30   57:invokevirtual   #102 <Method void SparseArray.put(int, Object)>
			}
			i++;
	//   31   60:iload_1         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore_1        
			sparsearray = sparsearray1;
	//   35   64:aload           4
	//   36   66:astore_3        
		}

	//*  37   67:goto            11
		return sparsearray;
	//   38   70:aload_3         
	//   39   71:areturn         
	}

	private static boolean ensureActionReflectionReadyLocked()
	{
		if(sActionsAccessFailed)
	//*   0    0:getstatic       #112 <Field boolean sActionsAccessFailed>
	//*   1    3:ifeq            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		try
		{
			if(sActionsField == null)
	//*   4    8:getstatic       #114 <Field Field sActionsField>
	//*   5   11:ifnonnull       106
			{
				sActionClass = Class.forName("android.app.Notification$Action");
	//    6   14:ldc1            #116 <String "android.app.Notification$Action">
	//    7   16:invokestatic    #122 <Method Class Class.forName(String)>
	//    8   19:putstatic       #124 <Field Class sActionClass>
				sActionIconField = sActionClass.getDeclaredField("icon");
	//    9   22:getstatic       #124 <Field Class sActionClass>
	//   10   25:ldc1            #35  <String "icon">
	//   11   27:invokevirtual   #128 <Method Field Class.getDeclaredField(String)>
	//   12   30:putstatic       #130 <Field Field sActionIconField>
				sActionTitleField = sActionClass.getDeclaredField("title");
	//   13   33:getstatic       #124 <Field Class sActionClass>
	//   14   36:ldc1            #53  <String "title">
	//   15   38:invokevirtual   #128 <Method Field Class.getDeclaredField(String)>
	//   16   41:putstatic       #132 <Field Field sActionTitleField>
				sActionIntentField = sActionClass.getDeclaredField("actionIntent");
	//   17   44:getstatic       #124 <Field Class sActionClass>
	//   18   47:ldc1            #17  <String "actionIntent">
	//   19   49:invokevirtual   #128 <Method Field Class.getDeclaredField(String)>
	//   20   52:putstatic       #134 <Field Field sActionIntentField>
				sActionsField = ((Class) (android/app/Notification)).getDeclaredField("actions");
	//   21   55:ldc1            #136 <Class Notification>
	//   22   57:ldc1            #138 <String "actions">
	//   23   59:invokevirtual   #128 <Method Field Class.getDeclaredField(String)>
	//   24   62:putstatic       #114 <Field Field sActionsField>
				sActionsField.setAccessible(true);
	//   25   65:getstatic       #114 <Field Field sActionsField>
	//   26   68:iconst_1        
	//   27   69:invokevirtual   #144 <Method void Field.setAccessible(boolean)>
			}
		}
	//*  28   72:goto            106
	//*  29   75:astore_0        
	//*  30   76:ldc1            #56  <String "NotificationCompat">
	//*  31   78:ldc1            #146 <String "Unable to access notification actions">
	//*  32   80:aload_0         
	//*  33   81:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//*  34   84:pop             
	//*  35   85:iconst_1        
	//*  36   86:putstatic       #112 <Field boolean sActionsAccessFailed>
	//*  37   89:goto            106
		catch(ClassNotFoundException classnotfoundexception)
	//*  38   92:astore_0        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (classnotfoundexception)));
	//   39   93:ldc1            #56  <String "NotificationCompat">
	//   40   95:ldc1            #146 <String "Unable to access notification actions">
	//   41   97:aload_0         
	//   42   98:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//   43  101:pop             
			sActionsAccessFailed = true;
	//   44  102:iconst_1        
	//   45  103:putstatic       #112 <Field boolean sActionsAccessFailed>
		}
		catch(NoSuchFieldException nosuchfieldexception)
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (nosuchfieldexception)));
			sActionsAccessFailed = true;
		}
		return true ^ sActionsAccessFailed;
	//   46  106:iconst_1        
	//   47  107:getstatic       #112 <Field boolean sActionsAccessFailed>
	//   48  110:ixor            
	//   49  111:ireturn         
	}

	private static RemoteInput fromBundle(Bundle bundle)
	{
		Object obj = ((Object) (bundle.getStringArrayList("allowedDataTypes")));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "allowedDataTypes">
	//    2    3:invokevirtual   #158 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    6:astore_2        
		HashSet hashset = new HashSet();
	//    4    7:new             #160 <Class HashSet>
	//    5   10:dup             
	//    6   11:invokespecial   #161 <Method void HashSet()>
	//    7   14:astore_1        
		if(obj != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          52
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Set) (hashset)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   10   19:aload_2         
	//   11   20:invokevirtual   #167 <Method Iterator ArrayList.iterator()>
	//   12   23:astore_2        
	//   13   24:aload_2         
	//   14   25:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            52
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:invokeinterface #176 <Method Object Iterator.next()>
	//   19   40:checkcast       #178 <Class String>
	//   20   43:invokeinterface #184 <Method boolean Set.add(Object)>
	//   21   48:pop             
	//*  22   49:goto            24
		return new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"), ((Set) (hashset)));
	//   23   52:new             #186 <Class RemoteInput>
	//   24   55:dup             
	//   25   56:aload_0         
	//   26   57:ldc1            #44  <String "resultKey">
	//   27   59:invokevirtual   #190 <Method String Bundle.getString(String)>
	//   28   62:aload_0         
	//   29   63:ldc1            #38  <String "label">
	//   30   65:invokevirtual   #194 <Method CharSequence Bundle.getCharSequence(String)>
	//   31   68:aload_0         
	//   32   69:ldc1            #26  <String "choices">
	//   33   71:invokevirtual   #198 <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   34   74:aload_0         
	//   35   75:ldc1            #23  <String "allowFreeFormInput">
	//   36   77:invokevirtual   #202 <Method boolean Bundle.getBoolean(String)>
	//   37   80:aload_0         
	//   38   81:ldc1            #32  <String "extras">
	//   39   83:invokevirtual   #206 <Method Bundle Bundle.getBundle(String)>
	//   40   86:aload_1         
	//   41   87:invokespecial   #209 <Method void RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
	//   42   90:areturn         
	}

	private static RemoteInput[] fromBundleArray(Bundle abundle[])
	{
		if(abundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		RemoteInput aremoteinput[] = new RemoteInput[abundle.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       RemoteInput[]
	//    7   11:astore_2        
		for(int i = 0; i < abundle.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			aremoteinput[i] = fromBundle(abundle[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:aload_0         
	//   17   23:iload_1         
	//   18   24:aaload          
	//   19   25:invokestatic    #213 <Method RemoteInput fromBundle(Bundle)>
	//   20   28:aastore         

	//   21   29:iload_1         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_1        
	//*  25   33:goto            14
		return aremoteinput;
	//   26   36:aload_2         
	//   27   37:areturn         
	}

	public static NotificationCompat.Action getAction(Notification notification, int i)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #80  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object aobj[] = getActionObjectsLocked(notification);
	//    4    6:aload_0         
	//    5    7:invokestatic    #221 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   10:astore_3        
		if(aobj == null) goto _L2; else goto _L1
	//    7   11:aload_3         
	//    8   12:ifnull          101
_L1:
		Object obj1 = aobj[i];
	//    9   15:aload_3         
	//   10   16:iload_1         
	//   11   17:aaload          
	//   12   18:astore_3        
		notification = ((Notification) (getExtras(notification)));
	//   13   19:aload_0         
	//   14   20:invokestatic    #225 <Method Bundle getExtras(Notification)>
	//   15   23:astore_0        
		if(notification == null) goto _L4; else goto _L3
	//   16   24:aload_0         
	//   17   25:ifnull          109
_L3:
		notification = ((Notification) (((Bundle) (notification)).getSparseParcelableArray("android.support.actionExtras")));
	//   18   28:aload_0         
	//   19   29:ldc1            #227 <String "android.support.actionExtras">
	//   20   31:invokevirtual   #231 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   21   34:astore_0        
		if(notification == null) goto _L4; else goto _L5
	//   22   35:aload_0         
	//   23   36:ifnull          109
_L5:
		notification = ((Notification) ((Bundle)((SparseArray) (notification)).get(i)));
	//   24   39:aload_0         
	//   25   40:iload_1         
	//   26   41:invokevirtual   #232 <Method Object SparseArray.get(int)>
	//   27   44:checkcast       #95  <Class Bundle>
	//   28   47:astore_0        
	//*  29   48:goto            51
_L6:
		notification = ((Notification) (readAction(sActionIconField.getInt(obj1), (CharSequence)sActionTitleField.get(obj1), (PendingIntent)sActionIntentField.get(obj1), ((Bundle) (notification)))));
	//   30   51:getstatic       #130 <Field Field sActionIconField>
	//   31   54:aload_3         
	//   32   55:invokevirtual   #236 <Method int Field.getInt(Object)>
	//   33   58:getstatic       #132 <Field Field sActionTitleField>
	//   34   61:aload_3         
	//   35   62:invokevirtual   #239 <Method Object Field.get(Object)>
	//   36   65:checkcast       #241 <Class CharSequence>
	//   37   68:getstatic       #134 <Field Field sActionIntentField>
	//   38   71:aload_3         
	//   39   72:invokevirtual   #239 <Method Object Field.get(Object)>
	//   40   75:checkcast       #243 <Class PendingIntent>
	//   41   78:aload_0         
	//   42   79:invokestatic    #247 <Method NotificationCompat$Action readAction(int, CharSequence, PendingIntent, Bundle)>
	//   43   82:astore_0        
		obj;
	//   44   83:aload_2         
		JVM INSTR monitorexit ;
	//   45   84:monitorexit     
		return ((NotificationCompat.Action) (notification));
	//   46   85:aload_0         
	//   47   86:areturn         
		notification;
	//   48   87:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   49   88:ldc1            #56  <String "NotificationCompat">
	//   50   90:ldc1            #146 <String "Unable to access notification actions">
	//   51   92:aload_0         
	//   52   93:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//   53   96:pop             
		sActionsAccessFailed = true;
	//   54   97:iconst_1        
	//   55   98:putstatic       #112 <Field boolean sActionsAccessFailed>
_L2:
		obj;
	//   56  101:aload_2         
		JVM INSTR monitorexit ;
	//   57  102:monitorexit     
		return null;
	//   58  103:aconst_null     
	//   59  104:areturn         
_L7:
		obj;
	//   60  105:aload_2         
		JVM INSTR monitorexit ;
	//   61  106:monitorexit     
		throw notification;
	//   62  107:aload_0         
	//   63  108:athrow          
_L4:
		notification = null;
	//   64  109:aconst_null     
	//   65  110:astore_0        
		  goto _L6
	//*  66  111:goto            51
		notification;
	//   67  114:astore_0        
		  goto _L7
	//*  68  115:goto            105
	}

	public static int getActionCount(Notification notification)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #80  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		notification = ((Notification) (getActionObjectsLocked(notification)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #221 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   10:astore_0        
		if(notification == null) goto _L2; else goto _L1
	//    7   11:aload_0         
	//    8   12:ifnull          30
_L1:
		int i = notification.length;
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:istore_1        
	//*  12   18:goto            21
_L4:
		obj;
	//   13   21:aload_2         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return i;
	//   15   23:iload_1         
	//   16   24:ireturn         
		notification;
	//   17   25:astore_0        
		obj;
	//   18   26:aload_2         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw notification;
	//   20   28:aload_0         
	//   21   29:athrow          
_L2:
		i = 0;
	//   22   30:iconst_0        
	//   23   31:istore_1        
		if(true) goto _L4; else goto _L3
	//   24   32:goto            21
_L3:
	}

	static NotificationCompat.Action getActionFromBundle(Bundle bundle)
	{
		Bundle bundle1 = bundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "extras">
	//    2    3:invokevirtual   #206 <Method Bundle Bundle.getBundle(String)>
	//    3    6:astore_2        
		boolean flag;
		if(bundle1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          22
			flag = bundle1.getBoolean("android.support.allowGeneratedReplies", false);
	//    6   11:aload_2         
	//    7   12:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #254 <Method boolean Bundle.getBoolean(String, boolean)>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), fromBundleArray(getBundleArrayFromBundle(bundle, "remoteInputs")), fromBundleArray(getBundleArrayFromBundle(bundle, "dataOnlyRemoteInputs")), flag, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"));
	//   14   24:new             #256 <Class NotificationCompat$Action>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:ldc1            #35  <String "icon">
	//   18   31:invokevirtual   #259 <Method int Bundle.getInt(String)>
	//   19   34:aload_0         
	//   20   35:ldc1            #53  <String "title">
	//   21   37:invokevirtual   #194 <Method CharSequence Bundle.getCharSequence(String)>
	//   22   40:aload_0         
	//   23   41:ldc1            #17  <String "actionIntent">
	//   24   43:invokevirtual   #263 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   25   46:checkcast       #243 <Class PendingIntent>
	//   26   49:aload_0         
	//   27   50:ldc1            #32  <String "extras">
	//   28   52:invokevirtual   #206 <Method Bundle Bundle.getBundle(String)>
	//   29   55:aload_0         
	//   30   56:ldc1            #41  <String "remoteInputs">
	//   31   58:invokestatic    #267 <Method Bundle[] getBundleArrayFromBundle(Bundle, String)>
	//   32   61:invokestatic    #269 <Method RemoteInput[] fromBundleArray(Bundle[])>
	//   33   64:aload_0         
	//   34   65:ldc1            #29  <String "dataOnlyRemoteInputs">
	//   35   67:invokestatic    #267 <Method Bundle[] getBundleArrayFromBundle(Bundle, String)>
	//   36   70:invokestatic    #269 <Method RemoteInput[] fromBundleArray(Bundle[])>
	//   37   73:iload_1         
	//   38   74:aload_0         
	//   39   75:ldc1            #47  <String "semanticAction">
	//   40   77:invokevirtual   #259 <Method int Bundle.getInt(String)>
	//   41   80:aload_0         
	//   42   81:ldc1            #50  <String "showsUserInterface">
	//   43   83:invokevirtual   #202 <Method boolean Bundle.getBoolean(String)>
	//   44   86:invokespecial   #272 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
	//   45   89:areturn         
	}

	private static Object[] getActionObjectsLocked(Notification notification)
	{
label0:
		{
			synchronized(sActionsLock)
	//*   0    0:getstatic       #80  <Field Object sActionsLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(ensureActionReflectionReadyLocked())
					break label0;
	//    4    6:invokestatic    #274 <Method boolean ensureActionReflectionReadyLocked()>
	//    5    9:ifne            16
			}
	//    6   12:aload_1         
	//    7   13:monitorexit     
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		}
		notification = ((Notification) ((Object[])(Object[])sActionsField.get(((Object) (notification)))));
	//   10   16:getstatic       #114 <Field Field sActionsField>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #239 <Method Object Field.get(Object)>
	//   13   23:checkcast       #276 <Class Object[]>
	//   14   26:checkcast       #276 <Class Object[]>
	//   15   29:astore_0        
		obj;
	//   16   30:aload_1         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return ((Object []) (notification));
	//   18   32:aload_0         
	//   19   33:areturn         
		notification;
	//   20   34:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   21   35:ldc1            #56  <String "NotificationCompat">
	//   22   37:ldc1            #146 <String "Unable to access notification actions">
	//   23   39:aload_0         
	//   24   40:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//   25   43:pop             
		sActionsAccessFailed = true;
	//   26   44:iconst_1        
	//   27   45:putstatic       #112 <Field boolean sActionsAccessFailed>
		obj;
	//   28   48:aload_1         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return null;
	//   30   50:aconst_null     
	//   31   51:areturn         
		notification;
	//   32   52:astore_0        
		obj;
	//   33   53:aload_1         
		JVM INSTR monitorexit ;
	//   34   54:monitorexit     
		throw notification;
	//   35   55:aload_0         
	//   36   56:athrow          
	}

	private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String s)
	{
		Object aobj[] = ((Object []) (bundle.getParcelableArray(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #280 <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//    3    5:astore_2        
		if(!(aobj instanceof Bundle[]) && aobj != null)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #282 <Class Bundle[]>
	//*   6   10:ifne            41
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       20
	//*   9   17:goto            41
		{
			aobj = ((Object []) ((Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:arraylength     
	//   13   23:ldc2            #282 <Class Bundle[]>
	//   14   26:invokestatic    #288 <Method Object[] Arrays.copyOf(Object[], int, Class)>
	//   15   29:checkcast       #282 <Class Bundle[]>
	//   16   32:astore_2        
			bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #292 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			return ((Bundle []) (aobj));
	//   21   39:aload_2         
	//   22   40:areturn         
		} else
		{
			return (Bundle[])aobj;
	//   23   41:aload_2         
	//   24   42:checkcast       #282 <Class Bundle[]>
	//   25   45:areturn         
		}
	}

	static Bundle getBundleForAction(NotificationCompat.Action action)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #95  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #295 <Method void Bundle()>
	//    3    7:astore_2        
		bundle1.putInt("icon", action.getIcon());
	//    4    8:aload_2         
	//    5    9:ldc1            #35  <String "icon">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #298 <Method int NotificationCompat$Action.getIcon()>
	//    8   15:invokevirtual   #302 <Method void Bundle.putInt(String, int)>
		bundle1.putCharSequence("title", action.getTitle());
	//    9   18:aload_2         
	//   10   19:ldc1            #53  <String "title">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #306 <Method CharSequence NotificationCompat$Action.getTitle()>
	//   13   25:invokevirtual   #310 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle1.putParcelable("actionIntent", ((android.os.Parcelable) (action.getActionIntent())));
	//   14   28:aload_2         
	//   15   29:ldc1            #17  <String "actionIntent">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #314 <Method PendingIntent NotificationCompat$Action.getActionIntent()>
	//   18   35:invokevirtual   #318 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		Bundle bundle;
		if(action.getExtras() != null)
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #321 <Method Bundle NotificationCompat$Action.getExtras()>
	//*  21   42:ifnull          60
			bundle = new Bundle(action.getExtras());
	//   22   45:new             #95  <Class Bundle>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokevirtual   #321 <Method Bundle NotificationCompat$Action.getExtras()>
	//   26   53:invokespecial   #324 <Method void Bundle(Bundle)>
	//   27   56:astore_1        
		else
	//*  28   57:goto            68
			bundle = new Bundle();
	//   29   60:new             #95  <Class Bundle>
	//   30   63:dup             
	//   31   64:invokespecial   #295 <Method void Bundle()>
	//   32   67:astore_1        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   68:aload_1         
	//   34   69:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   35   71:aload_0         
	//   36   72:invokevirtual   #327 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   37   75:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putBundle("extras", bundle);
	//   38   78:aload_2         
	//   39   79:ldc1            #32  <String "extras">
	//   40   81:aload_1         
	//   41   82:invokevirtual   #335 <Method void Bundle.putBundle(String, Bundle)>
		bundle1.putParcelableArray("remoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getRemoteInputs()))));
	//   42   85:aload_2         
	//   43   86:ldc1            #41  <String "remoteInputs">
	//   44   88:aload_0         
	//   45   89:invokevirtual   #339 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   46   92:invokestatic    #343 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   47   95:invokevirtual   #292 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		bundle1.putBoolean("showsUserInterface", action.getShowsUserInterface());
	//   48   98:aload_2         
	//   49   99:ldc1            #50  <String "showsUserInterface">
	//   50  101:aload_0         
	//   51  102:invokevirtual   #346 <Method boolean NotificationCompat$Action.getShowsUserInterface()>
	//   52  105:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putInt("semanticAction", action.getSemanticAction());
	//   53  108:aload_2         
	//   54  109:ldc1            #47  <String "semanticAction">
	//   55  111:aload_0         
	//   56  112:invokevirtual   #349 <Method int NotificationCompat$Action.getSemanticAction()>
	//   57  115:invokevirtual   #302 <Method void Bundle.putInt(String, int)>
		return bundle1;
	//   58  118:aload_2         
	//   59  119:areturn         
	}

	public static Bundle getExtras(Notification notification)
	{
label0:
		{
			synchronized(sExtrasLock)
	//*   0    0:getstatic       #78  <Field Object sExtrasLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(!sExtrasFieldAccessFailed)
					break label0;
	//    4    6:getstatic       #351 <Field boolean sExtrasFieldAccessFailed>
	//    5    9:ifeq            16
			}
	//    6   12:aload_3         
	//    7   13:monitorexit     
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		}
		Object obj;
		if(sExtrasField != null)
			break MISSING_BLOCK_LABEL_68;
	//   10   16:getstatic       #353 <Field Field sExtrasField>
	//   11   19:ifnonnull       68
		obj = ((Object) (((Class) (android/app/Notification)).getDeclaredField("extras")));
	//   12   22:ldc1            #136 <Class Notification>
	//   13   24:ldc1            #32  <String "extras">
	//   14   26:invokevirtual   #128 <Method Field Class.getDeclaredField(String)>
	//   15   29:astore_1        
		if(((Class) (android/os/Bundle)).isAssignableFrom(((Field) (obj)).getType()))
			break MISSING_BLOCK_LABEL_59;
	//   16   30:ldc1            #95  <Class Bundle>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #357 <Method Class Field.getType()>
	//   19   36:invokevirtual   #361 <Method boolean Class.isAssignableFrom(Class)>
	//   20   39:ifne            59
		Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
	//   21   42:ldc1            #56  <String "NotificationCompat">
	//   22   44:ldc2            #363 <String "Notification.extras field is not of type Bundle">
	//   23   47:invokestatic    #366 <Method int Log.e(String, String)>
	//   24   50:pop             
		sExtrasFieldAccessFailed = true;
	//   25   51:iconst_1        
	//   26   52:putstatic       #351 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   27   55:aload_3         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return null;
	//   29   57:aconst_null     
	//   30   58:areturn         
		((Field) (obj)).setAccessible(true);
	//   31   59:aload_1         
	//   32   60:iconst_1        
	//   33   61:invokevirtual   #144 <Method void Field.setAccessible(boolean)>
		sExtrasField = ((Field) (obj));
	//   34   64:aload_1         
	//   35   65:putstatic       #353 <Field Field sExtrasField>
		Bundle bundle = (Bundle)sExtrasField.get(((Object) (notification)));
	//   36   68:getstatic       #353 <Field Field sExtrasField>
	//   37   71:aload_0         
	//   38   72:invokevirtual   #239 <Method Object Field.get(Object)>
	//   39   75:checkcast       #95  <Class Bundle>
	//   40   78:astore_2        
		obj = ((Object) (bundle));
	//   41   79:aload_2         
	//   42   80:astore_1        
		if(bundle != null)
			break MISSING_BLOCK_LABEL_101;
	//   43   81:aload_2         
	//   44   82:ifnonnull       101
		obj = ((Object) (new Bundle()));
	//   45   85:new             #95  <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #295 <Method void Bundle()>
	//   48   92:astore_1        
		sExtrasField.set(((Object) (notification)), obj);
	//   49   93:getstatic       #353 <Field Field sExtrasField>
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #370 <Method void Field.set(Object, Object)>
		obj1;
	//   53  101:aload_3         
		JVM INSTR monitorexit ;
	//   54  102:monitorexit     
		return ((Bundle) (obj));
	//   55  103:aload_1         
	//   56  104:areturn         
		notification;
	//   57  105:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   58  106:ldc1            #56  <String "NotificationCompat">
	//   59  108:ldc2            #372 <String "Unable to access notification extras">
	//   60  111:aload_0         
	//   61  112:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//   62  115:pop             
		break MISSING_BLOCK_LABEL_130;
	//   63  116:goto            130
		notification;
	//   64  119:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   65  120:ldc1            #56  <String "NotificationCompat">
	//   66  122:ldc2            #372 <String "Unable to access notification extras">
	//   67  125:aload_0         
	//   68  126:invokestatic    #152 <Method int Log.e(String, String, Throwable)>
	//   69  129:pop             
		sExtrasFieldAccessFailed = true;
	//   70  130:iconst_1        
	//   71  131:putstatic       #351 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   72  134:aload_3         
		JVM INSTR monitorexit ;
	//   73  135:monitorexit     
		return null;
	//   74  136:aconst_null     
	//   75  137:areturn         
		notification;
	//   76  138:astore_0        
		obj1;
	//   77  139:aload_3         
		JVM INSTR monitorexit ;
	//   78  140:monitorexit     
		throw notification;
	//   79  141:aload_0         
	//   80  142:athrow          
	}

	public static NotificationCompat.Action readAction(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
	{
		boolean flag;
		RemoteInput aremoteinput[];
		RemoteInput aremoteinput1[];
		if(bundle != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          38
		{
			aremoteinput = fromBundleArray(getBundleArrayFromBundle(bundle, "android.support.remoteInputs"));
	//    2    4:aload_3         
	//    3    5:ldc2            #374 <String "android.support.remoteInputs">
	//    4    8:invokestatic    #267 <Method Bundle[] getBundleArrayFromBundle(Bundle, String)>
	//    5   11:invokestatic    #269 <Method RemoteInput[] fromBundleArray(Bundle[])>
	//    6   14:astore          5
			aremoteinput1 = fromBundleArray(getBundleArrayFromBundle(bundle, "android.support.dataRemoteInputs"));
	//    7   16:aload_3         
	//    8   17:ldc1            #14  <String "android.support.dataRemoteInputs">
	//    9   19:invokestatic    #267 <Method Bundle[] getBundleArrayFromBundle(Bundle, String)>
	//   10   22:invokestatic    #269 <Method RemoteInput[] fromBundleArray(Bundle[])>
	//   11   25:astore          6
			flag = bundle.getBoolean("android.support.allowGeneratedReplies");
	//   12   27:aload_3         
	//   13   28:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   14   30:invokevirtual   #202 <Method boolean Bundle.getBoolean(String)>
	//   15   33:istore          4
		} else
	//*  16   35:goto            48
		{
			aremoteinput = null;
	//   17   38:aconst_null     
	//   18   39:astore          5
			aremoteinput1 = aremoteinput;
	//   19   41:aload           5
	//   20   43:astore          6
			flag = false;
	//   21   45:iconst_0        
	//   22   46:istore          4
		}
		return new NotificationCompat.Action(i, charsequence, pendingintent, bundle, aremoteinput, aremoteinput1, flag, 0, true);
	//   23   48:new             #256 <Class NotificationCompat$Action>
	//   24   51:dup             
	//   25   52:iload_0         
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:aload_3         
	//   29   56:aload           5
	//   30   58:aload           6
	//   31   60:iload           4
	//   32   62:iconst_0        
	//   33   63:iconst_1        
	//   34   64:invokespecial   #272 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
	//   35   67:areturn         
	}

	private static Bundle toBundle(RemoteInput remoteinput)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #95  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #295 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("resultKey", remoteinput.getResultKey());
	//    4    8:aload_1         
	//    5    9:ldc1            #44  <String "resultKey">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #380 <Method String RemoteInput.getResultKey()>
	//    8   15:invokevirtual   #384 <Method void Bundle.putString(String, String)>
		bundle.putCharSequence("label", remoteinput.getLabel());
	//    9   18:aload_1         
	//   10   19:ldc1            #38  <String "label">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #387 <Method CharSequence RemoteInput.getLabel()>
	//   13   25:invokevirtual   #310 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequenceArray("choices", remoteinput.getChoices());
	//   14   28:aload_1         
	//   15   29:ldc1            #26  <String "choices">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #391 <Method CharSequence[] RemoteInput.getChoices()>
	//   18   35:invokevirtual   #395 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
	//   19   38:aload_1         
	//   20   39:ldc1            #23  <String "allowFreeFormInput">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #398 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//   23   45:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBundle("extras", remoteinput.getExtras());
	//   24   48:aload_1         
	//   25   49:ldc1            #32  <String "extras">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #399 <Method Bundle RemoteInput.getExtras()>
	//   28   55:invokevirtual   #335 <Method void Bundle.putBundle(String, Bundle)>
		Object obj = ((Object) (remoteinput.getAllowedDataTypes()));
	//   29   58:aload_0         
	//   30   59:invokevirtual   #403 <Method Set RemoteInput.getAllowedDataTypes()>
	//   31   62:astore_2        
		if(obj != null && !((Set) (obj)).isEmpty())
	//*  32   63:aload_2         
	//*  33   64:ifnull          130
	//*  34   67:aload_2         
	//*  35   68:invokeinterface #406 <Method boolean Set.isEmpty()>
	//*  36   73:ifne            130
		{
			remoteinput = ((RemoteInput) (new ArrayList(((Set) (obj)).size())));
	//   37   76:new             #163 <Class ArrayList>
	//   38   79:dup             
	//   39   80:aload_2         
	//   40   81:invokeinterface #407 <Method int Set.size()>
	//   41   86:invokespecial   #410 <Method void ArrayList(int)>
	//   42   89:astore_0        
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (remoteinput)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   43   90:aload_2         
	//   44   91:invokeinterface #411 <Method Iterator Set.iterator()>
	//   45   96:astore_2        
	//   46   97:aload_2         
	//   47   98:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//   48  103:ifeq            123
	//   49  106:aload_0         
	//   50  107:aload_2         
	//   51  108:invokeinterface #176 <Method Object Iterator.next()>
	//   52  113:checkcast       #178 <Class String>
	//   53  116:invokevirtual   #412 <Method boolean ArrayList.add(Object)>
	//   54  119:pop             
	//*  55  120:goto            97
			bundle.putStringArrayList("allowedDataTypes", ((ArrayList) (remoteinput)));
	//   56  123:aload_1         
	//   57  124:ldc1            #20  <String "allowedDataTypes">
	//   58  126:aload_0         
	//   59  127:invokevirtual   #416 <Method void Bundle.putStringArrayList(String, ArrayList)>
		}
		return bundle;
	//   60  130:aload_1         
	//   61  131:areturn         
	}

	private static Bundle[] toBundleArray(RemoteInput aremoteinput[])
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bundle abundle[] = new Bundle[aremoteinput.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       Bundle[]
	//    7   11:astore_2        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			abundle[i] = toBundle(aremoteinput[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:aload_0         
	//   17   23:iload_1         
	//   18   24:aaload          
	//   19   25:invokestatic    #418 <Method Bundle toBundle(RemoteInput)>
	//   20   28:aastore         

	//   21   29:iload_1         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_1        
	//*  25   33:goto            14
		return abundle;
	//   26   36:aload_2         
	//   27   37:areturn         
	}

	public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompat.Action action)
	{
		builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #298 <Method int NotificationCompat$Action.getIcon()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #306 <Method CharSequence NotificationCompat$Action.getTitle()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #314 <Method PendingIntent NotificationCompat$Action.getActionIntent()>
	//    7   13:invokevirtual   #426 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//    8   16:pop             
		builder = ((android.app.Notification.Builder) (new Bundle(action.getExtras())));
	//    9   17:new             #95  <Class Bundle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #321 <Method Bundle NotificationCompat$Action.getExtras()>
	//   13   25:invokespecial   #324 <Method void Bundle(Bundle)>
	//   14   28:astore_0        
		if(action.getRemoteInputs() != null)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #339 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//*  17   33:ifnull          50
			((Bundle) (builder)).putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getRemoteInputs()))));
	//   18   36:aload_0         
	//   19   37:ldc2            #374 <String "android.support.remoteInputs">
	//   20   40:aload_1         
	//   21   41:invokevirtual   #339 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   22   44:invokestatic    #343 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   23   47:invokevirtual   #292 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(action.getDataOnlyRemoteInputs() != null)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #429 <Method RemoteInput[] NotificationCompat$Action.getDataOnlyRemoteInputs()>
	//*  26   54:ifnull          70
			((Bundle) (builder)).putParcelableArray("android.support.dataRemoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getDataOnlyRemoteInputs()))));
	//   27   57:aload_0         
	//   28   58:ldc1            #14  <String "android.support.dataRemoteInputs">
	//   29   60:aload_1         
	//   30   61:invokevirtual   #429 <Method RemoteInput[] NotificationCompat$Action.getDataOnlyRemoteInputs()>
	//   31   64:invokestatic    #343 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   32   67:invokevirtual   #292 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		((Bundle) (builder)).putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   70:aload_0         
	//   34   71:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   35   73:aload_1         
	//   36   74:invokevirtual   #327 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   37   77:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
		return ((Bundle) (builder));
	//   38   80:aload_0         
	//   39   81:areturn         
	}

	static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
	static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
	private static final String KEY_ACTION_INTENT = "actionIntent";
	private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
	private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
	private static final String KEY_CHOICES = "choices";
	private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
	private static final String KEY_EXTRAS = "extras";
	private static final String KEY_ICON = "icon";
	private static final String KEY_LABEL = "label";
	private static final String KEY_REMOTE_INPUTS = "remoteInputs";
	private static final String KEY_RESULT_KEY = "resultKey";
	private static final String KEY_SEMANTIC_ACTION = "semanticAction";
	private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
	private static final String KEY_TITLE = "title";
	public static final String TAG = "NotificationCompat";
	private static Class sActionClass;
	private static Field sActionIconField;
	private static Field sActionIntentField;
	private static Field sActionTitleField;
	private static boolean sActionsAccessFailed;
	private static Field sActionsField;
	private static final Object sActionsLock = new Object();
	private static Field sExtrasField;
	private static boolean sExtrasFieldAccessFailed;
	private static final Object sExtrasLock = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Object()>
	//    3    7:putstatic       #78  <Field Object sExtrasLock>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #76  <Method void Object()>
	//    7   17:putstatic       #80  <Field Object sActionsLock>
	//*   8   20:return          
	}
}
