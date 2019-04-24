.class public Lo/ahl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private a:F

.field private b:B

.field private c:F

.field private d:I

.field private e:F

.field private g:Lo/kn;

.field private i:F

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lo/ahl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ahl;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(FFBIFD)V
    .locals 6

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Lo/ahl;->e:F

    .line 44
    iput p2, p0, Lo/ahl;->c:F

    .line 45
    iput-byte p3, p0, Lo/ahl;->b:B

    .line 46
    iput p4, p0, Lo/ahl;->d:I

    .line 47
    iput p5, p0, Lo/ahl;->a:F

    .line 48
    new-instance v0, Lo/kn;

    invoke-direct {v0}, Lo/kn;-><init>()V

    iput-object v0, p0, Lo/ahl;->g:Lo/kn;

    .line 49
    const-wide/16 v0, 0x0

    cmpl-double v0, p6, v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct {p0}, Lo/ahl;->l()F

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/kn;->e(FFBIF)V

    .line 51
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct {p0}, Lo/ahl;->l()F

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/kn;->c(FFBIF)I

    move-result v0

    iput v0, p0, Lo/ahl;->k:I

    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    double-to-float v5, p6

    invoke-virtual/range {v0 .. v5}, Lo/kn;->e(FFBIF)V

    .line 54
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    double-to-float v5, p6

    invoke-virtual/range {v0 .. v5}, Lo/kn;->c(FFBIF)I

    move-result v0

    iput v0, p0, Lo/ahl;->k:I

    .line 56
    :goto_0
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightAlgorithm  mCheckCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ahl;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void
.end method

.method private l()F
    .locals 5

    .line 74
    iget v0, p0, Lo/ahl;->e:F

    iget-byte v1, p0, Lo/ahl;->b:B

    iget v2, p0, Lo/ahl;->c:F

    iget v3, p0, Lo/ahl;->d:I

    iget v4, p0, Lo/ahl;->a:F

    invoke-static {v0, v1, v2, v3, v4}, Lo/kn;->a(FBFIF)I

    move-result v0

    if-gez v0, :cond_0

    .line 75
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calcResistance()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 78
    :cond_0
    iget v0, p0, Lo/ahl;->e:F

    iget-byte v1, p0, Lo/ahl;->b:B

    iget v2, p0, Lo/ahl;->c:F

    iget v3, p0, Lo/ahl;->d:I

    iget v4, p0, Lo/ahl;->a:F

    invoke-static {v0, v1, v2, v3, v4}, Lo/kn;->a(FBFIF)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/ahl;->i:F

    .line 79
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u53cd\u7b97\u540e\u5f97\u5230\u7684\u963b\u6297="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ahl;->i:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget v0, p0, Lo/ahl;->i:F

    return v0
.end method


# virtual methods
.method public a()F
    .locals 4

    .line 109
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 110
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->k()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->k()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x404d800000000000L    # 59.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 113
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVFR()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 117
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->k()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 4

    .line 85
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 86
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->e()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 89
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTFR()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 92
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->e()F

    move-result v0

    return v0
.end method

.method public c()F
    .locals 4

    .line 122
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 123
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 125
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->a()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->a()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x4051800000000000L    # 70.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 126
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSLM()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 129
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->a()F

    move-result v0

    return v0
.end method

.method public d()F
    .locals 4

    .line 97
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 98
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 100
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->g()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 101
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBMR()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 104
    :cond_1
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->g()F

    move-result v0

    return v0
.end method

.method public e()F
    .locals 1

    .line 26
    iget v0, p0, Lo/ahl;->i:F

    return v0
.end method

.method public f()F
    .locals 4

    .line 157
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 158
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 160
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->i()F

    move-result v0

    const/high16 v1, 0x41900000    # 18.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->i()F

    move-result v0

    const/high16 v1, 0x42a00000    # 80.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 161
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBodyAge()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 164
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->i()F

    move-result v0

    return v0
.end method

.method public g()F
    .locals 4

    .line 145
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 146
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 148
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->b()F

    move-result v0

    iget v1, p0, Lo/ahl;->c:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 149
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPM()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 152
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->b()F

    move-result v0

    return v0
.end method

.method public h()F
    .locals 5

    .line 181
    iget v0, p0, Lo/ahl;->e:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, Lo/ahl;->c:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 182
    :cond_0
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBMI()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 185
    :cond_1
    iget v0, p0, Lo/ahl;->c:F

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lo/ahl;->e:F

    iget v2, p0, Lo/ahl;->e:F

    mul-float/2addr v1, v2

    div-float v4, v0, v1

    .line 186
    new-instance v0, Ljava/math/BigDecimal;

    float-to-double v1, v4

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0
.end method

.method public i()F
    .locals 4

    .line 169
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 170
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 172
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->h()I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->h()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_2

    .line 173
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getScore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 176
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->h()I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public k()F
    .locals 4

    .line 134
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 135
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 137
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->f()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->f()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 138
    :cond_1
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 140
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->f()F

    move-result v0

    return v0
.end method

.method public m()F
    .locals 4

    .line 191
    iget v0, p0, Lo/ahl;->k:I

    if-gez v0, :cond_0

    .line 192
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 194
    :cond_0
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->c()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->c()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x4051800000000000L    # 70.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 195
    :cond_1
    sget-object v0, Lo/ahl;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSMM()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 198
    :cond_2
    iget-object v0, p0, Lo/ahl;->g:Lo/kn;

    invoke-virtual {v0}, Lo/kn;->c()F

    move-result v0

    return v0
.end method
