.class Lo/awj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->p()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/awj;


# direct methods
.method constructor <init>(Lo/awj;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lo/awj$2;->b:Lo/awj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 397
    invoke-virtual {p0, p1}, Lo/awj$2;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 5

    .line 401
    iget-object v0, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v0}, Lo/awj;->b(Lo/awj;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 403
    :try_start_0
    iget-object v0, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v0}, Lo/awj;->d(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    .line 406
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 409
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/awj$2;->b:Lo/awj;

    iget-object v1, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v1}, Lo/awj;->a(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lo/awj;->a(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 410
    const-string v0, "SettingManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "load self sns info from db userSNSInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v2}, Lo/awj;->d(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 411
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 413
    :goto_1
    iget-object v0, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v0}, Lo/awj;->d(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    if-nez v0, :cond_2

    .line 415
    iget-object v0, p0, Lo/awj$2;->b:Lo/awj;

    invoke-static {v0}, Lo/awj;->c(Lo/awj;)V

    .line 417
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
