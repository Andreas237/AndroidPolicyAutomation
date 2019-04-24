.class Lo/beo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/beo;

.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/beu;


# direct methods
.method constructor <init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lo/beo$1;->a:Lo/beo;

    iput-object p2, p0, Lo/beo$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/beo$1;->c:Lo/beu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 271
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 274
    iget-object v0, p0, Lo/beo$1;->a:Lo/beo;

    iget-object v1, p0, Lo/beo$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beo$1;->c:Lo/beu;

    invoke-static {v0, v1, v2}, Lo/beo;->c(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 276
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
