.class public Lo/fqt;
.super Lo/fqu;
.source "SourceFile"


# instance fields
.field private final d:Lo/fqb$b;

.field private final e:Lo/fqb$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo/fqb$b;Lo/fqb$c;Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V
    .locals 2

    .line 68
    invoke-direct {p0, p1, p4, p5}, Lo/fqu;-><init>(Ljava/lang/String;Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V

    .line 69
    if-nez p2, :cond_0

    .line 70
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Description must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_0
    if-nez p3, :cond_1

    .line 72
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Level must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_1
    iput-object p2, p0, Lo/fqt;->d:Lo/fqb$b;

    .line 75
    iput-object p3, p0, Lo/fqt;->e:Lo/fqb$c;

    .line 77
    return-void
.end method
