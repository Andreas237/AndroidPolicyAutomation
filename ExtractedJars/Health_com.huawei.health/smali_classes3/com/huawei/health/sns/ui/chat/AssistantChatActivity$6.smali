.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->aj()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 1536
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1536
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 6

    .line 1540
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-wide v1, v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v3

    .line 1541
    if-eqz v3, :cond_0

    .line 1543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1544
    const v0, 0xaca00

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1545
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1546
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1547
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1550
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
