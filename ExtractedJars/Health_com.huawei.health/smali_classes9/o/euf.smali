.class public Lo/euf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euc;


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private c:Lo/eud;

.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-class v0, Lo/euf;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/euf;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/euf;->c:Lo/eud;

    .line 25
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/euf;->d:Ljava/lang/ref/WeakReference;

    .line 26
    sget-object v0, Lo/euf;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lo/euf;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)V
    .locals 0

    .line 132
    return-void
.end method

.method public e(Lo/eug;)V
    .locals 5

    .line 55
    iget-object v0, p0, Lo/euf;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 56
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 57
    sget-object v0, Lo/euf;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQAccountPlugin Activity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-void

    .line 60
    :cond_0
    sget-object v0, Lo/euf;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v0, Lo/eud;

    new-instance v1, Lo/euf$4;

    invoke-direct {v1, p0, p1}, Lo/euf$4;-><init>(Lo/euf;Lo/eug;)V

    invoke-direct {v0, v4, v1}, Lo/eud;-><init>(Landroid/app/Activity;Lo/euh;)V

    iput-object v0, p0, Lo/euf;->c:Lo/eud;

    .line 119
    iget-object v0, p0, Lo/euf;->c:Lo/eud;

    invoke-virtual {v0}, Lo/eud;->e()V

    .line 120
    return-void
.end method
