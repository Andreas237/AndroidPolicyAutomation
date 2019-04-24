.class public Lo/fer;
.super Landroid/widget/AdapterView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/AdapterView<Landroid/widget/ListAdapter;>;"
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/ListAdapter;

.field private b:I

.field protected c:Landroid/widget/Scroller;

.field protected d:I

.field protected e:I

.field private f:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private g:I

.field private h:I

.field private i:I

.field private k:Landroid/view/GestureDetector;

.field private l:Z

.field private m:Landroid/view/GestureDetector$OnGestureListener;

.field private n:Landroid/widget/AdapterView$OnItemClickListener;

.field private o:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private p:Landroid/widget/AdapterView$OnItemLongClickListener;

.field private r:Landroid/database/DataSetObserver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 123
    invoke-direct {p0, p1, p2}, Landroid/widget/AdapterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lo/fer;->b:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->g:I

    .line 26
    const v0, 0x7fffffff

    iput v0, p0, Lo/fer;->i:I

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->h:I

    .line 29
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fer;->f:Ljava/util/Queue;

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fer;->l:Z

    .line 34
    new-instance v0, Lo/fer$5;

    invoke-direct {v0, p0}, Lo/fer$5;-><init>(Lo/fer;)V

    iput-object v0, p0, Lo/fer;->m:Landroid/view/GestureDetector$OnGestureListener;

    .line 103
    new-instance v0, Lo/fer$3;

    invoke-direct {v0, p0}, Lo/fer$3;-><init>(Lo/fer;)V

    iput-object v0, p0, Lo/fer;->r:Landroid/database/DataSetObserver;

    .line 124
    invoke-direct {p0}, Lo/fer;->e()V

    .line 125
    return-void
.end method

.method static synthetic a(Lo/fer;)Landroid/widget/AdapterView$OnItemLongClickListener;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/fer;->p:Landroid/widget/AdapterView$OnItemLongClickListener;

    return-object v0
.end method

.method private declared-synchronized a()V
    .locals 1

    monitor-enter p0

    .line 182
    :try_start_0
    invoke-direct {p0}, Lo/fer;->e()V

    .line 183
    invoke-virtual {p0}, Lo/fer;->removeAllViewsInLayout()V

    .line 184
    invoke-virtual {p0}, Lo/fer;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a(I)V
    .locals 3

    .line 310
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 311
    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v0

    add-int/2addr v0, p1

    if-gtz v0, :cond_0

    .line 312
    iget v0, p0, Lo/fer;->h:I

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/fer;->h:I

    .line 313
    iget-object v0, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v0, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 314
    invoke-virtual {p0, v2}, Lo/fer;->removeViewInLayout(Landroid/view/View;)V

    .line 315
    iget v0, p0, Lo/fer;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fer;->b:I

    .line 316
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    .line 320
    :cond_0
    invoke-virtual {p0}, Lo/fer;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 321
    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0}, Lo/fer;->getWidth()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 322
    iget-object v0, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v0, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 323
    invoke-virtual {p0, v2}, Lo/fer;->removeViewInLayout(Landroid/view/View;)V

    .line 324
    iget v0, p0, Lo/fer;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fer;->g:I

    .line 325
    invoke-virtual {p0}, Lo/fer;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    .line 327
    :cond_1
    return-void
.end method

.method static synthetic b(Lo/fer;)Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/fer;->n:Landroid/widget/AdapterView$OnItemClickListener;

    return-object v0
.end method

