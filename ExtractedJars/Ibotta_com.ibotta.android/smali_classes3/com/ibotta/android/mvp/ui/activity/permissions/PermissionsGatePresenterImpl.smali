.class public Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "PermissionsGatePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;"
    }
.end annotation


# instance fields
.field private permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    return-void
.end method


# virtual methods
.method public onLoadStateFailed()V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->finish()V

    return-void
.end method

.method public onPermissionsAccepted(I)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 42
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->startAfterIntent()V

    .line 43
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->finish()V

    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->startAfterIntentForResult()V

    :goto_0
    return-void
.end method

.method public onPermissionsDenied()V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->finish()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    if-nez v0, :cond_0

    const-string p1, "permissionsHelper is null: bad state."

    const/4 p2, 0x0

    .line 52
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;->finish()V

    return-void

    .line 57
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/permissions/PermissionsHelper;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public setPermissionsHelper(Lcom/ibotta/android/permissions/PermissionsHelper;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    return-void
.end method

.method public skipGatedDialogAndShowLocationPrompt()V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenterImpl;->permissionsHelper:Lcom/ibotta/android/permissions/PermissionsHelper;

    if-eqz v0, :cond_0

    .line 63
    invoke-interface {v0}, Lcom/ibotta/android/permissions/PermissionsHelper;->requestLocationPermissionDirectly()V

    :cond_0
    return-void
.end method
