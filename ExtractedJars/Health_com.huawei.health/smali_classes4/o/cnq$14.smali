.class Lo/cnq$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/clh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clh;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/huawei/hihealth/HiDataInsertOption;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:J

.field final synthetic f:Lo/crd;

.field final synthetic g:Lo/cnq;

.field final synthetic h:[I


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiDataInsertOption;Ljava/util/ArrayList;Lo/clh;JLjava/util/List;Lo/crd;[I)V
    .locals 0

    .line 660
    iput-object p1, p0, Lo/cnq$14;->g:Lo/cnq;

    iput-object p2, p0, Lo/cnq$14;->c:Lcom/huawei/hihealth/HiDataInsertOption;

    iput-object p3, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    iput-object p4, p0, Lo/cnq$14;->a:Lo/clh;

    iput-wide p5, p0, Lo/cnq$14;->e:J

    iput-object p7, p0, Lo/cnq$14;->b:Ljava/util/List;

    iput-object p8, p0, Lo/cnq$14;->f:Lo/crd;

    iput-object p9, p0, Lo/cnq$14;->h:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 665
    :try_start_0
    new-instance v6, Lo/cvf;

    invoke-direct {v6}, Lo/cvf;-><init>()V

    .line 666
    iget-object v0, p0, Lo/cnq$14;->c:Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-virtual {v6, v0}, Lo/cvf;->e(Lcom/huawei/hihealth/HiDataInsertOption;)V
    :try_end_0
    .catch Lo/cvo; {:try_start_0 .. :try_end_0} :catch_0

    .line 672
    goto :goto_0

    .line 667
    :catch_0
    move-exception v6

    .line 668
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() HiValidException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    iget-object v0, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Please check the data validity according to the requirement of HiHealth platform ! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    iget-object v0, p0, Lo/cnq$14;->a:Lo/clh;

    iget-object v1, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 671
    return-void

    .line 673
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() valid time  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnq$14;->e:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    const-string v0, "HiH_HiHealthBinder"

    const/16 v1, 0xa

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->f:Lo/crd;

    .line 676
    invoke-virtual {v2}, Lo/crd;->d()I

    move-result v2

    .line 675
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",One Data Type = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->b:Ljava/util/List;

    .line 676
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",packageName = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->f:Lo/crd;

    .line 677
    invoke-virtual {v2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ",writeStatType = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->c:Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiDataInsertOption;->getWriteStatType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 675
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    iget-object v0, p0, Lo/cnq$14;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const v1, 0x9c76

    if-ne v1, v0, :cond_0

    .line 680
    iget-object v0, p0, Lo/cnq$14;->g:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$14;->c:Lcom/huawei/hihealth/HiDataInsertOption;

    iget-object v2, p0, Lo/cnq$14;->b:Ljava/util/List;

    const v3, 0x9c76

    invoke-virtual {v0, v1, v2, v3}, Lo/cnw;->b(Lcom/huawei/hihealth/HiDataInsertOption;Ljava/util/List;I)V

    .line 683
    :cond_0
    iget-object v0, p0, Lo/cnq$14;->g:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v6

    .line 685
    iget-object v0, p0, Lo/cnq$14;->h:[I

    iget-object v1, p0, Lo/cnq$14;->b:Ljava/util/List;

    iget-object v2, p0, Lo/cnq$14;->f:Lo/crd;

    invoke-virtual {v2}, Lo/crd;->d()I

    move-result v2

    iget-object v3, p0, Lo/cnq$14;->c:Lcom/huawei/hihealth/HiDataInsertOption;

    .line 686
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDataInsertOption;->getWriteStatType()I

    move-result v3

    .line 685
    invoke-virtual {v6, v1, v2, v3}, Lo/crf;->b(Ljava/util/List;II)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 687
    iget-object v0, p0, Lo/cnq$14;->b:Ljava/util/List;

    invoke-virtual {v6, v0}, Lo/crf;->c(Ljava/util/List;)V

    .line 688
    invoke-virtual {v6}, Lo/crf;->e()V

    .line 689
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 690
    iget-object v0, p0, Lo/cnq$14;->g:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->b(Lo/cnq;)Lo/cun;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$14;->b:Ljava/util/List;

    iget-object v2, p0, Lo/cnq$14;->f:Lo/crd;

    invoke-virtual {v0, v1, v2}, Lo/cun;->e(Ljava/util/List;Lo/crd;)V

    .line 692
    :cond_1
    iget-object v0, p0, Lo/cnq$14;->g:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$14;->b:Ljava/util/List;

    iget-object v2, p0, Lo/cnq$14;->f:Lo/crd;

    iget-object v3, p0, Lo/cnq$14;->g:Lo/cnq;

    invoke-static {v3}, Lo/cnq;->e(Lo/cnq;)Lo/csk;

    move-result-object v3

    iget-object v4, p0, Lo/cnq$14;->g:Lo/cnq;

    .line 693
    invoke-static {v4}, Lo/cnq;->c(Lo/cnq;)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 692
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cnw;->e(Ljava/util/List;Lo/crd;Lo/csk;Ljava/util/concurrent/ExecutorService;)V

    .line 694
    iget-object v0, p0, Lo/cnq$14;->h:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-eqz v0, :cond_2

    .line 695
    iget-object v0, p0, Lo/cnq$14;->h:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v7

    .line 696
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() bulkSaveDetailHiHealthData fail errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->h:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    .line 697
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",errorMessage = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$14;->h:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 696
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    iget-object v0, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bulkSaveDetailHiHealthData fail "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    goto :goto_1

    .line 700
    :cond_2
    iget-object v0, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 707
    :goto_1
    iget-object v0, p0, Lo/cnq$14;->a:Lo/clh;

    iget-object v1, p0, Lo/cnq$14;->h:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 708
    goto :goto_2

    .line 702
    :catch_1
    move-exception v6

    .line 703
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    iget-object v0, p0, Lo/cnq$14;->h:[I

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 705
    iget-object v0, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/cnq$14;->h:[I

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

    .line 707
    iget-object v0, p0, Lo/cnq$14;->a:Lo/clh;

    iget-object v1, p0, Lo/cnq$14;->h:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 708
    goto :goto_2

    .line 707
    :catchall_0
    move-exception v8

    iget-object v0, p0, Lo/cnq$14;->a:Lo/clh;

    iget-object v1, p0, Lo/cnq$14;->h:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/cnq$14;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 708
    throw v8

    .line 709
    :goto_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnq$14;->e:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    return-void
.end method
