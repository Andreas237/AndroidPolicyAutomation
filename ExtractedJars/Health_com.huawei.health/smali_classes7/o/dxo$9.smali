.class Lo/dxo$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->k(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/dxo;


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 586
    iput-object p1, p0, Lo/dxo$9;->c:Lo/dxo;

    iput p2, p0, Lo/dxo$9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 14

    .line 588
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 589
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getWeightData is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    return-void

    .line 593
    :cond_0
    move-object/from16 v3, p2

    :try_start_0
    check-cast v3, Ljava/util/List;

    .line 594
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 596
    const-string v0, "totalStep"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 597
    const-string v0, "totalCalorie"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 598
    const-string v0, "totalDistance"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 600
    iget v0, p0, Lo/dxo$9;->a:I

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1775

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v9

    .line 601
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 603
    iget v0, p0, Lo/dxo$9;->a:I

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1773

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v10

    .line 604
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 606
    iget v0, p0, Lo/dxo$9;->a:I

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbb9

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v11

    .line 607
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 609
    iget v0, p0, Lo/dxo$9;->a:I

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbba

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v12

    .line 610
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 612
    iget v0, p0, Lo/dxo$9;->a:I

    sget-object v1, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x232b

    invoke-static {v0, v1, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v13

    .line 613
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 615
    iget-object v0, p0, Lo/dxo$9;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v9, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 616
    iget-object v0, p0, Lo/dxo$9;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v10, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 617
    iget-object v0, p0, Lo/dxo$9;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v11, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 618
    iget-object v0, p0, Lo/dxo$9;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v12, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 619
    iget-object v0, p0, Lo/dxo$9;->c:Lo/dxo;

    invoke-static {v0}, Lo/dxo;->c(Lo/dxo;)Lo/dwr;

    move-result-object v0

    invoke-static {v13, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 622
    goto :goto_0

    .line 620
    :catch_0
    move-exception v3

    .line 621
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getWeightData data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    :goto_0
    return-void
.end method
