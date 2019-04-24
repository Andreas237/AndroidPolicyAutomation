.class public Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "FeaturedRetailerMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;",
        "Lcom/ibotta/api/model/content/RetailerContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 28
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->retailer()Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Fragments;->retailerFragment()Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object v0

    :cond_1
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

    .line 14
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method
