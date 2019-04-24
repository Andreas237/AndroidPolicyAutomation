.class Lo/dxo$8;
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

    .line 469
    iput-object p1, p0, Lo/dxo$8;->c:Lo/dxo;

    iput p2, p0, Lo/dxo$8;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 9

    .line 471
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 472
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "readBestStepMonthOfYear obj null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    return-void

    .line 476
    :cond_0
    move-object v3, p2

    :try_start_0
    check-cast v3, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;

    .line 477
    invoke-virtual {v3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->getTimeStamp()J

    move-result-wide v4

    .line 478
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 479
    invoke-virtual {v6, v4, v5}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 480
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 481
    iget v0, p0, Lo/dxo$8;->e:I

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbbd

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v8

    .line 482
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 483
    iget-object v0, p0, Lo/dxo$8;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v8, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 486
    goto :goto_0

    .line 484
    :catch_0
    move-exception v3

    .line 485
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "readBestStepMonthOfYear data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    :goto_0
    return-void
.end method
