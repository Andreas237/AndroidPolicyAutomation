.class Lo/yv$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/zl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yv$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/yv$3;

.field private final synthetic e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lo/yv$3;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/yv$3$4;->a:Lo/yv$3;

    iput-object p2, p0, Lo/yv$3$4;->e:Ljava/util/concurrent/CountDownLatch;

    .line 1454
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1475
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onCallBackFail(int code) code-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 1476
    iget-object v0, p0, Lo/yv$3$4;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1477
    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1459
    const-string v0, "HwGrsTest onCallBackSuccess(String url)."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1460
    invoke-static {p1}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1462
    const-string v0, "getUrls is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1463
    goto :goto_0

    .line 1466
    :cond_0
    iget-object v0, p0, Lo/yv$3$4;->a:Lo/yv$3;

    invoke-static {v0}, Lo/yv$3;->c(Lo/yv$3;)Lo/yv;

    move-result-object v0

    invoke-static {v0, p1}, Lo/yv;->d(Lo/yv;Ljava/util/Map;)V

    .line 1467
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrls--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1469
    :goto_0
    iget-object v0, p0, Lo/yv$3$4;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1470
    return-void
.end method
