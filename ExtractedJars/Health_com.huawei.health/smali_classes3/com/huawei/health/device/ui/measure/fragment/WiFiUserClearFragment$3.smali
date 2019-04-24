.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->showDeleteConfirmDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V
    .locals 0

    .line 429
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 432
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V

    .line 433
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_wificlear"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 436
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->popupFragment(Ljava/lang/Class;)V

    .line 438
    :cond_0
    return-void
.end method
