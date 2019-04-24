.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/BaseCallback;


# virtual methods
.method public abstract syncCardProductInfosFromServerResult(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)V"
        }
    .end annotation
.end method

.method public abstract syncIssuerInfosFromServerResult(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;)V"
        }
    .end annotation
.end method
