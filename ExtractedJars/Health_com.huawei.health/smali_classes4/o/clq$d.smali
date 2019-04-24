.class Lo/clq$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1387
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/clq$4;)V
    .locals 0

    .line 1387
    invoke-direct {p0}, Lo/clq$d;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1391
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1392
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive intent = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1393
    return-void

    .line 1396
    :cond_0
    invoke-static {p1, p2}, Lo/cls;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1397
    return-void
.end method
