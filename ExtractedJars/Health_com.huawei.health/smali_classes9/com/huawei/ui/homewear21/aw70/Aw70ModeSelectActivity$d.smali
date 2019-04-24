.class Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 1

    .line 287
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 288
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 289
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    .line 294
    if-nez v4, :cond_0

    .line 295
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 296
    return-void

    .line 298
    :cond_0
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Handle Message is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 301
    :sswitch_0
    const/4 v0, 0x3

    invoke-static {v4, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V

    .line 302
    goto :goto_0

    .line 304
    :sswitch_1
    const/4 v0, 0x4

    invoke-static {v4, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V

    .line 305
    .line 309
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method
