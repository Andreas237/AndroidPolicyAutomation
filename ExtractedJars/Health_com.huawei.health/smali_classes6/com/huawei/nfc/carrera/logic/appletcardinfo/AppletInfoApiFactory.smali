.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;
    .locals 1

    .line 20
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
