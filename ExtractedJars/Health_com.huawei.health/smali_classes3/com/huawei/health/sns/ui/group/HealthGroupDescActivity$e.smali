.class Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 1

    .line 103
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->e:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 104
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->d:Ljava/lang/ref/WeakReference;

    .line 105
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 109
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    .line 111
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    :cond_0
    return-void

    .line 114
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 116
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->e:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_desc_failed_keywords:I

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V

    .line 117
    goto :goto_0

    .line 119
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->e:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_info_modify_failed:I

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V

    .line 120
    goto :goto_0

    .line 122
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;->e:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    .line 123
    .line 127
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x354
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
