.class Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/BaseCloudActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Lo/bui<TT;>;"
    }
.end annotation


# instance fields
.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic c:Lcom/huawei/health/suggestion/ui/BaseCloudActivity;

.field private d:Lo/bui;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bui<TT;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/BaseCloudActivity;Lo/bui;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<TT;>;)V"
        }
    .end annotation

    .line 117
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->c:Lcom/huawei/health/suggestion/ui/BaseCloudActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 118
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->d:Lo/bui;

    .line 119
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 120
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->e:Ljava/util/Timer;

    .line 121
    return-void
.end method

.method private a()V
    .locals 4

    .line 145
    const-string v0, "BaseCloudActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "complete()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    const-string v0, "BaseCloudActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "complete() !mIsComplete.getAndSet(true)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->c:Lcom/huawei/health/suggestion/ui/BaseCloudActivity;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->c(Lcom/huawei/health/suggestion/ui/BaseCloudActivity;I)V

    .line 150
    :cond_0
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->d:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 126
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->a()V

    .line 127
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->d:Lo/bui;

    invoke-virtual {v0, p1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 132
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;->a()V

    .line 133
    return-void
.end method
