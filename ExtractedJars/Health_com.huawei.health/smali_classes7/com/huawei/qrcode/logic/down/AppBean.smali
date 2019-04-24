.class public Lcom/huawei/qrcode/logic/down/AppBean;
.super Ljava/lang/Object;


# instance fields
.field private filePath:Ljava/lang/String;

.field private packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppBean;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppBean;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/AppBean;->filePath:Ljava/lang/String;

    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/AppBean;->packageName:Ljava/lang/String;

    return-void
.end method
