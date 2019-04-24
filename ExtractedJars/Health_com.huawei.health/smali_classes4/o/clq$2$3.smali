.class Lo/clq$2$3;
.super Lo/clh$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:[Ljava/lang/Object;

.field final synthetic d:[I

.field final synthetic e:Lo/clq$2;


# direct methods
.method constructor <init>(Lo/clq$2;[I[Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 552
    iput-object p1, p0, Lo/clq$2$3;->e:Lo/clq$2;

    iput-object p2, p0, Lo/clq$2$3;->d:[I

    iput-object p3, p0, Lo/clq$2$3;->b:[Ljava/lang/Object;

    iput-object p4, p0, Lo/clq$2$3;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Lo/clh$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 556
    if-eqz p1, :cond_0

    .line 557
    iget-object v0, p0, Lo/clq$2$3;->d:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 558
    iget-object v0, p0, Lo/clq$2$3;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 560
    :cond_0
    iget-object v0, p0, Lo/clq$2$3;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 561
    return-void
.end method
