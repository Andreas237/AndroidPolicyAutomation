.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HCI_TRANS_TYPE_BUS:Ljava/lang/String; = "1"

.field public static final HCI_TRANS_TYPE_CONSUME:Ljava/lang/String; = "0"

.field public static final HCI_TRANS_TYPE_METRO_IN:Ljava/lang/String; = "2"

.field public static final HCI_TRANS_TYPE_METRO_OFF:Ljava/lang/String; = "3"

.field public static final TYPE_CONFIG:I = 0x2

.field public static final TYPE_TLV:I = 0x1


# instance fields
.field private balance:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private transAmount:Ljava/lang/String;

.field private transDate:Ljava/lang/String;

.field private transDateAndTime:Ljava/lang/String;

.field private transTerminal:Ljava/lang/String;

.field private transTime:Ljava/lang/String;

.field private transType:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->type:I

    .line 89
    return-void
.end method

.method public static build(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;
    .locals 1

    .line 184
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;-><init>(I)V

    .line 185
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transAmount:Ljava/lang/String;

    .line 186
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->balance:Ljava/lang/String;

    .line 187
    iput-object p3, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transType:Ljava/lang/String;

    .line 188
    iput-object p4, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDate:Ljava/lang/String;

    .line 189
    iput-object p5, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTime:Ljava/lang/String;

    .line 190
    iput-object p6, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTerminal:Ljava/lang/String;

    .line 191
    iput-object p7, v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->currency:Ljava/lang/String;

    .line 192
    return-object v0
.end method


# virtual methods
.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->balance:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getTransAmount()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getTransDate()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDate:Ljava/lang/String;

    return-object v0
.end method

.method public getTransDateAndTime()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDateAndTime:Ljava/lang/String;

    return-object v0
.end method

.method public getTransTerminal()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTerminal:Ljava/lang/String;

    return-object v0
.end method

.method public getTransTime()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTime:Ljava/lang/String;

    return-object v0
.end method

.method public getTransType()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transType:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->type:I

    return v0
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->balance:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->currency:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public setTransAmount(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transAmount:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setTransDate(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDate:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setTransDateAndTime(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDateAndTime:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setTransTerminal(Ljava/lang/String;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTerminal:Ljava/lang/String;

    .line 169
    return-void
.end method

.method public setTransTime(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTime:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public setTransType(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transType:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->type:I

    .line 99
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HciInfo{transAmount=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transAmount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", balance=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->balance:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transTerminal=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciInfo;->transTerminal:Ljava/lang/String;

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
