.class public abstract Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
.super Ljava/lang/Object;
.source "PwiPaymentMethod.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getCardBrand()Ljava/lang/String;
.end method

.method public abstract getCardType()Ljava/lang/String;
.end method

.method public abstract getExpiryMonth()I
.end method

.method public abstract getExpiryYear()I
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getSourceId()Ljava/lang/String;
.end method

.method public abstract getSourceType()Ljava/lang/String;
.end method

.method public abstract isDefaultSource()Z
.end method
