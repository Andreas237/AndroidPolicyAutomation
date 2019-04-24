.class Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 1

    .line 516
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 517
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;->e:Ljava/lang/ref/WeakReference;

    .line 518
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 522
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    .line 524
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 525
    return-void

    .line 527
    :cond_0
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive message is: "

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

    .line 528
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 532
    :pswitch_0
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 533
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 534
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 535
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 536
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 537
    goto :goto_0

    .line 543
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 544
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 545
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 546
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 547
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 548
    goto :goto_0

    .line 554
    :pswitch_2
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 555
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;Ljava/lang/String;)V

    .line 556
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->finish()V

    .line 557
    goto :goto_0

    .line 563
    :pswitch_3
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 564
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 565
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 566
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 567
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 568
    invoke-static {v4}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 569
    .line 573
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
