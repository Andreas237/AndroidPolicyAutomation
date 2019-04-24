.class public Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;
    }
.end annotation


# instance fields
.field private A:Landroid/content/BroadcastReceiver;

.field private B:Z

.field private D:Lo/egd;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Lo/emu;

.field private n:Lo/emu;

.field private o:Lo/emu;

.field private p:Landroid/widget/TextView;

.field private q:Lcom/huawei/health/sns/model/chat/Assistant;

.field private r:Lo/aot;

.field private s:J

.field private t:Landroid/widget/RelativeLayout;

.field private u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

.field private v:Landroid/view/View;

.field private w:Lo/axc;

.field private x:Landroid/view/View;

.field private y:Lo/bio;

.field private z:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 164
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r:Lo/aot;

    .line 179
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    .line 214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->B:Z

    .line 225
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private A()V
    .locals 2

    .line 1197
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1198
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1217
    return-void
.end method

.method private C()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 1269
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    return-object v0
.end method

.method private D()V
    .locals 1

    .line 1163
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1164
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1165
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 284
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 286
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 1007
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    invoke-virtual {v0, p1, p0, v1, v2}, Lo/aqj;->c(Landroid/os/Message;Landroid/content/Context;J)V

    .line 1008
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 2

    .line 659
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 661
    const-string v0, "AssistantDetailActivity"

    const-string v1, "disturb set flag not exist, use default value."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    return-void

    .line 665
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 667
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 669
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setEnabled(Z)V

    .line 670
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->p:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 671
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->z:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    .line 675
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setEnabled(Z)V

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->z:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 679
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;III)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(III)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 4

    .line 1172
    if-eqz p1, :cond_1

    .line 1174
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 1175
    const/16 v0, 0x3fa

    if-ne v2, v0, :cond_0

    .line 1178
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A()V

    goto :goto_0

    .line 1183
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const/4 v1, 0x0

    invoke-static {v1, v2, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(III)I

    move-result v3

    .line 1184
    invoke-static {p0, v3}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1187
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1189
    :cond_1
    return-void
.end method

.method private a(Z)V
    .locals 6

    .line 1224
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1225
    const-class v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1226
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1227
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 1229
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1230
    const-string v0, "userId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1232
    const-string v0, "fromList"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1233
    const-string v0, "detail_after_followed"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1234
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1235
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 1236
    goto :goto_0

    .line 1239
    :cond_0
    const-string v0, "AssistantDetailActivity"

    const-string v1, "goToAssistantChat, userId is -1."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1241
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 6

    .line 599
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 600
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 601
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_50_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v5, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 602
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v4, v5, v1, v0, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 603
    return-object v4
.end method

.method private b()V
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_0

    .line 297
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s()V

    .line 300
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e()V

    .line 301
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 583
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 584
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 586
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 588
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 2

    .line 688
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 690
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 694
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 696
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Z)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 8

    .line 736
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_1

    .line 738
    if-eqz p1, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 740
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    const/16 v2, 0x66

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 741
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r()Lo/axc;

    move-result-object v0

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v3

    move v5, v7

    const/4 v2, 0x2

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/axc;->d(Landroid/content/Context;IJIZ)V

    .line 744
    :cond_1
    return-void
.end method

.method private b(Landroid/os/Message;)Z
    .locals 3

    .line 1058
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1064
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s()V

    .line 1065
    goto :goto_1

    .line 1071
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1073
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->j()V

    .line 1074
    goto :goto_1

    .line 1081
    :pswitch_2
    const-string v0, "AssistantDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive user setting failed, w="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1082
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1083
    goto :goto_1

    .line 1086
    :goto_0
    :pswitch_3
    const/4 v0, 0x0

    return v0

    .line 1089
    :goto_1
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Z
    .locals 1

    .line 76
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->B:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)Z
    .locals 1

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 271
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 272
    const-string v0, "action_unfollow_success"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 273
    const-string v0, "action_follow_state_change"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 274
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 275
    return-void
.end method

