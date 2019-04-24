.class public Lcom/huawei/health/suggestion/model/LangFile;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private langId:I

.field private langName:Ljava/lang/String;

.field private langUrl:Ljava/lang/String;

.field private language:Ljava/lang/String;

.field private version:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public acquireLangId()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/suggestion/model/LangFile;->langId:I

    return v0
.end method

.method public acquireLangName()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/LangFile;->langName:Ljava/lang/String;

    return-object v0
.end method

.method public acquireLangUrl()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/LangFile;->langUrl:Ljava/lang/String;

    return-object v0
.end method

.method public acquireLanguage()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/LangFile;->language:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVersion()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/LangFile;->version:J

    return-wide v0
.end method

.method public saveLangId(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langId:I

    .line 52
    return-void
.end method

.method public saveLangName(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langName:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public saveLangUrl(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langUrl:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public saveLanguage(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/LangFile;->language:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public saveVersion(J)V
    .locals 0

    .line 43
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/LangFile;->version:J

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LangFile{langName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", langUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/LangFile;->version:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", langId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/LangFile;->langId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", language=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/LangFile;->language:Ljava/lang/String;

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
