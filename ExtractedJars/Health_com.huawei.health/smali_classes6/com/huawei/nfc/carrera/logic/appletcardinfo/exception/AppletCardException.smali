.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private errCode:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 13
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->errCode:I

    .line 14
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 19
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->errCode:I

    .line 20
    return-void
.end method


# virtual methods
.method public getErrCode()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->errCode:I

    return v0
.end method
