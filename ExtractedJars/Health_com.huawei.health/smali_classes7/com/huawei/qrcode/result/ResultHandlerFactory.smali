.class public final Lcom/huawei/qrcode/result/ResultHandlerFactory;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static makeResultHandler(Lcom/huawei/qrcode/CaptureActivity;Lo/or;)Lcom/huawei/qrcode/result/ResultHandler;
    .locals 4

    invoke-static {p1}, Lcom/huawei/qrcode/result/ResultHandlerFactory;->parseResult(Lo/or;)Lo/pr;

    move-result-object v3

    const-string v0, "ResultHandlerFactory"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result.getType()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/pr;->b()Lo/ps;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/huawei/qrcode/result/TextResultHandler;

    invoke-direct {v0, p0, v3, p1}, Lcom/huawei/qrcode/result/TextResultHandler;-><init>(Landroid/app/Activity;Lo/pr;Lo/or;)V

    return-object v0
.end method

.method public static parseResult(Lo/or;)Lo/pr;
    .locals 1

    invoke-static {p0}, Lo/pw;->h(Lo/or;)Lo/pr;

    move-result-object v0

    return-object v0
.end method
