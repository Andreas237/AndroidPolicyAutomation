.class Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/Map;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$1;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 194
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPlanStatistics errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    return-void
.end method

.method public b(Ljava/util/Map;)V
    .locals 4

    .line 199
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPlanStatistics Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 191
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$1;->b(Ljava/util/Map;)V

    return-void
.end method
