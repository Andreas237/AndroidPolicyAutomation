.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/fiu;->a(Landroid/content/Context;)V

    .line 170
    return-void
.end method
