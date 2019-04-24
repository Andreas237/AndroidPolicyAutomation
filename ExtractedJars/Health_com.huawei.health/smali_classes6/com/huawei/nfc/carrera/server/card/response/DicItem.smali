.class public Lcom/huawei/nfc/carrera/server/card/response/DicItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private name:Ljava/lang/String;

.field private parent:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getParent()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->parent:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->name:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setParent(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->parent:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->value:Ljava/lang/String;

    .line 76
    return-void
.end method
