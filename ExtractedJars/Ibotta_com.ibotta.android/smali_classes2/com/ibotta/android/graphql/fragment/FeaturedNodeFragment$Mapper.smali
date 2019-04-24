.class public final Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;
.super Ljava/lang/Object;
.source "FeaturedNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final bannerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Mapper;

.field final retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Mapper;

    .line 146
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;->bannerFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;
    .locals 4

    .line 150
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 151
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v1

    .line 162
    sget-object v2, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper$2;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;)V

    invoke-interface {p1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object p1

    .line 173
    new-instance v2, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;

    invoke-direct {v2, v0, v1, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 143
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;

    move-result-object p1

    return-object p1
.end method
