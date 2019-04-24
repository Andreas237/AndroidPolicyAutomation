.class Lo/fes$e;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/fes;


# direct methods
.method private constructor <init>(Lo/fes;)V
    .locals 0

    .line 528
    iput-object p1, p0, Lo/fes$e;->b:Lo/fes;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fes;Lo/fes$4;)V
    .locals 0

    .line 528
    invoke-direct {p0, p1}, Lo/fes$e;-><init>(Lo/fes;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 531
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 538
    iget-object v0, p0, Lo/fes$e;->b:Lo/fes;

    invoke-static {v0}, Lo/fes;->b(Lo/fes;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 539
    iget-object v0, p0, Lo/fes$e;->b:Lo/fes;

    invoke-static {v0}, Lo/fes;->d(Lo/fes;)V

    .line 540
    iget-object v0, p0, Lo/fes$e;->b:Lo/fes;

    invoke-static {v0}, Lo/fes;->a(Lo/fes;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 541
    iget-object v0, p0, Lo/fes$e;->b:Lo/fes;

    iget-object v1, p0, Lo/fes$e;->b:Lo/fes;

    invoke-static {v1}, Lo/fes;->c(Lo/fes;)F

    move-result v1

    invoke-static {v0, v1, p3}, Lo/fes;->c(Lo/fes;FF)V

    goto :goto_0

    .line 543
    :cond_0
    iget-object v0, p0, Lo/fes$e;->b:Lo/fes;

    iget-object v1, p0, Lo/fes$e;->b:Lo/fes;

    invoke-static {v1}, Lo/fes;->c(Lo/fes;)F

    move-result v1

    invoke-static {v0, v1, p4}, Lo/fes;->c(Lo/fes;FF)V

    .line 547
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
