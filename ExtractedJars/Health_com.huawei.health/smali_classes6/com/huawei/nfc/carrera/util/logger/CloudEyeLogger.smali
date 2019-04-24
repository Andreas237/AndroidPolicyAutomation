.class public Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/util/logger/LoggerConstant;


# static fields
.field public static final FAIL_CODE:Ljava/lang/String; = "fail_code"

.field public static final FAIL_DESC:Ljava/lang/String; = "fail_desc"

.field private static final ISSUER_ID:Ljava/lang/String; = "issuerId"

.field private static msgTable:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private eventId:I

.field private extraInfo:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private failCode:Ljava/lang/String;

.field private isNeedProguard:Z

.field private isNeedUploadLogFile:Z

.field private resultCode:I

.field private resultDesc:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    .line 62
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1200"

    const-string v2, "query issue money failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1300"

    const-string v2, "apply issue order failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1400"

    const-string v2, "pay issue card money failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1101"

    const-string v2, "create dmsd failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1102"

    const-string v2, "issue card failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1104"

    const-string v2, "update applet failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1199"

    const-string v2, "issue card other error"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1501"

    const-string v2, "apply recharge order failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "1502"

    const-string v2, "recharge failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3101"

    const-string v2, "UnionPay addon download failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3102"

    const-string v2, "create amsd failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3103"

    const-string v2, "init unionpay addon failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3104"

    const-string v2, "identify card num failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3105"

    const-string v2, "apply card num failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3106"

    const-string v2, "waiting load cap starttimeout"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3107"

    const-string v2, "load cap failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3108"

    const-string v2, "update personalized info into ta failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3109"

    const-string v2, "active card failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3110"

    const-string v2, "set finger print pwd failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "3201"

    const-string v2, "delete card failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2107"

    const-string v2, "apply transfer out failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2101"

    const-string v2, "apply transfer out order failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2102"

    const-string v2, "card transfer out failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2103"

    const-string v2, "report transfer out result failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2104"

    const-string v2, "transfer out,initEse failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2105"

    const-string v2, "transfer out,delete fm dmsd failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2199"

    const-string v2, "transfer out card other error"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2108"

    const-string v2, "agree transfer in failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2201"

    const-string v2, "create dmsd for transfer in failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2202"

    const-string v2, "apply transfer in order failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2203"

    const-string v2, "card transfer in failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2204"

    const-string v2, "report transfer in result failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2207"

    const-string v2, "query fm transfer code failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2299"

    const-string v2, "transfer in card other error"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2205"

    const-string v2, "transfer in, apply recharge order failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    const-string v1, "2206"

    const-string v2, "transfer in, recharge failed"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedUploadLogFile:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedProguard:Z

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    .line 133
    iput p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->eventId:I

    .line 134
    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 2

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedUploadLogFile:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedProguard:Z

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    .line 138
    iput p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->eventId:I

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    const-string v1, "issuerId"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedUploadLogFile:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedProguard:Z

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    .line 144
    iput p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->eventId:I

    .line 145
    iput-object p2, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->failCode:Ljava/lang/String;

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    const-string v1, "issuerId"

    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    return-void
.end method

.method public static build(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 1

    .line 118
    new-instance v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;-><init>(I)V

    return-object v0
.end method

.method public static build(ILjava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 1

    .line 123
    new-instance v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 1

    .line 128
    new-instance v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private getMsg(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 216
    sget-object v0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->msgTable:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", result code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", result desc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 218
    return-object v2
.end method


# virtual methods
.method public appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 1

    .line 182
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    return-object v0
.end method

.method public appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 1

    .line 187
    const-string v0, "fail_code"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    iput-object p2, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->failCode:Ljava/lang/String;

    goto :goto_0

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    :goto_0
    return-object p0
.end method

.method public setFailCode(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->failCode:Ljava/lang/String;

    .line 165
    return-object p0
.end method

.method public setIsNeedProguard(Z)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 0

    .line 157
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedProguard:Z

    .line 158
    return-object p0
.end method

.method public setNeedUploadLogFile(Z)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 0

    .line 151
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedUploadLogFile:Z

    .line 152
    return-object p0
.end method

.method public setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 0

    .line 170
    iput p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->resultCode:I

    .line 171
    return-object p0
.end method

.method public setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->resultDesc:Ljava/lang/String;

    .line 177
    return-object p0
.end method

.method public upload()V
    .locals 5

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    const-string v1, "fail_code"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->failCode:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->failCode:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->resultCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->resultDesc:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->getMsg(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    const-string v1, "fail_desc"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    iget v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->eventId:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    iget-boolean v2, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedUploadLogFile:Z

    iget-boolean v3, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->isNeedProguard:Z

    invoke-static {v0, v1, v4, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->extraInfo:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 212
    return-void
.end method
