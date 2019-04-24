.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private beginTime:Ljava/lang/String;

.field private clickUrl:Ljava/lang/String;

.field private content:Ljava/lang/String;

.field private endTime:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const-string v0, "issuerid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "issuerid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setIssuerId(Ljava/lang/String;)V

    .line 66
    :cond_0
    const-string v0, "beginTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    const-string v0, "beginTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setBeginTime(Ljava/lang/String;)V

    .line 71
    :cond_1
    const-string v0, "endTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    const-string v0, "endTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setEndTime(Ljava/lang/String;)V

    .line 76
    :cond_2
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 78
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setTitle(Ljava/lang/String;)V

    .line 81
    :cond_3
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 83
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setContent(Ljava/lang/String;)V

    .line 86
    :cond_4
    const-string v0, "clickUrl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 88
    const-string v0, "clickUrl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setClickUrl(Ljava/lang/String;)V

    .line 91
    :cond_5
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 93
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setType(Ljava/lang/String;)V

    .line 96
    :cond_6
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 98
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->setStatus(Ljava/lang/String;)V

    .line 101
    :cond_7
    return-void
.end method


# virtual methods
.method public getBeginTime()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->beginTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getClickUrl()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->clickUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->content:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->endTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->issuerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->status:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->title:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->type:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setBeginTime(Ljava/lang/String;)V
    .locals 1

    .line 120
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->beginTime:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setClickUrl(Ljava/lang/String;)V
    .locals 1

    .line 158
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->clickUrl:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 1

    .line 148
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->content:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public setEndTime(Ljava/lang/String;)V
    .locals 1

    .line 129
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->endTime:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 1

    .line 110
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->issuerId:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 1

    .line 174
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->status:Ljava/lang/String;

    .line 175
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 139
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->title:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1

    .line 166
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->type:Ljava/lang/String;

    .line 167
    return-void
.end method
