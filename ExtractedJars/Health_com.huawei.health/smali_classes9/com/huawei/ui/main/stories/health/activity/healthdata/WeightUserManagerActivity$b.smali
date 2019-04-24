.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 93
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Landroid/os/Message;)V
    .locals 4

    .line 97
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 99
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_1

    .line 104
    :goto_0
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :cond_0
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 89
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Landroid/os/Message;)V

    return-void
.end method
