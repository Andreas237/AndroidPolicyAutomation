.class public final Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;
.super Ljava/lang/Object;
.source "VariantModule_ProvideDebugFeatureFlagStorageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final prefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
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
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->prefsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->proxyProvideDebugFeatureFlagStorage(Landroid/content/SharedPreferences;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideDebugFeatureFlagStorage(Landroid/content/SharedPreferences;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
    .locals 1

    .line 40
    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule;->provideDebugFeatureFlagStorage(Landroid/content/SharedPreferences;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 39
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->prefsProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->get()Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    move-result-object v0

    return-object v0
.end method
