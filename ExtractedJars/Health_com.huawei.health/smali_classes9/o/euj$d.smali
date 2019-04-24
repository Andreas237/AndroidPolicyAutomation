.class public Lo/euj$d;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/euj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/ImageView;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field private h:Landroid/widget/LinearLayout;

.field i:Landroid/widget/TextView;

.field final synthetic k:Lo/euj;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/TextView;

.field private u:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Lo/euj;Landroid/view/View;II)V
    .locals 3

    .line 331
    iput-object p1, p0, Lo/euj$d;->k:Lo/euj;

    .line 332
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 334
    const/4 v0, 0x1

    if-lt p3, v0, :cond_2

    const/4 v0, 0x7

    if-gt p3, v0, :cond_2

    .line 336
    const/4 v0, 0x3

    if-ne v0, p4, :cond_0

    const/4 v0, 0x6

    if-ne v0, p3, :cond_0

    .line 337
    sget v0, Lcom/huawei/ui/main/R$id;->activity:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/euj$d;->h:Landroid/widget/LinearLayout;

    .line 338
    sget v0, Lcom/huawei/ui/main/R$id;->activity_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    .line 339
    sget v0, Lcom/huawei/ui/main/R$id;->activity_info:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/euj$d;->u:Landroid/widget/RelativeLayout;

    .line 340
    sget v0, Lcom/huawei/ui/main/R$id;->activity_item_divide:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/euj$d;->a:Landroid/view/View;

    .line 341
    sget v0, Lcom/huawei/ui/main/R$id;->activity_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->c:Landroid/widget/TextView;

    .line 342
    sget v0, Lcom/huawei/ui/main/R$id;->activity_des:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->e:Landroid/widget/TextView;

    .line 343
    sget v0, Lcom/huawei/ui/main/R$id;->activity_join_num:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->b:Landroid/widget/TextView;

    .line 344
    sget v0, Lcom/huawei/ui/main/R$id;->activity_status:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->g:Landroid/widget/TextView;

    .line 345
    sget v0, Lcom/huawei/ui/main/R$id;->activity_start_date:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->i:Landroid/widget/TextView;

    .line 346
    sget v0, Lcom/huawei/ui/main/R$id;->activity_end_date:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->f:Landroid/widget/TextView;

    .line 347
    sget v0, Lcom/huawei/ui/main/R$id;->activity_des:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->l:Landroid/widget/TextView;

    goto/16 :goto_1

    .line 348
    :cond_0
    const/4 v0, 0x7

    if-ne v0, p3, :cond_1

    .line 350
    sget v0, Lcom/huawei/ui/main/R$id;->item_configure_image_text_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/euj$d;->h:Landroid/widget/LinearLayout;

    .line 351
    sget v0, Lcom/huawei/ui/main/R$id;->left_img_item_configure:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    .line 352
    sget v0, Lcom/huawei/ui/main/R$id;->right_item_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/euj$d;->o:Landroid/widget/RelativeLayout;

    .line 353
    sget v0, Lcom/huawei/ui/main/R$id;->right_item_describe:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->p:Landroid/widget/TextView;

    .line 354
    sget v0, Lcom/huawei/ui/main/R$id;->right_item_date:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->l:Landroid/widget/TextView;

    .line 355
    sget v0, Lcom/huawei/ui/main/R$id;->right_img_item_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/euj$d;->d:Landroid/widget/ImageView;

    goto/16 :goto_1

    .line 358
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->item_configure_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/euj$d;->h:Landroid/widget/LinearLayout;

    .line 359
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_configure:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    .line 360
    sget v0, Lcom/huawei/ui/main/R$id;->item_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/euj$d;->n:Landroid/widget/LinearLayout;

    .line 361
    sget v0, Lcom/huawei/ui/main/R$id;->item_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->p:Landroid/widget/TextView;

    .line 362
    sget v0, Lcom/huawei/ui/main/R$id;->item_describe:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euj$d;->l:Landroid/widget/TextView;

    .line 364
    iget-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 365
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 367
    :pswitch_0
    const/4 v0, 0x1

    const v1, 0x42da999a    # 109.3f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 368
    goto :goto_0

    .line 371
    :pswitch_1
    const/4 v0, 0x1

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 372
    goto :goto_0

    .line 375
    :pswitch_2
    const/4 v0, 0x1

    const/high16 v1, 0x42d00000    # 104.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 376
    .line 379
    :goto_0
    iget-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 382
    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lo/euj$d;)Landroid/widget/LinearLayout;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->n:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic b(Lo/euj$d;)Landroid/widget/ImageView;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->m:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/euj$d;)Landroid/widget/TextView;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/euj$d;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->o:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lo/euj$d;)Landroid/widget/LinearLayout;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->h:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic g(Lo/euj$d;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->u:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic h(Lo/euj$d;)Landroid/widget/TextView;
    .locals 1

    .line 308
    iget-object v0, p0, Lo/euj$d;->l:Landroid/widget/TextView;

    return-object v0
.end method
