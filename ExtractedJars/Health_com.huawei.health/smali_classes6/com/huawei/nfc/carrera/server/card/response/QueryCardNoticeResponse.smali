.class public Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field public noticeLists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->noticeLists:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getNoticeLists()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->noticeLists:Ljava/util/List;

    return-object v0
.end method

.method public setNoticeLists(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->noticeLists:Ljava/util/List;

    .line 24
    return-void
.end method
