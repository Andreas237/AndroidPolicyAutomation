.class Lo/cwi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 831
    iput-object p1, p0, Lo/cwi$2;->a:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 10

    .line 835
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 836
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess() data = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    iget-object v0, p0, Lo/cwi$2;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, "\u672c\u5730\u65e0\u6570\u636e"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 838
    return-void

    .line 840
    :cond_0
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 842
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 843
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess map null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    iget-object v0, p0, Lo/cwi$2;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, "\u672c\u5730\u65e0\u6570\u636e"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 845
    return-void

    .line 847
    :cond_1
    const/16 v0, 0x7533

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 848
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 849
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 850
    :cond_2
    iget-object v0, p0, Lo/cwi$2;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, "\u672c\u5730\u65e0\u6570\u636e"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 851
    return-void

    .line 854
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 855
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    .line 856
    invoke-static {v7, v8}, Lo/dhh;->e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Ljava/lang/String;

    move-result-object v9

    .line 857
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveDeviceType(I)V

    .line 859
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$2;->a:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->k(Lo/cwi;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 860
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, v9, v8}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 861
    return-void
.end method
