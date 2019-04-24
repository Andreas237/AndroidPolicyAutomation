.class public final Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;
.super Ljava/lang/Object;
.source "DaggerInviteFriendsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideFacebookManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/facebook/FacebookManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;",
            ">;"
        }
    .end annotation
.end field

.field private provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$1;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;
    .locals 2

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)V
    .locals 10

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 84
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 96
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 112
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 111
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 127
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 128
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 129
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 132
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule_ProvideFacebookManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule_ProvideFacebookManagerFactory;

    move-result-object p1

    .line 131
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectInviteFriendsActivity(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 231
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 230
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 228
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    .line 239
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/facebook/FacebookManager;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity_MembersInjector;->injectFbManager(Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 243
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 242
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 240
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 248
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 247
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 245
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity_MembersInjector;->injectApiWorkSubmitter(Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 253
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 252
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 250
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity_MembersInjector;->injectApiJobFactory(Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 258
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 257
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 255
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;Lcom/ibotta/android/state/user/UserState;)V

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 263
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 262
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 260
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 268
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 267
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 265
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 273
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 272
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 270
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 278
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 277
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 275
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V
    .locals 0

    .line 163
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->injectInviteFriendsActivity(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;)V
    .locals 0

    return-void
.end method
