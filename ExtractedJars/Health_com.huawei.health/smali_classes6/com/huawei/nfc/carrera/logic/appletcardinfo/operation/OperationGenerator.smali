.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/OperationGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static initHandler(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
    .locals 1

    .line 18
    const-string v0, "cut"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CutStringOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CutStringOperation;-><init>()V

    return-object v0

    .line 22
    :cond_0
    const-string v0, "match"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;-><init>()V

    return-object v0

    .line 26
    :cond_1
    const-string v0, "parseInt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ParseIntOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ParseIntOperation;-><init>()V

    return-object v0

    .line 30
    :cond_2
    const-string v0, "reverse"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 32
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ReverseOperation;-><init>()V

    return-object v0

    .line 34
    :cond_3
    const-string v0, "minus"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 36
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MinusOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MinusOperation;-><init>()V

    return-object v0

    .line 38
    :cond_4
    const-string v0, "xor"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 40
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/XorOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/XorOperation;-><init>()V

    return-object v0

    .line 42
    :cond_5
    const-string v0, "mod"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 44
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ModOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ModOperation;-><init>()V

    return-object v0

    .line 46
    :cond_6
    const-string v0, "cat"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 48
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CatStringOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CatStringOperation;-><init>()V

    return-object v0

    .line 50
    :cond_7
    const-string v0, "qdtcardno"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 52
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;-><init>()V

    return-object v0

    .line 54
    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method

.method public static parseOperations(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 63
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    const/4 v0, 0x0

    return-object v0

    .line 67
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 68
    const-string v0, ";"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 69
    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    .line 72
    const-string v0, ","

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 73
    const/4 v0, 0x0

    aget-object v0, v9, v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/OperationGenerator;->initHandler(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;

    move-result-object v10

    .line 74
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 76
    array-length v0, v9

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 78
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "operation config error. config data : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 81
    :cond_1
    const/4 v0, 0x1

    aget-object v0, v9, v0

    const/4 v1, 0x2

    aget-object v1, v9, v1

    invoke-virtual {v10, v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->init(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 85
    :cond_3
    return-object v3
.end method
