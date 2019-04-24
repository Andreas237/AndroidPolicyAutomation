.class Lo/cas$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cas;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/cas;


# direct methods
.method private constructor <init>(Lo/cas;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/cas$b;->c:Lo/cas;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cas;Lo/cas$3;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lo/cas$b;-><init>(Lo/cas;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 89
    if-nez p2, :cond_0

    .line 90
    return-void

    .line 92
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 93
    if-nez v1, :cond_1

    .line 94
    return-void

    .line 96
    :cond_1
    iget-object v0, p0, Lo/cas$b;->c:Lo/cas;

    invoke-virtual {v0}, Lo/cas;->e()Lo/cat;

    move-result-object v2

    .line 98
    const-string v0, "com.huawei.health.WIDGET_ENABLE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    invoke-interface {v2}, Lo/cat;->a()V

    goto :goto_0

    .line 100
    :cond_2
    const-string v0, "com.huawei.health.WIDGET_DISABLE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    invoke-interface {v2}, Lo/cat;->b()V

    goto :goto_0

    .line 102
    :cond_3
    const-string v0, "com.huawei.health.WIDGET_FORCE_UPDATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    invoke-interface {v2}, Lo/cat;->c()V

    goto :goto_0

    .line 104
    :cond_4
    const-string v0, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 105
    invoke-interface {v2}, Lo/cat;->c()V

    goto :goto_0

    .line 106
    :cond_5
    const-string v0, "android.intent.action.WALLPAPER_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 107
    invoke-interface {v2}, Lo/cat;->d()V

    .line 110
    :cond_6
    :goto_0
    return-void
.end method
