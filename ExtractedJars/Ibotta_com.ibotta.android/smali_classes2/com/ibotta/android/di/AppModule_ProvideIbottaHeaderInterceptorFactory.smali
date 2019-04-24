.class public final Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideIbottaHeaderInterceptorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;"
        }
    .end annotation
.end field

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final httpHeadersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/HttpHeaders;",
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
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/HttpHeaders;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->apiContextProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->httpHeadersProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/HttpHeaders;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/HttpHeaders;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/ApiContext;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/HttpHeaders;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/profile/BuildProfile;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->proxyProvideIbottaHeaderInterceptor(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideIbottaHeaderInterceptor(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppModule;->provideIbottaHeaderInterceptor(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->apiContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->httpHeadersProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->get()Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    move-result-object v0

    return-object v0
.end method
