.class public Lo/ble;
.super Lo/bli;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ble;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/ble;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lo/bli;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-direct {p0}, Lo/ble;->c()V

    .line 38
    return-void
.end method

.method private c()V
    .locals 0

    .line 44
    invoke-virtual {p0}, Lo/ble;->a()V

    .line 45
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 50
    invoke-virtual {p0}, Lo/ble;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_detail_circle_image_layout:I

    invoke-static {v0, v1, p0}, Lo/ble;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 51
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ble;->setOrientation(I)V

    .line 52
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 53
    const/16 v0, 0x10

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 54
    invoke-virtual {p0, v2}, Lo/ble;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    sget v0, Lcom/huawei/android/sns/R$id;->dynamic_tag_download_textview:I

    invoke-virtual {p0, v0}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ble;->b:Landroid/widget/TextView;

    .line 56
    sget v0, Lcom/huawei/android/sns/R$id;->download_textview:I

    invoke-virtual {p0, v0}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ble;->d:Landroid/widget/TextView;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ble;->c:Ljava/util/List;

    .line 58
    iget-object v0, p0, Lo/ble;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->first_dynamic_imageview:I

    invoke-virtual {p0, v1}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/blb;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Lo/ble;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->second_dynamic_imageview:I

    invoke-virtual {p0, v1}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/blb;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v0, p0, Lo/ble;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->third_dynamic_imageview:I

    invoke-virtual {p0, v1}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/blb;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v0, p0, Lo/ble;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->four_dynamic_imageview:I

    invoke-virtual {p0, v1}, Lo/ble;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/blb;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    return-void
.end method

.method protected e(Landroid/view/View;Lcom/huawei/health/sns/model/circle/UserCircleContent;)V
    .locals 2

    .line 73
    instance-of v0, p1, Lo/blb;

    if-eqz v0, :cond_0

    .line 75
    move-object v1, p1

    check-cast v1, Lo/blb;

    .line 76
    iget-object v0, p0, Lo/ble;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    invoke-virtual {v1, v0}, Lo/blb;->setUserCircle(Lcom/huawei/health/sns/model/circle/UserCircle;)V

    .line 77
    iget-object v0, p0, Lo/ble;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v0}, Lo/blb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lo/bbc;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 80
    :cond_0
    return-void
.end method
