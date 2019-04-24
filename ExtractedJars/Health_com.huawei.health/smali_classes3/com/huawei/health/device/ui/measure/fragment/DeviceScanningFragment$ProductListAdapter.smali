.class Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProductListAdapter"
.end annotation


# instance fields
.field private productList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/acl;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/acl;>;)V"
        }
    .end annotation

    .line 200
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 201
    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 202
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 222
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 227
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/acl;

    .line 228
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_bind_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 230
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 232
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 233
    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 234
    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 236
    :cond_0
    const-string v0, "unknown"

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    :goto_0
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 241
    const-string v0, "ic_heartrate_devices"

    invoke-static {v0}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_summary:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 245
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 247
    invoke-virtual {v4}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 251
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 252
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 254
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 257
    :goto_1
    goto/16 :goto_3

    .line 259
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 261
    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 266
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v7

    .line 267
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 270
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_summary:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 272
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "9bf158ba-49b0-46aa-9fdf-ed75da1569cf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 273
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 275
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mac: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    :goto_2
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 280
    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment item Device name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_mac_addr:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 285
    invoke-virtual {v4}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    .line 289
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_4

    .line 290
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 292
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 296
    :goto_3
    return-object p2
.end method

.method public refreshData(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/acl;>;)V"
        }
    .end annotation

    .line 205
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    .line 206
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment porduct size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->productList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 208
    return-void
.end method
