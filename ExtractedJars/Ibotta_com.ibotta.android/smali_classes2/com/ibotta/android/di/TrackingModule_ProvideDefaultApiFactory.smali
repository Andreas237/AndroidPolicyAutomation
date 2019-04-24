.class public final Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideDefaultApiFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/tracking/generated/api/DefaultApi;",
        ">;"
    }
.end annotation


# instance fields
.field private final interceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;",
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
            "Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->interceptorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/tracking/generated/api/DefaultApi;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;",
            ">;)",
            "Lcom/ibotta/tracking/generated/api/DefaultApi;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;

    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->proxyProvideDefaultApi(Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;)Lcom/ibotta/tracking/generated/api/DefaultApi;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideDefaultApi(Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;)Lcom/ibotta/tracking/generated/api/DefaultApi;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule;->provideDefaultApi(Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;)Lcom/ibotta/tracking/generated/api/DefaultApi;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/tracking/generated/api/DefaultApi;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/tracking/generated/api/DefaultApi;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->interceptorProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/tracking/generated/api/DefaultApi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->get()Lcom/ibotta/tracking/generated/api/DefaultApi;

    move-result-object v0

    return-object v0
.end method
