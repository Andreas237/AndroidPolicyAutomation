.class public final Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideAppOkHttpClientFactory.java"

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
.field private final chuckInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaHeaderInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final modulesSaltInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->ibottaHeaderInterceptorProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->modulesSaltInterceptorProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->chuckInterceptorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;"
        }
    .end annotation

    .line 62
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lokhttp3/OkHttpClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;)",
            "Lokhttp3/OkHttpClient;"
        }
    .end annotation

    .line 51
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    .line 52
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    .line 53
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    .line 54
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/readystatesoftware/chuck/ChuckInterceptor;

    .line 50
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->proxyProvideAppOkHttpClient(Lokhttp3/OkHttpClient;Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;Lcom/readystatesoftware/chuck/ChuckInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppOkHttpClient(Lokhttp3/OkHttpClient;Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;Lcom/readystatesoftware/chuck/ChuckInterceptor;)Lokhttp3/OkHttpClient;
    .locals 0

    .line 75
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/AppModule;->provideAppOkHttpClient(Lokhttp3/OkHttpClient;Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;Lcom/readystatesoftware/chuck/ChuckInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 74
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->get()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public get()Lokhttp3/OkHttpClient;
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->ibottaHeaderInterceptorProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->modulesSaltInterceptorProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->chuckInterceptorProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
