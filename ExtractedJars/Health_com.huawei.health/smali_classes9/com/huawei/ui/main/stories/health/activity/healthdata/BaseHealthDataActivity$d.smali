.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    .line 475
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 476
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 4

    .line 480
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 481
    :cond_0
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const/4 v0, 0x0

    return-object v0

    .line 484
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method
