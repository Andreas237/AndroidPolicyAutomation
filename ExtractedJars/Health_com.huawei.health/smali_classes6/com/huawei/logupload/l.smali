.class Lcom/huawei/logupload/l;
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
    iput-object p1, p0, Lcom/huawei/logupload/l;->a:Ljava/util/Timer;

    iput-object p2, p0, Lcom/huawei/logupload/l;->b:Lcom/huawei/logupload/LogUpload;

    .line 564
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 567
    iget-object v0, p0, Lcom/huawei/logupload/l;->a:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 568
    const-string v0, "LogUpload Service"

    const-string v1, "5\u5206\u949f\u540e\u91cd\u8bd5\u94fe\u63a5\u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 569
    iget-object v0, p0, Lcom/huawei/logupload/l;->b:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 570
    return-void
.end method
