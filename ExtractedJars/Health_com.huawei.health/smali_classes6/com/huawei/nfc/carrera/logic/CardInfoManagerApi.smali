.class public interface abstract Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NOTICE_TYPE_ISSUE_CARD:Ljava/lang/String; = "2"

.field public static final NOTICE_TYPE_RECHARGE:Ljava/lang/String; = "1"

.field public static final SPECIAL_TRAFFIC_BUSINESS_NONE_CODE:I = 0x0

.field public static final SPECIAL_TRAFFIC_BUSINESS_OPENCARD_ADN_RECHARGE_CODE:I = 0x3

.field public static final SPECIAL_TRAFFIC_BUSINESS_OPENCARD_CODE:I = 0x1

.field public static final SPECIAL_TRAFFIC_BUSINESS_RECHARGE_CODE:I = 0x2

.field public static final UNSUPPORTED_MODE:I = -0x1


# virtual methods
.method public abstract checkAvaiableCard()I
.end method

.method public abstract getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;
.end method

.method public abstract queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V
.end method

.method public abstract queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V
.end method

.method public abstract queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V
.end method

.method public abstract queryCardTransferAbility(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V
.end method

.method public abstract queryPayableCardInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;)V
.end method

.method public abstract querySupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V
.end method

.method public abstract querySupportedTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V
.end method

.method public abstract queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V
.end method

.method public abstract refreshCardList()V
.end method

.method public abstract registerCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
.end method

.method public abstract setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V
.end method

.method public abstract setRefreshRF(Z)V
.end method

.method public abstract syncRFConfFiles(Z)V
.end method

.method public abstract unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
.end method

.method public abstract updateCardOrder(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation
.end method

.method public abstract updateTACardTimeStamp(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;J)V
.end method
