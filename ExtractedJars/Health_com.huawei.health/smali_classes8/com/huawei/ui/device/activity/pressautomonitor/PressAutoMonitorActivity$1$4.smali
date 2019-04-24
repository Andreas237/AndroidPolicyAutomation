.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1$4;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1$4;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->d(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    .line 124
    return-void
.end method
