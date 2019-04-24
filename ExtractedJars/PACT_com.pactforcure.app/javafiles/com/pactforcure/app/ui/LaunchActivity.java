// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.pactforcure.app.participant.ParticipantStorage;

// Referenced classes of package com.pactforcure.app.ui:
//			SelectStudyActivity, MainActivity

public class LaunchActivity extends AppCompatActivity
{

	public LaunchActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppCompatActivity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040022);
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <Int 0x7f040022>
	//    5    8:invokevirtual   #19  <Method void setContentView(int)>
		if(!ParticipantStorage.userChoseStudy())
	//*   6   11:invokestatic    #25  <Method boolean ParticipantStorage.userChoseStudy()>
	//*   7   14:ifne            36
			startActivity(new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/SelectStudyActivity));
	//    8   17:aload_0         
	//    9   18:new             #27  <Class Intent>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:ldc1            #29  <Class SelectStudyActivity>
	//   13   25:invokespecial   #32  <Method void Intent(android.content.Context, Class)>
	//   14   28:invokevirtual   #36  <Method void startActivity(Intent)>
		else
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #39  <Method void finish()>
	//*  17   35:return          
			startActivity(new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/MainActivity));
	//   18   36:aload_0         
	//   19   37:new             #27  <Class Intent>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:ldc1            #41  <Class MainActivity>
	//   23   44:invokespecial   #32  <Method void Intent(android.content.Context, Class)>
	//   24   47:invokevirtual   #36  <Method void startActivity(Intent)>
		finish();
	//*  25   50:goto            31
	}
}
