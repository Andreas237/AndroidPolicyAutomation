.class public Lo/bwo;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwo$d;
    }
.end annotation


# instance fields
.field private A:F

.field private B:I

.field private C:Landroid/graphics/Paint;

.field private D:Landroid/graphics/Paint;

.field private E:Landroid/graphics/Paint;

.field private F:Lo/bwn;

.field private G:Landroid/graphics/LinearGradient;

.field private H:Z

.field private I:I

.field private J:Landroid/graphics/PointF;

.field private K:I

.field private L:I

.field private M:I

.field private N:Lo/bwo$d;

.field private O:I

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bwn;>;"
        }
    .end annotation
.end field

.field private Q:I

.field private R:I

.field private S:F

.field private T:F

.field private U:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Path;>;"
        }
    .end annotation
.end field

.field private V:Landroid/graphics/Path;

.field private W:I

.field private a:F

.field private aa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Path;>;"
        }
    .end annotation
.end field

.field private b:F

.field private c:I

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/Paint;

.field private g:F

.field private h:I

.field private i:Landroid/graphics/Paint;

.field private j:I

.field private k:F

.field private l:[I

.field private m:I

.field private n:Landroid/graphics/Paint;

.field private o:Lo/bwn;

.field private p:F

.field private q:Z

.field private r:I

.field private s:Landroid/graphics/Paint;

.field private t:I

.field private u:I

.field private v:F

.field private w:Z

.field private x:I

.field private y:Landroid/graphics/Paint;

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 203
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->a:F

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->h:I

    .line 81
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/bwo;->k:F

    .line 94
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->r:I

    .line 95
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->u:I

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->q:Z

    .line 98
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->t:I

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->w:Z

    .line 114
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bwo;->A:F

    .line 115
    const/4 v0, 0x5

    iput v0, p0, Lo/bwo;->B:I

    .line 117
    const/16 v0, -0x3dcf

    iput v0, p0, Lo/bwo;->j:I

    .line 128
    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    .line 158
    const/high16 v0, -0x10000

    iput v0, p0, Lo/bwo;->O:I

    .line 163
    const v0, -0xbbbbbc

    iput v0, p0, Lo/bwo;->R:I

    .line 168
    const/4 v0, 0x2

    iput v0, p0, Lo/bwo;->W:I

    .line 178
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->T:F

    .line 179
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwo;->V:Landroid/graphics/Path;

    .line 182
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    .line 183
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    .line 184
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->D:Landroid/graphics/Paint;

    .line 185
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    .line 186
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    .line 187
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->s:Landroid/graphics/Paint;

    .line 188
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    .line 189
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    .line 190
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    .line 191
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    .line 192
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 193
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 194
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 196
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 197
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 198
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 199
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 497
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    .line 498
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->aa:Ljava/util/List;

    .line 204
    invoke-direct {p0, p1}, Lo/bwo;->b(Landroid/content/Context;)V

    .line 205
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 214
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->a:F

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->h:I

    .line 81
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/bwo;->k:F

    .line 94
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->r:I

    .line 95
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->u:I

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->q:Z

    .line 98
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->t:I

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->w:Z

    .line 114
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bwo;->A:F

    .line 115
    const/4 v0, 0x5

    iput v0, p0, Lo/bwo;->B:I

    .line 117
    const/16 v0, -0x3dcf

    iput v0, p0, Lo/bwo;->j:I

    .line 128
    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    .line 158
    const/high16 v0, -0x10000

    iput v0, p0, Lo/bwo;->O:I

    .line 163
    const v0, -0xbbbbbc

    iput v0, p0, Lo/bwo;->R:I

    .line 168
    const/4 v0, 0x2

    iput v0, p0, Lo/bwo;->W:I

    .line 178
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->T:F

    .line 179
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwo;->V:Landroid/graphics/Path;

    .line 182
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    .line 183
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    .line 184
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->D:Landroid/graphics/Paint;

    .line 185
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    .line 186
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    .line 187
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->s:Landroid/graphics/Paint;

    .line 188
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    .line 189
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    .line 190
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    .line 191
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    .line 192
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 193
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 194
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 196
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 197
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 198
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 199
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 497
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    .line 498
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->aa:Ljava/util/List;

    .line 215
    invoke-direct {p0, p1}, Lo/bwo;->b(Landroid/content/Context;)V

    .line 216
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 208
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->a:F

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->h:I

    .line 81
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/bwo;->k:F

    .line 94
    const-string v0, "#556A73"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->r:I

    .line 95
    const/4 v0, -0x1

    iput v0, p0, Lo/bwo;->u:I

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->q:Z

    .line 98
    const-string v0, "#ffe9d1ba"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwo;->t:I

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->w:Z

    .line 114
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bwo;->A:F

    .line 115
    const/4 v0, 0x5

    iput v0, p0, Lo/bwo;->B:I

    .line 117
    const/16 v0, -0x3dcf

    iput v0, p0, Lo/bwo;->j:I

    .line 128
    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    .line 158
    const/high16 v0, -0x10000

    iput v0, p0, Lo/bwo;->O:I

    .line 163
    const v0, -0xbbbbbc

    iput v0, p0, Lo/bwo;->R:I

    .line 168
    const/4 v0, 0x2

    iput v0, p0, Lo/bwo;->W:I

    .line 178
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->T:F

    .line 179
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwo;->V:Landroid/graphics/Path;

    .line 182
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    .line 183
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    .line 184
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->D:Landroid/graphics/Paint;

    .line 185
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    .line 186
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    .line 187
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->s:Landroid/graphics/Paint;

    .line 188
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    .line 189
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    .line 190
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    .line 191
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    .line 192
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 193
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 194
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 196
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 197
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 198
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 199
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 497
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    .line 498
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwo;->aa:Ljava/util/List;

    .line 209
    invoke-direct {p0, p1}, Lo/bwo;->b(Landroid/content/Context;)V

    .line 210
    return-void
.end method

.method private a()V
    .locals 2

    .line 236
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->T:F

    .line 237
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->S:F

    .line 238
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->g:F

    .line 239
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->k:F

    .line 240
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->v:F

    .line 241
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->z:F

    .line 242
    return-void
.end method

.method private a(F)V
    .locals 3

    .line 319
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    if-nez v0, :cond_0

    .line 320
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v2, v0

    .line 321
    invoke-static {v2}, Lo/buk;->c(F)I

    move-result v0

    iput v0, p0, Lo/bwo;->K:I

    .line 322
    goto :goto_0

    .line 323
    :cond_0
    invoke-static {p1}, Lo/buk;->b(F)I

    move-result v0

    iput v0, p0, Lo/bwo;->K:I

    .line 325
    :goto_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 12

    .line 365
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    if-nez v0, :cond_0

    .line 366
    return-void

    .line 368
    :cond_0
    iget v0, p0, Lo/bwo;->B:I

    int-to-float v6, v0

    .line 369
    invoke-direct {p0, v6}, Lo/bwo;->k(F)F

    move-result v6

    .line 371
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v7

    .line 372
    iget v0, v7, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget v1, v7, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr v0, v1

    int-to-float v8, v0

    .line 374
    iget v0, p0, Lo/bwo;->K:I

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/buk;->b(F)I

    move-result v9

    .line 375
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-static {v0}, Lo/buy;->c(Lo/bwn;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    iget v9, p0, Lo/bwo;->K:I

    .line 379
    :cond_1
    invoke-direct {p0, p1, v6, v8, v9}, Lo/bwo;->d(Landroid/graphics/Canvas;FFI)F

    move-result v10

    .line 380
    iget v0, p0, Lo/bwo;->a:F

    sub-float/2addr v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float v11, v0, v10

    .line 381
    move-object v0, p1

    iget v1, p0, Lo/bwo;->B:I

    int-to-float v1, v1

    move v2, v11

    iget v3, p0, Lo/bwo;->c:I

    iget v4, p0, Lo/bwo;->B:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    move v4, v11

    iget-object v5, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 383
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v3, v8

    move v4, v9

    move v5, v11

    invoke-direct/range {v0 .. v5}, Lo/bwo;->a(Landroid/graphics/Canvas;FFIF)V

    .line 384
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFIF)V
    .locals 6

    .line 402
    const-string v4, ""

    .line 403
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 404
    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Lo/bwo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event_pace_format:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 406
    div-int/lit8 v0, p4, 0x2

    mul-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 407
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    if-nez v0, :cond_1

    .line 408
    int-to-float v0, p4

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->h(D)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 410
    :cond_1
    int-to-float v0, p4

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 413
    :goto_0
    add-float v0, p5, p3

    iget-object v1, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, p2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 414
    return-void
.end method

.method private b(Landroid/graphics/Path;ILo/bwn;)Landroid/graphics/PointF;
    .locals 3

    .line 640
    invoke-virtual {p3}, Lo/bwn;->e()Landroid/graphics/PointF;

    move-result-object v2

    .line 641
    invoke-virtual {p3}, Lo/bwn;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 642
    invoke-direct {p0, p1, v2}, Lo/bwo;->d(Landroid/graphics/Path;Landroid/graphics/PointF;)V

    goto :goto_0

    .line 644
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bwo;->b(Landroid/graphics/Path;I)V

    .line 646
    :goto_0
    return-object v2
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 219
    invoke-direct {p0}, Lo/bwo;->a()V

    .line 220
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lo/bwo;->Q:I

    .line 222
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->k:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 223
    iget-object v0, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->r:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 224
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->v:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 225
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 227
    iget-object v0, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    iget-object v0, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 229
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 8

    .line 518
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bwn;

    .line 519
    invoke-virtual {v5}, Lo/bwn;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 520
    invoke-virtual {v5}, Lo/bwn;->e()Landroid/graphics/PointF;

    move-result-object v6

    .line 521
    iget-object v0, p0, Lo/bwo;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 522
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iget v1, v6, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lo/bwo;->z:F

    iget-object v3, p0, Lo/bwo;->s:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 523
    new-instance v7, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 524
    const/4 v0, -0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 525
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iget v1, v6, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lo/bwo;->z:F

    const/high16 v3, 0x40200000    # 2.5f

    div-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 527
    :cond_0
    goto :goto_0

    .line 528
    :cond_1
    return-void
.end method

.method private b(Landroid/graphics/Canvas;Lo/bwn;)V
    .locals 6

    .line 489
    invoke-virtual {p2}, Lo/bwn;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 490
    return-void

    .line 492
    :cond_0
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->u:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 493
    iget-object v0, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->I:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 494
    move-object v0, p1

    move-object v1, p2

    iget v2, p0, Lo/bwo;->z:F

    iget v3, p0, Lo/bwo;->c:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/bwo;->n:Landroid/graphics/Paint;

    iget-object v5, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    invoke-static/range {v0 .. v5}, Lo/buy;->a(Landroid/graphics/Canvas;Lo/bwn;FFLandroid/graphics/Paint;Landroid/graphics/Paint;)V

    .line 495
    return-void
.end method

.method private b(Landroid/graphics/Path;I)V
    .locals 5

    .line 650
    invoke-virtual {p1}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 651
    new-instance v3, Landroid/graphics/PathMeasure;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 652
    if-lez p2, :cond_0

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 653
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->e()Landroid/graphics/PointF;

    move-result-object v4

    .line 654
    iget v0, v4, Landroid/graphics/PointF;->x:F

    iget v1, v4, Landroid/graphics/PointF;->y:F

    const v2, 0x3a83126f    # 0.001f

    add-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 656
    :cond_0
    iget-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->w:Z

    .line 659
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 772
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 773
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bwn;

    .line 774
    iget v0, p0, Lo/bwo;->T:F

    invoke-virtual {v4, v0}, Lo/bwn;->e(F)Lo/bwn;

    .line 775
    invoke-virtual {v4}, Lo/bwn;->f()Landroid/graphics/PointF;

    move-result-object v5

    .line 776
    if-eqz v5, :cond_0

    .line 777
    iget v0, p0, Lo/bwo;->S:F

    add-int/lit8 v1, v3, 0x1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->T:F

    int-to-float v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, v5, Landroid/graphics/PointF;->x:F

    .line 779
    :cond_0
    iget v0, p0, Lo/bwo;->R:I

    invoke-virtual {v4, v0}, Lo/bwn;->e(I)Lo/bwn;

    .line 780
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 772
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 782
    :cond_1
    return-void
.end method

.method private b()Z
    .locals 2

    .line 304
    iget v0, p0, Lo/bwo;->a:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lo/bwo;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Landroid/graphics/Canvas;Landroid/graphics/Path;I)Z
    .locals 3

    .line 609
    const/4 v1, 0x0

    .line 610
    if-eqz p2, :cond_2

    .line 611
    if-gez p3, :cond_0

    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_0

    .line 612
    const/4 v0, 0x1

    return v0

    .line 614
    :cond_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bwn;

    .line 615
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 616
    const/4 v0, 0x1

    return v0

    .line 618
    :cond_1
    invoke-direct {p0, p2, p3, v1}, Lo/bwo;->b(Landroid/graphics/Path;ILo/bwn;)Landroid/graphics/PointF;

    move-result-object v2

    .line 619
    invoke-direct {p0, p2, p3, v2}, Lo/bwo;->c(Landroid/graphics/Path;ILandroid/graphics/PointF;)V

    .line 621
    :cond_2
    invoke-direct {p0, p1, v1}, Lo/bwo;->d(Landroid/graphics/Canvas;Lo/bwn;)V

    .line 622
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 5

    .line 274
    invoke-direct {p0}, Lo/bwo;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 275
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->H:Z

    .line 276
    invoke-direct {p0}, Lo/bwo;->i()V

    .line 277
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 278
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bwn;

    .line 279
    invoke-virtual {v3}, Lo/bwn;->f()Landroid/graphics/PointF;

    move-result-object v4

    .line 280
    invoke-direct {p0, v2, v4}, Lo/bwo;->d(ILandroid/graphics/PointF;)V

    .line 281
    iget v0, p0, Lo/bwo;->a:F

    iget v1, p0, Lo/bwo;->b:F

    sub-float/2addr v0, v1

    invoke-virtual {v3}, Lo/bwn;->m()F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/PointF;->y:F

    .line 282
    iget v0, p0, Lo/bwo;->R:I

    invoke-virtual {v3, v0}, Lo/bwn;->e(I)Lo/bwn;

    move-result-object v0

    iget v1, p0, Lo/bwo;->p:F

    invoke-virtual {v0, v1}, Lo/bwn;->d(F)Lo/bwn;

    move-result-object v0

    iget v1, p0, Lo/bwo;->T:F

    invoke-virtual {v0, v1}, Lo/bwn;->e(F)Lo/bwn;

    .line 277
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 284
    :cond_0
    invoke-direct {p0}, Lo/bwo;->e()V

    .line 286
    :cond_1
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 2

    .line 504
    iget-object v0, p0, Lo/bwo;->V:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 505
    invoke-direct {p0}, Lo/bwo;->g()V

    .line 507
    invoke-direct {p0, p1}, Lo/bwo;->h(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 508
    :cond_0
    invoke-direct {p0, p1}, Lo/bwo;->f(Landroid/graphics/Canvas;)V

    .line 509
    invoke-direct {p0, p1}, Lo/bwo;->i(Landroid/graphics/Canvas;)V

    .line 510
    iget v0, p0, Lo/bwo;->z:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 511
    invoke-direct {p0, p1}, Lo/bwo;->b(Landroid/graphics/Canvas;)V

    .line 513
    :cond_1
    invoke-direct {p0, p1}, Lo/bwo;->g(Landroid/graphics/Canvas;)V

    .line 514
    invoke-direct {p0}, Lo/bwo;->h()V

    .line 515
    return-void
.end method

.method private c(Landroid/graphics/Canvas;Lo/bwn;)V
    .locals 2

    .line 455
    invoke-virtual {p2}, Lo/bwn;->r()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/bwo;->D:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 457
    invoke-virtual {p2}, Lo/bwn;->c()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 458
    invoke-virtual {p2}, Lo/bwn;->b()Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/bwo;->D:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 460
    :cond_0
    invoke-virtual {p2}, Lo/bwn;->a()Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 461
    invoke-virtual {p2}, Lo/bwn;->d()Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/bwo;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 463
    :goto_0
    return-void
.end method

.method private c(Landroid/graphics/Path;ILandroid/graphics/PointF;)V
    .locals 3

    .line 626
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    iget-boolean v0, p0, Lo/bwo;->w:Z

    if-eqz v0, :cond_0

    .line 627
    new-instance v2, Landroid/graphics/PathMeasure;

    const/4 v0, 0x0

    invoke-direct {v2, p1, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 628
    invoke-direct {p0, p1, p2, p3, v2}, Lo/bwo;->e(Landroid/graphics/Path;ILandroid/graphics/PointF;Landroid/graphics/PathMeasure;)V

    .line 629
    iget-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 631
    :cond_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 765
    invoke-direct {p0, p1}, Lo/bwo;->e(Ljava/util/List;)V

    .line 766
    invoke-static {p1}, Lo/buy;->d(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lo/bwo;->h:I

    .line 768
    invoke-direct {p0, p1}, Lo/bwo;->b(Ljava/util/List;)V

    .line 769
    return-void
.end method

.method private d(F)F
    .locals 2

    .line 328
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 329
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->g()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float p1, v0, v1

    goto :goto_0

    .line 330
    :cond_0
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 331
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->g()F

    move-result p1

    goto :goto_0

    .line 332
    :cond_1
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 333
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->g()F

    move-result p1

    .line 335
    :cond_2
    :goto_0
    return p1
.end method

.method private d(Landroid/graphics/Canvas;FFI)F
    .locals 8

    .line 387
    const-string v6, ""

    .line 388
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->w()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 389
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Lo/bwo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event_pace_format:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 391
    mul-int/lit16 v0, p4, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 392
    goto :goto_0

    .line 393
    :cond_0
    int-to-double v0, p4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 395
    :goto_0
    const/high16 v7, 0x40000000    # 2.0f

    .line 396
    move-object v0, p1

    iget v1, p0, Lo/bwo;->B:I

    int-to-float v1, v1

    move v2, v7

    iget v3, p0, Lo/bwo;->c:I

    iget v4, p0, Lo/bwo;->B:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    move v4, v7

    iget-object v5, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 397
    add-float v0, v7, p3

    iget-object v1, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, p2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 398
    return v7
.end method

.method private d()V
    .locals 4

    .line 261
    iget-boolean v0, p0, Lo/bwo;->q:Z

    if-nez v0, :cond_1

    .line 262
    iget v0, p0, Lo/bwo;->x:I

    if-lez v0, :cond_0

    iget v0, p0, Lo/bwo;->W:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 263
    iget v0, p0, Lo/bwo;->c:I

    iget v1, p0, Lo/bwo;->B:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iget v1, p0, Lo/bwo;->x:I

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/bwo;->x:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->T:F

    .line 264
    iget v0, p0, Lo/bwo;->c:I

    iget v1, p0, Lo/bwo;->B:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/bwo;->T:F

    iget-object v2, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->S:F

    goto :goto_0

    .line 266
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/bwo;->S:F

    .line 267
    iget v0, p0, Lo/bwo;->c:I

    iget v1, p0, Lo/bwo;->B:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/bwo;->S:F

    iget-object v2, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->T:F

    .line 270
    :cond_1
    :goto_0
    return-void
.end method

.method private d(ILandroid/graphics/PointF;)V
    .locals 4

    .line 296
    iget v0, p0, Lo/bwo;->x:I

    if-lez v0, :cond_0

    iget v0, p0, Lo/bwo;->W:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 297
    iget v0, p0, Lo/bwo;->B:I

    int-to-float v0, v0

    iget v1, p0, Lo/bwo;->S:F

    int-to-float v2, p1

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->T:F

    int-to-float v2, p1

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/PointF;->x:F

    goto :goto_0

    .line 299
    :cond_0
    iget v0, p0, Lo/bwo;->B:I

    int-to-float v0, v0

    iget v1, p0, Lo/bwo;->S:F

    int-to-float v2, p1

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->T:F

    int-to-float v2, p1

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/PointF;->x:F

    .line 301
    :goto_0
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 2

    .line 357
    iget v0, p0, Lo/bwo;->W:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 358
    invoke-direct {p0, p1}, Lo/bwo;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 360
    :cond_0
    invoke-direct {p0, p1}, Lo/bwo;->c(Landroid/graphics/Canvas;)V

    .line 362
    :goto_0
    return-void
.end method

.method private d(Landroid/graphics/Canvas;Lo/bwn;)V
    .locals 6

    .line 466
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 467
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 468
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 469
    invoke-virtual {p2}, Lo/bwn;->e()Landroid/graphics/PointF;

    move-result-object v3

    .line 470
    invoke-virtual {p2}, Lo/bwn;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 471
    invoke-virtual {p2}, Lo/bwn;->p()Ljava/lang/String;

    move-result-object v4

    .line 472
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 473
    invoke-direct {p0, p1, p2, v3, v5}, Lo/bwo;->e(Landroid/graphics/Canvas;Lo/bwn;Landroid/graphics/PointF;F)V

    .line 476
    :cond_0
    return-void
.end method

.method private d(Landroid/graphics/Path;Landroid/graphics/PointF;)V
    .locals 2

    .line 662
    iget-boolean v0, p0, Lo/bwo;->w:Z

    if-nez v0, :cond_0

    .line 663
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 664
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwo;->w:Z

    goto :goto_0

    .line 666
    :cond_0
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 668
    :goto_0
    return-void
.end method

.method private e(Landroid/graphics/PointF;)I
    .locals 4

    .line 725
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 726
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bwn;

    .line 727
    invoke-virtual {v2}, Lo/bwn;->f()Landroid/graphics/PointF;

    move-result-object v3

    .line 728
    invoke-static {p1, v2, v3}, Lo/buy;->d(Landroid/graphics/PointF;Lo/bwn;Landroid/graphics/PointF;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 729
    return v1

    .line 725
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 732
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private e()V
    .locals 8

    .line 289
    iget-object v0, p0, Lo/bwo;->F:Lo/bwn;

    if-eqz v0, :cond_0

    .line 290
    new-instance v0, Landroid/graphics/LinearGradient;

    iget-object v1, p0, Lo/bwo;->F:Lo/bwn;

    invoke-virtual {v1}, Lo/bwn;->i()Landroid/graphics/PointF;

    move-result-object v1

    iget v2, v1, Landroid/graphics/PointF;->y:F

    iget-object v1, p0, Lo/bwo;->F:Lo/bwn;

    invoke-virtual {v1}, Lo/bwn;->f()Landroid/graphics/PointF;

    move-result-object v1

    iget v4, v1, Landroid/graphics/PointF;->y:F

    iget-object v1, p0, Lo/bwo;->l:[I

    const/4 v3, 0x0

    aget v5, v1, v3

    iget-object v1, p0, Lo/bwo;->l:[I

    const/4 v3, 0x1

    aget v6, v1, v3

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/bwo;->G:Landroid/graphics/LinearGradient;

    .line 293
    :cond_0
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 3

    .line 427
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 428
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bwn;

    .line 431
    invoke-direct {p0, v1}, Lo/bwo;->i(I)V

    .line 432
    invoke-direct {p0, p1, v2}, Lo/bwo;->c(Landroid/graphics/Canvas;Lo/bwn;)V

    .line 433
    invoke-direct {p0, p1, v2}, Lo/bwo;->d(Landroid/graphics/Canvas;Lo/bwn;)V

    .line 427
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 435
    :cond_0
    invoke-direct {p0, p1}, Lo/bwo;->g(Landroid/graphics/Canvas;)V

    .line 436
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Lo/bwn;Landroid/graphics/PointF;F)V
    .locals 5

    .line 479
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p4, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 480
    invoke-virtual {p2}, Lo/bwn;->p()Ljava/lang/String;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p4, v1

    iget v2, p0, Lo/bwo;->a:F

    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, p0, Lo/bwo;->k:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 481
    :cond_0
    iget v0, p3, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p4, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->c:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 482
    invoke-virtual {p2}, Lo/bwn;->p()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lo/bwo;->c:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p4, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/bwo;->a:F

    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, p0, Lo/bwo;->k:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 484
    :cond_1
    invoke-virtual {p2}, Lo/bwn;->p()Ljava/lang/String;

    move-result-object v0

    iget v1, p3, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/bwo;->a:F

    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, p0, Lo/bwo;->k:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 486
    :goto_0
    return-void
.end method

.method private e(Landroid/graphics/Path;ILandroid/graphics/PointF;Landroid/graphics/PathMeasure;)V
    .locals 3

    .line 634
    if-lez p2, :cond_0

    invoke-virtual {p4}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 635
    iget v0, p3, Landroid/graphics/PointF;->x:F

    iget v1, p3, Landroid/graphics/PointF;->y:F

    const v2, 0x3a83126f    # 0.001f

    add-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 637
    :cond_0
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 785
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bwn;

    .line 786
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo/bwo;->o:Lo/bwn;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/bwo;->F:Lo/bwn;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 787
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-static {v4, v0}, Lo/buy;->e(Lo/bwn;Lo/bwn;)Lo/bwn;

    move-result-object v0

    iput-object v0, p0, Lo/bwo;->o:Lo/bwn;

    .line 788
    iget-object v0, p0, Lo/bwo;->F:Lo/bwn;

    invoke-static {v4, v0}, Lo/buy;->c(Lo/bwn;Lo/bwn;)Lo/bwn;

    move-result-object v0

    iput-object v0, p0, Lo/bwo;->F:Lo/bwn;

    .line 790
    :cond_0
    goto :goto_0

    .line 791
    :cond_1
    return-void
.end method

.method private f(I)V
    .locals 2

    .line 447
    iget v0, p0, Lo/bwo;->h:I

    if-eq p1, v0, :cond_0

    .line 448
    iget-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->R:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 450
    :cond_0
    iget-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->O:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 452
    :goto_0
    return-void
.end method

.method private f(Landroid/graphics/Canvas;)V
    .locals 16

    .line 561
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/bwo;->w:Z

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 563
    const/4 v9, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/graphics/Path;

    .line 565
    new-instance v11, Landroid/graphics/PathMeasure;

    const/4 v0, 0x0

    invoke-direct {v11, v10, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 566
    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v12

    .line 568
    const/4 v0, 0x2

    new-array v13, v0, [F

    .line 569
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v13, v1}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 570
    const/4 v0, 0x2

    new-array v14, v0, [F

    .line 571
    const/4 v0, 0x0

    invoke-virtual {v11, v12, v14, v0}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 572
    const v0, 0x3a83126f    # 0.001f

    cmpl-float v0, v12, v0

    if-lez v0, :cond_0

    .line 573
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->f:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v10, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 574
    const/4 v0, 0x0

    aget v0, v14, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bwo;->a:F

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 575
    const/4 v0, 0x0

    aget v0, v13, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bwo;->a:F

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 576
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 577
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->d:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/LinearGradient;

    move-object/from16 v2, p0

    iget v5, v2, Lo/bwo;->a:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/bwo;->l:[I

    const/4 v3, 0x0

    aget v6, v2, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/bwo;->l:[I

    const/4 v3, 0x1

    aget v7, v2, v3

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 580
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v10, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 582
    :cond_0
    const/4 v0, 0x0

    aget v0, v13, v0

    const/4 v1, 0x0

    aput v0, v14, v1

    .line 583
    const/4 v0, 0x1

    aget v0, v13, v0

    const/4 v1, 0x1

    aput v0, v14, v1

    .line 585
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_1

    .line 586
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 587
    const/4 v0, 0x0

    aget v0, v14, v0

    const/4 v1, 0x1

    aget v1, v14, v1

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 588
    new-instance v0, Landroid/graphics/PathMeasure;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bwo;->U:Ljava/util/List;

    add-int/lit8 v2, v9, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Path;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    move-object v15, v0

    .line 589
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v15, v0, v13, v1}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 590
    const/4 v0, 0x0

    aget v0, v13, v0

    const/4 v1, 0x1

    aget v1, v13, v1

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 591
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bwo;->aa:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 594
    :cond_2
    return-void
.end method

.method private g()V
    .locals 2

    .line 555
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 557
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->L:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 558
    return-void
.end method

.method private g(Landroid/graphics/Canvas;)V
    .locals 2

    .line 538
    iget v0, p0, Lo/bwo;->h:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 539
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    iget v1, p0, Lo/bwo;->h:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-direct {p0, p1, v0}, Lo/bwo;->b(Landroid/graphics/Canvas;Lo/bwn;)V

    goto :goto_0

    .line 541
    :cond_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    iget-object v1, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v1}, Lo/bwn;->t()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-direct {p0, p1, v0}, Lo/bwo;->b(Landroid/graphics/Canvas;Lo/bwn;)V

    .line 543
    :goto_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 531
    iget-object v0, p0, Lo/bwo;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 532
    iget v0, p0, Lo/bwo;->A:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->A:F

    const/high16 v1, 0x42480000    # 50.0f

    rem-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->A:F

    .line 533
    const-wide/16 v0, 0x32

    invoke-virtual {p0, v0, v1}, Lo/bwo;->postInvalidateDelayed(J)V

    .line 535
    :cond_0
    return-void
.end method

.method private h(Landroid/graphics/Canvas;)Z
    .locals 3

    .line 597
    const/4 v1, 0x0

    .line 598
    iget-object v0, p0, Lo/bwo;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 599
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 600
    iget-boolean v0, p0, Lo/bwo;->w:Z

    if-nez v0, :cond_0

    .line 601
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 603
    :cond_0
    invoke-direct {p0, p1, v1, v2}, Lo/bwo;->b(Landroid/graphics/Canvas;Landroid/graphics/Path;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 599
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 605
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private i()V
    .locals 5

    .line 308
    iget v0, p0, Lo/bwo;->p:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lo/bwo;->o:Lo/bwn;

    invoke-virtual {v0}, Lo/bwn;->g()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v3, v0

    .line 310
    invoke-direct {p0, v3}, Lo/bwo;->d(F)F

    move-result v3

    .line 311
    iget v0, p0, Lo/bwo;->a:F

    iget v1, p0, Lo/bwo;->b:F

    sub-float/2addr v0, v1

    invoke-static {}, Lo/buy;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->z:F

    sub-float/2addr v0, v1

    div-float/2addr v0, v3

    iput v0, p0, Lo/bwo;->p:F

    .line 312
    iget v0, p0, Lo/bwo;->a:F

    iget v1, p0, Lo/bwo;->b:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->p:F

    div-float v4, v0, v1

    .line 313
    invoke-direct {p0, v4}, Lo/bwo;->a(F)V

    .line 314
    iget v0, p0, Lo/bwo;->a:F

    iget v1, p0, Lo/bwo;->b:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iget v1, p0, Lo/bwo;->K:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->p:F

    .line 316
    :cond_0
    return-void
.end method

.method private i(I)V
    .locals 2

    .line 439
    iget-object v0, p0, Lo/bwo;->l:[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 440
    iget-object v0, p0, Lo/bwo;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/bwo;->G:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_0

    .line 442
    :cond_0
    invoke-direct {p0, p1}, Lo/bwo;->f(I)V

    .line 444
    :goto_0
    return-void
.end method

.method private i(Landroid/graphics/Canvas;)V
    .locals 5

    .line 546
    iget-object v0, p0, Lo/bwo;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/Path;

    .line 547
    new-instance v4, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iget v1, p0, Lo/bwo;->A:F

    invoke-direct {v4, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 548
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 549
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 550
    goto :goto_0

    .line 551
    :cond_0
    return-void

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method private k(F)F
    .locals 2

    .line 417
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    goto :goto_0

    .line 420
    :cond_0
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 421
    iget v0, p0, Lo/bwo;->c:I

    iget v1, p0, Lo/bwo;->B:I

    sub-int/2addr v0, v1

    int-to-float p1, v0

    .line 423
    :goto_0
    return p1
.end method

.method private k(Landroid/graphics/Canvas;)V
    .locals 6

    .line 674
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->M:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 675
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 676
    move-object v0, p1

    iget v1, p0, Lo/bwo;->B:I

    int-to-float v1, v1

    iget v2, p0, Lo/bwo;->a:F

    iget v3, p0, Lo/bwo;->c:I

    iget v4, p0, Lo/bwo;->B:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lo/bwo;->a:F

    iget-object v5, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 677
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 842
    iput p1, p0, Lo/bwo;->W:I

    .line 843
    return-void
.end method

.method public varargs a([I)V
    .locals 0

    .line 891
    iput-object p1, p0, Lo/bwo;->l:[I

    .line 892
    return-void
.end method

.method public b(F)V
    .locals 1

    .line 916
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 917
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 918
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 881
    iput p1, p0, Lo/bwo;->m:I

    .line 882
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 883
    return-void
.end method

.method public c(F)V
    .locals 0

    .line 912
    iput p1, p0, Lo/bwo;->z:F

    .line 913
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 902
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->q:Z

    .line 903
    iput p1, p0, Lo/bwo;->x:I

    .line 904
    return-void
.end method

.method public c(Lo/bwo$d;)V
    .locals 0

    .line 718
    iput-object p1, p0, Lo/bwo;->N:Lo/bwo$d;

    .line 719
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 921
    iput p1, p0, Lo/bwo;->I:I

    .line 922
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 747
    invoke-static {p1}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 748
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->p:F

    .line 749
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwo;->H:Z

    .line 750
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwo;->w:Z

    .line 751
    const/4 v0, 0x0

    iput v0, p0, Lo/bwo;->h:I

    .line 752
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 753
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    iput-object v0, p0, Lo/bwo;->o:Lo/bwn;

    .line 754
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    iput-object v0, p0, Lo/bwo;->F:Lo/bwn;

    .line 755
    invoke-direct {p0, p1}, Lo/bwo;->c(Ljava/util/List;)V

    .line 756
    iget v0, p0, Lo/bwo;->c:I

    if-lez v0, :cond_1

    .line 758
    invoke-direct {p0}, Lo/bwo;->d()V

    .line 759
    invoke-direct {p0}, Lo/bwo;->c()V

    .line 761
    :cond_1
    invoke-virtual {p0}, Lo/bwo;->postInvalidate()V

    .line 762
    return-void
.end method

.method public varargs d([I)V
    .locals 9

    .line 822
    iget-object v0, p0, Lo/bwo;->f:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/LinearGradient;

    iget v5, p0, Lo/bwo;->a:F

    iget-object v2, p0, Lo/bwo;->l:[I

    const/4 v3, 0x0

    aget v6, v2, v3

    iget-object v2, p0, Lo/bwo;->l:[I

    const/4 v3, 0x1

    aget v7, v2, v3

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 825
    return-void
.end method

.method public e(F)V
    .locals 2

    .line 866
    iput p1, p0, Lo/bwo;->v:F

    .line 867
    iget-object v0, p0, Lo/bwo;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->v:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 868
    invoke-direct {p0}, Lo/bwo;->c()V

    .line 869
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 809
    iput p1, p0, Lo/bwo;->R:I

    .line 810
    iput p1, p0, Lo/bwo;->t:I

    .line 811
    return-void
.end method

.method public g(I)V
    .locals 2

    .line 929
    iput p1, p0, Lo/bwo;->L:I

    .line 930
    iget-object v0, p0, Lo/bwo;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->L:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 931
    return-void
.end method

.method public h(I)V
    .locals 0

    .line 925
    iput p1, p0, Lo/bwo;->j:I

    .line 926
    return-void
.end method

.method public k(I)V
    .locals 1

    .line 934
    iput p1, p0, Lo/bwo;->M:I

    .line 935
    iget-object v0, p0, Lo/bwo;->C:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 936
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 341
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 343
    :try_start_0
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    invoke-direct {p0, p1}, Lo/bwo;->d(Landroid/graphics/Canvas;)V

    .line 346
    :cond_0
    invoke-direct {p0, p1}, Lo/bwo;->k(Landroid/graphics/Canvas;)V

    .line 347
    invoke-direct {p0, p1}, Lo/bwo;->a(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 352
    goto :goto_0

    .line 348
    :catch_0
    move-exception v4

    .line 349
    const-string v0, "SugChart"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw RuntimeException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    goto :goto_0

    .line 350
    :catch_1
    move-exception v4

    .line 351
    const-string v0, "SugChart"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw Exception : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 3

    .line 247
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 248
    int-to-float v0, p2

    invoke-virtual {p0}, Lo/bwo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$dimen;->sug_chart_36:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->a:F

    .line 249
    iget v0, p0, Lo/bwo;->W:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 250
    iget v0, p0, Lo/bwo;->g:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->g:F

    .line 252
    :cond_0
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bwo;->B:I

    .line 253
    iput p1, p0, Lo/bwo;->c:I

    .line 254
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    if-lez p1, :cond_1

    .line 255
    invoke-direct {p0}, Lo/bwo;->d()V

    .line 256
    invoke-direct {p0}, Lo/bwo;->c()V

    .line 258
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 681
    iget-object v0, p0, Lo/bwo;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 682
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 685
    :sswitch_0
    iget-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 686
    iget-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 687
    goto :goto_0

    .line 689
    :sswitch_1
    iget-object v0, p0, Lo/bwo;->J:Landroid/graphics/PointF;

    iget v1, p0, Lo/bwo;->Q:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/bwo;->N:Lo/bwo$d;

    invoke-static {p1, v0, v1, v2}, Lo/buy;->d(Landroid/view/MotionEvent;Landroid/graphics/PointF;FLo/bwo$d;)V

    .line 690
    new-instance v3, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {v3, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 691
    invoke-direct {p0, v3}, Lo/bwo;->e(Landroid/graphics/PointF;)I

    move-result v0

    iput v0, p0, Lo/bwo;->h:I

    .line 692
    invoke-virtual {p0}, Lo/bwo;->invalidate()V

    .line 693
    .line 698
    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public setTextSize(F)V
    .locals 2

    .line 875
    invoke-virtual {p0}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwo;->k:F

    .line 876
    iget v0, p0, Lo/bwo;->k:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bwo;->a:F

    .line 877
    iget-object v0, p0, Lo/bwo;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwo;->k:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 878
    return-void
.end method
