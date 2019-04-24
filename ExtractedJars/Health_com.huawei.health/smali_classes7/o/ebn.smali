.class public Lo/ebn;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Landroid/graphics/Bitmap;>;I)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 27
    iput-object p1, p0, Lo/ebn;->c:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lo/ebn;->d:Ljava/util/List;

    .line 29
    iput p3, p0, Lo/ebn;->b:I

    .line 30
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 33
    iget-object v0, p0, Lo/ebn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 38
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/ebn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 39
    iget-object v0, p0, Lo/ebn;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 47
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 53
    iget-object v0, p0, Lo/ebn;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$layout;->hw_health_edit_share_gridview_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 54
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ebn;->a:Landroid/widget/ImageView;

    .line 55
    iget v0, p0, Lo/ebn;->b:I

    if-nez v0, :cond_0

    .line 56
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 57
    iget-object v0, p0, Lo/ebn;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 59
    :cond_0
    iget v0, p0, Lo/ebn;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 60
    if-nez p1, :cond_2

    .line 61
    iget-object v0, p0, Lo/ebn;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lo/ebn;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 66
    :cond_2
    :goto_0
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_gridview_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 67
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Lo/ebn;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 68
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lo/ebn;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lo/ebn;->d:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    :cond_3
    return-object p2
.end method
