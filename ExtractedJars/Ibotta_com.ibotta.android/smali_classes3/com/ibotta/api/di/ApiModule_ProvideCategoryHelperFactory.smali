.class public final Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideCategoryHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/api/helper/retailer/CategoryHelper;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->proxyProvideCategoryHelper()Lcom/ibotta/api/helper/retailer/CategoryHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideCategoryHelper()Lcom/ibotta/api/helper/retailer/CategoryHelper;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/api/di/ApiModule;->provideCategoryHelper()Lcom/ibotta/api/helper/retailer/CategoryHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/retailer/CategoryHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/retailer/CategoryHelper;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->provideInstance()Lcom/ibotta/api/helper/retailer/CategoryHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->get()Lcom/ibotta/api/helper/retailer/CategoryHelper;

    move-result-object v0

    return-object v0
.end method
