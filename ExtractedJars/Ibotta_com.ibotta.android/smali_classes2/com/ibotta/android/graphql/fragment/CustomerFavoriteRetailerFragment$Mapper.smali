.class public final Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper;
.super Ljava/lang/Object;
.source "CustomerFavoriteRetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    new-instance v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;
    .locals 8

    .line 170
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 171
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 172
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 173
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v6

    .line 174
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    .line 180
    new-instance p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 165
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    move-result-object p1

    return-object p1
.end method
