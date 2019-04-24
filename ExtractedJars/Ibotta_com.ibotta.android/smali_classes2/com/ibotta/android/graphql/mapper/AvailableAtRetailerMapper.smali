.class public Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "AvailableAtRetailerMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;",
        "Lcom/ibotta/api/model/content/RetailerContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 20
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/RetailerContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/RetailerContent;-><init>()V

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setId(I)V

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;->model_c_retailer_image()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setModelCImageUrl(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/RetailerContent;->setName(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 9
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method
