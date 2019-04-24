.class public final Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideEarningsHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/earnings/EarningsHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/api/helper/earnings/EarningsHelper;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->proxyProvideEarningsHelper()Lcom/ibotta/api/helper/earnings/EarningsHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideEarningsHelper()Lcom/ibotta/api/helper/earnings/EarningsHelper;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/api/di/ApiModule;->provideEarningsHelper()Lcom/ibotta/api/helper/earnings/EarningsHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/earnings/EarningsHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/earnings/EarningsHelper;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->provideInstance()Lcom/ibotta/api/helper/earnings/EarningsHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->get()Lcom/ibotta/api/helper/earnings/EarningsHelper;

    move-result-object v0

    return-object v0
.end method
