.class Lo/bel$d;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field c:Lo/bnp;

.field d:Landroid/widget/RelativeLayout;

.field e:Lo/bmx;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 326
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bel$1;)V
    .locals 0

    .line 326
    invoke-direct {p0}, Lo/bel$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 3

    .line 353
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bel$d;

    .line 355
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_thumbnail_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    .line 357
    sget v0, Lcom/huawei/android/sns/R$id;->chat_thumbnail_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmx;

    iput-object v0, v2, Lo/bel$d;->e:Lo/bmx;

    .line 358
    iget-object v0, v2, Lo/bel$d;->e:Lo/bmx;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmx;->setImageWithDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 359
    sget v0, Lcom/huawei/android/sns/R$id;->roundProgressBar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnp;

    iput-object v0, v2, Lo/bel$d;->c:Lo/bnp;

    .line 360
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lo/bel$d;->m:Landroid/widget/ImageView;

    .line 361
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lo/bel$d;->o:Landroid/widget/TextView;

    .line 362
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v2, Lo/bel$d;->n:Landroid/widget/CheckBox;

    .line 363
    sget v0, Lcom/huawei/android/sns/R$id;->image_load_failed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lo/bel$d;->a:Landroid/view/View;

    .line 364
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v2, Lo/bel$d;->t:Landroid/view/ViewStub;

    .line 365
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v2, Lo/bel$d;->u:Landroid/widget/LinearLayout;

    .line 366
    return-void
.end method

.method public d(Landroid/view/View;)V
    .locals 3

    .line 375
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bel$d;

    .line 377
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_thumbnail_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    .line 379
    sget v0, Lcom/huawei/android/sns/R$id;->chat_thumbnail_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmx;

    iput-object v0, v2, Lo/bel$d;->e:Lo/bmx;

    .line 380
    iget-object v0, v2, Lo/bel$d;->e:Lo/bmx;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmx;->setImageWithDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 382
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_repeat_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lo/bel$d;->p:Landroid/widget/ImageView;

    .line 383
    sget v0, Lcom/huawei/android/sns/R$id;->roundProgressBar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnp;

    iput-object v0, v2, Lo/bel$d;->c:Lo/bnp;

    .line 385
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lo/bel$d;->m:Landroid/widget/ImageView;

    .line 386
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v2, Lo/bel$d;->n:Landroid/widget/CheckBox;

    .line 387
    sget v0, Lcom/huawei/android/sns/R$id;->image_load_failed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lo/bel$d;->a:Landroid/view/View;

    .line 388
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v2, Lo/bel$d;->t:Landroid/view/ViewStub;

    .line 389
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v2, Lo/bel$d;->u:Landroid/widget/LinearLayout;

    .line 390
    return-void
.end method
