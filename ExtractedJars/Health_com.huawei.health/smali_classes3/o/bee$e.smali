.class Lo/bee$e;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bee;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/axq;>;"
        }
    .end annotation
.end field

.field private b:J

.field private d:Landroid/content/Context;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;JZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/axq;>;JZ)V"
        }
    .end annotation

    .line 472
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 465
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bee$e;->a:Ljava/util/ArrayList;

    .line 473
    iput-object p1, p0, Lo/bee$e;->d:Landroid/content/Context;

    .line 474
    iput-object p2, p0, Lo/bee$e;->a:Ljava/util/ArrayList;

    .line 475
    iput-wide p3, p0, Lo/bee$e;->b:J

    .line 476
    iput-boolean p5, p0, Lo/bee$e;->e:Z

    .line 477
    return-void
.end method


# virtual methods
.method public d(I)Lo/axq;
    .locals 1

    .line 488
    iget-object v0, p0, Lo/bee$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/axq;

    return-object v0
.end method

.method public getCount()I
    .locals 2

    .line 482
    iget-object v0, p0, Lo/bee$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bee$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 461
    invoke-virtual {p0, p1}, Lo/bee$e;->d(I)Lo/axq;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 494
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 501
    const/4 v4, 0x0

    .line 503
    if-nez p2, :cond_0

    .line 505
    new-instance v4, Lo/bee$c;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/bee$c;-><init>(Lo/bee$1;)V

    .line 506
    iget-object v0, p0, Lo/bee$e;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assist_subheading_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 507
    sget v0, Lcom/huawei/android/sns/R$id;->text_subheading_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmp;

    iput-object v0, v4, Lo/bee$c;->c:Lo/bmp;

    .line 508
    sget v0, Lcom/huawei/android/sns/R$id;->img_subheading_pic:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/bee$c;->d:Landroid/widget/ImageView;

    .line 509
    sget v0, Lcom/huawei/android/sns/R$id;->list_diliver:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/bee$c;->b:Landroid/widget/ImageView;

    .line 510
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 514
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bee$c;

    .line 517
    :goto_0
    invoke-virtual {p0}, Lo/bee$e;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 519
    iget-object v0, v4, Lo/bee$c;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 523
    :cond_1
    iget-object v0, v4, Lo/bee$c;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 525
    :goto_1
    invoke-virtual {p0, p1}, Lo/bee$e;->d(I)Lo/axq;

    move-result-object v5

    .line 526
    iget-object v0, v4, Lo/bee$c;->c:Lo/bmp;

    iget-boolean v1, p0, Lo/bee$e;->e:Z

    invoke-virtual {v0, v1}, Lo/bmp;->setSingleSelectedFlag(Z)V

    .line 527
    iget-object v0, v4, Lo/bee$c;->c:Lo/bmp;

    invoke-virtual {v5}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmp;->setText(Ljava/lang/CharSequence;)V

    .line 529
    iget-object v0, v4, Lo/bee$c;->d:Landroid/widget/ImageView;

    invoke-virtual {v5}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lo/bee$e;->b:J

    invoke-static {v0, v1, v2, v3}, Lo/bay;->b(Landroid/widget/ImageView;Ljava/lang/String;J)V

    .line 531
    return-object p2
.end method
