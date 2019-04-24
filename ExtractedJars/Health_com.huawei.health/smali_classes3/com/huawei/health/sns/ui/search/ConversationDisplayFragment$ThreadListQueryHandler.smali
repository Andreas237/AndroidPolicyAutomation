.class public final Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;
.super Landroid/content/AsyncQueryHandler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "ThreadListQueryHandler"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;Landroid/content/ContentResolver;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    .line 168
    invoke-direct {p0, p2}, Landroid/content/AsyncQueryHandler;-><init>(Landroid/content/ContentResolver;)V

    .line 169
    return-void
.end method


# virtual methods
.method protected onDeleteComplete(ILjava/lang/Object;I)V
    .locals 0

    .line 195
    return-void
.end method

.method protected onQueryComplete(ILjava/lang/Object;Landroid/database/Cursor;)V
    .locals 2

    .line 174
    const/16 v0, 0x6a5

    if-ne p1, v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->e:Lo/bga;

    invoke-virtual {v0, p3}, Lo/bga;->changeCursor(Landroid/database/Cursor;)V

    .line 177
    if-eqz p3, :cond_0

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->e(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->e(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 188
    :cond_1
    const-string v0, "ConversationDisplayFragment"

    const-string v1, "onQueryComplete called with unknown token"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :goto_0
    return-void
.end method
