.class Lo/dlt$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlt;


# direct methods
.method constructor <init>(Lo/dlt;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lo/dlt$10;->d:Lo/dlt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 581
    iget-object v0, p0, Lo/dlt$10;->d:Lo/dlt;

    const-string v1, "sleep_user"

    const-string v2, "ai-info-008"

    invoke-static {v0, v1, v2}, Lo/dlt;->b(Lo/dlt;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 583
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    iget-object v0, p0, Lo/dlt$10;->d:Lo/dlt;

    const v1, 0x9c47

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 585
    return-void

    .line 589
    :cond_0
    const-string v0, "ai-info-008"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v6

    .line 591
    const-string v0, "ai-info-008"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7533

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 592
    const/4 v8, 0x0

    .line 593
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 595
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 598
    goto :goto_0

    .line 596
    :catch_0
    move-exception v9

    .line 597
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    :cond_1
    :goto_0
    const-string v0, "ai-info-008"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 602
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend priority = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", recentlyHaveDataDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v7, v1, v2

    const-string v2, ", recommendedTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    iget-object v0, p0, Lo/dlt$10;->d:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v10

    .line 607
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend isFocusSleep = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    if-eqz v10, :cond_2

    .line 610
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleep insert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    iget-object v0, p0, Lo/dlt$10;->d:Lo/dlt;

    const-string v1, "IC7"

    const v2, 0x9c47

    invoke-static {v0, v1, v2, v9, v6}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    .line 612
    return-void

    .line 616
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, v8

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long v11, v0, v2

    .line 617
    new-instance v13, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v13}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 619
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v13, v11, v12, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 620
    const/4 v14, 0x2

    new-array v14, v14, [I

    fill-array-data v14, :array_0

    .line 621
    invoke-virtual {v13, v14}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 623
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 625
    const/4 v0, 0x7

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 626
    iget-object v0, p0, Lo/dlt$10;->d:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dlt$10$1;

    invoke-direct {v1, p0, v9, v6}, Lo/dlt$10$1;-><init>(Lo/dlt$10;Ljava/lang/String;I)V

    invoke-interface {v0, v13, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 655
    return-void

    :array_0
    .array-data 4
        0xac49
        0xabe4
    .end array-data
.end method
