// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import android.content.res.Resources;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.util.FormattingUtils;
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.researchstack.backbone.model.Choice;

// Referenced classes of package com.pactforcure.app.survey:
//			Choice, SurveyDataException, QuestionType, StepType

public class Question
	implements Serializable
{

	public Question()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		title = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #56  <String "">
	//    4    7:putfield        #58  <Field String title>
		text = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #56  <String "">
	//    7   13:putfield        #60  <Field String text>
		defaultValue = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #56  <String "">
	//   10   19:putfield        #62  <Field String defaultValue>
		step = Integer.valueOf(1);
	//   11   22:aload_0         
	//   12   23:iconst_1        
	//   13   24:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   14   27:putfield        #70  <Field Integer step>
		numberMin = "";
	//   15   30:aload_0         
	//   16   31:ldc1            #56  <String "">
	//   17   33:putfield        #72  <Field String numberMin>
		numberMax = "";
	//   18   36:aload_0         
	//   19   37:ldc1            #56  <String "">
	//   20   39:putfield        #74  <Field String numberMax>
		numberZeroReplacement = "";
	//   21   42:aload_0         
	//   22   43:ldc1            #56  <String "">
	//   23   45:putfield        #76  <Field String numberZeroReplacement>
		numberStringFormat = "%s";
	//   24   48:aload_0         
	//   25   49:ldc1            #78  <String "%s">
	//   26   51:putfield        #80  <Field String numberStringFormat>
		minimumValueDescription = "";
	//   27   54:aload_0         
	//   28   55:ldc1            #56  <String "">
	//   29   57:putfield        #82  <Field String minimumValueDescription>
		maximumValueDescription = "";
	//   30   60:aload_0         
	//   31   61:ldc1            #56  <String "">
	//   32   63:putfield        #84  <Field String maximumValueDescription>
		verticalScale = true;
	//   33   66:aload_0         
	//   34   67:iconst_1        
	//   35   68:putfield        #86  <Field boolean verticalScale>
		globalVariable = "";
	//   36   71:aload_0         
	//   37   72:ldc1            #56  <String "">
	//   38   74:putfield        #88  <Field String globalVariable>
		lastItemOverride = "";
	//   39   77:aload_0         
	//   40   78:ldc1            #56  <String "">
	//   41   80:putfield        #90  <Field String lastItemOverride>
		failComparation = "";
	//   42   83:aload_0         
	//   43   84:ldc1            #56  <String "">
	//   44   86:putfield        #92  <Field String failComparation>
		failValue = "";
	//   45   89:aload_0         
	//   46   90:ldc1            #56  <String "">
	//   47   92:putfield        #94  <Field String failValue>
		failReason = "";
	//   48   95:aload_0         
	//   49   96:ldc1            #56  <String "">
	//   50   98:putfield        #96  <Field String failReason>
		previousQuestion = "";
	//   51  101:aload_0         
	//   52  102:ldc1            #56  <String "">
	//   53  104:putfield        #98  <Field String previousQuestion>
	//   54  107:return          
	}

	private List createTextChoices(List list, List list1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #103 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void ArrayList()>
	//    3    7:astore          4
		for(int i = 0; i < list.size(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:aload_1         
	//*   8   13:invokeinterface #110 <Method int List.size()>
	//*   9   18:icmpge          60
			((List) (arraylist)).add(((Object) (new Choice((String)list.get(i), list1.get(i)))));
	//   10   21:aload           4
	//   11   23:new             #112 <Class Choice>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:iload_3         
	//   15   29:invokeinterface #116 <Method Object List.get(int)>
	//   16   34:checkcast       #118 <Class String>
	//   17   37:aload_2         
	//   18   38:iload_3         
	//   19   39:invokeinterface #116 <Method Object List.get(int)>
	//   20   44:invokespecial   #121 <Method void Choice(String, Object)>
	//   21   47:invokeinterface #125 <Method boolean List.add(Object)>
	//   22   52:pop             

	//   23   53:iload_3         
	//   24   54:iconst_1        
	//   25   55:iadd            
	//   26   56:istore_3        
	//*  27   57:goto            11
		return ((List) (arraylist));
	//   28   60:aload           4
	//   29   62:areturn         
	}

	private String getNumericValue(int i)
	{
		return String.valueOf(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #131 <Method String String.valueOf(int)>
	//    2    4:areturn         
	}

	public List buildBooleanChoices()
	{
		Resources resources = BackboneApplication.get().getResources();
	//    0    0:invokestatic    #138 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #142 <Method Resources BackboneApplication.getResources()>
	//    2    6:astore_1        
		return createTextChoices(Arrays.asList(((Object []) (new String[] {
			resources.getString(0x7f080079), resources.getString(0x7f080076)
		}))), Arrays.asList(((Object []) (new String[] {
			"1", "0"
		}))));
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:anewarray       String[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:ldc1            #143 <Int 0x7f080079>
	//   10   17:invokevirtual   #148 <Method String Resources.getString(int)>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_1         
	//   15   24:ldc1            #149 <Int 0x7f080076>
	//   16   26:invokevirtual   #148 <Method String Resources.getString(int)>
	//   17   29:aastore         
	//   18   30:invokestatic    #155 <Method List Arrays.asList(Object[])>
	//   19   33:iconst_2        
	//   20   34:anewarray       String[]
	//   21   37:dup             
	//   22   38:iconst_0        
	//   23   39:ldc1            #157 <String "1">
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_1        
	//   27   44:ldc1            #159 <String "0">
	//   28   46:aastore         
	//   29   47:invokestatic    #155 <Method List Arrays.asList(Object[])>
	//   30   50:invokespecial   #161 <Method List createTextChoices(List, List)>
	//   31   53:areturn         
	}

	public List buildChoicesText()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #103 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void ArrayList()>
	//    3    7:astore_1        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #103 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #104 <Method void ArrayList()>
	//    7   15:astore_2        
		com.pactforcure.app.survey.Choice choice;
		for(Iterator iterator = getChoices().iterator(); iterator.hasNext(); ((List) (arraylist1)).add(((Object) (choice.getValue()))))
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #166 <Method List getChoices()>
	//*  10   20:invokeinterface #170 <Method Iterator List.iterator()>
	//*  11   25:astore_3        
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            73
		{
			choice = (com.pactforcure.app.survey.Choice)iterator.next();
	//   15   35:aload_3         
	//   16   36:invokeinterface #180 <Method Object Iterator.next()>
	//   17   41:checkcast       #182 <Class com.pactforcure.app.survey.Choice>
	//   18   44:astore          4
			((List) (arraylist)).add(((Object) (choice.getText())));
	//   19   46:aload_1         
	//   20   47:aload           4
	//   21   49:invokevirtual   #186 <Method String Choice.getText()>
	//   22   52:invokeinterface #125 <Method boolean List.add(Object)>
	//   23   57:pop             
		}

	//   24   58:aload_2         
	//   25   59:aload           4
	//   26   61:invokevirtual   #189 <Method String Choice.getValue()>
	//   27   64:invokeinterface #125 <Method boolean List.add(Object)>
	//   28   69:pop             
	//*  29   70:goto            26
		return createTextChoices(((List) (arraylist)), ((List) (arraylist1)));
	//   30   73:aload_0         
	//   31   74:aload_1         
	//   32   75:aload_2         
	//   33   76:invokespecial   #161 <Method List createTextChoices(List, List)>
	//   34   79:areturn         
	}

	public List buildNumericChoices()
		throws SurveyDataException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #103 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void ArrayList()>
	//    3    7:astore_3        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #103 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #104 <Method void ArrayList()>
	//    7   15:astore          4
		int j = getMax();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #195 <Method int getMax()>
	//   10   21:istore_2        
		for(int i = getMin(); i <= j; i += getStep().intValue())
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #198 <Method int getMin()>
	//*  13   26:istore_1        
	//*  14   27:iload_1         
	//*  15   28:iload_2         
	//*  16   29:icmpgt          70
		{
			((List) (arraylist)).add(((Object) (getNumericLabel(i))));
	//   17   32:aload_3         
	//   18   33:aload_0         
	//   19   34:iload_1         
	//   20   35:invokevirtual   #201 <Method String getNumericLabel(int)>
	//   21   38:invokeinterface #125 <Method boolean List.add(Object)>
	//   22   43:pop             
			((List) (arraylist1)).add(((Object) (getNumericValue(i))));
	//   23   44:aload           4
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:invokespecial   #203 <Method String getNumericValue(int)>
	//   27   51:invokeinterface #125 <Method boolean List.add(Object)>
	//   28   56:pop             
		}

	//   29   57:iload_1         
	//   30   58:aload_0         
	//   31   59:invokevirtual   #207 <Method Integer getStep()>
	//   32   62:invokevirtual   #210 <Method int Integer.intValue()>
	//   33   65:iadd            
	//   34   66:istore_1        
	//*  35   67:goto            27
		return createTextChoices(((List) (arraylist)), ((List) (arraylist1)));
	//   36   70:aload_0         
	//   37   71:aload_3         
	//   38   72:aload           4
	//   39   74:invokespecial   #161 <Method List createTextChoices(List, List)>
	//   40   77:areturn         
	}

	public List getChoices()
	{
		return choices;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field List choices>
	//    2    4:areturn         
	}

	public String getDefaultValue()
	{
		return defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String defaultValue>
	//    2    4:areturn         
	}

	public String getFailComparation()
	{
		return failComparation;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String failComparation>
	//    2    4:areturn         
	}

	public String getFailReason()
	{
		return failReason;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String failReason>
	//    2    4:areturn         
	}

	public String getFailValue()
	{
		return failValue;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String failValue>
	//    2    4:areturn         
	}

	public String getGlobalVariable()
	{
		return globalVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String globalVariable>
	//    2    4:areturn         
	}

	public String getLastItemOverride()
	{
		return lastItemOverride;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String lastItemOverride>
	//    2    4:areturn         
	}

	public Integer getLastItemOverrideMinValue()
	{
		return lastItemOverrideMinValue;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field Integer lastItemOverrideMinValue>
	//    2    4:areturn         
	}

	public int getMax()
		throws SurveyDataException
	{
		if(!NumberUtils.isNumber(getNumberMaxFormatted()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #226 <Method String getNumberMaxFormatted()>
	//*   2    4:invokestatic    #232 <Method boolean NumberUtils.isNumber(String)>
	//*   3    7:ifne            34
			throw new SurveyDataException(String.format("Invalid question max number %s", new Object[] {
				getNumberMaxFormatted()
			}));
	//    4   10:new             #192 <Class SurveyDataException>
	//    5   13:dup             
	//    6   14:ldc1            #234 <String "Invalid question max number %s">
	//    7   16:iconst_1        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_0         
	//   12   23:invokevirtual   #226 <Method String getNumberMaxFormatted()>
	//   13   26:aastore         
	//   14   27:invokestatic    #238 <Method String String.format(String, Object[])>
	//   15   30:invokespecial   #241 <Method void SurveyDataException(String)>
	//   16   33:athrow          
		else
			return Integer.valueOf(getNumberMaxFormatted()).intValue();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #226 <Method String getNumberMaxFormatted()>
	//   19   38:invokestatic    #244 <Method Integer Integer.valueOf(String)>
	//   20   41:invokevirtual   #210 <Method int Integer.intValue()>
	//   21   44:ireturn         
	}

	public String getMaximumValueDescription()
	{
		return maximumValueDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String maximumValueDescription>
	//    2    4:areturn         
	}

	public int getMin()
		throws SurveyDataException
	{
		if(!NumberUtils.isNumber(getNumberMinFormatted()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #248 <Method String getNumberMinFormatted()>
	//*   2    4:invokestatic    #232 <Method boolean NumberUtils.isNumber(String)>
	//*   3    7:ifne            34
			throw new SurveyDataException(String.format("Invalid question min number %s", new Object[] {
				getNumberMinFormatted()
			}));
	//    4   10:new             #192 <Class SurveyDataException>
	//    5   13:dup             
	//    6   14:ldc1            #250 <String "Invalid question min number %s">
	//    7   16:iconst_1        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_0         
	//   12   23:invokevirtual   #248 <Method String getNumberMinFormatted()>
	//   13   26:aastore         
	//   14   27:invokestatic    #238 <Method String String.format(String, Object[])>
	//   15   30:invokespecial   #241 <Method void SurveyDataException(String)>
	//   16   33:athrow          
		else
			return Integer.valueOf(getNumberMinFormatted()).intValue();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #248 <Method String getNumberMinFormatted()>
	//   19   38:invokestatic    #244 <Method Integer Integer.valueOf(String)>
	//   20   41:invokevirtual   #210 <Method int Integer.intValue()>
	//   21   44:ireturn         
	}

	public String getMinimumValueDescription()
	{
		return minimumValueDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String minimumValueDescription>
	//    2    4:areturn         
	}

	public String getNextQuestionCode()
	{
		return nextQuestionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field String nextQuestionCode>
	//    2    4:areturn         
	}

	public List getNextQuestions()
	{
		return nextQuestions;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field List nextQuestions>
	//    2    4:areturn         
	}

	public String getNumberMax()
	{
		return numberMax;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String numberMax>
	//    2    4:areturn         
	}

	public String getNumberMaxFormatted()
	{
		return numberMaxFormatted;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field String numberMaxFormatted>
	//    2    4:areturn         
	}

	public String getNumberMin()
	{
		return numberMin;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String numberMin>
	//    2    4:areturn         
	}

	public String getNumberMinFormatted()
	{
		return numberMinFormatted;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field String numberMinFormatted>
	//    2    4:areturn         
	}

	public String getNumberStringFormat()
	{
		return numberStringFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String numberStringFormat>
	//    2    4:areturn         
	}

	public String getNumberZeroReplacement()
	{
		return numberZeroReplacement;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String numberZeroReplacement>
	//    2    4:areturn         
	}

	public String getNumericLabel(int i)
		throws SurveyDataException
	{
		String s1 = String.valueOf(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #131 <Method String String.valueOf(int)>
	//    2    4:astore_3        
		String s2 = getNumberStringFormat();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #270 <Method String getNumberStringFormat()>
	//    5    9:astore          4
		if(isNumberShowAsOrdinal())
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #273 <Method boolean isNumberShowAsOrdinal()>
	//*   8   15:ifeq            23
			s1 = FormattingUtils.ordinal(i);
	//    9   18:iload_1         
	//   10   19:invokestatic    #278 <Method String FormattingUtils.ordinal(int)>
	//   11   22:astore_3        
		String s = s1;
	//   12   23:aload_3         
	//   13   24:astore_2        
		if(!getNumberZeroReplacement().equals(""))
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #280 <Method String getNumberZeroReplacement()>
	//*  16   29:ldc1            #56  <String "">
	//*  17   31:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  18   34:ifne            48
		{
			s = s1;
	//   19   37:aload_3         
	//   20   38:astore_2        
			if(i == 0)
	//*  21   39:iload_1         
	//*  22   40:ifne            48
				s = numberZeroReplacement;
	//   23   43:aload_0         
	//   24   44:getfield        #76  <Field String numberZeroReplacement>
	//   25   47:astore_2        
		}
		s1 = s;
	//   26   48:aload_2         
	//   27   49:astore_3        
		if(isAddPlusSignToLastItem())
	//*  28   50:aload_0         
	//*  29   51:invokevirtual   #286 <Method boolean isAddPlusSignToLastItem()>
	//*  30   54:ifeq            88
		{
			s1 = s;
	//   31   57:aload_2         
	//   32   58:astore_3        
			if(i == getMax())
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #195 <Method int getMax()>
	//*  36   64:icmpne          88
				s1 = (new StringBuilder()).append(s).append("+").toString();
	//   37   67:new             #288 <Class StringBuilder>
	//   38   70:dup             
	//   39   71:invokespecial   #289 <Method void StringBuilder()>
	//   40   74:aload_2         
	//   41   75:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:ldc2            #295 <String "+">
	//   43   81:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:invokevirtual   #298 <Method String StringBuilder.toString()>
	//   45   87:astore_3        
		}
		s = s1;
	//   46   88:aload_3         
	//   47   89:astore_2        
		if(!getLastItemOverride().equals(""))
	//*  48   90:aload_0         
	//*  49   91:invokevirtual   #300 <Method String getLastItemOverride()>
	//*  50   94:ldc1            #56  <String "">
	//*  51   96:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  52   99:ifne            140
		{
			s = s1;
	//   53  102:aload_3         
	//   54  103:astore_2        
			if(i == getMax())
	//*  55  104:iload_1         
	//*  56  105:aload_0         
	//*  57  106:invokevirtual   #195 <Method int getMax()>
	//*  58  109:icmpne          140
				if(getLastItemOverrideMinValue().intValue() > 0)
	//*  59  112:aload_0         
	//*  60  113:invokevirtual   #302 <Method Integer getLastItemOverrideMinValue()>
	//*  61  116:invokevirtual   #210 <Method int Integer.intValue()>
	//*  62  119:ifle            154
				{
					s = s1;
	//   63  122:aload_3         
	//   64  123:astore_2        
					if(i >= lastItemOverrideMinValue.intValue())
	//*  65  124:iload_1         
	//*  66  125:aload_0         
	//*  67  126:getfield        #223 <Field Integer lastItemOverrideMinValue>
	//*  68  129:invokevirtual   #210 <Method int Integer.intValue()>
	//*  69  132:icmplt          140
						s = lastItemOverride;
	//   70  135:aload_0         
	//   71  136:getfield        #90  <Field String lastItemOverride>
	//   72  139:astore_2        
				} else
	//*  73  140:aload           4
	//*  74  142:iconst_1        
	//*  75  143:anewarray       Object[]
	//*  76  146:dup             
	//*  77  147:iconst_0        
	//*  78  148:aload_2         
	//*  79  149:aastore         
	//*  80  150:invokestatic    #238 <Method String String.format(String, Object[])>
	//*  81  153:areturn         
				{
					s = lastItemOverride;
	//   82  154:aload_0         
	//   83  155:getfield        #90  <Field String lastItemOverride>
	//   84  158:astore_2        
				}
		}
		return String.format(s2, new Object[] {
			s
		});
	//*  85  159:goto            140
	}

	public String getPreviousQuestion()
	{
		return previousQuestion;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String previousQuestion>
	//    2    4:areturn         
	}

	public String getQuestionCode()
	{
		return questionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field String questionCode>
	//    2    4:areturn         
	}

	public QuestionType getQuestionType()
	{
		return questionType;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field QuestionType questionType>
	//    2    4:areturn         
	}

	public com.pactforcure.app.survey.Choice getSelectedChoiceByValue(String s)
	{
		for(Iterator iterator = choices.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field List choices>
	//*   2    4:invokeinterface #170 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			com.pactforcure.app.survey.Choice choice = (com.pactforcure.app.survey.Choice)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #180 <Method Object Iterator.next()>
	//    9   25:checkcast       #182 <Class com.pactforcure.app.survey.Choice>
	//   10   28:astore_3        
			if(choice.getValue().equals(((Object) (s))))
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #189 <Method String Choice.getValue()>
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  15   37:ifeq            10
				return choice;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public Integer getStep()
	{
		return step;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Integer step>
	//    2    4:areturn         
	}

	public StepType getStepType()
	{
		return stepType;
	//    0    0:aload_0         
	//    1    1:getfield        #316 <Field StepType stepType>
	//    2    4:areturn         
	}

	public String getSurveyCode()
	{
		return surveyCode;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field String surveyCode>
	//    2    4:areturn         
	}

	public String getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String text>
	//    2    4:areturn         
	}

	public String getTextFormatted()
	{
		return textFormatted;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field String textFormatted>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String title>
	//    2    4:areturn         
	}

	public String getTitleFormatted()
	{
		return titleFormatted;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field String titleFormatted>
	//    2    4:areturn         
	}

	public boolean isAddPlusSignToLastItem()
	{
		return addPlusSignToLastItem;
	//    0    0:aload_0         
	//    1    1:getfield        #328 <Field boolean addPlusSignToLastItem>
	//    2    4:ireturn         
	}

	public boolean isNumberShowAsOrdinal()
	{
		return numberShowAsOrdinal;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field boolean numberShowAsOrdinal>
	//    2    4:ireturn         
	}

	public boolean isOptional()
	{
		return optional;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field boolean optional>
	//    2    4:ireturn         
	}

	public boolean isUsesGlobalVariable()
	{
		return usesGlobalVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field boolean usesGlobalVariable>
	//    2    4:ireturn         
	}

	public boolean isVerticalScale()
	{
		return verticalScale;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean verticalScale>
	//    2    4:ireturn         
	}

	public void replaceTitleVariables(Map map)
	{
		titleFormatted = title;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field String title>
	//    3    5:putfield        #326 <Field String titleFormatted>
		textFormatted = text;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field String text>
	//    7   13:putfield        #322 <Field String textFormatted>
		numberMinFormatted = numberMin;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field String numberMin>
	//   11   21:putfield        #266 <Field String numberMinFormatted>
		numberMaxFormatted = numberMax;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #74  <Field String numberMax>
	//   15   29:putfield        #263 <Field String numberMaxFormatted>
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
	//*  16   32:aload_1         
	//*  17   33:invokeinterface #345 <Method Set Map.keySet()>
	//*  18   38:invokeinterface #348 <Method Iterator Set.iterator()>
	//*  19   43:astore          5
	//*  20   45:aload           5
	//*  21   47:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//*  22   52:ifeq            197
		{
			String s3 = (String)iterator.next();
	//   23   55:aload           5
	//   24   57:invokeinterface #180 <Method Object Iterator.next()>
	//   25   62:checkcast       #118 <Class String>
	//   26   65:astore          6
			String s1 = String.valueOf(map.get(((Object) (s3))));
	//   27   67:aload_1         
	//   28   68:aload           6
	//   29   70:invokeinterface #351 <Method Object Map.get(Object)>
	//   30   75:invokestatic    #354 <Method String String.valueOf(Object)>
	//   31   78:astore_3        
			String s2 = (String)map.get(((Object) ((new StringBuilder()).append(s3).append("_label").toString())));
	//   32   79:aload_1         
	//   33   80:new             #288 <Class StringBuilder>
	//   34   83:dup             
	//   35   84:invokespecial   #289 <Method void StringBuilder()>
	//   36   87:aload           6
	//   37   89:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   38   92:ldc2            #356 <String "_label">
	//   39   95:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   40   98:invokevirtual   #298 <Method String StringBuilder.toString()>
	//   41  101:invokeinterface #351 <Method Object Map.get(Object)>
	//   42  106:checkcast       #118 <Class String>
	//   43  109:astore          4
			String s = s2;
	//   44  111:aload           4
	//   45  113:astore_2        
			if(s2 == null)
	//*  46  114:aload           4
	//*  47  116:ifnonnull       121
				s = s1;
	//   48  119:aload_3         
	//   49  120:astore_2        
			s2 = String.format("{%s}", new Object[] {
				s3
			});
	//   50  121:ldc2            #358 <String "{%s}">
	//   51  124:iconst_1        
	//   52  125:anewarray       Object[]
	//   53  128:dup             
	//   54  129:iconst_0        
	//   55  130:aload           6
	//   56  132:aastore         
	//   57  133:invokestatic    #238 <Method String String.format(String, Object[])>
	//   58  136:astore          4
			titleFormatted = titleFormatted.replace(((CharSequence) (s2)), ((CharSequence) (s)));
	//   59  138:aload_0         
	//   60  139:aload_0         
	//   61  140:getfield        #326 <Field String titleFormatted>
	//   62  143:aload           4
	//   63  145:aload_2         
	//   64  146:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//   65  149:putfield        #326 <Field String titleFormatted>
			textFormatted = textFormatted.replace(((CharSequence) (s2)), ((CharSequence) (s)));
	//   66  152:aload_0         
	//   67  153:aload_0         
	//   68  154:getfield        #322 <Field String textFormatted>
	//   69  157:aload           4
	//   70  159:aload_2         
	//   71  160:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//   72  163:putfield        #322 <Field String textFormatted>
			numberMinFormatted = numberMinFormatted.replace(((CharSequence) (s2)), ((CharSequence) (s1)));
	//   73  166:aload_0         
	//   74  167:aload_0         
	//   75  168:getfield        #266 <Field String numberMinFormatted>
	//   76  171:aload           4
	//   77  173:aload_3         
	//   78  174:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//   79  177:putfield        #266 <Field String numberMinFormatted>
			numberMaxFormatted = numberMaxFormatted.replace(((CharSequence) (s2)), ((CharSequence) (s1)));
	//   80  180:aload_0         
	//   81  181:aload_0         
	//   82  182:getfield        #263 <Field String numberMaxFormatted>
	//   83  185:aload           4
	//   84  187:aload_3         
	//   85  188:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//   86  191:putfield        #263 <Field String numberMaxFormatted>
		}

	//*  87  194:goto            45
		titleFormatted = titleFormatted.replace("  ", " ");
	//   88  197:aload_0         
	//   89  198:aload_0         
	//   90  199:getfield        #326 <Field String titleFormatted>
	//   91  202:ldc2            #364 <String "  ">
	//   92  205:ldc2            #366 <String " ">
	//   93  208:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//   94  211:putfield        #326 <Field String titleFormatted>
		textFormatted = textFormatted.replace("  ", " ");
	//   95  214:aload_0         
	//   96  215:aload_0         
	//   97  216:getfield        #322 <Field String textFormatted>
	//   98  219:ldc2            #364 <String "  ">
	//   99  222:ldc2            #366 <String " ">
	//  100  225:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//  101  228:putfield        #322 <Field String textFormatted>
		numberMinFormatted = numberMinFormatted.replace("  ", " ");
	//  102  231:aload_0         
	//  103  232:aload_0         
	//  104  233:getfield        #266 <Field String numberMinFormatted>
	//  105  236:ldc2            #364 <String "  ">
	//  106  239:ldc2            #366 <String " ">
	//  107  242:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//  108  245:putfield        #266 <Field String numberMinFormatted>
		numberMaxFormatted = numberMaxFormatted.replace("  ", " ");
	//  109  248:aload_0         
	//  110  249:aload_0         
	//  111  250:getfield        #263 <Field String numberMaxFormatted>
	//  112  253:ldc2            #364 <String "  ">
	//  113  256:ldc2            #366 <String " ">
	//  114  259:invokevirtual   #362 <Method String String.replace(CharSequence, CharSequence)>
	//  115  262:putfield        #263 <Field String numberMaxFormatted>
	//  116  265:return          
	}

	public void setAddPlusSignToLastItem(boolean flag)
	{
		addPlusSignToLastItem = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #328 <Field boolean addPlusSignToLastItem>
	//    3    5:return          
	}

	public void setChoices(List list)
	{
		choices = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #213 <Field List choices>
	//    3    5:return          
	}

	public void setDefaultValue(String s)
	{
		defaultValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String defaultValue>
	//    3    5:return          
	}

	public void setFailComparation(String s)
	{
		failComparation = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String failComparation>
	//    3    5:return          
	}

	public void setFailReason(String s)
	{
		failReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field String failReason>
	//    3    5:return          
	}

	public void setFailValue(String s)
	{
		failValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field String failValue>
	//    3    5:return          
	}

	public void setGlobalVariable(String s)
	{
		globalVariable = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String globalVariable>
	//    3    5:return          
	}

	public void setLastItemOverride(String s)
	{
		lastItemOverride = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field String lastItemOverride>
	//    3    5:return          
	}

	public void setLastItemOverrideMinValue(Integer integer)
	{
		lastItemOverrideMinValue = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #223 <Field Integer lastItemOverrideMinValue>
	//    3    5:return          
	}

	public void setMaximumValueDescription(String s)
	{
		maximumValueDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String maximumValueDescription>
	//    3    5:return          
	}

	public void setMinimumValueDescription(String s)
	{
		minimumValueDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field String minimumValueDescription>
	//    3    5:return          
	}

	public void setNextQuestionCode(String s)
	{
		nextQuestionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #254 <Field String nextQuestionCode>
	//    3    5:return          
	}

	public void setNextQuestions(List list)
	{
		nextQuestions = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #258 <Field List nextQuestions>
	//    3    5:return          
	}

	public void setNumberMax(String s)
	{
		numberMax = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field String numberMax>
	//    3    5:return          
	}

	public void setNumberMaxFormatted(String s)
	{
		numberMaxFormatted = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #263 <Field String numberMaxFormatted>
	//    3    5:return          
	}

	public void setNumberMin(String s)
	{
		numberMin = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String numberMin>
	//    3    5:return          
	}

	public void setNumberMinFormatted(String s)
	{
		numberMinFormatted = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #266 <Field String numberMinFormatted>
	//    3    5:return          
	}

	public void setNumberShowAsOrdinal(boolean flag)
	{
		numberShowAsOrdinal = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #330 <Field boolean numberShowAsOrdinal>
	//    3    5:return          
	}

	public void setNumberStringFormat(String s)
	{
		numberStringFormat = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field String numberStringFormat>
	//    3    5:return          
	}

	public void setNumberZeroReplacement(String s)
	{
		numberZeroReplacement = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String numberZeroReplacement>
	//    3    5:return          
	}

	public void setOptional(boolean flag)
	{
		optional = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #333 <Field boolean optional>
	//    3    5:return          
	}

	public void setPreviousQuestion(String s)
	{
		previousQuestion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field String previousQuestion>
	//    3    5:return          
	}

	public void setQuestionCode(String s)
	{
		questionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #306 <Field String questionCode>
	//    3    5:return          
	}

	public void setQuestionType(QuestionType questiontype)
	{
		questionType = questiontype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #310 <Field QuestionType questionType>
	//    3    5:return          
	}

	public void setStep(Integer integer)
	{
		step = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field Integer step>
	//    3    5:return          
	}

	public void setStepType(StepType steptype)
	{
		stepType = steptype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #316 <Field StepType stepType>
	//    3    5:return          
	}

	public void setSurveyCode(String s)
	{
		surveyCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #319 <Field String surveyCode>
	//    3    5:return          
	}

	public void setText(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String text>
	//    3    5:return          
	}

	public void setTextFormatted(String s)
	{
		textFormatted = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #322 <Field String textFormatted>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String title>
	//    3    5:return          
	}

	public void setTitleFormatted(String s)
	{
		titleFormatted = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #326 <Field String titleFormatted>
	//    3    5:return          
	}

	public void setUsesGlobalVariable(boolean flag)
	{
		usesGlobalVariable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #336 <Field boolean usesGlobalVariable>
	//    3    5:return          
	}

	public void setVerticalScale(boolean flag)
	{
		verticalScale = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean verticalScale>
	//    3    5:return          
	}

	public static final String EMPTY_TAG = "<EMPTY>";
	private boolean addPlusSignToLastItem;
	private List choices;
	private String defaultValue;
	private String failComparation;
	private String failReason;
	private String failValue;
	private String globalVariable;
	private String lastItemOverride;
	private Integer lastItemOverrideMinValue;
	private String maximumValueDescription;
	private String minimumValueDescription;
	private String nextQuestionCode;
	private List nextQuestions;
	private String numberMax;
	private String numberMaxFormatted;
	private String numberMin;
	private String numberMinFormatted;
	private boolean numberShowAsOrdinal;
	private String numberStringFormat;
	private String numberZeroReplacement;
	private boolean optional;
	private String previousQuestion;
	private String questionCode;
	private QuestionType questionType;
	private Integer step;
	private StepType stepType;
	private String surveyCode;
	private String text;
	private String textFormatted;
	private String title;
	private String titleFormatted;
	private boolean usesGlobalVariable;
	private boolean verticalScale;
}
