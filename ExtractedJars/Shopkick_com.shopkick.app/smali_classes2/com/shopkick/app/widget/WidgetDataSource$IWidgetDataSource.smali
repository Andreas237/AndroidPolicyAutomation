.class public interface abstract Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;
.super Ljava/lang/Object;
.source "WidgetDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/widget/WidgetDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IWidgetDataSource"
.end annotation


# virtual methods
.method public varargs abstract createRequest(I[Ljava/lang/Object;)Lcom/shopkick/app/fetchers/api/IAPIObject;
.end method

.method public abstract createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;
.end method

.method public abstract flush()V
.end method

.method public varargs abstract flush(I[Ljava/lang/Object;)V
.end method

.method public abstract flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end method

.method public abstract flushAll()V
.end method

.method public varargs abstract getData(I[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract getData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/Object;
.end method

.method public varargs abstract getLoadState(I[Ljava/lang/Object;)I
.end method

.method public abstract getLoadState(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
.end method
