.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;
.super Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.source "SourceFile"


# instance fields
.field public expireDate:Ljava/lang/String;

.field public validityTermStatus:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->resultCode:I

    .line 26
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>(I)V

    .line 31
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 44
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->resultCode:I

    .line 45
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->parse(Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 36
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->resultCode:I

    .line 37
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->expireDate:Ljava/lang/String;

    .line 38
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    .line 39
    return-void
.end method

.method private parse(Ljava/lang/String;)V
    .locals 7

    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 54
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 55
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->setLenient(Z)V

    .line 58
    const/4 v0, 0x0

    const/16 v1, 0x8

    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 59
    const/16 v0, 0x8

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->expireDate:Ljava/lang/String;

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "000001"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->expireDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "235959"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 62
    new-instance v6, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 63
    invoke-virtual {v6, v4}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    .line 69
    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    .line 75
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_0

    .line 77
    :catch_0
    move-exception v3

    .line 80
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    .line 83
    :goto_0
    goto :goto_1

    .line 86
    :cond_2
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    .line 89
    :goto_1
    return-void
.end method
