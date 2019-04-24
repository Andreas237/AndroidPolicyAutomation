.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "DebugMenuPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenter;"
    }
.end annotation


# instance fields
.field private final debugState:Lcom/ibotta/android/state/app/debug/DebugState;

.field private final permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

.field private final pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;Lcom/ibotta/android/state/pwi/PwiUserState;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    .line 27
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    return-void
.end method

.method private clearPwiOnboardingFlag()V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->clearAll()V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showPwiOnboardingFlagClearedToast()V

    return-void
.end method

.method private showPermissionPrimers()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->permissionPrimersVariant:Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    invoke-interface {v1}, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;->showLocationPrimer()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showPermissionPrimersToast(Z)V

    return-void
.end method

.method private toggleShowOfferIdInSpotlight()V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowOfferIdInSpotlight()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveShowOfferIdInSpotlight(Z)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowOfferIdInSpotlight()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showOfferIdInSpotlightChangeToast(Z)V

    return-void
.end method

.method private toggleShowingImageTransparency()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowImageTransparency()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveShowImageTransparency(Z)V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->clearImageCache()V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowImageTransparency()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showImageTransparencyChangeToast(Z)V

    return-void
.end method


# virtual methods
.method public onDebugMenuItemClicked(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 64
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->showPermissionPrimers()V

    goto :goto_0

    .line 61
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->clearPwiOnboardingFlag()V

    goto :goto_0

    .line 58
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->toggleShowOfferIdInSpotlight()V

    goto :goto_0

    .line 55
    :pswitch_3
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->toggleShowingImageTransparency()V

    goto :goto_0

    .line 52
    :pswitch_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showDebugFeatureFlags()V

    goto :goto_0

    .line 49
    :pswitch_5
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showSemiModalDialog()V

    goto :goto_0

    .line 46
    :pswitch_6
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showFindEngagements()V

    goto :goto_0

    .line 43
    :pswitch_7
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showGeofenceTest()V

    goto :goto_0

    .line 40
    :pswitch_8
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showTestRoutes()V

    goto :goto_0

    .line 37
    :pswitch_9
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->requestDebugLoadingPermissions()V

    goto :goto_0

    .line 34
    :pswitch_a
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuView;->showGeneralDebugSettings()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
