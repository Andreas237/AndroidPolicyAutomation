.class public interface abstract Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_BANK_CARD_NUM:I = 0x5

.field public static final TYPE_CARD_AMOUNT:I = 0x3

.field public static final TYPE_CARD_CONSUME_RECORDS:I = 0xb

.field public static final TYPE_CARD_DATE:I = 0x2

.field public static final TYPE_CARD_NUM:I = 0x1

.field public static final TYPE_CARD_RECORDS:I = 0x4

.field public static final TYPE_CARD_STATUS:I = 0x0


# virtual methods
.method public abstract getApudList(Ljava/lang/String;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation
.end method

.method public abstract isSameApduNumAndDate(Ljava/lang/String;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation
.end method
