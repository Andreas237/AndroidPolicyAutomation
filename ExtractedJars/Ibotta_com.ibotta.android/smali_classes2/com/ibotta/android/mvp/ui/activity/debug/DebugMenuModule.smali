.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DebugMenuModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)V

    return-object v0
.end method
