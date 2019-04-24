.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
.end method

.method public abstract cacheCardProductInfoItems()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation
.end method

.method public abstract cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
.end method

.method public abstract cacheIssuerInfoItems()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation
.end method

.method public abstract loadLocalCardProductInfo()V
.end method

.method public abstract loadLocalIssuerInfo()V
.end method
