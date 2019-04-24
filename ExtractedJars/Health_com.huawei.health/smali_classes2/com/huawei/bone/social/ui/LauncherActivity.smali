.class public Lcom/huawei/bone/social/ui/LauncherActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/bone/social/ui/LauncherActivity$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field public c:Ljava/lang/String;

.field private e:Lo/emr;

.field private f:Lcom/huawei/bone/social/ui/RankingFragment;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Lo/elp;

.field private k:Landroid/widget/FrameLayout;

.field private l:J

.field private m:Z

.field private final n:Landroid/content/BroadcastReceiver;

.field private o:J

.field private p:Landroid/widget/ImageView;

.field private r:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const-class v0, Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 50
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->b:I

    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->o:J

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->l:J

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->m:Z

    .line 183
    new-instance v0, Lcom/huawei/bone/social/ui/LauncherActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$3;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->n:Landroid/content/BroadcastReceiver;

    .line 383
    new-instance v0, Lcom/huawei/bone/social/ui/LauncherActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$10;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/LauncherActivity;Landroid/view/View;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/bone/social/ui/LauncherActivity;->b(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/LauncherActivity;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->m:Z

    return p1
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/emr;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    return-object v0
.end method

.method private b(Landroid/view/View;)V
    .locals 4

    .line 218
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$layout;->plugin_social_rankment_popup_view:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 219
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->i:Lo/elp;

    .line 220
    sget v0, Lcom/huawei/bone/social/R$id;->rankment_friend_red_dot:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->p:Landroid/widget/ImageView;

    .line 221
    iget-boolean v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->m:Z

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 227
    :goto_0
    sget v0, Lcom/huawei/bone/social/R$id;->rankment_friend_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->h:Landroid/widget/RelativeLayout;

    .line 228
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->h:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/bone/social/ui/LauncherActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$4;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    sget v0, Lcom/huawei/bone/social/R$id;->rankment_quit_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->g:Landroid/widget/RelativeLayout;

    .line 236
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/bone/social/ui/LauncherActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$2;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->i:Lo/elp;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 245
    return-void
.end method

.method static synthetic c(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/elp;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->i:Lo/elp;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/bone/social/ui/LauncherActivity;)Lcom/huawei/bone/social/ui/RankingFragment;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 215
    return-void
.end method

.method private g()V
    .locals 3

    .line 207
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 208
    const-string v0, "main_social_red_dot_friend_show"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 209
    const-string v0, "main_social_red_dot_friend_dismiss"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 211
    return-void
.end method

.method static synthetic h(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->i()V

    return-void
.end method

.method private i()V
    .locals 7

    .line 248
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/xu;->a(Landroid/content/Context;)Lo/xu;

    move-result-object v0

    invoke-virtual {v0}, Lo/xu;->e()Z

    move-result v4

    .line 249
    if-nez v4, :cond_0

    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 251
    iget-wide v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->o:J

    sub-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 252
    iput-wide v5, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->o:J

    .line 253
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_login_no_network:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 254
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 257
    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 119
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    .line 120
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/bone/social/ui/LauncherActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$b;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonClickable(Z)V

    .line 125
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$drawable;->ic_more_normal_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonBackBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/bone/social/ui/LauncherActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$5;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 412
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 413
    return-void
.end method

.method public c()V
    .locals 6

    .line 278
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_hwh_privacy_share_app_my_rankment_disable:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/bone/social/ui/LauncherActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$8;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    .line 280
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_settings_firmware_upgrade_exit:I

    sget v2, Lcom/huawei/bone/social/R$color;->health_webview_quit_act_text_color:I

    new-instance v3, Lcom/huawei/bone/social/ui/LauncherActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$1;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    .line 285
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 320
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 321
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 322
    return-void
.end method

.method public d()V
    .locals 4

    .line 141
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->a()V

    goto :goto_0

    .line 144
    :cond_0
    sget-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rankingFragment is null, return."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :goto_0
    return-void
.end method

.method public e()V
    .locals 6

    .line 260
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 262
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 263
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    sget-object v0, Lo/dae;->w:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 265
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 266
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/vu;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 269
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->l:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->l:J

    .line 271
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_settings_logout:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 275
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Landroid/os/Message;)V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 381
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 366
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 367
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 75
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    iput-object p0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    .line 78
    sget-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    sget v0, Lcom/huawei/bone/social/R$layout;->activity_social_home:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->setContentView(I)V

    .line 80
    sget v0, Lcom/huawei/bone/social/R$id;->user_launcher_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    .line 81
    sget v0, Lcom/huawei/bone/social/R$id;->social_rank_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->k:Landroid/widget/FrameLayout;

    .line 82
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->k()V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 84
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 85
    const-string v0, "choose_fragemnt_key"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->b:I

    .line 87
    :cond_0
    const-string v0, "socialRankSwitch"

    const-string v1, ""

    invoke-static {p0, v0, v1}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 88
    sget-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rankSwitch="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->k:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 90
    iget v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->b:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 91
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {v0}, Lcom/huawei/bone/social/ui/RankingFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    .line 92
    const-string v0, "0"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->d(Z)V

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->setArguments(Landroid/os/Bundle;)V

    .line 97
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$id;->social_rank_container:I

    iget-object v2, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    const-string v3, "ranking"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 98
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_main_home_bottom_social_friend_ranking_list:I

    invoke-virtual {p0, v1}, Lcom/huawei/bone/social/ui/LauncherActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->finish()V

    .line 103
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->k()V

    .line 105
    const-string v0, "privacySetFlags"

    const-string v1, ""

    invoke-static {p0, v0, v1}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->c:Ljava/lang/String;

    .line 106
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 107
    const-string v0, "privacySetFlags"

    const-string v1, "11111"

    invoke-static {p0, v0, v1}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :cond_4
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->g()V

    .line 110
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 326
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->setContentView(Landroid/view/View;)V

    .line 327
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 328
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->f()V

    .line 330
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 332
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->r:Landroid/os/Handler;

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->h:Landroid/widget/RelativeLayout;

    .line 340
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 341
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->g:Landroid/widget/RelativeLayout;

    .line 345
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->f:Lcom/huawei/bone/social/ui/RankingFragment;

    .line 346
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->e:Lo/emr;

    .line 347
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->p:Landroid/widget/ImageView;

    .line 348
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->a:Landroid/content/Context;

    .line 349
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->k:Landroid/widget/FrameLayout;

    .line 350
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity;->i:Lo/elp;

    .line 351
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 355
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 356
    invoke-static {}, Lo/xo;->e()Lo/xo;

    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/LauncherActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xo;->e(Landroid/content/Context;)V

    .line 357
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 372
    sget-object v0, Lcom/huawei/bone/social/ui/LauncherActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSaveInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 361
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 362
    return-void
.end method
