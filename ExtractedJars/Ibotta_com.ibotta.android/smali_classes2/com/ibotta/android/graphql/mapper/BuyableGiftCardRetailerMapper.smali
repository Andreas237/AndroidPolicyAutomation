.class public Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "BuyableGiftCardRetailerMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;)Ljava/lang/Integer;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;->retailer_id()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 11
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
