.class Lo/bxk$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxk;->d(Z[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bxk;


# direct methods
.method constructor <init>(Lo/bxk;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/bxk$1;->d:Lo/bxk;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 179
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartMoudle init onFailure "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lo/bxk$1;->d:Lo/bxk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bxk;->c(Lo/bxk;Z)Z

    .line 181
    iget-object v0, p0, Lo/bxk$1;->d:Lo/bxk;

    invoke-static {v0}, Lo/bxk;->d(Lo/bxk;)V

    .line 182
    return-void
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 4

    .line 186
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartMoudle init onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    iget-object v0, p0, Lo/bxk$1;->d:Lo/bxk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bxk;->c(Lo/bxk;Z)Z

    .line 188
    iget-object v0, p0, Lo/bxk$1;->d:Lo/bxk;

    invoke-static {v0}, Lo/bxk;->d(Lo/bxk;)V

    .line 189
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 176
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lo/bxk$1;->c(Ljava/lang/Boolean;)V

    return-void
.end method
