.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ConnectedAccountsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;
.implements Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;
.implements Lcom/ibotta/android/social/google/GoogleLinkListener;
.implements Lcom/ibotta/android/social/google/GoogleSignInListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;",
        "Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;",
        "Lcom/ibotta/android/social/google/GoogleLinkListener;",
        "Lcom/ibotta/android/social/google/GoogleSignInListener;"
    }
.end annotation


# instance fields
.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final customerSocialHelper:Lcom/ibotta/api/helper/social/CustomerSocialHelper;

.field private final facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

.field private final googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/social/CustomerSocialHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/android/social/google/GoogleSignInManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 74
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 75
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerSocialHelper:Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    .line 76
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    .line 77
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    .line 78
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    .line 79
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 81
    invoke-virtual {p6, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setUiListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;)V

    .line 82
    invoke-virtual {p6, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setInfoListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;)V

    .line 83
    invoke-virtual {p6, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setAuthListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;)V

    .line 84
    invoke-virtual {p6, p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->setLinkListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;)V

    .line 86
    invoke-interface {p7, p0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->setGoogleSignInListener(Lcom/ibotta/android/social/google/GoogleSignInListener;)V

    .line 87
    invoke-interface {p7, p0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->setGoogleLinkListener(Lcom/ibotta/android/social/google/GoogleLinkListener;)V

    return-void
.end method

.method private clearCacheAndReload()V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 339
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->reload()V

    return-void
.end method

.method private generateRows(Ljava/util/List;Lcom/ibotta/api/model/customer/Customer;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/customer/Customer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;"
        }
    .end annotation

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getSocial()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->FACEBOOK:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->toBuilder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->initSocialRow(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getSocial()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->GOOGLE:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->toBuilder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->initSocialRow(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->initImRows(Ljava/util/List;Lcom/ibotta/api/model/customer/Customer;)Ljava/util/List;

    move-result-object p1

    .line 154
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private initImRows(Ljava/util/List;Lcom/ibotta/api/model/customer/Customer;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/customer/Customer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;"
        }
    .end annotation

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/im/CredentialIntegration;

    .line 175
    invoke-virtual {v1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getStatusEnum()Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/im/ImConnectionStatus;->VERIFIED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-ne v2, v3, :cond_0

    .line 176
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getRetailerId()I

    move-result v3

    invoke-interface {v2, p1, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 179
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    .line 180
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    .line 181
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    .line 182
    invoke-virtual {v1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getUsername()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-static {v3, v4, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->create(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    move-result-object v1

    .line 183
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;Z)V

    .line 184
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private initSocialRow(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;",
            "Lcom/ibotta/api/model/auth/AuthType;",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;",
            ")",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;"
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerSocialHelper:Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/social/CustomerSocialHelper;->findByType(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/customer/CustomerSocial;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 163
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSocial;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 164
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSocial;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, ""

    .line 165
    :goto_1
    invoke-virtual {p3, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->userName(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    move-result-object p1

    if-eqz v0, :cond_2

    const/4 p2, 0x1

    .line 168
    :cond_2
    new-instance p3, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;

    invoke-direct {p3, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;Z)V

    return-object p3
.end method

.method private onConnectSocialAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V
    .locals 2

    .line 217
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->ensureFacebookSession()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 219
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    goto :goto_0

    .line 221
    :cond_0
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 222
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->connectToGoogle()V

    :cond_1
    :goto_0
    return-void
.end method

.method private onDisconnectImAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;)V
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getRetailerId()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;->showAreYouSureDialog(ILjava/lang/String;)V

    return-void
.end method

.method private onDisconnectSocialAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V
    .locals 2

    .line 243
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->ensureFacebookSession()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->unlinkFacebookFromIbotta(I)V

    goto :goto_0

    .line 247
    :cond_0
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/social/google/GoogleSignInManager;->unlinkGoogleFromIbotta(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getFacebookManager()Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    return-object v0
.end method

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

    .line 104
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 107
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 109
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 110
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 113
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getGoogleSignInManager()Lcom/ibotta/android/social/google/GoogleSignInManager;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    return-object v0
.end method

.method public hideFacebookLoading()V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->hideSubmittedJobLoading()V

    return-void
.end method

.method public hideGoogleUnlinking()V
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->hideSubmittedJobLoading()V

    return-void
.end method

.method public isAutoSocialConnect()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 120
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 121
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public bridge synthetic onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 47
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->onAttach(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V

    return-void
.end method

.method public onAttach(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V
    .locals 0

    .line 92
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onCreate()V

    return-void
.end method

.method public onConnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
    .locals 1

    .line 204
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getType()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 206
    :cond_0
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->onConnectSocialAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V

    :goto_0
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onDestroy()V

    .line 99
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    return-void
.end method

.method public onDisconnectAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
    .locals 1

    .line 228
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 235
    :pswitch_0
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    .line 236
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->onDisconnectImAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;)V

    goto :goto_0

    .line 230
    :pswitch_1
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    .line 231
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->onDisconnectSocialAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onDisconnectConfirmTapped(I)V
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result v0

    invoke-static {v0, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->createImDeleteCall(II)Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    move-result-object p1

    .line 259
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public onFacebookAuthSuccess()V
    .locals 0

    return-void
.end method

.method public onFacebookInfoSuccess()V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->linkFacebookToIbotta()V

    return-void
.end method

.method public onFacebookLinkSuccess()V
    .locals 0

    .line 289
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->clearCacheAndReload()V

    return-void
.end method

.method public onFacebookUnlinkSuccess()V
    .locals 0

    .line 294
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->clearCacheAndReload()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 127
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->generateRows(Ljava/util/List;Lcom/ibotta/api/model/customer/Customer;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public onGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->showGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V

    return-void
.end method

.method public onGoogleAuthSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
    .locals 0

    .line 299
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    invoke-interface {p1}, Lcom/ibotta/android/social/google/GoogleSignInManager;->linkGoogleToIbotta()V

    return-void
.end method

.method public onGoogleLinkFailed(Lcom/ibotta/api/ApiException;)V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getDetails()Lcom/ibotta/api/ApiErrorDetails;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->showSubmittedJobFailed(Lcom/ibotta/api/ApiErrorDetails;)V

    return-void
.end method

.method public onGoogleLinkSuccess()V
    .locals 0

    .line 309
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->clearCacheAndReload()V

    return-void
.end method

.method public onGoogleUnlinkFailed(Lcom/ibotta/api/ApiException;)V
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getDetails()Lcom/ibotta/api/ApiErrorDetails;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->showSubmittedJobFailed(Lcom/ibotta/api/ApiErrorDetails;)V

    return-void
.end method

.method public onGoogleUnlinkSuccess()V
    .locals 0

    .line 329
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->clearCacheAndReload()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 137
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 140
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->clearCacheAndReload()V

    return-void
.end method

.method public showFacebookLoading(Ljava/lang/String;)V
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showGoogleUnlinking()V
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;->showSubmittedJobLoading()V

    return-void
.end method
