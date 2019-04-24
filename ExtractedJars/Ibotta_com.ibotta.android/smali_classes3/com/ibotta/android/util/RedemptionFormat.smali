.class public Lcom/ibotta/android/util/RedemptionFormat;
.super Ljava/lang/Object;
.source "RedemptionFormat.java"


# instance fields
.field private additionalRedemptionInstructions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private maxReceiptAgeDays:I

.field private receiptName:Ljava/lang/String;

.field private redemptionString:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->additionalRedemptionInstructions:Ljava/util/List;

    return-void
.end method

.method private static applyDefaults(Landroid/content/Context;Lcom/ibotta/android/util/RedemptionFormat;Ljava/lang/String;)V
    .locals 3

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 99
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getRedemptionString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    sget v0, Lcom/ibotta/android/util/R$string;->redemption_meta_defaults_redemption_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 102
    invoke-virtual {p1, p2}, Lcom/ibotta/android/util/RedemptionFormat;->setRedemptionString(Ljava/lang/String;)V

    .line 105
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 106
    sget p2, Lcom/ibotta/android/util/R$string;->redemption_meta_defaults_receipt_name:I

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 107
    invoke-virtual {p1, p0}, Lcom/ibotta/android/util/RedemptionFormat;->setReceiptName(Ljava/lang/String;)V

    .line 110
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getMaxReceiptAgeDays()I

    move-result p0

    if-gtz p0, :cond_3

    const/4 p0, 0x7

    .line 111
    invoke-virtual {p1, p0}, Lcom/ibotta/android/util/RedemptionFormat;->setMaxReceiptAgeDays(I)V

    .line 114
    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_4

    .line 115
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/ibotta/android/util/RedemptionFormat;->setAdditionalRedemptionInstructions(Ljava/util/List;)V

    :cond_4
    return-void
.end method

.method public static build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;
    .locals 2

    .line 67
    new-instance v0, Lcom/ibotta/android/util/RedemptionFormat;

    invoke-direct {v0}, Lcom/ibotta/android/util/RedemptionFormat;-><init>()V

    const/4 v1, 0x0

    .line 68
    invoke-static {p0, v0, v1}, Lcom/ibotta/android/util/RedemptionFormat;->applyDefaults(Landroid/content/Context;Lcom/ibotta/android/util/RedemptionFormat;Ljava/lang/String;)V

    return-object v0
.end method

.method public static build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;
    .locals 4

    .line 76
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 79
    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getRedeemString()Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getReceiptName()Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getMaxReceiptAgeDays()I

    move-result v2

    .line 82
    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    move-object p2, v0

    move-object v0, v1

    .line 85
    :goto_0
    new-instance v3, Lcom/ibotta/android/util/RedemptionFormat;

    invoke-direct {v3}, Lcom/ibotta/android/util/RedemptionFormat;-><init>()V

    .line 86
    invoke-virtual {v3, v1}, Lcom/ibotta/android/util/RedemptionFormat;->setRedemptionString(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v3, v0}, Lcom/ibotta/android/util/RedemptionFormat;->setReceiptName(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v3, v2}, Lcom/ibotta/android/util/RedemptionFormat;->setMaxReceiptAgeDays(I)V

    .line 89
    invoke-virtual {v3, p2}, Lcom/ibotta/android/util/RedemptionFormat;->setAdditionalRedemptionInstructions(Ljava/util/List;)V

    .line 91
    invoke-static {p0, v3, p1}, Lcom/ibotta/android/util/RedemptionFormat;->applyDefaults(Landroid/content/Context;Lcom/ibotta/android/util/RedemptionFormat;Ljava/lang/String;)V

    return-object v3
.end method


# virtual methods
.method public getAdditionalRedemptionInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->additionalRedemptionInstructions:Ljava/util/List;

    return-object v0
.end method

.method public getMaxReceiptAgeDays()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->maxReceiptAgeDays:I

    return v0
.end method

.method public getReceiptName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->receiptName:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptNameCaps()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->receiptName:Ljava/lang/String;

    invoke-static {v0}, Lorg/apache/commons/lang3/text/WordUtils;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReceiptNameLower()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->receiptName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRedemptionString()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/util/RedemptionFormat;->redemptionString:Ljava/lang/String;

    return-object v0
.end method

.method public setAdditionalRedemptionInstructions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/util/RedemptionFormat;->additionalRedemptionInstructions:Ljava/util/List;

    return-void
.end method

.method public setMaxReceiptAgeDays(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/ibotta/android/util/RedemptionFormat;->maxReceiptAgeDays:I

    return-void
.end method

.method public setReceiptName(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/util/RedemptionFormat;->receiptName:Ljava/lang/String;

    return-void
.end method

.method public setRedemptionString(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/util/RedemptionFormat;->redemptionString:Ljava/lang/String;

    return-void
.end method
