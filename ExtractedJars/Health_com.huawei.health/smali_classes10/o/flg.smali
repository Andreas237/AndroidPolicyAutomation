.class public Lo/flg;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/flg$d;,
        Lo/flg$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/FrameLayout;

.field private b:Landroid/view/View;

.field private c:Lo/flg$a;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Landroid/content/Context;

.field private f:I

.field private g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private h:Landroid/view/View;

.field private i:Landroid/support/v7/widget/RecyclerView$LayoutManager;

.field private k:I

.field private m:Lo/flb;

.field private n:I

.field private o:Z

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/flg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/flg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 92
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/flg;->f:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/flg;->p:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/flg;->n:I

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flg;->m:Lo/flb;

    .line 93
    iput-object p1, p0, Lo/flg;->e:Landroid/content/Context;

    .line 94
    sget-object v0, Lhuawei/support/v7/hwsubheader/R$styleable;->HwSubHeader:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 96
    sget v0, Lhuawei/support/v7/hwsubheader/R$styleable;->HwSubHeader_stick:I

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/flg;->o:Z

    .line 97
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lhuawei/support/v7/hwsubheader/R$layout;->hwsubheader_layout:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 98
    sget v0, Lhuawei/support/v7/hwsubheader/R$id;->recyclerview:I

    invoke-virtual {p0, v0}, Lo/flg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/flg;->d:Landroid/support/v7/widget/RecyclerView;

    .line 99
    sget v0, Lhuawei/support/v7/hwsubheader/R$id;->flHeader:I

    invoke-virtual {p0, v0}, Lo/flg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    .line 100
    new-instance v4, Lo/flg$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lo/flg$d;-><init>(Lo/flg;Lo/flg$3;)V

    .line 101
    iget-object v0, p0, Lo/flg;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 103
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-le v0, v1, :cond_0

    .line 104
    new-instance v0, Lo/flb;

    invoke-direct {v0}, Lo/flb;-><init>()V

    iput-object v0, p0, Lo/flg;->m:Lo/flb;

    .line 107
    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/flg;->g:Landroid/util/SparseArray;

    .line 108
    return-void
.end method

.method static synthetic a(Lo/flg;I)I
    .locals 0

    .line 24
    iput p1, p0, Lo/flg;->f:I

    return p1
.end method

.method static synthetic a(Lo/flg;)Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lo/flg;->o:Z

    return v0
.end method

.method static synthetic b(Lo/flg;I)I
    .locals 0

    .line 24
    iput p1, p0, Lo/flg;->k:I

    return p1
.end method

.method static synthetic b(Lo/flg;)Landroid/widget/FrameLayout;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private b()Z
    .locals 2

    .line 313
    invoke-virtual {p0}, Lo/flg;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic c(Lo/flg;)I
    .locals 1

    .line 24
    iget v0, p0, Lo/flg;->k:I

    return v0
.end method

.method private c()Z
    .locals 2

    .line 307
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 308
    const-string v0, "ar"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "iw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ug"

    .line 309
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ur"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/flg;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 308
    :goto_0
    return v0
.end method

