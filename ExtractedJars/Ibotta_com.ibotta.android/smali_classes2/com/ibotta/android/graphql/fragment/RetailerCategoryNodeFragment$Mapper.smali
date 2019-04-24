.class public final Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;
.super Ljava/lang/Object;
.source "RetailerCategoryNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final featuresFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Mapper;

.field final iconUrlFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$Mapper;

.field final retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;->iconUrlFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$Mapper;

    .line 212
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Mapper;

    .line 214
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;->featuresFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;
    .locals 8

    .line 218
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 219
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 220
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 221
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    .line 227
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v6

    .line 238
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    .line 244
    new-instance p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 209
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    move-result-object p1

    return-object p1
.end method
