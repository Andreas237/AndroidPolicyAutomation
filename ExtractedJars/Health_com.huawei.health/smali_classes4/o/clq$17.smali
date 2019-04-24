.class Lo/clq$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Lo/clz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/clq;

.field final synthetic e:Lo/clz;


# direct methods
.method constructor <init>(Lo/clq;Lo/clz;)V
    .locals 0

    .line 1149
    iput-object p1, p0, Lo/clq$17;->c:Lo/clq;

    iput-object p2, p0, Lo/clq$17;->e:Lo/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1153
    iget-object v0, p0, Lo/clq$17;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1155
    :try_start_0
    iget-object v0, p0, Lo/clq$17;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    new-instance v1, Lo/clq$17$4;

    invoke-direct {v1, p0, v4, v5}, Lo/clq$17$4;-><init>(Lo/clq$17;J)V

    invoke-interface {v0, v1}, Lo/clg;->e(Lo/cla;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1173
    goto :goto_0

    .line 1169
    :catch_0
    move-exception v6

    .line 1170
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    iget-object v0, p0, Lo/clq$17;->e:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1172
    iget-object v0, p0, Lo/clq$17;->e:Lo/clz;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1174
    :cond_0
    :goto_0
    return-void
.end method
