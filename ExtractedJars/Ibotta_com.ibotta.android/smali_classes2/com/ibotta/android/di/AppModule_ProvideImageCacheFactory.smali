.class public final Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideImageCacheFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/images/ImageCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
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
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->debugStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/images/ImageCache;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/images/ImageCache;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p0}, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->proxyProvideImageCache(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/images/ImageCache;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideImageCache(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/images/ImageCache;
    .locals 1

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/AppModule;->provideImageCache(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/images/ImageCache;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/images/ImageCache;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/images/ImageCache;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->debugStateProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->get()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    return-object v0
.end method
