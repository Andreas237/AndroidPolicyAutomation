.class public final Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideApiOkHttpClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lokhttp3/OkHttpClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiLayerNewRelicInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final chuckInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final okHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->chuckInterceptorProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->apiLayerNewRelicInterceptorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lokhttp3/OkHttpClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;",
            ">;)",
            "Lokhttp3/OkHttpClient;"
        }
    .end annotation

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    .line 43
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/readystatesoftware/chuck/ChuckInterceptor;

    .line 44
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->proxyProvideApiOkHttpClient(Lokhttp3/OkHttpClient;Lcom/readystatesoftware/chuck/ChuckInterceptor;Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideApiOkHttpClient(Lokhttp3/OkHttpClient;Lcom/readystatesoftware/chuck/ChuckInterceptor;Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;)Lokhttp3/OkHttpClient;
    .locals 0

    .line 60
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppModule;->provideApiOkHttpClient(Lokhttp3/OkHttpClient;Lcom/readystatesoftware/chuck/ChuckInterceptor;Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 59
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->get()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public get()Lokhttp3/OkHttpClient;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->chuckInterceptorProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->apiLayerNewRelicInterceptorProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
