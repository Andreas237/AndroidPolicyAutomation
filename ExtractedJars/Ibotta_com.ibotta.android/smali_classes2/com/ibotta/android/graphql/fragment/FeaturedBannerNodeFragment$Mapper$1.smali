.class Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper$1;
.super Ljava/lang/Object;
.source "FeaturedBannerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;->categoryImgFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 176
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    move-result-object p1

    return-object p1
.end method
