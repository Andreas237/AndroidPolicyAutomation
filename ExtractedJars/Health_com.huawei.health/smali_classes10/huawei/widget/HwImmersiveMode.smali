.class public Lhuawei/widget/HwImmersiveMode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HwImmersiveMode"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private final mContext:Landroid/content/Context;

.field private mHwImmersiveMode:Lo/fky;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Lo/fky;

    invoke-direct {v0, p1}, Lo/fky;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    .line 35
    iput-object p1, p0, Lhuawei/widget/HwImmersiveMode;->mActivity:Landroid/app/Activity;

    .line 36
    iput-object p1, p0, Lhuawei/widget/HwImmersiveMode;->mContext:Landroid/content/Context;

    .line 37
    return-void
.end method

.method private getNavigationHeight()I
    .locals 5

    .line 164
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "navigation_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 165
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public setActionBarBlurEnable(Landroid/app/ActionBar;Z)V
    .locals 1

    .line 100
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1, p2}, Lo/fky;->setActionBarBlurEnable(Landroid/app/ActionBar;Z)V

    .line 101
    return-void
.end method

.method public setHwBottomNavigationViewBlurEnable(Lhuawei/widget/HwBottomNavigationView;Z)V
    .locals 0

    .line 132
    if-eqz p1, :cond_0

    .line 133
    invoke-virtual {p1, p2}, Lhuawei/widget/HwBottomNavigationView;->setBlurEnable(Z)V

    .line 135
    :cond_0
    return-void
.end method

.method public setHwToolbarBlurEnable(Lo/fla;Z)V
    .locals 1

    .line 80
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1, p2}, Lo/fky;->setHwToolbarBlurEnable(Lo/fla;Z)V

    .line 81
    return-void
.end method

.method public setMultiWindowModeChanged(Z)V
    .locals 1

    .line 143
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1}, Lo/fky;->setMultiWindowModeChanged(Z)V

    .line 144
    return-void
.end method

.method public setNavigationBarBlurEnable(Z)V
    .locals 1

    .line 54
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1}, Lo/fky;->setNavigationBarBlurEnable(Z)V

    .line 55
    return-void
.end method

.method public setNavigationBarOverlayColor(I)V
    .locals 1

    .line 70
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1}, Lo/fky;->setNavigationBarOverlayColor(I)V

    .line 71
    return-void
.end method

.method public setSpiltViewBlurEnable(Landroid/app/ActionBar;Z)V
    .locals 1

    .line 110
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1, p2}, Lo/fky;->setSpiltViewBlurEnable(Landroid/app/ActionBar;Z)V

    .line 111
    return-void
.end method

.method public setSpiltViewBlurEnable(Lo/fla;Z)V
    .locals 1

    .line 90
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1, p2}, Lo/fky;->setSpiltViewBlurEnable(Lo/fla;Z)V

    .line 91
    return-void
.end method

.method public setSpitViewGone()V
    .locals 6

    .line 147
    invoke-direct {p0}, Lhuawei/widget/HwImmersiveMode;->getNavigationHeight()I

    move-result v3

    .line 148
    invoke-static {}, Lhuawei/android/widget/loader/ResLoader;->getInstance()Lhuawei/android/widget/loader/ResLoader;

    move-result-object v0

    const-string v1, "id"

    const-string v2, "split_action_bar"

    invoke-virtual {v0, v1, v2}, Lhuawei/android/widget/loader/ResLoader;->getInternalId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 153
    const-string v0, "HwImmersiveMode"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setSpitViewGone: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0}, Lo/fky;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 155
    if-eqz v5, :cond_0

    .line 156
    neg-int v0, v3

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 157
    const-string v0, "HwImmersiveMode"

    const-string v1, "mSplitView NBA"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 159
    :cond_0
    const-string v0, "HwImmersiveMode"

    const-string v1, "mSplitView is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    :goto_0
    return-void
.end method

.method public setStatusBarBlurEnable(Z)V
    .locals 1

    .line 45
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1}, Lo/fky;->setStatusBarBlurEnable(Z)V

    .line 46
    return-void
.end method

.method public setStatusBarOverlayColor(I)V
    .locals 1

    .line 62
    iget-object v0, p0, Lhuawei/widget/HwImmersiveMode;->mHwImmersiveMode:Lo/fky;

    invoke-virtual {v0, p1}, Lo/fky;->setStatusBarOverlayColor(I)V

    .line 63
    return-void
.end method

.method public setSubTabWidgetBlurEnable(Lhuawei/widget/HwSubTabWidget;Z)V
    .locals 0

    .line 120
    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget;->setBlurEnable(Z)V

    .line 123
    :cond_0
    return-void
.end method
