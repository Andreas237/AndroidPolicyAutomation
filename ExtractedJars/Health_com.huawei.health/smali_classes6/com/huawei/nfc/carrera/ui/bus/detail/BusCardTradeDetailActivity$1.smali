.class final Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 763
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;)I
    .locals 2

    .line 768
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 763
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    move-object v1, p2

    check-cast v1, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity$1;->compare(Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;)I

    move-result v0

    return v0
.end method
