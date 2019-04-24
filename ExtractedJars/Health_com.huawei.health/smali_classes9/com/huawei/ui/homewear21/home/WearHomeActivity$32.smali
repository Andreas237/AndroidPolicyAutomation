.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 772
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 776
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 777
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 778
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 779
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 780
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 781
    const-string v0, "click_status"

    const-string v1, "0"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    const-string v0, "device_name"

    const/4 v1, 0x0

    invoke-static {v5, v6, v1}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    sget-object v0, Lo/dae;->iX:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 784
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 785
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

    .line 788
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notification cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    sget-object v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 790
    return-void
.end method
