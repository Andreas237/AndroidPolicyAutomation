.class public Lo/fcg$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fcg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/ImageView;

.field final synthetic c:Lo/fcg;

.field d:Landroid/view/View;

.field e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lo/fcg;Landroid/view/View;)V
    .locals 1

    .line 175
    iput-object p1, p0, Lo/fcg$c;->c:Lo/fcg;

    .line 176
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_body_weight:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcg$c;->e:Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_measur_time:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcg$c;->a:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->iv_claim_weight_data_select_status:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcg$c;->b:Landroid/widget/ImageView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->view_claim_weight_data_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fcg$c;->d:Landroid/view/View;

    .line 181
    return-void
.end method
