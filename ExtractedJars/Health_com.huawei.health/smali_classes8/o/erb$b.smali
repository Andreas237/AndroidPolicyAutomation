.class public Lo/erb$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private b:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 9

    .line 192
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 195
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 198
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 199
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 201
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v6, v0, Landroid/util/DisplayMetrics;->density:F

    .line 202
    const/high16 v0, 0x42400000    # 48.0f

    mul-float/2addr v0, v6

    const/high16 v1, 0x3f000000    # 0.5f

    add-float v7, v0, v1

    .line 204
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 205
    int-to-float v0, v5

    sub-float/2addr v0, v7

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 206
    iget v0, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-double v0, v0

    const-wide v2, 0x3fd185887bf13eb5L    # 0.2737752161383285

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 207
    invoke-virtual {p1, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 208
    const-string v0, "OperationRecycleViewAdapter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OperationRecycleHolder() width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", height = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->operation_title_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erb$b;->d:Landroid/widget/TextView;

    .line 211
    sget v0, Lcom/huawei/ui/homehealth/R$id;->operation_context_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erb$b;->b:Landroid/widget/TextView;

    .line 212
    sget v0, Lcom/huawei/ui/homehealth/R$id;->operation_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/erb$b;->e:Landroid/widget/ImageView;

    .line 213
    return-void
.end method

.method static synthetic a(Lo/erb$b;)Landroid/widget/TextView;
    .locals 1

    .line 185
    iget-object v0, p0, Lo/erb$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/erb$b;)Landroid/widget/TextView;
    .locals 1

    .line 185
    iget-object v0, p0, Lo/erb$b;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/erb$b;)Landroid/widget/ImageView;
    .locals 1

    .line 185
    iget-object v0, p0, Lo/erb$b;->e:Landroid/widget/ImageView;

    return-object v0
.end method
