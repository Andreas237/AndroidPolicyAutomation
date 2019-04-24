.class public Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appletAid:Ljava/lang/String;

.field private capAid:Ljava/lang/String;

.field private ssdAid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppletAid()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->appletAid:Ljava/lang/String;

    return-object v0
.end method

.method public getCapAid()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->capAid:Ljava/lang/String;

    return-object v0
.end method

.method public getSsdAid()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->ssdAid:Ljava/lang/String;

    return-object v0
.end method

.method public setAppletAid(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->appletAid:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public setCapAid(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->capAid:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setSsdAid(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->ssdAid:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Applet2SsdAndCapObject{appletAid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->appletAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ssdAid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->ssdAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", capAid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->capAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
