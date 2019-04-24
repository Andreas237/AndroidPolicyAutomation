.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 187
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ExpandableListView;->getExpandableListPosition(I)J

    move-result-wide v4

    .line 189
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v6

    .line 190
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v7

    .line 191
    const/4 v0, -0x1

    if-eq v6, v0, :cond_0

    const/4 v0, -0x1

    if-eq v7, v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;ZI)V

    .line 194
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
