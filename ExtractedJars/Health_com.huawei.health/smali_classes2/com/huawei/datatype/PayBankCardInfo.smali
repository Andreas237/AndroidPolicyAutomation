.class public Lcom/huawei/datatype/PayBankCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private AID:Ljava/lang/String;

.field private fileName:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private number:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAID()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/datatype/PayBankCardInfo;->AID:Ljava/lang/String;

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/datatype/PayBankCardInfo;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/datatype/PayBankCardInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNumber()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/datatype/PayBankCardInfo;->number:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/datatype/PayBankCardInfo;->type:I

    return v0
.end method

.method public setAID(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/datatype/PayBankCardInfo;->AID:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public setFileName(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/datatype/PayBankCardInfo;->fileName:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/datatype/PayBankCardInfo;->name:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setNumber(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/datatype/PayBankCardInfo;->number:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/datatype/PayBankCardInfo;->type:I

    .line 35
    return-void
.end method
