.class public Lo/fik$d;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fik;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Landroid/widget/ImageView;

.field c:Landroid/widget/ImageView;

.field d:Lhuawei/widget/HwProgressBar;

.field e:Landroid/widget/ImageView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/LinearLayout;

.field i:Landroid/widget/TextView;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/LinearLayout;

.field m:Landroid/widget/RelativeLayout;

.field n:Landroid/widget/LinearLayout;

.field o:Landroid/widget/TextView;

.field p:Landroid/widget/RelativeLayout;

.field q:Landroid/widget/TextView;

.field r:Landroid/view/View;

.field s:Landroid/widget/TextView;

.field t:Landroid/widget/LinearLayout;

.field u:Landroid/view/View;

.field w:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 338
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 339
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fik$d;->b:Landroid/widget/ImageView;

    .line 340
    sget v0, Lcom/huawei/ui/main/R$id;->achieve_user_device_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fik$d;->a:Landroid/widget/ImageView;

    .line 341
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->k:Landroid/widget/TextView;

    .line 342
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_connect_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->f:Landroid/widget/TextView;

    .line 343
    sget v0, Lcom/huawei/ui/main/R$id;->tripartite_equipment_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->g:Landroid/widget/TextView;

    .line 344
    sget v0, Lcom/huawei/ui/main/R$id;->tripartite_equipment_Describe:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->i:Landroid/widget/TextView;

    .line 345
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_connect_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fik$d;->e:Landroid/widget/ImageView;

    .line 346
    sget v0, Lcom/huawei/ui/main/R$id;->reconnect_loading_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fik$d;->h:Landroid/widget/LinearLayout;

    .line 347
    sget v0, Lcom/huawei/ui/main/R$id;->reconnect_loading_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->o:Landroid/widget/TextView;

    .line 348
    sget v0, Lcom/huawei/ui/main/R$id;->reconnect_loading_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lo/fik$d;->d:Lhuawei/widget/HwProgressBar;

    .line 349
    iget-object v0, p0, Lo/fik$d;->d:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 350
    sget v0, Lcom/huawei/ui/main/R$id;->retry_connect:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->q:Landroid/widget/TextView;

    .line 351
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_power:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fik$d;->n:Landroid/widget/LinearLayout;

    .line 352
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_power_size:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fik$d;->s:Landroid/widget/TextView;

    .line 353
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_power_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fik$d;->c:Landroid/widget/ImageView;

    .line 354
    sget v0, Lcom/huawei/ui/main/R$id;->personal_equipment_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/fik$d;->p:Landroid/widget/RelativeLayout;

    .line 355
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/fik$d;->m:Landroid/widget/RelativeLayout;

    .line 356
    sget v0, Lcom/huawei/ui/main/R$id;->equipment_connect:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fik$d;->l:Landroid/widget/LinearLayout;

    .line 357
    sget v0, Lcom/huawei/ui/main/R$id;->personal_layout_right_8dp:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fik$d;->u:Landroid/view/View;

    .line 358
    sget v0, Lcom/huawei/ui/main/R$id;->personal_layout_right_16dp:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fik$d;->r:Landroid/view/View;

    .line 359
    sget v0, Lcom/huawei/ui/main/R$id;->personal_layout_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fik$d;->w:Landroid/view/View;

    .line 360
    sget v0, Lcom/huawei/ui/main/R$id;->tripartite_equipment_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fik$d;->t:Landroid/widget/LinearLayout;

    .line 362
    return-void
.end method
