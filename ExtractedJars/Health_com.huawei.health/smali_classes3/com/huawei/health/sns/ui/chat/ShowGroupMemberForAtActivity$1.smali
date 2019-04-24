.class Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(J)V
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
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;J)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->d:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 273
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 277
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->e:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->d:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->d:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$1;->d:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x148

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 283
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
