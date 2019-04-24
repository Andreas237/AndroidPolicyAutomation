.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;)V
    .locals 0

    .line 754
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    invoke-virtual {v0}, Lo/enw;->b()V

    .line 758
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v1

    invoke-virtual {v1}, Lo/enw;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v2, v3}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/aks;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 759
    return-void
.end method
