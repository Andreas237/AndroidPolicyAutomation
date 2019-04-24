.class public Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field private applet2SsdAndCapList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getApplet2SsdAndCapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->applet2SsdAndCapList:Ljava/util/List;

    return-object v0
.end method

.method public setApplet2SsdAndCapList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;>;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->applet2SsdAndCapList:Ljava/util/List;

    .line 20
    return-void
.end method
