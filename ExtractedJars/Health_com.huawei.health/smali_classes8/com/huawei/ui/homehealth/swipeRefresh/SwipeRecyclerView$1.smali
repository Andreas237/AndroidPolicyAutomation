.class Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(FFI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;FF)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    iput p2, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->b:F

    iput p3, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->a:F

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 232
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAnimationEnd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;I)I

    .line 235
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->a:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_step_pull_synchordata:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->icon_refresh_down:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;->c:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;Z)Z

    .line 242
    :cond_0
    return-void
.end method
