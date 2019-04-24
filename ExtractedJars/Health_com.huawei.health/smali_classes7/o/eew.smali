.class public Lo/eew;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/efi;


# instance fields
.field protected a:Lo/eft;

.field protected b:I

.field protected c:I

.field protected d:Landroid/content/Context;

.field protected e:Lo/eft;

.field protected f:I

.field protected g:I

.field protected h:Lo/efh;

.field protected i:Lo/efk;

.field protected k:Lo/eft;

.field protected l:Ljava/lang/String;

.field protected m:Z

.field private n:Lo/eew;

.field protected o:Lo/efq;

.field protected p:I

.field private q:Lo/efi$b;

.field private s:Z

.field private t:Lo/efr;

.field private u:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Lo/eft;

    invoke-direct {v0}, Lo/eft;-><init>()V

    iput-object v0, p0, Lo/eew;->e:Lo/eft;

    .line 24
    new-instance v0, Lo/eft;

    invoke-direct {v0}, Lo/eft;-><init>()V

    iput-object v0, p0, Lo/eew;->a:Lo/eft;

    .line 25
    new-instance v0, Lo/eft;

    invoke-direct {v0}, Lo/eft;-><init>()V

    iput-object v0, p0, Lo/eew;->k:Lo/eft;

    .line 26
    new-instance v0, Lo/efh;

    invoke-direct {v0}, Lo/efh;-><init>()V

    iput-object v0, p0, Lo/eew;->h:Lo/efh;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/eew;->f:I

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lo/eew;->g:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lo/eew;->p:I

    .line 31
    const-string v0, "gles_engine_material/default_simple.mat"

    iput-object v0, p0, Lo/eew;->l:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eew;->s:Z

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eew;->u:Z

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eew;->m:Z

    .line 201
    new-instance v0, Lo/efr;

    invoke-direct {v0}, Lo/efr;-><init>()V

    iput-object v0, p0, Lo/eew;->t:Lo/efr;

    .line 39
    iput-object p1, p0, Lo/eew;->d:Landroid/content/Context;

    .line 40
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->f()V

    .line 41
    const-string v0, "Actor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " getModelMatrix="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/eew;->l()[F

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eew;->m:Z

    .line 56
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eew;->s:Z

    .line 117
    iget-object v0, p0, Lo/eew;->e:Lo/eft;

    new-instance v1, Lo/eew$3;

    invoke-direct {v1, p0, p1}, Lo/eew$3;-><init>(Lo/eew;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eft;->a(Ljava/lang/Runnable;)V

    .line 125
    new-instance v0, Lo/eew$2;

    invoke-direct {v0, p0}, Lo/eew$2;-><init>(Lo/eew;)V

    invoke-virtual {p0, v0}, Lo/eew;->c(Ljava/lang/Runnable;)V

    .line 131
    return-void
.end method

.method protected b(Ljava/lang/String;)I
    .locals 2

    .line 137
    iget-object v0, p0, Lo/eew;->i:Lo/efk;

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lo/eew;->i:Lo/efk;

    invoke-virtual {v0, p1}, Lo/efk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 139
    if-nez v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0

    .line 141
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public b()V
    .locals 1

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eew;->m:Z

    .line 60
    return-void
.end method

.method public b(FFFFFFFFF)V
    .locals 10

    .line 238
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lo/efh;->c(FFFFFFFFF)V

    .line 239
    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 85
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo/eew;->c(Landroid/graphics/Bitmap;Z)V

    .line 86
    return-void
.end method

.method public b(Lo/efr;)V
    .locals 4

    .line 233
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    iget v1, p1, Lo/efr;->a:F

    iget v2, p1, Lo/efr;->e:F

    iget v3, p1, Lo/efr;->c:F

    invoke-virtual {v0, v1, v2, v3}, Lo/efh;->a(FFF)V

    .line 234
    return-void
.end method

.method public c()V
    .locals 1

    .line 63
    iget v0, p0, Lo/eew;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 64
    iget-object v0, p0, Lo/eew;->k:Lo/eft;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lo/eew;->k:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->e()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->k:Lo/eft;

    .line 68
    :cond_0
    iget-object v0, p0, Lo/eew;->a:Lo/eft;

    if-eqz v0, :cond_1

    .line 69
    iget-object v0, p0, Lo/eew;->a:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->e()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->a:Lo/eft;

    .line 72
    :cond_1
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    if-eqz v0, :cond_2

    .line 73
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->d()V

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->h:Lo/efh;

    .line 76
    :cond_2
    iget-object v0, p0, Lo/eew;->i:Lo/efk;

    if-eqz v0, :cond_3

    .line 77
    iget-object v0, p0, Lo/eew;->i:Lo/efk;

    invoke-virtual {v0}, Lo/efk;->c()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->i:Lo/efk;

    .line 80
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->n:Lo/eew;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eew;->q:Lo/efi$b;

    .line 82
    return-void
.end method

.method public c(FFFF)V
    .locals 1

    .line 223
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/efh;->b(FFFF)V

    .line 224
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .line 89
    iget-object v0, p0, Lo/eew;->o:Lo/efq;

    invoke-virtual {p0, p1, v0, p2}, Lo/eew;->e(Landroid/graphics/Bitmap;Lo/efq;Z)V

    .line 90
    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    .line 145
    iget-object v0, p0, Lo/eew;->k:Lo/eft;

    invoke-virtual {v0, p1}, Lo/eft;->a(Ljava/lang/Runnable;)V

    .line 146
    return-void
.end method

.method protected d()V
    .locals 1

    .line 111
    iget v0, p0, Lo/eew;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 112
    iget-object v0, p0, Lo/eew;->a:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->b()V

    .line 113
    return-void
.end method

.method public d(FFFFFF)V
    .locals 7

    .line 243
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/efh;->c(FFFFFF)V

    .line 244
    return-void
.end method

.method public d(II)V
    .locals 0

    .line 159
    iput p1, p0, Lo/eew;->c:I

    .line 160
    iput p2, p0, Lo/eew;->b:I

    .line 161
    return-void
.end method

.method public d(Lo/efi$b;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/eew;->q:Lo/efi$b;

    .line 194
    return-void
.end method

.method public d(Lo/efr;)V
    .locals 4

    .line 211
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    iget v1, p1, Lo/efr;->a:F

    iget v2, p1, Lo/efr;->e:F

    iget v3, p1, Lo/efr;->c:F

    invoke-virtual {v0, v1, v2, v3}, Lo/efh;->e(FFF)V

    .line 212
    iget-object v0, p0, Lo/eew;->t:Lo/efr;

    invoke-virtual {v0, p1}, Lo/efr;->a(Lo/efr;)Lo/efr;

    move-result-object v0

    iput-object v0, p0, Lo/eew;->t:Lo/efr;

    .line 213
    return-void
.end method

.method protected e()V
    .locals 0

    .line 134
    return-void
.end method

.method public e(Landroid/graphics/Bitmap;Lo/efq;Z)V
    .locals 1

    .line 93
    new-instance v0, Lo/eew$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/eew$1;-><init>(Lo/eew;Landroid/graphics/Bitmap;Lo/efq;Z)V

    invoke-virtual {p0, v0}, Lo/eew;->c(Ljava/lang/Runnable;)V

    .line 104
    return-void
.end method

.method public e(Lo/eew;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/eew;->n:Lo/eew;

    .line 50
    return-void
.end method

.method public f()V
    .locals 1

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eew;->u:Z

    .line 155
    return-void
.end method

.method public g()Z
    .locals 1

    .line 181
    iget-boolean v0, p0, Lo/eew;->u:Z

    return v0
.end method

.method public h()Lo/efi$b;
    .locals 1

    .line 198
    iget-object v0, p0, Lo/eew;->q:Lo/efi$b;

    return-object v0
.end method

.method public i()V
    .locals 2

    .line 165
    iget v0, p0, Lo/eew;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lo/eew;->s:Z

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Lo/eew;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/eew;->a(Ljava/lang/String;)V

    .line 168
    :cond_0
    iget-object v0, p0, Lo/eew;->e:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->b()V

    .line 169
    iget-object v0, p0, Lo/eew;->k:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->b()V

    .line 170
    iget v0, p0, Lo/eew;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 171
    iget-object v0, p0, Lo/eew;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/eew;->a(Ljava/lang/String;)V

    .line 173
    :cond_1
    iget v0, p0, Lo/eew;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 174
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mProgramID == -1"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 176
    :cond_2
    invoke-virtual {p0}, Lo/eew;->d()V

    .line 177
    return-void
.end method

.method public k()V
    .locals 1

    .line 186
    iget-object v0, p0, Lo/eew;->q:Lo/efi$b;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/eew;->q:Lo/efi$b;

    invoke-interface {v0}, Lo/efi$b;->c()V

    .line 189
    :cond_0
    return-void
.end method

.method public l()[F
    .locals 1

    .line 258
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->i()[F

    move-result-object v0

    return-object v0
.end method

.method public m()[F
    .locals 1

    .line 263
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->h()[F

    move-result-object v0

    return-object v0
.end method

.method public n()[F
    .locals 1

    .line 273
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->g()[F

    move-result-object v0

    return-object v0
.end method

.method public o()[F
    .locals 1

    .line 268
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->k()[F

    move-result-object v0

    return-object v0
.end method

.method public p()[F
    .locals 1

    .line 253
    iget-object v0, p0, Lo/eew;->h:Lo/efh;

    invoke-virtual {v0}, Lo/efh;->e()[F

    move-result-object v0

    return-object v0
.end method
