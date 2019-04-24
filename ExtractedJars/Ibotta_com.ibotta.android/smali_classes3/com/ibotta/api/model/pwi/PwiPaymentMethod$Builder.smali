.class public abstract Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.super Ljava/lang/Object;
.source "PwiPaymentMethod.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 2

    .line 21
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;-><init>()V

    const-string v1, ""

    .line 22
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->name(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    const-string v1, ""

    .line 23
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->cardBrand(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    const-string v1, ""

    .line 24
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->cardType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    const-string v1, ""

    .line 25
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->sourceId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    const-string v1, ""

    .line 26
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->sourceType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
.end method

.method public abstract cardBrand(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract cardType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract defaultSource(Z)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract expiryMonth(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract expiryYear(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract sourceId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method

.method public abstract sourceType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.end method
