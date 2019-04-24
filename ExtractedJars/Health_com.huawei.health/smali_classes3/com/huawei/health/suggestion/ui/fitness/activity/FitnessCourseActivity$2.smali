.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bur$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 88
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadMore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    .line 90
    return-void
.end method
