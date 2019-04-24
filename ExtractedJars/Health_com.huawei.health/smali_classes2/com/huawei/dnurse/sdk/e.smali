.class Lcom/huawei/dnurse/sdk/e;
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

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    move-result-object v0

    iget-boolean v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xf

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/e;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0x11

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
