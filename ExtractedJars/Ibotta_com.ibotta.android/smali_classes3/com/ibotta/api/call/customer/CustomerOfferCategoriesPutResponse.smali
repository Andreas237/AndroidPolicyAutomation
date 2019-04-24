.class public Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerOfferCategoriesPutResponse.java"


# instance fields
.field private customerOfferCategories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerOfferCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;->customerOfferCategories:Ljava/util/List;

    return-object v0
.end method

.method public setCustomerOfferCategories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;->customerOfferCategories:Ljava/util/List;

    return-void
.end method
