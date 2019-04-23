// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$29
	implements Runnable
{

	public void run()
	{
		String s;
		String s1;
		s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String a>
	//    2    4:astore_2        
		s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ValidationUtils.isValidLogCustomEventInput(s1, c.f))
			break MISSING_BLOCK_LABEL_80;
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:getfield        #21  <Field Appboy c>
	//    8   12:getfield        #36  <Field bo.app.dh Appboy.f>
	//    9   15:invokestatic    #42  <Method boolean ValidationUtils.isValidLogCustomEventInput(String, bo.app.dh)>
	//   10   18:ifne            80
		s = s1;
	//   11   21:aload_2         
	//   12   22:astore_1        
		Object obj = ((Object) (Appboy.b()));
	//   13   23:invokestatic    #45  <Method String Appboy.b()>
	//   14   26:astore_3        
		s = s1;
	//   15   27:aload_2         
	//   16   28:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   17   29:new             #47  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #48  <Method void StringBuilder()>
	//   20   36:astore          4
		s = s1;
	//   21   38:aload_2         
	//   22   39:astore_1        
		stringbuilder.append("Log custom event input ");
	//   23   40:aload           4
	//   24   42:ldc1            #50  <String "Log custom event input ">
	//   25   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		s = s1;
	//   27   48:aload_2         
	//   28   49:astore_1        
		stringbuilder.append(s1);
	//   29   50:aload           4
	//   30   52:aload_2         
	//   31   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
		s = s1;
	//   33   57:aload_2         
	//   34   58:astore_1        
		stringbuilder.append(" was invalid. Not logging custom event to Appboy.");
	//   35   59:aload           4
	//   36   61:ldc1            #56  <String " was invalid. Not logging custom event to Appboy.">
	//   37   63:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
		s = s1;
	//   39   67:aload_2         
	//   40   68:astore_1        
		try
		{
			AppboyLogger.w(((String) (obj)), stringbuilder.toString());
	//   41   69:aload_3         
	//   42   70:aload           4
	//   43   72:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   44   75:invokestatic    #65  <Method int AppboyLogger.w(String, String)>
	//   45   78:pop             
			return;
	//   46   79:return          
		}
	//*  47   80:aload_2         
	//*  48   81:astore_1        
	//*  49   82:aload_2         
	//*  50   83:invokestatic    #69  <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  51   86:astore_2        
	//*  52   87:aload_2         
	//*  53   88:astore_1        
	//*  54   89:aload_2         
	//*  55   90:aload_0         
	//*  56   91:getfield        #25  <Field AppboyProperties b>
	//*  57   94:invokestatic    #74  <Method cc cc.a(String, AppboyProperties)>
	//*  58   97:astore_3        
	//*  59   98:aload_2         
	//*  60   99:astore_1        
	//*  61  100:aload_0         
	//*  62  101:getfield        #21  <Field Appboy c>
	//*  63  104:getfield        #78  <Field bf Appboy.g>
	//*  64  107:aload_3         
	//*  65  108:invokevirtual   #83  <Method boolean bf.a(bo.app.bu)>
	//*  66  111:ifeq            188
	//*  67  114:aload_2         
	//*  68  115:astore_1        
	//*  69  116:aload_0         
	//*  70  117:getfield        #21  <Field Appboy c>
	//*  71  120:getfield        #87  <Field fp Appboy.d>
	//*  72  123:new             #89  <Class fa>
	//*  73  126:dup             
	//*  74  127:aload_2         
	//*  75  128:aload_0         
	//*  76  129:getfield        #25  <Field AppboyProperties b>
	//*  77  132:aload_3         
	//*  78  133:invokespecial   #92  <Method void fa(String, AppboyProperties, bo.app.bu)>
	//*  79  136:invokevirtual   #97  <Method void fp.a(bo.app.fb)>
	//*  80  139:return          
		catch(Exception exception)
	//*  81  140:astore_2        
		{
			String s2 = Appboy.b();
	//   82  141:invokestatic    #45  <Method String Appboy.b()>
	//   83  144:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   84  145:new             #47  <Class StringBuilder>
	//   85  148:dup             
	//   86  149:invokespecial   #48  <Method void StringBuilder()>
	//   87  152:astore          4
			stringbuilder1.append("Failed to log custom event: ");
	//   88  154:aload           4
	//   89  156:ldc1            #99  <String "Failed to log custom event: ">
	//   90  158:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   91  161:pop             
			stringbuilder1.append(s);
	//   92  162:aload           4
	//   93  164:aload_1         
	//   94  165:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   95  168:pop             
			AppboyLogger.w(s2, stringbuilder1.toString(), ((Throwable) (exception)));
	//   96  169:aload_3         
	//   97  170:aload           4
	//   98  172:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   99  175:aload_2         
	//  100  176:invokestatic    #102 <Method int AppboyLogger.w(String, String, Throwable)>
	//  101  179:pop             
			Appboy.a(c, ((Throwable) (exception)));
	//  102  180:aload_0         
	//  103  181:getfield        #21  <Field Appboy c>
	//  104  184:aload_2         
	//  105  185:invokestatic    #105 <Method void Appboy.a(Appboy, Throwable)>
		}
		break MISSING_BLOCK_LABEL_188;
		s = s1;
		s1 = ValidationUtils.ensureAppboyFieldLength(s1);
		s = s1;
		obj = ((Object) (cc.a(s1, b)));
		s = s1;
		if(!c.g.a(((bo.app.bu) (obj))))
			break MISSING_BLOCK_LABEL_188;
		s = s1;
		c.d.a(((bo.app.fb) (new fa(s1, b, ((bo.app.bu) (obj))))));
		return;
	//  106  188:return          
	}

	final String a;
	final AppboyProperties b;
	final Appboy c;

	Appboy$29(Appboy appboy, String s, AppboyProperties appboyproperties)
	{
		c = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Appboy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String a>
		b = appboyproperties;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AppboyProperties b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
