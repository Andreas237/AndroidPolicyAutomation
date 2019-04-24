.class public Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;
    }
.end annotation


# instance fields
.field private U:Lcom/huawei/health/sns/model/chat/Assistant;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/ImageView;

.field private Y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private Z:Lo/bio;

.field private aa:Lo/ark;

.field private ab:Ljava/lang/String;

.field private ac:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private ad:Landroid/content/BroadcastReceiver;

.field private ae:Z

.field private af:Lo/axc;

.field private ag:Landroid/content/BroadcastReceiver;

.field private ah:Lo/bdq;

.field private ai:Ljava/lang/String;

.field private aj:Z

.field private ak:Z

.field private al:Z

.field private am:Z

.field private an:Landroid/content/BroadcastReceiver;

.field private ao:Landroid/text/TextWatcher;

.field private ap:Lo/boj$c;

.field private aq:Lo/bcz;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;-><init>()V

    .line 239
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y:Ljava/util/List;

    .line 244
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ae:Z

    .line 279
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af:Lo/axc;

    .line 284
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al:Z

    .line 289
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    .line 294
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->am:Z

    .line 300
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    .line 305
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai:Ljava/lang/String;

    .line 310
    new-instance v0, Lo/bcz;

    invoke-direct {v0, p0}, Lo/bcz;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    .line 316
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an:Landroid/content/BroadcastReceiver;

    .line 504
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ap:Lo/boj$c;

    .line 749
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ao:Landroid/text/TextWatcher;

    return-void
.end method

.method private O()V
    .locals 1

    .line 337
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad:Landroid/content/BroadcastReceiver;

    .line 357
    return-void
.end method

.method private P()V
    .locals 2

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah:Lo/bdq;

    if-eqz v0, :cond_0

    .line 443
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah:Lo/bdq;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 445
    :cond_0
    return-void
.end method

.method private Q()V
    .locals 4

    .line 432
    new-instance v0, Lo/bdq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bdq;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah:Lo/bdq;

    .line 433
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah:Lo/bdq;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 434
    return-void
.end method

.method private R()V
    .locals 3

    .line 411
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 412
    const-string v0, "action_unfollow_success"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 413
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 414
    return-void
.end method

.method private S()V
    .locals 2

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 423
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 425
    :cond_0
    return-void
.end method

.method private T()V
    .locals 1

    .line 449
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag:Landroid/content/BroadcastReceiver;

    .line 477
    return-void
.end method

.method private U()V
    .locals 3

    .line 485
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 486
    const-string v0, "rec_assist_msg_action"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 487
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 488
    return-void
.end method

.method private V()V
    .locals 4

    .line 556
    new-instance v0, Lo/arj;

    invoke-direct {v0}, Lo/arj;-><init>()V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->a(JLandroid/os/Handler;)V

    .line 557
    return-void
.end method

.method private W()Lo/axc;
    .locals 2

    .line 544
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af:Lo/axc;

    if-nez v0, :cond_0

    .line 546
    new-instance v0, Lo/axc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axc;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af:Lo/axc;

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af:Lo/axc;

    return-object v0
.end method

.method private X()V
    .locals 2

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 497
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 499
    :cond_0
    return-void
.end method

.method private Y()V
    .locals 3

    .line 638
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/bcz;->e(J)V

    .line 639
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->q:Z

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bcz;->d(ZLjava/lang/String;)V

    .line 640
    return-void
.end method

.method private Z()Lo/ark;
    .locals 2

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa:Lo/ark;

    if-nez v0, :cond_0

    .line 568
    new-instance v0, Lo/ark;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ark;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa:Lo/ark;

    .line 570
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa:Lo/ark;

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .line 1287
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x118

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1290
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 1291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1293
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 5

    .line 1401
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 1402
    if-eqz v1, :cond_1

    .line 1404
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/Assistant;

    .line 1405
    const-string v0, "bundleKeyNeedRefreshUI"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 1406
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1408
    const-string v0, "bundleKeyNeedFollow"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 1409
    invoke-direct {p0, v4, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(ILcom/huawei/health/sns/model/chat/Assistant;)V

    .line 1411
    :cond_0
    if-eqz v3, :cond_1

    .line 1414
    const/4 v0, 0x1

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/model/chat/Assistant;Z)V

    .line 1417
    :cond_1
    return-void
