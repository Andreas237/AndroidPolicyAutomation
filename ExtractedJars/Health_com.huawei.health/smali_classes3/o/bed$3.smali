.class Lo/bed$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bed;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/bed;


# direct methods
.method constructor <init>(Lo/bed;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/bed$3;->e:Lo/bed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 171
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/bed$3;->e:Lo/bed;

    invoke-static {v0}, Lo/bed;->d(Lo/bed;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/bed$3;->e:Lo/bed;

    invoke-static {v1}, Lo/bed;->d(Lo/bed;)Landroid/os/Handler;

    move-result-object v1

    const v2, 0xdd01

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 174
    iget-object v0, p0, Lo/bed$3;->e:Lo/bed;

    iget-object v0, v0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    .line 175
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 174
    const/4 v1, 0x1

    const/16 v2, 0x7e3

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    goto :goto_0

    .line 179
    :cond_0
    const-string v0, "SingleChatDetailEvent"

    const-string v1, "clearChatRecord error. delete record from DB error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    :goto_0
    return-void
.end method
