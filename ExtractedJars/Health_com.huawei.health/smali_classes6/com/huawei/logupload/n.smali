.class Lcom/huawei/logupload/n;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Ljava/util/Timer;

.field private final synthetic b:Lcom/huawei/logupload/LogUpload;


# direct methods
.method constructor <init>(Ljava/util/Timer;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/n;->a:Ljava/util/Timer;

    iput-object p2, p0, Lcom/huawei/logupload/n;->b:Lcom/huawei/logupload/LogUpload;

    .line 1276
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1279
    iget-object v0, p0, Lcom/huawei/logupload/n;->a:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1280
    iget-object v0, p0, Lcom/huawei/logupload/n;->b:Lcom/huawei/logupload/LogUpload;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/LogUpload;->f(Z)V

    .line 1283
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/huawei/logupload/n;->b:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;I)V

    .line 1285
    iget-object v0, p0, Lcom/huawei/logupload/n;->b:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 1286
    return-void
.end method