.end method

.method private a(Landroid/os/Message;Z)V
    .locals 3

    .line 1484
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 1485
    if-eqz v1, :cond_0

    .line 1487
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/Assistant;

    .line 1488
    invoke-direct {p0, v2, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/model/chat/Assistant;Z)V

    .line 1490
    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/Assistant;Z)V
    .locals 4

    .line 1684
    if-nez p1, :cond_0

    .line 1687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_system_notification:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1688
    return-void

    .line 1691
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 1693
    return-void

    .line 1697
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1699
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_system_notification:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1703
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1705
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ae:Z

    .line 1707
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 1708
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0, v1}, Lo/bcz;->c(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 1710
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1712
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Z)V

    goto :goto_1

    .line 1716
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1719
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1721
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->W:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 1725
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->W:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1729
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0, p1, p2}, Lo/bcz;->b(Lcom/huawei/health/sns/model/chat/Assistant;Z)V

    .line 1732
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aw()V

    .line 1733
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aw()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->g(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Landroid/os/Message;Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Z)V

    return-void
.end method

.method private a(Lo/bqy;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Integer;>;Z)V"
        }
    .end annotation

    .line 1884
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 1885
    if-nez v3, :cond_0

    .line 1888
    const-string v0, "AssistantChatActivity"

    const-string v1, "requestFriendList, no result."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1889
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1890
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ar()V

    .line 1891
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1892
    return-void

    .line 1894
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0xdac1

    if-ne v1, v0, :cond_5

    .line 1896
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 1898
    if-eqz v4, :cond_4

    .line 1901
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1903
    const-string v0, "AssistantChatActivity"

    const-string v1, "assistant user is deleted"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1907
    :cond_1
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/apg;->d(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v5

    .line 1909
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 1910
    const/16 v0, 0x12

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1911
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1913
    if-eqz p2, :cond_3

    .line 1915
    if-eqz v5, :cond_2

    .line 1918
    invoke-static {}, Lo/aqp;->c()Lo/aqp;

    move-result-object v0

    .line 1919
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v1

    .line 1918
    invoke-virtual {v0, v5, v1}, Lo/aqp;->d(Lcom/huawei/health/sns/model/chat/Assistant;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v7

    .line 1921
    const/4 v0, 0x1

    const v1, 0xaca01

    invoke-static {v0, v1, v7}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 1924
    const/4 v0, 0x1

    const v1, 0xaca03

    invoke-static {v0, v1, v5}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 1926
    goto :goto_0

    .line 1929
    :cond_2
    const-string v0, "AssistantChatActivity"

    const-string v1, "insert default welcome message error, assistant is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1934
    :cond_3
    const-string v0, "AssistantChatActivity"

    const-string v1, "isFirstFollowedPublicUser = false, don\'t insert default welcome msg"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1937
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    .line 1939
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 1941
    const/4 v0, 0x1

    const v1, 0xaca02

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    goto :goto_1

    .line 1946
    :cond_4
    const-string v0, "AssistantChatActivity"

    const-string v1, "get assistant user is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1947
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1948
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1949
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1951
    :goto_1
    goto :goto_2

    .line 1955
    :cond_5
    const-string v0, "AssistantChatActivity"

    const-string v1, "requestFriendList failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1956
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0xdac2

    if-eq v1, v0, :cond_6

    .line 1958
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->i(I)V

    .line 1960
    :cond_6
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1962
    :goto_2
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 1821
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/aud;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 1822
    return-void
.end method

.method private aA()V
    .locals 1

    .line 2227
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    if-eqz v0, :cond_0

    .line 2229
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    .line 2230
    sget v0, Lcom/huawei/android/sns/R$string;->sns_connect_im_server_failed:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 2232
    :cond_0
    return-void
.end method

.method private aB()V
    .locals 1

    .line 2313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 2315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2317
    :cond_0
    return-void
.end method

.method private aC()V
    .locals 2

    .line 2396
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->D:Z

    if-eqz v0, :cond_0

    .line 2399
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->z()V

    .line 2400
    return-void

    .line 2403
    :cond_0
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al:Z

    if-eqz v0, :cond_2

    .line 2405
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    if-nez v0, :cond_1

    .line 2407
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkOfflineInfo isFromSDKCall but isNetWorkOver is false"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2408
    return-void

    .line 2410
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x114

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2412
    :cond_2
    return-void
.end method

.method private aa()V
    .locals 3

    .line 648
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 650
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v2}, Lo/bdj;->a(Ljava/lang/String;)Z

    .line 651
    goto :goto_0

    .line 652
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 653
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai:Ljava/lang/String;

    .line 654
    return-void
.end method

.method private ab()V
    .locals 3

    .line 662
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 664
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v2}, Lo/bdj;->a(Ljava/lang/String;)Z

    .line 665
    goto :goto_0

    .line 666
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 667
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab:Ljava/lang/String;

    .line 668
    return-void
