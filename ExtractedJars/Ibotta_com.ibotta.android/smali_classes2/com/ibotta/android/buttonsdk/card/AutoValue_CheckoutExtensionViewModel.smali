.class final Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;
.super Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;
.source "AutoValue_CheckoutExtensionViewModel.java"


# instance fields
.field private final cashBackString:Ljava/lang/String;

.field private final pendingPeriod:Ljava/lang/String;

.field private final retailerName:Ljava/lang/String;

.field private final specialConditions:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;-><init>()V

    if-eqz p1, :cond_3

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->subtitle:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->retailerName:Ljava/lang/String;

    if-eqz p3, :cond_1

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->cashBackString:Ljava/lang/String;

    if-eqz p4, :cond_0

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->specialConditions:Ljava/lang/String;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->pendingPeriod:Ljava/lang/String;

    return-void

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null specialConditions"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null cashBackString"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null retailerName"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null subtitle"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 84
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 85
    check-cast p1, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->subtitle:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->retailerName:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->cashBackString:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getCashBackString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->specialConditions:Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSpecialConditions()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->pendingPeriod:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getPendingPeriod()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getPendingPeriod()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public getCashBackString()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->cashBackString:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingPeriod()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->pendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getSpecialConditions()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->specialConditions:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->subtitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 101
    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->retailerName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 103
    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->cashBackString:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 105
    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->specialConditions:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->pendingPeriod:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CheckoutExtensionViewModel{subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->retailerName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cashBackString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->cashBackString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", specialConditions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->specialConditions:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/AutoValue_CheckoutExtensionViewModel;->pendingPeriod:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
