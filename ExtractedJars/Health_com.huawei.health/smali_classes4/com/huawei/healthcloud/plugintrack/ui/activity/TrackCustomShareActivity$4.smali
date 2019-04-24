.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->finish()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d()V

    .line 275
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 277
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 283
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 270
    return-void
.end method
