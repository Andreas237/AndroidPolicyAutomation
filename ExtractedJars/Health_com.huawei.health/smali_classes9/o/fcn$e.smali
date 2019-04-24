.class public Lo/fcn$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fcn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/ImageView;

.field f:Landroid/widget/LinearLayout;

.field g:Landroid/widget/TextView;

.field i:Landroid/view/View;

.field k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 183
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->weight_data_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcn$e;->f:Landroid/widget/LinearLayout;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_date:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcn$e;->a:Landroid/widget/TextView;

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->weight_measure_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcn$e;->e:Landroid/widget/ImageView;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_date:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcn$e;->d:Landroid/widget/TextView;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_highpress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcn$e;->c:Landroid/widget/TextView;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_lowpress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcn$e;->b:Landroid/widget/TextView;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_highpress_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcn$e;->g:Landroid/widget/TextView;

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcn$e;->k:Landroid/widget/ImageView;

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->weight_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fcn$e;->i:Landroid/view/View;

    .line 193
    return-void
.end method
