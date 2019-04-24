.class Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;->e:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 175
    if-eqz p2, :cond_0

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;->e:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/fcb;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcb;->e(Z)V

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;->e:Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/fcb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcb;->e(Z)V

    .line 182
    :goto_0
    return-void
.end method
