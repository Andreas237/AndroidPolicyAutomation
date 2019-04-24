.class public Lo/byy;
.super Lo/elm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/byy$d;,
        Lo/byy$e;
    }
.end annotation


# instance fields
.field a:Lo/byy$d;

.field private final b:Landroid/graphics/Rect;

.field c:Lo/byy$d;

.field d:Landroid/widget/AbsListView$OnScrollListener;

.field e:I

.field private f:Landroid/view/View;

.field private final g:Landroid/graphics/PointF;

.field private h:Landroid/graphics/drawable/GradientDrawable;

.field private i:I

.field private k:Landroid/view/MotionEvent;

.field private final l:Landroid/widget/AbsListView$OnScrollListener;

.field private m:I

.field private final n:Landroid/database/DataSetObserver;

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 83
    invoke-direct {p0, p1, p2}, Lo/elm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    .line 53
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/byy;->g:Landroid/graphics/PointF;

    .line 68
    new-instance v0, Lo/byy$1;

    invoke-direct {v0, p0}, Lo/byy$1;-><init>(Lo/byy;)V

    iput-object v0, p0, Lo/byy;->n:Landroid/database/DataSetObserver;

    .line 113
    new-instance v0, Lo/byy$4;

    invoke-direct {v0, p0}, Lo/byy$4;-><init>(Lo/byy;)V

    iput-object v0, p0, Lo/byy;->l:Landroid/widget/AbsListView$OnScrollListener;

    .line 84
    invoke-direct {p0}, Lo/byy;->b()V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 88
    invoke-direct {p0, p1, p2, p3}, Lo/elm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    .line 53
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/byy;->g:Landroid/graphics/PointF;

    .line 68
    new-instance v0, Lo/byy$1;

    invoke-direct {v0, p0}, Lo/byy$1;-><init>(Lo/byy;)V

    iput-object v0, p0, Lo/byy;->n:Landroid/database/DataSetObserver;

    .line 113
    new-instance v0, Lo/byy$4;

    invoke-direct {v0, p0}, Lo/byy$4;-><init>(Lo/byy;)V

    iput-object v0, p0, Lo/byy;->l:Landroid/widget/AbsListView$OnScrollListener;

    .line 89
    invoke-direct {p0}, Lo/byy;->b()V

    .line 90
    return-void
.end method

.method private b()V
    .locals 1

    .line 93
    iget-object v0, p0, Lo/byy;->l:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lo/byy;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 94
    invoke-virtual {p0}, Lo/byy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lo/byy;->i:I

    .line 95
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/byy;->c(Z)V

    .line 96
    return-void
.end method

.method public static b(Landroid/widget/ListAdapter;I)Z
    .locals 1

    .line 443
    instance-of v0, p0, Landroid/widget/HeaderViewListAdapter;

    if-eqz v0, :cond_0

    .line 444
    move-object v0, p0

    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p0

    .line 446
    :cond_0
    move-object v0, p0

    check-cast v0, Lo/byy$e;

    invoke-interface {v0, p1}, Lo/byy$e;->e(I)Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 1

    .line 372
    const/4 v0, 0x0

    iput-object v0, p0, Lo/byy;->f:Landroid/view/View;

    .line 373
    iget-object v0, p0, Lo/byy;->k:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lo/byy;->k:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 375
    const/4 v0, 0x0

    iput-object v0, p0, Lo/byy;->k:Landroid/view/MotionEvent;

    .line 377
    :cond_0
    return-void
.end method