.end method

.method private ac()V
    .locals 0

    .line 684
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aw()V

    .line 685
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aC()V

    .line 686
    return-void
.end method

.method private ad()V
    .locals 3

    .line 1259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x119

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1262
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1265
    :cond_0
    return-void
.end method

.method private ae()V
    .locals 5

    .line 806
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 808
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v4

    .line 809
    if-eqz v4, :cond_0

    .line 811
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 815
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->z:Lo/bfb;

    invoke-virtual {v0, v1}, Lo/bcz;->a(Lo/bfb;)V

    .line 818
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    .line 819
    return-void
.end method

.method private af()V
    .locals 3

    .line 1272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1274
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x119

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1275
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1278
    :cond_0
    return-void
.end method

.method private ag()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 923
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 924
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 926
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 928
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_action_bar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 933
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_manager_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 936
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_user_name:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V:Landroid/widget/TextView;

    .line 937
    sget v0, Lcom/huawei/android/sns/R$id;->sns_single_chat_isSilence:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->W:Landroid/widget/ImageView;

    .line 939
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 941
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 943
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Z)V

    goto :goto_1

    .line 947
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_manager:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    .line 948
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 949
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 952
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_D8:I

    sget v2, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 954
    return-void
.end method

.method private ah()V
    .locals 6

    .line 826
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 827
    if-eqz v4, :cond_9

    .line 829
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 830
    if-nez v5, :cond_0

    .line 832
    return-void

    .line 834
    :cond_0
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 837
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    .line 838
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->q:Z

    goto :goto_1

    .line 840
    :cond_1
    const-string v0, "userId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 842
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    const-string v2, "userId"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->S:Z

    .line 843
    const-string v0, "userId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    .line 845
    :cond_3
    :goto_1
    const-string v0, "message_id"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 847
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->m:Z

    .line 848
    const-string v0, "message_id"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->n:I

    .line 850
    :cond_4
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 852
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->H:I

    .line 853
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->L()V

    .line 855
    :cond_5
    const-string v0, "fromList"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 857
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->D:Z

    .line 859
    :cond_6
    const-string v0, "detail_after_followed"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 861
    const-string v0, "detail_after_followed"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->am:Z

    .line 865
    :cond_7
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->q:Z

    invoke-static {v4, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->q:Z

    .line 867
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->q:Z

    if-eqz v0, :cond_8

    .line 870
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->D:Z

    .line 872
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 874
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 877
    :cond_8
    const-string v0, "assist_entrance_key"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 880
    const-string v0, "assist_entrance_key"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 883
    :cond_9
    return-void
.end method

.method private ai()V
    .locals 2

    .line 1525
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1526
    return-void
.end method

.method private aj()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 1535
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    return-object v0
.end method

.method private ak()V
    .locals 1

    .line 1497
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1498
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ar()V

    .line 1499
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1501
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1503
    :cond_0
    return-void
.end method

.method private al()V
    .locals 1

    .line 1626
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 1628
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1630
    :cond_0
    return-void
.end method

.method private am()V
    .locals 8

    .line 1560
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad()V

    .line 1561
    new-instance v0, Lo/aot;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/aot;-><init>(Landroid/os/Handler;)V

    .line 1562
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v7, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 1561
    const/16 v1, 0x11

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/aot;->c(IJJZLjava/lang/String;)V

    .line 1563
    return-void
.end method

.method private an()V
    .locals 1

    .line 1759
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0}, Lo/bcz;->d()V

    .line 1760
    return-void
.end method

.method private ao()V
    .locals 1

    .line 1637
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 1639
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1641
    :cond_0
    return-void
.end method

.method private ap()V
    .locals 1

    .line 2015
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0}, Lo/bcz;->e()V

    .line 2016
    return-void
