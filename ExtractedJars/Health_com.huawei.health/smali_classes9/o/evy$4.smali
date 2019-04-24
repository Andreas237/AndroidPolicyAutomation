.class Lo/evy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evy;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evy;


# direct methods
.method constructor <init>(Lo/evy;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lo/evy$4;->a:Lo/evy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 9

    .line 180
    iget-object v0, p0, Lo/evy$4;->a:Lo/evy;

    invoke-static {v0}, Lo/evy;->b(Lo/evy;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->i()I

    move-result v4

    .line 181
    iget-object v0, p0, Lo/evy$4;->a:Lo/evy;

    invoke-static {v0}, Lo/evy;->b(Lo/evy;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->k()I

    move-result v5

    .line 182
    iget-object v0, p0, Lo/evy$4;->a:Lo/evy;

    invoke-static {v0}, Lo/evy;->b(Lo/evy;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->p()I

    move-result v6

    .line 183
    iget-object v0, p0, Lo/evy$4;->a:Lo/evy;

    invoke-static {v0}, Lo/evy;->b(Lo/evy;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->f()D

    move-result-wide v7

    .line 184
    if-lez v4, :cond_0

    if-lez v5, :cond_0

    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v7

    if-nez v0, :cond_0

    .line 185
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fallTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,wakeupTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 187
    :cond_0
    iget-object v0, p0, Lo/evy$4;->a:Lo/evy;

    iget-object v1, p0, Lo/evy$4;->a:Lo/evy;

    invoke-static {v1}, Lo/evy;->a(Lo/evy;)Ljava/util/Date;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lo/evy;->d(Lo/evy;Ljava/util/Date;I)V

    .line 189
    :goto_0
    return-void
.end method
