.class public Lcom/huawei/health/sns/ui/chat/SingleChatActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;
    }
.end annotation


# instance fields
.field protected U:Lcom/huawei/health/sns/model/user/User;

.field private V:Lo/bdq;

.field private W:Landroid/widget/TextView;

.field private Z:Landroid/content/BroadcastReceiver;

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/text/TextWatcher;

.field private ac:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;-><init>()V

    .line 535
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ab:Landroid/text/TextWatcher;

    return-void
.end method

.method private O()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 364
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 365
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 367
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 368
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_action_bar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 371
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_manager_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 374
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_user_name:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->W:Landroid/widget/TextView;

    .line 375
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_manager:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->aa:Landroid/widget/ImageView;

    .line 376
    sget v0, Lcom/huawei/android/sns/R$id;->sns_single_chat_isSilence:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ac:Landroid/widget/ImageView;

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_2

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 380
    const-string v0, "SingleChatActivity"

    const-string v1, "initActionBar userName is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->b(J)V

    .line 383
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initActionBar userName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->W:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ac:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ac:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 392
    :goto_1
    goto :goto_2

    .line 393
    :cond_2
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity.  initActionBar user. The user queryed from DB is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    :goto_2
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 397
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 398
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 399
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_single_chat_detail_emui_five_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v3, v1, v0, p0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 401
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_manager:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->w:Landroid/widget/LinearLayout;

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 404
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->aa:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_single_chat_detail_emui_five_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 406
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 407
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_5

    .line 409
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 410
    const/high16 v0, -0x80000000

    invoke-virtual {v6, v0}, Landroid/view/Window;->addFlags(I)V

    .line 411
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 415
    :cond_5
    return-void
.end method

.method private P()V
    .locals 2

    .line 448
    const-string v0, "SingleChatActivity"

    const-string v1, "init the singleChat message list\'s ListView"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->j:Lo/bdu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 450
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->j:Lo/bdu;

    .line 453
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->t()V

    .line 454
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->u()V

    .line 455
    return-void
.end method

