.class Lo/clq$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->b(Ljava/util/List;Lo/clz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lo/clq;

.field final synthetic e:Lo/clz;


# direct methods
.method constructor <init>(Lo/clq;Ljava/util/List;Lo/clz;)V
    .locals 0

    .line 1073
    iput-object p1, p0, Lo/clq$20;->b:Lo/clq;

    iput-object p2, p0, Lo/clq$20;->a:Ljava/util/List;

    iput-object p3, p0, Lo/clq$20;->e:Lo/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1076
    iget-object v0, p0, Lo/clq$20;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1078
    :try_start_0
    iget-object v0, p0, Lo/clq$20;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$20;->a:Ljava/util/List;

    new-instance v2, Lo/clq$20$5;

    invoke-direct {v2, p0}, Lo/clq$20$5;-><init>(Lo/clq$20;)V

    invoke-interface {v0, v1, v2}, Lo/clg;->b(Ljava/util/List;Lo/cla;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1095
    goto :goto_0

    .line 1091
    :catch_0
    move-exception v4

    .line 1092
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    iget-object v0, p0, Lo/clq$20;->e:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1094
    iget-object v0, p0, Lo/clq$20;->e:Lo/clz;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1096
    :cond_0
    :goto_0
    return-void
.end method
