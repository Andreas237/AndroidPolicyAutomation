// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.model;

import java.io.Serializable;

// Referenced classes of package org.researchstack.backbone.model:
//			ConsentSection

public static final class ConsentSection$Type extends Enum
	implements Serializable
{

	public static ConsentSection$Type valueOf(String s)
	{
		return (ConsentSection$Type)Enum.valueOf(org/researchstack/backbone/model/ConsentSection$Type, s);
	//    0    0:ldc1            #2   <Class ConsentSection$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #81  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConsentSection$Type>
	//    4    9:areturn         
	}

	public static ConsentSection$Type[] values()
	{
		return (ConsentSection$Type[])((ConsentSection$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #73  <Field ConsentSection$Type[] $VALUES>
	//    1    3:invokevirtual   #88  <Method Object _5B_Lorg.researchstack.backbone.model.ConsentSection$Type_3B_.clone()>
	//    2    6:checkcast       #84  <Class ConsentSection$Type[]>
	//    3    9:areturn         
	}

	public String getImageName()
	{
		switch(ConsentSection._cls1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type[ordinal()])
	//*   0    0:getstatic       #96  <Field int[] ConsentSection$1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #100 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     2 8: default 52
	//	               2 54
	//	               3 57
	//	               4 60
	//	               5 63
	//	               6 66
	//	               7 69
	//	               8 72
		default:
			return null;
	//    5   52:aconst_null     
	//    6   53:areturn         

		case 2: // '\002'
			return "rsb_consent_section_data_gathering";
	//    7   54:ldc1            #102 <String "rsb_consent_section_data_gathering">
	//    8   56:areturn         

		case 3: // '\003'
			return "rsb_consent_section_privacy";
	//    9   57:ldc1            #104 <String "rsb_consent_section_privacy">
	//   10   59:areturn         

		case 4: // '\004'
			return "rsb_consent_section_data_use";
	//   11   60:ldc1            #106 <String "rsb_consent_section_data_use">
	//   12   62:areturn         

		case 5: // '\005'
			return "rsb_consent_section_time_commitment";
	//   13   63:ldc1            #108 <String "rsb_consent_section_time_commitment">
	//   14   65:areturn         

		case 6: // '\006'
			return "rsb_consent_section_study_survey";
	//   15   66:ldc1            #110 <String "rsb_consent_section_study_survey">
	//   16   68:areturn         

		case 7: // '\007'
			return "rsb_consent_section_study_tasks";
	//   17   69:ldc1            #112 <String "rsb_consent_section_study_tasks">
	//   18   71:areturn         

		case 8: // '\b'
			return "rsb_consent_section_withdrawing";
	//   19   72:ldc1            #114 <String "rsb_consent_section_withdrawing">
	//   20   74:areturn         
		}
	}

	public int getMoreInfoResId()
	{
		switch(ConsentSection._cls1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type[ordinal()])
	//*   0    0:getstatic       #96  <Field int[] ConsentSection$1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #100 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 8: default 56
	//	               1 60
	//	               2 64
	//	               3 68
	//	               4 72
	//	               5 76
	//	               6 80
	//	               7 84
	//	               8 88
		default:
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info;
	//    5   56:getstatic       #121 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info>
	//    6   59:ireturn         

		case 1: // '\001'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_welcome;
	//    7   60:getstatic       #124 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_welcome>
	//    8   63:ireturn         

		case 2: // '\002'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_data_gathering;
	//    9   64:getstatic       #127 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_data_gathering>
	//   10   67:ireturn         

		case 3: // '\003'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_privacy;
	//   11   68:getstatic       #130 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_privacy>
	//   12   71:ireturn         

		case 4: // '\004'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_data_use;
	//   13   72:getstatic       #133 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_data_use>
	//   14   75:ireturn         

		case 5: // '\005'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_time_commitment;
	//   15   76:getstatic       #136 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_time_commitment>
	//   16   79:ireturn         

		case 6: // '\006'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_study_survey;
	//   17   80:getstatic       #139 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_study_survey>
	//   18   83:ireturn         

		case 7: // '\007'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_study_tasks;
	//   19   84:getstatic       #142 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_study_tasks>
	//   20   87:ireturn         

		case 8: // '\b'
			return org.researchstack.backbone.R.string.rsb_consent_section_more_info_withdrawing;
	//   21   88:getstatic       #145 <Field int org.researchstack.backbone.R$string.rsb_consent_section_more_info_withdrawing>
	//   22   91:ireturn         
		}
	}

	public int getTitleResId()
	{
		switch(ConsentSection._cls1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type[ordinal()])
	//*   0    0:getstatic       #96  <Field int[] ConsentSection$1.$SwitchMap$org$researchstack$backbone$model$ConsentSection$Type>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #100 <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 8: default 56
	//	               1 58
	//	               2 62
	//	               3 66
	//	               4 70
	//	               5 74
	//	               6 78
	//	               7 82
	//	               8 86
		default:
			return -1;
	//    5   56:iconst_m1       
	//    6   57:ireturn         

		case 1: // '\001'
			return org.researchstack.backbone.R.string.rsb_consent_section_welcome;
	//    7   58:getstatic       #149 <Field int org.researchstack.backbone.R$string.rsb_consent_section_welcome>
	//    8   61:ireturn         

		case 2: // '\002'
			return org.researchstack.backbone.R.string.rsb_consent_section_data_gathering;
	//    9   62:getstatic       #151 <Field int org.researchstack.backbone.R$string.rsb_consent_section_data_gathering>
	//   10   65:ireturn         

		case 3: // '\003'
			return org.researchstack.backbone.R.string.rsb_consent_section_privacy;
	//   11   66:getstatic       #153 <Field int org.researchstack.backbone.R$string.rsb_consent_section_privacy>
	//   12   69:ireturn         

		case 4: // '\004'
			return org.researchstack.backbone.R.string.rsb_consent_section_data_use;
	//   13   70:getstatic       #155 <Field int org.researchstack.backbone.R$string.rsb_consent_section_data_use>
	//   14   73:ireturn         

		case 5: // '\005'
			return org.researchstack.backbone.R.string.rsb_consent_section_time_commitment;
	//   15   74:getstatic       #157 <Field int org.researchstack.backbone.R$string.rsb_consent_section_time_commitment>
	//   16   77:ireturn         

		case 6: // '\006'
			return org.researchstack.backbone.R.string.rsb_consent_section_study_survey;
	//   17   78:getstatic       #159 <Field int org.researchstack.backbone.R$string.rsb_consent_section_study_survey>
	//   18   81:ireturn         

		case 7: // '\007'
			return org.researchstack.backbone.R.string.rsb_consent_section_study_tasks;
	//   19   82:getstatic       #161 <Field int org.researchstack.backbone.R$string.rsb_consent_section_study_tasks>
	//   20   85:ireturn         

		case 8: // '\b'
			return org.researchstack.backbone.R.string.rsb_consent_section_withdrawing;
	//   21   86:getstatic       #163 <Field int org.researchstack.backbone.R$string.rsb_consent_section_withdrawing>
	//   22   89:ireturn         
		}
	}

	private static final ConsentSection$Type $VALUES[];
	public static final ConsentSection$Type Custom;
	public static final ConsentSection$Type DataGathering;
	public static final ConsentSection$Type DataUse;
	public static final ConsentSection$Type OnlyInDocument;
	public static final ConsentSection$Type Overview;
	public static final ConsentSection$Type Privacy;
	public static final ConsentSection$Type StudySurvey;
	public static final ConsentSection$Type StudyTasks;
	public static final ConsentSection$Type TimeCommitment;
	public static final ConsentSection$Type Withdrawing;

	static 
	{
		Overview = new ConsentSection$Type("Overview", 0);
	//    0    0:new             #2   <Class ConsentSection$Type>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "Overview">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//    5   10:putstatic       #44  <Field ConsentSection$Type Overview>
		DataGathering = new ConsentSection$Type("DataGathering", 1);
	//    6   13:new             #2   <Class ConsentSection$Type>
	//    7   16:dup             
	//    8   17:ldc1            #45  <String "DataGathering">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   11   23:putstatic       #47  <Field ConsentSection$Type DataGathering>
		Privacy = new ConsentSection$Type("Privacy", 2);
	//   12   26:new             #2   <Class ConsentSection$Type>
	//   13   29:dup             
	//   14   30:ldc1            #48  <String "Privacy">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   17   36:putstatic       #50  <Field ConsentSection$Type Privacy>
		DataUse = new ConsentSection$Type("DataUse", 3);
	//   18   39:new             #2   <Class ConsentSection$Type>
	//   19   42:dup             
	//   20   43:ldc1            #51  <String "DataUse">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   23   49:putstatic       #53  <Field ConsentSection$Type DataUse>
		TimeCommitment = new ConsentSection$Type("TimeCommitment", 4);
	//   24   52:new             #2   <Class ConsentSection$Type>
	//   25   55:dup             
	//   26   56:ldc1            #54  <String "TimeCommitment">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   29   62:putstatic       #56  <Field ConsentSection$Type TimeCommitment>
		StudyTasks = new ConsentSection$Type("StudyTasks", 5);
	//   30   65:new             #2   <Class ConsentSection$Type>
	//   31   68:dup             
	//   32   69:ldc1            #57  <String "StudyTasks">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   35   75:putstatic       #59  <Field ConsentSection$Type StudyTasks>
		StudySurvey = new ConsentSection$Type("StudySurvey", 6);
	//   36   78:new             #2   <Class ConsentSection$Type>
	//   37   81:dup             
	//   38   82:ldc1            #60  <String "StudySurvey">
	//   39   84:bipush          6
	//   40   86:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   41   89:putstatic       #62  <Field ConsentSection$Type StudySurvey>
		Withdrawing = new ConsentSection$Type("Withdrawing", 7);
	//   42   92:new             #2   <Class ConsentSection$Type>
	//   43   95:dup             
	//   44   96:ldc1            #63  <String "Withdrawing">
	//   45   98:bipush          7
	//   46  100:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   47  103:putstatic       #65  <Field ConsentSection$Type Withdrawing>
		Custom = new ConsentSection$Type("Custom", 8);
	//   48  106:new             #2   <Class ConsentSection$Type>
	//   49  109:dup             
	//   50  110:ldc1            #66  <String "Custom">
	//   51  112:bipush          8
	//   52  114:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   53  117:putstatic       #68  <Field ConsentSection$Type Custom>
		OnlyInDocument = new ConsentSection$Type("OnlyInDocument", 9);
	//   54  120:new             #2   <Class ConsentSection$Type>
	//   55  123:dup             
	//   56  124:ldc1            #69  <String "OnlyInDocument">
	//   57  126:bipush          9
	//   58  128:invokespecial   #42  <Method void ConsentSection$Type(String, int)>
	//   59  131:putstatic       #71  <Field ConsentSection$Type OnlyInDocument>
		$VALUES = (new ConsentSection$Type[] {
			Overview, DataGathering, Privacy, DataUse, TimeCommitment, StudyTasks, StudySurvey, Withdrawing, Custom, OnlyInDocument
		});
	//   60  134:bipush          10
	//   61  136:anewarray       ConsentSection$Type[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #44  <Field ConsentSection$Type Overview>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #47  <Field ConsentSection$Type DataGathering>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #50  <Field ConsentSection$Type Privacy>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #53  <Field ConsentSection$Type DataUse>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #56  <Field ConsentSection$Type TimeCommitment>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #59  <Field ConsentSection$Type StudyTasks>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #62  <Field ConsentSection$Type StudySurvey>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #65  <Field ConsentSection$Type Withdrawing>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #68  <Field ConsentSection$Type Custom>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #71  <Field ConsentSection$Type OnlyInDocument>
	//  101  202:aastore         
	//  102  203:putstatic       #73  <Field ConsentSection$Type[] $VALUES>
	//* 103  206:return          
	}

	private ConsentSection$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #75  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
