.class Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;
.super Ljava/lang/Object;
.source "BuyableGiftCardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;
    .locals 1

    .line 428
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 425
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    move-result-object p1

    return-object p1
.end method
