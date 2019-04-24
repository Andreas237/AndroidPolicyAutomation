.class Lo/erf$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erf$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/erf$2;


# direct methods
.method constructor <init>(Lo/erf$2;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/erf$2$1;->e:Lo/erf$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 99
    const-string v0, "PreviewRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail ACTIVITY_KEY i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 85
    const-string v0, "PreviewRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v0, v0, Lo/erf$2;->d:Lo/erf;

    iget-object v1, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v1, v1, Lo/erf$2;->d:Lo/erf;

    invoke-static {v1}, Lo/erf;->a(Lo/erf;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget v2, v2, Lo/erf$2;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fil;

    invoke-virtual {v0, p1, v1}, Lo/erf;->e(Ljava/lang/String;Lo/fil;)V

    .line 88
    iget-object v0, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v0, v0, Lo/erf$2;->d:Lo/erf;

    iget-object v1, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v1, v1, Lo/erf$2;->d:Lo/erf;

    invoke-static {v1}, Lo/erf;->a(Lo/erf;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget v2, v2, Lo/erf$2;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fil;

    invoke-static {v0, v1}, Lo/erf;->b(Lo/erf;Lo/fil;)V

    .line 91
    iget-object v0, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v0, v0, Lo/erf$2;->d:Lo/erf;

    invoke-static {v0}, Lo/erf;->c(Lo/erf;)Lo/erf$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget-object v0, v0, Lo/erf$2;->d:Lo/erf;

    invoke-static {v0}, Lo/erf;->c(Lo/erf;)Lo/erf$a;

    move-result-object v0

    iget-object v1, p0, Lo/erf$2$1;->e:Lo/erf$2;

    iget v1, v1, Lo/erf$2;->e:I

    invoke-interface {v0, v1}, Lo/erf$a;->d(I)V

    .line 95
    :cond_0
    return-void
.end method
