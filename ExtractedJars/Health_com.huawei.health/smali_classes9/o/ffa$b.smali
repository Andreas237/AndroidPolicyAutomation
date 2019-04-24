.class Lo/ffa$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ffa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/ffa;


# direct methods
.method private constructor <init>(Lo/ffa;)V
    .locals 0

    .line 459
    iput-object p1, p0, Lo/ffa$b;->d:Lo/ffa;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ffa;Lo/ffa$4;)V
    .locals 0

    .line 459
    invoke-direct {p0, p1}, Lo/ffa$b;-><init>(Lo/ffa;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 462
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 469
    iget-object v0, p0, Lo/ffa$b;->d:Lo/ffa;

    invoke-static {v0}, Lo/ffa;->c(Lo/ffa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 470
    iget-object v0, p0, Lo/ffa$b;->d:Lo/ffa;

    invoke-virtual {v0}, Lo/ffa;->a()V

    .line 471
    iget-object v0, p0, Lo/ffa$b;->d:Lo/ffa;

    iget-object v1, p0, Lo/ffa$b;->d:Lo/ffa;

    invoke-static {v1}, Lo/ffa;->e(Lo/ffa;)F

    move-result v1

    invoke-static {v0, v1, p4}, Lo/ffa;->e(Lo/ffa;FF)V

    .line 473
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
