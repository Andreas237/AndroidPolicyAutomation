.class Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;->c:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 154
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;->c:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->e(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;->c:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;->c:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 149
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 159
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 142
    return-void
.end method
