.class Lo/bes$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bes;->e(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lo/bes;

.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic e:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method constructor <init>(Lo/bes;Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/bes$3;->c:Lo/bes;

    iput-object p2, p0, Lo/bes$3;->b:Landroid/view/View;

    iput-object p3, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p4, p0, Lo/bes$3;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 5

    .line 153
    iget-object v0, p0, Lo/bes$3;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 155
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1}, Lo/bes;->e(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v4

    .line 157
    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1, v3}, Lo/bes;->e(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    goto :goto_0

    .line 162
    :cond_0
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1, v3}, Lo/bes;->c(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    goto :goto_0

    .line 166
    :cond_1
    const/16 v0, 0xf

    if-ne v4, v0, :cond_2

    .line 168
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1, v3}, Lo/bes;->d(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    goto :goto_0

    .line 171
    :cond_2
    const/16 v0, 0x8

    if-ne v4, v0, :cond_3

    .line 173
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1, v3}, Lo/bes;->b(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    goto :goto_0

    .line 176
    :cond_3
    const/4 v0, 0x7

    if-ne v4, v0, :cond_4

    .line 178
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1}, Lo/bes;->c(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    goto :goto_0

    .line 181
    :cond_4
    const/4 v0, 0x6

    if-ne v4, v0, :cond_5

    .line 183
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v2, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, v2, p1}, Lo/bes;->c(Lo/bes;Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    goto :goto_0

    .line 188
    :cond_5
    iget-object v0, p0, Lo/bes$3;->c:Lo/bes;

    iget-object v1, p0, Lo/bes$3;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, p1}, Lo/bes;->d(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    .line 190
    :goto_0
    return-void
.end method
