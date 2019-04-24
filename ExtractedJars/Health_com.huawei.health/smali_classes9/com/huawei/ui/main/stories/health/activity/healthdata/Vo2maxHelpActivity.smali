.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Lo/emr;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:I

.field private o:[Ljava/lang/Integer;

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 6

    .line 96
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x6

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 97
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x5

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v5, 0x6

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 98
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->k:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 99
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 100
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 101
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->h:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 102
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->i:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d(Landroid/content/Context;Landroid/widget/TextView;III)V

    .line 103
    return-void
.end method

.method private b()V
    .locals 8

    .line 60
    const-string v5, ""

    .line 62
    const-string v6, "-"

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    const-string v6, "\u2013"

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 76
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 79
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 81
    :goto_0
    const-string v7, ""

    .line 82
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->p:I

    if-nez v0, :cond_5

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_male_age:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 85
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_female_age:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 87
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 88
    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    .line 90
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    return-void
.end method

.method private d()V
    .locals 1

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_help_gender:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->e:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_excellent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->b:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_verygood:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->c:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_good:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->k:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_average:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->g:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_fair:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->f:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_poor:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->h:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_verypoor:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->i:Landroid/widget/TextView;

    .line 114
    return-void
.end method

.method private d(Landroid/content/Context;Landroid/widget/TextView;III)V
    .locals 5

    .line 127
    packed-switch p5, :pswitch_data_0

    goto/16 :goto_0

    .line 129
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p4

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    goto/16 :goto_1

    .line 132
    :pswitch_1
    invoke-static {p1}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 135
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    goto :goto_1

    .line 139
    :pswitch_2
    invoke-static {p1}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p4

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 142
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, p4

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    goto :goto_1

    .line 146
    :goto_0
    const-string v0, "Vo2maxHelpActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setZone wrong type!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e()V
    .locals 3

    .line 122
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d:Lo/emr;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_help:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 124
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 42
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 44
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 45
    const-string v0, "Vo2maxHelpActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 48
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a:Landroid/content/Context;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_vo2max_help:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->setContentView(I)V

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->e()V

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->d()V

    .line 52
    const-string v0, "vo2max_gender"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->p:I

    .line 53
    const-string v0, "vo2max_age"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->l:I

    .line 54
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->p:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->l:I

    invoke-static {v0, v1}, Lo/feg;->d(II)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->o:[Ljava/lang/Integer;

    .line 55
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->b()V

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;->a()V

    .line 57
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 118
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 119
    return-void
.end method
