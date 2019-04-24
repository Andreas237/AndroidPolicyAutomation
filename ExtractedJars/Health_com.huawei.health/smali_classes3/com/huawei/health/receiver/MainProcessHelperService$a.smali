.class Lcom/huawei/health/receiver/MainProcessHelperService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/receiver/MainProcessHelperService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/receiver/MainProcessHelperService;


# direct methods
.method private constructor <init>(Lcom/huawei/health/receiver/MainProcessHelperService;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/health/receiver/MainProcessHelperService$a;->e:Lcom/huawei/health/receiver/MainProcessHelperService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/receiver/MainProcessHelperService;Lcom/huawei/health/receiver/MainProcessHelperService$5;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/receiver/MainProcessHelperService$a;-><init>(Lcom/huawei/health/receiver/MainProcessHelperService;)V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 60
    const-string v0, "MainProcessHelperService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    move-object v4, p2

    check-cast v4, Lo/dgu$e;

    .line 62
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/receiver/MainProcessHelperService$a;->e:Lcom/huawei/health/receiver/MainProcessHelperService;

    invoke-virtual {v1}, Lcom/huawei/health/receiver/MainProcessHelperService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 63
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, v4, Lo/dgu$e;->d:Ljava/lang/String;

    iget-object v2, v4, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1, v2}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 64
    return-void
.end method