.method private c(I)V
    .locals 2

    .line 569
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 570
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 574
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 469
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/model/chat/Assistant;)V

    return-void
.end method

.method private c(Landroid/os/Message;)Z
    .locals 1

    .line 1018
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1023
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A()V

    .line 1024
    goto :goto_1

    .line 1029
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Ljava/lang/Object;)V

    .line 1030
    goto :goto_1

    .line 1035
    :sswitch_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D()V

    .line 1036
    goto :goto_1

    .line 1041
    :sswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y()V

    .line 1042
    goto :goto_1

    .line 1045
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 1047
    :goto_1
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x100 -> :sswitch_1
        0x101 -> :sswitch_3
        0x102 -> :sswitch_1
        0x103 -> :sswitch_2
    .end sparse-switch
.end method

.method public static d(Landroid/app/Activity;JZ)V
    .locals 2

    .line 1305
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p0, p3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(JLandroid/app/Activity;Z)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1306
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 3

    .line 626
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 628
    const-string v0, "AssistantDetailActivity"

    const-string v1, "receive article push set flag not exist, use default value."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    return-void

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o:Lo/emu;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getReceiveArticlePushStatus()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 634
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->j()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Z)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Z)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;ZZ)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(ZZ)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)Z
    .locals 1

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method private static e(JLandroid/app/Activity;Z)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLandroid/app/Activity;Z)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 1310
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;

    invoke-direct {v0, p2, p0, p1, p3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;-><init>(Landroid/app/Activity;JZ)V

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o:Lo/emu;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 308
    new-instance v0, Lo/arg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    invoke-direct {v0, v1}, Lo/arg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    invoke-virtual {v0, v1, v2}, Lo/arg;->d(J)V

    .line 309
    return-void
.end method

.method private e(III)V
    .locals 4

    .line 333
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 335
    const-string v0, "AssistantDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUpdateFailed , what = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " responseCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " retCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    const/16 v0, 0x3ec

    if-eq p3, v0, :cond_0

    const/16 v0, 0x3ed

    if-ne p3, v0, :cond_1

    .line 340
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 341
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->finish()V

    goto :goto_1

    .line 346
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_6

    .line 348
    sget v3, Lcom/huawei/android/sns/R$string;->sns_cannot_conn_service:I

    .line 349
    const v0, 0xad01

    if-eq p1, v0, :cond_2

    const v0, 0xad02

    if-ne p1, v0, :cond_3

    .line 351
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_cannot_conn_service:I

    invoke-static {p2, p3, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(III)I

    move-result v3

    goto :goto_0

    .line 353
    :cond_3
    const v0, 0xad04

    if-eq p1, v0, :cond_4

    const v0, 0xad05

    if-ne p1, v0, :cond_5

    .line 356
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_cannot_conn_service:I

    invoke-static {p2, p3, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->getErrResId(III)I

    move-result v3

    .line 358
    :cond_5
    :goto_0
    invoke-static {p0, v3}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 359
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->finish()V

    .line 362
    :cond_6
    :goto_1
    return-void
.end method

.method public static e(Landroid/app/Activity;J)V
    .locals 2

    .line 1293
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, p2, p0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(JLandroid/app/Activity;Z)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1294
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 3

    .line 643
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 645
    const-string v0, "AssistantDetailActivity"

    const-string v1, "receive message stick time not exist, use default value."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    return-void

    .line 648
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->n:Lo/emu;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getStickTime()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 649
    return-void
.end method

.method private e(ZZ)V
    .locals 7

    .line 717
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_2

    .line 719
    if-eqz p1, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    .line 721
    :goto_0
    if-eqz p2, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 723
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->getOldReceiveMsgStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    .line 725
    const/16 v2, 0x6d

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 724
    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 726
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r()Lo/axc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3, v6}, Lo/axc;->c(JILjava/lang/String;)V

    .line 729
    :cond_2
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->z()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 316
    const-string v0, "AssistantDetailActivity"

    const-string v1, "data update success."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 321
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->j()V

    .line 322
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->n:Lo/emu;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 369
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 370
    if-eqz v2, :cond_3

    .line 372
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 373
    if-nez v3, :cond_0

    .line 375
    return-void

    .line 377
    :cond_0
    const-string v0, "assistant_user"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 379
    const-string v0, "assistant_user"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Assistant;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    .line 386
    :cond_1
    const-string v0, "assistant_user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 388
    const-string v0, "assistant_user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    .line 390
    :cond_2
    const-string v0, "isFromSdk"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 392
    const-string v0, "isFromSdk"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->B:Z

    .line 395
    :cond_3
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)J
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    return-wide v0
.end method

.method private j()V
    .locals 2

    .line 1264
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->C()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1265
    return-void
.end method

.method private k()V
    .locals 2

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    const/16 v1, 0x8

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 409
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 10

    .line 476
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_3

    .line 478
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->n()V

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 481
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->g:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 482
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/Assistant;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/Assistant;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 483
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/Assistant;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 481
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/model/chat/Assistant;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    sget v0, Lcom/huawei/android/sns/R$id;->head_bottom_divide_line:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 487
    const-string v6, ""

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getIntroduction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getIntroduction()Ljava/lang/String;

    move-result-object v6

    .line 493
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_assistant_introduction:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_blank_space:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 494
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->k:Landroid/widget/TextView;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v7}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getCompany()Ljava/lang/String;

    move-result-object v8

    .line 498
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 500
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 502
    sget v0, Lcom/huawei/android/sns/R$id;->company_top_divide_line:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 503
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_assistant_company:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->l:Landroid/widget/TextView;

    invoke-static {v8}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v9}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    goto :goto_0

    .line 508
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->company_top_divide_line:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 513
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 516
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 517
    sget v0, Lcom/huawei/android/sns/R$id;->layout_disturb_switch:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 518
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch_settop:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 519
    sget v0, Lcom/huawei/android/sns/R$id;->layout_clear_message:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 522
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_1:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 523
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 524
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_3:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 525
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_4:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 526
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_5:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 527
    sget v0, Lcom/huawei/android/sns/R$id;->company_bottom_divide_line:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_1

    .line 538
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 539
    sget v0, Lcom/huawei/android/sns/R$id;->layout_disturb_switch:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 540
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch_settop:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 541
    sget v0, Lcom/huawei/android/sns/R$id;->layout_clear_message:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 544
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_1:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 545
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_2:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 546
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_3:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 547
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_4:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 548
    sget v0, Lcom/huawei/android/sns/R$id;->divide_line_5:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(I)V

    .line 552
    sget v0, Lcom/huawei/android/sns/R$id;->company_bottom_divide_line:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(I)V

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 557
    :goto_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o()V

    .line 558
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->invalidateOptionsMenu()V

    .line 560
    :cond_3
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->g()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 424
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->g:Landroid/widget/ImageView;

    .line 425
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->f:Landroid/widget/TextView;

    .line 426
    sget v0, Lcom/huawei/android/sns/R$id;->function_introduction:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->k:Landroid/widget/TextView;

    .line 427
    sget v0, Lcom/huawei/android/sns/R$id;->layout_company:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->h:Landroid/widget/LinearLayout;

    .line 428
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_company:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->l:Landroid/widget/TextView;

    .line 429
    sget v0, Lcom/huawei/android/sns/R$id;->receive_message_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o:Lo/emu;

    .line 430
    sget v0, Lcom/huawei/android/sns/R$id;->set_top_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->n:Lo/emu;

    .line 431
    sget v0, Lcom/huawei/android/sns/R$id;->disturb_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    .line 432
    sget v0, Lcom/huawei/android/sns/R$id;->layout_clear_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t:Landroid/widget/RelativeLayout;

    .line 433
    sget v0, Lcom/huawei/android/sns/R$id;->text_disturb_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->p:Landroid/widget/TextView;

    .line 434
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->x:Landroid/view/View;

    .line 435
    sget v0, Lcom/huawei/android/sns/R$id;->layout_disturb_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->z:Landroid/view/View;

    .line 436
    sget v0, Lcom/huawei/android/sns/R$id;->layout_switch_settop:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->v:Landroid/view/View;

    .line 438
    sget v0, Lcom/huawei/android/sns/R$id;->follow_assistant:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D:Lo/egd;

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 441
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    .line 442
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u()V

    .line 443
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->l()V

    .line 444
    return-void
