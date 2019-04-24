.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bey;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 696
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;->e:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/bfb$e;Lo/bey$a;)V
    .locals 1

    .line 712
    sget-object v0, Lo/bey$a;->e:Lo/bey$a;

    if-ne p2, v0, :cond_0

    .line 714
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;->e:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lo/bfb$e;)V

    .line 716
    :cond_0
    return-void
.end method

.method public e(Lo/bfb$e;)V
    .locals 2

    .line 700
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;->e:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    if-eqz v0, :cond_2

    .line 702
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$7;->e:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->y:Lo/bdx;

    sget-object v1, Lo/bfb$e;->c:Lo/bfb$e;

    if-eq p1, v1, :cond_0

    sget-object v1, Lo/bfb$e;->a:Lo/bfb$e;

    if-ne p1, v1, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Lo/bdx;->setVisibility(I)V

    .line 707
    :cond_2
    return-void
.end method
