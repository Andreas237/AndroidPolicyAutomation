.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 381
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 382
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Landroid/os/Message;)V
    .locals 6

    .line 386
    iget v4, p2, Landroid/os/Message;->arg1:I

    .line 387
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UserPoneCounterHandlerr handleMessageWhenReferenceNotNull() resultType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 391
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 392
    invoke-virtual {p1, v5}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a(Z)V

    .line 393
    goto :goto_0

    .line 396
    :pswitch_1
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e()V

    .line 398
    goto :goto_0

    .line 400
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    .line 401
    .line 406
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 378
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$b;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Landroid/os/Message;)V

    return-void
.end method
