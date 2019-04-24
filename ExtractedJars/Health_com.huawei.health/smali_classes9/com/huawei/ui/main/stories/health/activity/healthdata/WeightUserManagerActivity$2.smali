.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/up/callback/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 304
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$2;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 4

    .line 313
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toGetRemoteHeadImage get new headImg and name from cloud failure."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-void
.end method

.method public onSuccess(Landroid/os/Bundle;)V
    .locals 4

    .line 307
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toGetRemoteHeadImage get new headImg and name from cloud success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$2;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    .line 309
    return-void
.end method
