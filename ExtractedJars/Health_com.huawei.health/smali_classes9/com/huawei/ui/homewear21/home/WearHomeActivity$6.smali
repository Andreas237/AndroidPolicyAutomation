.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 1745
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1748
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PRESS_AUTO_MONITOR_SWITCH_STATUS err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1750
    const/4 v5, 0x0

    .line 1751
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 1752
    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    .line 1753
    const-string v0, "true"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1754
    const/4 v5, 0x1

    .line 1756
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PRESS_AUTO_MONITOR_SWITCH_STATUS enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1758
    :cond_2
    if-eqz v5, :cond_3

    .line 1759
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 1761
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1763
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1773
    return-void
.end method
