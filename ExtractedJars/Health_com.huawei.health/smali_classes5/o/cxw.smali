.class public Lo/cxw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cxw$e;,
        Lo/cxw$c;
    }
.end annotation


# instance fields
.field private c:Landroid/view/LayoutInflater;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cxw$e;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxw;->e:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxw;->e:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/cxw;->c:Landroid/view/LayoutInflater;

    .line 42
    return-void
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 89
    iput-object p1, p0, Lo/cxw;->e:Ljava/util/List;

    .line 90
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 7

    .line 160
    const/4 v5, 0x0

    .line 161
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "01"

    const-string v1, "DeviceListAdapter"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "filterToNames(), deviceName = null, return true!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x1

    return v0

    .line 167
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 168
    const-string v0, "01"

    const-string v1, "DeviceListAdapter"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase deviceName = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/cxw;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 171
    const-string v0, "01"

    const-string v1, "DeviceListAdapter"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase mNameFilter["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cxw;->e:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lo/cxw;->e:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 173
    iget-object v0, p0, Lo/cxw;->e:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 174
    const/4 v5, 0x1

    .line 175
    goto :goto_1

    .line 179
    :cond_1
    const/4 v5, 0x1

    .line 170
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 183
    :cond_3
    :goto_1
    const-string v0, "01"

    const-string v1, "DeviceListAdapter"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "filterToNames(), flagFilter ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return v5
.end method

.method public e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/bluetooth/BluetoothDevice;>;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 46
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 47
    new-instance v4, Lo/cxw$e;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/cxw$e;-><init>(Lo/cxw$2;)V

    .line 48
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/cxw$e;->e(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/cxw$e;->b(Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cxw$e;->e(Z)V

    .line 51
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v2, Lo/cxw$e;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/cxw$e;-><init>(Lo/cxw$2;)V

    .line 54
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_device_mgr_not_found_device:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cxw$e;->e(Ljava/lang/String;)V

    .line 55
    const-string v0, ""

    invoke-virtual {v2, v0}, Lo/cxw$e;->b(Ljava/lang/String;)V

    .line 56
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/cxw$e;->e(Z)V

    .line 57
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    invoke-virtual {p0}, Lo/cxw;->notifyDataSetChanged()V

    .line 59
    return-void
.end method

.method public e(Ljava/util/List;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/bluetooth/BluetoothDevice;>;I)V"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le p2, v0, :cond_0

    .line 63
    invoke-virtual {p0, p1}, Lo/cxw;->e(Ljava/util/List;)V

    .line 64
    return-void

    .line 66
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 67
    invoke-virtual {p0, p1}, Lo/cxw;->e(Ljava/util/List;)V

    .line 68
    return-void

    .line 70
    :cond_1
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    .line 71
    new-instance v5, Lo/cxw$e;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/cxw$e;-><init>(Lo/cxw$2;)V

    .line 72
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/cxw$e;->e(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/cxw$e;->b(Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cxw$e;->e(Z)V

    .line 75
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, p2, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cxw$e;

    invoke-virtual {v0}, Lo/cxw$e;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    new-instance v6, Lo/cxw$e;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/cxw$e;-><init>(Lo/cxw$2;)V

    .line 78
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_device_mgr_not_found_device:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/cxw$e;->e(Ljava/lang/String;)V

    .line 79
    const-string v0, ""

    invoke-virtual {v6, v0}, Lo/cxw$e;->b(Ljava/lang/String;)V

    .line 80
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/cxw$e;->e(Z)V

    .line 81
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_2
    const-string v0, "DeviceListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devices.size() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "devices.size() : mList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p0}, Lo/cxw;->notifyDataSetChanged()V

    .line 86
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 95
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 101
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 107
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 116
    if-nez p2, :cond_0

    .line 117
    iget-object v0, p0, Lo/cxw;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/hwbtsdk/R$layout;->device_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 118
    new-instance v3, Lo/cxw$c;

    invoke-direct {v3}, Lo/cxw$c;-><init>()V

    .line 119
    sget v0, Lcom/huawei/hwbtsdk/R$id;->item_device_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    .line 120
    sget v0, Lcom/huawei/hwbtsdk/R$id;->item_device_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v3, Lo/cxw$c;->e:Landroid/view/View;

    .line 121
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cxw$c;

    .line 125
    :goto_0
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 126
    iget-object v0, v3, Lo/cxw$c;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 128
    :cond_1
    iget-object v0, v3, Lo/cxw$c;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    :goto_1
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cxw$e;

    invoke-virtual {v0}, Lo/cxw$e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 131
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cxw$e;

    invoke-virtual {v1}, Lo/cxw$e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 133
    :cond_2
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cxw$e;

    invoke-virtual {v0}, Lo/cxw$e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cxw;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 134
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cxw$e;

    invoke-virtual {v1}, Lo/cxw$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 135
    :cond_3
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cxw$e;

    invoke-virtual {v0}, Lo/cxw$e;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 136
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cxw$e;

    invoke-virtual {v1}, Lo/cxw$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 138
    :cond_4
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cxw$e;

    invoke-virtual {v1}, Lo/cxw$e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    :goto_2
    iget-object v0, p0, Lo/cxw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_5

    .line 142
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwbtsdk/R$color;->common_ui_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    .line 144
    :cond_5
    iget-object v0, v3, Lo/cxw$c;->a:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwbtsdk/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    :goto_3
    return-object p2
.end method
