.class Lo/bee$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bee;->d(Landroid/view/View;Lo/axq;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic b:Lo/axq;

.field final synthetic c:Lo/bee;

.field final synthetic d:Lo/beu;


# direct methods
.method constructor <init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/axq;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lo/bee$3;->c:Lo/bee;

    iput-object p2, p0, Lo/bee$3;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bee$3;->d:Lo/beu;

    iput-object p4, p0, Lo/bee$3;->b:Lo/axq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 291
    iget-object v0, p0, Lo/bee$3;->c:Lo/bee;

    iget-object v0, v0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 293
    iget-object v0, p0, Lo/bee$3;->c:Lo/bee;

    iget-object v1, p0, Lo/bee$3;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$3;->d:Lo/beu;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto :goto_0

    .line 298
    :cond_0
    const-string v0, "AssistantChatHeadLineView"

    const-string v1, "AssistantChatHeadLineView HeadLine onClick"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/bee$3;->c:Lo/bee;

    iget-object v1, v1, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v2, p0, Lo/bee$3;->c:Lo/bee;

    invoke-static {v2}, Lo/bee;->b(Lo/bee;)J

    move-result-wide v2

    iget-object v4, p0, Lo/bee$3;->c:Lo/bee;

    invoke-static {v4}, Lo/bee;->e(Lo/bee;)J

    move-result-wide v4

    iget-object v6, p0, Lo/bee$3;->c:Lo/bee;

    invoke-static {v6}, Lo/bee;->c(Lo/bee;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lo/bee$3;->c:Lo/bee;

    iget-object v7, v7, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C()Ljava/lang/String;

    move-result-object v8

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;ILjava/lang/String;)V

    .line 300
    iget-object v0, p0, Lo/bee$3;->c:Lo/bee;

    iget-object v1, p0, Lo/bee$3;->b:Lo/axq;

    invoke-virtual {v0, v1}, Lo/bee;->c(Lo/axq;)V

    .line 302
    :goto_0
    return-void
.end method
