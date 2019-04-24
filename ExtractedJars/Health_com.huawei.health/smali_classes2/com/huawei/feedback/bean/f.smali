.class public Lcom/huawei/feedback/bean/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/bean/f$a;,
        Lcom/huawei/feedback/bean/f$b;
    }
.end annotation


# static fields
.field public static final a:I = -0x1

.field private static final b:J = 0x1L


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Landroid/graphics/Bitmap;

.field private q:I

.field private r:Ljava/lang/String;

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Z

.field private y:Z

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/feedback/bean/f;->c:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/bean/f;->s:I

    .line 252
    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 389
    iget v0, p0, Lcom/huawei/feedback/bean/f;->q:I

    return v0
.end method

.method public a()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/huawei/feedback/bean/f;->B:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 149
    iput p1, p0, Lcom/huawei/feedback/bean/f;->B:I

    .line 150
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->p:Landroid/graphics/Bitmap;

    .line 248
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->A:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 167
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/f;->x:Z

    .line 168
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->A:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 223
    iput p1, p0, Lcom/huawei/feedback/bean/f;->s:I

    .line 224
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->z:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 175
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/f;->y:Z

    .line 176
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 297
    iput p1, p0, Lcom/huawei/feedback/bean/f;->f:I

    .line 298
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->v:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public c()Z
    .locals 1

    .line 163
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/f;->x:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 403
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 329
    iput p1, p0, Lcom/huawei/feedback/bean/f;->n:I

    .line 330
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->w:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public d()Z
    .locals 1

    .line 171
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/f;->y:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->z:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 337
    iput p1, p0, Lcom/huawei/feedback/bean/f;->c:I

    .line 338
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->t:Ljava/lang/String;

    .line 208
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->v:Ljava/lang/String;

    return-object v0
.end method

.method public f(I)V
    .locals 0

    .line 393
    iput p1, p0, Lcom/huawei/feedback/bean/f;->q:I

    .line 394
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->u:Ljava/lang/String;

    .line 216
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->w:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->r:Ljava/lang/String;

    .line 240
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->t:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->o:Ljava/lang/String;

    .line 260
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->u:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->d:Ljava/lang/String;

    .line 268
    return-void
.end method

.method public j()I
    .locals 1

    .line 219
    iget v0, p0, Lcom/huawei/feedback/bean/f;->s:I

    return v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->e:Ljava/lang/String;

    .line 276
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->r:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    .line 290
    return-void
.end method

.method public l()Landroid/graphics/Bitmap;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->p:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->g:Ljava/lang/String;

    .line 306
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->o:Ljava/lang/String;

    return-object v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    .line 314
    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->k:Ljava/lang/String;

    .line 322
    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 271
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->i:Ljava/lang/String;

    .line 346
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 3

    .line 280
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    const-string v1, "-0"

    const-string v2, "/"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    .line 282
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    const-string v1, "-"

    const-string v2, "/"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->j:Ljava/lang/String;

    return-object v0
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 353
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->l:Ljava/lang/String;

    .line 354
    return-void
.end method

.method public q()I
    .locals 1

    .line 293
    iget v0, p0, Lcom/huawei/feedback/bean/f;->f:I

    return v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 361
    iput-object p1, p0, Lcom/huawei/feedback/bean/f;->m:Ljava/lang/String;

    .line 362
    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->g:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->k:Ljava/lang/String;

    return-object v0
.end method

.method public u()I
    .locals 1

    .line 325
    iget v0, p0, Lcom/huawei/feedback/bean/f;->n:I

    return v0
.end method

.method public v()I
    .locals 1

    .line 333
    iget v0, p0, Lcom/huawei/feedback/bean/f;->c:I

    return v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->i:Ljava/lang/String;

    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->l:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->m:Ljava/lang/String;

    return-object v0
.end method

.method public z()Landroid/graphics/Bitmap;
    .locals 3

    .line 365
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 368
    :cond_1
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 369
    const/4 v2, 0x0

    .line 370
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    iget-object v0, p0, Lcom/huawei/feedback/bean/f;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 373
    :cond_2
    return-object v2
.end method
