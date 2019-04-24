.class public Lo/bdz;
.super Landroid/widget/GridView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bdz$c;,
        Lo/bdz$e;,
        Lo/bdz$b;,
        Lo/bdz$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/AdapterView$OnItemClickListener;

.field private b:Lo/bdz$c;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bdz$a;>;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/AdapterView$OnItemLongClickListener;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bdz$a;>;"
        }
    .end annotation
.end field

.field private f:Landroid/view/View;

.field private h:Landroid/widget/ListAdapter;

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 48
    invoke-direct {p0, p1}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lo/bdz;->i:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdz;->f:Landroid/view/View;

    .line 49
    invoke-direct {p0}, Lo/bdz;->c()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lo/bdz;->i:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdz;->f:Landroid/view/View;

    .line 53
    invoke-direct {p0}, Lo/bdz;->c()V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lo/bdz;->i:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdz;->f:Landroid/view/View;

    .line 57
    invoke-direct {p0}, Lo/bdz;->c()V

    .line 58
    return-void
.end method

.method static synthetic c(Lo/bdz;)I
    .locals 1

    .line 26
    invoke-direct {p0}, Lo/bdz;->getNumColumnsCompatible()I

    move-result v0

    return v0
.end method

.method private c()V
    .locals 0

    .line 46
    return-void
.end method

.method static synthetic d(Lo/bdz;)Landroid/widget/AdapterView$OnItemLongClickListener;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bdz;->d:Landroid/widget/AdapterView$OnItemLongClickListener;

    return-object v0
.end method

.method static synthetic e(Lo/bdz;)Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bdz;->a:Landroid/widget/AdapterView$OnItemClickListener;

    return-object v0
.end method

.method private getColumnWidthCompatible()I
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 199
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 200
    invoke-super {p0}, Landroid/widget/GridView;->getColumnWidth()I

    move-result v0

    return v0

    .line 203
    :cond_0
    :try_start_0
    const-class v0, Landroid/widget/GridView;

    const-string v1, "mColumnWidth"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 204
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 205
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 206
    :catch_0
    move-exception v2

    .line 207
    const/4 v0, -0x1

    return v0

    .line 208
    :catch_1
    move-exception v2

    .line 209
    const/4 v0, -0x1

    return v0
.end method

.method private getItemClickHandler()Lo/bdz$c;
    .locals 2

    .line 697
    iget-object v0, p0, Lo/bdz;->b:Lo/bdz$c;

    if-nez v0, :cond_0

    .line 698
    new-instance v0, Lo/bdz$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bdz$c;-><init>(Lo/bdz;Lo/bdz$2;)V

    iput-object v0, p0, Lo/bdz;->b:Lo/bdz$c;

    .line 700
    :cond_0
    iget-object v0, p0, Lo/bdz;->b:Lo/bdz$c;

    return-object v0
.end method

