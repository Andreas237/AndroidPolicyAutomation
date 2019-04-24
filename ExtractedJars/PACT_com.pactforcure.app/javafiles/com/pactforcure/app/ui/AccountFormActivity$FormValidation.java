// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.participant.login.PasswordValidator;
import com.pactforcure.app.studies.Res;
import java.util.Map;
import org.researchstack.backbone.utils.TextUtils;

// Referenced classes of package com.pactforcure.app.ui:
//			AccountFormActivity

private static class AccountFormActivity$FormValidation
{

	boolean isValid()
	{
		if(((String)formData.get("email")).length() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map formData>
	//*   2    4:ldc1            #26  <String "email">
	//*   3    6:invokeinterface #32  <Method Object Map.get(Object)>
	//*   4   11:checkcast       #34  <Class String>
	//*   5   14:invokevirtual   #38  <Method int String.length()>
	//*   6   17:ifne            31
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d3);
	//    7   20:aload_0         
	//    8   21:ldc1            #39  <Int 0x7f0802d3>
	//    9   23:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   10   26:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         
		}
		if(((String)formData.get("confirmEmail")).length() == 0)
	//*  13   31:aload_0         
	//*  14   32:getfield        #19  <Field Map formData>
	//*  15   35:ldc1            #49  <String "confirmEmail">
	//*  16   37:invokeinterface #32  <Method Object Map.get(Object)>
	//*  17   42:checkcast       #34  <Class String>
	//*  18   45:invokevirtual   #38  <Method int String.length()>
	//*  19   48:ifne            62
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d0);
	//   20   51:aload_0         
	//   21   52:ldc1            #50  <Int 0x7f0802d0>
	//   22   54:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   23   57:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   24   60:iconst_0        
	//   25   61:ireturn         
		}
		if(((String)formData.get("password")).length() == 0)
	//*  26   62:aload_0         
	//*  27   63:getfield        #19  <Field Map formData>
	//*  28   66:ldc1            #52  <String "password">
	//*  29   68:invokeinterface #32  <Method Object Map.get(Object)>
	//*  30   73:checkcast       #34  <Class String>
	//*  31   76:invokevirtual   #38  <Method int String.length()>
	//*  32   79:ifne            93
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802db);
	//   33   82:aload_0         
	//   34   83:ldc1            #53  <Int 0x7f0802db>
	//   35   85:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   36   88:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   37   91:iconst_0        
	//   38   92:ireturn         
		}
		if(((String)formData.get("confirmPassword")).length() == 0)
	//*  39   93:aload_0         
	//*  40   94:getfield        #19  <Field Map formData>
	//*  41   97:ldc1            #55  <String "confirmPassword">
	//*  42   99:invokeinterface #32  <Method Object Map.get(Object)>
	//*  43  104:checkcast       #34  <Class String>
	//*  44  107:invokevirtual   #38  <Method int String.length()>
	//*  45  110:ifne            124
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d1);
	//   46  113:aload_0         
	//   47  114:ldc1            #56  <Int 0x7f0802d1>
	//   48  116:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   49  119:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   50  122:iconst_0        
	//   51  123:ireturn         
		}
		if(!TextUtils.isValidEmail((CharSequence)formData.get("email")))
	//*  52  124:aload_0         
	//*  53  125:getfield        #19  <Field Map formData>
	//*  54  128:ldc1            #26  <String "email">
	//*  55  130:invokeinterface #32  <Method Object Map.get(Object)>
	//*  56  135:checkcast       #58  <Class CharSequence>
	//*  57  138:invokestatic    #64  <Method boolean TextUtils.isValidEmail(CharSequence)>
	//*  58  141:ifne            155
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d7);
	//   59  144:aload_0         
	//   60  145:ldc1            #65  <Int 0x7f0802d7>
	//   61  147:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   62  150:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   63  153:iconst_0        
	//   64  154:ireturn         
		}
		if(!TextUtils.isValidEmail((CharSequence)formData.get("confirmEmail")))
	//*  65  155:aload_0         
	//*  66  156:getfield        #19  <Field Map formData>
	//*  67  159:ldc1            #49  <String "confirmEmail">
	//*  68  161:invokeinterface #32  <Method Object Map.get(Object)>
	//*  69  166:checkcast       #58  <Class CharSequence>
	//*  70  169:invokestatic    #64  <Method boolean TextUtils.isValidEmail(CharSequence)>
	//*  71  172:ifne            186
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d7);
	//   72  175:aload_0         
	//   73  176:ldc1            #65  <Int 0x7f0802d7>
	//   74  178:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   75  181:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   76  184:iconst_0        
	//   77  185:ireturn         
		}
		if(!((String)formData.get("email")).equals(formData.get("confirmEmail")))
	//*  78  186:aload_0         
	//*  79  187:getfield        #19  <Field Map formData>
	//*  80  190:ldc1            #26  <String "email">
	//*  81  192:invokeinterface #32  <Method Object Map.get(Object)>
	//*  82  197:checkcast       #34  <Class String>
	//*  83  200:aload_0         
	//*  84  201:getfield        #19  <Field Map formData>
	//*  85  204:ldc1            #49  <String "confirmEmail">
	//*  86  206:invokeinterface #32  <Method Object Map.get(Object)>
	//*  87  211:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  88  214:ifne            228
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d6);
	//   89  217:aload_0         
	//   90  218:ldc1            #70  <Int 0x7f0802d6>
	//   91  220:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//   92  223:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//   93  226:iconst_0        
	//   94  227:ireturn         
		}
		if(!(new PasswordValidator((String)formData.get("password"))).isValid())
	//*  95  228:new             #72  <Class PasswordValidator>
	//*  96  231:dup             
	//*  97  232:aload_0         
	//*  98  233:getfield        #19  <Field Map formData>
	//*  99  236:ldc1            #52  <String "password">
	//* 100  238:invokeinterface #32  <Method Object Map.get(Object)>
	//* 101  243:checkcast       #34  <Class String>
	//* 102  246:invokespecial   #75  <Method void PasswordValidator(String)>
	//* 103  249:invokevirtual   #77  <Method boolean PasswordValidator.isValid()>
	//* 104  252:ifne            266
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802be);
	//  105  255:aload_0         
	//  106  256:ldc1            #78  <Int 0x7f0802be>
	//  107  258:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//  108  261:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//  109  264:iconst_0        
	//  110  265:ireturn         
		}
		if(!((String)formData.get("password")).equals(formData.get("confirmPassword")))
	//* 111  266:aload_0         
	//* 112  267:getfield        #19  <Field Map formData>
	//* 113  270:ldc1            #52  <String "password">
	//* 114  272:invokeinterface #32  <Method Object Map.get(Object)>
	//* 115  277:checkcast       #34  <Class String>
	//* 116  280:aload_0         
	//* 117  281:getfield        #19  <Field Map formData>
	//* 118  284:ldc1            #55  <String "confirmPassword">
	//* 119  286:invokeinterface #32  <Method Object Map.get(Object)>
	//* 120  291:invokevirtual   #69  <Method boolean String.equals(Object)>
	//* 121  294:ifne            308
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802bc);
	//  122  297:aload_0         
	//  123  298:ldc1            #79  <Int 0x7f0802bc>
	//  124  300:invokestatic    #45  <Method String Res.getStudySpecificString(int)>
	//  125  303:putfield        #47  <Field String firstErrorEncounteredMessage>
			return false;
	//  126  306:iconst_0        
	//  127  307:ireturn         
		} else
		{
			return true;
	//  128  308:iconst_1        
	//  129  309:ireturn         
		}
	}

	String firstErrorEncounteredMessage;
	private final Map formData;

	AccountFormActivity$FormValidation(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		formData = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Map formData>
	//    5    9:return          
	}
}
