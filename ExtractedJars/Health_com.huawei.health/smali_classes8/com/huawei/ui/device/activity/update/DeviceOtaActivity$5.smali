.class Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$5;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$5;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->onBackPressed()V

    .line 140
    return-void
.end method
