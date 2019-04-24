.class Lo/cbx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ces;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbx;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbx;


# direct methods
.method constructor <init>(Lo/cbx;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lo/cbx$1;->a:Lo/cbx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(IJJ)V
    .locals 5

    .line 225
    new-instance v4, Lo/cfd;

    invoke-direct {v4, p2, p3, p1}, Lo/cfd;-><init>(JI)V

    .line 226
    const-string v0, "Track_StepRateUtils"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentStep() Steps: "

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

    .line 227
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

    .line 226
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lo/cbx$1;->a:Lo/cbx;

    invoke-static {v0, v4}, Lo/cbx;->e(Lo/cbx;Lo/cfd;)Lo/cfd;

    .line 229
    return-void
.end method
