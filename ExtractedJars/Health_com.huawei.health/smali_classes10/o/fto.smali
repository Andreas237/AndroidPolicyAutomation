.class public Lo/fto;
.super Lo/fts;
.source "SourceFile"


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/fts;-><init>(Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method public static e(Ljava/lang/String;)Lo/fto;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 49
    if-nez p0, :cond_0

    .line 50
    new-instance v0, Lo/ftx;

    const-string v1, "domain"

    const-string v2, "Input \'domain\' must not be null"

    invoke-direct {v0, v1, v2}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_1

    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 58
    :cond_1
    invoke-static {p0}, Lo/ftv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 60
    invoke-static {p0}, Lo/fto;->d(Ljava/lang/String;)V

    .line 61
    new-instance v0, Lo/fto;

    invoke-direct {v0, p0}, Lo/fto;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
