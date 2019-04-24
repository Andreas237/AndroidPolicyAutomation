.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private medalIdList:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    sget-object v0, Lo/dxp;->i:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 23
    return-void
.end method


# virtual methods
.method public acquireMedalIdList()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;->medalIdList:Ljava/lang/String;

    return-object v0
.end method

.method public saveMedalIdList(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;->medalIdList:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportReward{medalIdList=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;->medalIdList:Ljava/lang/String;

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
