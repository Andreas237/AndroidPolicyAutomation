.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 137
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 138
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 139
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportBodybuilding onResult , records.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " records = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v5, 0x0

    .line 141
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 142
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTimes()I

    move-result v0

    add-int/2addr v5, v0

    .line 141
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dnj;->e(Landroid/content/Context;I)V

    .line 146
    :cond_1
    return-void
.end method
