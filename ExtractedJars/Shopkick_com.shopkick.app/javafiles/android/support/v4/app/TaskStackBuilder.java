// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			NavUtils

public final class TaskStackBuilder
	implements Iterable
{
	public static interface SupportParentable
	{

		public abstract Intent getSupportParentActivityIntent();
	}


	private TaskStackBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field ArrayList mIntents>
		mSourceContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Context mSourceContext>
	//   10   20:return          
	}

	public static TaskStackBuilder create(Context context)
	{
		return new TaskStackBuilder(context);
	//    0    0:new             #2   <Class TaskStackBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void TaskStackBuilder(Context)>
	//    4    8:areturn         
	}

	public static TaskStackBuilder from(Context context)
	{
		return create(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method TaskStackBuilder create(Context)>
	//    2    4:areturn         
	}

	public TaskStackBuilder addNextIntent(Intent intent)
	{
		mIntents.add(((Object) (intent)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TaskStackBuilder addNextIntentWithParentStack(Intent intent)
	{
		ComponentName componentname1 = intent.getComponent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method ComponentName Intent.getComponent()>
	//    2    4:astore_3        
		ComponentName componentname = componentname1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(componentname1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       23
			componentname = intent.resolveActivity(mSourceContext.getPackageManager());
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #31  <Field Context mSourceContext>
	//   10   16:invokevirtual   #63  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   11   19:invokevirtual   #67  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   12   22:astore_2        
		if(componentname != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			addParentStack(componentname);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #71  <Method TaskStackBuilder addParentStack(ComponentName)>
	//   18   32:pop             
		addNextIntent(intent);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #73  <Method TaskStackBuilder addNextIntent(Intent)>
	//   22   38:pop             
		return this;
	//   23   39:aload_0         
	//   24   40:areturn         
	}

	public TaskStackBuilder addParentStack(Activity activity)
	{
		Intent intent;
		if(activity instanceof SupportParentable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class TaskStackBuilder$SupportParentable>
	//*   2    4:ifeq            20
			intent = ((SupportParentable)activity).getSupportParentActivityIntent();
	//    3    7:aload_1         
	//    4    8:checkcast       #9   <Class TaskStackBuilder$SupportParentable>
	//    5   11:invokeinterface #78  <Method Intent TaskStackBuilder$SupportParentable.getSupportParentActivityIntent()>
	//    6   16:astore_2        
		else
	//*   7   17:goto            22
			intent = null;
	//    8   20:aconst_null     
	//    9   21:astore_2        
		Intent intent1 = intent;
	//   10   22:aload_2         
	//   11   23:astore_3        
		if(intent == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       33
			intent1 = NavUtils.getParentActivityIntent(activity);
	//   14   28:aload_1         
	//   15   29:invokestatic    #84  <Method Intent NavUtils.getParentActivityIntent(Activity)>
	//   16   32:astore_3        
		if(intent1 != null)
	//*  17   33:aload_3         
	//*  18   34:ifnull          72
		{
			ComponentName componentname = intent1.getComponent();
	//   19   37:aload_3         
	//   20   38:invokevirtual   #57  <Method ComponentName Intent.getComponent()>
	//   21   41:astore_2        
			activity = ((Activity) (componentname));
	//   22   42:aload_2         
	//   23   43:astore_1        
			if(componentname == null)
	//*  24   44:aload_2         
	//*  25   45:ifnonnull       60
				activity = ((Activity) (intent1.resolveActivity(mSourceContext.getPackageManager())));
	//   26   48:aload_3         
	//   27   49:aload_0         
	//   28   50:getfield        #31  <Field Context mSourceContext>
	//   29   53:invokevirtual   #63  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   30   56:invokevirtual   #67  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   31   59:astore_1        
			addParentStack(((ComponentName) (activity)));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #71  <Method TaskStackBuilder addParentStack(ComponentName)>
	//   35   65:pop             
			addNextIntent(intent1);
	//   36   66:aload_0         
	//   37   67:aload_3         
	//   38   68:invokevirtual   #73  <Method TaskStackBuilder addNextIntent(Intent)>
	//   39   71:pop             
		}
		return this;
	//   40   72:aload_0         
	//   41   73:areturn         
	}

	public TaskStackBuilder addParentStack(ComponentName componentname)
	{
		int i = mIntents.size();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #90  <Method int ArrayList.size()>
	//    3    7:istore_2        
		try
		{
			componentname = ((ComponentName) (NavUtils.getParentActivityIntent(mSourceContext, componentname)));
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field Context mSourceContext>
	//    6   12:aload_1         
	//    7   13:invokestatic    #93  <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//    8   16:astore_1        
		}
	//*   9   17:aload_1         
	//*  10   18:ifnull          45
	//*  11   21:aload_0         
	//*  12   22:getfield        #29  <Field ArrayList mIntents>
	//*  13   25:iload_2         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #96  <Method void ArrayList.add(int, Object)>
	//*  16   30:aload_0         
	//*  17   31:getfield        #31  <Field Context mSourceContext>
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #57  <Method ComponentName Intent.getComponent()>
	//*  20   38:invokestatic    #93  <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//*  21   41:astore_1        
	//*  22   42:goto            17
	//*  23   45:aload_0         
	//*  24   46:areturn         
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  25   47:astore_1        
		{
			Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
	//   26   48:ldc1            #14  <String "TaskStackBuilder">
	//   27   50:ldc1            #98  <String "Bad ComponentName while traversing activity parent metadata">
	//   28   52:invokestatic    #104 <Method int Log.e(String, String)>
	//   29   55:pop             
			throw new IllegalArgumentException(((Throwable) (componentname)));
	//   30   56:new             #106 <Class IllegalArgumentException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #109 <Method void IllegalArgumentException(Throwable)>
	//   34   64:athrow          
		}
		if(componentname == null)
			break; /* Loop/switch isn't completed */
		mIntents.add(i, ((Object) (componentname)));
		componentname = ((ComponentName) (NavUtils.getParentActivityIntent(mSourceContext, ((Intent) (componentname)).getComponent())));
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_17;
_L1:
		return this;
	}

	public TaskStackBuilder addParentStack(Class class1)
	{
		return addParentStack(new ComponentName(mSourceContext, class1));
	//    0    0:aload_0         
	//    1    1:new             #112 <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Context mSourceContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #115 <Method void ComponentName(Context, Class)>
	//    7   13:invokevirtual   #71  <Method TaskStackBuilder addParentStack(ComponentName)>
	//    8   16:areturn         
	}

	public Intent editIntentAt(int i)
	{
		return (Intent)mIntents.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #53  <Class Intent>
	//    5   11:areturn         
	}

	public Intent getIntent(int i)
	{
		return editIntentAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #127 <Method Intent editIntentAt(int)>
	//    3    5:areturn         
	}

	public int getIntentCount()
	{
		return mIntents.size();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #90  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Intent[] getIntents()
	{
		Intent aintent[] = new Intent[mIntents.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #90  <Method int ArrayList.size()>
	//    3    7:anewarray       Intent[]
	//    4   10:astore_2        
		if(aintent.length == 0)
	//*   5   11:aload_2         
	//*   6   12:arraylength     
	//*   7   13:ifne            18
			return aintent;
	//    8   16:aload_2         
	//    9   17:areturn         
		aintent[0] = (new Intent((Intent)mIntents.get(0))).addFlags(0x1000c000);
	//   10   18:aload_2         
	//   11   19:iconst_0        
	//   12   20:new             #53  <Class Intent>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #29  <Field ArrayList mIntents>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #53  <Class Intent>
	//   19   35:invokespecial   #133 <Method void Intent(Intent)>
	//   20   38:ldc1            #134 <Int 0x1000c000>
	//   21   40:invokevirtual   #137 <Method Intent Intent.addFlags(int)>
	//   22   43:aastore         
		for(int i = 1; i < aintent.length; i++)
	//*  23   44:iconst_1        
	//*  24   45:istore_1        
	//*  25   46:iload_1         
	//*  26   47:aload_2         
	//*  27   48:arraylength     
	//*  28   49:icmpge          80
			aintent[i] = new Intent((Intent)mIntents.get(i));
	//   29   52:aload_2         
	//   30   53:iload_1         
	//   31   54:new             #53  <Class Intent>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:getfield        #29  <Field ArrayList mIntents>
	//   35   62:iload_1         
	//   36   63:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   37   66:checkcast       #53  <Class Intent>
	//   38   69:invokespecial   #133 <Method void Intent(Intent)>
	//   39   72:aastore         

	//   40   73:iload_1         
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore_1        
	//*  44   77:goto            46
		return aintent;
	//   45   80:aload_2         
	//   46   81:areturn         
	}

	public PendingIntent getPendingIntent(int i, int j)
	{
		return getPendingIntent(i, j, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #142 <Method PendingIntent getPendingIntent(int, int, Bundle)>
	//    5    7:areturn         
	}

	public PendingIntent getPendingIntent(int i, int j, Bundle bundle)
	{
		if(!mIntents.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ArrayList mIntents>
	//*   2    4:invokevirtual   #146 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            87
		{
			ArrayList arraylist = mIntents;
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field ArrayList mIntents>
	//    6   14:astore          4
			Intent aintent[] = (Intent[])arraylist.toArray(((Object []) (new Intent[arraylist.size()])));
	//    7   16:aload           4
	//    8   18:aload           4
	//    9   20:invokevirtual   #90  <Method int ArrayList.size()>
	//   10   23:anewarray       Intent[]
	//   11   26:invokevirtual   #150 <Method Object[] ArrayList.toArray(Object[])>
	//   12   29:checkcast       #152 <Class Intent[]>
	//   13   32:astore          4
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
	//   14   34:aload           4
	//   15   36:iconst_0        
	//   16   37:new             #53  <Class Intent>
	//   17   40:dup             
	//   18   41:aload           4
	//   19   43:iconst_0        
	//   20   44:aaload          
	//   21   45:invokespecial   #133 <Method void Intent(Intent)>
	//   22   48:ldc1            #134 <Int 0x1000c000>
	//   23   50:invokevirtual   #137 <Method Intent Intent.addFlags(int)>
	//   24   53:aastore         
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  25   54:getstatic       #158 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   57:bipush          16
	//*  27   59:icmplt          75
				return PendingIntent.getActivities(mSourceContext, i, aintent, j, bundle);
	//   28   62:aload_0         
	//   29   63:getfield        #31  <Field Context mSourceContext>
	//   30   66:iload_1         
	//   31   67:aload           4
	//   32   69:iload_2         
	//   33   70:aload_3         
	//   34   71:invokestatic    #164 <Method PendingIntent PendingIntent.getActivities(Context, int, Intent[], int, Bundle)>
	//   35   74:areturn         
			else
				return PendingIntent.getActivities(mSourceContext, i, aintent, j);
	//   36   75:aload_0         
	//   37   76:getfield        #31  <Field Context mSourceContext>
	//   38   79:iload_1         
	//   39   80:aload           4
	//   40   82:iload_2         
	//   41   83:invokestatic    #167 <Method PendingIntent PendingIntent.getActivities(Context, int, Intent[], int)>
	//   42   86:areturn         
		} else
		{
			throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
	//   43   87:new             #169 <Class IllegalStateException>
	//   44   90:dup             
	//   45   91:ldc1            #171 <String "No intents added to TaskStackBuilder; cannot getPendingIntent">
	//   46   93:invokespecial   #174 <Method void IllegalStateException(String)>
	//   47   96:athrow          
		}
	}

	public Iterator iterator()
	{
		return mIntents.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #178 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public void startActivities()
	{
		startActivities(((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #183 <Method void startActivities(Bundle)>
	//    3    5:return          
	}

	public void startActivities(Bundle bundle)
	{
		if(!mIntents.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ArrayList mIntents>
	//*   2    4:invokevirtual   #146 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            90
		{
			ArrayList arraylist = mIntents;
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field ArrayList mIntents>
	//    6   14:astore_2        
			Intent aintent[] = (Intent[])arraylist.toArray(((Object []) (new Intent[arraylist.size()])));
	//    7   15:aload_2         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #90  <Method int ArrayList.size()>
	//   10   20:anewarray       Intent[]
	//   11   23:invokevirtual   #150 <Method Object[] ArrayList.toArray(Object[])>
	//   12   26:checkcast       #152 <Class Intent[]>
	//   13   29:astore_2        
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
	//   14   30:aload_2         
	//   15   31:iconst_0        
	//   16   32:new             #53  <Class Intent>
	//   17   35:dup             
	//   18   36:aload_2         
	//   19   37:iconst_0        
	//   20   38:aaload          
	//   21   39:invokespecial   #133 <Method void Intent(Intent)>
	//   22   42:ldc1            #134 <Int 0x1000c000>
	//   23   44:invokevirtual   #137 <Method Intent Intent.addFlags(int)>
	//   24   47:aastore         
			if(!ContextCompat.startActivities(mSourceContext, aintent, bundle))
	//*  25   48:aload_0         
	//*  26   49:getfield        #31  <Field Context mSourceContext>
	//*  27   52:aload_2         
	//*  28   53:aload_1         
	//*  29   54:invokestatic    #188 <Method boolean ContextCompat.startActivities(Context, Intent[], Bundle)>
	//*  30   57:ifne            89
			{
				bundle = ((Bundle) (new Intent(aintent[aintent.length - 1])));
	//   31   60:new             #53  <Class Intent>
	//   32   63:dup             
	//   33   64:aload_2         
	//   34   65:aload_2         
	//   35   66:arraylength     
	//   36   67:iconst_1        
	//   37   68:isub            
	//   38   69:aaload          
	//   39   70:invokespecial   #133 <Method void Intent(Intent)>
	//   40   73:astore_1        
				((Intent) (bundle)).addFlags(0x10000000);
	//   41   74:aload_1         
	//   42   75:ldc1            #189 <Int 0x10000000>
	//   43   77:invokevirtual   #137 <Method Intent Intent.addFlags(int)>
	//   44   80:pop             
				mSourceContext.startActivity(((Intent) (bundle)));
	//   45   81:aload_0         
	//   46   82:getfield        #31  <Field Context mSourceContext>
	//   47   85:aload_1         
	//   48   86:invokevirtual   #192 <Method void Context.startActivity(Intent)>
			}
			return;
	//   49   89:return          
		} else
		{
			throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
	//   50   90:new             #169 <Class IllegalStateException>
	//   51   93:dup             
	//   52   94:ldc1            #194 <String "No intents added to TaskStackBuilder; cannot startActivities">
	//   53   96:invokespecial   #174 <Method void IllegalStateException(String)>
	//   54   99:athrow          
		}
	}

	private static final String TAG = "TaskStackBuilder";
	private final ArrayList mIntents = new ArrayList();
	private final Context mSourceContext;
}
