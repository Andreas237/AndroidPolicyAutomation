.class Lo/clq$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq;

.field final synthetic c:Lcom/huawei/hihealth/HiDataReadOption;

.field final synthetic e:Lo/cmd;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    .locals 0

    .line 612
    iput-object p1, p0, Lo/clq$7;->a:Lo/clq;

    iput-object p2, p0, Lo/clq$7;->c:Lcom/huawei/hihealth/HiDataReadOption;

    iput-object p3, p0, Lo/clq$7;->e:Lo/cmd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 616
    iget-object v0, p0, Lo/clq$7;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 618
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 619
    new-instance v10, Landroid/util/SparseArray;

    invoke-direct {v10}, Landroid/util/SparseArray;-><init>()V

    .line 620
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 621
    iget-object v0, p0, Lo/clq$7;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$7;->c:Lcom/huawei/hihealth/HiDataReadOption;

    new-instance v2, Lo/clq$7$4;

    move-object v3, p0

    move-object v4, v11

    move-object v5, v10

    move-wide v6, v8

    invoke-direct/range {v2 .. v7}, Lo/clq$7$4;-><init>(Lo/clq$7;Ljava/util/List;Landroid/util/SparseArray;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->d(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    goto :goto_0

    .line 637
    :catch_0
    move-exception v8

    .line 638
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lo/clq$7;->e:Lo/cmd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 640
    iget-object v0, p0, Lo/clq$7;->e:Lo/cmd;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cmd;->d(Ljava/lang/Object;II)V

    .line 642
    :cond_0
    :goto_0
    return-void
.end method
