.class public final Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideProductHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/product/ProductHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/api/helper/product/ProductHelper;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->proxyProvideProductHelper()Lcom/ibotta/api/helper/product/ProductHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideProductHelper()Lcom/ibotta/api/helper/product/ProductHelper;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/api/di/ApiModule;->provideProductHelper()Lcom/ibotta/api/helper/product/ProductHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/product/ProductHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/product/ProductHelper;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->provideInstance()Lcom/ibotta/api/helper/product/ProductHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->get()Lcom/ibotta/api/helper/product/ProductHelper;

    move-result-object v0

    return-object v0
.end method
