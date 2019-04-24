.class public Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SW_LENGTH:I = 0x4


# instance fields
.field private apdu:Ljava/lang/String;

.field private checker:Ljava/lang/String;

.field private index:I

.field private rapdu:Ljava/lang/String;

.field private sw:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

    .line 49
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->index:I

    .line 50
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->apdu:Ljava/lang/String;

    .line 51
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    .line 52
    return-void
.end method


# virtual methods
.method public getApdu()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->apdu:Ljava/lang/String;

    return-object v0
.end method

.method public getChecker()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->index:I

    return v0
.end method

.method public getRapdu()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->rapdu:Ljava/lang/String;

    return-object v0
.end method

.method public getSw()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

    return-object v0
.end method

.method public parseRapduAndSw(Ljava/lang/String;)V
    .locals 2

    .line 125
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 127
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->rapdu:Ljava/lang/String;

    .line 128
    return-void

    .line 130
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->rapdu:Ljava/lang/String;

    .line 131
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setApdu(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->apdu:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setChecker(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setChecker([Ljava/lang/String;)V
    .locals 5

    .line 96
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 98
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    .line 99
    return-void

    .line 101
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_3

    .line 103
    aget-object v4, p1, v3

    .line 104
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-eq v3, v0, :cond_2

    .line 107
    const-string v0, "|"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->index:I

    .line 62
    return-void
.end method

.method public setRapdu(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->rapdu:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setSw(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApduCommand{index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", apdu=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->apdu:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rapdu=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->rapdu:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", checker=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->checker:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sw=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->sw:Ljava/lang/String;

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
