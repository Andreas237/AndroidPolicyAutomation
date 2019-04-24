.class Lo/dfv$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfv;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dfv;


# direct methods
.method constructor <init>(Lo/dfv;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lo/dfv$7;->c:Lo/dfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 866
    iget-object v0, p0, Lo/dfv$7;->c:Lo/dfv;

    invoke-static {v0}, Lo/dfv;->e(Lo/dfv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 867
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 868
    const/16 v0, 0x2711

    iput v0, v1, Landroid/os/Message;->what:I

    .line 869
    iget-object v0, p0, Lo/dfv$7;->c:Lo/dfv;

    invoke-static {v0}, Lo/dfv;->e(Lo/dfv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 871
    return-void
.end method
