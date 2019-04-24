.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

.field private d:I

.field private e:Landroid/widget/AbsListView;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1234
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1235
    iput-object p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->e:Landroid/widget/AbsListView;

    .line 1236
    iput p3, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->d:I

    .line 1237
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Z)Z

    .line 1245
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->d:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I

    move-result v2

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_0

    .line 1247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->e:Landroid/widget/AbsListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v2, v2, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v3, v3, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    .line 1248
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v4}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    mul-int/2addr v3, v4

    sub-int/2addr v2, v3

    .line 1247
    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/AbsListView;->smoothScrollToPositionFromTop(III)V

    goto :goto_0

    .line 1252
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->e:Landroid/widget/AbsListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;->d:I

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/AbsListView;->smoothScrollToPositionFromTop(III)V

    .line 1254
    :goto_0
    return-void
.end method
