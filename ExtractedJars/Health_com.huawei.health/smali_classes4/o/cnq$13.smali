.class Lo/cnq$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->e(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/clh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[I

.field final synthetic b:Lo/crd;

.field final synthetic c:Lcom/huawei/hihealth/HiDataDeleteOption;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:I

.field final synthetic g:Lo/clh;

.field final synthetic i:J

.field final synthetic k:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiDataDeleteOption;[IILjava/util/ArrayList;Lo/crd;Lo/clh;J)V
    .locals 0

    .line 760
    iput-object p1, p0, Lo/cnq$13;->k:Lo/cnq;

    iput-object p2, p0, Lo/cnq$13;->c:Lcom/huawei/hihealth/HiDataDeleteOption;

    iput-object p3, p0, Lo/cnq$13;->a:[I

    iput p4, p0, Lo/cnq$13;->e:I

    iput-object p5, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    iput-object p6, p0, Lo/cnq$13;->b:Lo/crd;

    iput-object p7, p0, Lo/cnq$13;->g:Lo/clh;

    iput-wide p8, p0, Lo/cnq$13;->i:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 766
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() deleteOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$13;->c:Lcom/huawei/hihealth/HiDataDeleteOption;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    new-instance v6, Lo/cvg;

    invoke-direct {v6}, Lo/cvg;-><init>()V

    .line 768
    iget-object v0, p0, Lo/cnq$13;->c:Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-virtual {v6, v0}, Lo/cvg;->c(Lcom/huawei/hihealth/HiDataDeleteOption;)V

    .line 769
    iget-object v0, p0, Lo/cnq$13;->a:[I

    iget-object v1, p0, Lo/cnq$13;->k:Lo/cnq;

    invoke-static {v1}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cre;->c(Landroid/content/Context;)Lo/cre;

    move-result-object v1

    iget-object v2, p0, Lo/cnq$13;->c:Lcom/huawei/hihealth/HiDataDeleteOption;

    iget v3, p0, Lo/cnq$13;->e:I

    invoke-virtual {v1, v2, v3}, Lo/cre;->c(Lcom/huawei/hihealth/HiDataDeleteOption;I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 770
    iget-object v0, p0, Lo/cnq$13;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 771
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$13;->a:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 772
    iget-object v0, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/cnq$13;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-static {v1}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    iget-object v0, p0, Lo/cnq$13;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->b(Lo/cnq;)Lo/cun;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$13;->c:Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTypes()[I

    move-result-object v1

    invoke-static {v1}, Lo/cvd;->d([I)Ljava/util/List;

    move-result-object v1

    const-string v2, "deleteHiHealthData"

    iget-object v3, p0, Lo/cnq$13;->b:Lo/crd;

    invoke-virtual {v0, v1, v2, v3}, Lo/cun;->e(Ljava/util/List;Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catch Lo/cvo; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 785
    iget-object v0, p0, Lo/cnq$13;->g:Lo/clh;

    iget-object v1, p0, Lo/cnq$13;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 786
    goto/16 :goto_0

    .line 775
    :catch_0
    move-exception v6

    .line 776
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() HiValidException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    iget-object v0, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v2}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 778
    iget-object v0, p0, Lo/cnq$13;->g:Lo/clh;

    iget-object v1, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 785
    iget-object v0, p0, Lo/cnq$13;->g:Lo/clh;

    iget-object v1, p0, Lo/cnq$13;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 779
    return-void

    .line 780
    :catch_1
    move-exception v6

    .line 781
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    iget-object v0, p0, Lo/cnq$13;->a:[I

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 783
    iget-object v0, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/cnq$13;->a:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 785
    iget-object v0, p0, Lo/cnq$13;->g:Lo/clh;

    iget-object v1, p0, Lo/cnq$13;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 786
    goto :goto_0

    .line 785
    :catchall_0
    move-exception v7

    iget-object v0, p0, Lo/cnq$13;->g:Lo/clh;

    iget-object v1, p0, Lo/cnq$13;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$13;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 786
    throw v7

    .line 787
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnq$13;->i:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    return-void
.end method
