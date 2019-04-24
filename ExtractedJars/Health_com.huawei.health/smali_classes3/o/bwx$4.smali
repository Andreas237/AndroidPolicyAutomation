.class Lo/bwx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwx;->d(Lcom/huawei/health/suggestion/model/Plan;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bwx;


# direct methods
.method constructor <init>(Lo/bwx;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/bwx$4;->c:Lo/bwx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 132
    iget-object v0, p0, Lo/bwx$4;->c:Lo/bwx;

    invoke-static {v0}, Lo/bwx;->d(Lo/bwx;)V

    .line 133
    iget-object v0, p0, Lo/bwx$4;->c:Lo/bwx;

    invoke-static {v0}, Lo/bwx;->b(Lo/bwx;)V

    .line 134
    iget-object v0, p0, Lo/bwx$4;->c:Lo/bwx;

    invoke-virtual {v0}, Lo/bwx;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/bwx$4;->c:Lo/bwx;

    invoke-virtual {v0}, Lo/bwx;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lo/bwx$4$2;

    invoke-direct {v1, p0}, Lo/bwx$4$2;-><init>(Lo/bwx$4;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 142
    :cond_0
    const-string v0, "Suggestion_ShowPlanProgressFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :goto_0
    return-void
.end method
