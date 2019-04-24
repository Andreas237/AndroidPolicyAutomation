.class public Lo/fpi;
.super Lo/fpb;
.source "SourceFile"


# static fields
.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "DTLS_SESSION_ID"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "DTLS_EPOCH"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "DTLS_CIPHER"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fpi;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 29
    const-string v0, "strict context"

    sget-object v1, Lo/fpi;->c:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/fpb;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 30
    return-void
.end method
