.class Lo/clq$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/clq;

.field final synthetic c:Lcom/huawei/hihealth/HiSyncOption;

.field final synthetic d:Lo/clz;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V
    .locals 0

    .line 1052
    iput-object p1, p0, Lo/clq$14;->b:Lo/clq;

    iput-object p2, p0, Lo/clq$14;->c:Lcom/huawei/hihealth/HiSyncOption;

    iput-object p3, p0, Lo/clq$14;->d:Lo/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1055
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1056
    iget-object v0, p0, Lo/clq$14;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1058
    :try_start_0
    iget-object v0, p0, Lo/clq$14;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$14;->c:Lcom/huawei/hihealth/HiSyncOption;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/clg;->e(Lcom/huawei/hihealth/HiSyncOption;Lo/cla;)V

    .line 1059
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCloud cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1064
    goto :goto_0

    .line 1060
    :catch_0
    move-exception v6

    .line 1061
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCloud e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    iget-object v0, p0, Lo/clq$14;->d:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1063
    iget-object v0, p0, Lo/clq$14;->d:Lo/clz;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1066
    :cond_0
    :goto_0
    return-void
.end method
