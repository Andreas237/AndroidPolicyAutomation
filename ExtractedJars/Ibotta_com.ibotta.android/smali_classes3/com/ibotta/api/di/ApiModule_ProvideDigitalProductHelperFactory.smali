.class public final Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideDigitalProductHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/offer/DigitalProductHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/api/helper/offer/DigitalProductHelper;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->proxyProvideDigitalProductHelper()Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideDigitalProductHelper()Lcom/ibotta/api/helper/offer/DigitalProductHelper;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/api/di/ApiModule;->provideDigitalProductHelper()Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/offer/DigitalProductHelper;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->provideInstance()Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->get()Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    move-result-object v0

    return-object v0
.end method
