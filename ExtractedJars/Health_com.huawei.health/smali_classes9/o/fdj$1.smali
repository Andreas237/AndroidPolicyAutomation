.class Lo/fdj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdj;->e(Landroid/content/Context;JJILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/fdj;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/fdj;JLo/egg;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lo/fdj$1;->b:Lo/fdj;

    iput-wide p2, p0, Lo/fdj$1;->a:J

    iput-object p4, p0, Lo/fdj$1;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 568
    invoke-static {}, Lo/fdj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readBloodsugarData time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/fdj$1;->a:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 570
    iget-object v0, p0, Lo/fdj$1;->b:Lo/fdj;

    iget-object v1, p0, Lo/fdj$1;->e:Lo/egg;

    invoke-static {v0, v6, v1}, Lo/fdj;->d(Lo/fdj;Ljava/util/List;Lo/egg;)V

    .line 571
    return-void
.end method
