.class public Lo/eyo;
.super Lo/ezi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eyo$b;
    }
.end annotation


# instance fields
.field private h:F

.field private n:Landroid/graphics/Paint;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eib;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1, p2}, Lo/ezi;-><init>(Landroid/content/Context;Lo/ezh;)V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/eyo;->h:F

    .line 28
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyo;->n:Landroid/graphics/Paint;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyo;->o:Ljava/util/List;

    .line 34
    return-void
.end method

.method static synthetic a(Lo/eyo;Lo/ezm;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/eyo;->d(Lo/ezm;)V

    return-void
.end method

.method static synthetic b(Lo/eyo;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/eyo;->i()V

    return-void
.end method

.method static synthetic b(Lo/eyo;Lo/ezn;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/eyo;->c(Lo/ezn;)V

    return-void
.end method

.method private c(F)V
    .locals 4

    .line 187
    iput p1, p0, Lo/eyo;->h:F

    .line 188
    iget-object v0, p0, Lo/eyo;->d:Lo/ezi$d;

    iget-boolean v0, v0, Lo/ezi$d;->e:Z

    if-eqz v0, :cond_1

    const-string v0, "rest_hr"

    iget-object v1, p0, Lo/eyo;->d:Lo/ezi$d;

    iget-object v1, v1, Lo/ezi$d;->c:Lo/ezi$d$c;

    iget-object v1, v1, Lo/ezi$d$c;->a:Lo/ehe$a;

    .line 189
    invoke-virtual {v1}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    iget v0, p0, Lo/eyo;->h:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/eyo;->f:Lo/ezh;

    iget v1, p0, Lo/eyo;->h:F

    float-to-int v1, v1

    iget-object v2, p0, Lo/eyo;->n:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/ezh;->a(ILandroid/graphics/Paint;Z)V

    goto :goto_0

    .line 193
    :cond_0
    iget-object v0, p0, Lo/eyo;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyo;->n:Landroid/graphics/Paint;

    const/high16 v2, -0x80000000

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lo/ezh;->a(ILandroid/graphics/Paint;Z)V

    .line 196
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lo/eyo;->o:Ljava/util/List;

    if-eq p1, v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/eyo;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 205
    iget-object v0, p0, Lo/eyo;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 208
    :cond_0
    iget-object v0, p0, Lo/eyo;->d:Lo/ezi$d;

    iget-boolean v0, v0, Lo/ezi$d;->e:Z

    if-eqz v0, :cond_1

    const-string v0, "warning_hr"

    iget-object v1, p0, Lo/eyo;->d:Lo/ezi$d;

    iget-object v1, v1, Lo/ezi$d;->c:Lo/ezi$d$c;

    iget-object v1, v1, Lo/ezi$d$c;->a:Lo/ehe$a;

    .line 209
    invoke-virtual {v1}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    iget-object v0, p0, Lo/eyo;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyo;->o:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezh;->d(Ljava/util/List;)V

    .line 212
    :cond_1
    return-void
.end method

.method private c(Lo/ezn;)V
    .locals 1

    .line 157
    new-instance v0, Lo/eyo$5;

    invoke-direct {v0, p0}, Lo/eyo$5;-><init>(Lo/eyo;)V

    invoke-virtual {p1, v0}, Lo/ezn;->setOnReferenceChangeListener(Lo/ezn$b;)V

    .line 165
    return-void
.end method

.method static synthetic d(Lo/eyo;)Landroid/graphics/Paint;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/eyo;->n:Landroid/graphics/Paint;

    return-object v0
.end method

.method private d(Lo/ezm;)V
    .locals 1

    .line 171
    new-instance v0, Lo/eyo$1;

    invoke-direct {v0, p0}, Lo/eyo$1;-><init>(Lo/eyo;)V

    invoke-virtual {p1, v0}, Lo/ezm;->setOnFocusAreaChangeListener(Lo/ezm$c;)V

    .line 181
    return-void
.end method

.method private e()V
    .locals 1

    .line 150
    iget v0, p0, Lo/eyo;->h:F

    invoke-direct {p0, v0}, Lo/eyo;->c(F)V

    .line 151
    return-void
.end method

.method static synthetic e(Lo/eyo;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/eyo;->e()V

    return-void
.end method

.method static synthetic e(Lo/eyo;F)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/eyo;->c(F)V

    return-void
.end method

.method static synthetic e(Lo/eyo;Ljava/util/List;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/eyo;->c(Ljava/util/List;)V

    return-void
.end method

.method private i()V
    .locals 1

    .line 199
    iget-object v0, p0, Lo/eyo;->o:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/eyo;->c(Ljava/util/List;)V

    .line 200
    return-void
.end method


# virtual methods
.method protected b(Ljava/util/List;)Lo/ezi$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezj;>;)Lo/ezi$g;"
        }
    .end annotation

    .line 38
    new-instance v0, Lo/eyo$b;

    invoke-direct {v0, p0, p1}, Lo/eyo$b;-><init>(Lo/eyo;Ljava/util/List;)V

    return-object v0
.end method
