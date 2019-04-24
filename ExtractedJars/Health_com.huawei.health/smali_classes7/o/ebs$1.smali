.class Lo/ebs$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebs;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ebs;


# direct methods
.method constructor <init>(Lo/ebs;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/ebs$1;->b:Lo/ebs;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 77
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    invoke-static {v0}, Lo/ebs;->d(Lo/ebs;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 78
    const/4 v0, 0x1

    return v0

    .line 80
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 82
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    invoke-virtual {v0}, Lo/ebs;->getScale()F

    move-result v0

    iget-object v1, p0, Lo/ebs$1;->b:Lo/ebs;

    invoke-static {v1}, Lo/ebs;->b(Lo/ebs;)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 83
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    new-instance v1, Lo/ebs$d;

    iget-object v2, p0, Lo/ebs$1;->b:Lo/ebs;

    iget-object v3, p0, Lo/ebs$1;->b:Lo/ebs;

    .line 84
    invoke-static {v3}, Lo/ebs;->b(Lo/ebs;)F

    move-result v3

    invoke-direct {v1, v2, v3, v4, v5}, Lo/ebs$d;-><init>(Lo/ebs;FFF)V

    .line 83
    const-wide/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v3}, Lo/ebs;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 85
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ebs;->c(Lo/ebs;Z)Z

    goto :goto_0

    .line 87
    :cond_1
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    new-instance v1, Lo/ebs$d;

    iget-object v2, p0, Lo/ebs$1;->b:Lo/ebs;

    iget-object v3, p0, Lo/ebs$1;->b:Lo/ebs;

    .line 88
    invoke-static {v3}, Lo/ebs;->c(Lo/ebs;)F

    move-result v3

    invoke-direct {v1, v2, v3, v4, v5}, Lo/ebs$d;-><init>(Lo/ebs;FFF)V

    .line 87
    const-wide/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v3}, Lo/ebs;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    iget-object v0, p0, Lo/ebs$1;->b:Lo/ebs;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ebs;->c(Lo/ebs;Z)Z

    .line 92
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
