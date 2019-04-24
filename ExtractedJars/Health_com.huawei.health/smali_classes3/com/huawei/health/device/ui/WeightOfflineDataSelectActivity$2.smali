.class Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 194
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v1

    invoke-virtual {v1}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-static {v2}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-static {v2}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 199
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;->a:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-static {v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 208
    return-void
.end method
