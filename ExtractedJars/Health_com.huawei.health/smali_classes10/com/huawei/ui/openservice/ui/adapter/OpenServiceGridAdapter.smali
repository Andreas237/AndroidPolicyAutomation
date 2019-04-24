.class public Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;
    }
.end annotation


# instance fields
.field private listener:Landroid/view/View$OnClickListener;

.field private mContext:Landroid/content/Context;

.field private services:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Landroid/view/View$OnClickListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;Landroid/content/Context;Landroid/view/View$OnClickListener;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->services:Ljava/util/List;

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->services:Ljava/util/List;

    .line 33
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->mContext:Landroid/content/Context;

    .line 34
    iput-object p3, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->listener:Landroid/view/View$OnClickListener;

    .line 35
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->removeShuDongLi(Ljava/util/List;)V

    .line 38
    :cond_0
    return-void
.end method

.method private removeShuDongLi(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)V"
        }
    .end annotation

    .line 84
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 85
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 86
    const-string v0, "shudongli"

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-interface {p1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 85
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 91
    :cond_1
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->services:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->services:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 52
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 58
    if-nez p2, :cond_0

    .line 59
    new-instance v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;-><init>(Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$1;)V

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$layout;->layout_open_service_grid_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 61
    sget v0, Lcom/huawei/ui/openservice/R$id;->gird_item:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/ui/GridImage;

    iput-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    .line 62
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;

    .line 66
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->services:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceMidIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    iget-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/openservice/ui/GridImage;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 70
    :cond_1
    iget-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/GridImage;->setVisibility(I)V

    .line 72
    :goto_1
    iget-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/GridImage;->setClickable(Z)V

    .line 73
    iget-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;->listener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/GridImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget-object v0, v3, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter$ServiceTitleViewHolder;->icon:Lcom/huawei/ui/openservice/ui/GridImage;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/GridImage;->setTag(Ljava/lang/Object;)V

    .line 75
    return-object p2
.end method
