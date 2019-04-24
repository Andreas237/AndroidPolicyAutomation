.class public Lcom/huawei/health/sns/ui/chat/ChatActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/azd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/ChatActivity$e;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Lo/bdg;

.field private C:Landroid/content/BroadcastReceiver;

.field private D:Landroid/content/BroadcastReceiver;

.field public f:J

.field protected g:Lo/arn;

.field protected h:Lo/bnk;

.field private j:Z

.field protected k:Landroid/content/Context;

.field protected l:Z

.field protected m:Z

.field protected n:I

.field public o:Z

.field protected p:Z

.field protected q:Z

.field protected r:Ljava/lang/String;

.field protected s:Lo/bdj;

.field protected t:Z

.field protected u:Landroid/view/Menu;

.field protected v:Landroid/os/Handler;

.field protected w:Landroid/widget/LinearLayout;

.field protected x:Landroid/widget/LinearLayout;

.field protected y:Lo/bdx;

.field protected z:Lo/bfb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->m:Z

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->p:Z

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->l:Z

    .line 134
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->n:I

    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->t:Z

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->q:Z

    .line 149
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->r:Ljava/lang/String;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    .line 204
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->v:Landroid/os/Handler;

    return-void
.end method

.method private A()V
    .locals 3

    .line 872
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 876
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 877
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 882
    goto :goto_0

    .line 879
    :catch_0
    move-exception v2

    .line 881
    const-string v0, "ChatActivity"

    const-string v1, "mChatBroadcastReceiver record unRegisterBroadcast()"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    :cond_0
    :goto_0
    return-void
.end method

.method private I()V
    .locals 1

    .line 963
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    if-eqz v0, :cond_0

    .line 965
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    invoke-virtual {v0}, Lo/bdg;->a()V

    .line 967
    :cond_0
    return-void
.end method

.method private a()V
    .locals 8

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 450
    sget v0, Lcom/huawei/android/sns/R$string;->sns_selectlist_is_null:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 451
    return-void

    .line 453
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->c()Ljava/util/ArrayList;

    move-result-object v6

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->d()I

    move-result v7

    .line 455
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_confirm_delete:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 456
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v7, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_delete:I

    new-instance v5, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;

    invoke-direct {v5, p0, v6}, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Ljava/util/ArrayList;)V

    .line 455
    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 490
    return-void
.end method

.method private b()V
    .locals 1

    .line 714
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C:Landroid/content/BroadcastReceiver;

    .line 753
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->D:Landroid/content/BroadcastReceiver;

    .line 766
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/ChatActivity;)Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->j:Z

    return v0
.end method

.method private c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 592
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->c()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 1

    .line 555
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->y:Lo/bdx;

    if-eqz v0, :cond_0

    .line 557
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->y:Lo/bdx;

    invoke-virtual {v0, p1}, Lo/bdx;->setVisibility(I)V

    .line 559
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method private e()V
    .locals 3

    .line 822
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 823
    const-string v0, "user_detail_info_change"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 824
    const-string v0, "user_groupmember_info_change"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 825
    const-string v0, "delete_msg_record"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 826
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 827
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 3

    .line 325
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 326
    if-eqz v1, :cond_0

    instance-of v0, v1, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-eqz v0, :cond_0

    .line 328
    move-object v2, v1

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v2}, Lo/bdj;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    .line 331
    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 837
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A:Z

    if-eqz v0, :cond_0

    .line 839
    return-void

    .line 841
    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 842
    const-string v0, "action_show_bind_phone_dlg"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 843
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 844
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A:Z

    .line 845
    return-void
.end method

.method private k()V
    .locals 3

    .line 852
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->D:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A:Z

    if-eqz v0, :cond_0

    .line 856
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 857
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 858
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 863
    goto :goto_0

    .line 860
    :catch_0
    move-exception v2

    .line 862
    const-string v0, "ChatActivity"

    const-string v1, "mChatBroadcastReceiver record unRegisterBroadcast()"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 865
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public B()Z
    .locals 9

    .line 1069
    const/4 v4, 0x0

    .line 1070
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/aov;->a(Landroid/content/Context;)Lo/aov;

    move-result-object v0

    invoke-virtual {v0}, Lo/aov;->b()J

    move-result-wide v5

    .line 1071
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 1072
    const-string v0, "ChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lastPhotoSyncTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", NowTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1073
    sub-long v0, v7, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1074
    const/4 v4, 0x1

    .line 1076
    :cond_0
    return v4
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1044
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method protected D()V
    .locals 1

    .line 974
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    if-eqz v0, :cond_0

    .line 976
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->notifyDataSetChanged()V

    .line 978
    :cond_0
    return-void
.end method

.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 3

    .line 510
    const/4 v2, 0x0

    .line 511
    if-eqz p2, :cond_1

    .line 513
    const/16 v2, 0x8

    .line 514
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o()V

    .line 516
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    .line 517
    if-eqz p1, :cond_0

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 521
    :cond_0
    instance-of v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_2

    .line 524
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->c()V

    goto :goto_0

    .line 529
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->e()V

    .line 532
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 534
    instance-of v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    if-eqz v0, :cond_3

    .line 536
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bfb;->setVisibility(I)V

    goto :goto_1

    .line 540
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0, v2}, Lo/bfb;->setVisibility(I)V

    .line 543
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->w:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 547
    :cond_4
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->d(I)V

    .line 548
    return-void
.end method

.method protected b(Z)V
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    if-eqz v0, :cond_0

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->c(Z)V

    .line 383
    :cond_0
    return-void
.end method

.method public c(Lo/azd$c;Lo/azd$a;)V
    .locals 0

    .line 1020
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->e(Lo/azd$c;Lo/azd$a;)V

    .line 1021
    return-void
.end method

