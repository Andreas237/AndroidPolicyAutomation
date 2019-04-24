.class Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;
.super Ljava/lang/Object;
.source "RetailerBarcodeConfigurationFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 178
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 179
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 180
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 181
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 182
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 183
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 184
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 185
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 186
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 187
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 188
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    return-void
.end method
