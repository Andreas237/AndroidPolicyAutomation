.class public Lcom/huawei/health/suggestion/model/Data;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private content:Ljava/lang/String;

.field private fileName:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private md5:Ljava/lang/String;

.field private size:J

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireContent()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Data;->content:Ljava/lang/String;

    return-object v0
.end method

.method public acquireFileName()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Data;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Data;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireMd5()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Data;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public acquireSize()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Data;->size:J

    return-wide v0
.end method

.method public acquireUrl()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Data;->url:Ljava/lang/String;

    return-object v0
.end method

.method public savaContent(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Data;->content:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public savaFileName(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Data;->fileName:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public savaSize(J)V
    .locals 0

    .line 19
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Data;->size:J

    .line 20
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Data;->id:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public saveMd5(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Data;->md5:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public saveUrl(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Data;->url:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{content=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Data;->content:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Data;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Data;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", md5=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Data;->md5:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/Data;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fileName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Data;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
