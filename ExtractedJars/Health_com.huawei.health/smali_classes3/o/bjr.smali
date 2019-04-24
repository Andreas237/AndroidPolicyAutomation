.class public Lo/bjr;
.super Lo/bjq;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lo/bjq;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjr;->e:Landroid/widget/TextView;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjr;->d:Landroid/content/Context;

    return-void
.end method

.method private a(Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;)V
    .locals 2

    .line 92
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lo/arf;->b(Landroid/widget/ImageView;Landroid/net/Uri;)V

    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aqx;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 102
    :goto_0
    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 38
    iput-object p1, p0, Lo/bjr;->d:Landroid/content/Context;

    .line 39
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_transmit_image:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 40
    sget v0, Lcom/huawei/android/sns/R$id;->sns_transmit_img_text:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    .line 41
    sget v0, Lcom/huawei/android/sns/R$id;->sns_transmit_info:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjr;->e:Landroid/widget/TextView;

    .line 42
    sget v0, Lcom/huawei/android/sns/R$id;->sns_transmit_img:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    .line 43
    return-object v3
.end method

.method e(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)V"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 59
    iget-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 60
    return-void

    .line 62
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 64
    iget-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 66
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    .line 67
    invoke-direct {p0, v7}, Lo/bjr;->a(Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;)V

    .line 68
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 72
    iget-object v0, p0, Lo/bjr;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 73
    move v7, v6

    .line 74
    const/16 v0, 0x9

    if-le v6, v0, :cond_2

    .line 76
    iget-object v0, p0, Lo/bjr;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 77
    iget-object v0, p0, Lo/bjr;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjr;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_transmit_img_too_long:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x9

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    const/16 v7, 0x9

    .line 80
    :cond_2
    iget-object v0, p0, Lo/bjr;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjr;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_transmit_multi_image:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v7, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    :cond_3
    :goto_0
    return-void
.end method
