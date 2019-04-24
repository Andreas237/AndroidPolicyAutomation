.class public Lo/epp;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private u:Z

.field private v:I

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private z:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 144
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    invoke-direct {p0}, Lo/epp;->getScreenWidth()I

    move-result v0

    const/high16 v1, 0x42400000    # 48.0f

    invoke-direct {p0, v1}, Lo/epp;->c(F)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lo/epp;->b:F

    .line 64
    const/high16 v0, 0x42780000    # 62.0f

    iput v0, p0, Lo/epp;->a:F

    .line 65
    const/high16 v0, 0x41000000    # 8.0f

    invoke-direct {p0, v0}, Lo/epp;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epp;->e:F

    .line 66
    const/high16 v0, 0x42a00000    # 80.0f

    invoke-direct {p0, v0}, Lo/epp;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epp;->d:F

    .line 68
    const/high16 v0, 0x41800000    # 16.0f

    invoke-direct {p0, v0}, Lo/epp;->c(F)I

    move-result v0

    iput v0, p0, Lo/epp;->k:I

    .line 70
    iget v0, p0, Lo/epp;->b:F

    const/high16 v1, 0x42980000    # 76.0f

    invoke-direct {p0, v1}, Lo/epp;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/epp;->f:F

    .line 71
    const/16 v0, 0xa

    iput v0, p0, Lo/epp;->g:I

    .line 74
    const v0, 0x33df6bff

    iput v0, p0, Lo/epp;->i:I

    .line 75
    const v0, 0x33a818d1

    iput v0, p0, Lo/epp;->h:I

    .line 77
    const v0, 0x20d66ff3

    iput v0, p0, Lo/epp;->l:I

    .line 78
    const v0, 0x20c046e3

    iput v0, p0, Lo/epp;->o:I

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->p:Ljava/util/List;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->n:Ljava/util/List;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->m:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->t:Ljava/util/List;

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->r:Ljava/util/List;

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epp;->u:Z

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epp;->q:Ljava/util/List;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epp;->s:Ljava/util/List;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epp;->w:Ljava/util/List;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epp;->y:Ljava/util/List;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epp;->x:Ljava/util/List;

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lo/epp;->c:F

    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/epp;->z:Landroid/content/res/Resources;

    .line 149
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 150
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    iget-object v0, p0, Lo/epp;->q:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 159
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v0, p0, Lo/epp;->s:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 168
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 177
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    iget-object v0, p0, Lo/epp;->y:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 186
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42780000    # 62.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42080000    # 34.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42500000    # 52.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    iget-object v0, p0, Lo/epp;->x:Ljava/util/List;

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    return-void
.end method

