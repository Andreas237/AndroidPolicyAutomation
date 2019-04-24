.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

.field final synthetic c:Lo/fgi;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lo/fgi;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v2}, Lo/fgi;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v3}, Lo/fgi;->getSelectedDay()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_no_choose_birthday_after_now:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 611
    return-void

    .line 613
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 616
    return-void

    .line 618
    :cond_1
    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 620
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "childaccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    add-int/lit8 v1, v1, 0xd

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v2}, Lo/fgi;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v3}, Lo/fgi;->getSelectedDay()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z

    move-result v0

    if-nez v0, :cond_4

    .line 623
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_chosen_birthday_exceeds_kid_range:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0xd

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 625
    return-void

    .line 628
    :cond_2
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "childaccount else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    add-int/lit8 v1, v1, 0x12

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v2}, Lo/fgi;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v3}, Lo/fgi;->getSelectedDay()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_no_choose_birthday_after_eighteen:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 633
    return-void

    .line 638
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    add-int/lit8 v1, v1, 0xd

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v2}, Lo/fgi;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v3}, Lo/fgi;->getSelectedDay()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_no_choose_birthday_after_eighteen:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 641
    return-void

    .line 644
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I

    .line 647
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v2

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 649
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 650
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 652
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 653
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 657
    return-void
.end method
