.class public Lcom/huawei/feedback/ui/an;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/an$a;,
        Lcom/huawei/feedback/ui/an$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/logic/c;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/feedback/logic/c;>;Landroid/content/Context;Landroid/os/Handler;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    .line 35
    iput-object p2, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    .line 36
    iput-object p3, p0, Lcom/huawei/feedback/ui/an;->c:Landroid/os/Handler;

    .line 37
    return-void
.end method

.method private a()I
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const/high16 v1, 0x42800000    # 64.0f

    invoke-static {v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/an;)Ljava/util/List;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->c:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 140
    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/an;)Landroid/os/Handler;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->c:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 54
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct {p0}, Lcom/huawei/feedback/ui/an;->a()I

    move-result v5

    .line 63
    if-nez p2, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const-string v2, "feedback_edit_upload_item"

    .line 66
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 67
    new-instance v4, Lcom/huawei/feedback/ui/an$b;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/huawei/feedback/ui/an$b;-><init>(Lcom/huawei/feedback/ui/ao;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_image"

    .line 69
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/feedback/ui/an$b;->b:Landroid/widget/ImageView;

    .line 70
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_delete_image"

    .line 71
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, v4, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    .line 73
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 74
    iput v5, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 75
    iput v5, v6, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 76
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 79
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/ui/an$b;

    .line 84
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/feedback/logic/c;

    .line 85
    if-nez v6, :cond_1

    .line 87
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const-string v3, "feedback_edit_add_image_selector"

    .line 88
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 89
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_2

    .line 97
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 99
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 100
    iget-object v0, p0, Lcom/huawei/feedback/ui/an;->b:Landroid/content/Context;

    const-string v1, "feedback_ui_9_dip"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->g(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 101
    .line 102
    invoke-virtual {v6}, Lcom/huawei/feedback/logic/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 101
    invoke-static {v0, v5, v5}, Lcom/huawei/feedback/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 104
    int-to-float v0, v8

    invoke-static {v9, v0}, Lcom/huawei/feedback/e;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 105
    int-to-float v0, v8

    invoke-static {v10, v0}, Lcom/huawei/feedback/e;->b(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 106
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 108
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 109
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 110
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 111
    iget-object v0, v4, Lcom/huawei/feedback/ui/an$b;->a:Landroid/widget/ImageButton;

    new-instance v1, Lcom/huawei/feedback/ui/an$a;

    invoke-direct {v1, p0, v4}, Lcom/huawei/feedback/ui/an$a;-><init>(Lcom/huawei/feedback/ui/an;Lcom/huawei/feedback/ui/an$b;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 115
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 117
    :cond_3
    goto :goto_1

    .line 120
    :cond_4
    const-string v0, "FeedbackShowImageAdapter"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/an;->a(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_1
    goto :goto_2

    .line 124
    :catch_0
    move-exception v7

    .line 126
    const-string v0, "FeedbackShowImageAdapter"

    const-string v1, "show image NotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/an;->a(I)V

    .line 130
    :goto_2
    return-object p2
.end method
