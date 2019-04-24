.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardRecordInfoReader;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader<Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;>;"
    }
.end annotation


# static fields
.field private static final RECORES_CNT:I = 0xa

.field private static final SW_6A83:Ljava/lang/String; = "6A83"


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 24
    return-void
.end method

.method private parseRecord(Ljava/util/List;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;"
        }
    .end annotation

    .line 51
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_5

    .line 57
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 58
    const-string v0, "^0*$"

    invoke-virtual {v2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_2
    new-instance v3, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;-><init>()V

    .line 63
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 66
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 67
    invoke-virtual {v3, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->setRecordAmount(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 69
    :catch_0
    move-exception v5

    .line 71
    const-string v0, "parseRecord parse amount failed. rapdu :  amountStr : "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 73
    :goto_0
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->setRecordType(Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->setRecordTime(Ljava/lang/String;)V

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_4

    .line 77
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 78
    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 80
    const-string v0, "1"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->setRecordType(Ljava/lang/String;)V

    goto :goto_1

    .line 84
    :cond_3
    const-string v0, "2"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->setRecordType(Ljava/lang/String;)V

    .line 87
    :cond_4
    :goto_1
    return-object v3

    .line 89
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected getNextStep(Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;II)I
    .locals 6

    .line 95
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getSw()Ljava/lang/String;

    move-result-object v2

    .line 96
    const-string v0, "6A83"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    div-int/lit8 v3, p3, 0xa

    .line 100
    const/4 v4, 0x1

    :goto_0
    if-gt v4, v3, :cond_1

    .line 102
    mul-int/lit8 v5, v4, 0xa

    .line 103
    if-ge p2, v5, :cond_0

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readRecords for 6A83, skip steps("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v5, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totle steps : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 107
    return v5

    .line 100
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 112
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getNextStep(Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;II)I

    move-result v0

    return v0
.end method

.method protected bridge synthetic handleResult(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardRecordInfoReader;->handleResult(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected handleResult(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;"
        }
    .end annotation

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 33
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardRecordInfoReader;->parseRecord(Ljava/util/List;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;

    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 36
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_0
    goto :goto_0

    .line 39
    :cond_1
    return-object v1
.end method