.method private Q()V
    .locals 4

    .line 293
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-static {p0, v1, v2, v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 294
    return-void
.end method

.method private R()V
    .locals 3

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Z:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 498
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    goto :goto_0

    .line 500
    :catch_0
    move-exception v2

    .line 501
    const-string v0, "SingleChatActivity"

    const-string v1, "single chat unRegisterBroadcast()"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    :cond_0
    :goto_0
    return-void
.end method

.method private S()V
    .locals 3

    .line 461
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Z:Landroid/content/BroadcastReceiver;

    .line 487
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 488
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.android.sns.friend.cancel.account"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 490
    return-void
.end method

.method private T()V
    .locals 3

    .line 692
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    new-instance v2, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 710
    return-void
.end method

.method private U()V
    .locals 2

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->V:Lo/bdq;

    if-eqz v0, :cond_0

    .line 519
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->V:Lo/bdq;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 521
    :cond_0
    return-void
.end method

.method private V()V
    .locals 2

    .line 718
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->W:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 719
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ac:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 722
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ac:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 724
    :goto_0
    return-void
.end method

.method private W()V
    .locals 3

    .line 681
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->onBackPressed()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 685
    goto :goto_0

    .line 682
    :catch_0
    move-exception v2

    .line 683
    const-string v0, "SingleChatActivity"

    const-string v1, "backByException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 684
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->finish()V

    .line 686
    :goto_0
    return-void
.end method

.method private X()V
    .locals 4

    .line 510
    new-instance v0, Lo/bdq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bdq;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->V:Lo/bdq;

    .line 511
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->V:Lo/bdq;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 512
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->T()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->b(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 193
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 194
    return-void
.end method

.method public static b(J)V
    .locals 7

    .line 422
    new-instance v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 423
    move-object v0, v6

    move-wide v1, p0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 424
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    .line 425
    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 424
    const/16 v2, 0x25

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v6, v3}, Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V

    .line 426
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 357
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    .line 358
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->O()V

    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 2

    .line 732
    if-eqz p1, :cond_0

    .line 733
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 734
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 732
    :goto_0
    return v0
.end method

.method private static d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 305
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;

    invoke-direct {v0, p2, p3, p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;-><init>(JLcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;)V

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 5

    .line 429
    new-instance v3, Lo/anq;

    invoke-direct {v3}, Lo/anq;-><init>()V

    .line 430
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/anq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 431
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateTitle userName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->W:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 433
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->W()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->d(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private e()V
    .locals 4

    .line 197
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Q()V

    .line 198
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->H()V

    .line 199
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->k(J)V

    .line 201
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(J)V

    .line 203
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->b(JLandroid/os/Handler;)V

    .line 204
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->V()V

    return-void
.end method

.method private f(J)V
    .locals 2

    .line 828
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 829
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 830
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 831
    return-void
.end method

.method private static g(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 783
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;-><init>(J)V

    return-object v0
.end method

.method private k()V
    .locals 10

    .line 252
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 253
    if-eqz v7, :cond_6

    .line 254
    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v8

    .line 255
    if-nez v8, :cond_0

    .line 256
    return-void

    .line 258
    :cond_0
    const-string v0, "userId"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 259
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    const-string v2, "userId"

    invoke-virtual {v8, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->S:Z

    .line 260
    const-string v0, "userId"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    goto :goto_1

    .line 261
    :cond_2
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 263
    const-string v0, "sns_sdk_key_friend_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    .line 264
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->q:Z

    .line 267
    :cond_3
    :goto_1
    const-string v0, "message_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 268
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->m:Z

    .line 269
    const-string v0, "message_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->n:I

    .line 271
    :cond_4
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 272
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->H:I

    .line 273
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->L()V

    .line 277
    :cond_5
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->q:Z

    invoke-static {v7, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->q:Z

    .line 278
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->q:Z

    if-eqz v0, :cond_6

    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 280
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 281
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    move-object v1, p0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;)V

    .line 285
    :cond_6
    return-void
.end method

.method private k(J)V
    .locals 2

    .line 774
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->g(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 775
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .line 208
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    .line 209
    return-void
.end method

.method public a(JI)V
    .locals 1

    .line 814
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(JI)V

    .line 816
    if-eqz p3, :cond_0

    const/4 v0, 0x5

    if-ne p3, v0, :cond_1

    .line 817
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f(J)V

    .line 819
    :cond_1
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 7

    .line 565
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 566
    const-string v0, "SingleChatActivity"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    return-void

    .line 569
    :cond_0
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter sendMessage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_1

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v0

    if-eqz v0, :cond_2

    .line 574
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user is not tow way, relation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    goto :goto_0

    .line 578
    :cond_1
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity sendMessage error,user is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    return-void

    .line 582
    :cond_2
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->A:Z

    .line 583
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 584
    new-instance v0, Lo/bdk;

    invoke-direct {v0}, Lo/bdk;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->k:Landroid/content/Context;

    move-object v2, p1

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/bdk;->a(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;JLjava/lang/String;)V

    .line 585
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 586
    return-void
.end method

.method protected c()V
    .locals 2

    .line 527
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c()V

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->ab:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lo/bfb;->setCustTextInputListener(Landroid/text/TextWatcher;)V

    .line 530
    return-void
.end method

.method protected d(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 554
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/util/ArrayList;)V

    .line 555
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 437
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 438
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 439
    const-string v0, "userId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 440
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 441
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 442
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 159
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onCreate(Landroid/os/Bundle;)V

    .line 162
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->c()V

    .line 165
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->k()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    goto :goto_0

    .line 166
    :catch_0
    move-exception v2

    .line 167
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity onCreate get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->finish()V

    .line 170
    :goto_0
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 172
    if-eqz v2, :cond_0

    .line 173
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 177
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->b()V

    .line 180
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->A()V

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 182
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->X()V

    .line 183
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->S()V

    .line 184
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->P()V

    .line 185
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c()V

    .line 186
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->e()V

    .line 187
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 751
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U()V

    .line 752
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->R()V

    .line 753
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 754
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 756
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->d(JLandroid/os/Handler;)V

    .line 758
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onDestroy()V

    .line 759
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 7

    .line 222
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 223
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->setIntent(Landroid/content/Intent;)V

    .line 224
    iget-wide v4, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    .line 227
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->k()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    goto :goto_0

    .line 228
    :catch_0
    move-exception v6

    .line 229
    const-string v0, "SingleChatActivity"

    const-string v1, "sigleChat onNewIntent get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->finish()V

    .line 233
    :goto_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->k(J)V

    .line 234
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->S:Z

    if-nez v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->j:Lo/bdu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 237
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->E()V

    .line 238
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->l()V

    .line 239
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->Q()V

    .line 240
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->O()V

    .line 242
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(J)V

    .line 243
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->H()V

    .line 244
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v4, v5, v1}, Lo/aus;->d(JLandroid/os/Handler;)V

    .line 245
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->b(JLandroid/os/Handler;)V

    goto :goto_1

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 249
    :goto_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 745
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onPause()V

    .line 746
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 747
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 213
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onResume()V

    .line 214
    invoke-static {}, Lo/auv;->b()V

    .line 215
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->e(Lo/auu$b;J)V

    .line 217
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->z()V

    .line 218
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 763
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(JI)V

    .line 764
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onStop()V

    .line 765
    return-void
.end method

.method protected q()V
    .locals 2

    .line 739
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->q()V

    .line 740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 741
    return-void
.end method
