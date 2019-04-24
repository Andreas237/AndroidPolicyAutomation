.class Lo/cnw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnw;->e(Ljava/util/List;Lo/crd;Lo/csk;Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/crd;

.field final synthetic b:I

.field final synthetic c:Lo/csk;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:J

.field final synthetic k:Lo/cnw;


# direct methods
.method constructor <init>(Lo/cnw;Lo/csk;ILjava/util/List;Lo/crd;J)V
    .locals 0

    .line 528
    iput-object p1, p0, Lo/cnw$2;->k:Lo/cnw;

    iput-object p2, p0, Lo/cnw$2;->c:Lo/csk;

    iput p3, p0, Lo/cnw$2;->b:I

    iput-object p4, p0, Lo/cnw$2;->d:Ljava/util/List;

    iput-object p5, p0, Lo/cnw$2;->a:Lo/crd;

    iput-wide p6, p0, Lo/cnw$2;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 531
    iget-object v0, p0, Lo/cnw$2;->c:Lo/csk;

    iget v1, p0, Lo/cnw$2;->b:I

    iget-object v2, p0, Lo/cnw$2;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lo/csk;->a(ILjava/util/List;)V

    .line 532
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertBackground() hiContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnw$2;->a:Lo/crd;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", healthAppId is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cnw$2;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", time = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnw$2;->e:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void
.end method
