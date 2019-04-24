.class public interface abstract Lcom/huawei/nfc/carrera/logic/NFCOpenApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getCardDetailView(Lcom/huawei/wallet/model/unicard/UniCardInfo;Landroid/app/Activity;I)Landroid/view/View;
.end method

.method public abstract initNFC(Landroid/app/Activity;)V
.end method

.method public abstract isCanDragStop(IILjava/util/List;Landroid/content/Context;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;Landroid/content/Context;)Z"
        }
    .end annotation
.end method

.method public abstract isShowQuickPayTipDialog(Landroid/content/Context;)Z
.end method

.method public abstract jumpToAddCardActivity(Landroid/app/Activity;)V
.end method

.method public abstract onDragStop(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation
.end method

.method public abstract refreshCardList()V
.end method

.method public abstract registerCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
.end method

.method public abstract setRefreshRF(Z)V
.end method

.method public abstract unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
.end method
