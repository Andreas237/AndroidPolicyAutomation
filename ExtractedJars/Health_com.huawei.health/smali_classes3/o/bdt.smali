.class public Lo/bdt;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bdt$a;
    }
.end annotation


# instance fields
.field private a:Lo/bbx;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/chat/Album;>;"
        }
    .end annotation
.end field

.field private d:Lo/bdt$a;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/chat/Album;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 49
    iput-object p1, p0, Lo/bdt;->c:Ljava/util/List;

    .line 50
    iput-object p2, p0, Lo/bdt;->e:Landroid/content/Context;

    .line 51
    new-instance v0, Lo/bbx;

    invoke-direct {v0, p2}, Lo/bbx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bdt;->a:Lo/bbx;

    .line 52
    iget-object v0, p0, Lo/bdt;->a:Lo/bbx;

    invoke-virtual {v0}, Lo/bbx;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bdt;->b:Ljava/lang/String;

    .line 53
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 1

    .line 150
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p1

    .line 151
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdt;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdt;->b:Ljava/lang/String;

    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 151
    :goto_0
    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 44
    invoke-virtual {p0}, Lo/bdt;->notifyDataSetChanged()V

    .line 45
    return-void
.end method

.method public b(I)Lcom/huawei/health/sns/model/chat/Album;
    .locals 2

    .line 74
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 81
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_2
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Album;

    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/chat/Album;>;)V"
        }
    .end annotation

    .line 57
    iput-object p1, p0, Lo/bdt;->c:Ljava/util/List;

    .line 58
    invoke-virtual {p0}, Lo/bdt;->notifyDataSetChanged()V

    .line 59
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 66
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_0
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lo/bdt;->b(I)Lcom/huawei/health/sns/model/chat/Album;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 89
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 96
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 98
    :cond_0
    return-object p2

    .line 101
    :cond_1
    if-nez p2, :cond_2

    .line 103
    iget-object v0, p0, Lo/bdt;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_album_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object p2, v0

    check-cast p2, Landroid/widget/RelativeLayout;

    .line 105
    new-instance v0, Lo/bdt$a;

    invoke-direct {v0}, Lo/bdt$a;-><init>()V

    iput-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    .line 106
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->album_first_image:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bdt$a;->b:Landroid/widget/ImageView;

    .line 107
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->album_second_image:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bdt$a;->a:Landroid/widget/ImageView;

    .line 108
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->album_third_image:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bdt$a;->c:Landroid/widget/ImageView;

    .line 109
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->sns_album_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lo/bdt$a;->d:Landroid/widget/TextView;

    .line 110
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->sns_photo_num:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lo/bdt$a;->e:Landroid/widget/TextView;

    .line 111
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    sget v1, Lcom/huawei/android/sns/R$id;->albun_list_sdcard_icon:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bdt$a;->h:Landroid/widget/ImageView;

    .line 112
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdt$a;

    iput-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    .line 119
    :goto_0
    iget-object v0, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getFirstPhotoId()I

    move-result v7

    .line 120
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->c:Landroid/widget/ImageView;

    invoke-static {v0, v7}, Lo/aux;->e(Landroid/widget/ImageView;I)V

    .line 121
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->a:Landroid/widget/ImageView;

    invoke-static {v0, v7}, Lo/aux;->e(Landroid/widget/ImageView;I)V

    .line 122
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->b:Landroid/widget/ImageView;

    invoke-static {v0, v7}, Lo/aux;->e(Landroid/widget/ImageView;I)V

    .line 124
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Album;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bdt;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_photo_nums:I

    iget-object v3, p0, Lo/bdt;->c:Ljava/util/List;

    .line 126
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/Album;->getCount()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lo/bdt;->c:Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/Album;->getCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 125
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    invoke-static {v7}, Lo/are;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 130
    invoke-direct {p0, v8}, Lo/bdt;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 132
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 136
    :cond_3
    iget-object v0, p0, Lo/bdt;->d:Lo/bdt$a;

    iget-object v0, v0, Lo/bdt$a;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    :goto_1
    return-object p2
.end method
