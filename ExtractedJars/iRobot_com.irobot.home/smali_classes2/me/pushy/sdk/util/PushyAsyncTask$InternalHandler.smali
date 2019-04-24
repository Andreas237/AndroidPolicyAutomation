.class Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/util/PushyAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InternalHandler"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/pushy/sdk/util/PushyAsyncTask$1;)V
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/util/PushyAsyncTask$InternalHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;

    iget p1, p1, Landroid/os/Message;->what:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, v0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mTask:Lme/pushy/sdk/util/PushyAsyncTask;

    iget-object v0, v0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mData:[Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lme/pushy/sdk/util/PushyAsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object p1, v0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mTask:Lme/pushy/sdk/util/PushyAsyncTask;

    iget-object v0, v0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mData:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Lme/pushy/sdk/util/PushyAsyncTask;->access$500(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
