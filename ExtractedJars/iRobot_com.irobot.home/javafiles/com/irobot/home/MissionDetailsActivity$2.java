// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.SatisfactionRating;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$2
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		SatisfactionRating satisfactionrating;
		switch(MissionDetailsActivity.f(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MissionDetailsActivity a>
	//*   2    4:invokestatic    #26  <Method int MissionDetailsActivity.f(MissionDetailsActivity)>
		{
	//*   3    7:tableswitch     2131297045 2131297049: default 40
	//	               2131297045 89
	//	               2131297046 77
	//	               2131297047 65
	//	               2131297048 53
	//	               2131297049 41
		default:
			return;
	//    4   40:return          

		case 2131297049: 
			dialoginterface = ((DialogInterface) (a));
	//    5   41:aload_0         
	//    6   42:getfield        #17  <Field MissionDetailsActivity a>
	//    7   45:astore_1        
			satisfactionrating = SatisfactionRating.VerySatisfied;
	//    8   46:getstatic       #32  <Field SatisfactionRating SatisfactionRating.VerySatisfied>
	//    9   49:astore_3        
			break;

	//*  10   50:goto            98
		case 2131297048: 
			dialoginterface = ((DialogInterface) (a));
	//   11   53:aload_0         
	//   12   54:getfield        #17  <Field MissionDetailsActivity a>
	//   13   57:astore_1        
			satisfactionrating = SatisfactionRating.VeryDissatisfied;
	//   14   58:getstatic       #35  <Field SatisfactionRating SatisfactionRating.VeryDissatisfied>
	//   15   61:astore_3        
			break;

	//*  16   62:goto            98
		case 2131297047: 
			dialoginterface = ((DialogInterface) (a));
	//   17   65:aload_0         
	//   18   66:getfield        #17  <Field MissionDetailsActivity a>
	//   19   69:astore_1        
			satisfactionrating = SatisfactionRating.Satisfied;
	//   20   70:getstatic       #38  <Field SatisfactionRating SatisfactionRating.Satisfied>
	//   21   73:astore_3        
			break;

	//*  22   74:goto            98
		case 2131297046: 
			dialoginterface = ((DialogInterface) (a));
	//   23   77:aload_0         
	//   24   78:getfield        #17  <Field MissionDetailsActivity a>
	//   25   81:astore_1        
			satisfactionrating = SatisfactionRating.Neutral;
	//   26   82:getstatic       #41  <Field SatisfactionRating SatisfactionRating.Neutral>
	//   27   85:astore_3        
			break;

	//*  28   86:goto            98
		case 2131297045: 
			dialoginterface = ((DialogInterface) (a));
	//   29   89:aload_0         
	//   30   90:getfield        #17  <Field MissionDetailsActivity a>
	//   31   93:astore_1        
			satisfactionrating = SatisfactionRating.Dissatisfied;
	//   32   94:getstatic       #44  <Field SatisfactionRating SatisfactionRating.Dissatisfied>
	//   33   97:astore_3        
			break;
		}
		MissionDetailsActivity.a(((MissionDetailsActivity) (dialoginterface)), satisfactionrating);
	//   34   98:aload_1         
	//   35   99:aload_3         
	//   36  100:invokestatic    #47  <Method void MissionDetailsActivity.a(MissionDetailsActivity, SatisfactionRating)>
	//   37  103:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$2(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
