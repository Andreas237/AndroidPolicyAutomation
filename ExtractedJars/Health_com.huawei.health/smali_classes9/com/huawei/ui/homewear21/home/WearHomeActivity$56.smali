.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p()V
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

    .line 835
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 839
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 840
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 841
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 842
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 843
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 844
    const-string v0, "click_status"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    const-string v0, "device_name"

    const/4 v1, 0x0

    invoke-static {v5, v6, v1}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    sget-object v0, Lo/dae;->iX:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 847
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 848
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v5, v6, v3}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " another notification ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 852
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 853
    const-string v0, "isFromDialog"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 854
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 856
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 857
    return-void
.end method