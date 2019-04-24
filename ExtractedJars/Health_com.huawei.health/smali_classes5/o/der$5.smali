.class Lo/der$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->c(Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/der;

.field final synthetic e:Lo/dgg;


# direct methods
.method constructor <init>(Lo/der;Lo/dgg;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lo/der$5;->b:Lo/der;

    iput-object p2, p0, Lo/der$5;->e:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 226
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_2

    .line 227
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 228
    const-string v0, "&&"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    const-string v0, "&&"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 230
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE split = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    array-length v0, v5

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 232
    const/4 v0, 0x0

    aget-object v6, v5, v0

    .line 233
    const/4 v0, 0x1

    aget-object v7, v5, v0

    .line 234
    const/4 v0, 0x2

    aget-object v8, v5, v0

    .line 235
    const/4 v0, 0x3

    aget-object v9, v5, v0

    .line 236
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkDevidIsPermanent devId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " expiresIn "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " proId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " enable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lo/der$5;->b:Lo/der;

    iget-object v1, p0, Lo/der$5;->e:Lo/dgg;

    invoke-static {v0, v6, v1}, Lo/der;->b(Lo/der;Ljava/lang/String;Lo/dgg;)V

    .line 238
    goto :goto_0

    .line 239
    :cond_0
    iget-object v0, p0, Lo/der$5;->e:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 241
    :goto_0
    goto :goto_1

    .line 242
    :cond_1
    iget-object v0, p0, Lo/der$5;->e:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 244
    :goto_1
    goto :goto_2

    .line 245
    :cond_2
    iget-object v0, p0, Lo/der$5;->e:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 248
    :goto_2
    return-void
.end method
