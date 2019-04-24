.class public Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private sleepTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation
.end field

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSleepTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->sleepTotal:Ljava/util/List;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setSleepTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;)V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->sleepTotal:Ljava/util/List;

    .line 16
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->timeZone:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddSportTotalReq{sleepTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->sleepTotal:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;->timeZone:Ljava/lang/String;

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
