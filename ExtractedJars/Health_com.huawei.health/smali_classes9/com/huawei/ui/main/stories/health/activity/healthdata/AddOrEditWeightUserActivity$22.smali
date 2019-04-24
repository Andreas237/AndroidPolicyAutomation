.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 528
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$22;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 533
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$22;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    move-object v1, p2

    check-cast v1, Lo/fgi;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/fgi;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 536
    goto :goto_0

    .line 534
    :catch_0
    move-exception v4

    .line 535
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    :goto_0
    return-void
.end method
