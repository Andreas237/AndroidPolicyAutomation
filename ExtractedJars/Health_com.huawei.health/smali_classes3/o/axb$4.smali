.class final Lo/axb$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axb;->b(JLandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:J

.field final synthetic d:Landroid/os/Handler;


# direct methods
.method constructor <init>(JLandroid/os/Handler;)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lo/axb$4;->c:J

    iput-object p3, p0, Lo/axb$4;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 51
    invoke-virtual {p0, p1}, Lo/axb$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 56
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/axb$4;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 59
    if-nez v3, :cond_0

    .line 61
    iget-wide v0, p0, Lo/axb$4;->c:J

    iget-object v2, p0, Lo/axb$4;->d:Landroid/os/Handler;

    invoke-static {v0, v1, v2}, Lo/axb;->d(JLandroid/os/Handler;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 64
    :cond_0
    iget-object v0, p0, Lo/axb$4;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lo/axb$4;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 67
    const/16 v0, 0x100

    iput v0, v4, Landroid/os/Message;->what:I

    .line 68
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 69
    const-string v0, "bundleKeyUser"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 70
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 71
    iget-object v0, p0, Lo/axb$4;->d:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 73
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
