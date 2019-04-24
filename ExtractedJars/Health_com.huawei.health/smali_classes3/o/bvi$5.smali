.class Lo/bvi$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvi;->c(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/bvi;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/bvi;Ljava/lang/String;I)V
    .locals 0

    .line 124
    iput-object p1, p0, Lo/bvi$5;->b:Lo/bvi;

    iput-object p2, p0, Lo/bvi$5;->a:Ljava/lang/String;

    iput p3, p0, Lo/bvi$5;->e:I

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 127
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postSearch onFailure query= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvi$5;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", errorCode="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", errorInfo="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lo/bvi$5;->b:Lo/bvi;

    iget-object v1, p0, Lo/bvi$5;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/bvi;->d(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 133
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postSearch onSuccess query= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvi$5;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", pageStart="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/bvi$5;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", data="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/bvi$5;->b:Lo/bvi;

    iget-object v1, p0, Lo/bvi$5;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lo/bvi;->d(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V

    .line 135
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 124
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bvi$5;->c(Ljava/util/List;)V

    return-void
.end method
