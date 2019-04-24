.class public final Lo/sc;
.super Lo/sf;
.source "SourceFile"


# instance fields
.field private final c:Lo/sf;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lo/sf;-><init>()V

    .line 38
    new-instance v0, Lo/rv;

    invoke-direct {v0}, Lo/rv;-><init>()V

    iput-object v0, p0, Lo/sc;->c:Lo/sf;

    return-void
.end method

.method private static a(Lo/or;)Lo/or;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 78
    invoke-virtual {p0}, Lo/or;->e()Ljava/lang/String;

    move-result-object v5

    .line 79
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    .line 80
    new-instance v0, Lo/or;

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/or;->c()[Lo/ou;

    move-result-object v2

    sget-object v3, Lo/od;->m:Lo/od;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0

    .line 82
    :cond_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/sc;->c:Lo/sf;

    invoke-virtual {v0, p1, p2, p3}, Lo/sf;->a(ILo/qm;Ljava/util/Map;)Lo/or;

    move-result-object v0

    invoke-static {v0}, Lo/sc;->a(Lo/or;)Lo/or;

    move-result-object v0

    return-object v0
.end method

.method protected b(Lo/qm;[ILjava/lang/StringBuilder;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lo/sc;->c:Lo/sf;

    invoke-virtual {v0, p1, p2, p3}, Lo/sf;->b(Lo/qm;[ILjava/lang/StringBuilder;)I

    move-result v0

    return v0
.end method

.method public b(ILo/qm;[ILjava/util/Map;)Lo/or;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;[ILjava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lo/sc;->c:Lo/sf;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/sf;->b(ILo/qm;[ILjava/util/Map;)Lo/or;

    move-result-object v0

    invoke-static {v0}, Lo/sc;->a(Lo/or;)Lo/or;

    move-result-object v0

    return-object v0
.end method

.method e()Lo/od;
    .locals 1

    .line 68
    sget-object v0, Lo/od;->m:Lo/od;

    return-object v0
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/sc;->c:Lo/sf;

    invoke-virtual {v0, p1, p2}, Lo/sf;->e(Lo/oj;Ljava/util/Map;)Lo/or;

    move-result-object v0

    invoke-static {v0}, Lo/sc;->a(Lo/or;)Lo/or;

    move-result-object v0

    return-object v0
.end method
