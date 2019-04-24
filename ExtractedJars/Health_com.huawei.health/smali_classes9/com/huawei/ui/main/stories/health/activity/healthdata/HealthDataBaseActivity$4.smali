.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity$4;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity$4;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->finish()V

    .line 83
    return-void
.end method
