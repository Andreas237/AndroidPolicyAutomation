.class public interface abstract Lcom/ibotta/api/model/FeatureModel;
.super Ljava/lang/Object;
.source "FeatureModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/PixelTrackable;
.implements Lcom/ibotta/api/model/base/Routable;


# virtual methods
.method public abstract getBgcolor()Ljava/lang/String;
.end method

.method public abstract getBigImg()Ljava/lang/String;
.end method

.method public abstract getCacheKey()Ljava/lang/String;
.end method

.method public abstract getCategoryImg()Ljava/lang/String;
.end method

.method public abstract getContext()Ljava/lang/String;
.end method

.method public abstract getExpiration()Ljava/util/Date;
.end method

.method public abstract getFeatureType()Ljava/lang/String;
.end method

.method public abstract getId()I
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getSortOrder()Ljava/lang/String;
.end method

.method public abstract getSortResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end method
