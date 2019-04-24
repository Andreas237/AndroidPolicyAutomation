.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Landroid/os/Looper;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$5;->b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 269
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$5;->b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Landroid/os/Message;)V

    .line 271
    return-void
.end method
