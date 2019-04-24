.class Lo/bet$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bet;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic b:Lo/bet$d;

.field final synthetic e:Lo/bet;


# direct methods
.method constructor <init>(Lo/bet;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lo/bet$4;->e:Lo/bet;

    iput-object p2, p0, Lo/bet$4;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bet$4;->b:Lo/bet$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 224
    iget-object v0, p0, Lo/bet$4;->e:Lo/bet;

    iget-object v0, v0, Lo/bet;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Lo/bet$4;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v3

    .line 227
    new-instance v4, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;-><init>()V

    .line 228
    invoke-virtual {v4, v3}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->parseJson(Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lo/bet$4;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v5

    .line 231
    iget-object v0, p0, Lo/bet$4;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 233
    iget-object v0, p0, Lo/bet$4;->e:Lo/bet;

    invoke-static {v0, v5, v4}, Lo/bet;->b(Lo/bet;ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V

    goto :goto_0

    .line 237
    :cond_0
    iget-object v0, p0, Lo/bet$4;->e:Lo/bet;

    invoke-static {v0, v5, v4}, Lo/bet;->a(Lo/bet;ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V

    .line 239
    :goto_0
    goto :goto_1

    .line 242
    :cond_1
    iget-object v0, p0, Lo/bet$4;->e:Lo/bet;

    iget-object v1, p0, Lo/bet$4;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bet$4;->b:Lo/bet$d;

    invoke-virtual {v0, v1, v2}, Lo/bet;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 244
    :goto_1
    return-void
.end method
