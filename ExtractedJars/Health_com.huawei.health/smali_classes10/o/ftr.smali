.class public Lo/ftr;
.super Lo/fts;
.source "SourceFile"


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/fts;-><init>(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method public static c(Ljava/lang/String;)Lo/ftr;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 54
    invoke-static {p0}, Lo/ftv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 56
    invoke-static {p0}, Lo/ftr;->d(Ljava/lang/String;)V

    .line 57
    new-instance v0, Lo/ftr;

    invoke-direct {v0, p0}, Lo/ftr;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
