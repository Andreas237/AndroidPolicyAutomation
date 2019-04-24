.class public final Lo/frb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/frf;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Lo/frb;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frb;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/frb;->b:Ljava/util/List;

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/frf;>;)V"
        }
    .end annotation

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/frb;->b:Ljava/util/List;

    .line 62
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 63
    return-void
.end method

.method public static a([BLjava/net/InetSocketAddress;)Lo/frb;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 123
    new-instance v5, Lo/fpq;

    invoke-direct {v5, p0}, Lo/fpq;-><init>([B)V

    .line 124
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 126
    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 128
    :goto_0
    if-lez v7, :cond_1

    .line 129
    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 130
    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 131
    invoke-virtual {v5, v9}, Lo/fpq;->d(I)[B

    move-result-object v10

    .line 132
    invoke-static {v8, v10, p1}, Lo/frf;->c(I[BLjava/net/InetSocketAddress;)Lo/frf;

    move-result-object v11

    .line 134
    if-eqz v11, :cond_0

    .line 135
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 137
    :cond_0
    sget-object v0, Lo/frb;->c:Lo/fty;

    const-string v1, "Peer included an unknown extension type code [{}] in its Hello message"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    :goto_1
    add-int/lit8 v0, v9, 0x4

    sub-int/2addr v7, v0

    .line 146
    goto :goto_0

    .line 148
    :cond_1
    if-gez v7, :cond_2

    .line 151
    new-instance v0, Lo/fqx;

    const-string v1, "Hello message contained malformed extensions"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->r:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 155
    :cond_2
    new-instance v0, Lo/frb;

    invoke-direct {v0, v6}, Lo/frb;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 81
    const/4 v1, 0x0

    .line 82
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/frf;

    .line 83
    invoke-virtual {v3}, Lo/frf;->b()I

    move-result v0

    add-int/2addr v1, v0

    .line 84
    goto :goto_0

    .line 86
    :cond_0
    return v1
.end method

.method public c()[B
    .locals 5

    .line 108
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 111
    :cond_0
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 113
    invoke-virtual {p0}, Lo/frb;->a()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 114
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/frf;

    .line 115
    invoke-virtual {v4}, Lo/frf;->d()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 116
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method final d(Lo/frf$b;)Lo/frf;
    .locals 3

    .line 167
    if-eqz p1, :cond_1

    .line 168
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/frf;

    .line 169
    invoke-virtual {v2}, Lo/frf;->e()Lo/frf$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/frf$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    return-object v2

    .line 172
    :cond_0
    goto :goto_0

    .line 174
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lo/frf;)V
    .locals 1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    .line 73
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    const-string v0, "\t\tExtensions Length: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/frb;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    iget-object v0, p0, Lo/frb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/frf;

    .line 100
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
