.class Lo/dyt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyt;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lo/dyt;


# direct methods
.method constructor <init>(Lo/dyt;I)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/dyt$1;->d:Lo/dyt;

    iput p2, p0, Lo/dyt$1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 151
    iget v0, p0, Lo/dyt$1;->c:I

    iget-object v1, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v1}, Lo/dyt;->e(Lo/dyt;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 153
    iget-object v0, p0, Lo/dyt$1;->d:Lo/dyt;

    iget-object v1, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v1}, Lo/dyt;->c(Lo/dyt;)I

    move-result v1

    iget-object v2, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v2}, Lo/dyt;->e(Lo/dyt;)I

    move-result v2

    iget-object v3, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v3}, Lo/dyt;->b(Lo/dyt;)I

    move-result v3

    iget-object v4, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v4}, Lo/dyt;->a(Lo/dyt;)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dyt;->setPadding(IIII)V

    goto :goto_0

    .line 155
    :cond_0
    iget-object v0, p0, Lo/dyt$1;->d:Lo/dyt;

    iget-object v1, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v1}, Lo/dyt;->c(Lo/dyt;)I

    move-result v1

    iget v2, p0, Lo/dyt$1;->c:I

    iget-object v3, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v3}, Lo/dyt;->b(Lo/dyt;)I

    move-result v3

    iget-object v4, p0, Lo/dyt$1;->d:Lo/dyt;

    invoke-static {v4}, Lo/dyt;->a(Lo/dyt;)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dyt;->setPadding(IIII)V

    .line 157
    :goto_0
    return-void
.end method
