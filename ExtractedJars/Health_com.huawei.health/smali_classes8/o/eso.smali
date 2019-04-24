.class public Lo/eso;
.super Lo/erc;
.source "SourceFile"


# instance fields
.field public a:Lo/est;

.field public b:Lo/est;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/RelativeLayout;

.field public e:Lo/est;

.field public f:Landroid/view/View;

.field public g:Landroid/widget/ImageView;

.field public k:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 2

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 27
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 28
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->pop_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eso;->f:Landroid/view/View;

    .line 29
    iget-object v0, p0, Lo/eso;->f:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/eso;->f:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_pop_text1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eso;->c:Landroid/widget/TextView;

    .line 33
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    .line 34
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eso;->k:Landroid/widget/ImageView;

    .line 35
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_background:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eso;->g:Landroid/widget/ImageView;

    .line 36
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_onboarding_view_text1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/est;

    iput-object v0, p0, Lo/eso;->b:Lo/est;

    .line 37
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_onboarding_view_text2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/est;

    iput-object v0, p0, Lo/eso;->a:Lo/est;

    .line 38
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_onboarding_view_text3:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/est;

    iput-object v0, p0, Lo/eso;->e:Lo/est;

    .line 39
    return-void
.end method
