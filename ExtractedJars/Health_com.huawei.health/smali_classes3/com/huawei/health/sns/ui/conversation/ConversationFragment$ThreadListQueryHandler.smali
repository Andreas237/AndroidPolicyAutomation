.class public final Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;
.super Landroid/content/AsyncQueryHandler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "ThreadListQueryHandler"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/content/ContentResolver;)V
    .locals 0

    .line 429
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    .line 430
    invoke-direct {p0, p2}, Landroid/content/AsyncQueryHandler;-><init>(Landroid/content/ContentResolver;)V

    .line 431
    return-void
.end method


# virtual methods
.method protected onDeleteComplete(ILjava/lang/Object;I)V
    .locals 0

    .line 490
    return-void
.end method

.method protected onQueryComplete(ILjava/lang/Object;Landroid/database/Cursor;)V
    .locals 5

    .line 436
    const/16 v0, 0x6a5

    if-ne p1, v0, :cond_4

    .line 438
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    invoke-virtual {v0, p3}, Lo/bga;->changeCursor(Landroid/database/Cursor;)V

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0, p3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/database/Cursor;)Landroid/database/Cursor;

    .line 440
    if-eqz p3, :cond_3

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;I)I

    .line 443
    const-string v0, "ConversationFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "listSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 446
    const/4 v3, 0x0

    .line 447
    const/4 v4, 0x0

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 450
    invoke-interface {p3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 453
    :cond_0
    invoke-static {p3}, Lo/axv;->b(Landroid/database/Cursor;)Lo/axv;

    move-result-object v3

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I

    move-result v0

    if-lez v0, :cond_2

    .line 457
    invoke-virtual {v3}, Lo/axv;->p()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 459
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 463
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    :cond_2
    :goto_0
    add-int/lit8 v4, v4, 0x1

    .line 471
    invoke-interface {p3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 473
    goto :goto_1

    .line 477
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 482
    :cond_4
    const-string v0, "ConversationFragment"

    const-string v1, "onQueryComplete called with unknown token "

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V

    .line 485
    return-void
.end method
