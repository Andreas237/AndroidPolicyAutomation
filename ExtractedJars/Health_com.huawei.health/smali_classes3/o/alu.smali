.class public Lo/alu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/alu;


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/als;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Lo/alu;

    invoke-direct {v0}, Lo/alu;-><init>()V

    sput-object v0, Lo/alu;->e:Lo/alu;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/alu;->c:Ljava/util/List;

    .line 48
    iget-object v0, p0, Lo/alu;->c:Ljava/util/List;

    invoke-static {v0}, Lo/alu;->d(Ljava/util/List;)V

    .line 49
    return-void
.end method

.method private a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 100
    invoke-static {p1}, Lo/amy;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 102
    const-string v0, "UNSETED"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    const-string v0, "plugin_device_preferences_settings"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 106
    const-string v0, "plugin_device_last_time_and_this_time"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 107
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 108
    const-string v2, "v1"

    .line 112
    :cond_0
    const-string v0, "UNSETED"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-static {p1}, Lo/amy;->g(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 115
    if-eqz v4, :cond_2

    .line 116
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    aget-object v0, v4, v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    aget-object v0, v4, v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    const/4 v3, 0x0

    goto :goto_0

    .line 119
    :cond_1
    const/4 v3, 0x1

    .line 123
    :cond_2
    :goto_0
    invoke-static {p1}, Lo/amy;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    if-ne v3, v0, :cond_4

    .line 128
    :cond_3
    const-string v2, "v2_preview"

    .line 131
    :cond_4
    return-object v2
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 63
    sget-object v0, Lo/alu;->e:Lo/alu;

    const-string v1, "Athene4"

    invoke-virtual {v0, p0, v1}, Lo/alu;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 65
    invoke-static {}, Lo/alw;->a()V

    .line 66
    return-void
.end method

.method static d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/als;>;)V"
        }
    .end annotation

    .line 24
    new-instance v0, Lo/alr;

    invoke-direct {v0}, Lo/alr;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v0, Lo/alv;

    invoke-direct {v0}, Lo/alv;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v0, Lo/ama;

    invoke-direct {v0}, Lo/ama;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v0, Lo/alw;

    invoke-direct {v0}, Lo/alw;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance v0, Lo/alz;

    invoke-direct {v0}, Lo/alz;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    new-instance v0, Lo/alu$5;

    invoke-direct {v0}, Lo/alu$5;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 70
    invoke-direct {p0, p1}, Lo/alu;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 73
    const-string v0, "UNSETED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    invoke-static {p1, p2}, Lo/amy;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 75
    return-void

    .line 77
    :cond_0
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    return-void

    .line 81
    :cond_1
    const-string v0, "Step_MigrationManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrate begin from:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    :goto_0
    invoke-direct {p0, p1}, Lo/alu;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    goto :goto_3

    .line 88
    :cond_2
    iget-object v0, p0, Lo/alu;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/als;

    .line 89
    invoke-interface {v6, v4}, Lo/als;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 90
    invoke-interface {v6, p1}, Lo/als;->d(Landroid/content/Context;)V

    .line 91
    goto :goto_2

    .line 93
    :cond_3
    goto :goto_1

    :cond_4
    :goto_2
    goto :goto_0

    .line 95
    :goto_3
    const-string v0, "Step_MigrationManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrate end at:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void
.end method
