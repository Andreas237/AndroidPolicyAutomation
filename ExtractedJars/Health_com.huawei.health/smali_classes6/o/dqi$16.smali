.class Lo/dqi$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dqi;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 828
    iput-object p1, p0, Lo/dqi$16;->d:Lo/dqi;

    iput-object p2, p0, Lo/dqi$16;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 831
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 832
    iget-object v0, p0, Lo/dqi$16;->d:Lo/dqi;

    const-string v1, "custom.wear_smart_alarm"

    invoke-virtual {v0, v1}, Lo/dqi;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 833
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 834
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSmartAlarm on HiHealth is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    iget-object v0, p0, Lo/dqi$16;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 836
    return-void

    .line 838
    :cond_0
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSmartAlarm value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 840
    new-instance v0, Lo/dqi$16$5;

    invoke-direct {v0, p0}, Lo/dqi$16$5;-><init>(Lo/dqi$16;)V

    .line 841
    invoke-virtual {v0}, Lo/dqi$16$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v7

    .line 842
    invoke-virtual {v6, v5, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 843
    iget-object v0, p0, Lo/dqi$16;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 844
    return-void
.end method
