.class public interface abstract Lcom/huawei/nfc/carrera/logic/oma/IOmaService;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CHANNEL_TYPE_BASIC:I = 0x1

.field public static final CHANNEL_TYPE_LOGIC:I = 0x0

.field public static final MEDIA_TYPE_ESE:I = 0x0

.field public static final MEDIA_TYPE_SD:I = 0x2

.field public static final MEDIA_TYPE_SIM:I = 0x1

.field public static final RESULT_SUCCESS:I = 0x0

.field public static final RETURN_APDU_EXCUTE_CLOSE_CHANNEL_EXCEPTION:I = 0x1389

.field public static final RETURN_APDU_EXCUTE_CLOSE_SESERVICE_EXCEPTION:I = 0x138a

.field public static final RETURN_APDU_EXCUTE_NOT_EXPECTED_SW:I = 0xfa2

.field public static final RETURN_APDU_EXCUTE_NO_READER:I = 0x3ea

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_EXCEPTION:I = 0x7d8

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_IOEXCEPTION:I = 0x7d2

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_MISSRESOURCEEXCEPTION:I = 0x7d7

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_NOAID:I = 0x7d5

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_NOSUCHELEMENT:I = 0x7d4

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_NULLPOINTEREXCEPTION:I = 0x7d6

.field public static final RETURN_APDU_EXCUTE_OPENCHANNEL_SECURITYEXCEPTION:I = 0x7d3

.field public static final RETURN_APDU_EXCUTE_OPENSESSION_FAILED:I = 0x7d1

.field public static final RETURN_APDU_EXCUTE_PARAMS_ILLEGAL:I = 0x3e9

.field public static final RETURN_APDU_EXCUTE_RAPDU_IS_SMALL:I = 0xfa1

.field public static final RETURN_APDU_EXCUTE_SE_READER_NOT_PRESENT:I = 0x3eb

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_CHANNEL_IS_NULL:I = 0xbb9

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_EXCEPTION:I = 0xbbf

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_IOEXCEPTION:I = 0xbba

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_MISSRESOURCEEXCEPTION:I = 0xbbe

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_NOSUCHELEMENT:I = 0xbbc

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_NULLPOINTEREXCEPTION:I = 0xbbd

.field public static final RETURN_APDU_EXCUTE_TRANSMIT_SECURITYEXCEPTION:I = 0xbbb

.field public static final RETURN_SMARTCARD_NO_CAPDULIST:I = 0x3ec

.field public static final TAG:Ljava/lang/String; = "OmaService"


# virtual methods
.method public abstract closeChannel(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V
.end method

.method public abstract excuteApduList(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation
.end method

.method public abstract excuteApduListEx(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation
.end method