.method private a(F)F
    .locals 2

    .line 589
    iget v0, p0, Lo/epp;->a:F

    mul-float/2addr v0, p1

    iget v1, p0, Lo/epp;->g:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 215
    iget-object v0, p0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 216
    iget v0, p0, Lo/epp;->c:F

    const v1, 0x38d1b717    # 1.0E-4f

    add-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 217
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxTotalCoreSleepTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/epp;->c:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 219
    iget-object v0, p0, Lo/epp;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 220
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 221
    iget-object v0, p0, Lo/epp;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 223
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxStr="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v4, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 225
    iget v0, p0, Lo/epp;->k:I

    int-to-float v0, v0

    iget v1, p0, Lo/epp;->v:I

    int-to-float v1, v1

    iget v2, p0, Lo/epp;->e:F

    iget v3, p0, Lo/epp;->f:F

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-direct {p0, v1}, Lo/epp;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epp;->d:F

    iget-object v2, p0, Lo/epp;->t:Ljava/util/List;

    iget v3, p0, Lo/epp;->v:I

    .line 226
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0, v2}, Lo/epp;->a(F)F

    move-result v2

    invoke-direct {p0, v2}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/epp;->e:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 225
    invoke-virtual {p1, v4, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 228
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V
    .locals 7

    .line 380
    if-nez p8, :cond_0

    .line 381
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p6, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p6, :cond_1

    .line 383
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, p6

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v3, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->a(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, p6

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 386
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, p6

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v3, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v4, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-direct {p0, v3}, Lo/epp;->a(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->e:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, p6

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    iget-object v5, p0, Lo/epp;->n:Ljava/util/List;

    .line 387
    invoke-interface {v5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v5}, Lo/epp;->a(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/epp;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 386
    invoke-virtual {p7, v0, p5, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 388
    invoke-virtual {p1, p7, p4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 392
    :cond_0
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p6, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p6, :cond_1

    .line 394
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, p6

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v3, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->a(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, p6

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 397
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, p6

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v3, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v4, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-direct {p0, v3}, Lo/epp;->a(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, p6

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    iget-object v5, p0, Lo/epp;->n:Ljava/util/List;

    .line 398
    invoke-interface {v5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v5}, Lo/epp;->a(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/epp;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 397
    invoke-virtual {p1, v0, p4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 400
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, p6

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v3, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->a(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->e:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, p6

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    iget-object v5, p0, Lo/epp;->m:Ljava/util/List;

    .line 401
    invoke-interface {v5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v6, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v6, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v5, v6

    invoke-direct {p0, v5}, Lo/epp;->a(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/epp;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 400
    invoke-virtual {p7, v0, p5, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 402
    invoke-virtual {p1, p7, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 405
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 17

    .line 273
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawCoreSleepHistogram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 276
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0x64

    const/16 v3, 0xb4

    invoke-virtual {v9, v0, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 280
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 283
    const/16 v0, 0xff

    const/16 v1, 0xcf

    const/16 v2, 0x21

    const/16 v3, 0xff

    invoke-virtual {v10, v0, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 286
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    .line 287
    const/16 v0, 0xff

    const/16 v1, 0xe5

    const/16 v2, 0x8e

    const/16 v3, 0xfd

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 300
    const/16 v0, 0x8

    new-array v13, v0, [F

    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x2

    aput v0, v13, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x3

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v13, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v13, v1

    .line 302
    const/4 v14, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_1

    .line 305
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 307
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "draw without wake"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/16 v16, 0x0

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v14, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->p:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 311
    const/16 v16, 0x1

    .line 315
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object v3, v10

    move-object v4, v11

    move-object v5, v13

    move v6, v14

    move-object v7, v15

    move/from16 v8, v16

    invoke-direct/range {v0 .. v8}, Lo/epp;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V

    .line 302
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 322
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v13}, Lo/epp;->c(Landroid/graphics/Canvas;[F)V

    .line 324
    return-void
.end method

.method private c(F)I
    .locals 3

    .line 599
    invoke-virtual {p0}, Lo/epp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 600
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c()V
    .locals 4

    .line 578
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 579
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epp;->u:Z

    .line 580
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NO data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 582
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epp;->u:Z

    .line 583
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    :goto_0
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 16

    .line 414
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawTimeXLabel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 418
    const/high16 v0, -0x80000000

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 419
    move-object/from16 v0, p0

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {v0, v1}, Lo/epp;->c(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 420
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 422
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v6

    .line 423
    iget v0, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v7, v0

    .line 425
    new-instance v9, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 426
    const/4 v10, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 427
    new-instance v8, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v8, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 428
    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 429
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v11, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v4

    .line 430
    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->k:I

    int-to-float v0, v0

    int-to-float v1, v10

    move-object/from16 v2, p0

    iget v2, v2, Lo/epp;->e:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/epp;->f:F

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/epp;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/epp;->d:F

    .line 431
    move-object/from16 v2, p0

    const/high16 v3, 0x41600000    # 14.0f

    invoke-direct {v2, v3}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    .line 430
    move-object/from16 v2, p1

    invoke-virtual {v2, v11, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 432
    if-eqz v10, :cond_0

    .line 433
    new-instance v12, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v12, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 434
    new-instance v13, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->r:Ljava/util/List;

    add-int/lit8 v1, v10, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v13, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 435
    invoke-virtual {v12}, Ljava/util/Date;->getYear()I

    move-result v0

    invoke-virtual {v13}, Ljava/util/Date;->getYear()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 436
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyy"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 437
    invoke-virtual {v14, v12}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    .line 438
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v15, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v4

    .line 439
    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->k:I

    int-to-float v0, v0

    int-to-float v1, v10

    move-object/from16 v2, p0

    iget v2, v2, Lo/epp;->e:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/epp;->f:F

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/epp;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/epp;->d:F

    .line 440
    move-object/from16 v2, p0

    const/high16 v3, 0x41600000    # 14.0f

    invoke-direct {v2, v3}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    int-to-float v2, v7

    add-float/2addr v1, v2

    .line 439
    move-object/from16 v2, p1

    invoke-virtual {v2, v15, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 426
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 445
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/epp;->u:Z

    if-eqz v0, :cond_2

    .line 447
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 448
    const/high16 v0, -0x80000000

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 449
    move-object/from16 v0, p0

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {v0, v1}, Lo/epp;->c(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 450
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epp;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_no_sleep_desc:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 453
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "noDataDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v10, v11, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v4

    .line 455
    move-object/from16 v0, p0

    iget v0, v0, Lo/epp;->k:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/epp;->e:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/epp;->f:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/epp;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/epp;->d:F

    move-object/from16 v2, p0

    const/high16 v3, 0x41880000    # 17.0f

    invoke-direct {v2, v3}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    move-object/from16 v2, p1

    invoke-virtual {v2, v11, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 456
    goto :goto_1

    .line 458
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/epp;->a(Landroid/graphics/Canvas;)V

    .line 462
    :goto_1
    return-void
.end method

.method private c(Landroid/graphics/Canvas;[F)V
    .locals 15

    .line 327
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 328
    const/4 v0, 0x4

    new-array v10, v0, [I

    iget v0, p0, Lo/epp;->l:I

    const/4 v1, 0x0

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->o:I

    const/4 v1, 0x1

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->i:I

    const/4 v1, 0x2

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->h:I

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 329
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_1

    .line 330
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    :goto_0
    const/4 v0, 0x7

    if-ge v11, v0, :cond_1

    .line 331
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lo/epp;->x:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float v8, v0, v1

    .line 333
    const/4 v0, 0x4

    new-array v12, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x1

    aput v8, v12, v0

    const/4 v0, 0x2

    aput v8, v12, v0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x3

    aput v0, v12, v1

    .line 334
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/epp;->d:F

    iget-object v2, p0, Lo/epp;->x:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0, v2}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v1, v2

    iget v4, p0, Lo/epp;->d:F

    move-object v5, v10

    move-object v6, v12

    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v13, v0

    .line 335
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 337
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 338
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    int-to-float v2, v11

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->x:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    int-to-float v4, v11

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, p2

    invoke-virtual {v14, v0, v2, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 340
    move-object/from16 v0, p1

    invoke-virtual {v0, v14, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 330
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 344
    :cond_1
    return-void
.end method

.method private c(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 507
    move-object v3, p1

    monitor-enter v3

    .line 508
    :try_start_0
    iget-object v0, p0, Lo/epp;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 509
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 510
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 511
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lo/epp;->p:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 514
    :cond_0
    iget-object v0, p0, Lo/epp;->p:Ljava/util/List;

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 510
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 518
    :cond_1
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 520
    :goto_2
    iget-object v3, p0, Lo/epp;->n:Ljava/util/List;

    monitor-enter v3

    .line 521
    :try_start_1
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 522
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    .line 523
    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_3

    .line 524
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 525
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 527
    :cond_2
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 523
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 531
    :cond_3
    monitor-exit v3

    goto :goto_5

    :catchall_1
    move-exception v7

    monitor-exit v3

    throw v7

    .line 532
    :goto_5
    iget-object v3, p0, Lo/epp;->m:Ljava/util/List;

    monitor-enter v3

    .line 533
    :try_start_2
    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 534
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    .line 535
    const/4 v5, 0x0

    :goto_6
    if-ge v5, v4, :cond_5

    .line 536
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 537
    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 539
    :cond_4
    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 535
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 543
    :cond_5
    monitor-exit v3

    goto :goto_8

    :catchall_2
    move-exception v8

    monitor-exit v3

    throw v8

    .line 544
    :goto_8
    iget-object v3, p0, Lo/epp;->m:Ljava/util/List;

    monitor-enter v3

    .line 545
    :try_start_3
    iget-object v0, p0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 546
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v4

    .line 547
    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_7

    .line 548
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 549
    iget-object v0, p0, Lo/epp;->r:Ljava/util/List;

    invoke-interface {p4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 551
    :cond_6
    iget-object v0, p0, Lo/epp;->r:Ljava/util/List;

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 547
    :goto_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 556
    :cond_7
    invoke-direct {p0}, Lo/epp;->c()V

    .line 557
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 558
    const/4 v5, 0x0

    :goto_b
    if-ge v5, v4, :cond_8

    .line 559
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    iget-object v1, p0, Lo/epp;->m:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lo/epp;->p:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 558
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    .line 562
    :cond_8
    const/4 v0, 0x0

    iput v0, p0, Lo/epp;->c:F

    .line 563
    const/4 v0, 0x0

    iput v0, p0, Lo/epp;->v:I

    .line 564
    const/4 v5, 0x0

    :goto_c
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_a

    .line 565
    iget v0, p0, Lo/epp;->c:F

    iget-object v1, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 566
    iget-object v0, p0, Lo/epp;->t:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lo/epp;->c:F

    .line 567
    iput v5, p0, Lo/epp;->v:I

    .line 564
    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    .line 571
    :cond_a
    iget v0, p0, Lo/epp;->c:F

    float-to-int v5, v0

    .line 572
    add-int/lit8 v0, v5, 0x1

    iput v0, p0, Lo/epp;->g:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 573
    monitor-exit v3

    goto :goto_d

    :catchall_3
    move-exception v9

    monitor-exit v3

    throw v9

    .line 574
    :goto_d
    invoke-virtual {p0}, Lo/epp;->invalidate()V

    .line 575
    return-void
.end method

.method private d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V
    .locals 15

    .line 348
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 349
    const/4 v0, 0x4

    new-array v10, v0, [I

    iget v0, p0, Lo/epp;->l:I

    const/4 v1, 0x0

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->o:I

    const/4 v1, 0x1

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->i:I

    const/4 v1, 0x2

    aput v0, v10, v1

    iget v0, p0, Lo/epp;->h:I

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 351
    const/4 v11, 0x1

    .line 352
    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p6

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lo/epp;->n:Ljava/util/List;

    move/from16 v1, p6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    .line 353
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p6

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/epp;->m:Ljava/util/List;

    move/from16 v1, p6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_1
    if-eqz p8, :cond_3

    .line 355
    :cond_2
    const/4 v11, 0x0

    .line 358
    :cond_3
    if-eqz v11, :cond_4

    .line 359
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p6

    if-le v0, v1, :cond_5

    .line 360
    iget-object v0, p0, Lo/epp;->w:Ljava/util/List;

    move/from16 v1, p6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lo/epp;->x:Ljava/util/List;

    move/from16 v2, p6

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float v8, v0, v1

    .line 361
    const/4 v0, 0x4

    new-array v12, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x1

    aput v8, v12, v0

    const/4 v0, 0x2

    aput v8, v12, v0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x3

    aput v0, v12, v1

    .line 362
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/epp;->d:F

    iget-object v2, p0, Lo/epp;->x:Ljava/util/List;

    move/from16 v3, p6

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0, v2}, Lo/epp;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v1, v2

    iget v4, p0, Lo/epp;->d:F

    move-object v5, v10

    move-object v6, v12

    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v13, v0

    .line 363
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 365
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 366
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epp;->k:I

    int-to-float v1, v1

    move/from16 v2, p6

    int-to-float v2, v2

    iget v3, p0, Lo/epp;->e:F

    iget v4, p0, Lo/epp;->f:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/epp;->d:F

    iget-object v3, p0, Lo/epp;->x:Ljava/util/List;

    move/from16 v4, p6

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/epp;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epp;->k:I

    int-to-float v3, v3

    move/from16 v4, p6

    int-to-float v4, v4

    iget v5, p0, Lo/epp;->e:F

    iget v6, p0, Lo/epp;->f:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->e:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epp;->d:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, p5

    invoke-virtual {v14, v0, v2, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 368
    move-object/from16 v0, p1

    invoke-virtual {v0, v14, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 369
    goto :goto_0

    .line 372
    :cond_4
    invoke-direct/range {p0 .. p8}, Lo/epp;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V

    .line 377
    :cond_5
    :goto_0
    return-void
.end method

.method private getScreenWidth()I
    .locals 4

    .line 470
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 471
    invoke-virtual {p0}, Lo/epp;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 472
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 473
    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 199
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 202
    invoke-direct {p0, p1}, Lo/epp;->b(Landroid/graphics/Canvas;)V

    .line 204
    invoke-direct {p0, p1}, Lo/epp;->c(Landroid/graphics/Canvas;)V

    .line 211
    return-void
.end method

.method public setHistogram(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 485
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHistogram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p4, :cond_1

    .line 489
    :cond_0
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHistogram :NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epp;->u:Z

    .line 491
    return-void

    .line 492
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 493
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 494
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 495
    :cond_2
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list length different"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epp;->u:Z

    .line 497
    return-void

    .line 499
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lo/epp;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 503
    return-void
.end method
