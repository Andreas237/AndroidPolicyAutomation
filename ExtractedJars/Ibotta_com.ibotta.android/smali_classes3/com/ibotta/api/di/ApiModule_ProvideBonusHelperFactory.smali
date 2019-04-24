.class public final Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideBonusHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/bonus/BonusHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
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
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)",
            "Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/api/helper/bonus/BonusHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-static {p0}, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->proxyProvideBonusHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/api/helper/bonus/BonusHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBonusHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/api/helper/bonus/BonusHelper;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/api/di/ApiModule;->provideBonusHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/api/helper/bonus/BonusHelper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/bonus/BonusHelper;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/api/helper/bonus/BonusHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->get()Lcom/ibotta/api/helper/bonus/BonusHelper;

    move-result-object v0

    return-object v0
.end method
