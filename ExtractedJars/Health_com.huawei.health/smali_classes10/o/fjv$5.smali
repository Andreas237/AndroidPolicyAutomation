.class Lo/fjv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjv;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fjv;


# direct methods
.method constructor <init>(Lo/fjv;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/fjv$5;->c:Lo/fjv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 82
    iget-object v0, p0, Lo/fjv$5;->c:Lo/fjv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fjv;->d(Lo/fjv;Z)Z

    .line 83
    iget-object v0, p0, Lo/fjv$5;->c:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->b(Lo/fjv;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 84
    if-nez p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 85
    iget-object v0, p0, Lo/fjv$5;->c:Lo/fjv;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lo/fjv;->d(Lo/fjv;Ljava/util/List;)Ljava/util/List;

    .line 86
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestMyfitnessPalDatas fitPalFitness = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjv$5;->c:Lo/fjv;

    invoke-static {v3}, Lo/fjv;->a(Lo/fjv;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/fjv$5;->c:Lo/fjv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fjv;->d(Lo/fjv;Ljava/util/List;)Ljava/util/List;

    .line 90
    :goto_0
    iget-object v0, p0, Lo/fjv$5;->c:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->b(Lo/fjv;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 92
    :cond_1
    return-void
.end method
