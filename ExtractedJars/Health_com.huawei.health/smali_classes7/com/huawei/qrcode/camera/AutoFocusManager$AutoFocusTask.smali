.class final Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/camera/AutoFocusManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "AutoFocusTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/camera/AutoFocusManager;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/camera/AutoFocusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/camera/AutoFocusManager;Lcom/huawei/qrcode/camera/AutoFocusManager$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;-><init>(Lcom/huawei/qrcode/camera/AutoFocusManager;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_0
    iget-object v2, p0, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/huawei/qrcode/camera/AutoFocusManager;

    monitor-enter v2

    :try_start_1
    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-static {v0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->access$100(Lcom/huawei/qrcode/camera/AutoFocusManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
