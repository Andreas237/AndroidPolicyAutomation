.class Lo/czy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czy;->c(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/czy$a;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/czy;


# direct methods
.method constructor <init>(Lo/czy;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lo/czy$1;->a:Lo/czy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/czy$a;Lo/czy$a;)I
    .locals 4

    .line 161
    invoke-virtual {p1}, Lo/czy$a;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 162
    const/4 v0, 0x1

    return v0

    .line 164
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 158
    move-object v0, p1

    check-cast v0, Lo/czy$a;

    move-object v1, p2

    check-cast v1, Lo/czy$a;

    invoke-virtual {p0, v0, v1}, Lo/czy$1;->a(Lo/czy$a;Lo/czy$a;)I

    move-result v0

    return v0
.end method
