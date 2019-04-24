.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->finish()V

    .line 180
    :goto_0
    return-void
.end method
