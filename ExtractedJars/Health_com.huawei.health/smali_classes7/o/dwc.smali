.class public Lo/dwc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field public d:J

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:J

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:I

.field private t:I

.field private u:Ljava/lang/String;

.field private y:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->b:Ljava/lang/String;

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->a:Ljava/lang/String;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->c:Ljava/lang/String;

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->e:Ljava/lang/String;

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lo/dwc;->f:I

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/dwc;->h:I

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/dwc;->g:I

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->k:Ljava/lang/String;

    .line 57
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->o:Ljava/lang/String;

    .line 58
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dwc;->d:J

    .line 59
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/32 v2, 0x57b12c00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/dwc;->m:J

    .line 60
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->n:Ljava/lang/String;

    .line 61
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->p:Ljava/lang/String;

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->l:Ljava/lang/String;

    .line 63
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->q:Ljava/lang/String;

    .line 64
    const/4 v0, 0x1

    iput v0, p0, Lo/dwc;->t:I

    .line 65
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->u:Ljava/lang/String;

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lo/dwc;->r:Ljava/lang/String;

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/dwc;->s:I

    .line 68
    const/16 v0, 0xb

    iput v0, p0, Lo/dwc;->y:I

    .line 69
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 211
    iget v0, p0, Lo/dwc;->f:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 311
    iput p1, p0, Lo/dwc;->t:I

    .line 312
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 271
    iput-wide p1, p0, Lo/dwc;->m:J

    .line 272
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/dwc;->a:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/dwc;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 223
    iput p1, p0, Lo/dwc;->h:I

    .line 224
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lo/dwc;->o:Ljava/lang/String;

    .line 256
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lo/dwc;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 215
    iput p1, p0, Lo/dwc;->f:I

    .line 216
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 263
    iput-wide p1, p0, Lo/dwc;->d:J

    .line 264
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lo/dwc;->c:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Lo/dwc;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 231
    iput p1, p0, Lo/dwc;->g:I

    .line 232
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lo/dwc;->k:Ljava/lang/String;

    .line 248
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/dwc;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 239
    iput p1, p0, Lo/dwc;->i:I

    .line 240
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lo/dwc;->b:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public f()I
    .locals 1

    .line 227
    iget v0, p0, Lo/dwc;->g:I

    return v0
.end method

.method public f(I)V
    .locals 0

    .line 319
    iput p1, p0, Lo/dwc;->y:I

    .line 320
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lo/dwc;->p:Ljava/lang/String;

    .line 288
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Lo/dwc;->o:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lo/dwc;->u:Ljava/lang/String;

    .line 328
    return-void
.end method

.method public h()I
    .locals 1

    .line 219
    iget v0, p0, Lo/dwc;->h:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 235
    iget v0, p0, Lo/dwc;->i:I

    return v0
.end method

.method public i(I)V
    .locals 0

    .line 343
    iput p1, p0, Lo/dwc;->s:I

    .line 344
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lo/dwc;->k:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lo/dwc;->n:Ljava/lang/String;

    .line 280
    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 291
    iget-object v0, p0, Lo/dwc;->l:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/dwc;->n:Ljava/lang/String;

    return-object v0
.end method

.method public n()J
    .locals 2

    .line 267
    iget-wide v0, p0, Lo/dwc;->m:J

    return-wide v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lo/dwc;->p:Ljava/lang/String;

    return-object v0
.end method

.method public p()J
    .locals 2

    .line 259
    iget-wide v0, p0, Lo/dwc;->d:J

    return-wide v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 323
    iget-object v0, p0, Lo/dwc;->u:Ljava/lang/String;

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 299
    iget-object v0, p0, Lo/dwc;->q:Ljava/lang/String;

    return-object v0
.end method

.method public s()I
    .locals 1

    .line 339
    iget v0, p0, Lo/dwc;->s:I

    return v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 331
    iget-object v0, p0, Lo/dwc;->r:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 348
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageObject{, msgId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", module=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metaData=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", readFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwc;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwc;->m:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUriExt=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", from=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imei=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwc;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgNotify="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwc;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    .line 307
    iget v0, p0, Lo/dwc;->t:I

    return v0
.end method
