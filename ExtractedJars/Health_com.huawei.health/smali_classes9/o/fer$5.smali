.class Lo/fer$5;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fer;


# direct methods
.method constructor <init>(Lo/fer;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/fer$5;->a:Lo/fer;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method private c(Landroid/view/MotionEvent;Landroid/view/View;)Z
    .locals 8

    .line 92
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 93
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 94
    invoke-virtual {p2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 95
    const/4 v0, 0x0

    aget v4, v3, v0

    .line 96
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int v5, v4, v0

    .line 97
    const/4 v0, 0x1

    aget v6, v3, v0

    .line 98
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int v7, v6, v0

    .line 99
    invoke-virtual {v2, v4, v6, v5, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 52
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0, p1}, Lo/fer;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 88
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/fer;->b(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 10

    .line 37
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->getChildCount()I

    move-result v7

    .line 38
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    .line 39
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0, v8}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 40
    invoke-direct {p0, p1, v9}, Lo/fer$5;->c(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->a(Lo/fer;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 42
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->a(Lo/fer;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    iget-object v1, p0, Lo/fer$5;->a:Lo/fer;

    move-object v2, v9

    iget-object v3, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v3}, Lo/fer;->c(Lo/fer;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v8

    iget-object v4, p0, Lo/fer$5;->a:Lo/fer;

    iget-object v4, v4, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget-object v5, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v5}, Lo/fer;->c(Lo/fer;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v8

    invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .line 59
    iget-object v3, p0, Lo/fer$5;->a:Lo/fer;

    monitor-enter v3

    .line 60
    :try_start_0
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    iget v1, v0, Lo/fer;->d:I

    float-to-int v2, p3

    add-int/2addr v1, v2

    iput v1, v0, Lo/fer;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 62
    :goto_0
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->requestLayout()V

    .line 64
    const/4 v0, 0x1

    return v0
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 69
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->getChildCount()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 70
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-virtual {v0, v7}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 71
    invoke-direct {p0, p1, v8}, Lo/fer$5;->c(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->b(Lo/fer;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->b(Lo/fer;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    iget-object v1, p0, Lo/fer$5;->a:Lo/fer;

    move-object v2, v8

    iget-object v3, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v3}, Lo/fer;->c(Lo/fer;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v7

    iget-object v4, p0, Lo/fer$5;->a:Lo/fer;

    iget-object v4, v4, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget-object v5, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v5}, Lo/fer;->c(Lo/fer;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v7

    invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 75
    :cond_0
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->d(Lo/fer;)Landroid/widget/AdapterView$OnItemSelectedListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 76
    iget-object v0, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v0}, Lo/fer;->d(Lo/fer;)Landroid/widget/AdapterView$OnItemSelectedListener;

    move-result-object v0

    iget-object v1, p0, Lo/fer$5;->a:Lo/fer;

    move-object v2, v8

    iget-object v3, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v3}, Lo/fer;->c(Lo/fer;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v7

    iget-object v4, p0, Lo/fer$5;->a:Lo/fer;

    iget-object v4, v4, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget-object v5, p0, Lo/fer$5;->a:Lo/fer;

    invoke-static {v5}, Lo/fer;->c(Lo/fer;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v7

    invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    goto :goto_1

    .line 69
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 82
    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
