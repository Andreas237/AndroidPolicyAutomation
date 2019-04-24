.class Lo/cbs$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ces;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbs;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cbs;


# direct methods
.method constructor <init>(Lo/cbs;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/cbs$1;->c:Lo/cbs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(IJJ)V
    .locals 5

    .line 85
    new-instance v4, Lo/cfd;

    invoke-direct {v4, p2, p3, p1}, Lo/cfd;-><init>(JI)V

    .line 86
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Current Steps: "

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

    .line 87
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

    .line 86
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lo/cbs$1;->c:Lo/cbs;

    invoke-static {v0, v4}, Lo/cbs;->e(Lo/cbs;Lo/cfd;)Lo/cfd;

    .line 90
    return-void
.end method
