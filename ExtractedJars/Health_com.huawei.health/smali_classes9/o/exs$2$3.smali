.class Lo/exs$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exs$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/exs$2;


# direct methods
.method constructor <init>(Lo/exs$2;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lo/exs$2$3;->e:Lo/exs$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 161
    const-string v0, "SCUI_FitnessStepDetailInteractor"

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

    .line 162
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 149
    const-string v0, "SCUI_FitnessStepDetailInteractor"

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

    .line 150
    iget-object v0, p0, Lo/exs$2$3;->e:Lo/exs$2;

    iget-object v0, v0, Lo/exs$2;->a:Lo/exs;

    invoke-static {v0}, Lo/exs;->a(Lo/exs;)Lo/fil;

    move-result-object v0

    invoke-virtual {v0}, Lo/fil;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fic;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lo/exs$2$3;->e:Lo/exs$2;

    iget-object v0, v0, Lo/exs$2;->a:Lo/exs;

    iget-object v1, p0, Lo/exs$2$3;->e:Lo/exs$2;

    iget-object v1, v1, Lo/exs$2;->a:Lo/exs;

    invoke-static {v1}, Lo/exs;->a(Lo/exs;)Lo/fil;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo/exs;->a(Ljava/lang/String;Lo/fil;)V

    goto :goto_0

    .line 154
    :cond_0
    iget-object v0, p0, Lo/exs$2$3;->e:Lo/exs$2;

    iget-object v0, v0, Lo/exs$2;->a:Lo/exs;

    invoke-static {v0}, Lo/exs;->c(Lo/exs;)V

    .line 157
    :goto_0
    return-void
.end method
