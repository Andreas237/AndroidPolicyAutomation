.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

.field final synthetic e:Lo/axv;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V
    .locals 0

    .line 767
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->e:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 773
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->e:Lo/axv;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 775
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->e:Lo/axv;

    invoke-static {v0, v1, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;I)V

    goto :goto_0

    .line 779
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;->e:Lo/axv;

    invoke-static {v0, v1, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;I)V

    .line 781
    :goto_0
    return-void
.end method
