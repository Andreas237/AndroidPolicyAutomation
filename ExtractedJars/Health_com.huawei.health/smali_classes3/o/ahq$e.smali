.class public Lo/ahq$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/ImageView;

.field c:Landroid/view/View;

.field d:Landroid/widget/ImageView;

.field e:Landroid/widget/TextView;

.field final synthetic g:Lo/ahq;


# direct methods
.method public constructor <init>(Lo/ahq;Landroid/view/View;)V
    .locals 1

    .line 179
    iput-object p1, p0, Lo/ahq$e;->g:Lo/ahq;

    .line 181
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 182
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_user_clear_username:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ahq$e;->a:Landroid/widget/TextView;

    .line 183
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_user_clear_user_weight:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ahq$e;->e:Landroid/widget/TextView;

    .line 184
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_user_clear_data_select_status:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ahq$e;->b:Landroid/widget/ImageView;

    .line 185
    sget v0, Lcom/huawei/plugindevice/R$id;->view_clear_user_data_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ahq$e;->c:Landroid/view/View;

    .line 186
    sget v0, Lcom/huawei/plugindevice/R$id;->item_user_clear_user_photo:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ahq$e;->d:Landroid/widget/ImageView;

    .line 188
    return-void
.end method
