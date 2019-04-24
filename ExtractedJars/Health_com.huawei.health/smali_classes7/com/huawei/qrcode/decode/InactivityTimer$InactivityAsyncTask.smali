.class final Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/decode/InactivityTimer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "InactivityAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/decode/InactivityTimer;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/decode/InactivityTimer;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;->this$0:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/decode/InactivityTimer;Lcom/huawei/qrcode/decode/InactivityTimer$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;-><init>(Lcom/huawei/qrcode/decode/InactivityTimer;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-wide/32 v0, 0x493e0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, Lcom/huawei/qrcode/decode/InactivityTimer;->access$300()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Finishing activity due to inactivity"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;->this$0:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-static {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->access$400(Lcom/huawei/qrcode/decode/InactivityTimer;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {}, Lcom/huawei/qrcode/decode/InactivityTimer;->access$300()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InactivityAsyncTask InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
