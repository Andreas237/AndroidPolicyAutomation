.class Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)V
    .locals 0

    .line 371
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iget-wide v2, v2, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mLastTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mLastTime:J

    .line 378
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$000(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 380
    :cond_0
    return-void
.end method
