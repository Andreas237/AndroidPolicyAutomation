.class Lo/eqo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqo;-><init>(Landroid/view/View;Landroid/content/Context;ZLo/eqp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eqo;


# direct methods
.method constructor <init>(Lo/eqo;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/eqo$5;->b:Lo/eqo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 34
    invoke-static {p2}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/eqo$5;->b:Lo/eqo;

    invoke-static {v0}, Lo/eqo;->e(Lo/eqo;)Lo/eqp;

    move-result-object v0

    iget-object v1, p0, Lo/eqo$5;->b:Lo/eqo;

    invoke-interface {v0, v1}, Lo/eqp;->a(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 37
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
