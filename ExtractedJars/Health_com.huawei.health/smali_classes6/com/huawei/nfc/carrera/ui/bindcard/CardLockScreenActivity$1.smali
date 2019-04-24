.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->jumpToActivity()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 280
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " jumpToActivity \u524d status  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v3, v3, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 283
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1}, Lcom/huawei/nfc/PluginPayAdapter;->getLockscreenStatus()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 284
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$102(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Z)Z

    goto :goto_0

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$102(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Z)Z

    goto :goto_0

    .line 289
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$102(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Z)Z

    .line 291
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1}, Lcom/huawei/nfc/PluginPayAdapter;->getLockscreenStatus()I

    move-result v1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    if-nez v0, :cond_2

    .line 294
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 295
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 296
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 298
    const-string v0, "AddBankOrBusCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "BindCardActivity"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 299
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 301
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 305
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 308
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 310
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 311
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 313
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 315
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 322
    :cond_8
    :goto_1
    return-void
.end method
