// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

class NotificationCompatJellybean
{

	public static SparseArray buildActionExtrasMap(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #32  <Method int List.size()>
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
	//   12   18:invokeinterface #36  <Method Object List.get(int)>
	//   13   23:checkcast       #38  <Class Bundle>
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
	//   23   43:new             #40  <Class SparseArray>
	//   24   46:dup             
	//   25   47:invokespecial   #41  <Method void SparseArray()>
	//   26   50:astore          4
				sparsearray1.put(i, ((Object) (bundle)));
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aload           5
	//   30   57:invokevirtual   #45  <Method void SparseArray.put(int, Object)>
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

	static Bundle getBundleForAction(NotificationCompat.Action action)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #38  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Bundle()>
	//    3    7:astore_2        
		bundle1.putInt("icon", action.getIcon());
	//    4    8:aload_2         
	//    5    9:ldc1            #52  <String "icon">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #57  <Method int NotificationCompat$Action.getIcon()>
	//    8   15:invokevirtual   #61  <Method void Bundle.putInt(String, int)>
		bundle1.putCharSequence("title", action.getTitle());
	//    9   18:aload_2         
	//   10   19:ldc1            #63  <String "title">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #67  <Method CharSequence NotificationCompat$Action.getTitle()>
	//   13   25:invokevirtual   #71  <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle1.putParcelable("actionIntent", ((android.os.Parcelable) (action.getActionIntent())));
	//   14   28:aload_2         
	//   15   29:ldc1            #73  <String "actionIntent">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #77  <Method android.app.PendingIntent NotificationCompat$Action.getActionIntent()>
	//   18   35:invokevirtual   #81  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		Bundle bundle;
		if(action.getExtras() != null)
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #85  <Method Bundle NotificationCompat$Action.getExtras()>
	//*  21   42:ifnull          60
			bundle = new Bundle(action.getExtras());
	//   22   45:new             #38  <Class Bundle>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokevirtual   #85  <Method Bundle NotificationCompat$Action.getExtras()>
	//   26   53:invokespecial   #88  <Method void Bundle(Bundle)>
	//   27   56:astore_1        
		else
	//*  28   57:goto            68
			bundle = new Bundle();
	//   29   60:new             #38  <Class Bundle>
	//   30   63:dup             
	//   31   64:invokespecial   #50  <Method void Bundle()>
	//   32   67:astore_1        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   68:aload_1         
	//   34   69:ldc1            #90  <String "android.support.allowGeneratedReplies">
	//   35   71:aload_0         
	//   36   72:invokevirtual   #94  <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   37   75:invokevirtual   #98  <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putBundle("extras", bundle);
	//   38   78:aload_2         
	//   39   79:ldc1            #100 <String "extras">
	//   40   81:aload_1         
	//   41   82:invokevirtual   #104 <Method void Bundle.putBundle(String, Bundle)>
		bundle1.putParcelableArray("remoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getRemoteInputs()))));
	//   42   85:aload_2         
	//   43   86:ldc1            #106 <String "remoteInputs">
	//   44   88:aload_0         
	//   45   89:invokevirtual   #110 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   46   92:invokestatic    #114 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   47   95:invokevirtual   #118 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		bundle1.putBoolean("showsUserInterface", action.getShowsUserInterface());
	//   48   98:aload_2         
	//   49   99:ldc1            #120 <String "showsUserInterface">
	//   50  101:aload_0         
	//   51  102:invokevirtual   #123 <Method boolean NotificationCompat$Action.getShowsUserInterface()>
	//   52  105:invokevirtual   #98  <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putInt("semanticAction", action.getSemanticAction());
	//   53  108:aload_2         
	//   54  109:ldc1            #125 <String "semanticAction">
	//   55  111:aload_0         
	//   56  112:invokevirtual   #128 <Method int NotificationCompat$Action.getSemanticAction()>
	//   57  115:invokevirtual   #61  <Method void Bundle.putInt(String, int)>
		return bundle1;
	//   58  118:aload_2         
	//   59  119:areturn         
	}

	public static Bundle getExtras(Notification notification)
	{
label0:
		{
			synchronized(sExtrasLock)
	//*   0    0:getstatic       #21  <Field Object sExtrasLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(!sExtrasFieldAccessFailed)
					break label0;
	//    4    6:getstatic       #135 <Field boolean sExtrasFieldAccessFailed>
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
			break MISSING_BLOCK_LABEL_67;
	//   10   16:getstatic       #137 <Field Field sExtrasField>
	//   11   19:ifnonnull       67
		obj = ((Object) (((Class) (android/app/Notification)).getDeclaredField("extras")));
	//   12   22:ldc1            #139 <Class Notification>
	//   13   24:ldc1            #100 <String "extras">
	//   14   26:invokevirtual   #145 <Method Field Class.getDeclaredField(String)>
	//   15   29:astore_1        
		if(((Class) (android/os/Bundle)).isAssignableFrom(((Field) (obj)).getType()))
			break MISSING_BLOCK_LABEL_58;
	//   16   30:ldc1            #38  <Class Bundle>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #151 <Method Class Field.getType()>
	//   19   36:invokevirtual   #155 <Method boolean Class.isAssignableFrom(Class)>
	//   20   39:ifne            58
		Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
	//   21   42:ldc1            #157 <String "NotificationCompat">
	//   22   44:ldc1            #159 <String "Notification.extras field is not of type Bundle">
	//   23   46:invokestatic    #165 <Method int Log.e(String, String)>
	//   24   49:pop             
		sExtrasFieldAccessFailed = true;
	//   25   50:iconst_1        
	//   26   51:putstatic       #135 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   27   54:aload_3         
		JVM INSTR monitorexit ;
	//   28   55:monitorexit     
		return null;
	//   29   56:aconst_null     
	//   30   57:areturn         
		((Field) (obj)).setAccessible(true);
	//   31   58:aload_1         
	//   32   59:iconst_1        
	//   33   60:invokevirtual   #169 <Method void Field.setAccessible(boolean)>
		sExtrasField = ((Field) (obj));
	//   34   63:aload_1         
	//   35   64:putstatic       #137 <Field Field sExtrasField>
		Bundle bundle = (Bundle)sExtrasField.get(((Object) (notification)));
	//   36   67:getstatic       #137 <Field Field sExtrasField>
	//   37   70:aload_0         
	//   38   71:invokevirtual   #172 <Method Object Field.get(Object)>
	//   39   74:checkcast       #38  <Class Bundle>
	//   40   77:astore_2        
		obj = ((Object) (bundle));
	//   41   78:aload_2         
	//   42   79:astore_1        
		if(bundle != null)
			break MISSING_BLOCK_LABEL_100;
	//   43   80:aload_2         
	//   44   81:ifnonnull       100
		obj = ((Object) (new Bundle()));
	//   45   84:new             #38  <Class Bundle>
	//   46   87:dup             
	//   47   88:invokespecial   #50  <Method void Bundle()>
	//   48   91:astore_1        
		sExtrasField.set(((Object) (notification)), obj);
	//   49   92:getstatic       #137 <Field Field sExtrasField>
	//   50   95:aload_0         
	//   51   96:aload_1         
	//   52   97:invokevirtual   #176 <Method void Field.set(Object, Object)>
		obj1;
	//   53  100:aload_3         
		JVM INSTR monitorexit ;
	//   54  101:monitorexit     
		return ((Bundle) (obj));
	//   55  102:aload_1         
	//   56  103:areturn         
		notification;
	//   57  104:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   58  105:ldc1            #157 <String "NotificationCompat">
	//   59  107:ldc1            #178 <String "Unable to access notification extras">
	//   60  109:aload_0         
	//   61  110:invokestatic    #181 <Method int Log.e(String, String, Throwable)>
	//   62  113:pop             
		break MISSING_BLOCK_LABEL_127;
	//   63  114:goto            127
		notification;
	//   64  117:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   65  118:ldc1            #157 <String "NotificationCompat">
	//   66  120:ldc1            #178 <String "Unable to access notification extras">
	//   67  122:aload_0         
	//   68  123:invokestatic    #181 <Method int Log.e(String, String, Throwable)>
	//   69  126:pop             
		sExtrasFieldAccessFailed = true;
	//   70  127:iconst_1        
	//   71  128:putstatic       #135 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   72  131:aload_3         
		JVM INSTR monitorexit ;
	//   73  132:monitorexit     
		return null;
	//   74  133:aconst_null     
	//   75  134:areturn         
		notification;
	//   76  135:astore_0        
		obj1;
	//   77  136:aload_3         
		JVM INSTR monitorexit ;
	//   78  137:monitorexit     
		throw notification;
	//   79  138:aload_0         
	//   80  139:athrow          
	}

	private static Bundle toBundle(RemoteInput remoteinput)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #38  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("resultKey", remoteinput.getResultKey());
	//    4    8:aload_1         
	//    5    9:ldc1            #185 <String "resultKey">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #191 <Method String RemoteInput.getResultKey()>
	//    8   15:invokevirtual   #195 <Method void Bundle.putString(String, String)>
		bundle.putCharSequence("label", remoteinput.getLabel());
	//    9   18:aload_1         
	//   10   19:ldc1            #197 <String "label">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #200 <Method CharSequence RemoteInput.getLabel()>
	//   13   25:invokevirtual   #71  <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequenceArray("choices", remoteinput.getChoices());
	//   14   28:aload_1         
	//   15   29:ldc1            #202 <String "choices">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #206 <Method CharSequence[] RemoteInput.getChoices()>
	//   18   35:invokevirtual   #210 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
	//   19   38:aload_1         
	//   20   39:ldc1            #212 <String "allowFreeFormInput">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #215 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//   23   45:invokevirtual   #98  <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBundle("extras", remoteinput.getExtras());
	//   24   48:aload_1         
	//   25   49:ldc1            #100 <String "extras">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #216 <Method Bundle RemoteInput.getExtras()>
	//   28   55:invokevirtual   #104 <Method void Bundle.putBundle(String, Bundle)>
		Object obj = ((Object) (remoteinput.getAllowedDataTypes()));
	//   29   58:aload_0         
	//   30   59:invokevirtual   #220 <Method Set RemoteInput.getAllowedDataTypes()>
	//   31   62:astore_2        
		if(obj != null && !((Set) (obj)).isEmpty())
	//*  32   63:aload_2         
	//*  33   64:ifnull          130
	//*  34   67:aload_2         
	//*  35   68:invokeinterface #225 <Method boolean Set.isEmpty()>
	//*  36   73:ifne            130
		{
			remoteinput = ((RemoteInput) (new ArrayList(((Set) (obj)).size())));
	//   37   76:new             #227 <Class ArrayList>
	//   38   79:dup             
	//   39   80:aload_2         
	//   40   81:invokeinterface #228 <Method int Set.size()>
	//   41   86:invokespecial   #231 <Method void ArrayList(int)>
	//   42   89:astore_0        
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (remoteinput)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   43   90:aload_2         
	//   44   91:invokeinterface #235 <Method Iterator Set.iterator()>
	//   45   96:astore_2        
	//   46   97:aload_2         
	//   47   98:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//   48  103:ifeq            123
	//   49  106:aload_0         
	//   50  107:aload_2         
	//   51  108:invokeinterface #244 <Method Object Iterator.next()>
	//   52  113:checkcast       #246 <Class String>
	//   53  116:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   54  119:pop             
	//*  55  120:goto            97
			bundle.putStringArrayList("allowedDataTypes", ((ArrayList) (remoteinput)));
	//   56  123:aload_1         
	//   57  124:ldc1            #252 <String "allowedDataTypes">
	//   58  126:aload_0         
	//   59  127:invokevirtual   #256 <Method void Bundle.putStringArrayList(String, ArrayList)>
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
	//   19   25:invokestatic    #258 <Method Bundle toBundle(RemoteInput)>
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
	//    2    2:invokevirtual   #57  <Method int NotificationCompat$Action.getIcon()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #67  <Method CharSequence NotificationCompat$Action.getTitle()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method android.app.PendingIntent NotificationCompat$Action.getActionIntent()>
	//    7   13:invokevirtual   #266 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, android.app.PendingIntent)>
	//    8   16:pop             
		builder = ((android.app.Notification.Builder) (new Bundle(action.getExtras())));
	//    9   17:new             #38  <Class Bundle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #85  <Method Bundle NotificationCompat$Action.getExtras()>
	//   13   25:invokespecial   #88  <Method void Bundle(Bundle)>
	//   14   28:astore_0        
		if(action.getRemoteInputs() != null)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #110 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//*  17   33:ifnull          50
			((Bundle) (builder)).putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getRemoteInputs()))));
	//   18   36:aload_0         
	//   19   37:ldc2            #268 <String "android.support.remoteInputs">
	//   20   40:aload_1         
	//   21   41:invokevirtual   #110 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   22   44:invokestatic    #114 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   23   47:invokevirtual   #118 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(action.getDataOnlyRemoteInputs() != null)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #271 <Method RemoteInput[] NotificationCompat$Action.getDataOnlyRemoteInputs()>
	//*  26   54:ifnull          71
			((Bundle) (builder)).putParcelableArray("android.support.dataRemoteInputs", ((android.os.Parcelable []) (toBundleArray(action.getDataOnlyRemoteInputs()))));
	//   27   57:aload_0         
	//   28   58:ldc2            #273 <String "android.support.dataRemoteInputs">
	//   29   61:aload_1         
	//   30   62:invokevirtual   #271 <Method RemoteInput[] NotificationCompat$Action.getDataOnlyRemoteInputs()>
	//   31   65:invokestatic    #114 <Method Bundle[] toBundleArray(RemoteInput[])>
	//   32   68:invokevirtual   #118 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		((Bundle) (builder)).putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   71:aload_0         
	//   34   72:ldc1            #90  <String "android.support.allowGeneratedReplies">
	//   35   74:aload_1         
	//   36   75:invokevirtual   #94  <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   37   78:invokevirtual   #98  <Method void Bundle.putBoolean(String, boolean)>
		return ((Bundle) (builder));
	//   38   81:aload_0         
	//   39   82:areturn         
	}

	private static final Object sActionsLock = new Object();
	private static Field sExtrasField;
	private static boolean sExtrasFieldAccessFailed;
	private static final Object sExtrasLock = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object sExtrasLock>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #19  <Method void Object()>
	//    7   17:putstatic       #23  <Field Object sActionsLock>
	//*   8   20:return          
	}
}
