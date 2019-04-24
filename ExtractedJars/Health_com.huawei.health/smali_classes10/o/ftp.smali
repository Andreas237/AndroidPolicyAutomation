.class public Lo/ftp;
.super Lo/fts;
.source "SourceFile"


# static fields
.field public static final c:Lo/ftp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Lo/ftp;

    const-string v1, ""

    invoke-direct {v0, v1}, Lo/ftp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/ftp;->c:Lo/ftp;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lo/fts;-><init>(Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method public static b(Ljava/lang/String;)Lo/ftp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 59
    invoke-static {p0}, Lo/ftv;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {p0}, Lo/ftp;->d(Ljava/lang/String;)V

    .line 62
    new-instance v0, Lo/ftp;

    invoke-direct {v0, p0}, Lo/ftp;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
