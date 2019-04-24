.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 133
    const/4 v0, 0x1

    return v0
.end method
