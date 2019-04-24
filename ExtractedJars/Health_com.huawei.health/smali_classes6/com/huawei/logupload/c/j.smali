.class Lcom/huawei/logupload/c/j;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lcom/huawei/logupload/LogUpload;


# direct methods
.method constructor <init>(Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/c/j;->a:Lcom/huawei/logupload/LogUpload;

    .line 1098
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1101
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u5ef6\u8fdf3S\u6267\u884c\u5224\u65ad\u5173\u95ed\u7ebf\u7a0b\u7684\u65b9\u6cd5"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1102
    const-wide/16 v0, 0xbb8

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1103
    goto :goto_0

    :catch_0
    move-exception v3

    .line 1104
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "task : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1106
    :goto_0
    new-instance v3, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 1107
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1108
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1109
    const-string v0, "packagename"

    iget-object v1, p0, Lcom/huawei/logupload/c/j;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1110
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1111
    invoke-virtual {v3, v4}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 1113
    return-void
.end method