.end method

.method private n()V
    .locals 2

    .line 613
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 614
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/model/chat/Assistant;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 618
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 448
    sget v0, Lcom/huawei/android/sns/R$id;->null_bottom_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 450
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 451
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 453
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 457
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 459
    :goto_0
    return-void
.end method

.method private p()V
    .locals 2

    .line 416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    const/16 v1, 0x8

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 417
    return-void
.end method

.method private q()V
    .locals 3

    .line 705
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r()Lo/axc;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    invoke-virtual {v0, v1, v2}, Lo/axc;->d(J)V

    .line 706
    return-void
.end method

.method private r()Lo/axc;
    .locals 1

    .line 888
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->w:Lo/axc;

    if-nez v0, :cond_0

    .line 890
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->w:Lo/axc;

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->w:Lo/axc;

    return-object v0
.end method

.method private s()V
    .locals 4

    .line 900
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    if-nez v0, :cond_0

    .line 902
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    .line 904
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 905
    return-void
.end method

.method private t()V
    .locals 1

    .line 912
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    if-eqz v0, :cond_0

    .line 914
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 915
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->y:Lo/bio;

    .line 917
    :cond_0
    return-void
.end method

.method private u()V
    .locals 2

    .line 751
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 765
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->o:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$9;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$10;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 799
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 830
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->x:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 839
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->z:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->D:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$11;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->v:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$15;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 867
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->n:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 879
    return-void
