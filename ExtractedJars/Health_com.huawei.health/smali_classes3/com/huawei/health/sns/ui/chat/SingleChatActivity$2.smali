.class Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Lcom/huawei/health/sns/model/user/User;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 698
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 702
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 703
    const-string v0, "SingleChatActivity"

    const-string v1, "get new user info done."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$2;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->I:Landroid/os/Handler;

    const/16 v2, 0x7e6

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 706
    :cond_0
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity refreshUIByChange error, The user queryed from DB is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    :goto_0
    return-void
.end method
