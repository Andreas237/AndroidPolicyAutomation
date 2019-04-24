.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 186
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Z

    move-result v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ne v0, v1, :cond_1

    .line 187
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 188
    return-void

    .line 191
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Z)Z

    .line 192
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->ll_setting:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->nfc_tip_title_text:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_home_group_network_disconnection:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    goto :goto_2

    .line 196
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->ll_setting:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->nfc_tip_title_text:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_heart_rate_measuring_status_data_fail:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 199
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_4

    .line 200
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 205
    :cond_4
    return-void
.end method
