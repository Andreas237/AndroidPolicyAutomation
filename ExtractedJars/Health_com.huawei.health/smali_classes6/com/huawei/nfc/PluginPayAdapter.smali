.class public interface abstract Lcom/huawei/nfc/PluginPayAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eab;


# static fields
.field public static final KEY_DEVICE_INFO_BT_VERSION:Ljava/lang/String; = "BT_version"

.field public static final KEY_DEVICE_INFO_MODEL:Ljava/lang/String; = "device_model"

.field public static final KEY_DEVICE_INFO_SN:Ljava/lang/String; = "device_sn"

.field public static final KEY_DEVICE_INFO_SOFT_VERSION:Ljava/lang/String; = "soft_version"

.field public static final KEY_OPEN_CHANNEL_APDU:Ljava/lang/String; = "apdu"

.field public static final KEY_OPEN_CHANNEL_ID:Ljava/lang/String; = "channelID"


# virtual methods
.method public abstract addBusCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract addCard2Watch(Ljava/lang/String;)Z
.end method

.method public abstract cardEvent(Ljava/lang/String;I)V
.end method

.method public abstract closeChannel()V
.end method

.method public abstract closeChannelSNB()V
.end method

.method public abstract deleteCard(Ljava/lang/String;)Z
.end method

.method public abstract getBTCInfoResponse()Ljava/lang/String;
.end method

.method public abstract getCplc()Ljava/lang/String;
.end method

.method public abstract getDeviceBTType()I
.end method

.method public abstract getDeviceConnectState()I
.end method

.method public abstract getDeviceInfo()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract getDeviceProtocol()I
.end method

.method public abstract getLockscreenStatus()I
.end method

.method public abstract getServiceCountryCode()Ljava/lang/String;
.end method

.method public abstract getUserID()Ljava/lang/String;
.end method

.method public abstract getWalletAbility()Ljava/lang/String;
.end method

.method public abstract isDeviceBand(I)Z
.end method

.method public abstract notificationOpenPageOfBand(Ljava/lang/String;)Z
.end method

.method public abstract notifyAfterTransferFile(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Z"
        }
    .end annotation
.end method

.method public abstract obtainCardList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract openChannel(Ljava/lang/String;I)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract openChannelSNB([BI)[B
.end method

.method public abstract sendAccount(Ljava/lang/String;)I
.end method

.method public abstract sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract sendFile(Ljava/lang/String;)V
.end method

.method public abstract transmitSNB([B)[B
.end method

.method public abstract updateCardInfo(Ljava/lang/String;)Z
.end method
