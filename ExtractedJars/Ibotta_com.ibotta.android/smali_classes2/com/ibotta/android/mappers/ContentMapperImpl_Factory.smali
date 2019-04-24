.class public final Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;
.super Ljava/lang/Object;
.source "ContentMapperImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mappers/ContentMapperImpl;",
        ">;"
    }
.end annotation


# instance fields
.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final productHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;"
        }
    .end annotation
.end field

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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->productHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)",
            "Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newContentMapperImpl(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)Lcom/ibotta/android/mappers/ContentMapperImpl;
    .locals 1

    .line 53
    new-instance v0, Lcom/ibotta/android/mappers/ContentMapperImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mappers/ContentMapperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mappers/ContentMapperImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)",
            "Lcom/ibotta/android/mappers/ContentMapperImpl;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/mappers/ContentMapperImpl;

    .line 40
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/helper/product/ProductHelper;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mappers/ContentMapperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mappers/ContentMapperImpl;
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->productHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mappers/ContentMapperImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mappers/ContentMapperImpl_Factory;->get()Lcom/ibotta/android/mappers/ContentMapperImpl;

    move-result-object v0

    return-object v0
.end method
