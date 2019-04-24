.class public abstract Lcom/huawei/qrcode/util/LogX;
.super Ljava/lang/Object;


# static fields
.field private static final CALL_LOG_LEVEL:I = 0x3

.field private static final LOG_HWOTO_TAG:Ljava/lang/String; = "ScanQrcode"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lcom/huawei/qrcode/util/LogC;->d(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/huawei/qrcode/util/LogC;->d(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static d(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/qrcode/util/LogC;->d(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, p1, v2}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1, p2}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static e(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lcom/huawei/qrcode/util/LogC;->i(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/huawei/qrcode/util/LogC;->i(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "ScanQrcode"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, p2}, Lcom/huawei/qrcode/util/LogC;->i(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/qrcode/util/LogC;->i(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, p1, v2}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1, p2}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public static w(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "ScanQrcode"

    const/4 v1, 0x3

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/qrcode/util/LogC;->w(Ljava/lang/String;Ljava/lang/String;IZ)V

    return-void
.end method
