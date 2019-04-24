.class public Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerCategoryMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/CategoryFragment;",
        "Lcom/ibotta/api/model/retailer/Category;",
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
.method public map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/retailer/Category;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/CategoryFragment;
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
    new-instance v0, Lcom/ibotta/api/model/retailer/Category;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/Category;-><init>()V

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/Category;->setId(I)V

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/Category;->setIconUrl(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/Category;->setName(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/Category;->setCategoryType(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/Category;->setSortOrder(F)V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/retailer/Category;->setImageUrl(Ljava/lang/String;)V

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
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    return-object p1
.end method
