.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESULT_CODE_APPLY_APDU_ABNORMAL_APDU_RESULT:I = 0x1772

.field public static final RESULT_CODE_APPLY_APDU_INVALID_TRANSCATION:I = 0x1771

.field public static final RESULT_CODE_APPLY_APDU_KEY_ERROR:I = 0x1774

.field public static final RESULT_CODE_APPLY_APDU_NO_SE_SPACE:I = 0x1773

.field public static final RESULT_CODE_APPLY_ORDER_DAILY_RECHARGE_LIMIT:I = 0x3f2

.field public static final RESULT_CODE_APPLY_ORDER_HAS_APPLET:I = 0x3ee

.field public static final RESULT_CODE_APPLY_ORDER_HAS_UNFINISHED_ORDER:I = 0x3ec

.field public static final RESULT_CODE_APPLY_ORDER_LIMITED_CARD_RESOURCE:I = 0x3eb

.field public static final RESULT_CODE_APPLY_ORDER_NO_CARD_RESOURCE:I = 0x3e9

.field public static final RESULT_CODE_APPLY_ORDER_OVER_DAILY_RECHARGE_COUNT_LIMIT:I = 0x3f0

.field public static final RESULT_CODE_APPLY_ORDER_OVER_DAILY_RECHARGE_LIMIT:I = 0x3ef

.field public static final RESULT_CODE_APPLY_ORDER_PROMOTION_IS_OVER:I = 0x2711

.field public static final RESULT_CODE_APPLY_ORDER_SP_SERVER_UNAVAILABLE:I = 0x3f1

.field public static final RESULT_CODE_APPLY_ORDER_UNSUPPORTED_CITY:I = 0x3ea

.field public static final RESULT_CODE_APPLY_ORDER_UNSUPPORTED_DEVICE:I = 0x3ed

.field public static final RESULT_CODE_DELETE_NO_APPLET:I = 0x138a

.field public static final RESULT_CODE_DELETE_SP_SERVER_ERROR:I = 0x1389

.field public static final RESULT_CODE_DOWNLOAD_INSTALL_CAP_ABNORMAL_ORDER:I = 0x7d2

.field public static final RESULT_CODE_DOWNLOAD_INSTALL_CAP_INVALID_ORDER:I = 0x7d1

.field public static final RESULT_CODE_DOWNLOAD_INSTALL_CAP_NO_SSD:I = 0x7d3

.field public static final RESULT_CODE_DOWNLOAD_INSTALL_CAP_SP_SERVER_ERROR:I = 0x7d4

.field public static final RESULT_CODE_INVALID_PARAM:I = 0x1

.field public static final RESULT_CODE_INVALID_ST:I = 0x4

.field public static final RESULT_CODE_NO_NETWORK:I = 0x2

.field public static final RESULT_CODE_NO_SERVICE:I = 0x3

.field public static final RESULT_CODE_OTHER_ERROR:I = -0x63

.field public static final RESULT_CODE_PERSONALIZE_ABNORMAL_ORDER:I = 0xbba

.field public static final RESULT_CODE_PERSONALIZE_INVALID_ORDER:I = 0xbb9

.field public static final RESULT_CODE_PERSONALIZE_NO_APPLET:I = 0xbbc

.field public static final RESULT_CODE_PERSONALIZE_SP_SERVER_ERROR:I = 0xbbb

.field public static final RESULT_CODE_QUERY_AMOUNT_UNSUPPORTED_CITY:I = 0x2329

.field public static final RESULT_CODE_QUERY_AMOUNT_UNSUPPORTED_DEVICE:I = 0x232a

.field public static final RESULT_CODE_QUERY_ORDER_INVALID_ORDER:I = 0x1f41

.field public static final RESULT_CODE_RECHARGE_ABNORMAL_APPLET:I = 0xfa4

.field public static final RESULT_CODE_RECHARGE_ABNORMAL_ORDER:I = 0xfa2

.field public static final RESULT_CODE_RECHARGE_INVALID_ORDER:I = 0xfa1

.field public static final RESULT_CODE_RECHARGE_SP_SERVER_ERROR:I = 0xfa3

.field public static final RESULT_CODE_SUCCESS:I = 0x0

.field public static final RESULT_DESC_INVALID_PARAM:Ljava/lang/String; = "client check, invalid param"


# instance fields
.field protected resultCode:I

.field protected resultDesc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/16 v0, -0x63

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultCode:I

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultDesc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getResultCode()I
    .locals 1

    .line 223
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultCode:I

    return v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setResultCode(I)V
    .locals 0

    .line 228
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultCode:I

    .line 229
    return-void
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->resultDesc:Ljava/lang/String;

    .line 239
    return-void
.end method
