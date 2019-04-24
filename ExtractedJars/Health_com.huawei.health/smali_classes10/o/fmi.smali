.class public Lo/fmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmi$5;,
        Lo/fmi$a;
    }
.end annotation


# instance fields
.field private final b:Lo/fpo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo<Ljava/net/InetSocketAddress;Lo/fmm;>;"
        }
    .end annotation
.end field

.field private final c:Lo/fmw;

.field private final d:Ljava/util/Random;

.field private final e:Lo/fmi$a;


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 8

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    if-nez p1, :cond_0

    .line 79
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Config must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_0
    const/4 v5, 0x0

    .line 82
    sget-object v6, Lo/fmi$a;->e:Lo/fmi$a;

    .line 84
    const-string v0, "MID_TACKER"

    :try_start_0
    invoke-virtual {p1, v0}, Lo/fmw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 85
    invoke-static {v5}, Lo/fmi$a;->valueOf(Ljava/lang/String;)Lo/fmi$a;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v6

    .line 90
    goto :goto_0

    .line 86
    :catch_0
    move-exception v7

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tracker mode \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' not supported!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :catch_1
    move-exception v7

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tracker mode not provided/configured!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :goto_0
    iput-object p1, p0, Lo/fmi;->c:Lo/fmw;

    .line 92
    iput-object v6, p0, Lo/fmi;->e:Lo/fmi$a;

    .line 93
    const-string v0, "USE_RANDOM_MID_START"

    invoke-virtual {p1, v0}, Lo/fmw;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    iput-object v0, p0, Lo/fmi;->d:Ljava/util/Random;

    goto :goto_1

    .line 96
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fmi;->d:Ljava/util/Random;

    .line 99
    :goto_1
    new-instance v0, Lo/fpo;

    const-string v1, "MAX_ACTIVE_PEERS"

    const v2, 0x249f0

    invoke-virtual {p1, v1, v2}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "MAX_PEER_INACTIVITY_PERIOD"

    const-wide/16 v3, 0x258

    invoke-virtual {p1, v2, v3, v4}, Lo/fmw;->b(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lo/fpo;-><init>(IJ)V

    iput-object v0, p0, Lo/fmi;->b:Lo/fpo;

    .line 101
    return-void
.end method

.method private declared-synchronized e(Ljava/net/InetSocketAddress;)Lo/fmm;
    .locals 4

    monitor-enter p0

    .line 116
    :try_start_0
    iget-object v0, p0, Lo/fmi;->b:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fmm;

    .line 117
    if-nez v2, :cond_2

    .line 119
    iget-object v0, p0, Lo/fmi;->d:Ljava/util/Random;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fmi;->d:Ljava/util/Random;

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    .line 120
    :goto_0
    sget-object v0, Lo/fmi$5;->d:[I

    iget-object v1, p0, Lo/fmi;->e:Lo/fmi$a;

    invoke-virtual {v1}, Lo/fmi$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 122
    :pswitch_0
    new-instance v2, Lo/fmn;

    invoke-direct {v2, v3}, Lo/fmn;-><init>(I)V

    .line 123
    goto :goto_2

    .line 125
    :pswitch_1
    new-instance v2, Lo/fmk;

    iget-object v0, p0, Lo/fmi;->c:Lo/fmw;

    invoke-direct {v2, v3, v0}, Lo/fmk;-><init>(ILo/fmw;)V

    .line 126
    goto :goto_2

    .line 129
    :goto_1
    :pswitch_2
    new-instance v2, Lo/fmh;

    iget-object v0, p0, Lo/fmi;->c:Lo/fmw;

    invoke-direct {v2, v3, v0}, Lo/fmh;-><init>(ILo/fmw;)V

    .line 132
    :goto_2
    iget-object v0, p0, Lo/fmi;->b:Lo/fpo;

    invoke-virtual {v0, p1, v2}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    monitor-exit p0

    return-object v2

    .line 135
    :cond_1
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_2
    monitor-exit p0

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public d(Ljava/net/InetSocketAddress;)I
    .locals 2

    .line 105
    invoke-direct {p0, p1}, Lo/fmi;->e(Ljava/net/InetSocketAddress;)Lo/fmm;

    move-result-object v1

    .line 106
    if-nez v1, :cond_0

    .line 109
    const/4 v0, -0x1

    return v0

    .line 111
    :cond_0
    invoke-interface {v1}, Lo/fmm;->d()I

    move-result v0

    return v0
.end method
