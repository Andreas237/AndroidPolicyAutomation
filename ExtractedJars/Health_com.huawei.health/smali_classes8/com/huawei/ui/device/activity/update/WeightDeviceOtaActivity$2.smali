.class Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$2;->e:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$2;->e:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->onBackPressed()V

    .line 442
    return-void
.end method
