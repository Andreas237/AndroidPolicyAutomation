.class Lo/clq$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->c(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiDeviceInfo;

.field final synthetic b:Lo/clq;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lo/cme;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V
    .locals 0

    .line 758
    iput-object p1, p0, Lo/clq$9;->b:Lo/clq;

    iput-object p2, p0, Lo/clq$9;->a:Lcom/huawei/hihealth/HiDeviceInfo;

    iput-object p3, p0, Lo/clq$9;->d:Ljava/util/List;

    iput-object p4, p0, Lo/clq$9;->e:Lo/cme;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 761
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 762
    iget-object v0, p0, Lo/clq$9;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 764
    :try_start_0
    iget-object v0, p0, Lo/clq$9;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$9;->a:Lcom/huawei/hihealth/HiDeviceInfo;

    iget-object v2, p0, Lo/clq$9;->d:Ljava/util/List;

    new-instance v3, Lo/clq$9$2;

    invoke-direct {v3, p0, v4, v5}, Lo/clq$9$2;-><init>(Lo/clq$9;J)V

    invoke-interface {v0, v1, v2, v3}, Lo/clg;->a(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/clk;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 776
    goto :goto_0

    .line 772
    :catch_0
    move-exception v6

    .line 773
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClient e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget-object v0, p0, Lo/clq$9;->e:Lo/cme;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 775
    iget-object v0, p0, Lo/clq$9;->e:Lo/cme;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cme;->onResult(Lcom/huawei/hihealth/HiHealthClient;)V

    .line 777
    :cond_0
    :goto_0
    return-void
.end method
