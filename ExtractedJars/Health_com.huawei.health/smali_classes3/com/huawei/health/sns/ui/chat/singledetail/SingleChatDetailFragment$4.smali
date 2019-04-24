.class Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->n()V
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
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;->c:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 372
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;->c:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;->c:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->a:Lcom/huawei/health/sns/model/user/User;

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$4;->c:Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->e(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0xdd03

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 378
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
