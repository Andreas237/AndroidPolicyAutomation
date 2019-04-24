.class public final Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideUserStateAppCallbackFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/UserStateAppCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/AppCacheCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final emailStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/email/EmailState;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/AppCacheCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/email/EmailState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->appCacheCallbackProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->contextProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->emailStateProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->trackerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/AppCacheCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/email/EmailState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/UserStateAppCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/AppCacheCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/email/EmailState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/AppCacheCallback;

    .line 51
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    .line 52
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/email/EmailState;

    .line 53
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/tracking/Tracker;

    .line 49
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->proxyProvideUserStateAppCallback(Lcom/ibotta/android/state/app/AppCacheCallback;Landroid/content/Context;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/state/app/UserStateAppCallback;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideUserStateAppCallback(Lcom/ibotta/android/state/app/AppCacheCallback;Landroid/content/Context;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/state/app/UserStateAppCallback;
    .locals 0

    .line 68
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule;->provideUserStateAppCallback(Lcom/ibotta/android/state/app/AppCacheCallback;Landroid/content/Context;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/state/app/UserStateAppCallback;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 67
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/UserStateAppCallback;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/UserStateAppCallback;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->appCacheCallbackProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->emailStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->trackerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/UserStateAppCallback;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->get()Lcom/ibotta/android/state/app/UserStateAppCallback;

    move-result-object v0

    return-object v0
.end method
