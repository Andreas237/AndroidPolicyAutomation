.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardNumInfoReader;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader<Ljava/lang/String;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CardNumInfoReader"


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 19
    return-void
.end method


# virtual methods
.method protected bridge synthetic handleResult(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardNumInfoReader;->handleResult(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected handleResult(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 26
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 27
    const-string v0, "CardNumInfoReader"

    invoke-virtual {p0, v0, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardNumInfoReader;->checkData(Ljava/lang/String;Ljava/util/List;)V

    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
