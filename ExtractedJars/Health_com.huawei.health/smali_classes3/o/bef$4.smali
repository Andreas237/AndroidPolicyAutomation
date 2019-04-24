.class Lo/bef$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bef;->a(Lo/bef$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bef$d;

.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/axq;

.field final synthetic d:Lo/bef;


# direct methods
.method constructor <init>(Lo/bef;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bef$d;Lo/axq;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/bef$4;->d:Lo/bef;

    iput-object p2, p0, Lo/bef$4;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bef$4;->a:Lo/bef$d;

    iput-object p4, p0, Lo/bef$4;->c:Lo/axq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 157
    iget-object v0, p0, Lo/bef$4;->d:Lo/bef;

    iget-object v0, v0, Lo/bef;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/bef$4;->d:Lo/bef;

    iget-object v1, p0, Lo/bef$4;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bef$4;->a:Lo/bef$d;

    invoke-virtual {v0, v1, v2}, Lo/bef;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lo/bef$4;->c:Lo/axq;

    invoke-virtual {v0}, Lo/axq;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 164
    const-string v0, "AssistantChatTextView"

    const-string v1, "AssistantChatTextView onClick"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/bef$4;->d:Lo/bef;

    iget-object v1, v1, Lo/bef;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v2, p0, Lo/bef$4;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    .line 166
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    iget-object v6, p0, Lo/bef$4;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lo/bef$4;->d:Lo/bef;

    iget-object v7, v7, Lo/bef;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C()Ljava/lang/String;

    move-result-object v8

    .line 165
    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;ILjava/lang/String;)V

    .line 167
    iget-object v0, p0, Lo/bef$4;->d:Lo/bef;

    iget-object v1, p0, Lo/bef$4;->c:Lo/axq;

    invoke-virtual {v0, v1}, Lo/bef;->c(Lo/axq;)V

    .line 170
    :cond_1
    :goto_0
    return-void
.end method
