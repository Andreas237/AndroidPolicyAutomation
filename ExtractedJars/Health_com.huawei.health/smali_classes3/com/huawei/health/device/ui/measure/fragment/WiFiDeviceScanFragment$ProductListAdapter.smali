.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProductListAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private productList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ajd;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/ajd;>;)V"
        }
    .end annotation

    .line 382
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 380
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 383
    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 384
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 393
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 403
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 408
    const/4 v4, 0x0

    .line 409
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ajd;

    .line 411
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v5}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 414
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 415
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;)V

    .line 416
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->wifi_device_scan_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 417
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_device_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;->mDeviceNameTv:Landroid/widget/TextView;

    .line 418
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_device_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;->mIconView:Landroid/widget/ImageView;

    .line 419
    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 421
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;

    .line 424
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 425
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductListAdapter mProductInfo is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;->mDeviceNameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 428
    iget-object v0, v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter$ViewHolder;->mIconView:Landroid/widget/ImageView;

    invoke-static {v6}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 429
    goto :goto_1

    .line 430
    :cond_2
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductListAdapter mProductInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_1
    return-object p2
.end method

.method public refreshData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/ajd;>;)V"
        }
    .end annotation

    .line 387
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 388
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 389
    return-void
.end method
