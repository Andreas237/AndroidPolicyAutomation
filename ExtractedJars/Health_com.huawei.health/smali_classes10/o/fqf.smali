.class public abstract Lo/fqf;
.super Lo/frf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqf$e;
    }
.end annotation


# static fields
.field private static final e:Lo/fty;


# instance fields
.field private b:Z

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lo/fqf;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqf;->e:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/frf$b;Z)V
    .locals 1

    .line 76
    invoke-direct {p0, p1}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 77
    iput-boolean p2, p0, Lo/fqf;->b:Z

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    .line 79
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    return-object v0
.end method

.method public b()I
    .locals 2

    .line 106
    iget-boolean v0, p0, Lo/fqf;->b:Z

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    return v0

    .line 112
    :cond_0
    const/4 v0, 0x5

    return v0
.end method

.method public c(Lo/fqf$e;)V
    .locals 1

    .line 181
    iget-boolean v0, p0, Lo/fqf;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 183
    return-void

    .line 185
    :cond_0
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    return-void
.end method

.method protected d([B)V
    .locals 10

    .line 193
    new-instance v4, Lo/fpq;

    invoke-direct {v4, p1}, Lo/fpq;-><init>([B)V

    .line 194
    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 195
    :goto_0
    if-eqz v5, :cond_4

    .line 197
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 198
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_3

    .line 199
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 200
    invoke-static {v8}, Lo/fqf$e;->c(I)Lo/fqf$e;

    move-result-object v9

    .line 201
    if-eqz v9, :cond_1

    .line 202
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 206
    :cond_1
    sget-object v0, Lo/fqf;->e:Lo/fty;

    const-string v1, "Client indicated preference for unknown {} certificate type code [{}]"

    invoke-virtual {p0}, Lo/fqf;->e()Lo/frf$b;

    move-result-object v2

    sget-object v3, Lo/frf$b;->t:Lo/frf$b;

    invoke-virtual {v2, v3}, Lo/frf$b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "client"

    goto :goto_2

    :cond_2
    const-string v2, "server"

    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 211
    :cond_3
    goto :goto_5

    .line 213
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 214
    invoke-static {v6}, Lo/fqf$e;->c(I)Lo/fqf$e;

    move-result-object v7

    .line 215
    if-eqz v7, :cond_5

    .line 216
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 220
    :cond_5
    sget-object v0, Lo/fqf;->e:Lo/fty;

    const-string v1, "Server selected an unknown {} certificate type code [{0]"

    invoke-virtual {p0}, Lo/fqf;->e()Lo/frf$b;

    move-result-object v2

    sget-object v3, Lo/frf$b;->t:Lo/frf$b;

    invoke-virtual {v2, v3}, Lo/frf$b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "client"

    goto :goto_4

    :cond_6
    const-string v2, "server"

    :goto_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    :goto_5
    return-void
.end method

.method protected e(Lo/fpp;)V
    .locals 5

    .line 124
    iget-boolean v0, p0, Lo/fqf;->b:Z

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 129
    add-int/lit8 v0, v2, 0x1

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 131
    const/16 v0, 0x8

    invoke-virtual {p1, v2, v0}, Lo/fpp;->c(II)V

    .line 133
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqf$e;

    .line 134
    invoke-virtual {v4}, Lo/fqf$e;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 135
    goto :goto_0

    .line 136
    :cond_0
    goto :goto_1

    .line 138
    :cond_1
    const/4 v0, 0x1

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 139
    iget-object v0, p0, Lo/fqf;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fqf$e;

    invoke-virtual {v0}, Lo/fqf$e;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 141
    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 117
    invoke-super {p0}, Lo/frf;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
