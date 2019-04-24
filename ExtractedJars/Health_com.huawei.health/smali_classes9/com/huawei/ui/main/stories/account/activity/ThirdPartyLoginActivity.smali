.class public Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;,
        Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$b;,
        Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;
    }
.end annotation


# instance fields
.field private a:Lo/euc;

.field private b:Lo/egd;

.field private c:Lo/egd;

.field private d:Lo/egd;

.field private e:Lo/egd;

.field private f:Lo/eug;

.field private g:Landroid/os/Handler;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private i:Lo/emr;

.field private k:Landroid/app/Activity;

.field private l:Ljava/lang/String;

.field private m:Lo/fip;

.field private n:Landroid/widget/TextView;

.field private o:Z

.field private p:Landroid/widget/TextView;

.field private t:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->o:Z

    .line 300
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->t:I

    return-void
.end method

.method private a()V
    .locals 10

    .line 461
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 462
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is arabicLanguage = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    const-wide/16 v5, 0x0

    .line 464
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    const-wide v5, 0x3fe5555555555555L    # 0.6666666666666666

    goto :goto_0

    .line 468
    :cond_0
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 471
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->third_party_login_title_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->p:Landroid/widget/TextView;

    .line 472
    sget v0, Lcom/huawei/ui/main/R$id;->third_party_login_title_notices:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->n:Landroid/widget/TextView;

    .line 473
    sget v0, Lcom/huawei/ui/main/R$id;->btnWeiXin:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    .line 474
    sget v0, Lcom/huawei/ui/main/R$id;->btnQQ:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    .line 476
    sget v0, Lcom/huawei/ui/main/R$id;->btnWeiBo:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    .line 477
    sget v0, Lcom/huawei/ui/main/R$id;->btnHuaWei:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c:Lo/egd;

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 485
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_1

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_change_account_migrate:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 490
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v0, v0

    mul-double/2addr v0, v5

    double-to-int v7, v0

    .line 491
    const/4 v8, 0x0

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$drawable;->wechat:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_wechat:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/eul;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/text/Spanned;

    move-result-object v8

    .line 493
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 495
    iput v7, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    invoke-virtual {v0, v9}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_wechat:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e:Lo/egd;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/egd;->setGravity(I)V

    .line 501
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$drawable;->qq:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_qq:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/eul;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/text/Spanned;

    move-result-object v8

    .line 502
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 504
    iput v7, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    invoke-virtual {v0, v9}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_qq:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b:Lo/egd;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/egd;->setGravity(I)V

    .line 510
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$drawable;->weibo:I

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_weibo:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/eul;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/text/Spanned;

    move-result-object v8

    .line 511
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 513
    iput v7, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    invoke-virtual {v0, v9}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_third_login_weibo:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d:Lo/egd;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/egd;->setGravity(I)V

    .line 518
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->third_party_login_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->i:Lo/emr;

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->i:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_change_account_migrate:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$9;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 527
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a(Lo/eui;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lo/eui;)V
    .locals 4

    .line 450
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelRequestCloudKidWatchDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lo/eui;)V

    .line 452
    return-void
.end method

