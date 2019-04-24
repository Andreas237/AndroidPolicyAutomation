.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;
.super Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;
.source "SourceFile"


# instance fields
.field private operations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 24
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->type:Ljava/lang/String;

    .line 25
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->operations:Ljava/util/List;

    .line 26
    return-void
.end method


# virtual methods
.method public getOperations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->operations:Ljava/util/List;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setOperations(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;)V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->operations:Ljava/util/List;

    .line 36
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->type:Ljava/lang/String;

    .line 46
    return-void
.end method
