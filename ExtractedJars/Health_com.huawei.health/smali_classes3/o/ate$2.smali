.class Lo/ate$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ate;->b(ILcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic e:Lo/ate;


# direct methods
.method constructor <init>(Lo/ate;Lcom/huawei/health/sns/model/group/Group;I)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/ate$2;->e:Lo/ate;

    iput-object p2, p0, Lo/ate$2;->d:Lcom/huawei/health/sns/model/group/Group;

    iput p3, p0, Lo/ate$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 156
    invoke-virtual {p0, p1}, Lo/ate$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 160
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v2

    .line 161
    iget-object v0, p0, Lo/ate$2;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/ath;->d(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 163
    iget-object v0, p0, Lo/ate$2;->e:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/ate$2;->e:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 166
    iget v0, p0, Lo/ate$2;->a:I

    iput v0, v4, Landroid/os/Message;->what:I

    .line 167
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 168
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 169
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 170
    iget-object v0, p0, Lo/ate$2;->e:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 172
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
