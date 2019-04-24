.class Lo/dxo$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->a(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dxo;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 439
    iput-object p1, p0, Lo/dxo$10;->c:Lo/dxo;

    iput p2, p0, Lo/dxo$10;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 11

    .line 441
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 442
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "readBestStepDayOfYear obj null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    return-void

    .line 446
    :cond_0
    move-object v3, p2

    :try_start_0
    check-cast v3, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;

    .line 447
    invoke-virtual {v3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->getValue()I

    move-result v4

    .line 448
    invoke-virtual {v3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->getTimeStamp()J

    move-result-wide v5

    .line 449
    invoke-virtual {v3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->getOverGoal()I

    move-result v7

    .line 451
    iget v0, p0, Lo/dxo$10;->e:I

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1774

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v8

    .line 452
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 453
    iget-object v0, p0, Lo/dxo$10;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v8, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 455
    iget v0, p0, Lo/dxo$10;->e:I

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbbb

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v9

    .line 456
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 458
    iget v0, p0, Lo/dxo$10;->e:I

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbbc

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v10

    .line 459
    invoke-static {v5, v6}, Lo/dxk;->c(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lo/dxo$10;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v9, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 462
    iget-object v0, p0, Lo/dxo$10;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v10, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 465
    goto :goto_0

    .line 463
    :catch_0
    move-exception v3

    .line 464
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "readBestStepDayOfYear data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    :goto_0
    return-void
.end method
