.class Lo/ewd$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ewh$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewd;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic d:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;Ljava/util/List;)V
    .locals 0

    .line 1024
    iput-object p1, p0, Lo/ewd$6;->d:Lo/ewd;

    iput-object p2, p0, Lo/ewd$6;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 4

    .line 1027
    iget-object v0, p0, Lo/ewd$6;->d:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->k(Lo/ewd;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1028
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCompletedGameOver == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$6;->d:Lo/ewd;

    invoke-static {v3}, Lo/ewd;->k(Lo/ewd;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    iget-object v0, p0, Lo/ewd$6;->d:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->f(Lo/ewd;)V

    goto :goto_0

    .line 1031
    :cond_0
    iget-object v0, p0, Lo/ewd$6;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 1032
    iget-object v0, p0, Lo/ewd$6;->d:Lo/ewd;

    const v1, -0x18a92

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;I)V

    .line 1033
    iget-object v0, p0, Lo/ewd$6;->d:Lo/ewd;

    const v1, -0x18a93

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;I)V

    goto :goto_0

    .line 1035
    :cond_1
    iget-object v0, p0, Lo/ewd$6;->d:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->f(Lo/ewd;)V

    .line 1038
    :goto_0
    return-void
.end method
