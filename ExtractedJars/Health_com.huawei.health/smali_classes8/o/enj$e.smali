.class Lo/enj$e;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/enj;


# direct methods
.method private constructor <init>(Lo/enj;)V
    .locals 0

    .line 444
    iput-object p1, p0, Lo/enj$e;->d:Lo/enj;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/enj;Lo/enj$5;)V
    .locals 0

    .line 444
    invoke-direct {p0, p1}, Lo/enj$e;-><init>(Lo/enj;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 447
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 454
    iget-object v0, p0, Lo/enj$e;->d:Lo/enj;

    invoke-static {v0}, Lo/enj;->b(Lo/enj;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    iget-object v0, p0, Lo/enj$e;->d:Lo/enj;

    invoke-virtual {v0}, Lo/enj;->a()V

    .line 456
    iget-object v0, p0, Lo/enj$e;->d:Lo/enj;

    iget-object v1, p0, Lo/enj$e;->d:Lo/enj;

    invoke-static {v1}, Lo/enj;->d(Lo/enj;)F

    move-result v1

    invoke-static {v0, v1, p4}, Lo/enj;->a(Lo/enj;FF)V

    .line 458
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
