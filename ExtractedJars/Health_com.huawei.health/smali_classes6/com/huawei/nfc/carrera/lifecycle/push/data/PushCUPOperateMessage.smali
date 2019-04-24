.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CUP_PUSH_MSG_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final CUP_PUSH_MSG_KEY_TSMLIBDATA:Ljava/lang/String; = "tsmLibData"

.field static final CUP_PUSH_MSG_KEY_VIRTUAL_CARD:Ljava/lang/String; = "virtualCards"

.field static final CUP_PUSH_MSG_TYPE:Ljava/lang/String; = "UnionPayPush"

.field static final TSMLIBDATA_KEY_EVENT:Ljava/lang/String; = "event"

.field static final TSMLIBDATA_KEY_SIGN:Ljava/lang/String; = "sign"

.field static final TSMLIBDATA_KEY_SSID:Ljava/lang/String; = "ssid"


# instance fields
.field private cplc:Ljava/lang/String;

.field private event:Ljava/lang/String;

.field private sign:Ljava/lang/String;

.field private ssid:Ljava/lang/String;

.field private virtualCards:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getEvent()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->event:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getSsid()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->ssid:Ljava/lang/String;

    return-object v0
.end method

.method public getVirtualCards()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->virtualCards:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->cplc:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setEvent(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->event:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->sign:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setSsid(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->ssid:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setVirtualCards(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 81
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->virtualCards:Ljava/util/ArrayList;

    .line 82
    return-void
.end method
