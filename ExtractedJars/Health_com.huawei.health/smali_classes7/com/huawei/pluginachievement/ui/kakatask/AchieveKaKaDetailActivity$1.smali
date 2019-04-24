.class Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 75
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mHanlder, case :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 80
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    const-string v1, "mExecutor is shutdown"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;-><init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 90
    goto :goto_0

    .line 93
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    .line 94
    goto :goto_0

    .line 98
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Z)Z

    .line 99
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    .line 100
    .line 104
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 105
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x44e -> :sswitch_1
        0x44f -> :sswitch_2
    .end sparse-switch
.end method