.end method

.method private v()V
    .locals 5

    .line 1153
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s()V

    .line 1155
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->x()Lo/aot;

    move-result-object v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/aot;->b(JJ)V

    .line 1156
    return-void
.end method

.method private w()V
    .locals 3

    .line 1116
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1117
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1118
    const-string v0, "refresh_searchView"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1119
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1120
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 1121
    return-void
.end method

.method private x()Lo/aot;
    .locals 2

    .line 1130
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r:Lo/aot;

    if-nez v0, :cond_0

    .line 1132
    new-instance v0, Lo/aot;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    invoke-direct {v0, v1}, Lo/aot;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r:Lo/aot;

    .line 1134
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->r:Lo/aot;

    return-object v0
.end method

.method private y()V
    .locals 2

    .line 1097
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1098
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->B:Z

    if-nez v0, :cond_0

    .line 1100
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->w()V

    goto :goto_0

    .line 1105
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v0, "action_unfollow_success"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1106
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 1107
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->finish()V

    .line 1109
    :goto_0
    return-void
.end method

.method private z()V
    .locals 8

    .line 1142
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s()V

    .line 1144
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->x()Lo/aot;

    move-result-object v0

    .line 1145
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->s:J

    .line 1144
    const/4 v1, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/aot;->c(IJJZLjava/lang/String;)V

    .line 1146
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 400
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d:Landroid/view/View;

    .line 401
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1246
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1247
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->invalidateOptionsMenu()V

    .line 1248
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 248
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 249
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 252
    if-eqz v1, :cond_0

    .line 254
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 257
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_assistant_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->setContentView(I)V

    .line 258
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->h()V

    .line 259
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m()V

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c()V

    .line 262
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->k()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b()V

    .line 264
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1253
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 1254
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->p()V

    .line 1255
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->t()V

    .line 1256
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a()V

    .line 1257
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1347
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 1349
    sget v0, Lcom/huawei/android/sns/R$id;->menu_go_to_chat:I

    if-ne v1, v0, :cond_0

    .line 1351
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Z)V

    goto :goto_0

    .line 1353
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_unfollow:I

    if-ne v1, v0, :cond_1

    .line 1355
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->v()V

    .line 1357
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1336
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 1337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->q:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1339
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_assist_detail_menu_50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 1341
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
