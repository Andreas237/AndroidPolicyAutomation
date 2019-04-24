.class public Lcom/huawei/qrcode/constant/QrcodeConstant;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/constant/QrcodeConstant$Singletone;
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/String; = "a"

.field public static final ACCTION_JUMP_FROM_QRCODE:Ljava/lang/String; = "com.huawei.intent.action.QRCODE"

.field private static final APPMARKET_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C27162"

.field public static final CANCEL_SCAN_QRCODE:I = 0xfa6

.field public static final CHINA_UNION_QRCODE_FLAG:Ljava/lang/String; = "//qr.95516.com/"

.field public static final EXTERNAL_VALUE_LENGTH:I = 0xff

.field public static final EXTERNAL_VALUE_UNLEGAL:I = 0x12f

.field public static final FORMAT_ERROR_QRCODE:I = 0xfa7

.field private static final G:Ljava/lang/String; = "g"

.field private static final GAME:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field private static final GAMEBOX_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C10059090"

.field public static final HASH_TYPE:Ljava/lang/String; = "MD5"

.field public static final HUAWEI_GAME_PACKAGE:Ljava/lang/String; = "com.huawei.gamebox"

.field public static final HUAWEI_LIFE_PACKAGE:Ljava/lang/String; = "com.huawei.lives"

.field public static final HUAWEI_MARKET_PACKAGE:Ljava/lang/String; = "com.huawei.appmarket"

.field public static final HUAWEI_PAY_PACKAGE:Ljava/lang/String; = "com.huawei.android.hwpay"

.field public static final HUAWEI_QRCODE_FLAG:Ljava/lang/String; = "//q.hicloud.com/"

.field public static final HUAWEI_SOCIALITY_PACKAGE:Ljava/lang/String; = "com.huawei.hwid"

.field public static final HUAWEI_WALLET_PACKAGE:Ljava/lang/String; = "com.huawei.wallet"

.field public static final INTENT_EXTERNAL_VALUE:Ljava/lang/String; = "intent_external_value"

.field public static final INTENT_SCAN_FUNCTION_TIP:Ljava/lang/String; = "intent_scan_function_tip"

.field public static final IS_SDK_REGULAR:Z = true

.field public static final JOINT_FLAG:Ljava/lang/String; = "_"

.field private static final L:Ljava/lang/String; = "l"

.field private static final LIFE:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field private static final LIFE_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C10315005"

.field private static final MARKET:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field public static final MECARD_TYPE:I = 0x12d

.field public static final NOT_HUAWEI_QRCODE:I = 0xfa1

.field public static final NOT_SUPPORT_PRODUCE_QRCODE:I = 0xfa2

.field private static final P:Ljava/lang/String; = "p"

.field private static final PAY:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field private static final PAY_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C10060708"

.field public static final PICTURE_SELECT_QRCODE_FALG:Ljava/lang/String; = "picture_select_btn_flag"

.field public static final PRODUCE_CODE_VALID_TIME:J = 0x4d3f6400L

.field private static QRCODE_APP_CODE_SET:Ljava/util/HashSet; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field public static final QRCODE_APP_DOWN_INFO:Ljava/lang/String; = "qrcodeAppInfo"

.field public static final QRCODE_INTENT_KEY_BASEINFO:Ljava/lang/String; = "qrcode_intent_key"

.field public static final QUERY_APPINFO_URL:Ljava/lang/String; = "https://browserdl.hicloud.com/urlServer/appinfo"

.field private static final S:Ljava/lang/String; = "s"

.field public static final SCAN_NO_SUPPORT_SPLIT:I = 0xfa8

.field public static final SCAN_SDK_ERROR_NETWORK_FAIL:I = -0x12f

.field public static final SCAN_SDK_ERROR_REQUEST_FAIL:I = -0x130

.field public static final SCAN_SUCCESS_QRCODE:I = 0xfa5

.field private static final SOCIALITY:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field private static final SOCIALITY_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C10132067"

.field public static final UNKNOW_ERROR_QRCODE:I = 0xfa3

.field public static final VCARD_TYPE:I = 0x12e

.field private static final W:Ljava/lang/String; = "w"

.field private static final WALLET:Lcom/huawei/qrcode/constant/QrcodeConstant;

.field private static final WALLET_DOWN_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C10217244"


# instance fields
.field public downUrl:Ljava/lang/String;

.field public pkgName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$1;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$1;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->QRCODE_APP_CODE_SET:Ljava/util/HashSet;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$2;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$2;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->WALLET:Lcom/huawei/qrcode/constant/QrcodeConstant;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$3;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$3;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->LIFE:Lcom/huawei/qrcode/constant/QrcodeConstant;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$4;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$4;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->SOCIALITY:Lcom/huawei/qrcode/constant/QrcodeConstant;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$5;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$5;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->PAY:Lcom/huawei/qrcode/constant/QrcodeConstant;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$6;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$6;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->GAME:Lcom/huawei/qrcode/constant/QrcodeConstant;

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant$7;

    invoke-direct {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant$7;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->MARKET:Lcom/huawei/qrcode/constant/QrcodeConstant;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/constant/QrcodeConstant$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/constant/QrcodeConstant;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/constant/QrcodeConstant;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant$Singletone;->INSTANCE:Lcom/huawei/qrcode/constant/QrcodeConstant;

    return-object v0
.end method

.method public static getQrcodeConstant(Ljava/lang/String;)Lcom/huawei/qrcode/constant/QrcodeConstant;
    .locals 2

    const/4 v1, 0x0

    const-string v0, "s"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->SOCIALITY:Lcom/huawei/qrcode/constant/QrcodeConstant;

    goto :goto_0

    :cond_0
    const-string v0, "w"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->WALLET:Lcom/huawei/qrcode/constant/QrcodeConstant;

    goto :goto_0

    :cond_1
    const-string v0, "p"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->PAY:Lcom/huawei/qrcode/constant/QrcodeConstant;

    goto :goto_0

    :cond_2
    const-string v0, "g"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->GAME:Lcom/huawei/qrcode/constant/QrcodeConstant;

    goto :goto_0

    :cond_3
    const-string v0, "a"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->MARKET:Lcom/huawei/qrcode/constant/QrcodeConstant;

    goto :goto_0

    :cond_4
    const-string v0, "l"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v1, Lcom/huawei/qrcode/constant/QrcodeConstant;->LIFE:Lcom/huawei/qrcode/constant/QrcodeConstant;

    :cond_5
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getAppCodeHashSet()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashSet<Ljava/lang/String;>;"
        }
    .end annotation

    sget-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant;->QRCODE_APP_CODE_SET:Ljava/util/HashSet;

    return-object v0
.end method
