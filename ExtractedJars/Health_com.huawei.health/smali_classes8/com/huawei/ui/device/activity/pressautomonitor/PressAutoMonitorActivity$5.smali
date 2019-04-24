.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$5;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 206
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7528\u6237\u6ca1\u53bb\u6821\u9a8c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$5;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)V

    .line 208
    return-void
.end method
