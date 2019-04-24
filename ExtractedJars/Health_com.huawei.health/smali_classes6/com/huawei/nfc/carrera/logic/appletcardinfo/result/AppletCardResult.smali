.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final RESULT_FAILED_AID_NOT_EXISTS:I = 0x3

.field public static final RESULT_FAILED_APDU_EXCUTED_FAILED:I = 0x6

.field public static final RESULT_FAILED_BANK_CARD_NUM_ABNORMAL:I = 0x12d

.field public static final RESULT_FAILED_CONFIG_JSON_DATA_NOT_FOUND:I = 0x5

.field public static final RESULT_FAILED_INNER_EXCEPTION:I = 0x3e7

.field public static final RESULT_FAILED_NOT_EXPECTED_SW:I = 0x9

.field public static final RESULT_FAILED_PARAM_CONFIG_ERROR:I = 0x2

.field public static final RESULT_FAILED_PARAM_ILLEGAL:I = 0x1

.field public static final RESULT_FAILED_PARSE_JSON_ERROR:I = 0x4

.field public static final RESULT_FAILED_TLV_DATA_FORMAT_ILLEGAL:I = 0x7

.field public static final RESULT_FAILED_TLV_STATUS_WORD_WRONG:I = 0x8

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_AMOUNT_ABNORMAL:I = 0xcb

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_DATE_FORMAT_ERROR:I = 0xce

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_ENABLE_DATE_ABNORMAL:I = 0xcc

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_OUT_OF_EXPIRE_DATE:I = 0xcd

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_OVERDRAFT_AMOUNT_ABNORMAL:I = 0xca

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_PIN_LOCKED:I = 0xd0

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_STATUS_ABNORMAL:I = 0xc9

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_VERIFY_PIN_FAILED:I = 0xcf

.field public static final RESULT_SUCCESS:I = 0x0


# instance fields
.field private data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private msg:Ljava/lang/String;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->resultCode:I

    .line 111
    const-string v0, "Success"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->msg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getPrintMsg()Ljava/lang/String;
    .locals 2

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 117
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->resultCode:I

    return v0
.end method

.method public setData(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 142
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->data:Ljava/lang/Object;

    .line 143
    return-void
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->msg:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->resultCode:I

    .line 123
    return-void
.end method
