// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import java.util.*;
import org.apache.commons.lang3.time.DateUtils;

// Referenced classes of package com.pactforcure.app.tip:
//			TipOfTheWeekStorage

public class TipOfTheWeekContentFetcher
{

	public TipOfTheWeekContentFetcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static String[] getDeliveredTips()
	{
		int j = getNumberOfDeliveredTips();
	//    0    0:invokestatic    #18  <Method int getNumberOfDeliveredTips()>
	//    1    3:istore_1        
		ArrayList arraylist = new ArrayList(j);
	//    2    4:new             #20  <Class ArrayList>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #23  <Method void ArrayList(int)>
	//    6   12:astore_2        
		for(int i = 1; i <= j; i++)
	//*   7   13:iconst_1        
	//*   8   14:istore_0        
	//*   9   15:iload_0         
	//*  10   16:iload_1         
	//*  11   17:icmpgt          36
			arraylist.add(((Object) (getTipContent(i))));
	//   12   20:aload_2         
	//   13   21:iload_0         
	//   14   22:invokestatic    #27  <Method String getTipContent(int)>
	//   15   25:invokevirtual   #31  <Method boolean ArrayList.add(Object)>
	//   16   28:pop             

	//   17   29:iload_0         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_0        
	//*  21   33:goto            15
		return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//   22   36:aload_2         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #34  <Method int ArrayList.size()>
	//   25   41:anewarray       String[]
	//   26   44:invokevirtual   #40  <Method Object[] ArrayList.toArray(Object[])>
	//   27   47:checkcast       #42  <Class String[]>
	//   28   50:areturn         
	}

