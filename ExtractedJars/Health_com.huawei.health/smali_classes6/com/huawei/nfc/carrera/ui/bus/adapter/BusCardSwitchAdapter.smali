.class public Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private mBusCardInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mContext:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    .line 23
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 40
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_2

    .line 51
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p2, :cond_3

    .line 56
    new-instance p2, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    invoke-direct {p2, v0, v1, p3}, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 60
    :cond_3
    move-object v0, p2

    check-cast v0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->setData(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)V

    .line 62
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;->mBusCardInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 63
    return-object p2
.end method
