.class Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$1;
.super Ljava/lang/Object;
.source "RetailerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 242
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 243
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method