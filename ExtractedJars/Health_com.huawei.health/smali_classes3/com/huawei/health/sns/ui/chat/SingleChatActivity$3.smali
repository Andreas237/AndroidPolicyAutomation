.class Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


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
        "Ljava/lang/Object;Lo/brd<Lcom/huawei/health/sns/model/user/User;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 692
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;->e:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 692
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;->b(Lo/bra;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;->e:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;->e:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {v1, v2, v3}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    .line 696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$3;->e:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->U:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method
