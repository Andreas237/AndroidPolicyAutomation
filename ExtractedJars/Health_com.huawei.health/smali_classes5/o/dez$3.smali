.class Lo/dez$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dez;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dez;


# direct methods
.method constructor <init>(Lo/dez;)V
    .locals 0

    .line 1384
    iput-object p1, p0, Lo/dez$3;->b:Lo/dez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 1388
    iget-object v0, p0, Lo/dez$3;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 1389
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1390
    const/16 v0, 0x2711

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1391
    iget-object v0, p0, Lo/dez$3;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1393
    return-void
.end method
