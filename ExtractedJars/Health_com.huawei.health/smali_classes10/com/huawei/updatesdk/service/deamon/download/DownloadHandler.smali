.class public final Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;
.super Landroid/os/Handler;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/updatesdk/service/deamon/download/DownloadService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/updatesdk/service/deamon/download/DownloadService;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/huawei/updatesdk/support/pm/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/updatesdk/service/deamon/download/DownloadService;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V
    .locals 1

    iget-object v0, p1, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;->a:Lcom/huawei/updatesdk/sdk/service/download/e;

    invoke-virtual {v0, p2}, Lcom/huawei/updatesdk/sdk/service/download/e;->c(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    if-nez v3, :cond_0

    const-string v0, "DownloadService"

    const-string v1, "handleMessage, but service object is null."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    if-nez v0, :cond_2

    :cond_1
    return-void

    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v3, v4, v0}, Lcom/huawei/updatesdk/service/deamon/download/a;->a(Landroid/content/Context;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;I)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, v3, v4}, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a(Lcom/huawei/updatesdk/service/deamon/download/DownloadService;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V

    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v3, v4, v0}, Lcom/huawei/updatesdk/service/deamon/download/a;->a(Landroid/content/Context;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;I)V

    invoke-direct {p0, v4}, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V

    const-string v0, "DownloadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task download completed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, v3, v4}, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a(Lcom/huawei/updatesdk/service/deamon/download/DownloadService;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V

    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v3, v4, v0}, Lcom/huawei/updatesdk/service/deamon/download/a;->a(Landroid/content/Context;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;I)V

    const-string v0, "DownloadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task download canceled:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, v3, v4}, Lcom/huawei/updatesdk/service/deamon/download/DownloadHandler;->a(Lcom/huawei/updatesdk/service/deamon/download/DownloadService;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)V

    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v3, v4, v0}, Lcom/huawei/updatesdk/service/deamon/download/a;->a(Landroid/content/Context;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;I)V

    const-string v0, "DownloadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task download failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    iget-object v0, v3, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;->a:Lcom/huawei/updatesdk/sdk/service/download/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/e;->a(I)I

    :cond_3
    const-string v0, "DownloadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Download downloadPaused task.getId():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v3, v4, v0}, Lcom/huawei/updatesdk/service/deamon/download/a;->a(Landroid/content/Context;Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;I)V

    goto :goto_1

    :goto_0
    const-string v0, "DownloadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unkonw message "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,taskid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
