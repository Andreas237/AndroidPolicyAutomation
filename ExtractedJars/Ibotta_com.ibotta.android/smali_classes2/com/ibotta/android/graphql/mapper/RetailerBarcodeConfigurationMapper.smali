.class public Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerBarcodeConfigurationMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;",
        "Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerBarcodeScanTypeMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;->retailerBarcodeScanTypeMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;)Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 29
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;-><init>()V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setBarcodeName(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setCaptureMessage(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setExampleUrl(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setHelpUrl(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setHelpMessage(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setHelpTitle(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setIconUrl(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setScanContentRegex(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;

    if-eqz v2, :cond_1

    .line 46
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;->retailerBarcodeScanTypeMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;

    .line 47
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type$Fragments;->retailerBarcodeScanTypeFragment()Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;)Lcom/ibotta/api/model/retailer/ScanType;

    move-result-object v2

    .line 46
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->setScanTypes(Ljava/util/List;)V

    :cond_3
    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;)Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    move-result-object p1

    return-object p1
.end method
