.class Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setView(Ljava/lang/CharSequence;)V
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

    .line 175
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$1;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$1;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$000(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1002

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 180
    return-void
.end method
