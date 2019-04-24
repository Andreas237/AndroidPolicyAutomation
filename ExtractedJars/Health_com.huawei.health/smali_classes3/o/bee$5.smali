.class Lo/bee$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bee;->c(Landroid/widget/ListView;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bee$e;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/beu;

.field final synthetic b:Landroid/widget/ListView;

.field final synthetic c:Lo/bee$e;

.field final synthetic d:Lo/bee;

.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/bee$e;Landroid/widget/ListView;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lo/bee$5;->d:Lo/bee;

    iput-object p2, p0, Lo/bee$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bee$5;->a:Lo/beu;

    iput-object p4, p0, Lo/bee$5;->c:Lo/bee$e;

    iput-object p5, p0, Lo/bee$5;->b:Landroid/widget/ListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lo/bee$5;->d:Lo/bee;

    iget-object v0, v0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 324
    iget-object v0, p0, Lo/bee$5;->d:Lo/bee;

    iget-object v1, p0, Lo/bee$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$5;->a:Lo/beu;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto :goto_0

    .line 328
    :cond_0
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->c()V

    .line 329
    iget-object v0, p0, Lo/bee$5;->c:Lo/bee$e;

    invoke-virtual {v0, p3}, Lo/bee$e;->d(I)Lo/axq;

    move-result-object v3

    .line 330
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/ape;->b(Lo/axq;)V

    .line 331
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    iget-object v1, p0, Lo/bee$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ape;->b(J)V

    .line 332
    iget-object v0, p0, Lo/bee$5;->d:Lo/bee;

    iget-object v1, p0, Lo/bee$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$5;->b:Landroid/widget/ListView;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    .line 334
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
