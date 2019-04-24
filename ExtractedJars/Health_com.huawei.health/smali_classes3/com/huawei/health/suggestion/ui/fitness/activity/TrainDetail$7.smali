.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 1548
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1551
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose open BT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1554
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lo/bzy;->d(Landroid/content/Context;Z)Z

    move-result v1

    invoke-static {}, Lo/bzy;->c()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZZ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1558
    :cond_0
    goto :goto_0

    .line 1556
    :catch_0
    move-exception v4

    .line 1557
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose open BT error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1559
    :goto_0
    return-void
.end method
