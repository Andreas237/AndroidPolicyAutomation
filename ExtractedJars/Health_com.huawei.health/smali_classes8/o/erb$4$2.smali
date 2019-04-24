.class Lo/erb$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erb$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/erb$4;


# direct methods
.method constructor <init>(Lo/erb$4;Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/erb$4$2;->e:Lo/erb$4;

    iput-object p2, p0, Lo/erb$4$2;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 91
    const-string v0, "OperationRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/erb$4$2;->e:Lo/erb$4;

    iget-object v0, v0, Lo/erb$4;->c:Lo/erb;

    iget-object v1, p0, Lo/erb$4$2;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/erb;->a(Lo/erb;Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 6

    .line 83
    const-string v0, "OperationRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/messageH5/html/launchFitness.html?url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 85
    iget-object v0, p0, Lo/erb$4$2;->e:Lo/erb$4;

    iget-object v0, v0, Lo/erb$4;->c:Lo/erb;

    iget-object v1, p0, Lo/erb$4$2;->d:Ljava/lang/String;

    invoke-static {v0, v1, v4}, Lo/erb;->d(Lo/erb;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 86
    iget-object v0, p0, Lo/erb$4$2;->e:Lo/erb$4;

    iget-object v0, v0, Lo/erb$4;->c:Lo/erb;

    iget-object v1, p0, Lo/erb$4$2;->d:Ljava/lang/String;

    invoke-static {v0, v5, v1}, Lo/erb;->b(Lo/erb;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    return-void
.end method
