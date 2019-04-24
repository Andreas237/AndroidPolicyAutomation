.class public Lo/chq;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:Landroid/graphics/RectF;

.field private C:F

.field private D:Landroid/graphics/Paint;

.field private E:F

.field private F:F

.field private G:F

.field private H:F

.field private I:Z

.field private J:Z

.field private K:I

.field private L:I

.field private M:Z

.field private N:F

.field private O:Landroid/graphics/Paint;

.field private P:Landroid/graphics/Paint;

.field private Q:[F

.field private R:Lo/chr;

.field private S:Lo/chr;

.field private T:F

.field private U:[F

.field private V:F

.field private W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private a:I

.field private aa:I

.field private ab:Z

.field private ac:I

.field private ad:I

.field private ae:Landroid/graphics/Paint;

.field private af:I

.field private ag:I

.field private ah:Landroid/graphics/Paint;

.field private ai:I

.field private aj:F

.field private ak:Landroid/content/Context;

.field private al:I

.field private am:I

.field private an:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chr;>;"
        }
    .end annotation
.end field

.field private ao:I

.field private aq:F

.field private ar:I

.field private b:F

.field private c:F

.field private d:F

.field private e:I

.field private f:F

.field private g:Landroid/graphics/Paint;

.field private h:F

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Paint;

.field private k:I

.field private l:Landroid/graphics/Paint;

.field private m:F

.field private n:Landroid/graphics/Paint;

.field private o:[I

.field private p:I

.field private q:Landroid/graphics/Path;

.field private r:F

.field private s:F

.field private t:Landroid/graphics/Path;

.field private u:F

.field private v:F

.field private w:Landroid/graphics/Paint;

.field private x:F

.field private y:I

.field private z:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 210
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->d:F

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->b:F

    .line 56
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/chq;->f:F

    .line 61
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->k:I

    .line 66
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->p:I

    .line 73
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/chq;->u:F

    .line 74
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    .line 75
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    .line 90
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lo/chq;->C:F

    .line 105
    const/4 v0, 0x6

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->Q:[F

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->W:Ljava/util/List;

    .line 108
    const/high16 v0, 0x4f000000

    iput v0, p0, Lo/chq;->T:F

    .line 110
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->U:[F

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ac:I

    .line 114
    const-string v0, "#AFAFB0"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->ag:I

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ad:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ai:I

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->an:Ljava/util/List;

    .line 197
    const v0, -0xbbbbbc

    iput v0, p0, Lo/chq;->ao:I

    .line 202
    const/4 v0, 0x2

    iput v0, p0, Lo/chq;->ar:I

    .line 207
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/chq;->aq:F

    .line 227
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    .line 228
    iget-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 230
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    .line 231
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 232
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 234
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    .line 235
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 236
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 237
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    .line 238
    iget-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 240
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    .line 241
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 242
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 243
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    .line 246
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    .line 247
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 249
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    .line 250
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 251
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 252
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->O:Landroid/graphics/Paint;

    .line 211
    invoke-direct {p0, p1}, Lo/chq;->e(Landroid/content/Context;)V

    .line 212
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 216
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->d:F

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->b:F

    .line 56
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/chq;->f:F

    .line 61
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->k:I

    .line 66
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->p:I

    .line 73
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/chq;->u:F

    .line 74
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    .line 75
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    .line 90
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lo/chq;->C:F

    .line 105
    const/4 v0, 0x6

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->Q:[F

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->W:Ljava/util/List;

    .line 108
    const/high16 v0, 0x4f000000

    iput v0, p0, Lo/chq;->T:F

    .line 110
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->U:[F

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ac:I

    .line 114
    const-string v0, "#AFAFB0"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->ag:I

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ad:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ai:I

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->an:Ljava/util/List;

    .line 197
    const v0, -0xbbbbbc

    iput v0, p0, Lo/chq;->ao:I

    .line 202
    const/4 v0, 0x2

    iput v0, p0, Lo/chq;->ar:I

    .line 207
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/chq;->aq:F

    .line 227
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    .line 228
    iget-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 230
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    .line 231
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 232
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 234
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    .line 235
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 236
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 237
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    .line 238
    iget-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 240
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    .line 241
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 242
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 243
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    .line 246
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    .line 247
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 249
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    .line 250
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 251
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 252
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->O:Landroid/graphics/Paint;

    .line 217
    invoke-direct {p0, p1}, Lo/chq;->e(Landroid/content/Context;)V

    .line 218
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 222
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->d:F

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->b:F

    .line 56
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/chq;->f:F

    .line 61
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->k:I

    .line 66
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->p:I

    .line 73
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/chq;->u:F

    .line 74
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    .line 75
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    .line 90
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lo/chq;->C:F

    .line 105
    const/4 v0, 0x6

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->Q:[F

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->W:Ljava/util/List;

    .line 108
    const/high16 v0, 0x4f000000

    iput v0, p0, Lo/chq;->T:F

    .line 110
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->U:[F

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ac:I

    .line 114
    const-string v0, "#AFAFB0"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/chq;->ag:I

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ad:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->ai:I

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chq;->an:Ljava/util/List;

    .line 197
    const v0, -0xbbbbbc

    iput v0, p0, Lo/chq;->ao:I

    .line 202
    const/4 v0, 0x2

    iput v0, p0, Lo/chq;->ar:I

    .line 207
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/chq;->aq:F

    .line 227
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    .line 228
    iget-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 230
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    .line 231
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 232
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 234
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    .line 235
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 236
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 237
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    .line 238
    iget-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 240
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    .line 241
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 242
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 243
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    .line 246
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    .line 247
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 249
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    .line 250
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 251
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 252
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->O:Landroid/graphics/Paint;

    .line 223
    invoke-direct {p0, p1}, Lo/chq;->e(Landroid/content/Context;)V

    .line 224
    return-void
.end method

.method static synthetic a(Lo/chq;F)F
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/chq;->g(F)F

    move-result v0

    return v0
.end method

.method private a()V
    .locals 3

    .line 350
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v0}, Lo/chr;->b()F

    move-result v0

    iget-object v1, p0, Lo/chq;->R:Lo/chr;

    invoke-virtual {v1}, Lo/chr;->b()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 351
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->s:F

    .line 352
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v0}, Lo/chr;->b()F

    move-result v0

    iget-object v1, p0, Lo/chq;->R:Lo/chr;

    invoke-virtual {v1}, Lo/chr;->b()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, p0, Lo/chq;->V:F

    .line 353
    invoke-direct {p0}, Lo/chq;->getDrawBaseLine()F

    move-result v0

    iget v1, p0, Lo/chq;->y:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-direct {p0}, Lo/chq;->getCalloutHeight()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->V:F

    div-float/2addr v0, v1

    iput v0, p0, Lo/chq;->h:F

    goto :goto_0

    .line 355
    :cond_0
    iget-object v0, p0, Lo/chq;->R:Lo/chr;

    invoke-virtual {v0}, Lo/chr;->b()F

    move-result v0

    iput v0, p0, Lo/chq;->s:F

    .line 356
    invoke-direct {p0}, Lo/chq;->getDrawBaseLine()F

    move-result v0

    iget v1, p0, Lo/chq;->y:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-direct {p0}, Lo/chq;->getCalloutHeight()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v1}, Lo/chr;->b()F

    move-result v1

    iget-object v2, p0, Lo/chq;->R:Lo/chr;

    invoke-virtual {v2}, Lo/chr;->b()F

    move-result v2

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lo/chq;->h:F

    .line 358
    :goto_0
    invoke-direct {p0}, Lo/chq;->k()V

    .line 359
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 2

    .line 578
    iget v0, p0, Lo/chq;->ad:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/chq;->ai:I

    if-eqz v0, :cond_0

    .line 579
    invoke-direct {p0, p1}, Lo/chq;->g(Landroid/graphics/Canvas;)V

    .line 582
    :cond_0
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    invoke-direct {p0, v0}, Lo/chq;->e(Landroid/graphics/Paint;)V

    .line 583
    iget-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    iget-object v1, p0, Lo/chq;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 584
    invoke-direct {p0, p1}, Lo/chq;->c(Landroid/graphics/Canvas;)V

    .line 585
    return-void
.end method

.method private a([F)V
    .locals 8

    .line 715
    invoke-direct {p0}, Lo/chq;->getButtomZone()F

    move-result v3

    .line 716
    invoke-direct {p0}, Lo/chq;->getTopZone()F

    move-result v4

    .line 717
    sub-float v5, v4, v3

    .line 718
    const/4 v6, 0x0

    .line 719
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/chq;->Q:[F

    array-length v0, v0

    if-ge v7, v0, :cond_1

    .line 721
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget-object v1, p0, Lo/chq;->Q:[F

    aget v1, v1, v7

    sub-float v1, v4, v1

    div-float/2addr v1, v5

    const v2, 0x38d1b717    # 1.0E-4f

    add-float/2addr v1, v2

    aput v1, p1, v0

    .line 722
    iget-object v0, p0, Lo/chq;->Q:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_0

    .line 723
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget-object v1, p0, Lo/chq;->Q:[F

    add-int/lit8 v2, v7, 0x1

    aget v1, v1, v2

    sub-float v1, v4, v1

    div-float/2addr v1, v5

    aput v1, p1, v0

    goto :goto_1

    .line 725
    :cond_0
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p1, v0

    .line 719
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 728
    :cond_1
    return-void
.end method

.method private b(Landroid/graphics/PointF;Landroid/graphics/RectF;FFF)F
    .locals 2

    .line 652
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_0

    .line 653
    iget v0, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, p3

    sub-float/2addr v0, p5

    iput v0, p2, Landroid/graphics/RectF;->right:F

    .line 654
    iget v0, p2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, p3

    sub-float/2addr v0, p5

    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 655
    iget v0, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, p3

    sub-float p4, v0, p5

    goto :goto_0

    .line 656
    :cond_0
    iget v0, p2, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 657
    iget v0, p2, Landroid/graphics/RectF;->right:F

    iget v1, p2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    add-float/2addr v0, p5

    iput v0, p2, Landroid/graphics/RectF;->right:F

    .line 658
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    add-float p4, v0, p5

    .line 659
    iput p5, p2, Landroid/graphics/RectF;->left:F

    .line 661
    :cond_1
    :goto_0
    return p4
.end method

.method private b()V
    .locals 2

    .line 338
    iget v0, p0, Lo/chq;->T:F

    const/high16 v1, 0x435c0000    # 220.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 339
    invoke-direct {p0}, Lo/chq;->a()V

    goto :goto_0

    .line 341
    :cond_0
    invoke-direct {p0}, Lo/chq;->i()V

    .line 343
    :goto_0
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 11

    .line 555
    iget v0, p0, Lo/chq;->b:F

    iget v1, p0, Lo/chq;->af:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget-boolean v1, p0, Lo/chq;->ab:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lo/chq;->m:F

    goto :goto_0

    :cond_0
    iget v1, p0, Lo/chq;->f:F

    :goto_0
    add-float v4, v0, v1

    .line 556
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 557
    iget v0, p0, Lo/chq;->N:F

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 558
    iget v0, p0, Lo/chq;->e:I

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->x:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lo/chq;->getPaddingRight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v5, v3, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v1

    sub-float v6, v0, v1

    .line 559
    const/4 v7, 0x0

    :goto_1
    iget v0, p0, Lo/chq;->L:I

    add-int/lit8 v0, v0, 0x1

    if-ge v7, v0, :cond_3

    .line 560
    iget v0, p0, Lo/chq;->K:I

    mul-int/2addr v0, v7

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 561
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v9

    .line 562
    iget v0, p0, Lo/chq;->x:F

    iget v1, p0, Lo/chq;->K:I

    mul-int/2addr v1, v7

    int-to-float v1, v1

    iget v2, p0, Lo/chq;->N:F

    div-float/2addr v1, v2

    mul-float/2addr v1, v6

    add-float v10, v0, v1

    .line 563
    invoke-virtual {p0}, Lo/chq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 564
    iget v0, p0, Lo/chq;->e:I

    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->K:I

    mul-int/2addr v1, v7

    int-to-float v1, v1

    iget v2, p0, Lo/chq;->N:F

    div-float/2addr v1, v2

    mul-float/2addr v1, v6

    sub-float v10, v0, v1

    .line 565
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 567
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v0, v10

    iget v1, p0, Lo/chq;->e:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 568
    iget v0, p0, Lo/chq;->e:I

    int-to-float v0, v0

    sub-float v10, v0, v9

    .line 570
    :cond_2
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v10, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 559
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 572
    :cond_3
    return-void
.end method

.method private b(Ljava/util/List;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/chr;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 788
    new-instance v0, Lo/chq$5;

    invoke-direct {v0, p0}, Lo/chq$5;-><init>(Lo/chq;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/chr;

    iput-object v0, p0, Lo/chq;->S:Lo/chr;

    .line 794
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v0}, Lo/chr;->b()F

    move-result v0

    iput v0, p0, Lo/chq;->V:F

    .line 795
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "#"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v3}, Lo/chr;->b()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chr;->e(Ljava/lang/String;)V

    .line 796
    new-instance v0, Lo/chq$2;

    invoke-direct {v0, p0}, Lo/chq$2;-><init>(Lo/chq;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/chr;

    iput-object v0, p0, Lo/chq;->R:Lo/chr;

    .line 802
    iget-object v0, p0, Lo/chq;->R:Lo/chr;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "#"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lo/chq;->R:Lo/chr;

    invoke-virtual {v3}, Lo/chr;->b()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chr;->e(Ljava/lang/String;)V

    .line 803
    return-void
.end method

.method private c()V
    .locals 1

    .line 269
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-virtual {p0, v0}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chq;->aj:F

    .line 270
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {p0, v0}, Lo/chq;->d(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chq;->f:F

    .line 271
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {p0, v0}, Lo/chq;->d(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chq;->m:F

    .line 272
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 4

    .line 588
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chq;->R:Lo/chr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chq;->o:[I

    if-eqz v0, :cond_0

    .line 589
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    const-string v1, "#ec8900"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v2, v1}, Lo/chq;->c(Landroid/graphics/Canvas;Lo/chr;ZI)V

    .line 590
    iget-object v0, p0, Lo/chq;->R:Lo/chr;

    iget-object v1, p0, Lo/chq;->o:[I

    iget-object v2, p0, Lo/chq;->o:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lo/chq;->c(Landroid/graphics/Canvas;Lo/chr;ZI)V

    .line 592
    :cond_0
    return-void
.end method

.method private c(Landroid/graphics/Canvas;FFFFF)V
    .locals 6

    .line 508
    const/4 v3, 0x0

    :goto_0
    int-to-float v0, v3

    iget v1, p0, Lo/chq;->v:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 509
    iget v0, p0, Lo/chq;->b:F

    int-to-float v1, v3

    mul-float/2addr v1, p3

    sub-float v4, v0, v1

    .line 510
    if-lez v3, :cond_1

    .line 511
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/chq;->s:F

    int-to-float v2, v3

    mul-float/2addr v2, p2

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v4

    iget-object v2, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-direct {p0, v2}, Lo/chq;->d(Landroid/graphics/Paint;)F

    move-result v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p6, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 512
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 513
    invoke-virtual {v5, p4, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 514
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 515
    invoke-virtual {v5, p5, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 517
    :cond_0
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    invoke-direct {p0}, Lo/chq;->n()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 518
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 508
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 521
    :cond_2
    return-void
.end method

.method private c(Landroid/graphics/Canvas;Lo/chr;ZI)V
    .locals 20
    .param p2    # Lo/chr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 607
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/chq;->ab:Z

    if-eqz v0, :cond_1

    .line 608
    invoke-virtual/range {p2 .. p2}, Lo/chr;->e()Landroid/graphics/PointF;

    move-result-object v7

    .line 609
    if-eqz p3, :cond_0

    .line 610
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chq;->ae:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/chq;->am:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 612
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chq;->ae:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/chq;->al:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 614
    :goto_0
    iget v0, v7, Landroid/graphics/PointF;->x:F

    iget v1, v7, Landroid/graphics/PointF;->y:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/chq;->d:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/chq;->ae:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 615
    iget v0, v7, Landroid/graphics/PointF;->x:F

    iget v1, v7, Landroid/graphics/PointF;->y:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/chq;->d:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/chq;->ah:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 616
    return-void

    .line 618
    :cond_1
    move-object/from16 v0, p0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/chq;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v7, v0, v1

    .line 619
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chq;->O:Landroid/graphics/Paint;

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 620
    invoke-virtual/range {p2 .. p2}, Lo/chr;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 621
    return-void

    .line 624
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lo/chr;->e()Landroid/graphics/PointF;

    move-result-object v8

    .line 625
    invoke-virtual/range {p2 .. p2}, Lo/chr;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 627
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 629
    move-object/from16 v0, p0

    const/high16 v1, 0x41a80000    # 21.0f

    invoke-virtual {v0, v1}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v11, v0

    .line 630
    move-object/from16 v0, p0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v12, v0

    .line 631
    move-object/from16 v0, p0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {v0, v1}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v13, v0

    .line 632
    move-object/from16 v0, p0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Lo/chq;->c(F)I

    move-result v0

    int-to-float v14, v0

    .line 633
    move-object/from16 v0, p0

    move/from16 v1, p3

    move v2, v7

    move-object v3, v8

    move-object v4, v10

    move v5, v13

    move v6, v14

    invoke-direct/range {v0 .. v6}, Lo/chq;->d(ZFLandroid/graphics/PointF;Landroid/graphics/Path;FF)V

    .line 634
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chq;->O:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v10, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 635
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chq;->P:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v15

    .line 636
    new-instance v0, Landroid/graphics/RectF;

    iget v1, v8, Landroid/graphics/PointF;->x:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v15, v2

    sub-float/2addr v1, v2

    sub-float/2addr v1, v12

    iget v2, v8, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v7

    sub-float/2addr v2, v14

    sub-float/2addr v2, v11

    iget v3, v8, Landroid/graphics/PointF;->x:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v15, v4

    add-float/2addr v3, v4

    add-float/2addr v3, v12

    iget v4, v8, Landroid/graphics/PointF;->y:F

    sub-float/2addr v4, v7

    sub-float/2addr v4, v14

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v16, v0

    .line 638
    if-nez p3, :cond_3

    .line 639
    move-object/from16 v0, p0

    iget v0, v0, Lo/chq;->d:F

    invoke-direct/range {p0 .. p0}, Lo/chq;->getCalloutHeight()F

    move-result v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v1, v2}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v1, v2}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    move-object/from16 v1, v16

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 641
    :cond_3
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/chq;->e:I

    int-to-float v1, v1

    sub-float v17, v0, v1

    .line 642
    iget v0, v8, Landroid/graphics/PointF;->x:F

    move/from16 v18, v0

    .line 643
    const/high16 v19, 0x3f800000    # 1.0f

    .line 644
    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v2, v16

    move/from16 v3, v17

    move/from16 v4, v18

    move/from16 v5, v19

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v5}, Lo/chq;->b(Landroid/graphics/PointF;Landroid/graphics/RectF;FFF)F

    move-result v18

    .line 646
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual/range {v16 .. v16}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/chq;->O:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move-object/from16 v4, v16

    invoke-virtual {v3, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 648
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual/range {v16 .. v16}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/chq;->P:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/chq;->d(Landroid/graphics/Paint;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/chq;->P:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    move/from16 v3, v18

    invoke-virtual {v2, v9, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 649
    return-void
.end method

.method private d(Landroid/graphics/Paint;)F
    .locals 2

    .line 680
    invoke-virtual {p1}, Landroid/graphics/Paint;->ascent()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Paint;->descent()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method static synthetic d(Lo/chq;F)F
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/chq;->h(F)F

    move-result v0

    return v0
.end method

.method private d()V
    .locals 4

    .line 329
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 331
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    iget-object v1, p0, Lo/chq;->W:Ljava/util/List;

    iget-object v2, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/chq;->b:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 332
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    iget-object v1, p0, Lo/chq;->W:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/chq;->b:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 333
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 335
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 294
    iget-boolean v0, p0, Lo/chq;->I:Z

    if-eqz v0, :cond_0

    .line 295
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/chq;->r:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    .line 296
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 297
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2, v1, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 298
    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/chq;->y:I

    .line 299
    goto :goto_0

    .line 300
    :cond_0
    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/chq;->y:I

    .line 302
    :goto_0
    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chq;->x:F

    .line 303
    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 304
    int-to-float v0, p1

    iget v1, p0, Lo/chq;->x:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lo/chq;->getPaddingRight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->aq:F

    iget-object v2, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/chq;->aj:F

    .line 306
    :cond_1
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 530
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->E:F

    .line 531
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/chr;

    .line 532
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    invoke-virtual {v7}, Lo/chr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 533
    invoke-virtual {v7}, Lo/chr;->b()F

    move-result v0

    iget v1, p0, Lo/chq;->G:F

    iget v2, p0, Lo/chq;->h:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v8, v0, v1

    .line 534
    move-object v0, p1

    iget-object v1, p0, Lo/chq;->B:Landroid/graphics/RectF;

    iget v2, p0, Lo/chq;->E:F

    move v3, v8

    iget-object v5, p0, Lo/chq;->D:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 535
    iget v0, p0, Lo/chq;->E:F

    add-float/2addr v0, v8

    iput v0, p0, Lo/chq;->E:F

    .line 536
    goto :goto_0

    .line 538
    :cond_0
    iget-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->H:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 539
    iget-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 540
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 541
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/chr;

    .line 542
    invoke-virtual {v7}, Lo/chr;->b()F

    move-result v0

    iget v1, p0, Lo/chq;->G:F

    iget v2, p0, Lo/chq;->h:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v8, v0, v1

    .line 543
    move-object v0, p1

    iget-object v1, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/chq;->F:F

    add-float/2addr v1, v2

    iget v2, p0, Lo/chq;->C:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget-object v3, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lo/chq;->F:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/chq;->C:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget-object v5, p0, Lo/chq;->j:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 544
    iget-object v0, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v8, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 545
    goto :goto_1

    .line 546
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 548
    return-void
.end method

.method private d(ZFLandroid/graphics/PointF;Landroid/graphics/Path;FF)V
    .locals 3

    .line 666
    if-eqz p1, :cond_0

    .line 667
    iget v0, p3, Landroid/graphics/PointF;->x:F

    iget v1, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 668
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    sub-float/2addr v0, v1

    iget v1, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p2

    sub-float/2addr v1, p6

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 669
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v0, v1

    iget v1, p3, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p2

    sub-float/2addr v1, p6

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 670
    invoke-virtual {p4}, Landroid/graphics/Path;->close()V

    goto :goto_0

    .line 672
    :cond_0
    iget v0, p3, Landroid/graphics/PointF;->x:F

    iget v1, p3, Landroid/graphics/PointF;->y:F

    add-float/2addr v1, p2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 673
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    sub-float/2addr v0, v1

    iget v1, p3, Landroid/graphics/PointF;->y:F

    add-float/2addr v1, p2

    add-float/2addr v1, p6

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 674
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v0, v1

    iget v1, p3, Landroid/graphics/PointF;->y:F

    add-float/2addr v1, p2

    add-float/2addr v1, p6

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 675
    invoke-virtual {p4}, Landroid/graphics/Path;->close()V

    .line 677
    :goto_0
    return-void
.end method

.method private d(Lo/chr;)Z
    .locals 3

    .line 432
    invoke-virtual {p1}, Lo/chr;->b()F

    move-result v0

    iget v1, p0, Lo/chq;->T:F

    iget v2, p0, Lo/chq;->h:F

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p1}, Lo/chr;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(F)F
    .locals 3

    .line 160
    iget v0, p0, Lo/chq;->T:F

    const/high16 v1, 0x435c0000    # 220.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 161
    invoke-direct {p0}, Lo/chq;->getDrawBaseLine()F

    move-result v0

    iget v1, p0, Lo/chq;->s:F

    sub-float v1, p1, v1

    iget v2, p0, Lo/chq;->h:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0

    .line 163
    :cond_0
    iget v0, p0, Lo/chq;->y:I

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->d:F

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/chq;->r:F

    sub-float/2addr v1, p1

    iget v2, p0, Lo/chq;->h:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private e()V
    .locals 2

    .line 313
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    .line 314
    :cond_0
    invoke-direct {p0}, Lo/chq;->f()V

    .line 316
    iget v0, p0, Lo/chq;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 317
    iget-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 318
    invoke-direct {p0}, Lo/chq;->b()V

    .line 320
    invoke-direct {p0}, Lo/chq;->g()V

    .line 321
    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 322
    invoke-direct {p0}, Lo/chq;->h()V

    .line 323
    invoke-direct {p0}, Lo/chq;->d()V

    .line 326
    :cond_1
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 5

    .line 256
    iput-object p1, p0, Lo/chq;->ak:Landroid/content/Context;

    .line 257
    invoke-direct {p0}, Lo/chq;->c()V

    .line 258
    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {p0, v0}, Lo/chq;->c(F)I

    move-result v0

    iput v0, p0, Lo/chq;->af:I

    .line 259
    iget-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 260
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->C:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 261
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/chq;->e:I

    int-to-float v1, v1

    iget v2, p0, Lo/chq;->a:I

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/chq;->B:Landroid/graphics/RectF;

    .line 262
    iget-object v0, p0, Lo/chq;->j:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 263
    const/4 v0, -0x1

    iput v0, p0, Lo/chq;->A:I

    .line 264
    iget-object v0, p0, Lo/chq;->P:Landroid/graphics/Paint;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 265
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->m:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 266
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 12

    .line 478
    iget v0, p0, Lo/chq;->r:F

    iget v1, p0, Lo/chq;->s:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->v:F

    div-float v7, v0, v1

    .line 479
    iget v0, p0, Lo/chq;->h:F

    mul-float v8, v7, v0

    .line 480
    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v0

    int-to-float v9, v0

    .line 481
    iget v0, p0, Lo/chq;->e:I

    invoke-virtual {p0}, Lo/chq;->getPaddingEnd()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v10, v0

    .line 482
    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v0

    int-to-float v11, v0

    .line 483
    invoke-direct {p0, v11}, Lo/chq;->k(F)F

    move-result v11

    .line 485
    iget v0, p0, Lo/chq;->T:F

    const/high16 v1, 0x435c0000    # 220.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 486
    iget-boolean v0, p0, Lo/chq;->ab:Z

    if-eqz v0, :cond_0

    .line 487
    return-void

    .line 489
    :cond_0
    move-object v0, p1

    move v1, v9

    move v3, v10

    iget-object v5, p0, Lo/chq;->w:Landroid/graphics/Paint;

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 490
    move-object v0, p1

    move v1, v9

    iget v2, p0, Lo/chq;->aa:I

    int-to-float v2, v2

    invoke-direct {p0, v2}, Lo/chq;->e(F)F

    move-result v2

    move v3, v10

    iget v4, p0, Lo/chq;->aa:I

    int-to-float v4, v4

    invoke-direct {p0, v4}, Lo/chq;->e(F)F

    move-result v4

    iget-object v5, p0, Lo/chq;->w:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 491
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/chq;->aa:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lo/chq;->aa:I

    int-to-float v1, v1

    invoke-direct {p0, v1}, Lo/chq;->e(F)F

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {p0, v2}, Lo/chq;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/chq;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v11, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 493
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, v7

    move v3, v8

    move v4, v9

    move v5, v10

    move v6, v11

    invoke-direct/range {v0 .. v6}, Lo/chq;->c(Landroid/graphics/Canvas;FFFFF)V

    .line 495
    :goto_0
    return-void
.end method

.method private e(Landroid/graphics/Paint;)V
    .locals 10

    .line 697
    invoke-direct {p0}, Lo/chq;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 698
    invoke-direct {p0}, Lo/chq;->getTopZone()F

    move-result v0

    invoke-direct {p0, v0}, Lo/chq;->e(F)F

    move-result v8

    .line 699
    invoke-direct {p0}, Lo/chq;->getButtomZone()F

    move-result v0

    invoke-direct {p0, v0}, Lo/chq;->e(F)F

    move-result v9

    .line 700
    new-instance v0, Landroid/graphics/LinearGradient;

    iget-object v5, p0, Lo/chq;->o:[I

    iget-object v6, p0, Lo/chq;->U:[F

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    move v2, v8

    const/4 v3, 0x0

    move v4, v9

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 701
    goto :goto_0

    .line 702
    :cond_0
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->p:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 704
    :goto_0
    return-void
.end method

.method private f()V
    .locals 6

    .line 436
    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 437
    iget v0, p0, Lo/chq;->C:F

    iget v1, p0, Lo/chq;->a:I

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/chq;->a:I

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lo/chq;->C:F

    :goto_0
    iput v0, p0, Lo/chq;->C:F

    .line 438
    iget-object v0, p0, Lo/chq;->D:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->C:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 439
    iget v0, p0, Lo/chq;->H:F

    iget v1, p0, Lo/chq;->C:F

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iget v0, p0, Lo/chq;->C:F

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    goto :goto_1

    :cond_1
    iget v0, p0, Lo/chq;->H:F

    :goto_1
    iput v0, p0, Lo/chq;->H:F

    .line 440
    iget v0, p0, Lo/chq;->a:I

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->C:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chq;->F:F

    .line 441
    iget-object v0, p0, Lo/chq;->B:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/chq;->F:F

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lo/chq;->F:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lo/chq;->F:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/chq;->z:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v5, p0, Lo/chq;->F:F

    add-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 443
    :cond_2
    return-void
.end method

.method private f(Landroid/graphics/Canvas;)V
    .locals 6

    .line 738
    iget-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->ag:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 739
    iget-object v0, p0, Lo/chq;->l:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 740
    move-object v0, p1

    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/chq;->b:F

    iget v3, p0, Lo/chq;->e:I

    invoke-virtual {p0}, Lo/chq;->getPaddingEnd()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lo/chq;->b:F

    iget-object v5, p0, Lo/chq;->l:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 741
    return-void
.end method

.method private g(F)F
    .locals 1

    .line 810
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget v0, p0, Lo/chq;->T:F

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method private g()V
    .locals 6

    .line 387
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 388
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/chr;

    .line 389
    invoke-virtual {v4}, Lo/chr;->b()F

    move-result v0

    iget v1, p0, Lo/chq;->s:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->h:F

    mul-float/2addr v0, v1

    invoke-virtual {v4, v0}, Lo/chr;->b(F)V

    .line 390
    iget v0, p0, Lo/chq;->aq:F

    invoke-virtual {v4, v0}, Lo/chr;->e(F)V

    .line 391
    invoke-virtual {v4}, Lo/chr;->a()Landroid/graphics/PointF;

    move-result-object v5

    .line 392
    invoke-virtual {p0}, Lo/chq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 393
    invoke-virtual {p0}, Lo/chq;->getPaddingStart()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->aj:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/chq;->aq:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, v5, Landroid/graphics/PointF;->x:F

    goto :goto_1

    .line 395
    :cond_0
    invoke-virtual {p0}, Lo/chq;->getPaddingEnd()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->aj:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/chq;->aq:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, v5, Landroid/graphics/PointF;->x:F

    .line 397
    :goto_1
    iget v0, p0, Lo/chq;->T:F

    const/high16 v1, 0x435c0000    # 220.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 398
    invoke-direct {p0}, Lo/chq;->getDrawBaseLine()F

    move-result v0

    invoke-virtual {v4}, Lo/chr;->d()F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, v5, Landroid/graphics/PointF;->y:F

    goto :goto_2

    .line 400
    :cond_1
    iget v0, p0, Lo/chq;->b:F

    iget v1, p0, Lo/chq;->c:F

    sub-float/2addr v0, v1

    invoke-virtual {v4}, Lo/chr;->d()F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, v5, Landroid/graphics/PointF;->y:F

    .line 387
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 404
    :cond_2
    return-void
.end method

.method private g(Landroid/graphics/Canvas;)V
    .locals 10

    .line 689
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 690
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v4, p0, Lo/chq;->b:F

    iget v5, p0, Lo/chq;->ai:I

    iget v6, p0, Lo/chq;->ad:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 691
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 692
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 693
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    invoke-virtual {p1, v0, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 694
    return-void
.end method

.method private getButtomZone()F
    .locals 3

    .line 707
    iget-object v0, p0, Lo/chq;->Q:[F

    iget-object v1, p0, Lo/chq;->Q:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    sub-float/2addr v0, v1

    return v0
.end method

.method private getCalloutHeight()F
    .locals 2

    .line 685
    iget-boolean v0, p0, Lo/chq;->ab:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41a80000    # 21.0f

    invoke-virtual {p0, v0}, Lo/chq;->c(F)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    add-int/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    :goto_0
    return v0
.end method

.method private getDrawBaseLine()F
    .locals 2

    .line 346
    iget v0, p0, Lo/chq;->b:F

    invoke-direct {p0}, Lo/chq;->getCalloutHeight()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    return v0
.end method

.method private getTopZone()F
    .locals 2

    .line 711
    iget-object v0, p0, Lo/chq;->Q:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method private h(F)F
    .locals 1

    .line 806
    iget v0, p0, Lo/chq;->T:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method private h()V
    .locals 11

    .line 407
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 408
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/chr;

    .line 410
    invoke-direct {p0, v8}, Lo/chq;->d(Lo/chr;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-virtual {v8}, Lo/chr;->e()Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    :cond_0
    goto :goto_0

    .line 414
    :cond_1
    const/4 v7, 0x0

    :goto_1
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 415
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 416
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/graphics/PointF;

    .line 417
    if-nez v7, :cond_2

    .line 418
    iget-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    iget v1, v8, Landroid/graphics/PointF;->x:F

    iget v2, v8, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 419
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    iget v1, v8, Landroid/graphics/PointF;->x:F

    iget v2, v8, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 421
    :cond_2
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_3

    .line 422
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    add-int/lit8 v1, v7, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/graphics/PointF;

    .line 423
    iget v0, v8, Landroid/graphics/PointF;->x:F

    iget v1, v9, Landroid/graphics/PointF;->x:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    .line 424
    iget-object v0, p0, Lo/chq;->q:Landroid/graphics/Path;

    move v1, v10

    iget v2, v8, Landroid/graphics/PointF;->y:F

    move v3, v10

    iget v4, v9, Landroid/graphics/PointF;->y:F

    iget v5, v9, Landroid/graphics/PointF;->x:F

    iget v6, v9, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 425
    iget-object v0, p0, Lo/chq;->t:Landroid/graphics/Path;

    move v1, v10

    iget v2, v8, Landroid/graphics/PointF;->y:F

    move v3, v10

    iget v4, v9, Landroid/graphics/PointF;->y:F

    iget v5, v9, Landroid/graphics/PointF;->x:F

    iget v6, v9, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 414
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 429
    :cond_4
    return-void
.end method

.method private i(F)I
    .locals 2

    .line 309
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, p1

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method private i()V
    .locals 4

    .line 377
    iget-boolean v0, p0, Lo/chq;->J:Z

    if-nez v0, :cond_1

    .line 379
    iget v0, p0, Lo/chq;->b:F

    iget v1, p0, Lo/chq;->y:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-direct {p0}, Lo/chq;->getCalloutHeight()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p0, v1}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/chq;->S:Lo/chr;

    invoke-virtual {v1}, Lo/chr;->b()F

    move-result v1

    iget v2, p0, Lo/chq;->s:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lo/chq;->h:F

    .line 380
    iget v0, p0, Lo/chq;->b:F

    iget v1, p0, Lo/chq;->y:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->h:F

    div-float v3, v0, v1

    .line 381
    iget v0, p0, Lo/chq;->r:F

    invoke-direct {p0, v3}, Lo/chq;->i(F)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-direct {p0, v3}, Lo/chq;->i(F)I

    move-result v0

    int-to-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lo/chq;->r:F

    :goto_0
    iput v0, p0, Lo/chq;->r:F

    .line 383
    :cond_1
    iget v0, p0, Lo/chq;->b:F

    iget v1, p0, Lo/chq;->y:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->d:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lo/chq;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->r:F

    div-float/2addr v0, v1

    iput v0, p0, Lo/chq;->h:F

    .line 384
    return-void
.end method

.method private k(F)F
    .locals 2

    .line 498
    invoke-virtual {p0}, Lo/chq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 499
    iget v0, p0, Lo/chq;->e:I

    invoke-virtual {p0}, Lo/chq;->getPaddingEnd()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float p1, v0

    .line 500
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    goto :goto_0

    .line 502
    :cond_0
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 504
    :goto_0
    return p1
.end method

.method private k()V
    .locals 4

    .line 362
    iget-object v0, p0, Lo/chq;->o:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v2, v0, [I

    .line 363
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_0

    .line 364
    iget-object v0, p0, Lo/chq;->o:[I

    div-int/lit8 v1, v3, 0x2

    aget v0, v0, v1

    aput v0, v2, v3

    .line 363
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 366
    :cond_0
    iput-object v2, p0, Lo/chq;->o:[I

    .line 367
    iget-object v0, p0, Lo/chq;->o:[I

    array-length v0, v0

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chq;->U:[F

    .line 368
    iget-object v0, p0, Lo/chq;->U:[F

    invoke-direct {p0, v0}, Lo/chq;->a([F)V

    .line 369
    return-void
.end method

.method private l()Z
    .locals 2

    .line 731
    iget-object v0, p0, Lo/chq;->o:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chq;->o:[I

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lo/chq;->Q:[F

    array-length v0, v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private n()Landroid/graphics/DashPathEffect;
    .locals 3

    .line 524
    new-instance v2, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iget v1, p0, Lo/chq;->u:F

    invoke-direct {v2, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 525
    return-object v2

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40800000    # 4.0f
    .end array-data
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .line 551
    invoke-virtual {p0, p1}, Lo/chq;->c(F)I

    move-result v0

    iput v0, p0, Lo/chq;->af:I

    .line 552
    return-void
.end method

.method public a(J)V
    .locals 2

    .line 982
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 983
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chq;->ab:Z

    .line 984
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->ae:Landroid/graphics/Paint;

    .line 985
    iget-object v0, p0, Lo/chq;->ae:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 986
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chq;->ah:Landroid/graphics/Paint;

    .line 987
    iget-object v0, p0, Lo/chq;->ah:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 988
    iget-object v0, p0, Lo/chq;->ah:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 991
    :cond_0
    return-void
.end method

.method public b(F)V
    .locals 3

    .line 862
    iput p1, p0, Lo/chq;->m:F

    .line 863
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->m:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 864
    iget v0, p0, Lo/chq;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->m:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chq;->b:F

    .line 865
    iget v0, p0, Lo/chq;->e:I

    if-lez v0, :cond_0

    .line 866
    invoke-direct {p0}, Lo/chq;->e()V

    .line 868
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 978
    int-to-float v0, p1

    iput v0, p0, Lo/chq;->T:F

    .line 979
    return-void
.end method

.method public c(F)I
    .locals 3

    .line 944
    iget-object v0, p0, Lo/chq;->ak:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 945
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public c(II)V
    .locals 2

    .line 871
    iput p1, p0, Lo/chq;->k:I

    .line 872
    iget-object v0, p0, Lo/chq;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 873
    iget-object v0, p0, Lo/chq;->w:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 874
    iput p2, p0, Lo/chq;->ag:I

    .line 875
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 974
    iput-boolean p1, p0, Lo/chq;->J:Z

    .line 975
    return-void
.end method

.method public d(F)I
    .locals 3

    .line 954
    iget-object v0, p0, Lo/chq;->ak:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 955
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 835
    iput p1, p0, Lo/chq;->ar:I

    .line 836
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/chr;>;)V"
        }
    .end annotation

    .line 758
    const-string v0, "%%s %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/chq;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 759
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 760
    const/4 v0, 0x0

    iput v0, p0, Lo/chq;->G:F

    .line 762
    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 763
    invoke-virtual {p0}, Lo/chq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 764
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 767
    :cond_0
    invoke-direct {p0, p1, v4}, Lo/chq;->b(Ljava/util/List;Ljava/lang/String;)V

    .line 768
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 769
    iget-boolean v0, p0, Lo/chq;->I:Z

    if-nez v0, :cond_1

    iget v0, p0, Lo/chq;->r:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 770
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/chr;

    invoke-virtual {v0}, Lo/chr;->b()F

    move-result v0

    iput v0, p0, Lo/chq;->r:F

    .line 772
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/chr;

    .line 773
    iget-boolean v0, p0, Lo/chq;->I:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 774
    :cond_2
    iget v0, p0, Lo/chq;->r:F

    invoke-virtual {v6}, Lo/chr;->b()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    iget v0, p0, Lo/chq;->r:F

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Lo/chr;->b()F

    move-result v0

    :goto_1
    iput v0, p0, Lo/chq;->r:F

    .line 776
    :cond_4
    iget v0, p0, Lo/chq;->G:F

    invoke-virtual {v6}, Lo/chr;->b()F

    move-result v1

    iget v2, p0, Lo/chq;->s:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/chq;->G:F

    .line 777
    goto :goto_0

    .line 778
    :cond_5
    iget v0, p0, Lo/chq;->e:I

    if-lez v0, :cond_6

    .line 780
    iget v0, p0, Lo/chq;->e:I

    invoke-direct {p0, v0}, Lo/chq;->d(I)V

    .line 781
    invoke-direct {p0}, Lo/chq;->e()V

    .line 783
    :cond_6
    invoke-virtual {p0}, Lo/chq;->postInvalidate()V

    .line 785
    :cond_7
    return-void
.end method

.method public getChartStyle()I
    .locals 1

    .line 827
    iget v0, p0, Lo/chq;->ar:I

    return v0
.end method

.method public getFillColorBottom()I
    .locals 1

    .line 124
    iget v0, p0, Lo/chq;->ad:I

    return v0
.end method

.method public getFillColorTop()I
    .locals 1

    .line 132
    iget v0, p0, Lo/chq;->ai:I

    return v0
.end method

.method public getHCoordinate()F
    .locals 1

    .line 878
    iget v0, p0, Lo/chq;->b:F

    return v0
.end method

.method public getNormalColor()I
    .locals 1

    .line 814
    iget v0, p0, Lo/chq;->ao:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    .line 848
    iget v0, p0, Lo/chq;->f:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 447
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 448
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 449
    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 450
    invoke-direct {p0, p1}, Lo/chq;->d(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 451
    :cond_0
    iget v0, p0, Lo/chq;->ar:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 452
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 453
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->p:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 454
    iget-object v0, p0, Lo/chq;->W:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lo/chq;->W:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lo/chq;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 455
    iget v0, p0, Lo/chq;->ac:I

    if-nez v0, :cond_2

    .line 456
    iget-object v0, p0, Lo/chq;->S:Lo/chr;

    const-string v1, "#ec8900"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v2, v1}, Lo/chq;->c(Landroid/graphics/Canvas;Lo/chr;ZI)V

    goto :goto_0

    .line 459
    :cond_1
    invoke-direct {p0, p1}, Lo/chq;->a(Landroid/graphics/Canvas;)V

    .line 461
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lo/chq;->f(Landroid/graphics/Canvas;)V

    .line 462
    iget-boolean v0, p0, Lo/chq;->I:Z

    if-eqz v0, :cond_3

    .line 463
    invoke-direct {p0, p1}, Lo/chq;->e(Landroid/graphics/Canvas;)V

    .line 467
    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lo/chq;->b(Landroid/graphics/Canvas;)V

    .line 468
    iget-boolean v0, p0, Lo/chq;->M:Z

    if-eqz v0, :cond_4

    .line 469
    const/4 v6, 0x0

    :goto_2
    const/4 v0, 0x6

    if-ge v6, v0, :cond_4

    .line 470
    iget-object v0, p0, Lo/chq;->Q:[F

    aget v0, v0, v6

    invoke-direct {p0, v0}, Lo/chq;->e(F)F

    move-result v7

    .line 471
    move-object v0, p1

    move v2, v7

    iget v1, p0, Lo/chq;->e:I

    int-to-float v3, v1

    move v4, v7

    iget-object v5, p0, Lo/chq;->l:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 469
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 474
    :cond_4
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 4

    .line 276
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 277
    iput p2, p0, Lo/chq;->a:I

    .line 278
    iget-boolean v0, p0, Lo/chq;->ab:Z

    if-eqz v0, :cond_0

    .line 279
    iget v0, p0, Lo/chq;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->m:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chq;->af:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chq;->b:F

    goto :goto_0

    .line 281
    :cond_0
    iget v0, p0, Lo/chq;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/chq;->m:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chq;->b:F

    .line 283
    :goto_0
    iput p1, p0, Lo/chq;->e:I

    .line 285
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    int-to-float v2, p2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/chq;->z:Landroid/graphics/PointF;

    .line 286
    iget-object v0, p0, Lo/chq;->an:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 287
    invoke-direct {p0, p1}, Lo/chq;->d(I)V

    .line 288
    invoke-direct {p0}, Lo/chq;->e()V

    .line 291
    :cond_1
    return-void
.end method

.method public setAbove(F)V
    .locals 0

    .line 928
    iput p1, p0, Lo/chq;->c:F

    .line 929
    return-void
.end method

.method public setAvgData(I)V
    .locals 0

    .line 169
    iput p1, p0, Lo/chq;->aa:I

    .line 170
    return-void
.end method

.method public varargs setExecelPaintShaderColors([I)V
    .locals 0

    .line 888
    iput-object p1, p0, Lo/chq;->o:[I

    .line 889
    return-void
.end method

.method public setFillColorBottom(I)V
    .locals 0

    .line 128
    iput p1, p0, Lo/chq;->ad:I

    .line 129
    return-void
.end method

.method public setFillColorTop(I)V
    .locals 0

    .line 136
    iput p1, p0, Lo/chq;->ai:I

    .line 137
    return-void
.end method

.method public setHCoordinate(F)V
    .locals 0

    .line 898
    iput p1, p0, Lo/chq;->b:F

    .line 899
    return-void
.end method

.method public setHeartRateZone(II)V
    .locals 3

    .line 146
    const/4 v0, 0x6

    new-array v0, v0, [F

    int-to-float v1, p1

    const/4 v2, 0x0

    aput v1, v0, v2

    int-to-float v1, p1

    const v2, 0x3f666666    # 0.9f

    mul-float/2addr v1, v2

    const/4 v2, 0x1

    aput v1, v0, v2

    int-to-float v1, p1

    const v2, 0x3f4ccccd    # 0.8f

    mul-float/2addr v1, v2

    const/4 v2, 0x2

    aput v1, v0, v2

    int-to-float v1, p1

    const v2, 0x3f333333    # 0.7f

    mul-float/2addr v1, v2

    const/4 v2, 0x3

    aput v1, v0, v2

    int-to-float v1, p1

    const v2, 0x3f19999a    # 0.6f

    mul-float/2addr v1, v2

    const/4 v2, 0x4

    aput v1, v0, v2

    int-to-float v1, p1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    const/4 v2, 0x5

    aput v1, v0, v2

    invoke-virtual {p0, v0}, Lo/chq;->setHeartRateZone([F)V

    .line 147
    return-void
.end method

.method public varargs setHeartRateZone([F)V
    .locals 6

    .line 155
    iput-object p1, p0, Lo/chq;->Q:[F

    .line 156
    const-string v0, "Track_SugChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "standed heartRate from:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/chq;->Q:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/chq;->Q:[F

    iget-object v4, p0, Lo/chq;->Q:[F

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    return-void
.end method

.method public setIntervalColor(I)V
    .locals 0

    .line 936
    iput p1, p0, Lo/chq;->A:I

    .line 937
    return-void
.end method

.method public setIntervalWidth(F)V
    .locals 0

    .line 940
    iput p1, p0, Lo/chq;->H:F

    .line 941
    return-void
.end method

.method public setLineColor(I)V
    .locals 0

    .line 907
    iput p1, p0, Lo/chq;->p:I

    .line 908
    return-void
.end method

.method public setLineWidth(F)V
    .locals 2

    .line 902
    iput p1, p0, Lo/chq;->d:F

    .line 903
    iget-object v0, p0, Lo/chq;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 904
    return-void
.end method

.method public setNormalColor(I)V
    .locals 0

    .line 822
    iput p1, p0, Lo/chq;->ao:I

    .line 823
    iput p1, p0, Lo/chq;->p:I

    .line 824
    return-void
.end method

.method public setSHowRegion(Z)V
    .locals 0

    .line 839
    iput-boolean p1, p0, Lo/chq;->M:Z

    .line 840
    invoke-virtual {p0}, Lo/chq;->postInvalidate()V

    .line 841
    return-void
.end method

.method public setTextSize(F)V
    .locals 2

    .line 856
    invoke-virtual {p0, p1}, Lo/chq;->d(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chq;->f:F

    .line 857
    iget v0, p0, Lo/chq;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/chq;->b:F

    .line 858
    iget-object v0, p0, Lo/chq;->g:Landroid/graphics/Paint;

    iget v1, p0, Lo/chq;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 859
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 120
    iput p1, p0, Lo/chq;->ac:I

    .line 121
    return-void
.end method

.method public setXnums(IIF)V
    .locals 0

    .line 963
    iput p1, p0, Lo/chq;->L:I

    .line 964
    iput p2, p0, Lo/chq;->K:I

    .line 965
    iput p3, p0, Lo/chq;->N:F

    .line 966
    return-void
.end method

.method public setYaxisValues(III)V
    .locals 2

    .line 918
    if-le p1, p2, :cond_0

    .line 919
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "min < max"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 921
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chq;->I:Z

    .line 922
    int-to-float v0, p2

    iput v0, p0, Lo/chq;->r:F

    .line 923
    int-to-float v0, p1

    iput v0, p0, Lo/chq;->s:F

    .line 924
    int-to-float v0, p3

    iput v0, p0, Lo/chq;->v:F

    .line 925
    return-void
.end method
