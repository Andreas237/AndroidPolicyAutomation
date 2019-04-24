.class public Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;
.super Ljava/lang/Object;
.source "RetailerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Retailer_barcode_configuration"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    .line 1336
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 1337
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "__typename"

    const-string v2, "__typename"

    const-string v3, "RetailerBarcodeConfiguration"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 1338
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseField;->forFragment(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 1352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 1353
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    const-string p1, "fragments == null"

    .line 1354
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;
    .locals 0

    .line 1335
    iget-object p0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    return-object p0
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1358
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1391
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1392
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    .line 1393
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    .line 1394
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1362
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1401
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    .line 1404
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 1406
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 1407
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$hashCode:I

    const/4 v0, 0x1

    .line 1408
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$hashCodeMemoized:Z

    .line 1410
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 1366
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1377
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1378
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Retailer_barcode_configuration{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fragments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$toString:Ljava/lang/String;

    .line 1383
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->$toString:Ljava/lang/String;

    return-object v0
.end method
