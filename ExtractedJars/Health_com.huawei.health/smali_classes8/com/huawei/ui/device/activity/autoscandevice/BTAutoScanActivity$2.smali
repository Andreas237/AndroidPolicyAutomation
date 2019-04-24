.class Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;Lo/egy;)Lo/egy;

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;Ljava/lang/Boolean;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    invoke-static {v1}, Lo/env;->d(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    .line 257
    invoke-static {v2}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/env;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/env;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;->a:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    invoke-static {v3}, Lo/env;->d(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 256
    invoke-static {v0, v1, v2}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;ILjava/lang/String;)V

    .line 258
    return-void
.end method
