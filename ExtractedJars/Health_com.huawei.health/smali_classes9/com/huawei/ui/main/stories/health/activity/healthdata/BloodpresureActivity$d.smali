.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 679
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V
    .locals 0

    .line 679
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 684
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/fcd;

    move-result-object v0

    invoke-virtual {v0}, Lo/fcd;->a()I

    move-result v0

    if-eqz v0, :cond_0

    .line 685
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V

    .line 688
    :cond_0
    return-void
.end method
