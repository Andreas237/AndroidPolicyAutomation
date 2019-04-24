.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 1136
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

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

    .line 1139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->X(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1140
    if-eqz p2, :cond_3

    .line 1141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/fdn;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;I)Ljava/lang/String;

    move-result-object v3

    .line 1142
    const-string v0, "--"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 1149
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 1151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 1158
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1164
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1167
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1171
    :goto_0
    goto :goto_1

    .line 1172
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1178
    :goto_1
    return-void
.end method
