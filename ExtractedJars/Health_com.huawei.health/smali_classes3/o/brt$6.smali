.class Lo/brt$6;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->b(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/brt;

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/brt;Lo/bui;)V
    .locals 0

    .line 745
    iput-object p1, p0, Lo/brt$6;->c:Lo/brt;

    iput-object p2, p0, Lo/brt$6;->d:Lo/bui;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 748
    iget-object v0, p0, Lo/brt$6;->d:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 749
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 2

    .line 753
    invoke-static {p1}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 754
    iget-object v0, p0, Lo/brt$6;->d:Lo/bui;

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 755
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 745
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {p0, v0}, Lo/brt$6;->b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    return-void
.end method
