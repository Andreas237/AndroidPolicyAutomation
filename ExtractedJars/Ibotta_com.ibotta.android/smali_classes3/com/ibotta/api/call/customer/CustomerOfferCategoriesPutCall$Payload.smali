.class public Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;
.super Ljava/lang/Object;
.source "CustomerOfferCategoriesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Payload"
.end annotation


# instance fields
.field private categorySettings:Ljava/util/List;
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
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;->categorySettings:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCategorySettings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;->categorySettings:Ljava/util/List;

    return-object v0
.end method

.method public setCategorySettings(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;)V"
        }
    .end annotation

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;->categorySettings:Ljava/util/List;

    return-void
.end method
