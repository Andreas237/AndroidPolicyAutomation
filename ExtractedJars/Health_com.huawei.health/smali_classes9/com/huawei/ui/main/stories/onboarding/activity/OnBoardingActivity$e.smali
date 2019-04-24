.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V
    .locals 1

    .line 795
    iput-object p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 796
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 797
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 798
    iput-boolean p3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->d:Z

    .line 799
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 804
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyPositiveOnDismissListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 806
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 807
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyPositiveOnDismissListener OnBoardingActivity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    return-void

    .line 810
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->D(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    .line 815
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->d:Z

    if-eqz v0, :cond_2

    .line 816
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->E(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 818
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_gender_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 819
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 820
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->H(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 821
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v8, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V

    .line 822
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 823
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    goto :goto_0

    .line 827
    :cond_2
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->E(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->J(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_gender_girl_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 829
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 830
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->H(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 831
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v8, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V

    .line 832
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 833
    invoke-static {v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 836
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 837
    invoke-static {v4}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->K(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v4

    int-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 836
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    .line 839
    invoke-static {v4}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->M(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)F

    move-result v4

    float-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 838
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 840
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    .line 841
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->O(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 842
    return-void
.end method
