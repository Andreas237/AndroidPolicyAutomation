.class public final Lcom/microblink/internal/merchant/DetectedMerchantHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private detectedBannerId:I

.field private merchantName:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>(Lcom/microblink/StringType;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/DetectedMerchantHandler;->merchantName:Lcom/microblink/StringType;

    iput p2, p0, Lcom/microblink/internal/merchant/DetectedMerchantHandler;->detectedBannerId:I

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/DetectedMerchantHandler;->merchantName:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/microblink/internal/merchant/DetectedMerchantHandler;->detectedBannerId:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    new-instance v1, Lcom/microblink/internal/merchant/MerchantResult;

    invoke-direct {v1}, Lcom/microblink/internal/merchant/MerchantResult;-><init>()V

    iget v2, p0, Lcom/microblink/internal/merchant/DetectedMerchantHandler;->detectedBannerId:I

    iput v2, v1, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    iput-object v0, v1, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    const-string v0, "MERCHANT CSV"

    invoke-virtual {v1, v0}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
