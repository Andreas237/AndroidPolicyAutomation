.class Lcom/huawei/ui/main/stories/history/SportHistoryActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/SportHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$2;->e:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 297
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 298
    iget v0, p1, Landroid/os/Message;->what:I

    nop

    .line 302
    return-void
.end method