.end method

.method private aq()V
    .locals 1

    .line 1768
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->t()V

    .line 1769
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Z)V

    .line 1770
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->u()V

    .line 1771
    return-void
.end method

.method private ar()V
    .locals 1

    .line 1661
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 1663
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1665
    :cond_0
    return-void
.end method

.method private as()V
    .locals 1

    .line 2024
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ae:Z

    if-eqz v0, :cond_0

    .line 2027
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    .line 2028
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac()V

    goto :goto_0

    .line 2032
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->finish()V

    .line 2034
    :goto_0
    return-void
.end method

.method private at()V
    .locals 2

    .line 2169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2171
    const-string v0, "AssistantChatActivity"

    const-string v1, "got offline msg not null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2172
    return-void

    .line 2174
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->av()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab:Ljava/lang/String;

    .line 2175
    return-void
.end method

.method private au()V
    .locals 8

    .line 2089
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 2090
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2092
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkInstallAndUpdate packageName is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2093
    return-void

    .line 2096
    :cond_0
    invoke-static {p0, v5}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2098
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getRequireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bmg;->c(Ljava/lang/String;)I

    move-result v6

    .line 2099
    invoke-static {p0, v5}, Lo/bnx;->e(Landroid/content/ContextWrapper;Ljava/lang/String;)I

    move-result v7

    .line 2100
    if-le v6, v7, :cond_1

    .line 2103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_update_app_tip:I

    const/16 v3, 0x13

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 2108
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 2110
    :goto_0
    goto :goto_1

    .line 2114
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_install_app_tip:I

    const/16 v3, 0x13

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2116
    :goto_1
    return-void
.end method

.method private av()Ljava/lang/String;
    .locals 6

    .line 2194
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/aqj;->b(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 2195
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v5

    .line 2197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v4}, Lo/bdj;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    .line 2198
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 2200
    return-object v5
.end method

.method private aw()V
    .locals 2

    .line 2041
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al:Z

    if-nez v0, :cond_0

    .line 2043
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkAssistApp isDataLoaded is false"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2044
    return-void

    .line 2046
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_1

    .line 2048
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkAssistApp mAssistant is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2049
    return-void

    .line 2051
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    if-nez v0, :cond_2

    .line 2053
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkAssistApp isFromSDKCall but isNetWorkTaskCompleted is false"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2054
    return-void

    .line 2057
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2059
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkAssistApp mAssistant is not followed"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2060
    return-void

    .line 2064
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->hasAppinfo()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2067
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 2068
    const-string v0, "AssistantChatActivity"

    const-string v1, "checkAssistApp emuiOnly is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2069
    return-void

    .line 2073
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isEmuiOnly()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2075
    :cond_5
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->au()V

    goto :goto_0

    .line 2080
    :cond_6
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 2082
    :goto_0
    return-void
.end method

.method private ax()V
    .locals 1

    .line 2218
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab()V

    .line 2219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    .line 2220
    return-void
.end method

.method private ay()V
    .locals 2

    .line 2300
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->O()V

    .line 2301
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 2302
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2303
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2304
    const-string v0, "package"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 2305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 2306
    return-void
.end method

.method private az()V
    .locals 1

    .line 2239
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    if-eqz v0, :cond_0

    .line 2241
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    .line 2242
    sget v0, Lcom/huawei/android/sns/R$string;->sns_network_error_retry:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 2244
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lo/axc;
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->W()Lo/axc;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc;
    .locals 1

    .line 98
    invoke-static {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc;

    move-result-object v0

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .line 1570
    const/16 v0, 0x3ec

    if-ne p1, v0, :cond_1

    .line 1572
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1574
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1576
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Z)V

    goto :goto_0

    .line 1580
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 1583
    :cond_1
    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_3

    .line 1586
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1588
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Z)V

    goto :goto_0

    .line 1592
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1595
    :cond_3
    :goto_0
    return-void
.end method

