.class Lo/fba$4;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fba;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fba;


# direct methods
.method constructor <init>(Lo/fba;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lo/fba$4;->c:Lo/fba;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 4

    .line 36
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGestureDetector onLongPress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lo/fba$4;->c:Lo/fba;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fba;->e(Lo/fba;Z)Z

    .line 38
    return-void
.end method
