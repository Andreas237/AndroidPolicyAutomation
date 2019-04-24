.class Lo/clq$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Lcom/huawei/hihealth/HiAccountInfo;Lo/clz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq;

.field final synthetic b:Lo/clz;

.field final synthetic e:Lcom/huawei/hihealth/HiAccountInfo;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiAccountInfo;Lo/clz;)V
    .locals 0

    .line 1117
    iput-object p1, p0, Lo/clq$16;->a:Lo/clq;

    iput-object p2, p0, Lo/clq$16;->e:Lcom/huawei/hihealth/HiAccountInfo;

    iput-object p3, p0, Lo/clq$16;->b:Lo/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1121
    iget-object v0, p0, Lo/clq$16;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1123
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    iget-object v0, p0, Lo/clq$16;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$16;->e:Lcom/huawei/hihealth/HiAccountInfo;

    new-instance v2, Lo/clq$16$5;

    invoke-direct {v2, p0, v4, v5}, Lo/clq$16$5;-><init>(Lo/clq$16;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->e(Lcom/huawei/hihealth/HiAccountInfo;Lo/cla;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1142
    goto :goto_0

    .line 1138
    :catch_0
    move-exception v6

    .line 1139
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1140
    iget-object v0, p0, Lo/clq$16;->b:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1141
    iget-object v0, p0, Lo/clq$16;->b:Lo/clz;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1143
    :cond_0
    :goto_0
    return-void
.end method
