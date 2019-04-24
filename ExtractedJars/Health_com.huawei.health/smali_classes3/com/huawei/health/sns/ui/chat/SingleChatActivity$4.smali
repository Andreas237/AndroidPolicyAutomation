.class Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 535
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->m()V

    .line 548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->F()V

    .line 549
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 543
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v0, p1, p2, p4}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->a(Ljava/lang/CharSequence;II)V

    .line 539
    return-void
.end method