.method private a(Lo/eui;Ljava/lang/String;)V
    .locals 8

    .line 654
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginType()I

    move-result v4

    .line 655
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showUserChangedDialog, loginType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    const-string v5, ""

    .line 657
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 660
    :pswitch_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_huawei:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 661
    goto :goto_1

    .line 663
    :pswitch_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_wechat:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 664
    goto :goto_1

    .line 666
    :pswitch_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_weibo:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 667
    goto :goto_1

    .line 669
    :pswitch_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_qq:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 670
    goto :goto_1

    .line 672
    :goto_0
    :pswitch_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_login_other_way_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 675
    :goto_1
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    .line 676
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 677
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_yes:I

    new-instance v2, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$6;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    .line 678
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_no:I

    new-instance v2, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V

    .line 684
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 691
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v7

    .line 692
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egv;->setCancelable(Z)V

    .line 693
    invoke-virtual {v7}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 694
    invoke-virtual {v7}, Lo/egv;->show()V

    .line 696
    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->l:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 4

    .line 574
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginByQQ"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    invoke-static {v0}, Lcom/tencent/open/utils/SystemUtils;->checkMobileQQ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 577
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQHealthConnectActivity onClick() loginQQ()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    new-instance v0, Lo/euf;

    invoke-direct {v0, p0}, Lo/euf;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->f:Lo/eug;

    invoke-interface {v0, v1}, Lo/euc;->e(Lo/eug;)V

    goto :goto_0

    .line 581
    :cond_0
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "System is not install QQ App."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    const-string v1, "com.tencent.mobileqq"

    invoke-static {v0, v1}, Lo/eul;->c(Landroid/app/Activity;Ljava/lang/String;)V

    .line 584
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lo/eui;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .line 379
    if-nez p3, :cond_0

    .line 380
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lo/dcs;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 381
    :cond_0
    const/4 v0, 0x2

    if-eq p3, v0, :cond_1

    const/4 v0, 0x3

    if-ne p3, v0, :cond_2

    .line 382
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->g:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 384
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lo/dcs;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 386
    :cond_2
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialog copyHealthDatasFromAtoB down and failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 388
    const-string v0, "error_code"

    int-to-long v1, p3

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 389
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notice local migrate account data but return error message."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8e1

    const/4 v3, 0x0

    invoke-static {v2, v0, v4, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 390
    int-to-long v0, p3

    invoke-static {v0, v1}, Lo/eul;->e(J)V

    .line 392
    :goto_0
    return-void
.end method

.method private b(Lo/eui;)V
    .locals 10

    .line 264
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialog(final AccountContext oldaccount) enter oldaccount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->l:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->l:Ljava/lang/String;

    .line 269
    :cond_1
    invoke-virtual {p1}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v5

    .line 270
    invoke-virtual {p1}, Lo/eui;->i()Ljava/lang/String;

    move-result-object v6

    .line 271
    invoke-virtual {p1}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v7

    .line 273
    new-instance v9, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    invoke-direct {v9, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_other_account_migrate_tips:I

    .line 275
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    iget-object v3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->l:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 276
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    invoke-direct {v2, p0, v5, v7}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_cancle_button:I

    .line 291
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$2;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 296
    invoke-virtual {v9}, Lo/egv$b;->b()Lo/egv;

    move-result-object v8

    .line 297
    invoke-virtual {v8}, Lo/egv;->show()V

    .line 298
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 558
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginByWeiXin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 561
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click weixin not installed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lo/eul;->c(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 564
    :cond_0
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click weixin login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    new-instance v0, Lo/euk;

    invoke-direct {v0, p0}, Lo/euk;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->f:Lo/eug;

    invoke-interface {v0, v1}, Lo/euc;->e(Lo/eug;)V

    .line 568
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e(Lo/eui;)V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 305
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;-><init>()V

    .line 308
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalHuid(Ljava/lang/String;)V

    .line 309
    invoke-virtual {v4, p2}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalST(Ljava/lang/String;)V

    .line 310
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->t:I

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx;)V

    .line 353
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 362
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    new-instance v4, Lcom/huawei/hihealth/HiDataUpdateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataUpdateOption;-><init>()V

    .line 364
    const-string v0, "old_huid"

    invoke-virtual {v4, v0, p1}, Lcom/huawei/hihealth/HiDataUpdateOption;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const-string v0, "new_huid"

    invoke-virtual {v4, v0, p2}, Lcom/huawei/hihealth/HiDataUpdateOption;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    const-string v0, "copy_sync_status"

    invoke-virtual {v4, v0, p3}, Lcom/huawei/hihealth/HiDataUpdateOption;->putBoolean(Ljava/lang/String;Z)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V

    .line 375
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    return-void
.end method

.method private c(Lo/eui;)V
    .locals 5

    .line 456
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: quaryIsCloudHaveKidWatch() accountContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->g:Landroid/os/Handler;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->g:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 459
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;I)I
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->t:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->h:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 172
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getUserName enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->m:Lo/fip;

    if-nez v0, :cond_0

    .line 174
    new-instance v0, Lo/fip;

    invoke-direct {v0}, Lo/fip;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->m:Lo/fip;

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->m:Lo/fip;

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$4;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-virtual {v0, v1}, Lo/fip;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a(Lo/eui;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->t:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->f(Lo/eui;)V

    return-void
.end method

.method private e(Lo/eui;)V
    .locals 6

    .line 702
    const-string v2, ""

    .line 703
    const-string v3, ""

    .line 704
    const/4 v4, 0x0

    .line 705
    const-string v5, ""

    .line 706
    invoke-virtual {p1}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v2

    .line 707
    invoke-virtual {p1}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v3

    .line 708
    invoke-virtual {p1}, Lo/eui;->e()I

    move-result v4

    .line 714
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSiteID(ILo/dcx;)V

    .line 718
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setUserID(Ljava/lang/String;)V

    .line 719
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lo/eui;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setLoginType(I)V

    .line 720
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$5;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-virtual {v0, v3, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 750
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Z)Z
    .locals 0

    .line 76
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->o:Z

    return p1
.end method

.method private f(Lo/eui;)V
    .locals 10

    .line 777
    const-string v4, ""

    .line 778
    const-string v5, ""

    .line 779
    invoke-virtual {p1}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v6

    .line 780
    invoke-virtual {p1}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v7

    .line 781
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.weixin.qq.com/sns/userinfo?access_token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&openid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 783
    invoke-static {v8}, Lo/eul;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 785
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 786
    const-string v0, "nickname"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 787
    invoke-virtual {p1, v5}, Lo/eui;->c(Ljava/lang/String;)V

    .line 788
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lo/eui;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    goto :goto_0

    .line 789
    :catch_0
    move-exception v9

    .line 790
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lo/eui;)V

    .line 792
    return-void

    .line 794
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Lo/eui;)V
    .locals 2

    .line 395
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-static {v0, p1, v1}, Lo/eue;->c(Landroid/content/Context;Lo/eui;Lo/eug;)V

    .line 447
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 644
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    invoke-interface {v0, p1, p2, p3}, Lo/euc;->a(IILandroid/content/Intent;)V

    .line 648
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 6

    .line 755
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed:loginStatus:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->o:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 757
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->finish()V

    .line 758
    return-void

    .line 760
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->o:Z

    if-nez v0, :cond_1

    .line 762
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 763
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login,close app."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 765
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 766
    invoke-virtual {v4, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 767
    goto :goto_0

    .line 768
    :cond_1
    return-void

    .line 770
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 531
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 532
    sget v0, Lcom/huawei/ui/main/R$id;->btnWeiXin:I

    if-ne v4, v0, :cond_0

    .line 533
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click weixin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c()V

    goto/16 :goto_0

    .line 535
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->btnQQ:I

    if-ne v4, v0, :cond_1

    .line 536
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click qq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b()V

    goto :goto_0

    .line 538
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->btnWeiBo:I

    if-ne v4, v0, :cond_2

    .line 539
    new-instance v0, Lo/eum;

    invoke-direct {v0, p0}, Lo/eum;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a:Lo/euc;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->f:Lo/eug;

    invoke-interface {v0, v1}, Lo/euc;->e(Lo/eug;)V

    .line 541
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click Sinawei"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 543
    :cond_2
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click huaweiAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 547
    const-string v0, "loginChannel"

    const v1, 0x280de80

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 548
    const-string v0, "reqClientType"

    const/16 v1, 0x2a

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 549
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 550
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    invoke-static {v0, v6, v5, v1}, Lcom/huawei/cloudservice/CloudAccountManager;->getAccountsByType(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 552
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 113
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_third_party_login:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->setContentView(I)V

    .line 114
    iput-object p0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->k:Landroid/app/Activity;

    .line 115
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->h:Ljava/util/concurrent/ExecutorService;

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d()V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a()V

    .line 119
    new-instance v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$b;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$b;-><init>(Landroid/os/Looper;Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->g:Landroid/os/Handler;

    .line 120
    new-instance v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->f:Lo/eug;

    .line 122
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 212
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->h:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 216
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->m:Lo/fip;

    .line 217
    return-void
.end method
