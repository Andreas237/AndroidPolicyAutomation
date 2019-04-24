.class Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ScaleManagerAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private final mInflater:Landroid/view/LayoutInflater;

.field private mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ahp;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ahp;>;)V"
        }
    .end annotation

    .line 170
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    .line 171
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 172
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->setData(Ljava/util/List;)V

    .line 173
    return-void
.end method

.method private setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ahp;>;)V"
        }
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 178
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->notifyDataSetChanged()V

    .line 179
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 165
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->getItem(I)Lo/ahp;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Lo/ahp;
    .locals 4

    .line 189
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 190
    :cond_0
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position is out of bounds"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x0

    return-object v0

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ahp;

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 199
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 204
    const/4 v4, 0x0

    .line 205
    if-nez p2, :cond_0

    .line 206
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;

    invoke-direct {v4, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/plugindevice/R$layout;->item_wifi_scales_manager:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 208
    sget v0, Lcom/huawei/plugindevice/R$id;->item_scale_manager_user_photo:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$402(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 209
    sget v0, Lcom/huawei/plugindevice/R$id;->item_scale_manager_title_text:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$502(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 210
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_scale_manage_user_weight:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$602(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 211
    sget v0, Lcom/huawei/plugindevice/R$id;->user_manager_line:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$702(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;Landroid/view/View;)Landroid/view/View;

    .line 212
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 214
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;

    .line 216
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, p1, 0x1

    if-ne v0, v1, :cond_1

    .line 217
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 219
    :cond_1
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 222
    :goto_1
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->getItem(I)Lo/ahp;

    move-result-object v5

    .line 223
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 224
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userBean is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_2
    invoke-virtual {v5}, Lo/ahp;->d()Lo/acu;

    move-result-object v6

    .line 229
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0, v6, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->setUserNameAndPhoto(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 231
    invoke-virtual {v5}, Lo/ahp;->b()Ljava/lang/Double;

    move-result-object v7

    .line 232
    if-nez v7, :cond_3

    .line 233
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_no_record:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 235
    :cond_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 236
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 237
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 238
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    goto :goto_2

    .line 240
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 241
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 242
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    :goto_2
    return-object p2
.end method
