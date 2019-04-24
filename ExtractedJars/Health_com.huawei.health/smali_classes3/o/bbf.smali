.class public Lo/bbf;
.super Lo/bbi;
.source "SourceFile"


# instance fields
.field private final f:Ljava/lang/String;

.field private g:Z

.field private final h:J

.field private i:Z

.field private final k:Ljava/lang/String;

.field private p:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 63
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_sd.jpg"

    invoke-direct {p0, p3, v0, v1}, Lo/bbi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bbf;->i:Z

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bbf;->g:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bbf;->p:Z

    .line 64
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    iput-object p4, p0, Lo/bbf;->f:Ljava/lang/String;

    goto :goto_0

    .line 70
    :cond_0
    iput-object p5, p0, Lo/bbf;->f:Ljava/lang/String;

    .line 72
    :goto_0
    iput-object p5, p0, Lo/bbf;->k:Ljava/lang/String;

    .line 73
    iput-wide p1, p0, Lo/bbf;->h:J

    .line 74
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 126
    iput-boolean p1, p0, Lo/bbf;->p:Z

    .line 127
    return-void
.end method

.method public a()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lo/bbf;->p:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/bbf;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    .line 94
    iget-wide v0, p0, Lo/bbf;->h:J

    return-wide v0
.end method

.method public c(Z)V
    .locals 1

    .line 141
    iput-boolean p1, p0, Lo/bbf;->g:Z

    .line 142
    iget-boolean v0, p0, Lo/bbf;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "_hd.jpg"

    goto :goto_0

    :cond_0
    const-string v0, "_sd.jpg"

    :goto_0
    iput-object v0, p0, Lo/bbf;->e:Ljava/lang/String;

    .line 143
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/bbf;->k:Ljava/lang/String;

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 136
    iput-boolean p1, p0, Lo/bbf;->i:Z

    .line 137
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lo/bbf;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/bbf;->k:Ljava/lang/String;

    return-object v0

    .line 105
    :cond_0
    iget-object v0, p0, Lo/bbf;->f:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 153
    invoke-super {p0, p1}, Lo/bbi;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 2

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "size=1080"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 147
    iget-boolean v0, p0, Lo/bbf;->g:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 159
    invoke-super {p0}, Lo/bbi;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    .line 131
    iget-boolean v0, p0, Lo/bbf;->i:Z

    return v0
.end method
