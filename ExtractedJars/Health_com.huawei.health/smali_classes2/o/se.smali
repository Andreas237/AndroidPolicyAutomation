.class final Lo/se;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private final c:Lo/sd;

.field private final e:Lo/sb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/se;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
    .end array-data
.end method

.method constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lo/sd;

    invoke-direct {v0}, Lo/sd;-><init>()V

    iput-object v0, p0, Lo/se;->c:Lo/sd;

    .line 29
    new-instance v0, Lo/sb;

    invoke-direct {v0}, Lo/sb;-><init>()V

    iput-object v0, p0, Lo/se;->e:Lo/sb;

    return-void
.end method


# virtual methods
.method a(ILo/qm;I)Lo/or;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 32
    sget-object v0, Lo/se;->a:[I

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, Lo/sf;->d(Lo/qm;IZ[I)[I

    move-result-object v2

    .line 34
    :try_start_0
    iget-object v0, p0, Lo/se;->e:Lo/sb;

    invoke-virtual {v0, p1, p2, v2}, Lo/sb;->e(ILo/qm;[I)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 35
    :catch_0
    move-exception v3

    .line 36
    iget-object v0, p0, Lo/se;->c:Lo/sd;

    invoke-virtual {v0, p1, p2, v2}, Lo/sd;->b(ILo/qm;[I)Lo/or;

    move-result-object v0

    return-object v0
.end method
