.class public Lcom/huawei/datatype/PayBusCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private AID:Ljava/lang/String;

.field private Name:Ljava/lang/String;

.field private id:Ljava/lang/String;


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

    .line 12
    iget-object v0, p0, Lcom/huawei/datatype/PayBusCardInfo;->AID:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/datatype/PayBusCardInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/datatype/PayBusCardInfo;->Name:Ljava/lang/String;

    return-object v0
.end method

.method public setAID(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/datatype/PayBusCardInfo;->AID:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/datatype/PayBusCardInfo;->id:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/datatype/PayBusCardInfo;->Name:Ljava/lang/String;

    .line 33
    return-void
.end method
