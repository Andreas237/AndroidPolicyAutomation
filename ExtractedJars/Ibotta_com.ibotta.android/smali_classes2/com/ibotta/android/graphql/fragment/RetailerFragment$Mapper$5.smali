.class Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V
    .locals 0

    .line 794
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;
    .locals 1

    .line 797
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->retailer_barcode_configurationFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 794
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    move-result-object p1

    return-object p1
.end method
