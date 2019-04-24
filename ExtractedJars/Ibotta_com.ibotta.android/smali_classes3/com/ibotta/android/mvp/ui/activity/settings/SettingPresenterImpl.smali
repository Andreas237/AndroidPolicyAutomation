.class public Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "SettingPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;"
    }
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private final logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

.field private final settingReducer:Lcom/ibotta/android/account/settings/SettingReducer;

.field private final trackingFlushWorker:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/account/settings/SettingReducer;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 59
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 60
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 61
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 62
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->trackingFlushWorker:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 63
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    .line 64
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->settingReducer:Lcom/ibotta/android/account/settings/SettingReducer;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->trackingFlushWorker:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    return-object p0
.end method

.method private generateRows()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;",
            ">;"
        }
    .end annotation

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ACCOUNT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->settingReducer:Lcom/ibotta/android/account/settings/SettingReducer;

    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ACCOUNT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 99
    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->getNameResId()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/account/settings/SettingReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 98
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->UPDATE_PROFILE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    .line 103
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    .line 104
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->CONNECTED_ACCOUNTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PREFERENCES:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 108
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->VERIFY_DEVICE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugMenuAvailable()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 112
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->DEBUG_MENU:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_1
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ABOUT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->settingReducer:Lcom/ibotta/android/account/settings/SettingReducer;

    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ABOUT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->getNameResId()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/account/settings/SettingReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PRIVACY_POLICY:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->TERMS_OF_USE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->END_USER_LICENSE_AGREEMENT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->THIRD_PARTY_ACKNOWLEDGEMENTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;-><init>()V

    .line 128
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v2}, Lcom/ibotta/android/profile/BuildProfile;->getDisplayableAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->setMajor(Ljava/lang/String;)V

    .line 129
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v2}, Lcom/ibotta/android/profile/BuildProfile;->getDisplayableAppBuildNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->setMinor(Ljava/lang/String;)V

    .line 130
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 69
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 72
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 75
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 89
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->generateRows()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->setSettingRows(Ljava/util/List;)V

    return-void
.end method

.method public onLogOutClicked()V
    .locals 2

    .line 170
    new-instance v0, Lcom/ibotta/api/call/auth/LogoutCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/auth/LogoutCall;-><init>(I)V

    .line 171
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;

    invoke-direct {v1, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;Lcom/ibotta/api/ApiCall;)V

    .line 180
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V
    .locals 1

    .line 137
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$2;->$SwitchMap$com$ibotta$android$mvp$ui$activity$settings$SettingMenu:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 163
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showThirdPartyAcknowledgements()V

    goto :goto_0

    .line 160
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showEndUserLicenseAgreement()V

    goto :goto_0

    .line 157
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showTermsOfUse()V

    goto :goto_0

    .line 154
    :pswitch_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showPrivacyPolicy()V

    goto :goto_0

    .line 151
    :pswitch_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showDebugMenu()V

    goto :goto_0

    .line 148
    :pswitch_5
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showVerifyDevice()V

    goto :goto_0

    .line 145
    :pswitch_6
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showPreferences()V

    goto :goto_0

    .line 142
    :pswitch_7
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showConnectedAccounts()V

    goto :goto_0

    .line 139
    :pswitch_8
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showUpdateProfile(Lcom/ibotta/api/model/customer/Customer;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 185
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 187
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/user/LogOutManager;->logOut(Z)V

    .line 188
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;->showLogout()V

    return-void
.end method