	public static int getNumberOfDeliveredTips()
	{
		Object obj = ((Object) (ParticipantStorage.getParticipant()));
	//    0    0:invokestatic    #48  <Method Participant ParticipantStorage.getParticipant()>
	//    1    3:astore_0        
		if(obj != null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       10
	//*   4    8:iconst_0        
	//*   5    9:ireturn         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #54  <Method Date Participant.getSignedPDF()>
	//*   8   14:astore_0        
			if((obj = ((Object) (((Participant) (obj)).getSignedPDF()))) != null)
	//*   9   15:aload_0         
	//*  10   16:ifnull          8
				return getNumberOfDeliveredTips(((Date) (obj)), Calendar.getInstance());
	//   11   19:aload_0         
	//   12   20:invokestatic    #60  <Method Calendar Calendar.getInstance()>
	//   13   23:invokestatic    #63  <Method int getNumberOfDeliveredTips(Date, Calendar)>
	//   14   26:ireturn         
		return 0;
	}

	public static int getNumberOfDeliveredTips(Date date, Calendar calendar)
	{
		return getNumberOfDeliveredTips(date, calendar, TipOfTheWeekStorage.getOffsetSentByServer());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method int TipOfTheWeekStorage.getOffsetSentByServer()>
	//    3    5:invokestatic    #71  <Method int getNumberOfDeliveredTips(Date, Calendar, int)>
	//    4    8:ireturn         
	}

	public static int getNumberOfDeliveredTips(Date date, Calendar calendar, int i)
	{
		int j = i;
	//    0    0:iload_2         
	//    1    1:istore_3        
		Calendar calendar1 = Calendar.getInstance();
	//    2    2:invokestatic    #60  <Method Calendar Calendar.getInstance()>
	//    3    5:astore          4
		calendar1.setTime(date);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:invokevirtual   #75  <Method void Calendar.setTime(Date)>
		Calendar calendar2 = Calendar.getInstance();
	//    7   13:invokestatic    #60  <Method Calendar Calendar.getInstance()>
	//    8   16:astore          5
		calendar2.setTime(date);
	//    9   18:aload           5
	//   10   20:aload_0         
	//   11   21:invokevirtual   #75  <Method void Calendar.setTime(Date)>
		i = j;
	//   12   24:iload_3         
	//   13   25:istore_2        
		if(!DateUtils.isSameDay(calendar2, calendar))
	//*  14   26:aload           5
	//*  15   28:aload_1         
	//*  16   29:invokestatic    #81  <Method boolean DateUtils.isSameDay(Calendar, Calendar)>
	//*  17   32:ifne            77
		{
			i = j;
	//   18   35:iload_3         
	//   19   36:istore_2        
			if(calendar2.get(7) != 1)
	//*  20   37:aload           5
	//*  21   39:bipush          7
	//*  22   41:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  23   44:iconst_1        
	//*  24   45:icmpeq          77
			{
				i = j;
	//   25   48:iload_3         
	//   26   49:istore_2        
				if(calendar2.before(((Object) (calendar))))
	//*  27   50:aload           5
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #88  <Method boolean Calendar.before(Object)>
	//*  30   56:ifeq            77
				{
					i = j;
	//   31   59:iload_3         
	//   32   60:istore_2        
					if(calendar2.get(11) >= 20)
	//*  33   61:aload           5
	//*  34   63:bipush          11
	//*  35   65:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  36   68:bipush          20
	//*  37   70:icmplt          77
						i = j + 1;
	//   38   73:iload_3         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_2        
				}
			}
		}
		j = i;
	//   42   77:iload_2         
	//   43   78:istore_3        
		if(calendar2.get(7) == 1)
	//*  44   79:aload           5
	//*  45   81:bipush          7
	//*  46   83:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  47   86:iconst_1        
	//*  48   87:icmpne          131
		{
			j = i;
	//   49   90:iload_2         
	//   50   91:istore_3        
			if(calendar.get(7) == 1)
	//*  51   92:aload_1         
	//*  52   93:bipush          7
	//*  53   95:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  54   98:iconst_1        
	//*  55   99:icmpne          131
			{
				j = i;
	//   56  102:iload_2         
	//   57  103:istore_3        
				if(calendar2.get(11) >= 20)
	//*  58  104:aload           5
	//*  59  106:bipush          11
	//*  60  108:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  61  111:bipush          20
	//*  62  113:icmplt          131
				{
					j = i;
	//   63  116:iload_2         
	//   64  117:istore_3        
					if(!DateUtils.isSameDay(calendar2, calendar))
	//*  65  118:aload           5
	//*  66  120:aload_1         
	//*  67  121:invokestatic    #81  <Method boolean DateUtils.isSameDay(Calendar, Calendar)>
	//*  68  124:ifne            131
						j = i + 1;
	//   69  127:iload_2         
	//   70  128:iconst_1        
	//   71  129:iadd            
	//   72  130:istore_3        
				}
			}
		}
		while(calendar2.before(((Object) (calendar)))) 
	//*  73  131:aload           5
	//*  74  133:aload_1         
	//*  75  134:invokevirtual   #88  <Method boolean Calendar.before(Object)>
	//*  76  137:ifeq            244
		{
			i = j;
	//   77  140:iload_3         
	//   78  141:istore_2        
			if(calendar2.get(7) == 1)
	//*  79  142:aload           5
	//*  80  144:bipush          7
	//*  81  146:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  82  149:iconst_1        
	//*  83  150:icmpne          193
				if(DateUtils.isSameDay(calendar2, calendar))
	//*  84  153:aload           5
	//*  85  155:aload_1         
	//*  86  156:invokestatic    #81  <Method boolean DateUtils.isSameDay(Calendar, Calendar)>
	//*  87  159:ifeq            206
				{
					i = j;
	//   88  162:iload_3         
	//   89  163:istore_2        
					if(calendar2.get(11) < 20)
	//*  90  164:aload           5
	//*  91  166:bipush          11
	//*  92  168:invokevirtual   #85  <Method int Calendar.get(int)>
	//*  93  171:bipush          20
	//*  94  173:icmpge          193
					{
						i = j;
	//   95  176:iload_3         
	//   96  177:istore_2        
						if(calendar.get(11) >= 20)
	//*  97  178:aload_1         
	//*  98  179:bipush          11
	//*  99  181:invokevirtual   #85  <Method int Calendar.get(int)>
	//* 100  184:bipush          20
	//* 101  186:icmplt          193
							i = j + 1;
	//  102  189:iload_3         
	//  103  190:iconst_1        
	//  104  191:iadd            
	//  105  192:istore_2        
					}
				} else
	//* 106  193:aload           5
	//* 107  195:bipush          6
	//* 108  197:iconst_1        
	//* 109  198:invokevirtual   #91  <Method void Calendar.add(int, int)>
	//* 110  201:iload_2         
	//* 111  202:istore_3        
	//* 112  203:goto            131
				if(!DateUtils.isSameDay(calendar1, calendar2))
	//* 113  206:aload           4
	//* 114  208:aload           5
	//* 115  210:invokestatic    #81  <Method boolean DateUtils.isSameDay(Calendar, Calendar)>
	//* 116  213:ifne            223
				{
					i = j + 1;
	//  117  216:iload_3         
	//  118  217:iconst_1        
	//  119  218:iadd            
	//  120  219:istore_2        
				} else
	//* 121  220:goto            193
				{
					i = j;
	//  122  223:iload_3         
	//  123  224:istore_2        
					if(calendar2.get(11) < 20)
	//* 124  225:aload           5
	//* 125  227:bipush          11
	//* 126  229:invokevirtual   #85  <Method int Calendar.get(int)>
	//* 127  232:bipush          20
	//* 128  234:icmpge          193
						i = j + 1;
	//  129  237:iload_3         
	//  130  238:iconst_1        
	//  131  239:iadd            
	//  132  240:istore_2        
				}
			calendar2.add(6, 1);
			j = i;
		}
	//* 133  241:goto            193
		return Math.min(j, 40);
	//  134  244:iload_3         
	//  135  245:bipush          40
	//  136  247:invokestatic    #97  <Method int Math.min(int, int)>
	//  137  250:ireturn         
	}

	public static String getTipContent(int i)
	{
		if(i <= 0 || i > 40)
	//*   0    0:iload_0         
	//*   1    1:ifle            10
	//*   2    4:iload_0         
	//*   3    5:bipush          40
	//*   4    7:icmple          20
			throw new IllegalArgumentException("invalid tip index");
	//    5   10:new             #99  <Class IllegalArgumentException>
	//    6   13:dup             
	//    7   14:ldc1            #101 <String "invalid tip index">
	//    8   16:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		else
			return Res.getStudySpecificString(String.format(Locale.US, "tip_%d", new Object[] {
				Integer.valueOf(i)
			}));
	//   10   20:getstatic       #110 <Field Locale Locale.US>
	//   11   23:ldc1            #112 <String "tip_%d">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:iload_0         
	//   17   32:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//   18   35:aastore         
	//   19   36:invokestatic    #122 <Method String String.format(Locale, String, Object[])>
	//   20   39:invokestatic    #128 <Method String Res.getStudySpecificString(String)>
	//   21   42:areturn         
	}

	public static final int TOTAL_TIPS = 40;
}
