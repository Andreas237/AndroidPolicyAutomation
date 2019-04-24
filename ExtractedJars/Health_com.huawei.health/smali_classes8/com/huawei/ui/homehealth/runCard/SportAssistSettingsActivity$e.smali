.class Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;>;"
    }
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V
    .locals 1

    .line 479
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 480
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;->d:Ljava/lang/ref/WeakReference;

    .line 481
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Landroid/os/Message;)V
    .locals 2

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    .line 485
    if-eqz v1, :cond_0

    .line 486
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 488
    :pswitch_0
    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    .line 489
    goto :goto_0

    .line 491
    :pswitch_1
    const/16 v0, 0x70

    invoke-static {v1, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)V

    .line 492
    goto :goto_0

    .line 494
    :pswitch_2
    const/16 v0, 0x71

    invoke-static {v1, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)V

    .line 495
    .line 500
    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6f
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 476
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;->b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Landroid/os/Message;)V

    return-void
.end method
