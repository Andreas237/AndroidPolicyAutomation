.class public interface abstract Lcom/ibotta/api/model/ProductModel;
.super Ljava/lang/Object;
.source "ProductModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/PixelTrackable;
.implements Lcom/ibotta/api/model/ContentModel;
.implements Lcom/ibotta/api/model/base/Routable;


# virtual methods
.method public abstract getActionButtonText()Ljava/lang/String;
.end method

.method public abstract getActionButtonType()Ljava/lang/String;
.end method

.method public abstract getCacheKey()Ljava/lang/String;
.end method

.method public abstract getCurrentValue()Ljava/lang/String;
.end method

.method public abstract getDeeplinkUrl()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getImageUrlLarge()Ljava/lang/String;
.end method

.method public abstract getImageUrlSmall()Ljava/lang/String;
.end method

.method public abstract getImageUrlThumbnail()Ljava/lang/String;
.end method

.method public abstract getPrice()F
.end method

.method public abstract getRetailerId()I
.end method
