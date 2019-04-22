// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v4.app.ActivityManagerCompat;

// Referenced classes of package android.arch.persistence.room:
//			RoomDatabase

public static final class RoomDatabase$JournalMode extends Enum
{

	public static RoomDatabase$JournalMode valueOf(String s)
	{
		return (RoomDatabase$JournalMode)Enum.valueOf(android/arch/persistence/room/RoomDatabase$JournalMode, s);
	//    0    0:ldc1            #2   <Class RoomDatabase$JournalMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RoomDatabase$JournalMode>
	//    4    9:areturn         
	}

	public static RoomDatabase$JournalMode[] values()
	{
		return (RoomDatabase$JournalMode[])((RoomDatabase$JournalMode []) ($VALUES)).clone();
	//    0    0:getstatic       #34  <Field RoomDatabase$JournalMode[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Landroid.arch.persistence.room.RoomDatabase$JournalMode_3B_.clone()>
	//    2    6:checkcast       #45  <Class RoomDatabase$JournalMode[]>
	//    3    9:areturn         
	}

	RoomDatabase$JournalMode resolve(Context context)
	{
		if(this != AUTOMATIC)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
	//*   2    4:if_acmpeq       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   5    9:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          16
	//*   7   14:icmplt          42
		{
			context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    8   17:aload_1         
	//    9   18:ldc1            #61  <String "activity">
	//   10   20:invokevirtual   #67  <Method Object Context.getSystemService(String)>
	//   11   23:checkcast       #69  <Class ActivityManager>
	//   12   26:astore_1        
			if(context != null && !ActivityManagerCompat.isLowRamDevice(((ActivityManager) (context))))
	//*  13   27:aload_1         
	//*  14   28:ifnull          42
	//*  15   31:aload_1         
	//*  16   32:invokestatic    #75  <Method boolean ActivityManagerCompat.isLowRamDevice(ActivityManager)>
	//*  17   35:ifne            42
				return WRITE_AHEAD_LOGGING;
	//   18   38:getstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
	//   19   41:areturn         
		}
		return TRUNCATE;
	//   20   42:getstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
	//   21   45:areturn         
	}

	private static final RoomDatabase$JournalMode $VALUES[];
	public static final RoomDatabase$JournalMode AUTOMATIC;
	public static final RoomDatabase$JournalMode TRUNCATE;
	public static final RoomDatabase$JournalMode WRITE_AHEAD_LOGGING;

	static 
	{
		AUTOMATIC = new RoomDatabase$JournalMode("AUTOMATIC", 0);
	//    0    0:new             #2   <Class RoomDatabase$JournalMode>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "AUTOMATIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
	//    5   10:putstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
		TRUNCATE = new RoomDatabase$JournalMode("TRUNCATE", 1);
	//    6   13:new             #2   <Class RoomDatabase$JournalMode>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "TRUNCATE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
	//   11   23:putstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
		WRITE_AHEAD_LOGGING = new RoomDatabase$JournalMode("WRITE_AHEAD_LOGGING", 2);
	//   12   26:new             #2   <Class RoomDatabase$JournalMode>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "WRITE_AHEAD_LOGGING">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
	//   17   36:putstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
		$VALUES = (new RoomDatabase$JournalMode[] {
			AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       RoomDatabase$JournalMode[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
	//   31   60:aastore         
	//   32   61:putstatic       #34  <Field RoomDatabase$JournalMode[] $VALUES>
	//*  33   64:return          
	}

	private RoomDatabase$JournalMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
