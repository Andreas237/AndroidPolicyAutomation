.class public interface abstract Lcom/huawei/openalliance/ad/inter/data/INativeAd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/inter/data/INativeAd$Converter;
    }
.end annotation


# virtual methods
.method public abstract getAdCloseKeyWords()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract getAdSign()Ljava/lang/String;
.end method

.method public abstract getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;
.end method

.method public abstract getCreativeType()I
.end method

.method public abstract getCta()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getEndTime()J
.end method

.method public abstract getIcon()Lcom/huawei/openalliance/ad/inter/data/ImageInfo;
.end method

.method public abstract getImageInfos()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ImageInfo;>;"
        }
    .end annotation
.end method

.method public abstract getLabel()Ljava/lang/String;
.end method

.method public abstract getStartTime()J
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
.end method

.method public abstract isClicked()Z
.end method

.method public abstract isExpired()Z
.end method

.method public abstract isValid()Z
.end method

.method public abstract isVideoAd()Z
.end method
