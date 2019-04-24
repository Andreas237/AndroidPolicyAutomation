.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 161
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;->d(IFI)V

    .line 170
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 174
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a_(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 176
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnChangePageOfViewPageListener.onPageChange(position)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;->b(I)V

    goto :goto_0

    .line 179
    :cond_0
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mOnChangePageOfViewPageListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :goto_0
    return-void
.end method
