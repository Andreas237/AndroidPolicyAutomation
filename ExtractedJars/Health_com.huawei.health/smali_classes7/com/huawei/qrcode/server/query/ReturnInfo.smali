.class public Lcom/huawei/qrcode/server/query/ReturnInfo;
.super Ljava/lang/Object;


# instance fields
.field private code:I

.field private result:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    iget v0, p0, Lcom/huawei/qrcode/server/query/ReturnInfo;->code:I

    return v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/ReturnInfo;->result:Ljava/lang/String;

    return-object v0
.end method

.method public setCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/qrcode/server/query/ReturnInfo;->code:I

    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/server/query/ReturnInfo;->result:Ljava/lang/String;

    return-void
.end method
