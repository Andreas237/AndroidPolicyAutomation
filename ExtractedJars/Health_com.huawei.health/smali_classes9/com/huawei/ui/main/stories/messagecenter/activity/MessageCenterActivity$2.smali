.class Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 227
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 228
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 230
    :pswitch_0
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$100(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;Ljava/util/List;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$200(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;Ljava/util/List;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$300(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    .line 235
    goto :goto_0

    .line 237
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$400(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$300(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    .line 239
    goto :goto_0

    .line 241
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;->a:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$300(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    .line 242
    .line 246
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