.method private b(J)V
    .locals 11

    .line 790
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->k(J)Ljava/util/ArrayList;

    move-result-object v8

    .line 791
    if-eqz v8, :cond_0

    .line 793
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 795
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k:Landroid/content/Context;

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    .line 796
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 795
    invoke-virtual/range {v0 .. v7}, Lo/aow;->b(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V

    .line 797
    goto :goto_0

    .line 799
    :cond_0
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 4

    .line 1377
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1379
    const-string v0, "AssistantChatActivity"

    const-string v1, "CODE_CLEAR_ASSISTANT_CHAT_DATA. userId is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1383
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 1384
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 1386
    return-void

    .line 1388
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab()V

    .line 1389
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 1390
    invoke-virtual {p0, v2, v3}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(J)V

    .line 1392
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 4

    .line 1453
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1454
    if-eqz p1, :cond_0

    .line 1456
    const-string v0, "assistant_user"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1458
    :cond_0
    const-string v0, "assistant_user_id"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1459
    const-string v0, "isFromSdk"

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1460
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 1461
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;I)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lcom/huawei/health/sns/model/chat/Assistant;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/model/chat/Assistant;Z)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Ljava/lang/Object;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Ljava/lang/Object;)V

    return-void
.end method

.method private static c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1866
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    return-object v0
.end method

.method private c(I)V
    .locals 1

    .line 1604
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1605
    const/16 v0, 0x3fa

    if-ne p1, v0, :cond_0

    .line 1607
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Z)V

    goto :goto_0

    .line 1609
    :cond_0
    const/16 v0, 0x3ff

    if-ne p1, v0, :cond_1

    .line 1611
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al()V

    .line 1612
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    goto :goto_0

    .line 1616
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ao()V

    .line 1617
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1619
    :goto_0
    return-void
.end method

.method private c(ILcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 2

    .line 1427
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1429
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Z)V

    goto :goto_0

    .line 1432
    :cond_0
    if-nez p1, :cond_1

    .line 1434
    const-string v0, "AssistantChatActivity"

    const-string v1, "followPublicUser after getServerAssistantInfo"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1435
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad()V

    .line 1436
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->am()V

    goto :goto_0

    .line 1439
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1441
    invoke-direct {p0, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 1442
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->finish()V

    .line 1444
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 3

    .line 1470
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Landroid/os/Message;Z)V

    .line 1473
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z()Lo/ark;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/ark;->d(J)V

    .line 1474
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Ljava/lang/Object;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lo/bqy;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lo/bqy;Z)V

    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 1236
    if-eqz p1, :cond_1

    .line 1238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    if-nez v0, :cond_0

    .line 1240
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    .line 1242
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    goto :goto_0

    .line 1246
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    if-eqz v0, :cond_2

    .line 1248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 1249
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Z:Lo/bio;

    .line 1252
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    return-object v0
.end method

.method private d(Landroid/os/Message;)V
    .locals 3

    .line 1360
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1362
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1364
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 1365
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(I)V

    .line 1368
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;I)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;J)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(J)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Z)V

    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 5

    .line 1302
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_1

    .line 1304
    :cond_0
    return-void

    .line 1306
    :cond_1
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1307
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 1309
    const-string v0, "AssistantChatActivity"

    const-string v1, "addNewMsgItem newItem.getUserId() != uID."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1310
    return-void

    .line 1312
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 1313
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 1314
    return-void
.end method

.method private d(Lo/bfb$e;)V
    .locals 6

    .line 725
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    if-nez v0, :cond_0

    .line 727
    return-void

    .line 730
    :cond_0
    sget-object v0, Lo/bfb$e;->c:Lo/bfb$e;

    if-eq p1, v0, :cond_1

    sget-object v0, Lo/bfb$e;->a:Lo/bfb$e;

    if-ne p1, v0, :cond_2

    .line 733
    :cond_1
    const/high16 v0, 0x42480000    # 50.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v4

    .line 734
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    int-to-float v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v5, v1, v2, v0, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 735
    const-wide/16 v0, 0x12c

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 736
    const-wide/16 v0, 0x64

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 737
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->setVisibility(I)V

    .line 738
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    invoke-virtual {v0, v5}, Lo/bdx;->startAnimation(Landroid/view/animation/Animation;)V

    .line 739
    goto :goto_0

    .line 742
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bdx;->setVisibility(I)V

    .line 744
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 1

    .line 2185
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/aud;
    .locals 1

    .line 1833
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    return-object v0
.end method

