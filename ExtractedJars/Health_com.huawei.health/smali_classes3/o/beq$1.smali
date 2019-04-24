.class Lo/beq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beq;->c(Landroid/view/View;Lo/beq$e;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic b:Lo/beq;

.field final synthetic e:Lo/beq$e;


# direct methods
.method constructor <init>(Lo/beq;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beq$e;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lo/beq$1;->b:Lo/beq;

    iput-object p2, p0, Lo/beq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/beq$1;->e:Lo/beq$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 184
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 186
    iget-object v0, p0, Lo/beq$1;->b:Lo/beq;

    iget-object v0, v0, Lo/beq;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 188
    const/4 v0, 0x0

    return v0

    .line 193
    :cond_0
    iget-object v0, p0, Lo/beq$1;->b:Lo/beq;

    iget-object v1, p0, Lo/beq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beq$1;->e:Lo/beq$e;

    invoke-virtual {v0, v1, v2}, Lo/beq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 194
    const/4 v0, 0x1

    return v0

    .line 197
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
