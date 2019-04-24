.class Lo/dqi$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dqi;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dqi;


# direct methods
.method constructor <init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 747
    iput-object p1, p0, Lo/dqi$12;->d:Lo/dqi;

    iput-object p2, p0, Lo/dqi$12;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 750
    new-instance v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;-><init>()V

    .line 751
    iget-object v0, p0, Lo/dqi$12;->d:Lo/dqi;

    const-string v1, "custom.activity_reminder"

    invoke-virtual {v0, v1}, Lo/dqi;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 752
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 753
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminder on HiHealth is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lo/dqi$12;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 755
    iget-object v0, p0, Lo/dqi$12;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 757
    :cond_0
    return-void

    .line 759
    :cond_1
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivityReminder value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 761
    const-class v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-virtual {v6, v5, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    .line 762
    iget-object v0, p0, Lo/dqi$12;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 763
    iget-object v0, p0, Lo/dqi$12;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 765
    :cond_2
    return-void
.end method