.method private e(I)V
    .locals 0

    .line 1226
    invoke-static {p0, p1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1227
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lo/bfb$e;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lo/bfb$e;)V

    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 5

    .line 1323
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1325
    return-void

    .line 1328
    :cond_0
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1329
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 1331
    return-void

    .line 1334
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al:Z

    if-eqz v0, :cond_2

    .line 1336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v4}, Lo/bdj;->h(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 1341
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Q:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 1343
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Q:Ljava/util/ArrayList;

    .line 1345
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1349
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 1350
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac()V

    .line 1351
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 961
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 962
    if-eqz v2, :cond_0

    .line 964
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_single_chat_detail_emui_five_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v2, p1, v0, p0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 966
    :cond_0
    return-void
.end method

.method private f(I)V
    .locals 5

    .line 2127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_0

    .line 2129
    const-string v0, "AssistantChatActivity"

    const-string v1, "insertAppTipMessage error,mAssistant is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2130
    return-void

    .line 2139
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2144
    const-string v0, "AssistantChatActivity"

    const-string v1, "has same tip msg in list"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2145
    return-void

    .line 2151
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 2155
    :cond_2
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, Lo/aqj;->b(JILjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 2156
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai:Ljava/lang/String;

    .line 2159
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y:Ljava/util/List;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0, v4}, Lo/bdj;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    .line 2162
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ai()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Landroid/os/Message;)V

    return-void
.end method

.method private g(Landroid/os/Message;)V
    .locals 1

    .line 1512
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1513
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(I)V

    .line 1514
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1516
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    .line 1518
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac()V

    return-void
.end method

.method private h(I)V
    .locals 1

    .line 1650
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 1652
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(I)V

    .line 1654
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak()V

    return-void
.end method

.method private i(I)V
    .locals 0

    .line 1672
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1673
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->h(I)V

    .line 1674
    return-void
.end method

.method private i(J)V
    .locals 2

    .line 1780
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1781
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->at()V

    return-void
.end method

.method private static k(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 1791
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;-><init>(J)V

    return-object v0
.end method

.method private k(Landroid/os/Message;)V
    .locals 3

    .line 2210
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, p1, p0, v1, v2}, Lo/aqj;->c(Landroid/os/Message;Landroid/content/Context;J)V

    .line 2211
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->as()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aA()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->az()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ar()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ax()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .line 576
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    .line 577
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 893
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 895
    const-string v0, "AssistantChatActivity"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 896
    return-void

    .line 899
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    if-nez v0, :cond_1

    .line 901
    const-string v0, "AssistantChatActivity"

    const-string v1, "AssistantChatActivity sendMessage error,mAssistant is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 902
    return-void

    .line 904
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-nez v0, :cond_2

    .line 906
    const-string v0, "AssistantChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mAssistant , relation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/Assistant;->getRelation()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 910
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->A:Z

    .line 911
    new-instance v0, Lo/bdk;

    invoke-direct {v0}, Lo/bdk;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k:Landroid/content/Context;

    move-object v2, p1

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v5, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U:Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lo/bdk;->a(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;JLjava/lang/String;)V

    .line 913
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 914
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 915
    return-void
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 1

    .line 1983
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Ljava/lang/Object;)V

    .line 1984
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0}, Lo/bcz;->b()V

    .line 1985
    return-void
.end method

.method public b()V
    .locals 1

    .line 2273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0}, Lo/bcz;->a()V

    .line 2274
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 2292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq:Lo/bcz;

    invoke-virtual {v0, p1}, Lo/bcz;->d(Ljava/lang/String;)V

    .line 2293
    return-void
.end method

.method protected c()V
    .locals 2

    .line 693
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c()V

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ao:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lo/bfb;->setCustTextInputListener(Landroid/text/TextWatcher;)V

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    invoke-virtual {v0, v1}, Lo/bfb;->setOnInputModStatueChangeListener(Lo/bey;)V

    .line 718
    return-void
.end method

.method public d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2

    .line 2327
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .line 2328
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected d(I)V
    .locals 2

    .line 1743
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(I)V

    .line 1744
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->C:Lo/bei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->C:Lo/bei;

    invoke-virtual {v0}, Lo/bei;->getViewHeight()I

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 1749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->C:Lo/bei;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bei;->setViewHeight(I)V

    .line 1752
    :cond_0
    return-void
.end method

.method protected d(J)V
    .locals 2

    .line 774
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 783
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
    .locals 1

    .line 673
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 674
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->al:Z

    .line 676
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ac()V

    .line 677
    return-void
