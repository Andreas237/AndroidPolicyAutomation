.class Lo/ale$54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field final synthetic d:Lo/ale;

.field private e:I


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 1

    .line 3724
    iput-object p1, p0, Lo/ale$54;->d:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3725
    const/16 v0, 0x64

    iput v0, p0, Lo/ale$54;->e:I

    .line 3726
    const/16 v0, 0x1e

    iput v0, p0, Lo/ale$54;->b:I

    .line 3727
    const/16 v0, 0x32

    iput v0, p0, Lo/ale$54;->c:I

    .line 3728
    const/16 v0, 0x14

    iput v0, p0, Lo/ale$54;->a:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 3733
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "traffic_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3735
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 3736
    invoke-static {v6, v7, v8}, Lo/dbf;->b(Ljava/lang/String;J)Z

    move-result v9

    .line 3737
    if-eqz v9, :cond_0

    .line 3738
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "traffic_time"

    .line 3739
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3738
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3740
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_rx"

    .line 3741
    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3740
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3742
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_tx"

    .line 3743
    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3742
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3744
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_rx"

    .line 3745
    const/16 v3, 0x32

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3744
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3746
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_tx"

    .line 3747
    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3746
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 3749
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_rx"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 3751
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->e:I

    .line 3752
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_tx"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 3754
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->b:I

    .line 3755
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_rx"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 3757
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->c:I

    .line 3758
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_tx"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 3760
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->a:I

    .line 3764
    :goto_0
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->I(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v10

    .line 3765
    const-string v0, "wifi_rx"

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    .line 3766
    const-string v0, "wifi_tx"

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 3767
    const-string v0, "mobile_rx"

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v15

    .line 3768
    const-string v0, "mobile_tx"

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    .line 3769
    new-instance v19, Ljava/util/LinkedHashMap;

    invoke-direct/range {v19 .. v19}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3770
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->e:I

    int-to-double v0, v0

    cmpl-double v0, v11, v0

    if-lez v0, :cond_1

    .line 3771
    const-string v0, "wifi_traffic_rx"

    const-string v1, "0.00"

    invoke-static {v11, v12, v1}, Lo/dbf;->b(DLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3772
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->e:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ale$54;->e:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->e:I

    .line 3773
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_rx"

    move-object/from16 v3, p0

    iget v3, v3, Lo/ale$54;->e:I

    .line 3774
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3773
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3776
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->b:I

    int-to-double v0, v0

    cmpl-double v0, v13, v0

    if-lez v0, :cond_2

    .line 3777
    const-string v0, "wifi_traffic_tx"

    const-string v1, "0.00"

    invoke-static {v13, v14, v1}, Lo/dbf;->b(DLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3778
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->b:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ale$54;->b:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->b:I

    .line 3779
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi_tx"

    move-object/from16 v3, p0

    iget v3, v3, Lo/ale$54;->b:I

    .line 3780
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3779
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3782
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->c:I

    int-to-double v0, v0

    cmpl-double v0, v15, v0

    if-lez v0, :cond_3

    .line 3783
    const-string v0, "mobile_traffic_rx"

    const-string v1, "0.00"

    move-wide v2, v15

    invoke-static {v2, v3, v1}, Lo/dbf;->b(DLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3784
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->c:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ale$54;->c:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->c:I

    .line 3785
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_rx"

    move-object/from16 v3, p0

    iget v3, v3, Lo/ale$54;->c:I

    .line 3786
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3785
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3788
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->a:I

    int-to-double v0, v0

    cmpl-double v0, v17, v0

    if-lez v0, :cond_4

    .line 3789
    const-string v0, "mobile_traffic_tx"

    const-string v1, "0.00"

    move-wide/from16 v2, v17

    invoke-static {v2, v3, v1}, Lo/dbf;->b(DLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3790
    move-object/from16 v0, p0

    iget v0, v0, Lo/ale$54;->a:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ale$54;->a:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ale$54;->a:I

    .line 3791
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale$54;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mobile_tx"

    move-object/from16 v3, p0

    iget v3, v3, Lo/ale$54;->a:I

    .line 3792
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3791
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3794
    :cond_4
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_TRAFFIC_85010001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 3798
    goto :goto_1

    .line 3795
    :catch_0
    move-exception v10

    .line 3797
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time error Throwable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3799
    :goto_1
    return-void
.end method
