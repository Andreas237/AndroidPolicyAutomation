.class public abstract Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private idx:I

.field protected param:Ljava/lang/String;

.field private paramIdx:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->param:Ljava/lang/String;

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    .line 23
    return-void
.end method

.method private getResultIdx(Ljava/lang/String;)I
    .locals 2

    .line 79
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->isResultPattern(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    const/4 v0, -0x1

    return v0

    .line 83
    :cond_0
    const-string v0, "r"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private isResultPattern(Ljava/lang/String;)Z
    .locals 1

    .line 74
    if-eqz p1, :cond_0

    const-string v0, "^r[0-9]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public changeParamWithData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 64
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    if-gez v0, :cond_1

    .line 66
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handlerRespData idx out of bound. paramIdx : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " size : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 67
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 69
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->param:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public checkAndHandleData(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 41
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->idx:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 43
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handlerRespData idx out of bound. idx : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->idx:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " size : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->idx:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 47
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " checkAndHandleData but data is null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->handleData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract handleData(Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation
.end method

.method public init(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->getResultIdx(Ljava/lang/String;)I

    move-result v2

    .line 28
    if-gez v2, :cond_0

    .line 30
    const/4 v3, 0x2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "operation config error. config data : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 32
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-direct {v0, v3, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    iput v2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->idx:I

    .line 35
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->param:Ljava/lang/String;

    .line 36
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->getResultIdx(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    .line 37
    return-void
.end method

.method public isNeedChangeParamWithData()Z
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->paramIdx:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
