.class public final Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$Mapper;
.super Ljava/lang/Object;
.source "FeaturedBannerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
    .locals 3

    .line 269
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 270
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {p1, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object p1

    .line 271
    new-instance v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 266
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    move-result-object p1

    return-object p1
.end method
