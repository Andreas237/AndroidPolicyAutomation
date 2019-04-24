.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 1113
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 1116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1117
    if-eqz p2, :cond_3

    .line 1118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/fdn;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;I)Ljava/lang/String;

    move-result-object v3

    .line 1119
    const-string v0, "--"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1126
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 1132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1135
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1137
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1140
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1144
    :goto_0
    goto :goto_1

    .line 1145
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1151
    :goto_1
    return-void
.end method
