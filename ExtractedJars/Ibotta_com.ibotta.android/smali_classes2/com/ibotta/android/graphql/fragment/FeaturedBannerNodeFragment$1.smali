.class Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;
.super Ljava/lang/Object;
.source "FeaturedBannerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 108
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 109
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 110
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 111
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 112
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
