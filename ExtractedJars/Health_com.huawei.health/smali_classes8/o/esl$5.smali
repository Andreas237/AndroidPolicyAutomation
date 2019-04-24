.class Lo/esl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->b(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esl;

.field final synthetic d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;


# direct methods
.method constructor <init>(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lo/esl$5;->b:Lo/esl;

    iput-object p2, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 618
    const-string v0, "SmartCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SetDeprecatedSp_msgType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "showCount "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    .line 620
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 621
    iget-object v0, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v0

    iget-object v1, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v1}, Lo/esl;->d(Lo/esl;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_0

    .line 622
    const-string v0, "status"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 623
    iget-object v0, p0, Lo/esl$5;->b:Lo/esl;

    iget-object v1, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/esl;->c(Lo/esl;Ljava/lang/String;I)V

    .line 624
    iget-object v0, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->b(Lo/esl;)I

    move-result v0

    const v1, 0x186a0

    if-ne v1, v0, :cond_0

    .line 625
    iget-object v0, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_partiactivity_disappear_time"

    .line 626
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 625
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 629
    :cond_0
    const-string v0, "showCount"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 630
    iget-object v0, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget-object v1, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lo/dln;->d(ILandroid/content/ContentValues;)Z

    .line 631
    iget-object v0, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v0

    iget-object v1, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v1}, Lo/esl;->d(Lo/esl;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lo/esl$5;->d:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 632
    new-instance v7, Lo/dma;

    iget-object v0, p0, Lo/esl$5;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0}, Lo/dma;-><init>(Landroid/content/Context;)V

    .line 633
    const v0, 0xc350

    invoke-virtual {v7, v0}, Lo/dma;->e(I)V

    .line 635
    :cond_1
    return-void
.end method
