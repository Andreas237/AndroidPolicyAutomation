.class public final Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;
.super Ljava/lang/Object;
.source "RoutingModule_ProvideUrlResolverFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->INSTANCE:Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->INSTANCE:Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->proxyProvideUrlResolver()Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideUrlResolver()Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/android/di/RoutingModule;->provideUrlResolver()Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->provideInstance()Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->get()Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    return-object v0
.end method
