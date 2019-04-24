.class public final Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;
.super Ljava/lang/Object;
.source "CacheModule_ProvidePasswordCacheFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/security/PasswordCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final factoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
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
            "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->factoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
            ">;)",
            "Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/security/PasswordCache;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
            ">;)",
            "Lcom/ibotta/android/security/PasswordCache;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    invoke-static {p0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->proxyProvidePasswordCache(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)Lcom/ibotta/android/security/PasswordCache;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePasswordCache(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)Lcom/ibotta/android/security/PasswordCache;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/CacheModule;->providePasswordCache(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)Lcom/ibotta/android/security/PasswordCache;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/security/PasswordCache;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/security/PasswordCache;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->factoryProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/security/PasswordCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->get()Lcom/ibotta/android/security/PasswordCache;

    move-result-object v0

    return-object v0
.end method
