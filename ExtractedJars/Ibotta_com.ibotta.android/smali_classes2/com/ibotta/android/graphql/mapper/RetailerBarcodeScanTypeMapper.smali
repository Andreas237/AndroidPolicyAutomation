.class public Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerBarcodeScanTypeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;",
        "Lcom/ibotta/api/model/retailer/ScanType;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;)Lcom/ibotta/api/model/retailer/ScanType;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/retailer/ScanType;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/ScanType;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    .line 31
    invoke-virtual {v3}, Ljava/lang/Long;->shortValue()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/ScanType;->setBarcodeSizes(Ljava/util/Set;)V

    .line 37
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/retailer/ScanType;->setScanType(Ljava/lang/String;)V

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
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;)Lcom/ibotta/api/model/retailer/ScanType;

    move-result-object p1

    return-object p1
.end method
