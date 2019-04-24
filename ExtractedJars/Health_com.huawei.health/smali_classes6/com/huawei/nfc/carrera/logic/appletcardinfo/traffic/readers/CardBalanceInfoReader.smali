.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader<[Ljava/lang/Integer;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CardBalanceInfoReader"


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
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;->handleResult(Ljava/util/List;)[Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected handleResult(Ljava/util/List;)[Ljava/lang/Integer;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)[Ljava/lang/Integer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/Integer;

    .line 30
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 32
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 34
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 35
    const-string v0, "CardBalanceInfoReader"

    invoke-virtual {p0, v0, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;->checkData(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    goto :goto_1

    .line 42
    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v5, v0, :cond_1

    .line 44
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 45
    const-string v0, "CardBalanceInfoReader"

    invoke-virtual {p0, v0, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;->checkData(Ljava/lang/String;Ljava/util/List;)V

    .line 46
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    .line 42
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    return-object v4
.end method
