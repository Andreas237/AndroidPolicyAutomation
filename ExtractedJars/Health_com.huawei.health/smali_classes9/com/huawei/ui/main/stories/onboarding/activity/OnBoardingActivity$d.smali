.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;
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
    name = "d"
.end annotation


# instance fields
.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 1

    .line 633
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 634
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 635
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 640
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 641
    return-void

    .line 643
    :cond_0
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->r(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 644
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->q(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    goto :goto_0

    .line 645
    :cond_1
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 646
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->w(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    goto :goto_0

    .line 647
    :cond_2
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->x(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 648
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->v(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    goto :goto_0

    .line 649
    :cond_3
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->y(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 650
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->B(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    goto :goto_0

    .line 651
    :cond_4
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->A(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_5

    .line 652
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)V

    goto :goto_0

    .line 653
    :cond_5
    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->C(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_6

    .line 654
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)V

    .line 656
    :cond_6
    :goto_0
    return-void
.end method
