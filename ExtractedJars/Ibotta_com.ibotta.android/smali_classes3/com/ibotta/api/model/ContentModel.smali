.class public interface abstract Lcom/ibotta/api/model/ContentModel;
.super Ljava/lang/Object;
.source "ContentModel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/ContentModel$Type;
    }
.end annotation


# virtual methods
.method public abstract getCacheKey()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getId()I
.end method

.method public abstract getIdString()Ljava/lang/String;
.end method

.method public abstract getLink()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getSortOrder()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
.end method

.method public abstract getTypedId()Ljava/lang/String;
.end method
