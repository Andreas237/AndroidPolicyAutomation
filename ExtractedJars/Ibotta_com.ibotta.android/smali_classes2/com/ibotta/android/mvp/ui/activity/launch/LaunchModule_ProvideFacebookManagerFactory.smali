.class public final Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;
.super Ljava/lang/Object;
.source "LaunchModule_ProvideFacebookManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/social/facebook/FacebookManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheClearFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceSecurityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

.field private final postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->apiCallFactoryProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;"
        }
    .end annotation

    .line 98
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/social/facebook/FacebookManager;"
        }
    .end annotation

    .line 80
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/security/DeviceSecurity;

    .line 81
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    .line 82
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/api/call/ApiCallFactory;

    .line 83
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 84
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/state/user/UserState;

    .line 85
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 86
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-object v0, p0

    .line 78
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->proxyProvideFacebookManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFacebookManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 0

    .line 119
    invoke-virtual/range {p0 .. p7}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;->provideFacebookManager(Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 118
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/social/facebook/FacebookManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 8

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->apiCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/social/facebook/FacebookManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->get()Lcom/ibotta/android/social/facebook/FacebookManager;

    move-result-object v0

    return-object v0
.end method
