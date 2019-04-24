.class public Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "HelpCenterActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;"
    }
.end annotation


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;
    .locals 1

    .line 21
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;)V

    .line 23
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->helpCenterModule(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;)Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;)V
    .locals 0

    .line 29
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;)V

    return-void
.end method

.method public launchHelpCenter(Ljava/lang/String;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/util/AppHelper;->openUrlExternally(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    .line 39
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->setTitleForLoadFailure()V

    const v0, 0x7f110186

    .line 40
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;->setTitle(I)V

    return-void
.end method
