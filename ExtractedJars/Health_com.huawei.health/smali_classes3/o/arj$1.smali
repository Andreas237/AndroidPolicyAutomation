.class final Lo/arj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arj;->c(JLandroid/os/Handler;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic c:J

.field final synthetic d:Landroid/os/Handler;


# direct methods
.method constructor <init>(JLandroid/os/Handler;)V
    .locals 0

    .line 62
    iput-wide p1, p0, Lo/arj$1;->c:J

    iput-object p3, p0, Lo/arj$1;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/bra;)Ljava/lang/Object;
    .locals 6

    .line 66
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-wide v1, p0, Lo/arj$1;->c:J

    invoke-virtual {v0, v1, v2}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v3

    .line 67
    if-nez v3, :cond_0

    .line 69
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/arj$1;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 70
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 72
    new-instance v0, Lo/ari;

    invoke-direct {v0}, Lo/ari;-><init>()V

    invoke-virtual {v0, v4}, Lo/ari;->d(Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v3

    .line 75
    :cond_0
    iget-object v0, p0, Lo/arj$1;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p0, Lo/arj$1;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 78
    const/16 v0, 0x200

    iput v0, v4, Landroid/os/Message;->what:I

    .line 79
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 80
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 81
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 82
    iget-object v0, p0, Lo/arj$1;->d:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 84
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
