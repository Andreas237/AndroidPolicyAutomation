.class Lo/dxb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxb;->b(JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/duh;

.field final synthetic c:Lo/dxb;


# direct methods
.method constructor <init>(Lo/dxb;Lo/duh;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lo/dxb$1;->c:Lo/dxb;

    iput-object p2, p0, Lo/dxb$1;->b:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 4

    .line 109
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    move-object v3, p2

    :try_start_0
    check-cast v3, Ljava/util/List;

    .line 115
    iget-object v0, p0, Lo/dxb$1;->c:Lo/dxb;

    iget-object v1, p0, Lo/dxb$1;->b:Lo/duh;

    const/4 v2, 0x2

    invoke-static {v0, v2, v3, v1}, Lo/dxb;->d(Lo/dxb;ILjava/util/List;Lo/duh;)V

    .line 116
    iget-object v0, p0, Lo/dxb$1;->c:Lo/dxb;

    iget-object v1, p0, Lo/dxb$1;->b:Lo/duh;

    const/4 v2, 0x1

    invoke-static {v0, v2, v3, v1}, Lo/dxb;->d(Lo/dxb;ILjava/util/List;Lo/duh;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    goto :goto_0

    .line 117
    :catch_0
    move-exception v3

    .line 118
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    const-string v1, "requestSportData data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_0
    return-void
.end method
