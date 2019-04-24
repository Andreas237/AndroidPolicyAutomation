.class public Lo/fly;
.super Lo/flq;
.source "SourceFile"


# instance fields
.field private final b:Lo/flj$b;

.field private c:Ljava/lang/Long;

.field private d:Z


# direct methods
.method public constructor <init>(Lo/flj$b;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Lo/flq;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fly;->d:Z

    .line 83
    iput-object p1, p0, Lo/fly;->b:Lo/flj$b;

    .line 84
    return-void
.end method

.method public static b(Lo/fma;Lo/flj$b;)Lo/fly;
    .locals 3

    .line 69
    invoke-virtual {p0}, Lo/fma;->r()Lo/fow;

    move-result-object v0

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "received request must contain a source context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    new-instance v2, Lo/fly;

    invoke-direct {v2, p1}, Lo/fly;-><init>(Lo/flj$b;)V

    .line 73
    invoke-virtual {p0}, Lo/fma;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fly;->d(Lo/fow;)Lo/flq;

    .line 74
    return-object v2
.end method


# virtual methods
.method public E()Ljava/lang/Long;
    .locals 1

    .line 133
    iget-object v0, p0, Lo/fly;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public F()Lo/flj$b;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/fly;->b:Lo/flj$b;

    return-object v0
.end method

.method public G()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lo/fly;->d:Z

    return v0
.end method

.method public H()Z
    .locals 1

    .line 152
    invoke-virtual {p0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    return v0
.end method

.method public I()Z
    .locals 1

    .line 162
    invoke-virtual {p0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final J()Z
    .locals 1

    .line 180
    iget-object v0, p0, Lo/fly;->b:Lo/flj$b;

    invoke-static {v0}, Lo/flj$b;->d(Lo/flj$b;)Z

    move-result v0

    return v0
.end method

.method public final L()Z
    .locals 1

    .line 189
    iget-object v0, p0, Lo/fly;->b:Lo/flj$b;

    invoke-static {v0}, Lo/flj$b;->c(Lo/flj$b;)Z

    move-result v0

    return v0
.end method

.method public final M()Z
    .locals 1

    .line 171
    invoke-virtual {p0}, Lo/fly;->J()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/fly;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(J)V
    .locals 1

    .line 142
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lo/fly;->c:Ljava/lang/Long;

    .line 143
    return-void
.end method

.method public e()I
    .locals 1

    .line 97
    iget-object v0, p0, Lo/fly;->b:Lo/flj$b;

    iget v0, v0, Lo/flj$b;->z:I

    return v0
.end method

.method public k(Z)V
    .locals 0

    .line 124
    iput-boolean p1, p0, Lo/fly;->d:Z

    .line 125
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 102
    invoke-virtual {p0}, Lo/fly;->o()Ljava/lang/String;

    move-result-object v4

    .line 103
    const-string v0, "%s-%-6s MID=%5d, Token=%s, OptionSet=%s, %s"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/fly;->b()Lo/flj$e;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fly;->F()Lo/flj$b;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fly;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fly;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fly;->f()Lo/flr;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
