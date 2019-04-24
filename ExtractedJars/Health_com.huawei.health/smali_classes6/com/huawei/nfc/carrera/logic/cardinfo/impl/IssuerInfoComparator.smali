.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/IssuerInfoComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xd2edf115bf4dbL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)I
    .locals 2

    .line 30
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getSn()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getSn()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 32
    const/4 v0, 0x1

    return v0

    .line 35
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getSn()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getSn()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 20
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-object v1, p2

    check-cast v1, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/IssuerInfoComparator;->compare(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)I

    move-result v0

    return v0
.end method
