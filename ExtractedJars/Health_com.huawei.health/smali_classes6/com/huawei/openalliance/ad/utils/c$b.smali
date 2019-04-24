.class Lcom/huawei/openalliance/ad/utils/c$b;
.super Ljava/lang/Object;

# interfaces
.implements Lo/cvm$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/utils/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/huawei/openalliance/ad/k/d$a;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/d$a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/c$b;->a:Lcom/huawei/openalliance/ad/k/d$a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/utils/c$b;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/utils/c$b;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/openalliance/ad/utils/c$b;->d:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/utils/c$b;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/c$b;->d:Ljava/lang/String;

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    if-ne v0, p2, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->g(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    if-ne v0, p2, :cond_2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->h(Ljava/lang/Integer;)V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/utils/c$b;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/utils/c$b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 2

    if-eqz p4, :cond_0

    invoke-interface {p4}, Lcom/huawei/openalliance/ad/k/d$a;->b()V

    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x2

    invoke-direct {p0, p3, v0, v1}, Lcom/huawei/openalliance/ad/utils/c$b;->a(Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Lcom/huawei/openalliance/ad/download/app/c;->c(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/c$b;->b:Landroid/content/Context;

    invoke-static {v0, p2, p1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/utils/c$b;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/c$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/utils/c$b;)Lcom/huawei/openalliance/ad/k/d$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/c$b;->a:Lcom/huawei/openalliance/ad/k/d$a;

    return-object v0
.end method

.method private d()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/utils/c$b$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/utils/c$b$1;-><init>(Lcom/huawei/openalliance/ad/utils/c$b;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "HsfPackageInstallResult"

    const-string v1, "onServiceBindFail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/c$b;->d()V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "HsfPackageInstallResult"

    const-string v1, "onInstallSuccess"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "HsfPackageInstallResult"

    const-string v1, "onInstallFailed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/c$b;->d()V

    return-void
.end method
