.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OpenServiceHandler"
.end annotation


# instance fields
.field private final mActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/openservice/ui/OpenServiceActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 1

    .line 291
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 292
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->mActivity:Ljava/lang/ref/WeakReference;

    .line 293
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    .line 298
    if-nez v4, :cond_0

    .line 299
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 300
    return-void

    .line 302
    :cond_0
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 305
    :pswitch_0
    invoke-static {v4}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$1100(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    .line 306
    goto :goto_0

    .line 308
    :pswitch_1
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 309
    if-eqz v5, :cond_1

    instance-of v0, v5, Lcom/huawei/ui/openservice/db/model/OpenService;

    if-eqz v0, :cond_1

    .line 310
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    move-object v0, v5

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-static {v4, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$1200(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    goto :goto_0

    .line 315
    :pswitch_2
    invoke-static {v4}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$1300(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    .line 316
    goto :goto_0

    .line 318
    :pswitch_3
    invoke-static {v4}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$1400(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    .line 319
    .line 323
    :cond_1
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