.method private b(II)V
    .locals 4

    .line 269
    :goto_0
    add-int v0, p1, p2

    invoke-virtual {p0}, Lo/fer;->getWidth()I

    move-result v1

    if-ge v0, v1, :cond_4

    iget v0, p0, Lo/fer;->g:I

    iget-object v1, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 271
    iget-object v0, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 272
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget v1, p0, Lo/fer;->g:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    goto :goto_1

    .line 274
    :cond_0
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget v1, p0, Lo/fer;->g:I

    iget-object v2, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-interface {v0, v1, v2, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 276
    :goto_1
    if-eqz v3, :cond_1

    .line 277
    const/4 v0, -0x1

    invoke-direct {p0, v3, v0}, Lo/fer;->e(Landroid/view/View;I)V

    .line 278
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr p1, v0

    .line 280
    :cond_1
    iget v0, p0, Lo/fer;->g:I

    iget-object v1, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 281
    iget v0, p0, Lo/fer;->e:I

    add-int/2addr v0, p1

    invoke-virtual {p0}, Lo/fer;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/fer;->i:I

    .line 284
    :cond_2
    iget v0, p0, Lo/fer;->i:I

    if-gez v0, :cond_3

    .line 285
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->i:I

    .line 287
    :cond_3
    iget v0, p0, Lo/fer;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fer;->g:I

    .line 288
    goto/16 :goto_0

    .line 290
    :cond_4
    return-void
.end method

.method static synthetic c(Lo/fer;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/fer;->b:I

    return v0
.end method

.method private c(I)V
    .locals 7

    .line 330
    invoke-virtual {p0}, Lo/fer;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 331
    iget v0, p0, Lo/fer;->h:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/fer;->h:I

    .line 332
    iget v3, p0, Lo/fer;->h:I

    .line 333
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/fer;->getChildCount()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 334
    invoke-virtual {p0, v4}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 335
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 336
    add-int v0, v3, v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v5, v3, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 337
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v6

    add-int/2addr v3, v0

    .line 333
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 340
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/fer;)Landroid/widget/AdapterView$OnItemSelectedListener;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/fer;->o:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 176
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget-object v1, p0, Lo/fer;->r:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 179
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-virtual {p0}, Lo/fer;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 253
    if-eqz v3, :cond_0

    .line 254
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v2

    .line 256
    :cond_0
    invoke-direct {p0, v2, p1}, Lo/fer;->b(II)V

    .line 258
    const/4 v2, 0x0

    .line 259
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fer;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 260
    if-eqz v3, :cond_1

    .line 261
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 263
    :cond_1
    invoke-direct {p0, v2, p1}, Lo/fer;->e(II)V

    .line 266
    return-void
.end method

.method static synthetic d(Lo/fer;Z)Z
    .locals 0

    .line 18
    iput-boolean p1, p0, Lo/fer;->l:Z

    return p1
.end method

.method private declared-synchronized e()V
    .locals 4

    monitor-enter p0

    .line 128
    const/4 v0, -0x1

    :try_start_0
    iput v0, p0, Lo/fer;->b:I

    .line 129
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->g:I

    .line 130
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->h:I

    .line 131
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->e:I

    .line 132
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->d:I

    .line 133
    const v0, 0x7fffffff

    iput v0, p0, Lo/fer;->i:I

    .line 134
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/fer;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    .line 135
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Lo/fer;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/fer;->m:Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/fer;->k:Landroid/view/GestureDetector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method private e(II)V
    .locals 4

    .line 293
    :goto_0
    add-int v0, p1, p2

    if-lez v0, :cond_2

    iget v0, p0, Lo/fer;->b:I

    if-ltz v0, :cond_2

    .line 295
    iget-object v0, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 296
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget v1, p0, Lo/fer;->b:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    goto :goto_1

    .line 298
    :cond_0
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget v1, p0, Lo/fer;->b:I

    iget-object v2, p0, Lo/fer;->f:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-interface {v0, v1, v2, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 300
    :goto_1
    if-eqz v3, :cond_1

    .line 301
    const/4 v0, 0x0

    invoke-direct {p0, v3, v0}, Lo/fer;->e(Landroid/view/View;I)V

    .line 302
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    .line 303
    iget v0, p0, Lo/fer;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fer;->b:I

    .line 304
    iget v0, p0, Lo/fer;->h:I

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/fer;->h:I

    .line 306
    :cond_1
    goto :goto_0

    .line 307
    :cond_2
    return-void
.end method

.method private e(Landroid/view/View;I)V
    .locals 4

    .line 188
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 189
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 190
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v3, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 192
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v3, v0}, Lo/fer;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 193
    invoke-virtual {p0}, Lo/fer;->getWidth()I

    move-result v0

    const/high16 v1, -0x80000000

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0}, Lo/fer;->getHeight()I

    move-result v1

    const/high16 v2, -0x80000000

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    .line 194
    return-void
