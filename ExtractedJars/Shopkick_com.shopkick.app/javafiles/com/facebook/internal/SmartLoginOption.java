// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

public final class SmartLoginOption extends Enum
{

	private SmartLoginOption(String s, int i, long l)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #47  <Method void Enum(String, int)>
		mValue = l;
	//    4    6:aload_0         
	//    5    7:lload_3         
	//    6    8:putfield        #49  <Field long mValue>
	//    7   11:return          
	}

	public static EnumSet parseOptions(long l)
	{
		EnumSet enumset = EnumSet.noneOf(com/facebook/internal/SmartLoginOption);
	//    0    0:ldc1            #2   <Class SmartLoginOption>
	//    1    2:invokestatic    #56  <Method EnumSet EnumSet.noneOf(Class)>
	//    2    5:astore_2        
		Iterator iterator = ALL.iterator();
	//    3    6:getstatic       #43  <Field EnumSet ALL>
	//    4    9:invokevirtual   #60  <Method Iterator EnumSet.iterator()>
	//    5   12:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   13:aload_3         
	//    7   14:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//    8   19:ifeq            55
			SmartLoginOption smartloginoption = (SmartLoginOption)iterator.next();
	//    9   22:aload_3         
	//   10   23:invokeinterface #70  <Method Object Iterator.next()>
	//   11   28:checkcast       #2   <Class SmartLoginOption>
	//   12   31:astore          4
			if((smartloginoption.getValue() & l) != 0L)
	//*  13   33:aload           4
	//*  14   35:invokevirtual   #74  <Method long getValue()>
	//*  15   38:lload_0         
	//*  16   39:land            
	//*  17   40:lconst_0        
	//*  18   41:lcmp            
	//*  19   42:ifeq            13
				enumset.add(((Object) (smartloginoption)));
	//   20   45:aload_2         
	//   21   46:aload           4
	//   22   48:invokevirtual   #78  <Method boolean EnumSet.add(Object)>
	//   23   51:pop             
		} while(true);
	//   24   52:goto            13
		return enumset;
	//   25   55:aload_2         
	//   26   56:areturn         
	}

	public static SmartLoginOption valueOf(String s)
	{
		return (SmartLoginOption)Enum.valueOf(com/facebook/internal/SmartLoginOption, s);
	//    0    0:ldc1            #2   <Class SmartLoginOption>
	//    1    2:aload_0         
	//    2    3:invokestatic    #84  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SmartLoginOption>
	//    4    9:areturn         
	}

	public static SmartLoginOption[] values()
	{
		return (SmartLoginOption[])((SmartLoginOption []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field SmartLoginOption[] $VALUES>
	//    1    3:invokevirtual   #90  <Method Object _5B_Lcom.facebook.internal.SmartLoginOption_3B_.clone()>
	//    2    6:checkcast       #87  <Class SmartLoginOption[]>
	//    3    9:areturn         
	}

	public long getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long mValue>
	//    2    4:lreturn         
	}

	private static final SmartLoginOption $VALUES[];
	public static final EnumSet ALL = EnumSet.allOf(com/facebook/internal/SmartLoginOption);
	public static final SmartLoginOption Enabled;
	public static final SmartLoginOption None;
	public static final SmartLoginOption RequireConfirm;
	private final long mValue;

	static 
	{
		None = new SmartLoginOption("None", 0, 0L);
	//    0    0:new             #2   <Class SmartLoginOption>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "None">
	//    3    6:iconst_0        
	//    4    7:lconst_0        
	//    5    8:invokespecial   #23  <Method void SmartLoginOption(String, int, long)>
	//    6   11:putstatic       #25  <Field SmartLoginOption None>
		Enabled = new SmartLoginOption("Enabled", 1, 1L);
	//    7   14:new             #2   <Class SmartLoginOption>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "Enabled">
	//   10   20:iconst_1        
	//   11   21:lconst_1        
	//   12   22:invokespecial   #23  <Method void SmartLoginOption(String, int, long)>
	//   13   25:putstatic       #28  <Field SmartLoginOption Enabled>
		RequireConfirm = new SmartLoginOption("RequireConfirm", 2, 2L);
	//   14   28:new             #2   <Class SmartLoginOption>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "RequireConfirm">
	//   17   34:iconst_2        
	//   18   35:ldc2w           #30  <Long 2L>
	//   19   38:invokespecial   #23  <Method void SmartLoginOption(String, int, long)>
	//   20   41:putstatic       #33  <Field SmartLoginOption RequireConfirm>
		$VALUES = (new SmartLoginOption[] {
			None, Enabled, RequireConfirm
		});
	//   21   44:iconst_3        
	//   22   45:anewarray       SmartLoginOption[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:getstatic       #25  <Field SmartLoginOption None>
	//   26   53:aastore         
	//   27   54:dup             
	//   28   55:iconst_1        
	//   29   56:getstatic       #28  <Field SmartLoginOption Enabled>
	//   30   59:aastore         
	//   31   60:dup             
	//   32   61:iconst_2        
	//   33   62:getstatic       #33  <Field SmartLoginOption RequireConfirm>
	//   34   65:aastore         
	//   35   66:putstatic       #35  <Field SmartLoginOption[] $VALUES>
	//   36   69:ldc1            #2   <Class SmartLoginOption>
	//   37   71:invokestatic    #41  <Method EnumSet EnumSet.allOf(Class)>
	//   38   74:putstatic       #43  <Field EnumSet ALL>
	//*  39   77:return          
	}
}
