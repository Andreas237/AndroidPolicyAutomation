.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apduTable:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;>;"
        }
    .end annotation
.end field

.field private isSameApduNumAndDate:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->apduTable:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;)V"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->apduTable:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    return-void
.end method

.method public compareCardNumAndDateApdus()V
    .locals 5

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->apduTable:Ljava/util/HashMap;

    const-string v1, "num"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->apduTable:Ljava/util/HashMap;

    const-string v1, "date"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 38
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate:Z

    .line 41
    return-void

    .line 43
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate:Z

    .line 46
    return-void

    .line 48
    :cond_2
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 50
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate:Z

    .line 53
    return-void

    .line 48
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 56
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate:Z

    .line 57
    return-void
.end method

.method public getApduByType(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->apduTable:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public isSameApduNumAndDate()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduSet;->isSameApduNumAndDate:Z

    return v0
.end method
