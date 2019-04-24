// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.startapp.android.publish.adsCommon.k;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			e

public class AdInformationConfig
	implements Serializable
{
	public static final class ImageResourceType extends Enum
	{

		public static ImageResourceType getByName(String s)
		{
			ImageResourceType imageresourcetype = INFO_S;
		//    0    0:getstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
		//    1    3:astore_2        
			ImageResourceType aimageresourcetype[] = values();
		//    2    4:invokestatic    #54  <Method AdInformationConfig$ImageResourceType[] values()>
		//    3    7:astore_3        
			for(int l = 0; l < aimageresourcetype.length; l++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(aimageresourcetype[l].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #58  <Method String name()>
		//*  14   22:invokevirtual   #63  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #63  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #67  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					imageresourcetype = aimageresourcetype[l];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return imageresourcetype;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static ImageResourceType valueOf(String s)
		{
			return (ImageResourceType)Enum.valueOf(com/startapp/android/publish/adsCommon/adinformation/AdInformationConfig$ImageResourceType, s);
		//    0    0:ldc1            #2   <Class AdInformationConfig$ImageResourceType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdInformationConfig$ImageResourceType>
		//    4    9:areturn         
		}

		public static ImageResourceType[] values()
		{
			return (ImageResourceType[])((ImageResourceType []) ($VALUES)).clone();
		//    0    0:getstatic       #38  <Field AdInformationConfig$ImageResourceType[] $VALUES>
		//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.adinformation.AdInformationConfig$ImageResourceType_3B_.clone()>
		//    2    6:checkcast       #72  <Class AdInformationConfig$ImageResourceType[]>
		//    3    9:areturn         
		}

		public int getDefaultHeight()
		{
			return height;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int height>
		//    2    4:ireturn         
		}

		public int getDefaultWidth()
		{
			return width;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int width>
		//    2    4:ireturn         
		}

		private static final ImageResourceType $VALUES[];
		public static final ImageResourceType INFO_EX_L;
		public static final ImageResourceType INFO_EX_S;
		public static final ImageResourceType INFO_L;
		public static final ImageResourceType INFO_S;
		private int height;
		private int width;

		static 
		{
			INFO_S = new ImageResourceType("INFO_S", 0, 17, 14);
		//    0    0:new             #2   <Class AdInformationConfig$ImageResourceType>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "INFO_S">
		//    3    6:iconst_0        
		//    4    7:bipush          17
		//    5    9:bipush          14
		//    6   11:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
		//    7   14:putstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
			INFO_EX_S = new ImageResourceType("INFO_EX_S", 1, 88, 14);
		//    8   17:new             #2   <Class AdInformationConfig$ImageResourceType>
		//    9   20:dup             
		//   10   21:ldc1            #28  <String "INFO_EX_S">
		//   11   23:iconst_1        
		//   12   24:bipush          88
		//   13   26:bipush          14
		//   14   28:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
		//   15   31:putstatic       #30  <Field AdInformationConfig$ImageResourceType INFO_EX_S>
			INFO_L = new ImageResourceType("INFO_L", 2, 25, 21);
		//   16   34:new             #2   <Class AdInformationConfig$ImageResourceType>
		//   17   37:dup             
		//   18   38:ldc1            #31  <String "INFO_L">
		//   19   40:iconst_2        
		//   20   41:bipush          25
		//   21   43:bipush          21
		//   22   45:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
		//   23   48:putstatic       #33  <Field AdInformationConfig$ImageResourceType INFO_L>
			INFO_EX_L = new ImageResourceType("INFO_EX_L", 3, 130, 21);
		//   24   51:new             #2   <Class AdInformationConfig$ImageResourceType>
		//   25   54:dup             
		//   26   55:ldc1            #34  <String "INFO_EX_L">
		//   27   57:iconst_3        
		//   28   58:sipush          130
		//   29   61:bipush          21
		//   30   63:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
		//   31   66:putstatic       #36  <Field AdInformationConfig$ImageResourceType INFO_EX_L>
			$VALUES = (new ImageResourceType[] {
				INFO_S, INFO_EX_S, INFO_L, INFO_EX_L
			});
		//   32   69:iconst_4        
		//   33   70:anewarray       ImageResourceType[]
		//   34   73:dup             
		//   35   74:iconst_0        
		//   36   75:getstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
		//   37   78:aastore         
		//   38   79:dup             
		//   39   80:iconst_1        
		//   40   81:getstatic       #30  <Field AdInformationConfig$ImageResourceType INFO_EX_S>
		//   41   84:aastore         
		//   42   85:dup             
		//   43   86:iconst_2        
		//   44   87:getstatic       #33  <Field AdInformationConfig$ImageResourceType INFO_L>
		//   45   90:aastore         
		//   46   91:dup             
		//   47   92:iconst_3        
		//   48   93:getstatic       #36  <Field AdInformationConfig$ImageResourceType INFO_EX_L>
		//   49   96:aastore         
		//   50   97:putstatic       #38  <Field AdInformationConfig$ImageResourceType[] $VALUES>
		//*  51  100:return          
		}

		private ImageResourceType(String s, int l, int i1, int j1)
		{
			super(s, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
			width = i1;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #44  <Field int width>
			height = j1;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #46  <Field int height>
		//   10   17:return          
		}
	}


	private AdInformationConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		enabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #43  <Field boolean enabled>
		fatFingersFactor = 200F;
	//    5    9:aload_0         
	//    6   10:ldc1            #44  <Float 200F>
	//    7   12:putfield        #46  <Field float fatFingersFactor>
		dialogUrlSecured = "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
	//    8   15:aload_0         
	//    9   16:ldc1            #48  <String "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html">
	//   10   18:putfield        #50  <Field String dialogUrlSecured>
		eulaUrlSecured = "https://www.com.startapp.com/policy/sdk-policy/";
	//   11   21:aload_0         
	//   12   22:ldc1            #52  <String "https://www.com.startapp.com/policy/sdk-policy/">
	//   13   24:putfield        #54  <Field String eulaUrlSecured>
		Positions = new HashMap();
	//   14   27:aload_0         
	//   15   28:new             #56  <Class HashMap>
	//   16   31:dup             
	//   17   32:invokespecial   #57  <Method void HashMap()>
	//   18   35:putfield        #59  <Field HashMap Positions>
		a = new EnumMap(com/startapp/android/publish/adsCommon/adinformation/AdInformationConfig$ImageResourceType);
	//   19   38:aload_0         
	//   20   39:new             #61  <Class EnumMap>
	//   21   42:dup             
	//   22   43:ldc1            #8   <Class AdInformationConfig$ImageResourceType>
	//   23   45:invokespecial   #64  <Method void EnumMap(Class)>
	//   24   48:putfield        #66  <Field EnumMap a>
		ImageResources = ((List) (new ArrayList()));
	//   25   51:aload_0         
	//   26   52:new             #68  <Class ArrayList>
	//   27   55:dup             
	//   28   56:invokespecial   #69  <Method void ArrayList()>
	//   29   59:putfield        #71  <Field List ImageResources>
	//   30   62:return          
	}

	public static AdInformationConfig a()
	{
		AdInformationConfig adinformationconfig = new AdInformationConfig();
	//    0    0:new             #2   <Class AdInformationConfig>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void AdInformationConfig()>
	//    3    7:astore_0        
		a(adinformationconfig);
	//    4    8:aload_0         
	//    5    9:invokestatic    #77  <Method void a(AdInformationConfig)>
		return adinformationconfig;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static void a(AdInformationConfig adinformationconfig)
	{
		adinformationconfig.i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method void i()>
		adinformationconfig.h();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #83  <Method void h()>
	//    4    8:return          
	}

	public AdInformationPositions.Position a(com.startapp.android.publish.common.model.AdPreferences.Placement placement)
	{
		AdInformationPositions.Position position1 = (AdInformationPositions.Position)Positions.get(((Object) (placement)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field HashMap Positions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #88  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #90  <Class AdInformationPositions$Position>
	//    5   11:astore_3        
		AdInformationPositions.Position position = position1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(position1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       32
		{
			position = AdInformationPositions.Position.BOTTOM_LEFT;
	//   10   18:getstatic       #93  <Field AdInformationPositions$Position AdInformationPositions$Position.BOTTOM_LEFT>
	//   11   21:astore_2        
			Positions.put(((Object) (placement)), ((Object) (position)));
	//   12   22:aload_0         
	//   13   23:getfield        #59  <Field HashMap Positions>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//   17   31:pop             
		}
		return position;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public e a(ImageResourceType imageresourcetype)
	{
		return (e)j().get(((Object) (imageresourcetype)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method EnumMap j()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method Object EnumMap.get(Object)>
	//    4    8:checkcast       #105 <Class e>
	//    5   11:areturn         
	}

	public void a(Context context, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            17
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_1         
	//*   5    7:ldc1            #108 <String "userDisabledAdInformation">
	//*   6    9:iload_2         
	//*   7   10:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//*   8   13:invokestatic    #119 <Method void k.b(Context, String, Boolean)>
	//*   9   16:return          
			flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		com.startapp.android.publish.adsCommon.k.b(context, "userDisabledAdInformation", Boolean.valueOf(flag));
	//*  12   19:goto            6
	}

	protected void a(ImageResourceType imageresourcetype, e e1)
	{
		j().put(((Enum) (imageresourcetype)), ((Object) (e1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method EnumMap j()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #123 <Method Object EnumMap.put(Enum, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public boolean a(Context context)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(!com.startapp.android.publish.adsCommon.k.a(context, "userDisabledAdInformation", Boolean.valueOf(false)).booleanValue())
	//*   4    4:aload_1         
	//*   5    5:ldc1            #108 <String "userDisabledAdInformation">
	//*   6    7:iconst_0        
	//*   7    8:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//*   8   11:invokestatic    #127 <Method Boolean k.a(Context, String, Boolean)>
	//*   9   14:invokevirtual   #131 <Method boolean Boolean.booleanValue()>
	//*  10   17:ifne            31
		{
			flag = flag1;
	//   11   20:iload_3         
	//   12   21:istore_2        
			if(d())
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #133 <Method boolean d()>
	//*  15   26:ifeq            31
				flag = true;
	//   16   29:iconst_1        
	//   17   30:istore_2        
		}
		return flag;
	//   18   31:iload_2         
	//   19   32:ireturn         
	}

	public String b()
	{
		if(eulaUrlSecured != null && !eulaUrlSecured.equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field String eulaUrlSecured>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #54  <Field String eulaUrlSecured>
	//*   5   11:ldc1            #136 <String "">
	//*   6   13:invokevirtual   #142 <Method boolean String.equals(Object)>
	//*   7   16:ifne            24
			return eulaUrlSecured;
	//    8   19:aload_0         
	//    9   20:getfield        #54  <Field String eulaUrlSecured>
	//   10   23:areturn         
		else
			return "https://www.com.startapp.com/policy/sdk-policy/";
	//   11   24:ldc1            #52  <String "https://www.com.startapp.com/policy/sdk-policy/">
	//   12   26:areturn         
	}

	public String c()
	{
		if(a.containsKey(((Object) (ImageResourceType.INFO_L))) && !((e)a.get(((Object) (ImageResourceType.INFO_L)))).d().equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field EnumMap a>
	//*   2    4:getstatic       #146 <Field AdInformationConfig$ImageResourceType AdInformationConfig$ImageResourceType.INFO_L>
	//*   3    7:invokevirtual   #149 <Method boolean EnumMap.containsKey(Object)>
	//*   4   10:ifeq            54
	//*   5   13:aload_0         
	//*   6   14:getfield        #66  <Field EnumMap a>
	//*   7   17:getstatic       #146 <Field AdInformationConfig$ImageResourceType AdInformationConfig$ImageResourceType.INFO_L>
	//*   8   20:invokevirtual   #103 <Method Object EnumMap.get(Object)>
	//*   9   23:checkcast       #105 <Class e>
	//*  10   26:invokevirtual   #151 <Method String e.d()>
	//*  11   29:ldc1            #136 <String "">
	//*  12   31:invokevirtual   #142 <Method boolean String.equals(Object)>
	//*  13   34:ifne            54
			return ((e)a.get(((Object) (ImageResourceType.INFO_L)))).d();
	//   14   37:aload_0         
	//   15   38:getfield        #66  <Field EnumMap a>
	//   16   41:getstatic       #146 <Field AdInformationConfig$ImageResourceType AdInformationConfig$ImageResourceType.INFO_L>
	//   17   44:invokevirtual   #103 <Method Object EnumMap.get(Object)>
	//   18   47:checkcast       #105 <Class e>
	//   19   50:invokevirtual   #151 <Method String e.d()>
	//   20   53:areturn         
		else
			return "https://info.startappservice.com/InApp/resources/info_l.png";
	//   21   54:ldc1            #153 <String "https://info.startappservice.com/InApp/resources/info_l.png">
	//   22   56:areturn         
	}

	public boolean d()
	{
		return enabled;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean enabled>
	//    2    4:ireturn         
	}

	public float e()
	{
		return fatFingersFactor / 100F;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float fatFingersFactor>
	//    2    4:ldc1            #156 <Float 100F>
	//    3    6:fdiv            
	//    4    7:freturn         
	}

	public String f()
	{
		if(dialogUrlSecured != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field String dialogUrlSecured>
	//*   2    4:ifnull          12
			return dialogUrlSecured;
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field String dialogUrlSecured>
	//    5   11:areturn         
		else
			return "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
	//    6   12:ldc1            #48  <String "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html">
	//    7   14:areturn         
	}

	public void g()
	{
		e e1;
		for(Iterator iterator = ImageResources.iterator(); iterator.hasNext(); e1.e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field List ImageResources>
	//*   2    4:invokeinterface #164 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #169 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            48
		{
			e1 = (e)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #173 <Method Object Iterator.next()>
	//    9   25:checkcast       #105 <Class e>
	//   10   28:astore_2        
			a(ImageResourceType.getByName(e1.a()), e1);
	//   11   29:aload_0         
	//   12   30:aload_2         
	//   13   31:invokevirtual   #175 <Method String e.a()>
	//   14   34:invokestatic    #179 <Method AdInformationConfig$ImageResourceType AdInformationConfig$ImageResourceType.getByName(String)>
	//   15   37:aload_2         
	//   16   38:invokevirtual   #181 <Method void a(AdInformationConfig$ImageResourceType, e)>
		}

	//   17   41:aload_2         
	//   18   42:invokevirtual   #183 <Method void e.e()>
	//*  19   45:goto            10
	//   20   48:return          
	}

	protected void h()
	{
		ImageResourceType aimageresourcetype[] = ImageResourceType.values();
	//    0    0:invokestatic    #187 <Method AdInformationConfig$ImageResourceType[] AdInformationConfig$ImageResourceType.values()>
	//    1    3:astore_3        
		int i1 = aimageresourcetype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int l = 0; l < i1; l++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          71
		{
			ImageResourceType imageresourcetype = aimageresourcetype[l];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(j().get(((Object) (imageresourcetype))) == null)
	//*  14   19:aload_0         
	//*  15   20:invokevirtual   #102 <Method EnumMap j()>
	//*  16   23:aload           4
	//*  17   25:invokevirtual   #103 <Method Object EnumMap.get(Object)>
	//*  18   28:ifnonnull       64
				throw new IllegalArgumentException((new StringBuilder()).append("AdInformation error in ImageResource [").append(((Object) (imageresourcetype))).append("] cannot be found in MetaData").toString());
	//   19   31:new             #189 <Class IllegalArgumentException>
	//   20   34:dup             
	//   21   35:new             #191 <Class StringBuilder>
	//   22   38:dup             
	//   23   39:invokespecial   #192 <Method void StringBuilder()>
	//   24   42:ldc1            #194 <String "AdInformation error in ImageResource [">
	//   25   44:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:aload           4
	//   27   49:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//   28   52:ldc1            #203 <String "] cannot be found in MetaData">
	//   29   54:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #209 <Method void IllegalArgumentException(String)>
	//   32   63:athrow          
		}

	//   33   64:iload_1         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_1        
	//*  37   68:goto            9
	//   38   71:return          
	}

	protected void i()
	{
		int l;
		int i1;
		ImageResourceType aimageresourcetype[];
		aimageresourcetype = ImageResourceType.values();
	//    0    0:invokestatic    #187 <Method AdInformationConfig$ImageResourceType[] AdInformationConfig$ImageResourceType.values()>
	//    1    3:astore          5
		i1 = aimageresourcetype.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore_2        
		l = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
_L5:
		if(l >= i1) goto _L2; else goto _L1
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:icmpge          190
_L1:
		Object obj;
		e e1;
		ImageResourceType imageresourcetype;
		imageresourcetype = aimageresourcetype[l];
	//   10   16:aload           5
	//   11   18:iload_1         
	//   12   19:aaload          
	//   13   20:astore          6
		e1 = (e)j().get(((Object) (imageresourcetype)));
	//   14   22:aload_0         
	//   15   23:invokevirtual   #102 <Method EnumMap j()>
	//   16   26:aload           6
	//   17   28:invokevirtual   #103 <Method Object EnumMap.get(Object)>
	//   18   31:checkcast       #105 <Class e>
	//   19   34:astore          4
		obj = ((Object) (e1));
	//   20   36:aload           4
	//   21   38:astore_3        
		if(e1 != null) goto _L4; else goto _L3
	//   22   39:aload           4
	//   23   41:ifnonnull       135
_L3:
		e1 = com.startapp.android.publish.adsCommon.adinformation.e.c(imageresourcetype.name());
	//   24   44:aload           6
	//   25   46:invokevirtual   #212 <Method String AdInformationConfig$ImageResourceType.name()>
	//   26   49:invokestatic    #215 <Method e e.c(String)>
	//   27   52:astore          4
		obj = ((Object) (ImageResources.iterator()));
	//   28   54:aload_0         
	//   29   55:getfield        #71  <Field List ImageResources>
	//   30   58:invokeinterface #164 <Method Iterator List.iterator()>
	//   31   63:astore_3        
		do
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_191;
	//   32   64:aload_3         
	//   33   65:invokeinterface #169 <Method boolean Iterator.hasNext()>
	//   34   70:ifeq            191
		while(!ImageResourceType.getByName(((e)((Iterator) (obj)).next()).a()).equals(((Object) (imageresourcetype))));
	//   35   73:aload_3         
	//   36   74:invokeinterface #173 <Method Object Iterator.next()>
	//   37   79:checkcast       #105 <Class e>
	//   38   82:invokevirtual   #175 <Method String e.a()>
	//   39   85:invokestatic    #179 <Method AdInformationConfig$ImageResourceType AdInformationConfig$ImageResourceType.getByName(String)>
	//   40   88:aload           6
	//   41   90:invokevirtual   #216 <Method boolean AdInformationConfig$ImageResourceType.equals(Object)>
	//   42   93:ifeq            64
		obj = ((Object) (Boolean.valueOf(false)));
	//   43   96:iconst_0        
	//   44   97:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//   45  100:astore_3        
_L6:
		j().put(((Enum) (imageresourcetype)), ((Object) (e1)));
	//   46  101:aload_0         
	//   47  102:invokevirtual   #102 <Method EnumMap j()>
	//   48  105:aload           6
	//   49  107:aload           4
	//   50  109:invokevirtual   #123 <Method Object EnumMap.put(Enum, Object)>
	//   51  112:pop             
		if(((Boolean) (obj)).booleanValue())
	//*  52  113:aload_3         
	//*  53  114:invokevirtual   #131 <Method boolean Boolean.booleanValue()>
	//*  54  117:ifeq            132
			ImageResources.add(((Object) (e1)));
	//   55  120:aload_0         
	//   56  121:getfield        #71  <Field List ImageResources>
	//   57  124:aload           4
	//   58  126:invokeinterface #219 <Method boolean List.add(Object)>
	//   59  131:pop             
		obj = ((Object) (e1));
	//   60  132:aload           4
	//   61  134:astore_3        
_L4:
		((e) (obj)).a(imageresourcetype.getDefaultWidth());
	//   62  135:aload_3         
	//   63  136:aload           6
	//   64  138:invokevirtual   #223 <Method int AdInformationConfig$ImageResourceType.getDefaultWidth()>
	//   65  141:invokevirtual   #226 <Method void e.a(int)>
		((e) (obj)).b(imageresourcetype.getDefaultHeight());
	//   66  144:aload_3         
	//   67  145:aload           6
	//   68  147:invokevirtual   #229 <Method int AdInformationConfig$ImageResourceType.getDefaultHeight()>
	//   69  150:invokevirtual   #231 <Method void e.b(int)>
		((e) (obj)).a((new StringBuilder()).append(imageresourcetype.name().toLowerCase()).append(".png").toString());
	//   70  153:aload_3         
	//   71  154:new             #191 <Class StringBuilder>
	//   72  157:dup             
	//   73  158:invokespecial   #192 <Method void StringBuilder()>
	//   74  161:aload           6
	//   75  163:invokevirtual   #212 <Method String AdInformationConfig$ImageResourceType.name()>
	//   76  166:invokevirtual   #234 <Method String String.toLowerCase()>
	//   77  169:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//   78  172:ldc1            #236 <String ".png">
	//   79  174:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//   80  177:invokevirtual   #206 <Method String StringBuilder.toString()>
	//   81  180:invokevirtual   #238 <Method void e.a(String)>
		l++;
	//   82  183:iload_1         
	//   83  184:iconst_1        
	//   84  185:iadd            
	//   85  186:istore_1        
		  goto _L5
	//*  86  187:goto            11
_L2:
		return;
	//   87  190:return          
		obj = ((Object) (Boolean.valueOf(true)));
	//   88  191:iconst_1        
	//   89  192:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//   90  195:astore_3        
		  goto _L6
	//*  91  196:goto            101
	}

	public EnumMap j()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field EnumMap a>
	//    2    4:areturn         
	}

	public void k()
	{
		a = new EnumMap(com/startapp/android/publish/adsCommon/adinformation/AdInformationConfig$ImageResourceType);
	//    0    0:aload_0         
	//    1    1:new             #61  <Class EnumMap>
	//    2    4:dup             
	//    3    5:ldc1            #8   <Class AdInformationConfig$ImageResourceType>
	//    4    7:invokespecial   #64  <Method void EnumMap(Class)>
	//    5   10:putfield        #66  <Field EnumMap a>
	//    6   13:return          
	}

	private static final long serialVersionUID = 1L;
	private List ImageResources;
	protected HashMap Positions;
	private transient EnumMap a;
	private String dialogUrlSecured;
	private boolean enabled;
	private String eulaUrlSecured;
	private float fatFingersFactor;
}
