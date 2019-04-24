.class Lo/ber$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ber;->d(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lo/beu;

.field final synthetic c:Lo/ber;

.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 0

    .line 206
    iput-object p1, p0, Lo/ber$1;->c:Lo/ber;

    iput-object p2, p0, Lo/ber$1;->b:Lo/beu;

    iput-object p3, p0, Lo/ber$1;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-boolean p4, p0, Lo/ber$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 211
    iget-object v0, p0, Lo/ber$1;->b:Lo/beu;

    iget-object v0, v0, Lo/beu;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lo/ber$1;->c:Lo/ber;

    iget-object v1, p0, Lo/ber$1;->b:Lo/beu;

    iget-object v1, v1, Lo/beu;->l:Landroid/widget/ProgressBar;

    invoke-static {v0, v1}, Lo/ber;->a(Lo/ber;Landroid/widget/ProgressBar;)V

    .line 214
    iget-object v0, p0, Lo/ber$1;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-boolean v1, p0, Lo/ber$1;->a:Z

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 215
    iget-object v0, p0, Lo/ber$1;->c:Lo/ber;

    iget-object v1, p0, Lo/ber$1;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/ber;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 216
    return-void
.end method

.method public d()V
    .locals 0

    .line 220
    return-void
.end method
