.class Lcom/huawei/bone/social/manager/service/SocialSyncService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/manager/service/SocialSyncService;->d(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/social/manager/service/SocialSyncService;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/manager/service/SocialSyncService;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$1;->d:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 203
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncTypeSyncLikeProcess syncLikeById onSuccess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void
.end method

.method public b()V
    .locals 0

    .line 214
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 219
    return-void
.end method

.method public e()V
    .locals 4

    .line 208
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncTypeSyncLikeProcess syncLikeById onFailure!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void
.end method