.end method

.method protected d(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2367
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    move-object v1, p1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-boolean v5, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->l:Z

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/bde;->a(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)V

    .line 2368
    return-void
.end method

.method public e()V
    .locals 4

    .line 2251
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ak:Z

    .line 2252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2254
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ad()V

    .line 2256
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x116

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 2264
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x117

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2266
    :cond_1
    :goto_0
    return-void
.end method

.method protected e(Lo/azd$c;Lo/azd$a;)V
    .locals 2

    .line 2379
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_0

    .line 2381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x116

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2382
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aC()V

    goto :goto_0

    .line 2384
    :cond_0
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne p1, v0, :cond_1

    .line 2386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x115

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2388
    :cond_1
    :goto_0
    return-void
.end method

.method protected g()V
    .locals 9

    .line 2337
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g()V

    .line 2338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2340
    return-void

    .line 2342
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 2344
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 2345
    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2346
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2348
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k:Landroid/content/Context;

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    .line 2349
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 2348
    invoke-virtual/range {v0 .. v7}, Lo/aow;->b(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V

    .line 2351
    :cond_1
    goto :goto_0

    .line 2355
    :cond_2
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k:Landroid/content/Context;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    .line 2356
    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 2355
    invoke-virtual/range {v0 .. v7}, Lo/aow;->b(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V

    .line 2358
    :goto_0
    return-void
.end method

.method public k()V
    .locals 6

    .line 2281
    move-object v0, p0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_assistant_receive_msg_info:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_btn_receive:I

    iget-object v5, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ap:Lo/boj$c;

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 2283
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 972
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v2

    invoke-static {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Landroid/app/Activity;JZ)V

    .line 973
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 2006
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ap()V

    .line 2007
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2008
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 362
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onCreate(Landroid/os/Bundle;)V

    .line 363
    const-string v0, "AssistantChatActivity"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_0

    .line 368
    :catch_0
    move-exception v4

    .line 370
    const-string v0, "AssistantChatActivity"

    const-string v1, "AssistantChatActivity get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->finish()V

    .line 372
    return-void

    .line 375
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y()V

    .line 376
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Q()V

    .line 377
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->E:Z

    .line 378
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aq()V

    .line 379
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->A()V

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 382
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag()V

    .line 383
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ae()V

    .line 385
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an()V

    .line 387
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(J)V

    .line 389
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V()V

    .line 390
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->H()V

    .line 392
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c()V

    .line 394
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->i(J)V

    .line 397
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->b(JLandroid/os/Handler;)V

    .line 399
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ay()V

    .line 401
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->T()V

    .line 403
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->R()V

    .line 404
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1990
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1992
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 1994
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->d(JLandroid/os/Handler;)V

    .line 1996
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->af()V

    .line 1997
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->P()V

    .line 1998
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aB()V

    .line 1999
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->S()V

    .line 2000
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onDestroy()V

    .line 2001
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 592
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 593
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->setIntent(Landroid/content/Intent;)V

    .line 596
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ah()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 603
    goto :goto_0

    .line 598
    :catch_0
    move-exception v4

    .line 600
    const-string v0, "AssistantChatActivity"

    const-string v1, "AssistantChatActivity onNewIntent get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->finish()V

    .line 602
    return-void

    .line 604
    :goto_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->i(J)V

    .line 605
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->Y()V

    .line 607
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->S:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->am:Z

    if-eqz v0, :cond_1

    .line 610
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->j:Lo/bdu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 611
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->E()V

    .line 612
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->l()V

    .line 613
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->V()V

    .line 614
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ab:Ljava/lang/String;

    .line 615
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj:Z

    .line 617
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->an()V

    .line 619
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ap()V

    .line 621
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aa()V

    .line 622
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->ag()V

    .line 624
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(J)V

    .line 625
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->H()V

    goto :goto_1

    .line 629
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 631
    :goto_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1967
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onPause()V

    .line 1968
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 1970
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->X()V

    .line 1971
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 582
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onResume()V

    .line 583
    invoke-static {}, Lo/auv;->b()V

    .line 584
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->e(Lo/auu$b;J)V

    .line 586
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->U()V

    .line 587
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1976
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(JI)V

    .line 1977
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onStop()V

    .line 1978
    return-void
.end method
