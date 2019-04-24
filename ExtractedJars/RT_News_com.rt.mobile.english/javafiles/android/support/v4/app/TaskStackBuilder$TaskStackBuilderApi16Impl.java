// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			TaskStackBuilder

static class TaskStackBuilder$TaskStackBuilderApi16Impl extends TaskStackBuilder.TaskStackBuilderBaseImpl
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

	TaskStackBuilder$TaskStackBuilderApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TaskStackBuilder$TaskStackBuilderBaseImpl()>
	//    2    4:return          
	}
}
