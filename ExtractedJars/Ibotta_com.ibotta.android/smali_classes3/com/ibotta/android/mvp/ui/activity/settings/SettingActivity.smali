.class public Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "SettingActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;"
    }
.end annotation


# instance fields
.field protected slvSettings:Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090416
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->slvSettings:Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->slvSettings:Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;
    .locals 1

    .line 43
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;

    move-result-object v0

    .line 44
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;)V

    .line 45
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->settingModule(Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;)Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;

    move-result-object p1

    return-object p1
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;)V
    .locals 0

    .line 51
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c006a

    .line 58
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->setContentView(I)V

    .line 59
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const v0, 0x7f110031

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->initAdapter()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0016

    .line 69
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 71
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 76
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f09001f

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 78
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;->onLogOutClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method public onRowClicked(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;->onRowClicked(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    return-void
.end method

.method public setSettingRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;",
            ">;)V"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->slvSettings:Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/settings/SettingsListView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public showConnectedAccounts()V
    .locals 0

    .line 113
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public showDebugMenu()V
    .locals 1

    .line 158
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugMenuIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/DebugMenuIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugMenuIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showEndUserLicenseAgreement()V
    .locals 2

    .line 141
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    const v1, 0x7f11015b

    .line 142
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 141
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showLogout()V
    .locals 2

    .line 153
    new-instance v0, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showPreferences()V
    .locals 1

    .line 118
    new-instance v0, Lcom/ibotta/android/routing/intent/PreferencesIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/PreferencesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PreferencesIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showPrivacyPolicy()V
    .locals 2

    .line 129
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    const v1, 0x7f1101d4

    .line 130
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showTermsOfUse()V
    .locals 2

    .line 135
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    const v1, 0x7f1101fc

    .line 136
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 135
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showThirdPartyAcknowledgements()V
    .locals 2

    .line 147
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    const v1, 0x7f1101a3

    .line 148
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showUpdateProfile(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 108
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->start(Landroid/content/Context;)V

    return-void
.end method

.method public showVerifyDevice()V
    .locals 0

    .line 124
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->startForResult(Landroid/app/Activity;)V

    return-void
.end method
