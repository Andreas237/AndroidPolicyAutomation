.class public Lo/epl;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private B:[Landroid/graphics/Point;

.field private C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private D:[Landroid/graphics/Point;

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private a:Landroid/content/res/Resources;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/content/Context;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:I

.field private g:I

.field private h:I

.field private i:Landroid/util/DisplayMetrics;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:[Landroid/graphics/Point;

.field private x:I

.field private y:I

.field private z:[Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 96
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 100
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epl;->f:I

    .line 46
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epl;->k:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/epl;->m:I

    .line 52
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epl;->o:Z

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lo/epl;->p:I

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->M:Ljava/util/ArrayList;

    .line 101
    iput-object p1, p0, Lo/epl;->c:Landroid/content/Context;

    .line 102
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    .line 103
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    .line 104
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    .line 105
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->j:Ljava/util/ArrayList;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->A:Ljava/util/ArrayList;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epl;->F:Ljava/util/ArrayList;

    .line 110
    invoke-direct {p0}, Lo/epl;->a()V

    .line 111
    return-void
.end method

.method private a()V
    .locals 6

    .line 117
    iget-object v0, p0, Lo/epl;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/epl;->a:Landroid/content/res/Resources;

    .line 118
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    .line 119
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 120
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    .line 121
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 122
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const-string v1, "80"

    const-string v2, "80"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 123
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lo/epl;->n:I

    .line 124
    iget-object v0, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_bloodpressure_line_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epl;->f:I

    .line 125
    iget-object v0, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_bloodpressure_point_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epl;->k:I

    .line 126
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lo/epl;->i:Landroid/util/DisplayMetrics;

    .line 127
    iget-object v0, p0, Lo/epl;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 128
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lo/epl;->i:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 129
    const/high16 v0, 0x41000000    # 8.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iget v1, p0, Lo/epl;->n:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/epl;->p:I

    .line 130
    invoke-direct {p0}, Lo/epl;->getDefaultHighSystolic()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epl;->E:Ljava/util/ArrayList;

    .line 131
    invoke-direct {p0}, Lo/epl;->getDefaultLowSystolic()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epl;->I:Ljava/util/ArrayList;

    .line 132
    invoke-direct {p0}, Lo/epl;->getDefaultHighDiastolic()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epl;->G:Ljava/util/ArrayList;

    .line 133
    invoke-direct {p0}, Lo/epl;->getDefaultLowDiastolic()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epl;->H:Ljava/util/ArrayList;

    .line 134
    const/high16 v0, 0x40400000    # 3.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iput v0, p0, Lo/epl;->y:I

    .line 135
    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iput v0, p0, Lo/epl;->v:I

    .line 136
    const/high16 v0, 0x40900000    # 4.5f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iput v0, p0, Lo/epl;->u:I

    .line 137
    const v0, 0x41da6666    # 27.3f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iput v0, p0, Lo/epl;->x:I

    .line 138
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 169
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/epl;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 170
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 171
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 172
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/epl;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 173
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 174
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 175
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 176
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epl;->b:Landroid/graphics/Paint;

    .line 177
    iget-object v0, p0, Lo/epl;->b:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 178
    iget-object v0, p0, Lo/epl;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 180
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 182
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 183
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 184
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 185
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 186
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 180
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_1
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v4, v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 191
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 192
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 193
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 194
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 195
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 196
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 197
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 198
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 199
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epl;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epl;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 189
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 202
    :cond_1
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 203
    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    iget v1, p0, Lo/epl;->t:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 204
    iget-object v0, p0, Lo/epl;->F:Ljava/util/ArrayList;

    iget v1, p0, Lo/epl;->r:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 205
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 206
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 208
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 209
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    iget v1, p0, Lo/epl;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epl;->B:[Landroid/graphics/Point;

    iget v2, p0, Lo/epl;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epl;->y:I

    add-int/2addr v1, v2

    .line 210
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epl;->b(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epl;->n:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epl;->d:Landroid/graphics/Paint;

    .line 209
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 211
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 212
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    iget v1, p0, Lo/epl;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epl;->z:[Landroid/graphics/Point;

    iget v2, p0, Lo/epl;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epl;->y:I

    sub-int/2addr v1, v2

    .line 213
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epl;->b(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epl;->d:Landroid/graphics/Paint;

    .line 212
    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 215
    :cond_2
    return-void
.end method

.method private b(F)I
    .locals 2

    .line 404
    iget-object v0, p0, Lo/epl;->i:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 10

    .line 251
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 252
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/epl;->f:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 256
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 257
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 258
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v7, v0, v8

    .line 259
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 261
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 262
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v7, v0, v8

    .line 263
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 256
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 266
    :cond_0
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    :goto_1
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v8, v0, :cond_1

    .line 267
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 268
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 269
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    aget-object v7, v0, v8

    .line 270
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 272
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 273
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    aget-object v7, v0, v8

    .line 274
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 266
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 277
    :cond_1
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 278
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const v1, 0x3dcccccd    # 0.1f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 279
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 280
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 281
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 282
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 283
    iget-object v0, p0, Lo/epl;->a:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure_nodata_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 284
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v9

    .line 285
    iget v0, p0, Lo/epl;->g:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v9, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epl;->m:I

    iget v2, p0, Lo/epl;->u:I

    add-int/2addr v1, v2

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {p0, v2}, Lo/epl;->b(F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 287
    :cond_2
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 12

    .line 221
    iget-object v0, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 222
    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 223
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 224
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 225
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 228
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 229
    iget v0, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v8, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 230
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 231
    const/4 v11, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v11, v0, :cond_1

    .line 232
    iget-object v0, p0, Lo/epl;->M:Ljava/util/ArrayList;

    iget v1, p0, Lo/epl;->l:I

    iget v2, p0, Lo/epl;->g:I

    iget v3, p0, Lo/epl;->l:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x6

    mul-int/2addr v2, v11

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_0

    .line 234
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/fee;->d(J)Ljava/lang/String;

    move-result-object v6

    .line 235
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 236
    iget v0, p0, Lo/epl;->l:I

    iget v1, p0, Lo/epl;->g:I

    iget v2, p0, Lo/epl;->l:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epl;->m:I

    iget v2, p0, Lo/epl;->u:I

    add-int/2addr v1, v2

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {p0, v2}, Lo/epl;->b(F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 237
    if-eqz v11, :cond_0

    .line 238
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epl;->K:Ljava/util/ArrayList;

    add-int/lit8 v2, v11, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    iget-object v0, p0, Lo/epl;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 240
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 241
    iget v0, p0, Lo/epl;->l:I

    iget v1, p0, Lo/epl;->g:I

    iget v2, p0, Lo/epl;->l:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epl;->m:I

    iget v2, p0, Lo/epl;->u:I

    add-int/2addr v1, v2

    .line 242
    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {p0, v2}, Lo/epl;->b(F)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v9

    int-to-float v1, v1

    iget-object v2, p0, Lo/epl;->d:Landroid/graphics/Paint;

    .line 241
    invoke-virtual {p1, v7, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 231
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 248
    :cond_1
    return-void
.end method

.method private getAllPoints()V
    .locals 14

    .line 290
    const/4 v5, 0x0

    .line 291
    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epl;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epl;->A:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epl;->F:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    .line 292
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo/epl;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    .line 293
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo/epl;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo/epl;->F:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 295
    iget v0, p0, Lo/epl;->m:I

    iget v1, p0, Lo/epl;->p:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    iget v2, p0, Lo/epl;->q:I

    iget v3, p0, Lo/epl;->s:I

    sub-int/2addr v2, v3

    int-to-double v2, v2

    div-double v6, v0, v2

    .line 296
    const/4 v8, 0x0

    .line 297
    const/4 v9, 0x0

    .line 298
    const/4 v10, 0x0

    .line 299
    const/4 v11, 0x0

    .line 300
    const/4 v12, 0x0

    :goto_0
    iget-object v0, p0, Lo/epl;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 301
    iget v0, p0, Lo/epl;->m:I

    iget v1, p0, Lo/epl;->p:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epl;->C:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget v3, p0, Lo/epl;->s:I

    int-to-double v3, v3

    sub-double/2addr v1, v3

    mul-double/2addr v1, v6

    double-to-int v1, v1

    sub-int v8, v0, v1

    .line 302
    iget v0, p0, Lo/epl;->m:I

    iget v1, p0, Lo/epl;->p:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epl;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget v3, p0, Lo/epl;->s:I

    int-to-double v3, v3

    sub-double/2addr v1, v3

    mul-double/2addr v1, v6

    double-to-int v1, v1

    sub-int v9, v0, v1

    .line 303
    iget v0, p0, Lo/epl;->m:I

    iget v1, p0, Lo/epl;->p:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epl;->A:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget v3, p0, Lo/epl;->s:I

    int-to-double v3, v3

    sub-double/2addr v1, v3

    mul-double/2addr v1, v6

    double-to-int v1, v1

    sub-int v10, v0, v1

    .line 304
    iget v0, p0, Lo/epl;->m:I

    iget v1, p0, Lo/epl;->p:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epl;->F:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget v3, p0, Lo/epl;->s:I

    int-to-double v3, v3

    sub-double/2addr v1, v3

    mul-double/2addr v1, v6

    double-to-int v1, v1

    sub-int v11, v0, v1

    .line 306
    sub-int v0, v9, v8

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 307
    add-int v0, v8, v9

    div-int/lit8 v13, v0, 0x2

    .line 308
    move v8, v13

    .line 309
    move v9, v13

    .line 311
    :cond_0
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2, v8}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v12

    .line 312
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2, v9}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v12

    .line 314
    sub-int v0, v11, v10

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-direct {p0, v1}, Lo/epl;->b(F)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 315
    add-int v0, v10, v11

    div-int/lit8 v13, v0, 0x2

    .line 316
    move v10, v13

    .line 317
    move v11, v13

    .line 319
    :cond_1
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2, v10}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v12

    .line 320
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2, v11}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v12

    .line 321
    add-int/lit8 v5, v5, 0x1

    .line 300
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 324
    :cond_2
    move v6, v5

    :goto_1
    const/4 v0, 0x7

    if-ge v6, v0, :cond_3

    .line 325
    iget-object v0, p0, Lo/epl;->z:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lo/epl;->E:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v6

    .line 326
    iget-object v0, p0, Lo/epl;->w:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lo/epl;->I:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v6

    .line 327
    iget-object v0, p0, Lo/epl;->D:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lo/epl;->G:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v6

    .line 328
    iget-object v0, p0, Lo/epl;->B:[Landroid/graphics/Point;

    new-instance v1, Landroid/graphics/Point;

    iget-object v2, p0, Lo/epl;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lo/epl;->H:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    aput-object v1, v0, v6

    .line 324
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 330
    :cond_3
    return-void
.end method

.method private getDefaultHighDiastolic()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 377
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 378
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    const/high16 v0, 0x425c0000    # 55.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    const/high16 v0, 0x42480000    # 50.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    return-object v1
.end method

.method private getDefaultHighSystolic()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 353
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 354
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    const/high16 v0, 0x41c80000    # 25.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    const/high16 v0, 0x41700000    # 15.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    return-object v1
.end method

.method private getDefaultLowDiastolic()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 389
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 390
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    const/high16 v0, 0x428c0000    # 70.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    const/high16 v0, 0x42820000    # 65.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    const/high16 v0, 0x428c0000    # 70.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    const/high16 v0, 0x42820000    # 65.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    const/high16 v0, 0x428c0000    # 70.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    return-object v1
.end method

.method private getDefaultLowSystolic()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 365
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 366
    const/high16 v0, 0x42200000    # 40.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    const/high16 v0, 0x42200000    # 40.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    const/high16 v0, 0x42200000    # 40.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    const/high16 v0, 0x42340000    # 45.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    return-object v1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 159
    invoke-direct {p0, p1}, Lo/epl;->e(Landroid/graphics/Canvas;)V

    .line 161
    iget-object v0, p0, Lo/epl;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 162
    iget-object v0, p0, Lo/epl;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 163
    invoke-direct {p0}, Lo/epl;->getAllPoints()V

    .line 164
    invoke-direct {p0, p1}, Lo/epl;->d(Landroid/graphics/Canvas;)V

    .line 165
    invoke-direct {p0, p1}, Lo/epl;->a(Landroid/graphics/Canvas;)V

    .line 166
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 142
    iget-boolean v0, p0, Lo/epl;->o:Z

    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {p0}, Lo/epl;->getHeight()I

    move-result v0

    iput v0, p0, Lo/epl;->h:I

    .line 144
    invoke-virtual {p0}, Lo/epl;->getWidth()I

    move-result v0

    iput v0, p0, Lo/epl;->g:I

    .line 145
    iget v0, p0, Lo/epl;->m:I

    if-nez v0, :cond_0

    .line 146
    iget v0, p0, Lo/epl;->h:I

    iget v1, p0, Lo/epl;->x:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/epl;->m:I

    .line 147
    :cond_0
    const/high16 v0, 0x41980000    # 19.0f

    invoke-direct {p0, v0}, Lo/epl;->b(F)I

    move-result v0

    iput v0, p0, Lo/epl;->l:I

    .line 148
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epl;->o:Z

    .line 150
    :cond_1
    return-void
.end method

.method public setData(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IIII)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Long;>;IIII)V"
        }
    .end annotation

    .line 336
    if-eqz p5, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    if-nez p4, :cond_1

    .line 338
    :cond_0
    const-string v0, "UIHLH_BloodPressureCurve"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setData data error, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-void

    .line 341
    :cond_1
    iput p6, p0, Lo/epl;->q:I

    .line 342
    iput p7, p0, Lo/epl;->s:I

    .line 343
    iput-object p5, p0, Lo/epl;->K:Ljava/util/ArrayList;

    .line 344
    iput-object p1, p0, Lo/epl;->C:Ljava/util/ArrayList;

    .line 345
    iput-object p2, p0, Lo/epl;->j:Ljava/util/ArrayList;

    .line 346
    iput-object p3, p0, Lo/epl;->A:Ljava/util/ArrayList;

    .line 347
    iput-object p4, p0, Lo/epl;->F:Ljava/util/ArrayList;

    .line 348
    iput p8, p0, Lo/epl;->t:I

    .line 349
    iput p9, p0, Lo/epl;->r:I

    .line 350
    return-void
.end method
