.class public final Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;
.super Ljava/lang/Object;
.source "CacheModule_ProvidePasswordCacheExecutorFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->proxyProvidePasswordCacheExecutorFactory()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvidePasswordCacheExecutorFactory()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/CacheModule;->providePasswordCacheExecutorFactory()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->provideInstance()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->get()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    move-result-object v0

    return-object v0
.end method
