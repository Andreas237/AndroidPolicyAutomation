.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 341
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/acl$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Lo/acl$a;)V

    .line 342
    return-void
.end method
