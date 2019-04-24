.class Lo/exq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exq;->e(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exq;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/exq;Lo/egg;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lo/exq$2;->a:Lo/exq;

    iput-object p2, p0, Lo/exq$2;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 411
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestStepSportGoal ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    iget-object v0, p0, Lo/exq$2;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 413
    iget-object v0, p0, Lo/exq$2;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 415
    :cond_0
    return-void
.end method
