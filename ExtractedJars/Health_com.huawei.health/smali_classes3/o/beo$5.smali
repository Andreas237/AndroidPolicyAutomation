.class Lo/beo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/beo;

.field final synthetic d:Lo/beu;


# direct methods
.method constructor <init>(Lo/beo;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 407
    iput-object p1, p0, Lo/beo$5;->c:Lo/beo;

    iput-object p2, p0, Lo/beo$5;->d:Lo/beu;

    iput-object p3, p0, Lo/beo$5;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 412
    iget-object v0, p0, Lo/beo$5;->c:Lo/beo;

    iget-object v0, v0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_3

    .line 414
    iget-object v0, p0, Lo/beo$5;->d:Lo/beu;

    iget-object v3, v0, Lo/beu;->n:Landroid/widget/CheckBox;

    .line 415
    invoke-virtual {v3}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    invoke-virtual {v3}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v4

    .line 418
    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 419
    iget-object v0, p0, Lo/beo$5;->c:Lo/beo;

    iget-object v1, p0, Lo/beo$5;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-static {v0, v1, v2}, Lo/beo;->e(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 421
    :cond_2
    goto :goto_2

    .line 424
    :cond_3
    iget-object v0, p0, Lo/beo$5;->c:Lo/beo;

    iget-object v0, v0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o()V

    .line 425
    iget-object v0, p0, Lo/beo$5;->c:Lo/beo;

    iget-object v0, v0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->v()V

    .line 427
    :goto_2
    return-void
.end method
