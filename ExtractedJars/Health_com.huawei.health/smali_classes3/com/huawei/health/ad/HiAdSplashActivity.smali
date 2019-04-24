.class public Lcom/huawei/health/ad/HiAdSplashActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static d:Z


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->b:Z

    .line 46
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/ad/HiAdSplashActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/ad/HiAdSplashActivity$4;-><init>(Lcom/huawei/health/ad/HiAdSplashActivity;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->a:Landroid/os/Handler;

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 112
    sget-boolean v0, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    return v0
.end method

.method private b()V
    .locals 6

    .line 160
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showHiAdSplash()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAdSplash;

    move-result-object v0

    const/16 v1, 0x7d0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/IHiAdSplash;->setSloganDefTime(I)V

    .line 163
    const v0, 0x7f1205a0

    invoke-virtual {p0, v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/views/PPSSplashView;

    .line 164
    invoke-static {p0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 167
    invoke-virtual {v4, v5}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 170
    :cond_0
    invoke-static {}, Lcom/huawei/health/ad/HiAdSplashActivity;->c()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->setAdSlotParam(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    .line 172
    const v0, 0x7f050a87

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->setSloganResId(I)V

    .line 173
    const v0, 0x7f12059f

    invoke-virtual {p0, v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->setLogo(Landroid/view/View;)V

    .line 174
    new-instance v0, Lcom/huawei/health/ad/HiAdSplashActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/ad/HiAdSplashActivity$3;-><init>(Lcom/huawei/health/ad/HiAdSplashActivity;)V

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->setAdListener(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V

    .line 196
    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->loadAd()V

    .line 197
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/ad/HiAdSplashActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->d()V

    return-void
.end method

.method private static c()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
    .locals 4

    .line 146
    new-instance v2, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;-><init>()V

    .line 147
    new-instance v3, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    const-string v0, "f6105fe269aa11e6af7500163e291137"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    invoke-virtual {v2, v3}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setAdIds(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setDeviceType(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    .line 150
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setOrientation(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setTest(Z)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    .line 151
    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->build()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 80
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->a:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 81
    iget-boolean v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->b:Z

    if-nez v0, :cond_0

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->b:Z

    .line 83
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump into application, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    .line 85
    const v0, 0x7f08000a

    const v1, 0x7f08000a

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/ad/HiAdSplashActivity;->overridePendingTransition(II)V

    .line 86
    invoke-virtual {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->finish()V

    .line 88
    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 6

    .line 117
    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAd;

    move-result-object v4

    .line 118
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-interface {v4, v0, v1}, Lcom/huawei/openalliance/ad/inter/IHiAd;->initLog(ZI)V

    .line 119
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Lcom/huawei/openalliance/ad/inter/IHiAd;->enableUserInfo(Z)V

    .line 120
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Lcom/huawei/openalliance/ad/inter/IHiAd;->enableSharePd(Z)V

    .line 123
    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAdSplash;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/ad/HiAdSplashActivity;->c()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/IHiAdSplash;->isAvailable(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Z

    move-result v5

    .line 124
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query HiAdSplash one isAvailable="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", ad_id="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "f6105fe269aa11e6af7500163e291137"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    if-eqz v5, :cond_1

    .line 128
    invoke-static {p0}, Lo/dbf;->l(Landroid/content/Context;)Z

    move-result v5

    .line 129
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query HiAdSplash two isAvailable="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    if-eqz v5, :cond_1

    .line 133
    invoke-static {p0}, Lo/dbf;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 134
    :goto_0
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query HiAdSplash thr isAvailable="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :cond_1
    sput-boolean v5, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    .line 141
    sget-boolean v0, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    return v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 59
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 60
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter splash Ad onCreate(), "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 62
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 64
    invoke-virtual {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 67
    :cond_0
    const v0, 0x7f08000a

    const v1, 0x7f08000a

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/ad/HiAdSplashActivity;->overridePendingTransition(II)V

    .line 68
    const v0, 0x7f0700aa

    invoke-virtual {p0, v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->setContentView(I)V

    .line 72
    invoke-direct {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->b()V

    .line 74
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->a:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 75
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->a:Landroid/os/Handler;

    const/16 v1, 0x3e9

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 106
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 107
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/ad/HiAdSplashActivity;->d:Z

    .line 109
    return-void
.end method

.method protected onRestart()V
    .locals 1

    .line 99
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->b:Z

    .line 101
    invoke-direct {p0}, Lcom/huawei/health/ad/HiAdSplashActivity;->d()V

    .line 102
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity;->b:Z

    .line 93
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 94
    return-void
.end method
