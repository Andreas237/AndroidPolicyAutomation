.class Lcom/huawei/dnurse/sdk/f;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;


# direct methods
.method constructor <init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->k(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->m(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;->onMeasuring(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/f;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xbb8

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :cond_1
    :goto_0
    return-void
.end method
