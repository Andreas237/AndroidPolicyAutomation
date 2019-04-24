.class public final Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;
.super Ljava/lang/Object;
.source "FeaturedRetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
    .locals 13

    .line 248
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 249
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v3

    .line 250
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 251
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 252
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 253
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 254
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 255
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 256
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;

    .line 262
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 263
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v12

    .line 264
    new-instance p1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    move-object v1, p1

    invoke-direct/range {v1 .. v12}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 243
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    move-result-object p1

    return-object p1
.end method
