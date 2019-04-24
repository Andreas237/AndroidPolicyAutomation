.class Lo/bry$3$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/TrainStatistics;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/bry$3;


# direct methods
.method constructor <init>(Lo/bry$3;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lo/bry$3$1;->b:Lo/bry$3;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 369
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/TrainStatistics;)V
    .locals 4

    .line 374
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 366
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/TrainStatistics;

    invoke-virtual {p0, v0}, Lo/bry$3$1;->b(Lcom/huawei/health/suggestion/model/TrainStatistics;)V

    return-void
.end method
