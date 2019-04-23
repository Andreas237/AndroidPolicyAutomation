// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;

import android.location.Location;
import java.util.HashSet;
import java.util.Set;

public class CurrentPlaceRequestParams
{
	public static class Builder
	{

		public Builder addField(String s)
		{
			fields.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Set fields>
		//    2    4:aload_1         
		//    3    5:invokeinterface #59  <Method boolean Set.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public CurrentPlaceRequestParams build()
		{
			return new CurrentPlaceRequestParams(this);
		//    0    0:new             #6   <Class CurrentPlaceRequestParams>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #64  <Method void CurrentPlaceRequestParams(CurrentPlaceRequestParams$Builder, CurrentPlaceRequestParams$1)>
		//    5    9:areturn         
		}

		public Builder setLimit(int i)
		{
			limit = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #49  <Field int limit>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLocation(Location location1)
		{
			location = location1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field Location location>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMinConfidenceLevel(ConfidenceLevel confidencelevel)
		{
			minConfidenceLevel = confidencelevel;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setScanMode(ScanMode scanmode)
		{
			scanMode = scanmode;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final Set fields = new HashSet();
		private int limit;
		private Location location;
		private ConfidenceLevel minConfidenceLevel;
		private ScanMode scanMode;


/*
		static Location access$000(Builder builder)
		{
			return builder.location;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field Location location>
		//    2    4:areturn         
		}

*/


/*
		static ScanMode access$100(Builder builder)
		{
			return builder.scanMode;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
		//    2    4:areturn         
		}

*/


/*
		static ConfidenceLevel access$200(Builder builder)
		{
			return builder.minConfidenceLevel;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
		//    2    4:areturn         
		}

*/


/*
		static int access$300(Builder builder)
		{
			return builder.limit;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int limit>
		//    2    4:ireturn         
		}

*/


/*
		static Set access$400(Builder builder)
		{
			return builder.fields;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Set fields>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			scanMode = ScanMode.HIGH_ACCURACY;
		//    2    4:aload_0         
		//    3    5:getstatic       #27  <Field CurrentPlaceRequestParams$ScanMode CurrentPlaceRequestParams$ScanMode.HIGH_ACCURACY>
		//    4    8:putfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
		//    5   11:aload_0         
		//    6   12:new             #31  <Class HashSet>
		//    7   15:dup             
		//    8   16:invokespecial   #32  <Method void HashSet()>
		//    9   19:putfield        #34  <Field Set fields>
		//   10   22:return          
		}
	}

	public static final class ConfidenceLevel extends Enum
	{

		public static ConfidenceLevel valueOf(String s)
		{
			return (ConfidenceLevel)Enum.valueOf(com/facebook/places/model/CurrentPlaceRequestParams$ConfidenceLevel, s);
		//    0    0:ldc1            #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
		//    4    9:areturn         
		}

		public static ConfidenceLevel[] values()
		{
			return (ConfidenceLevel[])((ConfidenceLevel []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field CurrentPlaceRequestParams$ConfidenceLevel[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel_3B_.clone()>
		//    2    6:checkcast       #42  <Class CurrentPlaceRequestParams$ConfidenceLevel[]>
		//    3    9:areturn         
		}

		private static final ConfidenceLevel $VALUES[];
		public static final ConfidenceLevel HIGH;
		public static final ConfidenceLevel LOW;
		public static final ConfidenceLevel MEDIUM;

		static 
		{
			LOW = new ConfidenceLevel("LOW", 0);
		//    0    0:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LOW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
		//    5   10:putstatic       #23  <Field CurrentPlaceRequestParams$ConfidenceLevel LOW>
			MEDIUM = new ConfidenceLevel("MEDIUM", 1);
		//    6   13:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "MEDIUM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
		//   11   23:putstatic       #26  <Field CurrentPlaceRequestParams$ConfidenceLevel MEDIUM>
			HIGH = new ConfidenceLevel("HIGH", 2);
		//   12   26:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "HIGH">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
		//   17   36:putstatic       #29  <Field CurrentPlaceRequestParams$ConfidenceLevel HIGH>
			$VALUES = (new ConfidenceLevel[] {
				LOW, MEDIUM, HIGH
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ConfidenceLevel[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field CurrentPlaceRequestParams$ConfidenceLevel LOW>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field CurrentPlaceRequestParams$ConfidenceLevel MEDIUM>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field CurrentPlaceRequestParams$ConfidenceLevel HIGH>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field CurrentPlaceRequestParams$ConfidenceLevel[] $VALUES>
		//*  33   64:return          
		}

		private ConfidenceLevel(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class ScanMode extends Enum
	{

		public static ScanMode valueOf(String s)
		{
			return (ScanMode)Enum.valueOf(com/facebook/places/model/CurrentPlaceRequestParams$ScanMode, s);
		//    0    0:ldc1            #2   <Class CurrentPlaceRequestParams$ScanMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CurrentPlaceRequestParams$ScanMode>
		//    4    9:areturn         
		}

		public static ScanMode[] values()
		{
			return (ScanMode[])((ScanMode []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field CurrentPlaceRequestParams$ScanMode[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.places.model.CurrentPlaceRequestParams$ScanMode_3B_.clone()>
		//    2    6:checkcast       #38  <Class CurrentPlaceRequestParams$ScanMode[]>
		//    3    9:areturn         
		}

		private static final ScanMode $VALUES[];
		public static final ScanMode HIGH_ACCURACY;
		public static final ScanMode LOW_LATENCY;

		static 
		{
			HIGH_ACCURACY = new ScanMode("HIGH_ACCURACY", 0);
		//    0    0:new             #2   <Class CurrentPlaceRequestParams$ScanMode>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "HIGH_ACCURACY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void CurrentPlaceRequestParams$ScanMode(String, int)>
		//    5   10:putstatic       #22  <Field CurrentPlaceRequestParams$ScanMode HIGH_ACCURACY>
			LOW_LATENCY = new ScanMode("LOW_LATENCY", 1);
		//    6   13:new             #2   <Class CurrentPlaceRequestParams$ScanMode>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "LOW_LATENCY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void CurrentPlaceRequestParams$ScanMode(String, int)>
		//   11   23:putstatic       #25  <Field CurrentPlaceRequestParams$ScanMode LOW_LATENCY>
			$VALUES = (new ScanMode[] {
				HIGH_ACCURACY, LOW_LATENCY
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ScanMode[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field CurrentPlaceRequestParams$ScanMode HIGH_ACCURACY>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field CurrentPlaceRequestParams$ScanMode LOW_LATENCY>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field CurrentPlaceRequestParams$ScanMode[] $VALUES>
		//*  23   45:return          
		}

		private ScanMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private CurrentPlaceRequestParams(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		fields = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void HashSet()>
	//    6   12:putfield        #36  <Field Set fields>
		location = builder.location;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #40  <Method Location CurrentPlaceRequestParams$Builder.access$000(CurrentPlaceRequestParams$Builder)>
	//   10   20:putfield        #42  <Field Location location>
		scanMode = builder.scanMode;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokestatic    #46  <Method CurrentPlaceRequestParams$ScanMode CurrentPlaceRequestParams$Builder.access$100(CurrentPlaceRequestParams$Builder)>
	//   14   28:putfield        #48  <Field CurrentPlaceRequestParams$ScanMode scanMode>
		minConfidenceLevel = builder.minConfidenceLevel;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokestatic    #52  <Method CurrentPlaceRequestParams$ConfidenceLevel CurrentPlaceRequestParams$Builder.access$200(CurrentPlaceRequestParams$Builder)>
	//   18   36:putfield        #54  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
		limit = builder.limit;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokestatic    #58  <Method int CurrentPlaceRequestParams$Builder.access$300(CurrentPlaceRequestParams$Builder)>
	//   22   44:putfield        #60  <Field int limit>
		fields.addAll(((java.util.Collection) (builder.fields)));
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field Set fields>
	//   25   51:aload_1         
	//   26   52:invokestatic    #64  <Method Set CurrentPlaceRequestParams$Builder.access$400(CurrentPlaceRequestParams$Builder)>
	//   27   55:invokeinterface #70  <Method boolean Set.addAll(java.util.Collection)>
	//   28   60:pop             
	//   29   61:return          
	}


	public Set getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Set fields>
	//    2    4:areturn         
	}

	public int getLimit()
	{
		return limit;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int limit>
	//    2    4:ireturn         
	}

	public Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Location location>
	//    2    4:areturn         
	}

	public ConfidenceLevel getMinConfidenceLevel()
	{
		return minConfidenceLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
	//    2    4:areturn         
	}

	public ScanMode getScanMode()
	{
		return scanMode;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field CurrentPlaceRequestParams$ScanMode scanMode>
	//    2    4:areturn         
	}

	private final Set fields;
	private final int limit;
	private final Location location;
	private final ConfidenceLevel minConfidenceLevel;
	private final ScanMode scanMode;
}
