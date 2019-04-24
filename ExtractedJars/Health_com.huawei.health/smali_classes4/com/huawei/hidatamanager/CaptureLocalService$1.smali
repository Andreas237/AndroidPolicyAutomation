.class Lcom/huawei/hidatamanager/CaptureLocalService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hidatamanager/CaptureLocalService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hidatamanager/CaptureLocalService;


# direct methods
.method constructor <init>(Lcom/huawei/hidatamanager/CaptureLocalService;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hidatamanager/CaptureLocalService$1;->this$0:Lcom/huawei/hidatamanager/CaptureLocalService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 30
    const-string v0, "CaptureLocalService"

    const-string v1, "onServiceConnected..."

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/huawei/hidatamanager/CaptureLocalService$1;->this$0:Lcom/huawei/hidatamanager/CaptureLocalService;

    invoke-static {p2}, Lo/yf$e;->b(Landroid/os/IBinder;)Lo/yf;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/CaptureLocalService;->access$002(Lcom/huawei/hidatamanager/CaptureLocalService;Lo/yf;)Lo/yf;

    .line 32
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 35
    const-string v0, "CaptureLocalService"

    const-string v1, "onServiceDisconnected..."

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/hidatamanager/CaptureLocalService$1;->this$0:Lcom/huawei/hidatamanager/CaptureLocalService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/CaptureLocalService;->access$002(Lcom/huawei/hidatamanager/CaptureLocalService;Lo/yf;)Lo/yf;

    .line 37
    return-void
.end method
