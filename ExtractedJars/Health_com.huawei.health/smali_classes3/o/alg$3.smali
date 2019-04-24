.class final Lo/alg$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alg;->a(Landroid/content/Context;)Lcom/huawei/account/aidl/AccountAidlInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/huawei/account/aidl/AccountAidlInfo;

.field final synthetic d:Lo/vd;

.field final synthetic e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>([Lcom/huawei/account/aidl/AccountAidlInfo;Lo/vd;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/alg$3;->a:[Lcom/huawei/account/aidl/AccountAidlInfo;

    iput-object p2, p0, Lo/alg$3;->d:Lo/vd;

    iput-object p3, p0, Lo/alg$3;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 50
    if-nez p1, :cond_0

    .line 51
    const-string v0, "Login_AccountInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isWearLogined  bindRemoteService = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lo/alg$3;->a:[Lcom/huawei/account/aidl/AccountAidlInfo;

    iget-object v1, p0, Lo/alg$3;->d:Lo/vd;

    invoke-virtual {v1}, Lo/vd;->b()Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lo/alg$3;->a:[Lcom/huawei/account/aidl/AccountAidlInfo;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 58
    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/alg$3;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_1

    .line 59
    :catch_0
    move-exception v4

    .line 60
    iget-object v0, p0, Lo/alg$3;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 63
    :goto_1
    return-void
.end method
