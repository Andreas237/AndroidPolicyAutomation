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

	static class TaskStackBuilderApi16Impl extends TaskStackBuilderBaseImpl
	{

		public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
		{
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
		//    0    0:aload_2         
		//    1    1:iconst_0        
		//    2    2:new             #19  <Class Intent>
		//    3    5:dup             
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:aaload          
		//    7    9:invokespecial   #22  <Method void Intent(Intent)>
		//    8   12:ldc1            #23  <Int 0x1000c000>
		//    9   14:invokevirtual   #27  <Method Intent Intent.addFlags(int)>
		//   10   17:aastore         
			return PendingIntent.getActivities(context, i, aintent, j, bundle);
		//   11   18:aload_1         
		//   12   19:iload_3         
		//   13   20:aload_2         
		//   14   21:iload           4
		//   15   23:aload           5
		//   16   25:invokestatic    #33  <Method PendingIntent PendingIntent.getActivities(Context, int, Intent[], int, Bundle)>
		//   17   28:areturn         
		}

		TaskStackBuilderApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TaskStackBuilder$TaskStackBuilderBaseImpl()>
		//    2    4:return          
		}
	}

	static class TaskStackBuilderBaseImpl
	{

		public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
		{
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
		//    0    0:aload_2         
		//    1    1:iconst_0        
		//    2    2:new             #16  <Class Intent>
		//    3    5:dup             
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:aaload          
		//    7    9:invokespecial   #19  <Method void Intent(Intent)>
		//    8   12:ldc1            #20  <Int 0x1000c000>
		//    9   14:invokevirtual   #24  <Method Intent Intent.addFlags(int)>
		//   10   17:aastore         
			return PendingIntent.getActivities(context, i, aintent, j);
		//   11   18:aload_1         
		//   12   19:iload_3         
		//   13   20:aload_2         
		//   14   21:iload           4
		//   15   23:invokestatic    #30  <Method PendingIntent PendingIntent.getActivities(Context, int, Intent[], int)>
		//   16   26:areturn         
		}

		TaskStackBuilderBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private TaskStackBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field ArrayList mIntents>
		mSourceContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #51  <Field Context mSourceContext>
	//   10   20:return          
	}

	public static TaskStackBuilder create(Context context)
	{
		return new TaskStackBuilder(context);
	//    0    0:new             #2   <Class TaskStackBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void TaskStackBuilder(Context)>
	//    4    8:areturn         
	}

	public static TaskStackBuilder from(Context context)
	{
		return create(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method TaskStackBuilder create(Context)>
	//    2    4:areturn         
	}

	public TaskStackBuilder addNextIntent(Intent intent)
	{
		mIntents.add(((Object) (intent)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TaskStackBuilder addNextIntentWithParentStack(Intent intent)
	{
		ComponentName componentname1 = intent.getComponent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method ComponentName Intent.getComponent()>
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
	//    9   13:getfield        #51  <Field Context mSourceContext>
	//   10   16:invokevirtual   #82  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   11   19:invokevirtual   #86  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   12   22:astore_2        
		if(componentname != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			addParentStack(componentname);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #90  <Method TaskStackBuilder addParentStack(ComponentName)>
	//   18   32:pop             
		addNextIntent(intent);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #92  <Method TaskStackBuilder addNextIntent(Intent)>
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
	//    5   11:invokeinterface #97  <Method Intent TaskStackBuilder$SupportParentable.getSupportParentActivityIntent()>
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
	//   15   29:invokestatic    #103 <Method Intent NavUtils.getParentActivityIntent(Activity)>
	//   16   32:astore_3        
		if(intent1 != null)
	//*  17   33:aload_3         
	//*  18   34:ifnull          72
		{
			ComponentName componentname = intent1.getComponent();
	//   19   37:aload_3         
	//   20   38:invokevirtual   #76  <Method ComponentName Intent.getComponent()>
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
	//   28   50:getfield        #51  <Field Context mSourceContext>
	//   29   53:invokevirtual   #82  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   30   56:invokevirtual   #86  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   31   59:astore_1        
			addParentStack(((ComponentName) (activity)));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #90  <Method TaskStackBuilder addParentStack(ComponentName)>
	//   35   65:pop             
			addNextIntent(intent1);
	//   36   66:aload_0         
	//   37   67:aload_3         
	//   38   68:invokevirtual   #92  <Method TaskStackBuilder addNextIntent(Intent)>
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
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:istore_2        
		try
		{
			componentname = ((ComponentName) (NavUtils.getParentActivityIntent(mSourceContext, componentname)));
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field Context mSourceContext>
	//    6   12:aload_1         
	//    7   13:invokestatic    #112 <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//    8   16:astore_1        
		}
	//*   9   17:aload_1         
	//*  10   18:ifnull          45
	//*  11   21:aload_0         
	//*  12   22:getfield        #49  <Field ArrayList mIntents>
	//*  13   25:iload_2         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #115 <Method void ArrayList.add(int, Object)>
	//*  16   30:aload_0         
	//*  17   31:getfield        #51  <Field Context mSourceContext>
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #76  <Method ComponentName Intent.getComponent()>
	//*  20   38:invokestatic    #112 <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
	//*  21   41:astore_1        
	//*  22   42:goto            17
	//*  23   45:aload_0         
	//*  24   46:areturn         
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*  25   47:astore_1        
		{
			Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
	//   26   48:ldc1            #22  <String "TaskStackBuilder">
	//   27   50:ldc1            #117 <String "Bad ComponentName while traversing activity parent metadata">
	//   28   52:invokestatic    #123 <Method int Log.e(String, String)>
	//   29   55:pop             
			throw new IllegalArgumentException(((Throwable) (componentname)));
	//   30   56:new             #125 <Class IllegalArgumentException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #128 <Method void IllegalArgumentException(Throwable)>
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
	//    1    1:new             #131 <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field Context mSourceContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #134 <Method void ComponentName(Context, Class)>
	//    7   13:invokevirtual   #90  <Method TaskStackBuilder addParentStack(ComponentName)>
	//    8   16:areturn         
	}

	public Intent editIntentAt(int i)
	{
		return (Intent)mIntents.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #143 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #72  <Class Intent>
	//    5   11:areturn         
	}

	public Intent getIntent(int i)
	{
		return editIntentAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #146 <Method Intent editIntentAt(int)>
	//    3    5:areturn         
	}

	public int getIntentCount()
	{
		return mIntents.size();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Intent[] getIntents()
	{
		Intent aintent[] = new Intent[mIntents.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
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
	//   12   20:new             #72  <Class Intent>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #49  <Field ArrayList mIntents>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #143 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #72  <Class Intent>
	//   19   35:invokespecial   #152 <Method void Intent(Intent)>
	//   20   38:ldc1            #153 <Int 0x1000c000>
	//   21   40:invokevirtual   #156 <Method Intent Intent.addFlags(int)>
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
	//   31   54:new             #72  <Class Intent>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:getfield        #49  <Field ArrayList mIntents>
	//   35   62:iload_1         
	//   36   63:invokevirtual   #143 <Method Object ArrayList.get(int)>
	//   37   66:checkcast       #72  <Class Intent>
	//   38   69:invokespecial   #152 <Method void Intent(Intent)>
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
	//    4    4:invokevirtual   #161 <Method PendingIntent getPendingIntent(int, int, Bundle)>
	//    5    7:areturn         
	}

	public PendingIntent getPendingIntent(int i, int j, Bundle bundle)
	{
		if(mIntents.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ArrayList mIntents>
	//*   2    4:invokevirtual   #165 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            20
		{
			throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
	//    4   10:new             #167 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #169 <String "No intents added to TaskStackBuilder; cannot getPendingIntent">
	//    7   16:invokespecial   #172 <Method void IllegalStateException(String)>
	//    8   19:athrow          
		} else
		{
			Intent aintent[] = (Intent[])mIntents.toArray(((Object []) (new Intent[mIntents.size()])));
	//    9   20:aload_0         
	//   10   21:getfield        #49  <Field ArrayList mIntents>
	//   11   24:aload_0         
	//   12   25:getfield        #49  <Field ArrayList mIntents>
	//   13   28:invokevirtual   #109 <Method int ArrayList.size()>
	//   14   31:anewarray       Intent[]
	//   15   34:invokevirtual   #176 <Method Object[] ArrayList.toArray(Object[])>
	//   16   37:checkcast       #178 <Class Intent[]>
	//   17   40:astore          4
			aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
	//   18   42:aload           4
	//   19   44:iconst_0        
	//   20   45:new             #72  <Class Intent>
	//   21   48:dup             
	//   22   49:aload           4
	//   23   51:iconst_0        
	//   24   52:aaload          
	//   25   53:invokespecial   #152 <Method void Intent(Intent)>
	//   26   56:ldc1            #153 <Int 0x1000c000>
	//   27   58:invokevirtual   #156 <Method Intent Intent.addFlags(int)>
	//   28   61:aastore         
			return IMPL.getPendingIntent(mSourceContext, aintent, i, j, bundle);
	//   29   62:getstatic       #40  <Field TaskStackBuilder$TaskStackBuilderBaseImpl IMPL>
	//   30   65:aload_0         
	//   31   66:getfield        #51  <Field Context mSourceContext>
	//   32   69:aload           4
	//   33   71:iload_1         
	//   34   72:iload_2         
	//   35   73:aload_3         
	//   36   74:invokevirtual   #181 <Method PendingIntent TaskStackBuilder$TaskStackBuilderBaseImpl.getPendingIntent(Context, Intent[], int, int, Bundle)>
	//   37   77:areturn         
		}
	}

	public Iterator iterator()
	{
		return mIntents.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mIntents>
	//    2    4:invokevirtual   #185 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public void startActivities()
	{
		startActivities(((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #190 <Method void startActivities(Bundle)>
	//    3    5:return          
	}

	public void startActivities(Bundle bundle)
	{
		if(mIntents.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ArrayList mIntents>
	//*   2    4:invokevirtual   #165 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            20
			throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
	//    4   10:new             #167 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #192 <String "No intents added to TaskStackBuilder; cannot startActivities">
	//    7   16:invokespecial   #172 <Method void IllegalStateException(String)>
	//    8   19:athrow          
		Intent aintent[] = (Intent[])mIntents.toArray(((Object []) (new Intent[mIntents.size()])));
	//    9   20:aload_0         
	//   10   21:getfield        #49  <Field ArrayList mIntents>
	//   11   24:aload_0         
	//   12   25:getfield        #49  <Field ArrayList mIntents>
	//   13   28:invokevirtual   #109 <Method int ArrayList.size()>
	//   14   31:anewarray       Intent[]
	//   15   34:invokevirtual   #176 <Method Object[] ArrayList.toArray(Object[])>
	//   16   37:checkcast       #178 <Class Intent[]>
	//   17   40:astore_2        
		aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
	//   18   41:aload_2         
	//   19   42:iconst_0        
	//   20   43:new             #72  <Class Intent>
	//   21   46:dup             
	//   22   47:aload_2         
	//   23   48:iconst_0        
	//   24   49:aaload          
	//   25   50:invokespecial   #152 <Method void Intent(Intent)>
	//   26   53:ldc1            #153 <Int 0x1000c000>
	//   27   55:invokevirtual   #156 <Method Intent Intent.addFlags(int)>
	//   28   58:aastore         
		if(!ContextCompat.startActivities(mSourceContext, aintent, bundle))
	//*  29   59:aload_0         
	//*  30   60:getfield        #51  <Field Context mSourceContext>
	//*  31   63:aload_2         
	//*  32   64:aload_1         
	//*  33   65:invokestatic    #197 <Method boolean ContextCompat.startActivities(Context, Intent[], Bundle)>
	//*  34   68:ifne            100
		{
			bundle = ((Bundle) (new Intent(aintent[aintent.length - 1])));
	//   35   71:new             #72  <Class Intent>
	//   36   74:dup             
	//   37   75:aload_2         
	//   38   76:aload_2         
	//   39   77:arraylength     
	//   40   78:iconst_1        
	//   41   79:isub            
	//   42   80:aaload          
	//   43   81:invokespecial   #152 <Method void Intent(Intent)>
	//   44   84:astore_1        
			((Intent) (bundle)).addFlags(0x10000000);
	//   45   85:aload_1         
	//   46   86:ldc1            #198 <Int 0x10000000>
	//   47   88:invokevirtual   #156 <Method Intent Intent.addFlags(int)>
	//   48   91:pop             
			mSourceContext.startActivity(((Intent) (bundle)));
	//   49   92:aload_0         
	//   50   93:getfield        #51  <Field Context mSourceContext>
	//   51   96:aload_1         
	//   52   97:invokevirtual   #201 <Method void Context.startActivity(Intent)>
		}
	//   53  100:return          
	}

	private static final TaskStackBuilderBaseImpl IMPL;
	private static final String TAG = "TaskStackBuilder";
	private final ArrayList mIntents = new ArrayList();
	private final Context mSourceContext;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((TaskStackBuilderBaseImpl) (new TaskStackBuilderApi16Impl()));
	//    3    8:new             #12  <Class TaskStackBuilder$TaskStackBuilderApi16Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #38  <Method void TaskStackBuilder$TaskStackBuilderApi16Impl()>
	//    6   15:putstatic       #40  <Field TaskStackBuilder$TaskStackBuilderBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new TaskStackBuilderBaseImpl();
	//    8   19:new             #15  <Class TaskStackBuilder$TaskStackBuilderBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #41  <Method void TaskStackBuilder$TaskStackBuilderBaseImpl()>
	//   11   26:putstatic       #40  <Field TaskStackBuilder$TaskStackBuilderBaseImpl IMPL>
	//*  12   29:return          
	}
}
