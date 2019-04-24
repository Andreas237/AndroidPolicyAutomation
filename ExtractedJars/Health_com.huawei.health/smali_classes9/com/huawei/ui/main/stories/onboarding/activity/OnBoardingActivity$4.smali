.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fgi;

.field final synthetic b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lo/fgi;)V
    .locals 0

    .line 889
    iput-object p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 893
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v2}, Lo/fgi;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v3}, Lo/fgi;->getSelectedDay()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(III)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 894
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_no_choose_birthday_after_now:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 895
    return-void

    .line 897
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z

    .line 898
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->P(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 899
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    .line 901
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->a:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I

    .line 904
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 905
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v2

    invoke-virtual {v5, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 906
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 907
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->T(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 909
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 910
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V

    .line 912
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->V(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;->b:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_birthday_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 913
    return-void
.end method
