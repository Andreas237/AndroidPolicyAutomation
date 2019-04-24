.class public Lo/elg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/github/mikephil/charting/data/Entry;

.field private b:F

.field private c:Z

.field private d:Z

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->c:Z

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->d:Z

    .line 31
    return-void
.end method

.method public constructor <init>(FFLcom/github/mikephil/charting/data/Entry;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->c:Z

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->d:Z

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lo/elg;->e(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->c:Z

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elg;->d:Z

    .line 28
    invoke-direct {p0, p1}, Lo/elg;->c(Lcom/github/mikephil/charting/data/Entry;)V

    .line 29
    return-void
.end method

.method private c(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1

    .line 38
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    iput v0, p0, Lo/elg;->b:F

    .line 39
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    iput v0, p0, Lo/elg;->e:F

    .line 40
    iput-object p1, p0, Lo/elg;->a:Lcom/github/mikephil/charting/data/Entry;

    .line 41
    return-void
.end method

.method private e(FFLcom/github/mikephil/charting/data/Entry;)V
    .locals 0

    .line 48
    iput p1, p0, Lo/elg;->b:F

    .line 49
    iput p2, p0, Lo/elg;->e:F

    .line 50
    iput-object p3, p0, Lo/elg;->a:Lcom/github/mikephil/charting/data/Entry;

    .line 51
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 58
    iget v0, p0, Lo/elg;->e:F

    return v0
.end method

.method public a(Lo/nv;)Lo/elg;
    .locals 5

    .line 85
    const/4 v0, 0x2

    new-array v4, v0, [F

    invoke-virtual {p0}, Lo/elg;->c()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    invoke-virtual {p0}, Lo/elg;->a()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 86
    invoke-virtual {p1, v4}, Lo/nv;->e([F)V

    .line 87
    new-instance v0, Lo/elg;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x1

    aget v2, v4, v2

    iget-object v3, p0, Lo/elg;->a:Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v0, v1, v2, v3}, Lo/elg;-><init>(FFLcom/github/mikephil/charting/data/Entry;)V

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .line 66
    iput-boolean p1, p0, Lo/elg;->d:Z

    .line 67
    return-void
.end method

.method public b()Lcom/github/mikephil/charting/data/Entry;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/elg;->a:Lcom/github/mikephil/charting/data/Entry;

    return-object v0
.end method

.method public b(FFLcom/github/mikephil/charting/data/Entry;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/elg;->e(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 45
    return-void
.end method

.method public c()F
    .locals 1

    .line 54
    iget v0, p0, Lo/elg;->b:F

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Lo/elg;->c:Z

    .line 63
    return-void
.end method

.method public d()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lo/elg;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/elg;->d:Z

    if-nez v0, :cond_0

    .line 79
    const/4 v0, 0x1

    return v0

    .line 81
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lo/elg;->c:Z

    return v0
.end method