.method private getNumColumnsCompatible()I
    .locals 1

    .line 176
    invoke-super {p0}, Landroid/widget/GridView;->getNumColumns()I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 7

    .line 87
    invoke-virtual {p0}, Lo/bdz;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    .line 88
    if-eqz v3, :cond_0

    instance-of v0, v3, Lo/bdz$e;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot add header view to grid , setAdapter has already been called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 94
    new-instance v5, Lo/bdz$a;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/bdz$a;-><init>(Lo/bdz$2;)V

    .line 95
    new-instance v6, Lo/bdz$b;

    invoke-virtual {p0}, Lo/bdz;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, p0, v0}, Lo/bdz$b;-><init>(Lo/bdz;Landroid/content/Context;)V

    .line 97
    if-eqz v4, :cond_1

    .line 98
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    iget v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    :cond_1
    invoke-virtual {v6, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 102
    invoke-static {v5, v6}, Lo/bdz$a;->c(Lo/bdz$a;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 103
    invoke-static {v5, p2}, Lo/bdz$a;->b(Lo/bdz$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    invoke-static {v5, p3}, Lo/bdz$a;->a(Lo/bdz$a;Z)Z

    .line 105
    invoke-static {v5, p1}, Lo/bdz$a;->d(Lo/bdz$a;Landroid/view/View;)Landroid/view/View;

    .line 106
    iget-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    if-eqz v3, :cond_2

    .line 109
    move-object v0, v3

    check-cast v0, Lo/bdz$e;

    invoke-virtual {v0}, Lo/bdz$e;->e()V

    .line 111
    :cond_2
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 2

    .line 83
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lo/bdz;->a(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 84
    return-void
.end method

.method public getFooterViewCount()I
    .locals 1

    .line 159
    iget-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getHeaderViewCount()I
    .locals 1

    .line 127
    iget-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getHorizontalSpacing()I
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 238
    const/4 v2, 0x0

    .line 240
    :try_start_0
    invoke-super {p0}, Landroid/widget/GridView;->getHorizontalSpacing()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 243
    goto :goto_0

    .line 241
    :catch_0
    move-exception v3

    .line 242
    const-string v0, "GridViewWithFooter"

    const-string v1, "exception in get horizontal spacing"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :goto_0
    return v2
.end method

.method public getOriginalAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 298
    iget-object v0, p0, Lo/bdz;->h:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public getRowHeight()I
    .locals 10

    .line 259
    iget v0, p0, Lo/bdz;->i:I

    if-lez v0, :cond_0

    .line 260
    iget v0, p0, Lo/bdz;->i:I

    return v0

    .line 262
    :cond_0
    invoke-virtual {p0}, Lo/bdz;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    .line 263
    invoke-direct {p0}, Lo/bdz;->getNumColumnsCompatible()I

    move-result v4

    .line 265
    if-eqz v3, :cond_1

    invoke-interface {v3}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    iget-object v1, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/2addr v1, v4

    if-gt v0, v1, :cond_2

    .line 266
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 268
    :cond_2
    invoke-direct {p0}, Lo/bdz;->getColumnWidthCompatible()I

    move-result v5

    .line 269
    invoke-virtual {p0}, Lo/bdz;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    iget-object v1, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/2addr v1, v4

    iget-object v2, p0, Lo/bdz;->f:Landroid/view/View;

    invoke-interface {v0, v1, v2, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 270
    if-eqz v6, :cond_4

    .line 271
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/AbsListView$LayoutParams;

    .line 272
    if-nez v7, :cond_3

    .line 273
    new-instance v7, Landroid/widget/AbsListView$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-direct {v7, v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(III)V

    .line 274
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    :cond_3
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget v1, v7, Landroid/widget/AbsListView$LayoutParams;->width:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/bdz;->getChildMeasureSpec(III)I

    move-result v8

    .line 277
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget v1, v7, Landroid/widget/AbsListView$LayoutParams;->height:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/bdz;->getChildMeasureSpec(III)I

    move-result v9

    .line 279
    invoke-virtual {v6, v8, v9}, Landroid/view/View;->measure(II)V

    .line 280
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/bdz;->i:I

    .line 281
    iput-object v6, p0, Lo/bdz;->f:Landroid/view/View;

    .line 283
    :cond_4
    iget v0, p0, Lo/bdz;->i:I

    return v0
.end method

.method public getVerticalSpacing()I
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 226
    const/4 v2, 0x0

    .line 228
    :try_start_0
    invoke-super {p0}, Landroid/widget/GridView;->getVerticalSpacing()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 231
    goto :goto_0

    .line 229
    :catch_0
    move-exception v3

    .line 230
    const-string v0, "GridViewWithFooter"

    const-string v1, "exception in get vertical spacing"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    :goto_0
    return v2
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 220
    invoke-super {p0}, Landroid/widget/GridView;->onDetachedFromWindow()V

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdz;->f:Landroid/view/View;

    .line 222
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 66
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 67
    invoke-virtual {p0}, Lo/bdz;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 68
    if-eqz v2, :cond_0

    instance-of v0, v2, Lo/bdz$e;

    if-eqz v0, :cond_0

    .line 69
    move-object v0, v2

    check-cast v0, Lo/bdz$e;

    invoke-direct {p0}, Lo/bdz;->getNumColumnsCompatible()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bdz$e;->b(I)V

    .line 70
    move-object v0, v2

    check-cast v0, Lo/bdz$e;

    invoke-virtual {p0}, Lo/bdz;->getRowHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bdz$e;->e(I)V

    .line 72
    :cond_0
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 1

    .line 26
    move-object v0, p1

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-virtual {p0, v0}, Lo/bdz;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 4

    .line 303
    iput-object p1, p0, Lo/bdz;->h:Landroid/widget/ListAdapter;

    .line 304
    iget-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 305
    :cond_0
    new-instance v2, Lo/bdz$e;

    iget-object v0, p0, Lo/bdz;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/bdz;->e:Ljava/util/ArrayList;

    invoke-direct {v2, v0, v1, p1}, Lo/bdz$e;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V

    .line 306
    invoke-direct {p0}, Lo/bdz;->getNumColumnsCompatible()I

    move-result v3

    .line 307
    const/4 v0, 0x1

    if-le v3, v0, :cond_1

    .line 308
    invoke-virtual {v2, v3}, Lo/bdz$e;->b(I)V

    .line 310
    :cond_1
    invoke-virtual {p0}, Lo/bdz;->getRowHeight()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/bdz$e;->e(I)V

    .line 311
    invoke-super {p0, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 312
    goto :goto_0

    .line 313
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 315
    :goto_0
    return-void
.end method

.method public setClipChildren(Z)V
    .locals 0

    .line 62
    return-void
.end method

.method public setClipChildrenSupper(Z)V
    .locals 1

    .line 79
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/GridView;->setClipChildren(Z)V

    .line 80
    return-void
.end method

.method public setNumColumns(I)V
    .locals 2

    .line 319
    invoke-super {p0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 320
    invoke-virtual {p0}, Lo/bdz;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 321
    if-eqz v1, :cond_0

    instance-of v0, v1, Lo/bdz$e;

    if-eqz v0, :cond_0

    .line 322
    move-object v0, v1

    check-cast v0, Lo/bdz$e;

    invoke-virtual {v0, p1}, Lo/bdz$e;->b(I)V

    .line 324
    :cond_0
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    .line 705
    iput-object p1, p0, Lo/bdz;->a:Landroid/widget/AdapterView$OnItemClickListener;

    .line 706
    invoke-direct {p0}, Lo/bdz;->getItemClickHandler()Lo/bdz$c;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 707
    return-void
.end method

.method public setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 1

    .line 711
    iput-object p1, p0, Lo/bdz;->d:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 712
    invoke-direct {p0}, Lo/bdz;->getItemClickHandler()Lo/bdz$c;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/GridView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 713
    return-void
.end method
