.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;

.field final synthetic val$object:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;->val$object:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;->val$object:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;->val$object:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 190
    :cond_0
    return-void
.end method
