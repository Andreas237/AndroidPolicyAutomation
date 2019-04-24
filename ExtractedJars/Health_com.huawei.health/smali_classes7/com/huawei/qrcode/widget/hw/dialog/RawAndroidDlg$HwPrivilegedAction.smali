.class Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "HwPrivilegedAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/security/PrivilegedAction<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field field:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;->field:Ljava/lang/reflect/Field;

    iput-object p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;->field:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;->field:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v0, 0x0

    return-object v0
.end method
