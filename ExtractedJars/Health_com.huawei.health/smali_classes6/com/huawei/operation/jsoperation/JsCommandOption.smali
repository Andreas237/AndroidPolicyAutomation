.class public Lcom/huawei/operation/jsoperation/JsCommandOption;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private funcType:Ljava/lang/String;

.field private functionRes:Ljava/lang/String;

.field private isLegal:Z

.field private param:Ljava/lang/String;

.field private serviceType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method


# virtual methods
.method public getFuncType()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->funcType:Ljava/lang/String;

    return-object v0
.end method

.method public getFunctionRes()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->functionRes:Ljava/lang/String;

    return-object v0
.end method

.method public getParam()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->param:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceType()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->serviceType:Ljava/lang/String;

    return-object v0
.end method

.method public init()V
    .locals 0

    .line 60
    return-void
.end method

.method public init1()V
    .locals 0

    .line 61
    return-void
.end method

.method public init2()V
    .locals 0

    .line 62
    return-void
.end method

.method public init3()V
    .locals 0

    .line 63
    return-void
.end method

.method public isLegal()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal:Z

    return v0
.end method

.method public setFuncType(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->funcType:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setFunctionRes(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->functionRes:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setLegal(Z)V
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal:Z

    .line 57
    return-void
.end method

.method public setParam(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->param:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setServiceType(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JsCommandOption;->serviceType:Ljava/lang/String;

    .line 25
    return-void
.end method
