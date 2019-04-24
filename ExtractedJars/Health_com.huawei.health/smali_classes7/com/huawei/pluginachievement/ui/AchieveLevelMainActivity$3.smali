.class Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_level_popwind:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    new-instance v1, Lo/elp;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Lo/elp;)Lo/elp;

    .line 161
    sget v0, Lcom/huawei/pluginachievement/R$id;->line_setting:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 162
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/elp;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, p1, v1}, Lo/elp;->c(Landroid/view/View;I)V

    .line 177
    return-void
.end method
