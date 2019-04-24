.class Lo/frd$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/frd$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/frl;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/frd$c;


# direct methods
.method constructor <init>(Lo/frd$c;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/frd$c$1;->e:Lo/frd$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 253
    move-object v0, p1

    check-cast v0, Lo/frl;

    move-object v1, p2

    check-cast v1, Lo/frl;

    invoke-virtual {p0, v0, v1}, Lo/frd$c$1;->d(Lo/frl;Lo/frl;)I

    move-result v0

    return v0
.end method

.method public d(Lo/frl;Lo/frl;)I
    .locals 4

    .line 258
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v0

    invoke-virtual {p2}, Lo/frl;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 259
    const/4 v0, -0x1

    return v0

    .line 260
    :cond_0
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v0

    invoke-virtual {p2}, Lo/frl;->b()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 261
    const/4 v0, 0x1

    return v0

    .line 262
    :cond_1
    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/frl;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 263
    const/4 v0, -0x1

    return v0

    .line 264
    :cond_2
    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/frl;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 265
    const/4 v0, 0x1

    return v0

    .line 267
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
