.class public Lo/asv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;

.field private e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asv;->b:Landroid/os/Handler;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asv;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 64
    iput-object p1, p0, Lo/asv;->b:Landroid/os/Handler;

    .line 65
    return-void
.end method

.method public constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asv;->b:Landroid/os/Handler;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asv;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 69
    iput-object p1, p0, Lo/asv;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 70
    return-void
.end method

.method static synthetic a(Lo/asv;III)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lo/asv;->c(III)V

    return-void
.end method

.method private c(III)V
    .locals 2

    .line 159
    iget-object v0, p0, Lo/asv;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lo/asv;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/asv;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 163
    :cond_0
    iget-object v0, p0, Lo/asv;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/asv;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 166
    :cond_1
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 1

    .line 80
    new-instance v0, Lo/asv$4;

    invoke-direct {v0, p0, p3, p2}, Lo/asv$4;-><init>(Lo/asv;ZLcom/huawei/health/sns/model/group/Group;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 148
    return-void
.end method
