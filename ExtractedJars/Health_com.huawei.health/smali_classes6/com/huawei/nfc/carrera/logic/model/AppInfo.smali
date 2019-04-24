.class public Lcom/huawei/nfc/carrera/logic/model/AppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apkIcon:Landroid/graphics/Bitmap;

.field private apkIconUrl:Ljava/lang/String;

.field private apkName:Ljava/lang/String;

.field private issuerAppMarketId:Ljava/lang/String;

.field private issuerAppPkg:Ljava/lang/String;

.field private supportType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppPkg:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppMarketId:Ljava/lang/String;

    .line 43
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->supportType:I

    .line 44
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkIconUrl:Ljava/lang/String;

    .line 45
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkName:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method public getApkIcon()Landroid/graphics/Bitmap;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkIcon:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getApkIconUrl()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getApkName()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkName:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerAppMarketId()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppMarketId:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerAppPkg()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppPkg:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportType()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->supportType:I

    return v0
.end method

.method public setApkIcon(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkIcon:Landroid/graphics/Bitmap;

    .line 87
    return-void
.end method

.method public setApkIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkIconUrl:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setApkName(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->apkName:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setIssuerAppMarketId(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppMarketId:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setIssuerAppPkg(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->issuerAppPkg:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setSupportType(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->supportType:I

    .line 71
    return-void
.end method
