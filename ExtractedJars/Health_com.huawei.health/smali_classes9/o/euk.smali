.class public Lo/euk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euc;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private b:Lo/etz;

.field private final c:Ljava/lang/ref/WeakReference;
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
    const-class v0, Lo/euk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/euk;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/euk;->c:Ljava/lang/ref/WeakReference;

    .line 29
    sget-object v0, Lo/euk;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lo/euk;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)V
    .locals 0

    .line 133
    return-void
.end method

.method public e(Lo/eug;)V
    .locals 6

    .line 54
    iget-object v0, p0, Lo/euk;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 55
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 56
    sget-object v0, Lo/euk;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyOnWheelChangedListener UserInfoActivity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void

    .line 59
    :cond_0
    new-instance v0, Lo/etz;

    new-instance v1, Lo/euk$3;

    invoke-direct {v1, p0, p1}, Lo/euk$3;-><init>(Lo/euk;Lo/eug;)V

    invoke-direct {v0, v4, v1}, Lo/etz;-><init>(Landroid/app/Activity;Lo/euh;)V

    iput-object v0, p0, Lo/euk;->b:Lo/etz;

    .line 117
    iget-object v0, p0, Lo/euk;->b:Lo/etz;

    invoke-virtual {v0}, Lo/etz;->b()Z

    move-result v5

    .line 118
    if-eqz v5, :cond_1

    .line 119
    iget-object v0, p0, Lo/euk;->b:Lo/etz;

    invoke-virtual {v0}, Lo/etz;->a()V

    goto :goto_0

    .line 121
    :cond_1
    const-string v0, "weiXin app ERR_NOT_INSTALLED"

    const/16 v1, 0x8

    invoke-interface {p1, v1, v0}, Lo/eug;->b(ILjava/lang/String;)V

    .line 123
    :goto_0
    return-void
.end method
