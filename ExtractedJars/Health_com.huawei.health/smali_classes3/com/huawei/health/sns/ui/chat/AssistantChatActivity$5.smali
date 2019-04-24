.class final Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V
    .locals 0

    .line 1867
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 1871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$5;->a:Z

    invoke-static {v0, p1, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lo/bqy;Z)V

    .line 1872
    return-void
.end method
