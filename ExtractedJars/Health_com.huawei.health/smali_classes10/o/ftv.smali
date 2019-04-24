.class public Lo/ftv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/ftw;

.field private static final c:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final d:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final e:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    invoke-static {}, Lo/ftu;->c()V

    .line 30
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftv;->c:Lo/ftz;

    .line 31
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftv;->d:Lo/ftz;

    .line 32
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftv;->e:Lo/ftz;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 53
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    if-nez v0, :cond_0

    .line 54
    return-object p0

    .line 57
    :cond_0
    invoke-static {p0}, Lo/ftv;->c(Ljava/lang/String;)V

    .line 58
    sget-object v0, Lo/ftv;->c:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 59
    if-eqz v1, :cond_1

    .line 60
    return-object v1

    .line 62
    :cond_1
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    invoke-interface {v0, p0}, Lo/ftw;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 63
    sget-object v0, Lo/ftv;->c:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    return-object v1
.end method

.method private static c(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 130
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lo/ftx;

    const-string v1, "Argument can\'t be the empty string"

    invoke-direct {v0, p0, v1}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 75
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    if-nez v0, :cond_0

    .line 76
    return-object p0

    .line 79
    :cond_0
    invoke-static {p0}, Lo/ftv;->c(Ljava/lang/String;)V

    .line 80
    sget-object v0, Lo/ftv;->d:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 81
    if-eqz v1, :cond_1

    .line 82
    return-object v1

    .line 84
    :cond_1
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    invoke-interface {v0, p0}, Lo/ftw;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 85
    sget-object v0, Lo/ftv;->d:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    return-object v1
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 97
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    if-nez v0, :cond_0

    .line 98
    return-object p0

    .line 101
    :cond_0
    invoke-static {p0}, Lo/ftv;->c(Ljava/lang/String;)V

    .line 102
    sget-object v0, Lo/ftv;->e:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 103
    if-eqz v1, :cond_1

    .line 104
    return-object v1

    .line 106
    :cond_1
    sget-object v0, Lo/ftv;->a:Lo/ftw;

    invoke-interface {v0, p0}, Lo/ftw;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 107
    sget-object v0, Lo/ftv;->e:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    return-object v1
.end method

.method public static e(Lo/ftw;)V
    .locals 0

    .line 42
    sput-object p0, Lo/ftv;->a:Lo/ftw;

    .line 43
    return-void
.end method
