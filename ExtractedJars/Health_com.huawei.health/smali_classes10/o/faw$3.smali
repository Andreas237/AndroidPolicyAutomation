.class Lo/faw$3;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/faw;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/faw;


# direct methods
.method constructor <init>(Lo/faw;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/faw$3;->c:Lo/faw;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    .line 42
    iget-object v0, p0, Lo/faw$3;->c:Lo/faw;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/faw;->d(Lo/faw;Z)Z

    .line 43
    return-void
.end method
