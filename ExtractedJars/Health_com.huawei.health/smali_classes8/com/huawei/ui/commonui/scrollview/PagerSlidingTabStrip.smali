.class public Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;,
        Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;
    }
.end annotation


# static fields
.field private static final f:[I


# instance fields
.field private A:Landroid/graphics/Paint;

.field private B:Landroid/graphics/Paint;

.field private C:I

.field private D:I

.field private E:I

.field private F:F

.field private G:I

.field private H:I

.field private I:Z

.field private J:Z

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:J

.field private Q:J

.field private R:J

.field private S:J

.field private T:Lo/egy;

.field private W:Lo/egy;

.field public a:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private b:I

.field private c:I

.field protected d:Landroid/widget/LinearLayout;

.field private e:I

.field private g:I

.field private h:I

.field private final i:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;

.field private j:I

.field private k:I

.field private l:I

.field private m:Ljava/util/Locale;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/TextView;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private r:Landroid/support/v4/view/ViewPager;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/LinearLayout$LayoutParams;

.field private u:Landroid/widget/LinearLayout$LayoutParams;

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->f:[I

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

    .line 126
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 127
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 130
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 131
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 134
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e:I

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c:I

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->k:I

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    .line 67
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l:I

    .line 72
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->track_detail_select_title:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p:Ljava/util/ArrayList;

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n:Ljava/util/ArrayList;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    .line 91
    const v0, -0x99999a

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    .line 92
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->x:I

    .line 93
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->v:I

    .line 98
    const/16 v0, 0x34

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    .line 99
    const/16 v0, 0x8

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->D:I

    .line 100
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->C:I

    .line 101
    const/16 v0, 0xc

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->E:I

    .line 102
    const/16 v0, 0x18

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->H:I

    .line 103
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->G:I

    .line 104
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->F:F

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->I:Z

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->J:Z

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->L:I

    .line 111
    const/16 v0, 0x12

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    .line 112
    const/16 v0, 0xf

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    .line 113
    const/16 v0, 0x10

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    .line 114
    const v0, -0x99999a

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->O:I

    .line 116
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->Q:J

    .line 117
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->S:J

    .line 118
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->R:J

    .line 119
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->P:J

    .line 136
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->addView(Landroid/view/View;)V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->setFillViewport(Z)V

    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->setWillNotDraw(Z)V

    .line 143
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->s:Landroid/widget/ImageView;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->s:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$drawable;->commonui_settings_red_point:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->Q:J

    .line 148
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 150
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    .line 151
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    int-to-float v0, v0

    const/4 v1, 0x2

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    .line 152
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    .line 153
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->H:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->H:I

    .line 154
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->G:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->G:I

    .line 155
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    .line 156
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->D:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->D:I

    .line 157
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->C:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->C:I

    .line 158
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->E:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v1, v0, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->E:I

    .line 161
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->f:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 163
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    .line 164
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->O:I

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->O:I

    .line 165
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    .line 166
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    .line 168
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 171
    sget-object v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 173
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_headpicbackground:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e:I

    .line 174
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_midpicbackground:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c:I

    .line 175
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_lastpicbackground:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->k:I

    .line 177
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsTabPaddingLeftRight:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->H:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->H:I

    .line 178
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsTabBackground:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    .line 179
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsShouldExpand:I

    iget-boolean v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->I:Z

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->I:Z

    .line 180
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsIndicatorHeight:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->D:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->D:I

    .line 181
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsUnderlineHeight:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->C:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->C:I

    .line 182
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsDividerPadding:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->E:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->E:I

    .line 183
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_nomaltextcolor:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    .line 184
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_selectedtextcolor:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    .line 185
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsScrollOffset:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    .line 186
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsTextAllCaps:I

    iget-boolean v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->J:Z

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->J:Z

    .line 187
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsIndicatorColor:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    .line 188
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsUnderlineColor:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->x:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->x:I

    .line 189
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->PagerSlidingTabStrip_pstsDividerColor:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->v:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->v:I

    .line 191
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 193
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->t:Landroid/widget/LinearLayout$LayoutParams;

    .line 194
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->u:Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->A:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->G:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 200
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->B:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->m:Ljava/util/Locale;

    if-nez v0, :cond_0

    .line 205
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->m:Ljava/util/Locale;

    .line 208
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g()V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ena;->e(Landroid/content/Context;)V

    .line 210
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private a(IILandroid/widget/ImageView;)V
    .locals 1

    .line 375
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    if-ne p2, p1, :cond_0

    .line 377
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 379
    :pswitch_0
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_home_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 380
    goto/16 :goto_3

    .line 382
    :pswitch_1
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_workout_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 383
    goto/16 :goto_3

    .line 385
    :pswitch_2
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_me_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 386
    goto/16 :goto_3

    .line 388
    :goto_0
    goto/16 :goto_3

    .line 392
    :cond_0
    packed-switch p2, :pswitch_data_1

    goto :goto_1

    .line 394
    :pswitch_3
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_home:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 395
    goto/16 :goto_3

    .line 397
    :pswitch_4
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_workout:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 398
    goto/16 :goto_3

    .line 400
    :pswitch_5
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_me:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 401
    goto/16 :goto_3

    .line 403
    :goto_1
    goto/16 :goto_3

    .line 408
    :cond_1
    if-ne p2, p1, :cond_2

    .line 409
    packed-switch p2, :pswitch_data_2

    goto :goto_2

    .line 411
    :pswitch_6
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_home_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 412
    goto/16 :goto_3

    .line 414
    :pswitch_7
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_workout_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 415
    goto :goto_3

    .line 417
    :pswitch_8
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_discover_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 420
    goto :goto_3

    .line 422
    :pswitch_9
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_me_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 424
    goto :goto_3

    .line 426
    :pswitch_a
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_me_sel:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 427
    goto :goto_3

    .line 429
    :goto_2
    goto :goto_3

    .line 433
    :cond_2
    packed-switch p2, :pswitch_data_3

    goto :goto_3

    .line 435
    :pswitch_b
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_home:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 436
    goto :goto_3

    .line 438
    :pswitch_c
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_workout:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 439
    goto :goto_3

    .line 441
    :pswitch_d
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_discover:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 443
    goto :goto_3

    .line 445
    :pswitch_e
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_bottomtab_me:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 447
    goto :goto_3

    .line 449
    :pswitch_f
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_me_nor:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 450
    .line 456
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method private a(ILandroid/view/View;Z)V
    .locals 2

    .line 613
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 615
    if-eqz p3, :cond_1

    .line 616
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 617
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$10;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 631
    :cond_0
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$6;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$6;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 639
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    iget-boolean v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->I:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->u:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->t:Landroid/widget/LinearLayout$LayoutParams;

    :goto_1
    invoke-virtual {v0, p2, p1, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 640
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;II)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(II)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->L:I

    return p1
.end method

.method private b()V
    .locals 14

    .line 644
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    if-ge v3, v0, :cond_7

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 647
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 648
    instance-of v0, v5, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 649
    move-object v6, v5

    check-cast v6, Landroid/widget/TextView;

    .line 651
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->K:I

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 653
    invoke-virtual {v6}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v7

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    .line 655
    invoke-virtual {v7, v8}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v9

    .line 656
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 657
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    .line 658
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 659
    int-to-float v0, v12

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    int-to-float v1, v1

    div-float v13, v0, v1

    .line 660
    cmpl-float v0, v9, v13

    if-lez v0, :cond_0

    .line 661
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 662
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->N:I

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 665
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->B(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 666
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 667
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->M:I

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 669
    :cond_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 670
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    goto :goto_1

    .line 672
    :cond_2
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    .line 674
    :goto_1
    if-eqz v3, :cond_3

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    if-ne v3, v0, :cond_4

    .line 675
    :cond_3
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 677
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_color_white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->setBackgroundColor(I)V

    .line 678
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 679
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->user_profile_level_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 680
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/elx;->e(Landroid/content/Context;)V

    goto :goto_2

    .line 682
    :cond_4
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 684
    :goto_2
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->J:Z

    if-eqz v0, :cond_6

    .line 685
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_5

    .line 686
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    goto :goto_3

    .line 688
    :cond_5
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->m:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 644
    :cond_6
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 694
    :cond_7
    return-void
.end method

.method private b(II)V
    .locals 2

    .line 711
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    if-nez v0, :cond_0

    .line 712
    return-void

    .line 715
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int v1, v0, p2

    .line 717
    if-gtz p1, :cond_1

    if-lez p2, :cond_2

    .line 718
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->j:I

    sub-int/2addr v1, v0

    .line 721
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l:I

    if-eq v1, v0, :cond_3

    .line 722
    iput v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l:I

    .line 723
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->scrollTo(II)V

    .line 726
    :cond_3
    return-void
.end method

.method private b(ILjava/lang/String;Z)V
    .locals 8

    .line 502
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 503
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 504
    const/16 v0, 0x11

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 505
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 506
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$layout;->pagerslidingtabstrip_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 507
    sget v0, Lcom/huawei/ui/commonui/R$id;->pagerslidingtabstrip_item_iv:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 508
    sget v0, Lcom/huawei/ui/commonui/R$id;->pagerslidingtabstrip_item_red_point:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 509
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 512
    :pswitch_0
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_index_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 513
    goto :goto_1

    .line 515
    :pswitch_1
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_index_workout_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 516
    goto :goto_1

    .line 518
    :pswitch_2
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_me_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 519
    goto :goto_1

    .line 521
    :goto_0
    goto :goto_1

    .line 525
    :cond_0
    packed-switch p1, :pswitch_data_1

    goto :goto_1

    .line 527
    :pswitch_3
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_index_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 528
    goto :goto_1

    .line 530
    :pswitch_4
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_index_workout_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 531
    goto :goto_1

    .line 533
    :pswitch_5
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_discover_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 535
    goto :goto_1

    .line 537
    :pswitch_6
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_featured_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 539
    goto :goto_1

    .line 541
    :pswitch_7
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->ic_main_me_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 542
    .line 548
    :goto_1
    sget v0, Lcom/huawei/ui/commonui/R$id;->pagerslidingtabstrip_item_tv:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 550
    invoke-virtual {v7, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    const/16 v0, 0x11

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 552
    invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V

    .line 553
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    if-eq v0, v1, :cond_1

    .line 554
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    .line 555
    :cond_1
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->k:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    if-eq v0, v1, :cond_2

    .line 556
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->k:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    .line 557
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c:I

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o:I

    if-eq v0, v1, :cond_3

    .line 558
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 561
    :cond_3
    :goto_2
    if-eqz p3, :cond_5

    .line 563
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 564
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 578
    :cond_4
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)V

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 587
    :cond_5
    :goto_3
    invoke-virtual {v3}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 588
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 606
    invoke-direct {p0, p1, v3, p3}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(ILandroid/view/View;Z)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;IILandroid/widget/ImageView;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(IILandroid/widget/ImageView;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->Q:J

    return-wide p1
.end method

.method private c()V
    .locals 6

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 348
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 351
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    move-object v1, v5

    check-cast v1, Landroid/widget/ImageView;

    invoke-direct {p0, v0, v3, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(IILandroid/widget/ImageView;)V

    .line 352
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    if-ne v3, v0, :cond_3

    .line 353
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    goto :goto_1

    .line 356
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    .line 358
    :goto_1
    if-eqz v3, :cond_1

    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    if-ne v3, v0, :cond_2

    .line 359
    :cond_1
    move-object v0, v4

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->user_profile_level_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 360
    move-object v0, v4

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 361
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->F:F

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->user_profile_level_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(FI)V

    goto :goto_2

    .line 363
    :cond_2
    move-object v0, v4

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 364
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->F:F

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(FI)V

    goto :goto_2

    .line 367
    :cond_3
    move-object v0, v4

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 368
    move-object v0, v4

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 348
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 372
    :cond_4
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->S:J

    return-wide p1
.end method

.method private d()V
    .locals 2

    .line 893
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 894
    invoke-static {v1}, Lo/ena;->e(Landroid/content/Context;)V

    .line 895
    invoke-static {v1}, Lo/ena;->c(Landroid/content/Context;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 897
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    .line 898
    goto :goto_1

    .line 900
    :pswitch_1
    invoke-static {}, Lo/ena;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 901
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    goto :goto_1

    .line 903
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->W:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 905
    goto :goto_1

    .line 907
    :pswitch_2
    invoke-static {}, Lo/ena;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->T:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    goto :goto_1

    .line 910
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    .line 912
    goto :goto_1

    .line 914
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    .line 916
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->P:J

    return-wide p1
.end method

.method private e()V
    .locals 6

    .line 920
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 921
    new-instance v5, Lo/egy$b;

    invoke-direct {v5, v4}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 922
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_show_map_type_no_gms:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$9;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 923
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 928
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 929
    invoke-static {v4}, Lo/ena;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 930
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    goto :goto_0

    .line 932
    :cond_0
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 934
    :goto_0
    return-void
.end method

.method private e(FI)V
    .locals 0

    .line 495
    iput p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->F:F

    .line 496
    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->z:I

    .line 497
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a()V

    .line 498
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method private g()V
    .locals 8

    .line 938
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 939
    new-instance v5, Lo/egy$b;

    invoke-direct {v5, v4}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 940
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_show_map_type_no_gms:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$8;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 941
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 947
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 948
    new-instance v6, Lo/egy$b;

    invoke-direct {v6, v4}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 949
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_abroad:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_switch:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;

    invoke-direct {v2, p0, v4, v3}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Landroid/content/Context;Lo/egy;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_no_switch:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$7;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 959
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 965
    new-instance v7, Lo/egy$b;

    invoke-direct {v7, v4}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 966
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_china:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_switch:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;

    invoke-direct {v2, p0, v4}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$5;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_map_type_remind_no_switch:I

    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$2;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 972
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 978
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->T:Lo/egy;

    .line 979
    invoke-virtual {v7}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->W:Lo/egy;

    .line 980
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    return v0
.end method

.method private i()V
    .locals 4

    .line 983
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoSportTab"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 985
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b:I

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->L:I

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->P:J

    return-wide v0
.end method

.method static synthetic n(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->Q:J

    return-wide v0
.end method

.method static synthetic o(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->S:J

    return-wide v0
.end method

.method static synthetic p(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 292
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->invalidate()V

    .line 293
    return-void
.end method

.method public a(FII)V
    .locals 5

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 475
    iput p3, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    .line 476
    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    .line 477
    const/4 v1, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    if-ge v1, v0, :cond_2

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 479
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 480
    instance-of v0, v3, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 481
    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    .line 482
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    if-ne v1, v0, :cond_0

    .line 483
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 485
    :cond_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 487
    :goto_1
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 477
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 491
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(FI)V

    .line 492
    return-void
.end method

.method public b(IF)V
    .locals 0

    .line 342
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->invalidate()V

    .line 343
    return-void
.end method

.method public e(Z)V
    .locals 5

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 304
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    if-ge v4, v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(ILjava/lang/String;Z)V

    goto :goto_1

    .line 308
    :cond_0
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pager.getAdapter().getPageTitle(i) == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 312
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b()V

    .line 314
    if-eqz p1, :cond_2

    .line 315
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_2

    .line 333
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    .line 334
    invoke-direct {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c()V

    .line 336
    :goto_2
    return-void
.end method

.method public getSportTabXPosition()I
    .locals 9

    .line 217
    const/4 v4, 0x0

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 219
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportTabXPosition null == tabsContainer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    return v4

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 223
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 224
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportTabXPosition null == tabsContainer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return v4

    .line 227
    :cond_1
    const/4 v0, 0x2

    new-array v6, v0, [I

    .line 228
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->getLocationInWindow([I)V

    .line 229
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 230
    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v8

    .line 231
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportTab X:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " width:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    div-int/lit8 v0, v8, 0x2

    add-int v4, v7, v0

    .line 233
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportTabXPosition result:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    return v4
.end method

.method public getfinalPagerStayPosition()I
    .locals 1

    .line 834
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->L:I

    return v0
.end method

.method public getfinalPagerStayTime()J
    .locals 2

    .line 837
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->Q:J

    return-wide v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 730
    const/4 v0, 0x1

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 698
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onDraw(Landroid/graphics/Canvas;)V

    .line 700
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    return-void

    .line 704
    :cond_0
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->y:I

    if-nez v0, :cond_1

    .line 705
    return-void

    .line 707
    :cond_1
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 854
    move-object v1, p1

    check-cast v1, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    .line 855
    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 856
    iget v0, v1, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;->currentPosition:I

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    .line 857
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->requestLayout()V

    .line 858
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 846
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 847
    new-instance v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    invoke-direct {v2, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 848
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->w:I

    iput v0, v2, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;->currentPosition:I

    .line 849
    return-object v2
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 214
    return-void
.end method

.method public setRedDot(IZ)V
    .locals 3

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 465
    if-eqz p2, :cond_0

    .line 466
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 468
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 471
    :cond_1
    :goto_0
    return-void
.end method

.method public setStayBackGoundTime(J)V
    .locals 4

    .line 840
    iput-wide p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->R:J

    .line 841
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->P:J

    iget-wide v2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->R:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->P:J

    .line 842
    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;Z)V
    .locals 2

    .line 278
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->r:Landroid/support/v4/view/ViewPager;

    .line 280
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 281
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 284
    :cond_0
    if-eqz p2, :cond_1

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 288
    :cond_1
    invoke-virtual {p0, p2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(Z)V

    .line 289
    return-void
.end method
