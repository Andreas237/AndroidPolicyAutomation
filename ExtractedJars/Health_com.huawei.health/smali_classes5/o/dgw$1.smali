.class Lo/dgw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw;->c(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dgw;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 845
    iput-object p1, p0, Lo/dgw$1;->d:Lo/dgw;

    iput-object p2, p0, Lo/dgw$1;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 848
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 849
    :cond_0
    iget-object v0, p0, Lo/dgw$1;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 850
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTimeHeartRateData no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 852
    :cond_1
    iget-object v0, p0, Lo/dgw$1;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 853
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTimeHeartRateData hasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    :goto_0
    return-void
.end method
