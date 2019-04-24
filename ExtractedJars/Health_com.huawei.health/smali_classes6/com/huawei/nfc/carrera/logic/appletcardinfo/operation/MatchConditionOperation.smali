.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;
    }
.end annotation


# instance fields
.field private defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

.field private resultList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    .line 23
    return-void
.end method

.method private getResult(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 57
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "r[0-9]"

    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    return-object p1

    .line 61
    :cond_0
    return-object p2
.end method


# virtual methods
.method public handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, " MatchConditionOperation no value-result pairs"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    if-nez v0, :cond_2

    .line 41
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, " MatchConditionOperation default value-result is null"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 44
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    .line 46
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;->value:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;->result:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->getResult(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 50
    :cond_3
    goto :goto_0

    .line 51
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;->result:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->getResult(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public init(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 67
    invoke-super {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->init(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    .line 73
    return-void

    .line 75
    :cond_0
    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 76
    array-length v0, v2

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    .line 80
    return-void

    .line 82
    :cond_1
    const/4 v3, 0x0

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    .line 84
    move-object v4, v2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 86
    const-string v0, "="

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 88
    array-length v0, v3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    .line 92
    return-void

    .line 94
    :cond_2
    const/4 v0, 0x0

    aget-object v8, v3, v0

    .line 95
    const/4 v0, 0x1

    aget-object v9, v3, v0

    .line 96
    const-string v0, "dft"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    invoke-direct {v0, v8, v9}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->defaultResult:Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    .line 99
    goto :goto_1

    .line 101
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;->resultList:Ljava/util/List;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;

    invoke-direct {v1, v8, v9}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 103
    :cond_4
    return-void
.end method