.end method

.method static synthetic e(Lo/fer;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/fer;->a()V

    return-void
.end method


# virtual methods
.method protected b(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .line 352
    move-object v9, p0

    monitor-enter v9

    .line 353
    :try_start_0
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    iget v1, p0, Lo/fer;->d:I

    neg-float v2, p3

    float-to-int v3, v2

    iget v6, p0, Lo/fer;->i:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v9

    throw v10

    .line 355
    :goto_0
    invoke-virtual {p0}, Lo/fer;->requestLayout()V

    .line 357
    const/4 v0, 0x1

    return v0
.end method

.method protected d(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 361
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 362
    const/4 v0, 0x1

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 345
    invoke-super {p0, p1}, Landroid/widget/AdapterView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 346
    iget-object v0, p0, Lo/fer;->k:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    or-int/2addr v1, v0

    .line 347
    return v1
.end method

.method public bridge synthetic getAdapter()Landroid/widget/Adapter;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lo/fer;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 155
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public getSelectedView()Landroid/view/View;
    .locals 1

    .line 168
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 202
    invoke-super/range {p0 .. p5}, Landroid/widget/AdapterView;->onLayout(ZIIII)V

    .line 207
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    .line 208
    return-void

    .line 210
    :cond_0
    iget-boolean v0, p0, Lo/fer;->l:Z

    if-eqz v0, :cond_1

    .line 211
    iget v2, p0, Lo/fer;->e:I

    .line 212
    invoke-direct {p0}, Lo/fer;->e()V

    .line 213
    invoke-virtual {p0}, Lo/fer;->removeAllViewsInLayout()V

    .line 214
    iput v2, p0, Lo/fer;->d:I

    .line 215
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fer;->l:Z

    .line 217
    :cond_1
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 218
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    .line 219
    iput v2, p0, Lo/fer;->d:I

    .line 222
    :cond_2
    iget v0, p0, Lo/fer;->d:I

    if-gtz v0, :cond_3

    .line 223
    const/4 v0, 0x0

    iput v0, p0, Lo/fer;->d:I

    .line 224
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 226
    :cond_3
    iget v0, p0, Lo/fer;->d:I

    iget v1, p0, Lo/fer;->i:I

    if-lt v0, v1, :cond_4

    .line 227
    iget v0, p0, Lo/fer;->i:I

    iput v0, p0, Lo/fer;->d:I

    .line 228
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 231
    :cond_4
    iget v0, p0, Lo/fer;->e:I

    iget v1, p0, Lo/fer;->d:I

    sub-int v2, v0, v1

    .line 233
    invoke-direct {p0, v2}, Lo/fer;->a(I)V

    .line 234
    invoke-direct {p0, v2}, Lo/fer;->d(I)V

    .line 235
    invoke-direct {p0, v2}, Lo/fer;->c(I)V

    .line 237
    iget v0, p0, Lo/fer;->d:I

    iput v0, p0, Lo/fer;->e:I

    .line 239
    iget-object v0, p0, Lo/fer;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_5

    .line 240
    new-instance v0, Lo/fer$4;

    invoke-direct {v0, p0}, Lo/fer$4;-><init>(Lo/fer;)V

    invoke-virtual {p0, v0}, Lo/fer;->post(Ljava/lang/Runnable;)Z

    .line 248
    :cond_5
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 1

    .line 18
    move-object v0, p1

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-virtual {p0, v0}, Lo/fer;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 160
    invoke-direct {p0}, Lo/fer;->d()V

    .line 161
    iput-object p1, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    .line 162
    iget-object v0, p0, Lo/fer;->a:Landroid/widget/ListAdapter;

    iget-object v1, p0, Lo/fer;->r:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 163
    invoke-direct {p0}, Lo/fer;->a()V

    .line 164
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/fer;->n:Landroid/widget/AdapterView$OnItemClickListener;

    .line 146
    return-void
.end method

.method public setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lo/fer;->p:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 151
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/fer;->o:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 141
    return-void
.end method

.method public setSelection(I)V
    .locals 0

    .line 173
    return-void
.end method
