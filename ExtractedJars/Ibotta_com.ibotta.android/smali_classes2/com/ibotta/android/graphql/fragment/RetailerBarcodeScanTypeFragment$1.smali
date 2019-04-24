.class Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;
.super Ljava/lang/Object;
.source "RetailerBarcodeScanTypeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 78
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 85
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
