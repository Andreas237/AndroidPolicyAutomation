.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    .line 16
    return-void
.end method

.method private rervse([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    array-length v0, p1

    add-int/lit8 v3, v0, -0x1

    :goto_0
    if-ltz v3, :cond_0

    .line 64
    aget-object v0, p1, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private split(Ljava/lang/String;I)[Ljava/lang/String;
    .locals 5

    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int v2, v0, p2

    .line 51
    new-array v3, v2, [Ljava/lang/String;

    .line 52
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 54
    mul-int v0, v4, p2

    add-int/lit8 v1, v4, 0x1

    mul-int/2addr v1, p2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    .line 52
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 56
    :cond_0
    return-object v3
.end method


# virtual methods
.method public handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;->param:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, " ReverseOperation param is null"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;->param:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 28
    if-lez v3, :cond_1

    rem-int v0, v4, v3

    if-eqz v0, :cond_2

    .line 30
    :cond_1
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " ReverseOperation the data length can not divide setp . len : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " step : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 33
    :cond_2
    new-array v5, v4, [C

    .line 34
    const/4 v0, 0x1

    if-ne v3, v0, :cond_4

    .line 36
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    .line 38
    sub-int v0, v4, v6

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    aput-char v0, v5, v6

    .line 36
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 40
    :cond_3
    invoke-static {v5}, Ljava/lang/String;->copyValueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 44
    :cond_4
    invoke-direct {p0, p1, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;->rervse([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
