.class public Lo/aye;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Landroid/graphics/Bitmap;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Landroid/graphics/Bitmap;

.field private i:I

.field private k:Landroid/content/Intent;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Z

.field private o:Z

.field private p:Z

.field private s:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aye;->b:Z

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lo/aye;->m:Ljava/lang/String;

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aye;->n:Z

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aye;->p:Z

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aye;->o:Z

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aye;->l:Ljava/lang/String;

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aye;->s:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lo/aye;->f:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lo/aye;->h:Landroid/graphics/Bitmap;

    .line 279
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lo/aye;->c:Ljava/lang/String;

    .line 222
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lo/aye;->m:Ljava/lang/String;

    .line 99
    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 238
    iput p1, p0, Lo/aye;->a:I

    .line 239
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/aye;->f:Ljava/lang/String;

    .line 156
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/aye;->d:Landroid/graphics/Bitmap;

    .line 205
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/aye;->e:Ljava/lang/String;

    .line 189
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 129
    iput-boolean p1, p0, Lo/aye;->b:Z

    .line 130
    return-void
.end method

.method public c()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Lo/aye;->n:Z

    .line 138
    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 288
    iput-object p1, p0, Lo/aye;->l:Ljava/lang/String;

    .line 289
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 298
    iput-boolean p1, p0, Lo/aye;->s:Z

    .line 299
    return-void
.end method

.method public d()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lo/aye;->p:Z

    .line 108
    return v0
.end method

.method public e(Landroid/content/Intent;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lo/aye;->k:Landroid/content/Intent;

    .line 172
    return-void
.end method

.method public e()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lo/aye;->b:Z

    .line 119
    return v0
.end method

.method public f()Landroid/graphics/Bitmap;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/aye;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/aye;->e:Ljava/lang/String;

    .line 180
    return-object v0
.end method

.method public h()Landroid/content/Intent;
    .locals 1

    .line 163
    iget-object v0, p0, Lo/aye;->k:Landroid/content/Intent;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 229
    iget v0, p0, Lo/aye;->a:I

    .line 230
    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lo/aye;->c:Ljava/lang/String;

    .line 213
    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lo/aye;->l:Ljava/lang/String;

    return-object v0
.end method

.method public m()I
    .locals 1

    .line 246
    iget v0, p0, Lo/aye;->g:I

    .line 247
    return v0
.end method

.method public n()Z
    .locals 1

    .line 293
    iget-boolean v0, p0, Lo/aye;->s:Z

    return v0
.end method

.method public p()Landroid/graphics/Bitmap;
    .locals 1

    .line 273
    iget-object v0, p0, Lo/aye;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messageNumber:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aye;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " isShowIcon:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/aye;->o:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
