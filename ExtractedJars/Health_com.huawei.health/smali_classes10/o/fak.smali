.class public Lo/fak;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:I

.field private i:F

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
            "Ljava/util/List<Ljava/lang/Float;>;"
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
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private u:Z

.field private v:Ljava/util/List;
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

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 115
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    const/high16 v0, 0x43610000    # 225.0f

    invoke-direct {p0, v0}, Lo/fak;->c(F)I

    move-result v0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-direct {p0, v1}, Lo/fak;->c(F)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lo/fak;->a:F

    .line 38
    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lo/fak;->b:F

    .line 39
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-direct {p0, v0}, Lo/fak;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fak;->c:F

    .line 40
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-direct {p0, v0}, Lo/fak;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fak;->e:F

    .line 43
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lo/fak;->c(F)I

    move-result v0

    iput v0, p0, Lo/fak;->g:I

    .line 45
    iget v0, p0, Lo/fak;->a:F

    const/high16 v1, 0x42600000    # 56.0f

    invoke-direct {p0, v1}, Lo/fak;->c(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/fak;->i:F

    .line 46
    const/16 v0, 0x18

    iput v0, p0, Lo/fak;->k:I

    .line 49
    const v0, -0x7f000001

    iput v0, p0, Lo/fak;->f:I

    .line 50
    const v0, -0x7f000001

    iput v0, p0, Lo/fak;->h:I

    .line 52
    const v0, -0x7f000001

    iput v0, p0, Lo/fak;->l:I

    .line 53
    const v0, -0x7f000001

    iput v0, p0, Lo/fak;->o:I

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->m:Ljava/util/List;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->n:Ljava/util/List;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->p:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->q:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->t:Ljava/util/List;

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fak;->u:Z

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->r:Ljava/util/List;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->s:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->x:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->v:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fak;->z:Ljava/util/List;

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/fak;->d:F

    .line 119
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 120
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v0, p0, Lo/fak;->r:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 129
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    iget-object v0, p0, Lo/fak;->s:Ljava/util/List;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 138
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 147
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    iget-object v0, p0, Lo/fak;->v:Ljava/util/List;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 156
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42780000    # 62.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42080000    # 34.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42500000    # 52.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lo/fak;->z:Ljava/util/List;

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    return-void
.end method

.method private a()V
    .locals 4

    .line 466
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 467
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fak;->u:Z

    .line 468
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NO data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 470
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fak;->u:Z

    .line 471
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    :goto_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 13

    .line 193
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawCoreSleepHistogram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 196
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 201
    const/16 v0, 0x8

    new-array v9, v0, [F

    iget v0, p0, Lo/fak;->c:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v9, v1

    iget v0, p0, Lo/fak;->c:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v9, v1

    iget v0, p0, Lo/fak;->c:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x2

    aput v0, v9, v1

    iget v0, p0, Lo/fak;->c:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x3

    aput v0, v9, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v9, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v9, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v9, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v9, v1

    .line 203
    const/4 v10, 0x0

    :goto_0
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 206
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 208
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "draw without wake"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v12, 0x0

    .line 211
    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v10, :cond_0

    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 212
    const/4 v12, 0x1

    .line 216
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, v7

    move-object v3, v9

    move v4, v10

    move-object v5, v11

    move v6, v12

    invoke-direct/range {v0 .. v6}, Lo/fak;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V

    .line 203
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 223
    :cond_1
    invoke-direct {p0, p1, v9}, Lo/fak;->c(Landroid/graphics/Canvas;[F)V

    .line 225
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 402
    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 403
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 404
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 405
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 408
    :cond_0
    iget-object v0, p0, Lo/fak;->m:Ljava/util/List;

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 413
    :cond_1
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 414
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    .line 415
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_3

    .line 416
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 419
    :cond_2
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    sub-int v1, v5, v6

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 424
    :cond_3
    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 425
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v6

    .line 426
    const/4 v7, 0x0

    :goto_4
    if-ge v7, v6, :cond_5

    .line 427
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 428
    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 430
    :cond_4
    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    sub-int v1, v6, v7

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 435
    :cond_5
    iget-object v0, p0, Lo/fak;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 436
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v7

    .line 437
    const/4 v8, 0x0

    :goto_6
    if-ge v8, v7, :cond_7

    .line 438
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 439
    iget-object v0, p0, Lo/fak;->t:Ljava/util/List;

    invoke-interface {p4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 441
    :cond_6
    iget-object v0, p0, Lo/fak;->t:Ljava/util/List;

    sub-int v1, v7, v8

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    :goto_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    .line 446
    :cond_7
    invoke-direct {p0}, Lo/fak;->a()V

    .line 447
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 448
    const/4 v8, 0x0

    :goto_8
    if-ge v8, v7, :cond_8

    .line 449
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    iget-object v1, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lo/fak;->m:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 451
    :cond_8
    const/4 v0, 0x0

    iput v0, p0, Lo/fak;->d:F

    .line 452
    const/4 v8, 0x0

    :goto_9
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_a

    .line 453
    iget v0, p0, Lo/fak;->d:F

    iget-object v1, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 454
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lo/fak;->d:F

    .line 455
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxTotalCoreSleepTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fak;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    .line 459
    :cond_a
    iget v0, p0, Lo/fak;->d:F

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v8, v0

    .line 460
    add-int/lit8 v0, v8, 0x2

    iput v0, p0, Lo/fak;->k:I

    .line 461
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxHistogramHeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fak;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    invoke-virtual {p0}, Lo/fak;->invalidate()V

    .line 463
    return-void
.end method

.method private c(F)I
    .locals 3

    .line 487
    invoke-virtual {p0}, Lo/fak;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 488
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 18

    .line 315
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawTimeXLabel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 319
    const v0, -0x7f000001

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 320
    move-object/from16 v0, p0

    const/high16 v1, 0x41100000    # 9.0f

    invoke-direct {v0, v1}, Lo/fak;->c(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 321
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 322
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget v2, v1, Lo/fak;->e:F

    move-object/from16 v1, p0

    const/high16 v3, 0x43610000    # 225.0f

    invoke-direct {v1, v3}, Lo/fak;->c(F)I

    move-result v1

    int-to-float v3, v1

    move-object/from16 v1, p0

    iget v4, v1, Lo/fak;->e:F

    move-object v5, v7

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 323
    invoke-virtual {v7}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 324
    iget v0, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v8, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 326
    new-instance v11, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 327
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fak;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 328
    new-instance v10, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fak;->t:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v10, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 329
    invoke-virtual {v11, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    .line 330
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v7, v13, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 331
    move-object/from16 v0, p0

    iget v0, v0, Lo/fak;->g:I

    int-to-float v0, v0

    int-to-float v1, v12

    move-object/from16 v2, p0

    iget v2, v2, Lo/fak;->c:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/fak;->i:F

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/fak;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fak;->e:F

    .line 332
    move-object/from16 v2, p0

    const/high16 v3, 0x41600000    # 14.0f

    invoke-direct {v2, v3}, Lo/fak;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    .line 331
    move-object/from16 v2, p1

    invoke-virtual {v2, v13, v0, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 333
    if-eqz v12, :cond_0

    .line 334
    new-instance v14, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fak;->t:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v14, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 335
    new-instance v15, Ljava/util/Date;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fak;->t:Ljava/util/List;

    add-int/lit8 v1, v12, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v15, v0}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v14}, Ljava/util/Date;->getYear()I

    move-result v0

    invoke-virtual {v15}, Ljava/util/Date;->getYear()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 337
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyy"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 338
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v17

    .line 339
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    move-object/from16 v1, v17

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 340
    move-object/from16 v0, p0

    iget v0, v0, Lo/fak;->g:I

    int-to-float v0, v0

    int-to-float v1, v12

    move-object/from16 v2, p0

    iget v2, v2, Lo/fak;->c:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/fak;->i:F

    add-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/fak;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fak;->e:F

    .line 341
    move-object/from16 v2, p0

    const/high16 v3, 0x41600000    # 14.0f

    invoke-direct {v2, v3}, Lo/fak;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    int-to-float v2, v9

    add-float/2addr v1, v2

    .line 340
    move-object/from16 v2, p1

    move-object/from16 v3, v17

    invoke-virtual {v2, v3, v0, v1, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 327
    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 346
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fak;->u:Z

    if-eqz v0, :cond_2

    .line 348
    new-instance v12, Landroid/graphics/Paint;

    invoke-direct {v12}, Landroid/graphics/Paint;-><init>()V

    .line 349
    const v0, -0x7f000001

    invoke-virtual {v12, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 350
    move-object/from16 v0, p0

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {v0, v1}, Lo/fak;->c(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 351
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 354
    const-string v13, "\u6682\u65e0\u6570\u636e\uff0c\u7761\u7720\u6709\u76ca\u5065\u5eb7!"

    .line 355
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "noDataDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v12, v13, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 357
    move-object/from16 v0, p0

    iget v0, v0, Lo/fak;->g:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fak;->c:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/fak;->i:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {v1, v2}, Lo/fak;->c(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fak;->e:F

    move-object/from16 v2, p0

    const/high16 v3, 0x41880000    # 17.0f

    invoke-direct {v2, v3}, Lo/fak;->c(F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    move-object/from16 v2, p1

    invoke-virtual {v2, v13, v0, v1, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 360
    :cond_2
    return-void
.end method

.method private c(Landroid/graphics/Canvas;[F)V
    .locals 15

    .line 228
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 229
    const/4 v0, 0x4

    new-array v10, v0, [I

    iget v0, p0, Lo/fak;->l:I

    const/4 v1, 0x0

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->o:I

    const/4 v1, 0x1

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->f:I

    const/4 v1, 0x2

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->h:I

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 230
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_1

    .line 231
    iget-object v0, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    :goto_0
    const/4 v0, 0x7

    if-ge v11, v0, :cond_1

    .line 232
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 233
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lo/fak;->z:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float v8, v0, v1

    .line 234
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

    .line 235
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/fak;->e:F

    iget-object v2, p0, Lo/fak;->z:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0, v2}, Lo/fak;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v1, v2

    iget v4, p0, Lo/fak;->e:F

    move-object v5, v10

    move-object v6, v12

    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v13, v0

    .line 236
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 238
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 239
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, v11

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->z:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, v11

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, p2

    invoke-virtual {v14, v0, v2, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 241
    move-object/from16 v0, p1

    invoke-virtual {v0, v14, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 231
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 245
    :cond_1
    return-void
.end method

.method private d(F)F
    .locals 2

    .line 477
    iget v0, p0, Lo/fak;->b:F

    mul-float/2addr v0, p1

    iget v1, p0, Lo/fak;->k:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method private d(Landroid/graphics/Canvas;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V
    .locals 15

    .line 249
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 250
    const/4 v0, 0x4

    new-array v10, v0, [I

    iget v0, p0, Lo/fak;->l:I

    const/4 v1, 0x0

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->o:I

    const/4 v1, 0x1

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->f:I

    const/4 v1, 0x2

    aput v0, v10, v1

    iget v0, p0, Lo/fak;->h:I

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 252
    const/4 v11, 0x1

    .line 253
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p4

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    move/from16 v1, p4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    .line 254
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p4

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    move/from16 v1, p4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_1
    if-eqz p6, :cond_3

    .line 256
    :cond_2
    const/4 v11, 0x0

    .line 259
    :cond_3
    if-eqz v11, :cond_4

    .line 260
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p4

    if-le v0, v1, :cond_5

    .line 261
    iget-object v0, p0, Lo/fak;->x:Ljava/util/List;

    move/from16 v1, p4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lo/fak;->z:Ljava/util/List;

    move/from16 v2, p4

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float v8, v0, v1

    .line 262
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

    .line 263
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/fak;->e:F

    iget-object v2, p0, Lo/fak;->z:Ljava/util/List;

    move/from16 v3, p4

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0, v2}, Lo/fak;->c(F)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v1, v2

    iget v4, p0, Lo/fak;->e:F

    move-object v5, v10

    move-object v6, v12

    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v13, v0

    .line 264
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 266
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 267
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    move/from16 v2, p4

    int-to-float v2, v2

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->z:Ljava/util/List;

    move/from16 v4, p4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    move/from16 v4, p4

    int-to-float v4, v4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, p3

    invoke-virtual {v14, v0, v2, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 269
    move-object/from16 v0, p1

    invoke-virtual {v0, v14, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 270
    goto :goto_0

    .line 273
    :cond_4
    invoke-direct/range {p0 .. p6}, Lo/fak;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V

    .line 278
    :cond_5
    :goto_0
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Landroid/graphics/Paint;[FILandroid/graphics/Path;Z)V
    .locals 7

    .line 281
    if-nez p6, :cond_0

    .line 282
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p4, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p4, :cond_1

    .line 284
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, p4

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->d(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, p4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 287
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, p4

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v4, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-direct {p0, v3}, Lo/fak;->d(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, p4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    iget-object v5, p0, Lo/fak;->n:Ljava/util/List;

    .line 288
    invoke-interface {v5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v5}, Lo/fak;->d(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/fak;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 287
    invoke-virtual {p5, v0, p3, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 289
    invoke-virtual {p1, p5, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 293
    :cond_0
    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p4, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p4, :cond_1

    .line 295
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, p4

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->d(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, p4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 298
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, p4

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->p:Ljava/util/List;

    invoke-interface {v3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v4, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-direct {p0, v3}, Lo/fak;->d(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, p4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    iget-object v5, p0, Lo/fak;->n:Ljava/util/List;

    .line 299
    invoke-interface {v5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v5}, Lo/fak;->d(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/fak;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 298
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 301
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fak;->g:I

    int-to-float v1, v1

    int-to-float v2, p4

    iget v3, p0, Lo/fak;->c:F

    iget v4, p0, Lo/fak;->i:F

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fak;->e:F

    iget-object v3, p0, Lo/fak;->q:Ljava/util/List;

    invoke-interface {v3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->d(F)F

    move-result v3

    invoke-direct {p0, v3}, Lo/fak;->c(F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fak;->g:I

    int-to-float v3, v3

    int-to-float v4, p4

    iget v5, p0, Lo/fak;->c:F

    iget v6, p0, Lo/fak;->i:F

    add-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fak;->e:F

    iget-object v5, p0, Lo/fak;->p:Ljava/util/List;

    .line 302
    invoke-interface {v5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v6, p0, Lo/fak;->n:Ljava/util/List;

    invoke-interface {v6, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v5, v6

    invoke-direct {p0, v5}, Lo/fak;->d(F)F

    move-result v5

    invoke-direct {p0, v5}, Lo/fak;->c(F)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 301
    invoke-virtual {p5, v0, p3, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 303
    invoke-virtual {p1, p5, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 306
    :cond_1
    :goto_0
    return-void
.end method

.method private getScreenWidth()I
    .locals 4

    .line 368
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 369
    invoke-virtual {p0}, Lo/fak;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 370
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 371
    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 169
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 172
    invoke-direct {p0, p1}, Lo/fak;->a(Landroid/graphics/Canvas;)V

    .line 174
    invoke-direct {p0, p1}, Lo/fak;->c(Landroid/graphics/Canvas;)V

    .line 181
    return-void
.end method

.method public setHistogram(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/Float;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 381
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHistogram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p4, :cond_1

    .line 385
    :cond_0
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHistogram :NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fak;->u:Z

    .line 387
    return-void

    .line 388
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

    .line 389
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

    .line 390
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 391
    :cond_2
    const-string v0, "SleepHistogram"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list length different"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fak;->u:Z

    .line 393
    return-void

    .line 395
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lo/fak;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 399
    return-void
.end method
