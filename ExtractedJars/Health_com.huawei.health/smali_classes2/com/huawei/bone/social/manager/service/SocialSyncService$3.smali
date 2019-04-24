.class Lcom/huawei/bone/social/manager/service/SocialSyncService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/manager/service/SocialSyncService;->b(Landroid/database/Cursor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic e:Lcom/huawei/bone/social/manager/service/SocialSyncService;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/manager/service/SocialSyncService;I)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    iput p2, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 148
    iget-object v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    .line 149
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll syncLikeById sucess sync finished count mSyncFinshCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v3}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    move-result v0

    iget v1, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->c:I

    if-ne v0, v1, :cond_0

    .line 151
    const/16 v0, 0x65

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(I)I

    .line 153
    :cond_0
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll syncLikeById sucess sync status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    return-void
.end method

.method public b()V
    .locals 0

    .line 169
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 174
    return-void
.end method

.method public e()V
    .locals 4

    .line 158
    iget-object v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    .line 159
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll syncLikeById fail sync finished count mSyncFinshCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v3}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->e:Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I

    move-result v0

    iget v1, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;->c:I

    if-ne v0, v1, :cond_0

    .line 161
    const/16 v0, 0x65

    invoke-static {v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(I)I

    .line 163
    :cond_0
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll syncLikeById fail sync status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return-void
.end method
