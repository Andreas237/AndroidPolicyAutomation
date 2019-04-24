.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 1

    .line 569
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 570
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 571
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 576
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 577
    return-void

    .line 579
    :cond_0
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 580
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;

    move-result-object v0

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_run_on:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 581
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_run_off:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 580
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fhe;->b(Landroid/widget/ImageView;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 582
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    goto/16 :goto_0

    .line 583
    :cond_1
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 584
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;

    move-result-object v0

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_ride_on:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 585
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_ride_off:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 584
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fhe;->b(Landroid/widget/ImageView;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 586
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    goto :goto_0

    .line 587
    :cond_2
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 588
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;

    move-result-object v0

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_walk_on:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 589
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_walk_off:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 588
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fhe;->b(Landroid/widget/ImageView;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 590
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    goto :goto_0

    .line 591
    :cond_3
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 592
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;

    move-result-object v0

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_build_on:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 593
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_build_off:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 592
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fhe;->b(Landroid/widget/ImageView;ZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 594
    invoke-static {v6}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    .line 596
    :cond_4
    :goto_0
    return-void
.end method