.method public d()V
    .locals 1

    .line 404
    sget v0, Lcom/huawei/android/sns/R$id;->chat_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->d:Landroid/view/View;

    .line 405
    return-void
.end method

.method public d(ILjava/lang/Object;)V
    .locals 7

    .line 936
    if-nez p2, :cond_0

    .line 938
    return-void

    .line 940
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 941
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->j()Lo/bdg;

    move-result-object v0

    move-object v1, p0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    move v4, p1

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/bdg;->c(Landroid/app/Activity;JILjava/lang/String;)V

    .line 942
    return-void
.end method

.method protected d(Landroid/os/Bundle;)V
    .locals 10

    .line 783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    if-nez v0, :cond_1

    .line 785
    :cond_0
    return-void

    .line 787
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->l:Z

    if-eqz v0, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x2

    .line 788
    :goto_0
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 790
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    move-wide v1, v7

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/arn;->a(JJI)V

    .line 792
    goto :goto_2

    .line 793
    :cond_3
    const-string v0, "bundleKeyMemberList"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 795
    const-string v0, "bundleKeyMemberList"

    .line 796
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 797
    if-nez v7, :cond_4

    .line 799
    return-void

    .line 801
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 803
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/arn;->a(JJI)V

    .line 804
    goto :goto_1

    .line 808
    :cond_5
    :goto_2
    instance-of v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    if-eqz v0, :cond_6

    .line 810
    move-object v0, p0

    check-cast v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(J)V

    .line 812
    :cond_6
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 441
    return-void
.end method

.method protected e(Lo/azd$c;Lo/azd$a;)V
    .locals 1

    .line 1031
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_0

    .line 1033
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z()V

    .line 1035
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 4

    .line 1054
    const/4 v2, 0x0

    .line 1055
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->f()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 1056
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1058
    const/4 v2, 0x1

    .line 1060
    :cond_0
    return v2
.end method

.method protected h()V
    .locals 5

    .line 294
    new-instance v0, Lo/arn;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->m:Z

    iget v4, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->n:I

    invoke-direct {v0, v1, v2, v3, v4}, Lo/arn;-><init>(JZI)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    .line 295
    return-void
.end method

.method protected j()Lo/bdg;
    .locals 1

    .line 951
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    if-nez v0, :cond_0

    .line 953
    new-instance v0, Lo/bdg;

    invoke-direct {v0}, Lo/bdg;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    .line 955
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->B:Lo/bdg;

    return-object v0
.end method

.method protected l()V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->b()V

    .line 318
    :cond_0
    return-void
.end method

.method protected m()V
    .locals 0

    .line 359
    return-void
.end method

.method protected n()V
    .locals 1

    .line 349
    sget v0, Lcom/huawei/android/sns/R$id;->chat_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnk;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->h:Lo/bnk;

    .line 350
    sget v0, Lcom/huawei/android/sns/R$id;->input_mod:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bfb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    .line 351
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_unread_tools:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->x:Landroid/widget/LinearLayout;

    .line 352
    return-void
.end method

.method public o()V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->d()V

    .line 342
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 902
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 903
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 904
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 214
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->v:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 216
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->setContentView(I)V

    .line 217
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->b()V

    .line 218
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->e()V

    .line 219
    iput-object p0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->k:Landroid/content/Context;

    .line 221
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->n()V

    .line 223
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lo/azd;)V

    .line 224
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1007
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 1008
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->l()V

    .line 1009
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->I()V

    .line 1010
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->A()V

    .line 1011
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->v:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 1013
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lo/azd;)V

    .line 1014
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 571
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_delete:I

    if-ne v0, v1, :cond_0

    .line 573
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->a()V

    .line 574
    const/4 v0, 0x1

    return v0

    .line 576
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 2

    .line 995
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPause()V

    .line 996
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->j:Z

    .line 997
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->k()V

    .line 998
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1000
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->h()V

    .line 1002
    :cond_0
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 496
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->u:Landroid/view/Menu;

    .line 497
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 498
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 500
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_chatcommon_menu_emui50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 502
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 2

    .line 983
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 984
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->j:Z

    .line 985
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g()V

    .line 986
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 988
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->i()V

    .line 990
    :cond_0
    return-void
.end method

.method public p()Lo/arn;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->g:Lo/arn;

    return-object v0
.end method

.method protected q()V
    .locals 0

    .line 432
    return-void
.end method

.method protected r()V
    .locals 2

    .line 412
    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->h:Lo/bnk;

    invoke-virtual {v0, v1}, Lo/bnk;->setOnResizeListener(Lo/bnk$d;)V

    .line 424
    return-void
.end method

.method public s()Z
    .locals 1

    .line 395
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->p:Z

    return v0
.end method

.method protected t()V
    .locals 1

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    if-nez v0, :cond_0

    .line 368
    new-instance v0, Lo/bdj;

    invoke-direct {v0, p0}, Lo/bdj;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s:Lo/bdj;

    .line 370
    :cond_0
    return-void
.end method

.method protected u()V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 391
    return-void
.end method

.method public v()V
    .locals 2

    .line 701
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 703
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->k()V

    .line 705
    :cond_0
    return-void
.end method

.method public w()Z
    .locals 1

    .line 584
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->q:Z

    return v0
.end method

.method protected x()V
    .locals 0

    .line 773
    return-void
.end method

.method protected y()V
    .locals 3

    .line 912
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->t:Z

    invoke-virtual {v0, v1}, Lo/bis;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 914
    return-void

    .line 918
    :cond_0
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 921
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 923
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 925
    :cond_1
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 926
    return-void
.end method

.method protected z()V
    .locals 1

    .line 891
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 893
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->y()V

    .line 895
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->finish()V

    .line 897
    :cond_0
    return-void
.end method
