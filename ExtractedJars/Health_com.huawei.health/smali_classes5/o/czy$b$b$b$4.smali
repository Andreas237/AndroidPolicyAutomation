.class Lo/czy$b$b$b$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czy$b$b$b;->b()V
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
.field final synthetic e:Lo/czy$b$b$b;


# direct methods
.method constructor <init>(Lo/czy$b$b$b;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lo/czy$b$b$b$4;->e:Lo/czy$b$b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/czy$a;Lo/czy$a;)I
    .locals 4

    .line 332
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    invoke-virtual {p2}, Lo/czy$a;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    invoke-virtual {p2}, Lo/czy$a;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    return v0

    .line 337
    :cond_0
    invoke-virtual {p1}, Lo/czy$a;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 338
    const/4 v0, 0x1

    return v0

    .line 339
    :cond_1
    invoke-virtual {p1}, Lo/czy$a;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 340
    const/4 v0, -0x1

    return v0

    .line 342
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 328
    move-object v0, p1

    check-cast v0, Lo/czy$a;

    move-object v1, p2

    check-cast v1, Lo/czy$a;

    invoke-virtual {p0, v0, v1}, Lo/czy$b$b$b$4;->c(Lo/czy$a;Lo/czy$a;)I

    move-result v0

    return v0
.end method
