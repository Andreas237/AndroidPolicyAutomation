.class public final Lo/baa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/baa;


# instance fields
.field private a:I

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private e:Lo/azy;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/baa;->c:Ljava/util/Map;

    .line 55
    const/16 v0, 0x10e

    iput v0, p0, Lo/baa;->a:I

    .line 60
    new-instance v0, Lo/azy;

    invoke-direct {v0}, Lo/azy;-><init>()V

    iput-object v0, p0, Lo/baa;->e:Lo/azy;

    .line 82
    return-void
.end method

.method private b()J
    .locals 6

    .line 177
    iget-object v0, p0, Lo/baa;->e:Lo/azy;

    invoke-virtual {v0}, Lo/azy;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-double v4, v0

    .line 178
    double-to-long v0, v4

    return-wide v0
.end method

.method private c(Landroid/net/NetworkInfo;)V
    .locals 2

    .line 128
    if-nez p1, :cond_0

    .line 130
    return-void

    .line 133
    :cond_0
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    .line 134
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 137
    const/16 v0, 0x10e

    iput v0, p0, Lo/baa;->a:I

    goto :goto_0

    .line 139
    :cond_1
    if-nez v1, :cond_2

    .line 142
    const/16 v0, 0x10e

    iput v0, p0, Lo/baa;->a:I

    .line 144
    :cond_2
    :goto_0
    return-void
.end method

.method public static declared-synchronized e()Lo/baa;
    .locals 3

    const-class v1, Lo/baa;

    monitor-enter v1

    .line 69
    :try_start_0
    sget-object v0, Lo/baa;->b:Lo/baa;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Lo/baa;

    invoke-direct {v0}, Lo/baa;-><init>()V

    sput-object v0, Lo/baa;->b:Lo/baa;

    .line 73
    :cond_0
    sget-object v0, Lo/baa;->b:Lo/baa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()J
    .locals 5

    .line 164
    invoke-direct {p0}, Lo/baa;->b()J

    move-result-wide v3

    .line 165
    const-string v0, "DynamicPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPingTimeout():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    return-wide v3
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 86
    iget-object v0, p0, Lo/baa;->c:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    return-void
.end method

.method public c(ZI)J
    .locals 6

    .line 190
    if-eqz p1, :cond_0

    .line 192
    const-string v0, "DynamicPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPacketTimeout("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",largePacket:true"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-wide/16 v0, 0x2710

    return-wide v0

    .line 196
    :cond_0
    const-wide/16 v4, 0x2710

    .line 197
    if-gtz p2, :cond_1

    .line 200
    invoke-direct {p0}, Lo/baa;->b()J

    move-result-wide v4

    goto :goto_0

    .line 202
    :cond_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 204
    const-wide/16 v0, 0x4e20

    const-wide/16 v2, 0x2710

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    goto :goto_0

    .line 206
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 208
    const-wide/32 v0, 0x9c40

    const-wide/16 v2, 0x2710

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 210
    :cond_3
    :goto_0
    const-string v0, "DynamicPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPacketTimeout("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",largePacket:false"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    return-wide v4
.end method

.method public c()V
    .locals 3

    .line 114
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 115
    invoke-static {v1}, Lo/bpl;->c(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v2

    .line 116
    invoke-direct {p0, v2}, Lo/baa;->c(Landroid/net/NetworkInfo;)V

    .line 118
    iget-object v0, p0, Lo/baa;->e:Lo/azy;

    invoke-virtual {v0}, Lo/azy;->c()V

    .line 119
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lo/baa;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    return-void
.end method

.method public d()I
    .locals 1

    .line 153
    iget v0, p0, Lo/baa;->a:I

    .line 154
    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 7

    .line 91
    iget-object v0, p0, Lo/baa;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Long;

    .line 92
    if-eqz v4, :cond_0

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 95
    iget-object v0, p0, Lo/baa;->e:Lo/azy;

    invoke-virtual {v0, v5, v6}, Lo/azy;->b(J)V

    .line 97
    :cond_0
    return-void
.end method
