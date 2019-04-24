.class Lo/fgh$e;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fgh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lo/fgh;


# direct methods
.method private constructor <init>(Lo/fgh;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lo/fgh$e;->e:Lo/fgh;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fgh;Lo/fgh$2;)V
    .locals 0

    .line 440
    invoke-direct {p0, p1}, Lo/fgh$e;-><init>(Lo/fgh;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 443
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 450
    iget-object v0, p0, Lo/fgh$e;->e:Lo/fgh;

    invoke-static {v0}, Lo/fgh;->d(Lo/fgh;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lo/fgh$e;->e:Lo/fgh;

    invoke-virtual {v0}, Lo/fgh;->d()V

    .line 452
    iget-object v0, p0, Lo/fgh$e;->e:Lo/fgh;

    iget-object v1, p0, Lo/fgh$e;->e:Lo/fgh;

    invoke-static {v1}, Lo/fgh;->b(Lo/fgh;)F

    move-result v1

    invoke-static {v0, v1, p4}, Lo/fgh;->a(Lo/fgh;FF)V

    .line 454
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
