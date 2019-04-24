.class public Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private c:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 1

    .line 27
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_rule_navigation_left_button:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;->c:Landroid/widget/ImageView;

    .line 28
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 33
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_rule_navigation_left_button:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 34
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;->finish()V

    .line 36
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 21
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_level_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;->setContentView(I)V

    .line 23
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelRuleActivity;->c()V

    .line 24
    return-void
.end method
