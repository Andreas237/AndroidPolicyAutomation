.class Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 70
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;-><init>()V

    .line 71
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 72
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "cer_version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "update_nodes"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-static {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 78
    return-void
.end method
