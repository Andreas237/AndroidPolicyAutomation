.class public Lo/enr$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/ImageView;

.field c:Landroid/widget/LinearLayout;

.field d:Landroid/widget/CheckBox;

.field e:Landroid/view/View;

.field g:Landroid/view/View;

.field i:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 184
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 185
    sget v0, Lcom/huawei/ui/device/R$id;->equipment_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/enr$c;->b:Landroid/widget/ImageView;

    .line 186
    sget v0, Lcom/huawei/ui/device/R$id;->equipment_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/enr$c;->a:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/ui/device/R$id;->equipment_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/enr$c;->c:Landroid/widget/LinearLayout;

    .line 188
    sget v0, Lcom/huawei/ui/device/R$id;->equipment_cb:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/enr$c;->d:Landroid/widget/CheckBox;

    .line 189
    sget v0, Lcom/huawei/ui/device/R$id;->left_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/enr$c;->e:Landroid/view/View;

    .line 190
    sget v0, Lcom/huawei/ui/device/R$id;->right_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/enr$c;->i:Landroid/view/View;

    .line 191
    sget v0, Lcom/huawei/ui/device/R$id;->right_layout_24:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/enr$c;->g:Landroid/view/View;

    .line 192
    return-void
.end method
