.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 1

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 103
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->d:Ljava/lang/ref/WeakReference;

    .line 104
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 108
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    .line 110
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 111
    return-void

    .line 113
    :cond_0
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleMessage():"

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

    .line 114
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 116
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    .line 117
    goto/16 :goto_0

    .line 119
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)Z

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 122
    goto/16 :goto_0

    .line 124
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)Z

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 127
    goto :goto_0

    .line 129
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)Z

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 133
    goto :goto_0

    .line 135
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eot;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eot;->c(Ljava/util/List;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eot;

    move-result-object v0

    invoke-virtual {v0}, Lo/eot;->notifyDataSetChanged()V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eop;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eot;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Lo/eop;Lo/eot;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    .line 139
    .line 143
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
