.class public final Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideModulesSaltInterceptorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->proxyProvideModulesSaltInterceptor()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideModulesSaltInterceptor()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/AppModule;->provideModulesSaltInterceptor()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->provideInstance()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->get()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    move-result-object v0

    return-object v0
.end method
