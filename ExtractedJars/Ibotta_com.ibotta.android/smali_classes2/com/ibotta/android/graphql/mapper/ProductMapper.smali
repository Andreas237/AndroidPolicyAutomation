.class public Lcom/ibotta/android/graphql/mapper/ProductMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "ProductMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/ProductFragment;",
        "Lcom/ibotta/api/model/content/ProductContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/ProductFragment;)Lcom/ibotta/api/model/content/ProductContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/ProductFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/ProductContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/ProductContent;-><init>()V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setIdString(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->action_button_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setActionButtonText(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->action_button_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setActionButtonType(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->current_value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setCurrentValue(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->cache_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setCacheKey(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->deeplink_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setDeeplinkUrl(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setDescription(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_large()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setImageUrlLarge(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_small()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setImageUrlSmall(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_thumbnail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setImageUrlThumbnail(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setLink(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setName(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->price()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setPrice(F)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setRetailerId(I)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setSortOrder(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/ProductContent;->setType(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->typed_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/ProductContent;->setTypedId(Ljava/lang/String;)V

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

    .line 16
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/ProductMapper;->map(Lcom/ibotta/android/graphql/fragment/ProductFragment;)Lcom/ibotta/api/model/content/ProductContent;

    move-result-object p1

    return-object p1
.end method
