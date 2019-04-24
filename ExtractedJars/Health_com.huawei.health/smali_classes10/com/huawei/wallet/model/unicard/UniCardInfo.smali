.class public Lcom/huawei/wallet/model/unicard/UniCardInfo;
.super Lcom/huawei/wallet/model/unicard/BaseInfo;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:J

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private m:I

.field private n:Z

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/wallet/model/unicard/BaseInfo;-><init>()V

    .line 70
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->k:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 166
    iput p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->p:I

    .line 167
    return-void
.end method

.method public a(J)V
    .locals 2

    .line 497
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f:J

    .line 498
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->k:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 211
    iput-boolean p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->n:Z

    .line 212
    return-void
.end method

.method public b()I
    .locals 1

    .line 161
    iget v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->p:I

    return v0
.end method

.method public b(I)V
    .locals 1

    .line 305
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e:I

    .line 306
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    .line 258
    return-void
.end method

.method public c()I
    .locals 1

    .line 196
    iget v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->m:I

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->d:Ljava/lang/String;

    .line 290
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c:Ljava/lang/String;

    .line 338
    return-void
.end method

.method public d()Z
    .locals 1

    .line 206
    iget-boolean v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->n:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 201
    iput p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->m:I

    .line 202
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h:Ljava/lang/String;

    .line 182
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 228
    if-nez p1, :cond_0

    .line 230
    const/4 v0, 0x0

    return v0

    .line 232
    :cond_0
    instance-of v0, p1, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    if-nez v0, :cond_1

    .line 234
    const/4 v0, 0x0

    return v0

    .line 236
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 237
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 239
    const/4 v0, 0x0

    return v0

    .line 241
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public f()I
    .locals 1

    .line 297
    iget v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g:Ljava/lang/String;

    .line 370
    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 313
    iget v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a:I

    return v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i:Ljava/lang/String;

    .line 418
    return-void
.end method

.method public l()J
    .locals 2

    .line 489
    iget-wide v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 409
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i:Ljava/lang/String;

    return-object v0
.end method
