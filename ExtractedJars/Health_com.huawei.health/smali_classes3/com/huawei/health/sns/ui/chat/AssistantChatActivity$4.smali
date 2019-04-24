.class final Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V
    .locals 0

    .line 1834
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1839
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/awr;

    invoke-direct {v1}, Lo/awr;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->a:Z

    invoke-static {v2, v3}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 1840
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 1846
    const-string v0, "AssistantChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " login server failed, code=("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1847
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->o(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1849
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1851
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$4;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->l(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1853
    :cond_0
    return-void
.end method
