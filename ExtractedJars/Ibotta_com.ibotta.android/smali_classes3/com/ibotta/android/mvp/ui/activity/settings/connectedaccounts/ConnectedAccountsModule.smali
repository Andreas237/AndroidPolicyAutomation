.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ConnectedAccountsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;",
        ">;"
    }
.end annotation


# instance fields
.field private final connectedAccountsView:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V
    .locals 0

    .line 44
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->context:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->connectedAccountsView:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    return-void
.end method


# virtual methods
.method public provideFacebookManager(Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 80
    new-instance v9, Lcom/ibotta/android/social/facebook/FacebookManager;

    move-object v10, p0

    iget-object v0, v10, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->connectedAccountsView:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    move-object v0, v9

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/social/facebook/FacebookManager;-><init>(Landroid/app/Activity;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v9
.end method

.method public provideGoogleSignInClient(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->connectedAccountsView:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getClient(Landroid/app/Activity;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object p1

    return-object p1
.end method

.method public provideGoogleSignInManager(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/social/google/GoogleSignInManager;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 112
    new-instance v6, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-object v6
.end method

.method public provideImUiUtil(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/social/CustomerSocialHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/android/social/google/GoogleSignInManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 59
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/social/CustomerSocialHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/android/social/google/GoogleSignInManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    move-object v0, p5

    .line 67
    invoke-interface {p5, v9}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;->setListener(Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;)V

    return-object v9
.end method

.method public providesGoogleSignInOptions()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 3
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 93
    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->GOOGLE_WEB_CLIENT_ID:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    .line 94
    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestServerAuthCode(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "profile"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    .line 95
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestScopes(Lcom/google/android/gms/common/api/Scope;[Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestEmail()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method
