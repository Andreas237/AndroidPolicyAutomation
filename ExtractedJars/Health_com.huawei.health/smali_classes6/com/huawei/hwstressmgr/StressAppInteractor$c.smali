.class Lcom/huawei/hwstressmgr/StressAppInteractor$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwstressmgr/StressAppInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hwstressmgr/StressAppInteractor;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/os/Looper;Lcom/huawei/hwstressmgr/StressAppInteractor;)V
    .locals 1

    .line 807
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 808
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->c:Ljava/lang/ref/WeakReference;

    .line 809
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Looper;Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V
    .locals 0

    .line 802
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;-><init>(Landroid/os/Looper;Lcom/huawei/hwstressmgr/StressAppInteractor;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 813
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 815
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwstressmgr/StressAppInteractor;

    .line 817
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 819
    :pswitch_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, error is: 10001"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, aborted stress."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 822
    goto/16 :goto_1

    .line 824
    :pswitch_1
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, error is: 10002"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, aborted relax."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 827
    goto/16 :goto_1

    .line 829
    :pswitch_2
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, error is: 10003"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, aborted game."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 831
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 832
    goto/16 :goto_1

    .line 834
    :pswitch_3
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, error is: 10004"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, aborted calibration."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 837
    goto/16 :goto_1

    .line 839
    :pswitch_4
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, error is: 10005"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 840
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, received ONE callback from Wear app and Wear module."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStressErrorHandler, last received json to sent to H5 is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->k(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    invoke-static {v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 844
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send to h5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    invoke-static {v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->k(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 847
    invoke-static {v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->k(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    .line 848
    invoke-static {v4, v5}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lcom/huawei/hwstressmgr/StressAppInteractor;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 849
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 853
    :cond_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwstressmgr/StressAppInteractor;Z)Z

    .line 854
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v4, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 855
    goto :goto_1

    .line 857
    :goto_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, unknown error code"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
