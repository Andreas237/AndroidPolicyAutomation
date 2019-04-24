.class Lo/bee$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bee;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/axq;Landroid/view/View;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/axq;

.field final synthetic b:Lo/beu;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic d:Landroid/view/View;

.field final synthetic e:Lo/bee;


# direct methods
.method constructor <init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/axq;Landroid/view/View;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lo/bee$2;->e:Lo/bee;

    iput-object p2, p0, Lo/bee$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bee$2;->b:Lo/beu;

    iput-object p4, p0, Lo/bee$2;->a:Lo/axq;

    iput-object p5, p0, Lo/bee$2;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 354
    iget-object v0, p0, Lo/bee$2;->e:Lo/bee;

    iget-object v0, v0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 356
    iget-object v0, p0, Lo/bee$2;->e:Lo/bee;

    iget-object v1, p0, Lo/bee$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$2;->b:Lo/beu;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto :goto_0

    .line 360
    :cond_0
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->c()V

    .line 361
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    iget-object v1, p0, Lo/bee$2;->a:Lo/axq;

    invoke-virtual {v0, v1}, Lo/ape;->b(Lo/axq;)V

    .line 362
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    iget-object v1, p0, Lo/bee$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ape;->b(J)V

    .line 363
    iget-object v0, p0, Lo/bee$2;->e:Lo/bee;

    iget-object v1, p0, Lo/bee$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$2;->d:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    .line 365
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
