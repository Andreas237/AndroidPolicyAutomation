// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.location.*;

public class LocationProviderProxy
{

	protected LocationProviderProxy(LocationManager locationmanager, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = locationmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field LocationManager a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
	//    8   14:return          
	}

	private LocationProvider a()
	{
		LocationProvider locationprovider;
		if(a == null)
			break MISSING_BLOCK_LABEL_29;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field LocationManager a>
	//    2    4:ifnull          21
		locationprovider = a.getProvider(b);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field LocationManager a>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field String b>
	//    7   15:invokevirtual   #37  <Method LocationProvider LocationManager.getProvider(String)>
	//    8   18:astore_1        
		return locationprovider;
	//    9   19:aload_1         
	//   10   20:areturn         
	//*  11   21:goto            29
		Throwable throwable;
		throwable;
	//   12   24:astore_1        
		throwable.printStackTrace();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	static LocationProviderProxy a(LocationManager locationmanager, String s)
	{
		return new LocationProviderProxy(locationmanager, s);
	//    0    0:new             #2   <Class LocationProviderProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #43  <Method void LocationProviderProxy(LocationManager, String)>
	//    5    9:areturn         
	}

	public int getAccuracy()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_2        
		if(flag)
	//*   7   15:iload_2         
	//*   8   16:ifeq            21
			return 2;
	//    9   19:iconst_2        
	//   10   20:ireturn         
		int i;
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		i = a().getAccuracy();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #57  <Method int LocationProvider.getAccuracy()>
	//   17   35:istore_1        
		return i;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_3        
		throwable.printStackTrace();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return -1;
	//   24   46:iconst_m1       
	//   25   47:ireturn         
	}

	public String getName()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_22;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          22
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            22
			return "lbs";
	//    9   19:ldc1            #8   <String "lbs">
	//   10   21:areturn         
		String s;
		if(a() == null)
			break MISSING_BLOCK_LABEL_47;
	//   11   22:aload_0         
	//   12   23:invokespecial   #53  <Method LocationProvider a()>
	//   13   26:ifnull          39
		s = a().getName();
	//   14   29:aload_0         
	//   15   30:invokespecial   #53  <Method LocationProvider a()>
	//   16   33:invokevirtual   #61  <Method String LocationProvider.getName()>
	//   17   36:astore_2        
		return s;
	//   18   37:aload_2         
	//   19   38:areturn         
	//*  20   39:goto            47
		Throwable throwable;
		throwable;
	//   21   42:astore_2        
		throwable.printStackTrace();
	//   22   43:aload_2         
	//   23   44:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return "null";
	//   24   47:ldc1            #63  <String "null">
	//   25   49:areturn         
	}

	public int getPowerRequirement()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_2        
		if(flag)
	//*   7   15:iload_2         
	//*   8   16:ifeq            21
			return 2;
	//    9   19:iconst_2        
	//   10   20:ireturn         
		int i;
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		i = a().getPowerRequirement();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #66  <Method int LocationProvider.getPowerRequirement()>
	//   17   35:istore_1        
		return i;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_3        
		throwable.printStackTrace();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return -1;
	//   24   46:iconst_m1       
	//   25   47:ireturn         
	}

	public boolean hasMonetaryCost()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().hasMonetaryCost();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #70  <Method boolean LocationProvider.hasMonetaryCost()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	public boolean meetsCriteria(Criteria criteria)
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_60;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          60
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_60;
	//    7   15:iload_3         
	//    8   16:ifeq            60
		if(criteria == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		int i;
		if(criteria.isAltitudeRequired() || criteria.isBearingRequired() || criteria.isSpeedRequired())
			break MISSING_BLOCK_LABEL_58;
	//   13   25:aload_1         
	//   14   26:invokevirtual   #77  <Method boolean Criteria.isAltitudeRequired()>
	//   15   29:ifne            58
	//   16   32:aload_1         
	//   17   33:invokevirtual   #80  <Method boolean Criteria.isBearingRequired()>
	//   18   36:ifne            58
	//   19   39:aload_1         
	//   20   40:invokevirtual   #83  <Method boolean Criteria.isSpeedRequired()>
	//   21   43:ifne            58
		i = criteria.getAccuracy();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #84  <Method int Criteria.getAccuracy()>
	//   24   50:istore_2        
		if(i != 1)
	//*  25   51:iload_2         
	//*  26   52:iconst_1        
	//*  27   53:icmpeq          58
			return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
		return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_86;
	//   32   60:aload_0         
	//   33   61:invokespecial   #53  <Method LocationProvider a()>
	//   34   64:ifnull          78
		flag = a().meetsCriteria(criteria);
	//   35   67:aload_0         
	//   36   68:invokespecial   #53  <Method LocationProvider a()>
	//   37   71:aload_1         
	//   38   72:invokevirtual   #86  <Method boolean LocationProvider.meetsCriteria(Criteria)>
	//   39   75:istore_3        
		return flag;
	//   40   76:iload_3         
	//   41   77:ireturn         
	//*  42   78:goto            86
		criteria;
	//   43   81:astore_1        
		((Throwable) (criteria)).printStackTrace();
	//   44   82:aload_1         
	//   45   83:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return false;
	//   46   86:iconst_0        
	//   47   87:ireturn         
	}

	public boolean requiresCell()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().requiresCell();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #89  <Method boolean LocationProvider.requiresCell()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
	}

	public boolean requiresNetwork()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().requiresNetwork();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #92  <Method boolean LocationProvider.requiresNetwork()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
	}

	public boolean requiresSatellite()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().requiresNetwork();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #92  <Method boolean LocationProvider.requiresNetwork()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
	}

	public boolean supportsAltitude()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().supportsAltitude();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #96  <Method boolean LocationProvider.supportsAltitude()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	public boolean supportsBearing()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().supportsBearing();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #99  <Method boolean LocationProvider.supportsBearing()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	public boolean supportsSpeed()
	{
		if("lbs" == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:ldc1            #8   <String "lbs">
	//    1    2:ifnull          21
		boolean flag = "lbs".equals(((Object) (b)));
	//    2    5:ldc1            #8   <String "lbs">
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String b>
	//    5   11:invokevirtual   #51  <Method boolean String.equals(Object)>
	//    6   14:istore_1        
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(a() == null)
			break MISSING_BLOCK_LABEL_46;
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method LocationProvider a()>
	//   13   25:ifnull          38
		flag = a().supportsSpeed();
	//   14   28:aload_0         
	//   15   29:invokespecial   #53  <Method LocationProvider a()>
	//   16   32:invokevirtual   #102 <Method boolean LocationProvider.supportsSpeed()>
	//   17   35:istore_1        
		return flag;
	//   18   36:iload_1         
	//   19   37:ireturn         
	//*  20   38:goto            46
		Throwable throwable;
		throwable;
	//   21   41:astore_2        
		throwable.printStackTrace();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	public static final String AMapNetwork = "lbs";
	public static final int AVAILABLE = 2;
	public static final int OUT_OF_SERVICE = 0;
	public static final int TEMPORARILY_UNAVAILABLE = 1;
	private LocationManager a;
	private String b;
}
