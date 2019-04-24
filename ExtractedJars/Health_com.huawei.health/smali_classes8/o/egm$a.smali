.class Lo/egm$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/egm;


# direct methods
.method private constructor <init>(Lo/egm;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lo/egm$a;->c:Lo/egm;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/egm;Lo/egm$4;)V
    .locals 0

    .line 445
    invoke-direct {p0, p1}, Lo/egm$a;-><init>(Lo/egm;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 448
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 455
    iget-object v0, p0, Lo/egm$a;->c:Lo/egm;

    invoke-static {v0}, Lo/egm;->b(Lo/egm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/egm$a;->c:Lo/egm;

    invoke-virtual {v0}, Lo/egm;->a()V

    .line 457
    iget-object v0, p0, Lo/egm$a;->c:Lo/egm;

    iget-object v1, p0, Lo/egm$a;->c:Lo/egm;

    invoke-static {v1}, Lo/egm;->c(Lo/egm;)F

    move-result v1

    invoke-static {v0, v1, p4}, Lo/egm;->a(Lo/egm;FF)V

    .line 459
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
