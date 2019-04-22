// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
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
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field ArrayList mIntents>
		mSourceContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #27  <Field Context mSourceContext>
	//   10   20:return          
	}

	public static TaskStackBuilder create(Context context)
	{
		return new TaskStackBuilder(context);
	//    0    0:new             #2   <Class TaskStackBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void TaskStackBuilder(Context)>
	//    4    8:areturn         
	}

	public TaskStackBuilder addNextIntent(Intent intent)
	{
		mIntents.add(((Object) (intent)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList mIntents>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
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
	//    5   11:invokeinterface #47  <Method Intent TaskStackBuilder$SupportParentable.getSupportParentActivityIntent()>
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
	//   15   29:invokestatic    #53  <Method Intent NavUtils.getParentActivityIntent(Activity)>
	//   16   32:astore_3        
		if(intent1 != null)
	//*  17   33:aload_3         
	//*  18   34:ifnull          72
		{
			ComponentName componentname = intent1.getComponent();
	//   19   37:aload_3         
	//   20   38:invokevirtual   #59  <Method ComponentName Intent.getComponent()>
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
	//   28   50:getfield        #27  <Field Context mSourceContext>
	//   29   53:invokevirtual   #65  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   30   56:invokevirtual   #69  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   31   59:astore_1        
			addParentStack(((ComponentName) (activity)));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #72  <Method TaskStackBuilder addParentStack(ComponentName)>
	//   35   65:pop             
			addNextIntent(intent1);
	//   36   66:aload_0         
	//   37   67:aload_3         
	//   38   68:invokevirtual   #74  <Method TaskStackBuilder addNextIntent(Intent)>
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
	//    1    1:getfield        #25  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #80  <Method int ArrayList.size()>
	//    3    7:istore_2        
		try
		{
			componentname = ((ComponentName) (NavUtils.getParentActivityIntent(mSourceContext, componentname)));
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Context mSourceContext>
	//    6   12:aload_1         
	//    7   13:invokestatic    #83  <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//    8   16:astore_1        
		}
	//*   9   17:aload_1         
	//*  10   18:ifnull          45
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field ArrayList mIntents>
	//*  13   25:iload_2         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #86  <Method void ArrayList.add(int, Object)>
	//*  16   30:aload_0         
	//*  17   31:getfield        #27  <Field Context mSourceContext>
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #59  <Method ComponentName Intent.getComponent()>
	//*  20   38:invokestatic    #83  <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//*  21   41:astore_1        
	//*  22   42:goto            17
	//*  23   45:aload_0         
	//*  24   46:areturn         
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  25   47:astore_1        
		{
			Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
	//   26   48:ldc1            #88  <String "TaskStackBuilder">
	//   27   50:ldc1            #90  <String "Bad ComponentName while traversing activity parent metadata">
	//   28   52:invokestatic    #96  <Method int Log.e(String, String)>
	//   29   55:pop             
			throw new IllegalArgumentException(((Throwable) (componentname)));
	//   30   56:new             #98  <Class IllegalArgumentException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #101 <Method void IllegalArgumentException(Throwable)>
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

	public Iterator iterator()
	{
		return mIntents.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #106 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public void startActivities()
	{
		startActivities(((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #113 <Method void startActivities(Bundle)>
	//    3    5:return          
	}

	public void startActivities(Bundle bundle)
	{
		if(!mIntents.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field ArrayList mIntents>
	//*   2    4:invokevirtual   #118 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            90
		{
			ArrayList arraylist = mIntents;
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field ArrayList mIntents>
	//    6   14:astore_2        
			Intent aintent[] = (Intent[])arraylist.toArray(((Object []) (new Intent[arraylist.size()])));
	//    7   15:aload_2         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #80  <Method int ArrayList.size()>
	//   10   20:anewarray       Intent[]
	//   11   23:invokevirtual   #122 <Method Object[] ArrayList.toArray(Object[])>
	//   12   26:checkcast       #124 <Class Intent[]>
	//   13   29:astore_2        
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
	//   14   30:aload_2         
	//   15   31:iconst_0        
	//   16   32:new             #55  <Class Intent>
	//   17   35:dup             
	//   18   36:aload_2         
	//   19   37:iconst_0        
	//   20   38:aaload          
	//   21   39:invokespecial   #127 <Method void Intent(Intent)>
	//   22   42:ldc1            #128 <Int 0x1000c000>
	//   23   44:invokevirtual   #132 <Method Intent Intent.addFlags(int)>
	//   24   47:aastore         
			if(!ContextCompat.startActivities(mSourceContext, aintent, bundle))
	//*  25   48:aload_0         
	//*  26   49:getfield        #27  <Field Context mSourceContext>
	//*  27   52:aload_2         
	//*  28   53:aload_1         
	//*  29   54:invokestatic    #137 <Method boolean ContextCompat.startActivities(Context, Intent[], Bundle)>
	//*  30   57:ifne            89
			{
				bundle = ((Bundle) (new Intent(aintent[aintent.length - 1])));
	//   31   60:new             #55  <Class Intent>
	//   32   63:dup             
	//   33   64:aload_2         
	//   34   65:aload_2         
	//   35   66:arraylength     
	//   36   67:iconst_1        
	//   37   68:isub            
	//   38   69:aaload          
	//   39   70:invokespecial   #127 <Method void Intent(Intent)>
	//   40   73:astore_1        
				((Intent) (bundle)).addFlags(0x10000000);
	//   41   74:aload_1         
	//   42   75:ldc1            #138 <Int 0x10000000>
	//   43   77:invokevirtual   #132 <Method Intent Intent.addFlags(int)>
	//   44   80:pop             
				mSourceContext.startActivity(((Intent) (bundle)));
	//   45   81:aload_0         
	//   46   82:getfield        #27  <Field Context mSourceContext>
	//   47   85:aload_1         
	//   48   86:invokevirtual   #141 <Method void Context.startActivity(Intent)>
			}
			return;
	//   49   89:return          
		} else
		{
			throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
	//   50   90:new             #143 <Class IllegalStateException>
	//   51   93:dup             
	//   52   94:ldc1            #145 <String "No intents added to TaskStackBuilder; cannot startActivities">
	//   53   96:invokespecial   #148 <Method void IllegalStateException(String)>
	//   54   99:athrow          
		}
	}

	private final ArrayList mIntents = new ArrayList();
	private final Context mSourceContext;
}
