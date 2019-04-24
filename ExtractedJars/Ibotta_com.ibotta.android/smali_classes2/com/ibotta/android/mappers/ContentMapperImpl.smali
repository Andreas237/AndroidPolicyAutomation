.class public Lcom/ibotta/android/mappers/ContentMapperImpl;
.super Ljava/lang/Object;
.source "ContentMapperImpl.java"

# interfaces
.implements Lcom/ibotta/android/mappers/ContentMapper;


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final productHelper:Lcom/ibotta/api/helper/product/ProductHelper;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->productHelper:Lcom/ibotta/api/helper/product/ProductHelper;

    return-void
.end method


# virtual methods
.method public getContentModelByContentId(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/util/List;)Lcom/ibotta/api/model/ContentModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/apiandroid/content/ContentId;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)",
            "Lcom/ibotta/api/model/ContentModel;"
        }
    .end annotation

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x0

    goto/16 :goto_0

    .line 58
    :pswitch_0
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/ProductModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 59
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/ProductModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$z5EUymOYQd9ZV3CgTGTUR_xxwKo;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$z5EUymOYQd9ZV3CgTGTUR_xxwKo;-><init>(Ljava/lang/Class;)V

    .line 60
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    .line 61
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->productHelper:Lcom/ibotta/api/helper/product/ProductHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getStringId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lcom/ibotta/api/helper/product/ProductHelper;->findProductById(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/api/model/ProductModel;

    move-result-object p2

    goto :goto_0

    .line 50
    :pswitch_1
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 51
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$ciM5elHOyQaPPqPgy0YrDTH6yFM;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$ciM5elHOyQaPPqPgy0YrDTH6yFM;-><init>(Ljava/lang/Class;)V

    .line 52
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    .line 53
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result v1

    invoke-interface {v0, p2, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p2

    goto :goto_0

    .line 42
    :pswitch_2
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 43
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p2

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mappers/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mappers/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;-><init>(Ljava/lang/Class;)V

    .line 44
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    .line 45
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mappers/ContentMapperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result v1

    invoke-interface {v0, p2, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;

    move-result-object p2

    goto :goto_0

    .line 66
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid ID"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    if-eqz p2, :cond_0

    return-object p2

    .line 70
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "contentModels does not contain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
