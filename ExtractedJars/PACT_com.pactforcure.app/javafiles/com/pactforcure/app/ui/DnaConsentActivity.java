// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.pactforcure.app.consent.DnaConsentTask;
import com.pactforcure.app.consent.DnaConsentTuple;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import java.util.Map;
import org.researchstack.backbone.model.ConsentDocument;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.ui.ViewTaskActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			ParticipantAddressFormActivity

public class DnaConsentActivity extends AppCompatActivity
{

	public DnaConsentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void goToAddressActivity()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/ParticipantAddressFormActivity);
	//    0    0:new             #17  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <Class ParticipantAddressFormActivity>
	//    4    7:invokespecial   #22  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.putExtra("consentDocument", ((java.io.Serializable) (consentDocument)));
	//    6   11:aload_1         
	//    7   12:ldc1            #23  <String "consentDocument">
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field ConsentDocument consentDocument>
	//   10   18:invokevirtual   #29  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   11   21:pop             
		startActivity(intent);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #33  <Method void startActivity(Intent)>
		finish();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #36  <Method void finish()>
	//   17   31:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #46  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
label0:
		{
			if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          58
			{
				if(j != -1)
					break label0;
	//    3    5:iload_2         
	//    4    6:iconst_m1       
	//    5    7:icmpne          59
				intent = ((Intent) ((String)((TaskResult)intent.getSerializableExtra("ViewTaskActivity.ExtraTaskResult")).getStepResult("dna_signature_consent_identifier").getResults().get("ConsentSignatureStep.Signature")));
	//    6   10:aload_3         
	//    7   11:ldc1            #50  <String "ViewTaskActivity.ExtraTaskResult">
	//    8   13:invokevirtual   #54  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    9   16:checkcast       #56  <Class TaskResult>
	//   10   19:ldc1            #58  <String "dna_signature_consent_identifier">
	//   11   21:invokevirtual   #62  <Method StepResult TaskResult.getStepResult(String)>
	//   12   24:invokevirtual   #68  <Method Map StepResult.getResults()>
	//   13   27:ldc1            #70  <String "ConsentSignatureStep.Signature">
	//   14   29:invokeinterface #76  <Method Object Map.get(Object)>
	//   15   34:checkcast       #78  <Class String>
	//   16   37:astore_3        
				Participant participant = ParticipantStorage.getParticipant();
	//   17   38:invokestatic    #84  <Method Participant ParticipantStorage.getParticipant()>
	//   18   41:astore          4
				participant.setDnaBase64Signature(((String) (intent)));
	//   19   43:aload           4
	//   20   45:aload_3         
	//   21   46:invokevirtual   #90  <Method void Participant.setDnaBase64Signature(String)>
				participant.save();
	//   22   49:aload           4
	//   23   51:invokevirtual   #93  <Method void Participant.save()>
				goToAddressActivity();
	//   24   54:aload_0         
	//   25   55:invokespecial   #95  <Method void goToAddressActivity()>
			}
			return;
	//   26   58:return          
		}
		finish();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #36  <Method void finish()>
	//   29   63:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void AppCompatActivity.onCreate(Bundle)>
		bundle = ((Bundle) (DnaConsentTask.buildDnaConsentTask()));
	//    3    5:invokestatic    #106 <Method DnaConsentTuple DnaConsentTask.buildDnaConsentTask()>
	//    4    8:astore_1        
		consentDocument = ((DnaConsentTuple) (bundle)).consentDocument;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #109 <Field ConsentDocument DnaConsentTuple.consentDocument>
	//    8   14:putfield        #25  <Field ConsentDocument consentDocument>
		startActivityForResult(ViewTaskActivity.newIntent(((Context) (this)), ((org.researchstack.backbone.task.Task) (((DnaConsentTuple) (bundle)).consentTask))), 1);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #113 <Field DnaConsentTask DnaConsentTuple.consentTask>
	//   13   23:invokestatic    #119 <Method Intent ViewTaskActivity.newIntent(Context, org.researchstack.backbone.task.Task)>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #123 <Method void startActivityForResult(Intent, int)>
	//   16   30:return          
	}

	private static final int REQUEST_DNA_CONSENT = 1;
	private ConsentDocument consentDocument;
}
