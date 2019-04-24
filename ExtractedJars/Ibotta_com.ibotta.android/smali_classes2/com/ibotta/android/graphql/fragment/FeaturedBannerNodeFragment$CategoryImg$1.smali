.class Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$1;
.super Ljava/lang/Object;
.source "FeaturedBannerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 222
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
