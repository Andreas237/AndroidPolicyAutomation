.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(J)V
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
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;J)V
    .locals 0

    .line 775
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 775
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 779
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->d:J

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;J)V

    .line 780
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$8;->d:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->c(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
