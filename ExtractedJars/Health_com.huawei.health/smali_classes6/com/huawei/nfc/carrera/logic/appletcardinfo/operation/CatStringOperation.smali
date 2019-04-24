.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CatStringOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    .line 13
    return-void
.end method


# virtual methods
.method public handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CatStringOperation;->param:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    return-object p1

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/CatStringOperation;->param:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
