.class Lo/czy$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/czy$b$b;
    }
.end annotation


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/czy$b;->d:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lo/czy$4;)V
    .locals 0

    .line 192
    invoke-direct {p0}, Lo/czy$b;-><init>()V

    return-void
.end method

.method private a(Lo/czy$a;Lo/czy$a;)Z
    .locals 1

    .line 205
    invoke-direct {p0, p1, p2}, Lo/czy$b;->b(Lo/czy$a;Lo/czy$a;)Z

    move-result v0

    return v0
.end method

.method private b(Lo/czy$a;Lo/czy$a;)Z
    .locals 10

    .line 209
    invoke-virtual {p1}, Lo/czy$a;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->d()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 210
    invoke-virtual {p1}, Lo/czy$a;->c()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    .line 212
    invoke-virtual {p1}, Lo/czy$a;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/czy$a;->b()J

    move-result-wide v2

    add-long/2addr v0, v2

    sub-long v2, v6, v4

    sub-long v8, v0, v2

    .line 214
    const-wide/32 v0, 0x493e0

    cmp-long v0, v8, v0

    if-lez v0, :cond_0

    .line 215
    const/4 v0, 0x1

    return v0

    .line 218
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/czy$b;Lo/czy$a;Lo/czy$a;)Z
    .locals 1

    .line 192
    invoke-direct {p0, p1, p2}, Lo/czy$b;->b(Lo/czy$a;Lo/czy$a;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/czy$b;Lo/czy$a;Lo/czy$a;)Z
    .locals 1

    .line 192
    invoke-direct {p0, p1, p2}, Lo/czy$b;->a(Lo/czy$a;Lo/czy$a;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/czy$b;)Ljava/util/List;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/czy$b;->d:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/czy$a;>;)V"
        }
    .end annotation

    .line 197
    iput-object p1, p0, Lo/czy$b;->d:Ljava/util/List;

    .line 198
    return-void
.end method

.method public d()Lo/czy$b$b;
    .locals 1

    .line 201
    new-instance v0, Lo/czy$b$b;

    invoke-direct {v0, p0}, Lo/czy$b$b;-><init>(Lo/czy$b;)V

    return-object v0
.end method
