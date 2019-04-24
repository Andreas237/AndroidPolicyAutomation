.class Lo/ekw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekw;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ekw;

.field final synthetic e:Landroid/view/GestureDetector;


# direct methods
.method constructor <init>(Lo/ekw;Landroid/view/GestureDetector;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/ekw$2;->d:Lo/ekw;

    iput-object p2, p0, Lo/ekw$2;->e:Landroid/view/GestureDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 166
    iget-object v0, p0, Lo/ekw$2;->d:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->b(Lo/ekw;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/ekw$2;->e:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 168
    const/4 v0, 0x1

    return v0

    .line 170
    :cond_0
    iget-object v0, p0, Lo/ekw$2;->d:Lo/ekw;

    invoke-virtual {v0, p2}, Lo/ekw;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
