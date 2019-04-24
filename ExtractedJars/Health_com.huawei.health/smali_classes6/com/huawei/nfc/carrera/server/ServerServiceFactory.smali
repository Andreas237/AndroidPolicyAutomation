.class public Lcom/huawei/nfc/carrera/server/ServerServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createCardServerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;
    .locals 2

    .line 39
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    const-string v1, "TransportationCard"

    invoke-direct {v0, p0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static createCardServerApi(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;
    .locals 1

    .line 44
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static createFileDownloadApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/download/FileDownloadApi;
    .locals 1

    .line 55
    new-instance v0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
