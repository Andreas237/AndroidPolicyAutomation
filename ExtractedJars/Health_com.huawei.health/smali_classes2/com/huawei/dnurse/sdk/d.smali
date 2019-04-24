.class Lcom/huawei/dnurse/sdk/d;
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

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/d;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/d;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/d;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/d;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->j(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    return-void
.end method
