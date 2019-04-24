.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 750
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 765
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->m()V

    .line 766
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->F()V

    .line 767
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 760
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 754
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$9;->c:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0, p1, p2, p4}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Ljava/lang/CharSequence;II)V

    .line 755
    return-void
.end method
