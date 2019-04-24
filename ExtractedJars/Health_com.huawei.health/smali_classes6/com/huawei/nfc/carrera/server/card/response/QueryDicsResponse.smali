.class public Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;
.super Lo/ecs;
.source "SourceFile"


# instance fields
.field public dicItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/response/DicItem;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lo/ecs;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getDicItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/response/DicItem;>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setDicItems(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/response/DicItem;>;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    .line 22
    return-void
.end method
