.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 196
    if-nez p1, :cond_2

    .line 197
    if-nez p2, :cond_0

    .line 198
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get userinfo success but obtain null objData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void

    .line 201
    :cond_0
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get userinfo succes "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 203
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 204
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 210
    :cond_2
    return-void
.end method