.method static synthetic d(Lo/flg;)Landroid/support/v7/widget/RecyclerView$LayoutManager;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/flg;->i:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 160
    iget-boolean v0, p0, Lo/flg;->o:Z

    if-nez v0, :cond_0

    .line 161
    const-string v0, "HwSubHeader"

    const-string v1, "no use the stick function"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Lo/flg;->g:Landroid/util/SparseArray;

    iget v1, p0, Lo/flg;->f:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p0, Lo/flg;->b:Landroid/view/View;

    .line 166
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 167
    iget-object v0, p0, Lo/flg;->c:Lo/flg$a;

    iget v1, p0, Lo/flg;->f:I

    iget-object v2, p0, Lo/flg;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/flg$a;->b(ILandroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/flg;->b:Landroid/view/View;

    .line 168
    iget-object v0, p0, Lo/flg;->g:Landroid/util/SparseArray;

    iget v1, p0, Lo/flg;->f:I

    iget-object v2, p0, Lo/flg;->b:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 171
    :cond_1
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 172
    const-string v0, "HwSubHeader"

    const-string v1, "the mCurrentView is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    return-void

    .line 176
    :cond_2
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    iget-object v1, p0, Lo/flg;->h:Landroid/view/View;

    if-eq v0, v1, :cond_4

    .line 177
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 178
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_3

    .line 179
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lo/flg;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 181
    :cond_3
    const-string v0, "HwSubHeader"

    const-string v1, "the mCurrentView has Parent"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    :goto_0
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    iput-object v0, p0, Lo/flg;->h:Landroid/view/View;

    .line 187
    :cond_4
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 188
    invoke-direct {p0}, Lo/flg;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 189
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    iget-object v1, p0, Lo/flg;->b:Landroid/view/View;

    iget v2, p0, Lo/flg;->n:I

    iget v3, p0, Lo/flg;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lo/flb;->d(Landroid/view/View;II)V

    goto :goto_1

    .line 191
    :cond_5
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    iget-object v1, p0, Lo/flg;->b:Landroid/view/View;

    iget v2, p0, Lo/flg;->p:I

    iget v3, p0, Lo/flg;->n:I

    invoke-virtual {v0, v1, v2, v3}, Lo/flb;->d(Landroid/view/View;II)V

    .line 195
    :cond_6
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/flg;)Lo/flg$a;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/flg;->c:Lo/flg$a;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 134
    iget-object v0, p0, Lo/flg;->c:Lo/flg$a;

    iget v1, p0, Lo/flg;->f:I

    iget-object v2, p0, Lo/flg;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/flg$a;->b(ILandroid/content/Context;)Landroid/view/View;

    move-result-object v3

    .line 135
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 136
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/flg;->p:I

    .line 137
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lo/flg;->n:I

    .line 139
    :cond_0
    return-void
.end method

.method static synthetic k(Lo/flg;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/flg;->d()V

    return-void
.end method


# virtual methods
.method public getCurrentHeaderView()Landroid/view/View;
    .locals 1

    .line 212
    iget-object v0, p0, Lo/flg;->b:Landroid/view/View;

    return-object v0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 200
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 201
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    iget-object v1, p0, Lo/flg;->e:Landroid/content/Context;

    invoke-virtual {v0, p1, p0, v1}, Lo/flb;->b(Landroid/view/WindowInsets;Landroid/view/View;Landroid/content/Context;)V

    .line 202
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 203
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 204
    iget-object v0, p0, Lo/flg;->m:Lo/flb;

    iget v1, p0, Lo/flg;->p:I

    iget v2, p0, Lo/flg;->n:I

    invoke-virtual {v0, v3, v1, v2}, Lo/flb;->d(Landroid/view/View;II)V

    .line 207
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0
.end method

.method public setAdapter(Lo/flg$a;)V
    .locals 2

    .line 116
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 117
    const-string v0, "HwSubHeader"

    const-string v1, "the adapter is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    return-void

    .line 120
    :cond_0
    iget-object v0, p0, Lo/flg;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 121
    iput-object p1, p0, Lo/flg;->c:Lo/flg$a;

    .line 122
    iget-object v0, p0, Lo/flg;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/flg;->c:Lo/flg$a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 123
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 124
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 126
    invoke-direct {p0}, Lo/flg;->e()V

    .line 128
    invoke-direct {p0}, Lo/flg;->d()V

    .line 130
    :cond_1
    return-void
.end method

.method public setIsStick(Z)V
    .locals 1

    .line 219
    iput-boolean p1, p0, Lo/flg;->o:Z

    .line 220
    iget-object v0, p0, Lo/flg;->a:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 221
    return-void
.end method

.method public setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V
    .locals 2

    .line 148
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 149
    const-string v0, "HwSubHeader"

    const-string v1, "the layoutManager is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    return-void

    .line 152
    :cond_0
    iput-object p1, p0, Lo/flg;->i:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 153
    iget-object v0, p0, Lo/flg;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 154
    return-void
.end method
