.class Lcom/huawei/dnurse/sdk/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->g(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->h(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    :goto_0
    return-void
.end method
