.class public Lcom/huawei/common/Constant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ADL2:Ljava/lang/String; = "MUt20CRGk05dZv1nM4LgV0Frl_MJpoomckQyPnkoW10"

.field public static final APP_REQUEST_CLIENT_TYPE:I = 0x2d

.field public static final CHANNEL:Ljava/lang/String; = "channel"

.field public static final CHANNEL_NUM:I = 0x2aea541

.field public static final COLON:Ljava/lang/String; = ":"

.field public static final HASH_SIGN:Ljava/lang/String; = "#"

.field public static final HTTP_CLIENT_KEY_PART1:Ljava/lang/String; = "5fRwqJzIO3HNtMqwXLkYUWKMlq3Q8/"

.field public static final HTTP_CLIENT_SECRET_PART1:Ljava/lang/String; = "/RbGdNtmdQsjc3odR6y85+i4CVo/"

.field public static final HWAPPIDACCOUNT2:Ljava/lang/String; = "401AFAFB7A145+St7Toa"

.field public static final KIDWATCH_GETQR:Ljava/lang/String; = "https://hwlf.hwcloudtest.cn/DimensionalCode/getqrInfo"

.field public static final RESULTRSP:Ljava/lang/String; = "ResultRsp"

.field public static final SECURITYPHONE:Ljava/lang/String; = "securityPhone"

.field public static final SEMICOLON:Ljava/lang/String; = ";"

.field public static final SESSSIONID:Ljava/lang/String; = "sesssionID"

.field public static final WECHAT_APPID_PART1:Ljava/lang/String; = "vIYSjdIS1Xqn0Y7mebJsqS5/ra7"

.field public static final WECHAT_SECRET_PART1:Ljava/lang/String; = "ee0c33Vh2tylrx9mYJ1MM/PXUgn"

.field public static final mNUllValue_1440:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x5a0

    if-ge v3, v0, :cond_0

    .line 22
    const-string v0, ",-1"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/common/Constant;->mNUllValue_1440:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
