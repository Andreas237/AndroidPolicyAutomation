.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$PageTransformer;


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

    .line 137
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$5;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transformPage(Landroid/view/View;F)V
    .locals 5

    .line 142
    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 143
    const/high16 p2, -0x40800000    # -1.0f

    goto :goto_0

    .line 144
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    .line 145
    const/high16 p2, 0x3f800000    # 1.0f

    .line 148
    :cond_1
    :goto_0
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    add-float v2, v0, p2

    goto :goto_1

    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v2, v0, p2

    .line 150
    :goto_1
    const/high16 v3, 0x3e800000    # 0.25f

    .line 152
    mul-float v0, v2, v3

    const/high16 v1, 0x3f800000    # 1.0f

    add-float v4, v1, v0

    .line 153
    invoke-virtual {p1, v4}, Landroid/view/View;->setScaleX(F)V

    .line 154
    invoke-virtual {p1, v4}, Landroid/view/View;->setScaleY(F)V

    .line 155
    return-void
.end method
