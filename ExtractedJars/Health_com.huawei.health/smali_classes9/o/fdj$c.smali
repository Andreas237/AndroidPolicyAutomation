.class Lo/fdj$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fdj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/fdj;>;"
        }
    .end annotation
.end field

.field private b:J

.field private e:Lo/egg;


# direct methods
.method protected constructor <init>(Lo/fdj;JLo/egg;)V
    .locals 1

    .line 619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 620
    iput-wide p2, p0, Lo/fdj$c;->b:J

    .line 621
    iput-object p4, p0, Lo/fdj$c;->e:Lo/egg;

    .line 622
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/fdj$c;->a:Ljava/lang/ref/WeakReference;

    .line 623
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 625
    invoke-static {}, Lo/fdj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHeartRateData time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/fdj$c;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    iget-object v0, p0, Lo/fdj$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fdj;

    .line 627
    if-eqz v6, :cond_0

    .line 629
    iget-object v0, p0, Lo/fdj$c;->e:Lo/egg;

    invoke-static {v6, p2, v0}, Lo/fdj;->a(Lo/fdj;Ljava/lang/Object;Lo/egg;)V

    .line 631
    :cond_0
    return-void
.end method
