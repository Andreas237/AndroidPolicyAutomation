.class Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;->d:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;->d:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e()V

    .line 203
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;->d:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;->d:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 205
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 208
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 197
    return-void
.end method
