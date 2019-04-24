.class public Lo/ard;
.super Lo/arc;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 81
    invoke-direct {p0, p1}, Lo/arc;-><init>(Ljava/lang/String;)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/ard;->d:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lo/ard;->a:I

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ard;->b:Z

    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 1

    .line 75
    invoke-direct {p0, p1, p2}, Lo/arc;-><init>(Ljava/lang/String;Z)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/ard;->d:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lo/ard;->a:I

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ard;->b:Z

    .line 76
    iput-boolean p3, p0, Lo/ard;->b:Z

    .line 77
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/ard;->e:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 138
    iput p1, p0, Lo/ard;->a:I

    .line 139
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 64
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, p1, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ard;->c:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 117
    iput p1, p0, Lo/ard;->d:I

    .line 118
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 150
    invoke-virtual {p0}, Lo/ard;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {p0}, Lo/ard;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 154
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 106
    iget v0, p0, Lo/ard;->d:I

    .line 107
    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/ard;->e:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 127
    iget v0, p0, Lo/ard;->a:I

    .line 128
    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 3

    .line 166
    invoke-virtual {p0}, Lo/ard;->f()Ljava/lang/String;

    move-result-object v2

    .line 167
    invoke-virtual {p0}, Lo/ard;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    iget-object v0, p0, Lo/ard;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ard;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 177
    :cond_0
    iget v0, p0, Lo/ard;->d:I

    if-lez v0, :cond_1

    iget v0, p0, Lo/ard;->a:I

    if-gtz v0, :cond_2

    .line 179
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "o"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 184
    :cond_2
    iget-boolean v0, p0, Lo/ard;->b:Z

    if-eqz v0, :cond_3

    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 190
    :cond_3
    :goto_0
    return-object v2
.end method

.method public m()Ljava/lang/String;
    .locals 5

    .line 197
    invoke-virtual {p0}, Lo/ard;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {p0}, Lo/ard;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 202
    :cond_0
    invoke-virtual {p0}, Lo/ard;->l()Ljava/lang/String;

    move-result-object v4

    .line 203
    invoke-static {v4}, Lo/bbj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lo/ard;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 205
    const-string v0, "mediaImagedata"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFilePath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    return-object v3
.end method
