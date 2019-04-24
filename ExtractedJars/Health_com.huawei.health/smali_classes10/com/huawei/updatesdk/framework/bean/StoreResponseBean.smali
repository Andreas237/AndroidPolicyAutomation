.class public Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;
.super Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;


# static fields
.field public static final ENCRYPT_API_HCRID_ERROR:I = 0x3fe

.field public static final ENCRYPT_API_SIGN_ERROR:I = 0x3fd

.field public static final STORE_API_HCRID_ERROR:I = 0x3f4

.field public static final STORE_API_SIGN_ERROR:I = 0x3f3


# instance fields
.field private iv_:Ljava/lang/String;

.field public rspKey_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->rspKey_:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->iv_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getIV()[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->iv_:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->iv_:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/a;->a(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public getIVStr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->iv_:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {\n\tresponseCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\trtnCode_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->getRtnCode_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
