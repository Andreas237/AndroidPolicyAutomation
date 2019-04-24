.class Lo/fib$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fib$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/fib$c;


# direct methods
.method constructor <init>(Lo/fib$c;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lo/fib$c$a;->b:Lo/fib$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 491
    iget-object v0, p0, Lo/fib$c$a;->b:Lo/fib$c;

    iget-object v0, v0, Lo/fib$c;->c:Lo/fib;

    if-eqz v0, :cond_0

    .line 492
    iget-object v0, p0, Lo/fib$c$a;->b:Lo/fib$c;

    iget-object v0, v0, Lo/fib$c;->c:Lo/fib;

    invoke-virtual {v0}, Lo/fib;->dismiss()V

    .line 495
    :cond_0
    iget-object v0, p0, Lo/fib$c$a;->b:Lo/fib$c;

    invoke-static {v0}, Lo/fib$c;->b(Lo/fib$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 496
    iget-object v0, p0, Lo/fib$c$a;->b:Lo/fib$c;

    invoke-static {v0}, Lo/fib$c;->b(Lo/fib$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 498
    :cond_1
    return-void
.end method
