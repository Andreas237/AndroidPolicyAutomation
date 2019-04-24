.class Lo/cbx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ces;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbx;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cbx;


# direct methods
.method constructor <init>(Lo/cbx;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(IJJ)V
    .locals 5

    .line 88
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->e(Lo/cbx;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 89
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The mStepRateList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lo/cbx;->c(Lo/cbx;Ljava/util/List;)Ljava/util/List;

    .line 92
    :cond_0
    new-instance v4, Lo/cfd;

    invoke-direct {v4, p2, p3, p1}, Lo/cfd;-><init>(JI)V

    .line 93
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Steps: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cfd;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " time : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 94
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "-"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 93
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->d(Lo/cbx;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stop auto track, do not need steps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 99
    :cond_1
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->a(Lo/cbx;)Lo/ccl;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 100
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->a(Lo/cbx;)Lo/ccl;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/ccl;->c(Lo/cfd;)V

    .line 102
    :cond_2
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->e(Lo/cbx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    iget-object v0, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v0}, Lo/cbx;->c(Lo/cbx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepRatelist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbx$2;->b:Lo/cbx;

    invoke-static {v2}, Lo/cbx;->e(Lo/cbx;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void
.end method