.method private e(Landroid/view/View;FF)Z
    .locals 4

    .line 359
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 363
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lo/byy;->e:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 365
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Lo/byy;->e:I

    invoke-virtual {p0}, Lo/byy;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 366
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Lo/byy;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 367
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Lo/byy;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 368
    iget-object v0, p0, Lo/byy;->b:Landroid/graphics/Rect;

    float-to-int v1, p2

    float-to-int v2, p3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method private i()Z
    .locals 8

    .line 380
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-nez v0, :cond_0

    .line 381
    const/4 v0, 0x0

    return v0

    .line 383
    :cond_0
    invoke-virtual {p0}, Lo/byy;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v6

    .line 384
    if-eqz v6, :cond_2

    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    iget-object v1, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v1}, Lo/byy$d;->a(Lo/byy$d;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 385
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v7

    .line 386
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byy;->playSoundEffect(I)V

    .line 387
    if-eqz v7, :cond_1

    .line 388
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 389
    move-object v0, v6

    move-object v1, p0

    move-object v2, v7

    iget-object v3, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v3}, Lo/byy$d;->a(Lo/byy$d;)I

    move-result v3

    iget-object v4, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v4}, Lo/byy$d;->d(Lo/byy$d;)J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 391
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 393
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method a(II)I
    .locals 6

    .line 253
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 255
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v2

    .line 256
    invoke-virtual {p0}, Lo/byy;->getLastVisiblePosition()I

    move-result v0

    if-lt v0, v2, :cond_0

    .line 257
    const/4 v0, -0x1

    return v0

    .line 259
    :cond_0
    add-int v0, p1, p2

    if-lt v0, v2, :cond_1

    .line 260
    sub-int p2, v2, p1

    .line 263
    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_3

    .line 264
    add-int v4, p1, v3

    .line 265
    invoke-interface {v1, v4}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v5

    .line 266
    invoke-static {v1, v5}, Lo/byy;->b(Landroid/widget/ListAdapter;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 267
    return v4

    .line 263
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 269
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method b(I)I
    .locals 6

    .line 282
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 284
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 285
    const/4 v0, -0x1

    return v0

    .line 287
    :cond_0
    instance-of v0, v1, Landroid/widget/SectionIndexer;

    if-eqz v0, :cond_1

    .line 289
    move-object v2, v1

    check-cast v2, Landroid/widget/SectionIndexer;

    .line 290
    invoke-interface {v2, p1}, Landroid/widget/SectionIndexer;->getSectionForPosition(I)I

    move-result v3

    .line 291
    invoke-interface {v2, v3}, Landroid/widget/SectionIndexer;->getPositionForSection(I)I

    move-result v4

    .line 292
    invoke-interface {v1, v4}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v5

    .line 293
    invoke-static {v1, v5}, Lo/byy;->b(Landroid/widget/ListAdapter;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    return v4

    .line 299
    :cond_1
    move v2, p1

    :goto_0
    if-ltz v2, :cond_3

    .line 300
    invoke-interface {v1, v2}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v3

    .line 301
    invoke-static {v1, v3}, Lo/byy;->b(Landroid/widget/ListAdapter;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 302
    return v2

    .line 299
    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 304
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method b(III)V
    .locals 6

    .line 166
    const/4 v0, 0x2

    if-ge p3, v0, :cond_0

    .line 167
    invoke-virtual {p0}, Lo/byy;->c()V

    .line 168
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    .line 172
    invoke-static {v0}, Lo/byy$d;->a(Lo/byy$d;)I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 173
    invoke-virtual {p0}, Lo/byy;->c()V

    .line 176
    :cond_1
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-nez v0, :cond_2

    .line 177
    invoke-virtual {p0, p1}, Lo/byy;->d(I)V

    .line 180
    :cond_2
    add-int/lit8 v2, p1, 0x1

    .line 181
    invoke-virtual {p0}, Lo/byy;->getCount()I

    move-result v0

    if-ge v2, v0, :cond_6

    .line 182
    sub-int v0, v2, p2

    sub-int v0, p3, v0

    invoke-virtual {p0, v2, v0}, Lo/byy;->a(II)I

    move-result v3

    .line 184
    const/4 v0, -0x1

    if-le v3, v0, :cond_5

    .line 185
    sub-int v0, v3, p2

    invoke-virtual {p0, v0}, Lo/byy;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 186
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 187
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lo/byy;->getPaddingTop()I

    move-result v1

    add-int v5, v0, v1

    .line 188
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v0

    sub-int/2addr v0, v5

    iput v0, p0, Lo/byy;->m:I

    .line 189
    iget v0, p0, Lo/byy;->m:I

    if-gez v0, :cond_3

    .line 190
    iget v0, p0, Lo/byy;->m:I

    iput v0, p0, Lo/byy;->e:I

    goto :goto_0

    .line 192
    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lo/byy;->e:I

    .line 195
    :cond_4
    :goto_0
    goto :goto_1

    .line 196
    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Lo/byy;->e:I

    .line 197
    const v0, 0x7fffffff

    iput v0, p0, Lo/byy;->m:I

    .line 201
    :cond_6
    :goto_1
    return-void
.end method

.method c()V
    .locals 1

    .line 159
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    iput-object v0, p0, Lo/byy;->c:Lo/byy$d;

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lo/byy;->a:Lo/byy$d;

    .line 163
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 99
    if-eqz p1, :cond_0

    .line 100
    iget-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    if-nez v0, :cond_1

    .line 101
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v2, 0x3

    new-array v2, v2, [I

    const-string v3, "#ffa0a0a0"

    .line 102
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const-string v3, "#50a0a0a0"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    aput v3, v2, v4

    const-string v3, "#00a0a0a0"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x2

    aput v3, v2, v4

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 103
    invoke-virtual {p0}, Lo/byy;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/byy;->p:I

    goto :goto_0

    .line 106
    :cond_0
    iget-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    if-eqz v0, :cond_1

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lo/byy;->p:I

    .line 111
    :cond_1
    :goto_0
    return-void
.end method

.method d(I)V
    .locals 12

    .line 205
    const/4 v4, 0x0

    .line 206
    iget-object v0, p0, Lo/byy;->c:Lo/byy$d;

    if-eqz v0, :cond_0

    .line 207
    iget-object v4, p0, Lo/byy;->c:Lo/byy$d;

    .line 208
    const/4 v0, 0x0

    iput-object v0, p0, Lo/byy;->c:Lo/byy$d;

    .line 211
    :cond_0
    if-nez v4, :cond_1

    .line 212
    new-instance v4, Lo/byy$d;

    invoke-direct {v4}, Lo/byy$d;-><init>()V

    .line 214
    :cond_1
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-static {v4}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, p1, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 215
    if-nez v5, :cond_2

    .line 216
    new-instance v5, Landroid/view/View;

    invoke-virtual {p0}, Lo/byy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 219
    :cond_2
    invoke-virtual {p0}, Lo/byy;->getLayoutDirection()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 222
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/AbsListView$LayoutParams;

    .line 223
    if-nez v6, :cond_3

    .line 224
    invoke-virtual {p0}, Lo/byy;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/AbsListView$LayoutParams;

    .line 225
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    :cond_3
    iget v0, v6, Landroid/widget/AbsListView$LayoutParams;->height:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 229
    iget v0, v6, Landroid/widget/AbsListView$LayoutParams;->height:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    .line 231
    if-nez v7, :cond_4

    .line 232
    const/high16 v7, 0x40000000    # 2.0f

    .line 234
    :cond_4
    invoke-virtual {p0}, Lo/byy;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lo/byy;->getListPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/byy;->getListPaddingBottom()I

    move-result v1

    sub-int v9, v0, v1

    .line 235
    if-le v8, v9, :cond_5

    .line 236
    move v8, v9

    .line 239
    :cond_5
    invoke-virtual {p0}, Lo/byy;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/byy;->getListPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/byy;->getListPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 240
    invoke-static {v8, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 241
    invoke-virtual {v5, v10, v11}, Landroid/view/View;->measure(II)V

    .line 242
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 243
    const/4 v0, 0x0

    iput v0, p0, Lo/byy;->e:I

    .line 245
    invoke-static {v4, v5}, Lo/byy$d;->e(Lo/byy$d;Landroid/view/View;)Landroid/view/View;

    .line 246
    invoke-static {v4, p1}, Lo/byy$d;->c(Lo/byy$d;I)I

    .line 247
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lo/byy$d;->e(Lo/byy$d;J)J

    .line 249
    iput-object v4, p0, Lo/byy;->a:Lo/byy$d;

    .line 250
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 398
    invoke-super {p0, p1}, Lo/elm;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 400
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-eqz v0, :cond_2

    .line 403
    invoke-virtual {p0}, Lo/byy;->getListPaddingLeft()I

    move-result v6

    .line 404
    invoke-virtual {p0}, Lo/byy;->getListPaddingTop()I

    move-result v7

    .line 405
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v8

    .line 408
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 410
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v1, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lo/byy;->p:I

    iget v2, p0, Lo/byy;->m:I

    .line 411
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_0
    add-int v9, v0, v1

    .line 412
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/2addr v0, v6

    add-int v1, v7, v9

    invoke-virtual {p1, v6, v7, v0, v1}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 414
    int-to-float v0, v6

    iget v1, p0, Lo/byy;->e:I

    add-int/2addr v1, v7

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 415
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lo/byy;->getDrawingTime()J

    move-result-wide v1

    invoke-virtual {p0, p1, v0, v1, v2}, Lo/byy;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 417
    iget-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    if-eqz v0, :cond_1

    iget v0, p0, Lo/byy;->m:I

    if-lez v0, :cond_1

    .line 418
    iget-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v1}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/byy;->a:Lo/byy$d;

    .line 419
    invoke-static {v2}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget-object v3, p0, Lo/byy;->a:Lo/byy$d;

    .line 420
    invoke-static {v3}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object v4, p0, Lo/byy;->a:Lo/byy$d;

    .line 421
    invoke-static {v4}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    iget v5, p0, Lo/byy;->p:I

    add-int/2addr v4, v5

    .line 418
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V

    .line 422
    iget-object v0, p0, Lo/byy;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 425
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 427
    :cond_2
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 454
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 455
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 456
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 458
    if-nez v4, :cond_0

    iget-object v0, p0, Lo/byy;->f:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    .line 461
    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lo/byy;->e(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/byy;->f:Landroid/view/View;

    .line 465
    iget-object v0, p0, Lo/byy;->g:Landroid/graphics/PointF;

    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 466
    iget-object v0, p0, Lo/byy;->g:Landroid/graphics/PointF;

    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 469
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lo/byy;->k:Landroid/view/MotionEvent;

    .line 472
    :cond_0
    iget-object v0, p0, Lo/byy;->f:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 473
    iget-object v0, p0, Lo/byy;->f:Landroid/view/View;

    invoke-direct {p0, v0, v2, v3}, Lo/byy;->e(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    iget-object v0, p0, Lo/byy;->f:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 477
    :cond_1
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 478
    invoke-super {p0, p1}, Lo/elm;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 479
    invoke-direct {p0}, Lo/byy;->i()Z

    .line 480
    invoke-direct {p0}, Lo/byy;->d()V

    goto :goto_0

    .line 482
    :cond_2
    const/4 v0, 0x3

    if-ne v4, v0, :cond_3

    .line 483
    invoke-direct {p0}, Lo/byy;->d()V

    goto :goto_0

    .line 485
    :cond_3
    const/4 v0, 0x2

    if-ne v4, v0, :cond_4

    .line 486
    iget-object v0, p0, Lo/byy;->g:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/byy;->i:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 489
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v5

    .line 490
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 491
    iget-object v0, p0, Lo/byy;->f:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 492
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 495
    iget-object v0, p0, Lo/byy;->k:Landroid/view/MotionEvent;

    invoke-super {p0, v0}, Lo/elm;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 496
    invoke-super {p0, p1}, Lo/elm;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 497
    invoke-direct {p0}, Lo/byy;->d()V

    .line 502
    :cond_4
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 506
    :cond_5
    invoke-super {p0, p1}, Lo/elm;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method e()V
    .locals 4

    .line 430
    invoke-virtual {p0}, Lo/byy;->c()V

    .line 431
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 432
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 433
    invoke-virtual {p0}, Lo/byy;->getFirstVisiblePosition()I

    move-result v2

    .line 434
    invoke-virtual {p0, v2}, Lo/byy;->b(I)I

    move-result v3

    .line 435
    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    .line 436
    return-void

    .line 437
    .line 438
    :cond_0
    invoke-virtual {p0}, Lo/byy;->getLastVisiblePosition()I

    move-result v0

    sub-int/2addr v0, v2

    .line 437
    invoke-virtual {p0, v3, v2, v0}, Lo/byy;->b(III)V

    .line 440
    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .line 348
    invoke-super/range {p0 .. p5}, Lo/elm;->onLayout(ZIIII)V

    .line 349
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    if-eqz v0, :cond_0

    .line 350
    sub-int v0, p4, p2

    invoke-virtual {p0}, Lo/byy;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/byy;->getPaddingRight()I

    move-result v1

    sub-int v2, v0, v1

    .line 351
    iget-object v0, p0, Lo/byy;->a:Lo/byy$d;

    invoke-static {v0}, Lo/byy$d;->e(Lo/byy$d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 352
    if-eq v2, v3, :cond_0

    .line 353
    invoke-virtual {p0}, Lo/byy;->e()V

    .line 356
    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 309
    invoke-super {p0, p1}, Lo/elm;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 310
    new-instance v0, Lo/byy$2;

    invoke-direct {v0, p0}, Lo/byy$2;-><init>(Lo/byy;)V

    invoke-virtual {p0, v0}, Lo/byy;->post(Ljava/lang/Runnable;)Z

    .line 316
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 1

    .line 39
    move-object v0, p1

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-virtual {p0, v0}, Lo/byy;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 3

    .line 322
    if-eqz p1, :cond_1

    .line 323
    instance-of v0, p1, Lo/byy$e;

    if-nez v0, :cond_0

    .line 324
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Does your adapter implement PinnedSectionListAdapter?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_0
    invoke-interface {p1}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 326
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Does your adapter handle at least two types of views in getViewTypeCount() method: items and sections?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_1
    invoke-virtual {p0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 332
    if-eqz v2, :cond_2

    .line 333
    iget-object v0, p0, Lo/byy;->n:Landroid/database/DataSetObserver;

    invoke-interface {v2, v0}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 334
    :cond_2
    if-eqz p1, :cond_3

    .line 335
    iget-object v0, p0, Lo/byy;->n:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 338
    :cond_3
    if-eq v2, p1, :cond_4

    .line 339
    invoke-virtual {p0}, Lo/byy;->c()V

    .line 341
    :cond_4
    if-eqz p1, :cond_5

    .line 342
    invoke-super {p0, p1}, Lo/elm;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 344
    :cond_5
    return-void
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .line 274
    iget-object v0, p0, Lo/byy;->l:Landroid/widget/AbsListView$OnScrollListener;

    if-ne p1, v0, :cond_0

    .line 275
    invoke-super {p0, p1}, Lo/elm;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    goto :goto_0

    .line 277
    :cond_0
    iput-object p1, p0, Lo/byy;->d:Landroid/widget/AbsListView$OnScrollListener;

    .line 279
    :goto_0
    return-void
.end method
