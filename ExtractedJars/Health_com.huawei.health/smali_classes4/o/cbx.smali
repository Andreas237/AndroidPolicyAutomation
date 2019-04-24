.class public Lo/cbx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfd;>;"
        }
    .end annotation
.end field

.field private b:Lo/cfd;

.field private c:Lo/cbp;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfd;>;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Lo/ccl;


# direct methods
.method public constructor <init>(Lo/cbp;Lo/ccl;)V
    .locals 4

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbx;->c:Lo/cbp;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbx;->e:Z

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbx;->f:Lo/ccl;

    .line 32
    if-nez p1, :cond_0

    .line 33
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepRateUtils adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void

    .line 37
    :cond_0
    iput-object p1, p0, Lo/cbx;->c:Lo/cbp;

    .line 38
    iput-object p2, p0, Lo/cbx;->f:Lo/ccl;

    .line 40
    return-void
.end method

.method static synthetic a(Lo/cbx;)Lo/ccl;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/cbx;->f:Lo/ccl;

    return-object v0
.end method

.method static synthetic c(Lo/cbx;)Ljava/util/List;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/cbx;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 15
    iput-object p1, p0, Lo/cbx;->a:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/cbx;)Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lo/cbx;->e:Z

    return v0
.end method

.method static synthetic e(Lo/cbx;)Ljava/util/List;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lo/cbx;Lo/cfd;)Lo/cfd;
    .locals 0

    .line 15
    iput-object p1, p0, Lo/cbx;->b:Lo/cfd;

    return-object p1
.end method

.method private e(I)V
    .locals 4

    .line 80
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    if-nez v0, :cond_0

    .line 81
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerRealStepListener mPluginTrackAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    new-instance v1, Lo/cbx$2;

    invoke-direct {v1, p0}, Lo/cbx$2;-><init>(Lo/cbx;)V

    const-wide/16 v2, 0x3c

    invoke-interface {v0, v1, v2, v3, p1}, Lo/cbp;->b(Lo/ces;JI)V

    .line 109
    return-void
.end method

.method private e(Z)V
    .locals 4

    .line 122
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    if-nez v0, :cond_0

    .line 123
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseRealStepTick mPluginTrackAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    invoke-interface {v0, p1}, Lo/cbp;->d(Z)V

    .line 128
    return-void
.end method

.method private f()V
    .locals 2

    .line 234
    iget-object v0, p0, Lo/cbx;->b:Lo/cfd;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    iget-object v1, p0, Lo/cbx;->b:Lo/cfd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    iget-object v1, p0, Lo/cbx;->b:Lo/cfd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 113
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    if-nez v0, :cond_0

    .line 114
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterRealStepListener mPluginTrackAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    invoke-interface {v0}, Lo/cbp;->a()V

    .line 119
    return-void
.end method

.method private k()V
    .locals 4

    .line 217
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    if-nez v0, :cond_0

    .line 218
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentStep() mPluginTrackAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lo/cbx;->c:Lo/cbp;

    new-instance v1, Lo/cbx$1;

    invoke-direct {v1, p0}, Lo/cbx$1;-><init>(Lo/cbx;)V

    invoke-interface {v0, v1}, Lo/cbp;->e(Lo/ces;)V

    .line 231
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/cbx;->e(Z)V

    .line 68
    return-void
.end method

.method public a(Lo/cfd;)V
    .locals 5

    .line 206
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 207
    invoke-virtual {p1}, Lo/cfd;->e()J

    move-result-wide v0

    iget-object v2, p0, Lo/cbx;->a:Ljava/util/List;

    iget-object v3, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cfd;

    invoke-virtual {v2}, Lo/cfd;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    :cond_0
    return-void
.end method

.method public b(Z)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 140
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 141
    if-eqz p1, :cond_0

    .line 142
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 146
    :cond_0
    return-object v1
.end method

.method public b()V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/cbx;->i()V

    .line 72
    invoke-direct {p0}, Lo/cbx;->f()V

    .line 73
    return-void
.end method

.method public c()I
    .locals 7

    .line 179
    const/4 v4, 0x0

    .line 180
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cfd;

    .line 182
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v0

    if-le v0, v4, :cond_0

    .line 183
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v4

    .line 185
    :cond_0
    goto :goto_0

    .line 187
    :cond_1
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBestStepRate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return v4
.end method

.method public c(I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/cbx;->e(I)V

    .line 59
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 76
    iput-boolean p1, p0, Lo/cbx;->e:Z

    .line 77
    return-void
.end method

.method public d(J)I
    .locals 7

    .line 157
    invoke-virtual {p0}, Lo/cbx;->g()I

    move-result v4

    .line 158
    invoke-virtual {p0}, Lo/cbx;->c()I

    move-result v5

    .line 161
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 163
    int-to-float v0, v4

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    long-to-float v1, p1

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float v6, v0, v1

    .line 165
    int-to-float v0, v5

    cmpl-float v0, v6, v0

    if-lez v0, :cond_0

    .line 166
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvgStepRate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    return v5

    .line 169
    :cond_0
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvgStepRate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    float-to-int v2, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    float-to-int v0, v6

    return v0

    .line 174
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation

    .line 132
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 134
    return-object v1
.end method

.method public e()V
    .locals 1

    .line 62
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cbx;->e(Z)V

    .line 63
    invoke-direct {p0}, Lo/cbx;->k()V

    .line 64
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfd;>;)V"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 52
    iget-object v0, p0, Lo/cbx;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 53
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 55
    return-void
.end method

.method public e(Lo/cbp;)V
    .locals 4

    .line 43
    if-nez p1, :cond_0

    .line 44
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAdapter adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return-void

    .line 47
    :cond_0
    iput-object p1, p0, Lo/cbx;->c:Lo/cbp;

    .line 48
    return-void
.end method

.method public e(Lo/ccl;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/cbx;->f:Lo/ccl;

    .line 249
    return-void
.end method

.method public g()I
    .locals 7

    .line 192
    const/4 v4, 0x0

    .line 193
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 194
    iget-object v0, p0, Lo/cbx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cfd;

    .line 195
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v0

    add-int/2addr v4, v0

    .line 196
    goto :goto_0

    .line 197
    :cond_0
    return v4

    .line 199
    :cond_1
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalSteps = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x0

    return v0
.end method

.method public h()I
    .locals 1

    .line 241
    iget-object v0, p0, Lo/cbx;->b:Lo/cfd;

    if-nez v0, :cond_0

    .line 242
    const/4 v0, 0x0

    return v0

    .line 244
    :cond_0
    iget-object v0, p0, Lo/cbx;->b:Lo/cfd;

    invoke-virtual {v0}, Lo/cfd;->c()I

    move-result v0

    return v0
.end method
