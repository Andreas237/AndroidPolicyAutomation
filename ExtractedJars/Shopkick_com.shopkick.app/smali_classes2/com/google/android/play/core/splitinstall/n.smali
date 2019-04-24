.class final Lcom/google/android/play/core/splitinstall/n;
.super Ljava/lang/Object;


# static fields
.field private static final b:Lcom/google/android/play/core/internal/aa;

.field private static final c:Landroid/content/Intent;


# instance fields
.field final a:Lcom/google/android/play/core/internal/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/internal/m<",
            "Lcom/google/android/play/core/internal/av;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/google/android/play/core/internal/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/play/core/internal/aa;

    const-string v1, "SplitInstallService"

    invoke-direct {v0, v1}, Lcom/google/android/play/core/internal/aa;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lcom/google/android/play/core/splitinstall/n;->c:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/play/core/splitinstall/n;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/play/core/splitinstall/b;

    invoke-direct {v0, p0}, Lcom/google/android/play/core/splitinstall/b;-><init>(Lcom/google/android/play/core/splitinstall/n;)V

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/n;->f:Lcom/google/android/play/core/internal/q;

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/n;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/n;->e:Ljava/lang/String;

    new-instance p2, Lcom/google/android/play/core/internal/m;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v4, "SplitInstallService"

    sget-object v5, Lcom/google/android/play/core/splitinstall/n;->c:Landroid/content/Intent;

    sget-object v6, Lcom/google/android/play/core/splitinstall/o;->a:Lcom/google/android/play/core/internal/r;

    iget-object v7, p0, Lcom/google/android/play/core/splitinstall/n;->f:Lcom/google/android/play/core/internal/q;

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/play/core/internal/m;-><init>(Landroid/content/Context;Lcom/google/android/play/core/internal/aa;Ljava/lang/String;Landroid/content/Intent;Lcom/google/android/play/core/internal/r;Lcom/google/android/play/core/internal/q;)V

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/n;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/n;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lcom/google/android/play/core/splitinstall/n;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b()Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->e()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lcom/google/android/play/core/splitinstall/n;->c(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c()Lcom/google/android/play/core/internal/aa;
    .locals 1

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    return-object v0
.end method

.method private static c(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "language"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static d(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "module_name"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static e()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "playcore_version_code"

    const/16 v2, 0x2843

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "getSessionStates"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/t;

    invoke-direct {v2, p0, v0, v0}, Lcom/google/android/play/core/splitinstall/t;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Lcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)Lcom/google/android/play/core/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "getSessionState(%d)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/s;

    invoke-direct {v2, p0, v0, p1, v0}, Lcom/google/android/play/core/splitinstall/s;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;ILcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/Collection;Ljava/util/Collection;)Lcom/google/android/play/core/tasks/Task;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string/jumbo v1, "startInstall(%s,%s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/p;

    move-object v4, v2

    move-object v5, p0

    move-object v6, v0

    move-object v7, p1

    move-object v8, p2

    move-object v9, v0

    invoke-direct/range {v4 .. v9}, Lcom/google/android/play/core/splitinstall/p;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Ljava/util/Collection;Ljava/util/Collection;Lcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "deferredUninstall(%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/q;

    invoke-direct {v2, p0, v0, p1, v0}, Lcom/google/android/play/core/splitinstall/q;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Ljava/util/List;Lcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b(I)Lcom/google/android/play/core/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "cancelInstall(%d)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/u;

    invoke-direct {v2, p0, v0, p1, v0}, Lcom/google/android/play/core/splitinstall/u;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;ILcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "deferredInstall(%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/tasks/i;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/i;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    new-instance v2, Lcom/google/android/play/core/splitinstall/r;

    invoke-direct {v2, p0, v0, p1, v0}, Lcom/google/android/play/core/splitinstall/r;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Ljava/util/List;Lcom/google/android/play/core/tasks/i;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/l;)V

    invoke-virtual {v0}, Lcom/google/android/play/core/tasks/i;->a()Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d()V
    .locals 3

    sget-object v0, Lcom/google/android/play/core/splitinstall/n;->b:Lcom/google/android/play/core/internal/aa;

    const-string v1, "onBinderDied"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "session_id"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string/jumbo v1, "status"

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "error_code"

    const/16 v2, -0x9

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/n;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "session_state"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    const/high16 v0, 0x200000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/n;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
