.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PwiCardInputModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 33
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)V

    return-object v7
.end method

.method public provideigcErrorDialogFactory(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
