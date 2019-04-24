.class public Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;,
        Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;
    }
.end annotation


# static fields
.field private static final f:[I


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private F:I

.field private G:Ljava/util/Locale;

.field private H:I

.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private g:Landroid/widget/LinearLayout$LayoutParams;

.field private h:Landroid/widget/LinearLayout$LayoutParams;

.field private final i:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;

.field private j:I

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/TextView;>;"
        }
    .end annotation
.end field

.field private l:Landroid/widget/LinearLayout;

.field private m:I

.field private n:Landroid/support/v4/view/ViewPager;

.field private o:I

.field private p:F

.field private q:I

.field private r:I

.field private s:Landroid/graphics/Paint;

.field private t:I

.field private u:Landroid/graphics/Paint;

.field private v:Z

.field private w:I

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->f:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1010095
        0x1010098
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 86
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 90
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 91
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 94
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b:I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e:I

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->k:Ljava/util/ArrayList;

    .line 49
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->i:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    .line 62
    const v0, -0x99999a

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    .line 63
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->r:I

    .line 64
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->t:I

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->v:Z

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->x:Z

    .line 69
    const/16 v0, 0x34

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    .line 70
    const/16 v0, 0x8

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    .line 71
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    .line 72
    const/16 v0, 0xc

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    .line 73
    const/16 v0, 0x18

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->D:I

    .line 74
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->j:I

    .line 76
    const/16 v0, 0xc

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    .line 77
    const v0, -0x99999a

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->C:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->H:I

    .line 81
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_detail_select_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    .line 96
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->setFillViewport(Z)V

    .line 97
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->setWillNotDraw(Z)V

    .line 99
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    .line 100
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->addView(Landroid/view/View;)V

    .line 104
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 106
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    .line 107
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    .line 108
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    .line 109
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    .line 110
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->D:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->D:I

    .line 111
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->j:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->j:I

    .line 112
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    int-to-float v0, v0

    const/4 v1, 0x2

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    .line 116
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->f:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 118
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    .line 119
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->C:I

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->C:I

    .line 121
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 125
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 127
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsIndicatorColor:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    .line 128
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsUnderlineColor:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->r:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->r:I

    .line 129
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsDividerColor:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->t:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->t:I

    .line 130
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsIndicatorHeight:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    .line 131
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsUnderlineHeight:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    .line 132
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsDividerPadding:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    .line 133
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsTabPaddingLeftRight:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->D:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->D:I

    .line 134
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsTabBackground:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    .line 135
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsShouldExpand:I

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->v:Z

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->v:Z

    .line 136
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsScrollOffset:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    .line 137
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_pstsTextAllCaps:I

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->x:Z

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->x:Z

    .line 139
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_headpicbackground:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b:I

    .line 140
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_midpicbackground:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a:I

    .line 141
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_lastpicbackground:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d:I

    .line 143
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_nomaltextcolor:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c:I

    .line 144
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$styleable;->PagerSlidingTabStrip_selectedtextcolor:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e:I

    .line 146
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 148
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 150
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 152
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->u:Landroid/graphics/Paint;

    .line 153
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->u:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->u:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->j:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 156
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 159
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->G:Ljava/util/Locale;

    if-nez v0, :cond_0

    .line 160
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->G:Ljava/util/Locale;

    .line 162
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;F)F
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    return p1
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->n:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;I)I
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/widget/LinearLayout;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Ljava/util/ArrayList;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 254
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    if-ge v2, v0, :cond_3

    .line 256
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 258
    instance-of v0, v3, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 259
    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    .line 260
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->B:I

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 261
    if-nez v2, :cond_0

    .line 262
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 264
    :cond_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 266
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->x:Z

    if-eqz v0, :cond_2

    .line 267
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 268
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    goto :goto_2

    .line 270
    :cond_1
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->G:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 275
    :cond_3
    return-void
.end method

.method private c(ILandroid/view/View;)V
    .locals 2

    .line 228
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 229
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->v:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->h:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->g:Landroid/widget/LinearLayout$LayoutParams;

    :goto_0
    invoke-virtual {v0, p2, p1, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 236
    return-void
.end method

.method private c(ILjava/lang/String;)V
    .locals 3

    .line 212
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 213
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    const/16 v0, 0x11

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 215
    invoke-virtual {v2}, Landroid/widget/TextView;->setSingleLine()V

    .line 216
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    if-eq v0, v1, :cond_0

    .line 217
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 218
    :cond_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    if-eq v0, v1, :cond_1

    .line 219
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 220
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->F:I

    if-eq v0, v1, :cond_2

    .line 221
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 223
    :cond_2
    :goto_0
    invoke-direct {p0, p1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(ILandroid/view/View;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e:I

    return v0
.end method

.method private d(II)V
    .locals 2

    .line 239
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    if-nez v0, :cond_0

    .line 240
    return-void

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int v1, v0, p2

    .line 243
    if-gtz p1, :cond_1

    if-lez p2, :cond_2

    .line 244
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->z:I

    sub-int/2addr v1, v0

    .line 246
    :cond_2
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->H:I

    if-eq v1, v0, :cond_3

    .line 247
    iput v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->H:I

    .line 248
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->scrollTo(II)V

    .line 250
    :cond_3
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;II)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d(II)V

    return-void
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 180
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->n:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    .line 182
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    if-ge v2, v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->n:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->n:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(ILjava/lang/String;)V

    .line 182
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 188
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c()V

    .line 190
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 208
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 279
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onDraw(Landroid/graphics/Canvas;)V

    .line 281
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    if-nez v0, :cond_1

    .line 282
    :cond_0
    return-void

    .line 285
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getHeight()I

    move-result v6

    .line 289
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 293
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v8, v0

    .line 294
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v9, v0

    .line 297
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    .line 299
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 300
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v11, v0

    .line 301
    invoke-virtual {v10}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v12, v0

    .line 303
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    mul-float/2addr v0, v11

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    mul-float/2addr v1, v8

    add-float v8, v0, v1

    .line 304
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    mul-float/2addr v0, v12

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->p:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    mul-float/2addr v1, v9

    add-float v9, v0, v1

    .line 316
    :cond_2
    move-object v0, p1

    move v1, v8

    iget v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->w:I

    sub-int v2, v6, v2

    int-to-float v2, v2

    move v3, v9

    int-to-float v4, v6

    iget-object v5, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->r:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 320
    move-object v0, p1

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->y:I

    sub-int v1, v6, v1

    int-to-float v2, v1

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v6

    iget-object v5, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->s:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->u:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 323
    const/4 v10, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->m:I

    add-int/lit8 v0, v0, -0x1

    if-ge v10, v0, :cond_3

    .line 324
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 325
    move-object v0, p1

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    int-to-float v2, v2

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->A:I

    sub-int v4, v6, v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->u:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 323
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 327
    :cond_3
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 367
    move-object v1, p1

    check-cast v1, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;

    .line 368
    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 369
    iget v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->currentPosition:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    .line 370
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->requestLayout()V

    .line 371
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 375
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 376
    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;

    invoke-direct {v2, v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 377
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->o:I

    iput v0, v2, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->currentPosition:I

    .line 378
    return-object v2
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .line 165
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->n:Landroid/support/v4/view/ViewPager;

    .line 167
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->i:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 173
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a()V

    .line 174
    return-void
.end method
