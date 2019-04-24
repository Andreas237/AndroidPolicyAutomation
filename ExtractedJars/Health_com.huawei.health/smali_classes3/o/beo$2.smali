.class Lo/beo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic d:Lo/beu;

.field final synthetic e:Lo/beo;


# direct methods
.method constructor <init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 0

    .line 461
    iput-object p1, p0, Lo/beo$2;->e:Lo/beo;

    iput-object p2, p0, Lo/beo$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/beo$2;->a:Landroid/view/View;

    iput-object p4, p0, Lo/beo$2;->d:Lo/beu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 465
    iget-object v0, p0, Lo/beo$2;->e:Lo/beo;

    iget-object v0, v0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lo/beo$2;->e:Lo/beo;

    iget-object v1, p0, Lo/beo$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beo$2;->a:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    goto :goto_0

    .line 469
    :cond_0
    iget-object v0, p0, Lo/beo$2;->e:Lo/beo;

    iget-object v1, p0, Lo/beo$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beo$2;->d:Lo/beu;

    invoke-virtual {v0, v1, v2}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 471
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
