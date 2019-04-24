.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 3

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lo/fcs;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lo/acu;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fej;->d(Landroid/content/Context;Lo/acn;Lo/acu;)V

    .line 204
    const/4 v0, 0x0

    return v0
.end method
