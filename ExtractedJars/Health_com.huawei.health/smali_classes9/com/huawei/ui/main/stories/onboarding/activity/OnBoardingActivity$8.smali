.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

.field final synthetic e:Lo/elk;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;ILo/elk;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->b:I

    iput-object p3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1002
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1003
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get wselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v2}, Lo/elk;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 1006
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1007
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    iget v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->b:I

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V

    .line 1008
    goto :goto_0

    .line 1009
    :cond_0
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get hselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v2}, Lo/elk;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 1012
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1013
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->c:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x32

    iget v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;->b:I

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V

    .line 1015
    :goto_0
    return-void
.end method
