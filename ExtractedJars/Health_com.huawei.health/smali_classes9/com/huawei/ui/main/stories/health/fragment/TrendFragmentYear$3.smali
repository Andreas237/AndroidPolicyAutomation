.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V
    .locals 0

    .line 1063
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    .line 1066
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->X(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1067
    if-eqz p2, :cond_3

    .line 1068
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/fdn;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;I)Ljava/lang/String;

    move-result-object v3

    .line 1069
    const-string v0, "--"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1070
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1071
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1072
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1073
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1074
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1076
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1079
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1080
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1085
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1086
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1087
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1088
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1090
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1094
    :goto_0
    goto :goto_1

    .line 1095
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1096
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1097
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1098
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1100
    :goto_1
    return-void
.end method
