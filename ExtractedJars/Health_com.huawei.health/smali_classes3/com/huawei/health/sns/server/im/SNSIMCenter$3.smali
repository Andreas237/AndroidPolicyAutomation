.class Lcom/huawei/health/sns/server/im/SNSIMCenter$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 932
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;->b:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 936
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 938
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;->b:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->g(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 941
    return-void

    .line 943
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 945
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;->b:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->i(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 947
    :cond_1
    const-string v0, "SNSIMCenter"

    const-string v1, "Receive network connected broadcast.has front view or has offline msg."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 948
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;->b:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;I)V

    .line 952
    :cond_2
    return-void
.end method
