.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ConnectedAccountsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;"
    }
.end annotation


# instance fields
.field protected calvAccounts:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900e1
    .end annotation
.end field

.field protected deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvDisclaimer:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090519
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->calvAccounts:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->calvAccounts:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 51
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 47
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public connectToGoogle()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    .line 101
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;->getGoogleSignInManager()Lcom/ibotta/android/social/google/GoogleSignInManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->getSignInIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x6

    .line 100
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;
    .locals 1

    .line 56
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;

    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;-><init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V

    .line 58
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->connectedAccountsModule(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;

    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;)V
    .locals 0

    .line 64
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 81
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;->getFacebookManager()Lcom/ibotta/android/social/facebook/FacebookManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/social/facebook/FacebookManager;->onActivityResult(IILandroid/content/Intent;)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;->getGoogleSignInManager()Lcom/ibotta/android/social/google/GoogleSignInManager;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/social/google/GoogleSignInManager;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConnectClicked(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;->onConnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0027

    .line 71
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->setContentView(I)V

    .line 72
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const p1, 0x7f1105c8

    .line 74
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->initAdapter()V

    return-void
.end method

.method public onDisconnectClicked(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;->onDisconnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;)V"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->calvAccounts:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsListView;->setRows(Ljava/util/List;)V

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->tvDisclaimer:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V
    .locals 3

    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/ApiException;->getStatusCode()I

    move-result p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;

    const/4 v1, 0x0

    const/4 v2, 0x5

    .line 106
    invoke-static {p1, p0, v1, v2, v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorDialogFragment(ILandroid/app/Activity;Landroid/support/v4/app/Fragment;ILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void
.end method
