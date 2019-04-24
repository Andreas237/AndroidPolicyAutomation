.class Lo/ezm$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezm;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/fbb$e;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/ezm;


# direct methods
.method constructor <init>(Lo/ezm;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lo/ezm$4;->d:Lo/ezm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 210
    move-object v0, p1

    check-cast v0, Lo/fbb$e;

    move-object v1, p2

    check-cast v1, Lo/fbb$e;

    invoke-virtual {p0, v0, v1}, Lo/ezm$4;->d(Lo/fbb$e;Lo/fbb$e;)I

    move-result v0

    return v0
.end method

.method public d(Lo/fbb$e;Lo/fbb$e;)I
    .locals 4

    .line 213
    invoke-virtual {p1}, Lo/fbb$e;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/fbb$e;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 214
    const/4 v0, 0x1

    return v0

    .line 216
    :cond_0
    const/4 v0, -0x1

    return v0
.end method
