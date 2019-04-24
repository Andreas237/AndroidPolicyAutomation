.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Lo/bvr;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

.field final synthetic e:Lcom/huawei/health/suggestion/model/WorkoutRecord;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->e:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;)I

    move-result v0

    if-nez v0, :cond_0

    .line 311
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->e:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    goto :goto_0

    .line 313
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;->e:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 315
    :goto_0
    return-void
.end method
