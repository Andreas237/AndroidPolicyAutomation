.class Lo/acs$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/acs;->c()Ljava/util/Comparator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/acn;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/acs;


# direct methods
.method constructor <init>(Lo/acs;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/acs$2;->b:Lo/acs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/acn;Lo/acn;)I
    .locals 6

    .line 82
    if-nez p1, :cond_0

    .line 83
    const/4 v0, -0x1

    return v0

    .line 85
    :cond_0
    if-nez p2, :cond_1

    .line 86
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_1
    invoke-virtual {p2}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {p1}, Lo/acn;->p()J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 89
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 90
    const/4 v0, 0x1

    return v0

    .line 92
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 79
    move-object v0, p1

    check-cast v0, Lo/acn;

    move-object v1, p2

    check-cast v1, Lo/acn;

    invoke-virtual {p0, v0, v1}, Lo/acs$2;->c(Lo/acn;Lo/acn;)I

    move-result v0

    return v0
.end method
