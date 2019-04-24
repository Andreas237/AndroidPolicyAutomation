.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 505
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    if-nez v0, :cond_0

    .line 511
    const-string v0, "AssistantChatActivity"

    const-string v1, "assistant is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    return-void

    .line 515
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getSetFlags()Ljava/lang/String;

    move-result-object v4

    .line 516
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 518
    :cond_1
    const-string v0, "AssistantChatActivity"

    const-string v1, "assistant setFlags is validate."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    return-void

    .line 522
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 523
    const/4 v5, 0x0

    .line 524
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v6

    .line 525
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->getOldReceiveMsgStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 526
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lo/axc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$10;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/axc;->c(JILjava/lang/String;)V

    .line 528
    return-void
.end method

.method public d()V
    .locals 2

    .line 533
    const-string v0, "AssistantChatActivity"

    const-string v1, "receiveMsgClickListener performCancel"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    return-void
.end method
