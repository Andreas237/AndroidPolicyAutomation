.class Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$1;
.super Ljava/lang/Object;
.source "BuyableGiftCardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ListReader;


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
        "Lcom/apollographql/apollo/api/ResponseReader$ListReader<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Double;
    .locals 0

    .line 422
    invoke-interface {p1}, Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;->readDouble()Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Object;
    .locals 0

    .line 419
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
