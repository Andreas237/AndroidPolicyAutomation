.class public final Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;
.super Ljava/lang/Object;
.source "PwiModule_ProvidePwiUserStateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/pwi/PwiUserState;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->appProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/state/pwi/PwiUserState;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-static {p0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->proxyProvidePwiUserState(Lcom/ibotta/android/App;)Lcom/ibotta/android/state/pwi/PwiUserState;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiUserState(Lcom/ibotta/android/App;)Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 1

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/PwiModule;->providePwiUserState(Lcom/ibotta/android/App;)Lcom/ibotta/android/state/pwi/PwiUserState;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/pwi/PwiUserState;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->appProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/pwi/PwiUserState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->get()Lcom/ibotta/android/state/pwi/PwiUserState;

    move-result-object v0

    return-object v0
.end method
