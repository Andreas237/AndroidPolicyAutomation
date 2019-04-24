.class public final Lo/cgn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:D

.field private b:F

.field private c:F

.field private d:F

.field private e:D

.field private f:F

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:F

.field private k:J

.field private m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/cgn;->i:F

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->g:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->m:Z

    .line 30
    return-void
.end method

.method public constructor <init>(Lo/cgk;FFFFJLjava/lang/String;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/cgn;->i:F

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->g:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->m:Z

    .line 35
    iget-wide v0, p1, Lo/cgk;->b:D

    iput-wide v0, p0, Lo/cgn;->a:D

    .line 36
    iget-wide v0, p1, Lo/cgk;->d:D

    iput-wide v0, p0, Lo/cgn;->e:D

    .line 37
    iput p2, p0, Lo/cgn;->b:F

    .line 38
    iput p3, p0, Lo/cgn;->d:F

    .line 39
    iput p4, p0, Lo/cgn;->c:F

    .line 40
    iput p5, p0, Lo/cgn;->f:F

    .line 41
    iput-wide p6, p0, Lo/cgn;->k:J

    .line 42
    iput-object p8, p0, Lo/cgn;->h:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public constructor <init>(Lo/cgn;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/cgn;->i:F

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->g:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgn;->m:Z

    .line 46
    invoke-virtual {p1}, Lo/cgn;->b()D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgn;->a:D

    .line 47
    invoke-virtual {p1}, Lo/cgn;->e()D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgn;->e:D

    .line 48
    invoke-virtual {p1}, Lo/cgn;->a()F

    move-result v0

    iput v0, p0, Lo/cgn;->b:F

    .line 49
    invoke-virtual {p1}, Lo/cgn;->g()F

    move-result v0

    iput v0, p0, Lo/cgn;->d:F

    .line 50
    invoke-virtual {p1}, Lo/cgn;->f()F

    move-result v0

    iput v0, p0, Lo/cgn;->c:F

    .line 51
    invoke-virtual {p1}, Lo/cgn;->h()F

    move-result v0

    iput v0, p0, Lo/cgn;->f:F

    .line 52
    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cgn;->k:J

    .line 53
    invoke-virtual {p1}, Lo/cgn;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cgn;->h:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Lo/cgn;->l()F

    move-result v0

    iput v0, p0, Lo/cgn;->i:F

    .line 55
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 74
    iget v0, p0, Lo/cgn;->b:F

    return v0
.end method

.method public a(D)V
    .locals 0

    .line 87
    iput-wide p1, p0, Lo/cgn;->a:D

    .line 89
    return-void
.end method

.method public b()D
    .locals 2

    .line 93
    iget-wide v0, p0, Lo/cgn;->a:D

    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 66
    iget-wide v0, p0, Lo/cgn;->k:J

    return-wide v0
.end method

.method public c(Z)V
    .locals 0

    .line 132
    iput-boolean p1, p0, Lo/cgn;->m:Z

    .line 133
    return-void
.end method

.method public d()Lo/cgk;
    .locals 5

    .line 58
    new-instance v0, Lo/cgk;

    iget-wide v1, p0, Lo/cgn;->e:D

    iget-wide v3, p0, Lo/cgn;->a:D

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    return-object v0
.end method

.method public d(D)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lo/cgn;->e:D

    .line 84
    return-void
.end method

.method public d(F)V
    .locals 0

    .line 148
    iput p1, p0, Lo/cgn;->i:F

    .line 149
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 140
    iput-boolean p1, p0, Lo/cgn;->g:Z

    .line 141
    return-void
.end method

.method public e()D
    .locals 2

    .line 91
    iget-wide v0, p0, Lo/cgn;->e:D

    return-wide v0
.end method

.method public f()F
    .locals 1

    .line 104
    iget v0, p0, Lo/cgn;->c:F

    return v0
.end method

.method public g()F
    .locals 1

    .line 96
    iget v0, p0, Lo/cgn;->d:F

    return v0
.end method

.method public h()F
    .locals 1

    .line 112
    iget v0, p0, Lo/cgn;->f:F

    return v0
.end method

.method public i()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lo/cgn;->m:Z

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/cgn;->h:Ljava/lang/String;

    return-object v0
.end method

.method public l()F
    .locals 1

    .line 144
    iget v0, p0, Lo/cgn;->i:F

    return v0
.end method

.method public o()Z
    .locals 1

    .line 136
    iget-boolean v0, p0, Lo/cgn;->g:Z

    return v0
.end method
