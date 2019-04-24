.class public abstract Lo/abm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b([III)I
    .locals 1

    .line 67
    if-eqz p1, :cond_0

    array-length v0, p1

    if-ge p2, v0, :cond_0

    .line 68
    aget v0, p1, p2

    return v0

    .line 71
    :cond_0
    return p3
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract a(Lo/ala;)V
.end method

.method public b(Landroid/content/Context;J[I[I[I)V
    .locals 7

    .line 40
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_0

    .line 41
    const-string v0, "Step_ExtendStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataReport invalied time report drop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void

    .line 46
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p4, :cond_1

    .line 47
    const-string v0, "Step_ExtendStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataReport invalied data report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-void

    .line 51
    :cond_1
    array-length v0, p4

    if-nez v0, :cond_2

    .line 52
    const-string v0, "Step_ExtendStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataReport invalied data report2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    return-void

    .line 56
    :cond_2
    const/4 v6, 0x0

    :goto_0
    array-length v0, p4

    if-ge v6, v0, :cond_4

    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p4, v6, v0}, Lo/abm;->b([III)I

    move-result v0

    const v1, 0xf4240

    if-le v0, v1, :cond_3

    .line 58
    const-string v0, "Step_ExtendStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bad step too large"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    int-to-long v1, v6

    const-wide/32 v3, 0xea60

    mul-long/2addr v1, v3

    add-long/2addr v1, p2

    const/4 v3, 0x0

    invoke-direct {p0, p4, v6, v3}, Lo/abm;->b([III)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {p0, p5, v6, v4}, Lo/abm;->b([III)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {p0, p6, v6, v5}, Lo/abm;->b([III)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/alt;->a(JIII)V

    .line 56
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 63
    :cond_4
    return-void
.end method

.method public abstract d()V
.end method
