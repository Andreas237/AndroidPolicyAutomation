.class public Lo/age;
.super Lo/afz;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:S

.field private c:S

.field private d:J

.field private e:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lo/afz;-><init>()V

    return-void
.end method

.method public static c(B)I
    .locals 2

    .line 124
    and-int/lit16 v1, p0, 0xff

    .line 125
    return v1
.end method


# virtual methods
.method public a()S
    .locals 1

    .line 39
    iget-short v0, p0, Lo/age;->b:S

    return v0
.end method

.method public a(S)V
    .locals 0

    .line 63
    iput-short p1, p0, Lo/age;->e:S

    .line 64
    return-void
.end method

.method public a([B)V
    .locals 2

    .line 117
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    invoke-static {v0}, Lo/age;->c(B)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {p0, v0}, Lo/age;->c(S)V

    .line 118
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    invoke-static {v0}, Lo/age;->c(B)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {p0, v0}, Lo/age;->a(S)V

    .line 119
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/age;->e(J)V

    .line 120
    const/4 v0, 0x2

    aget-byte v0, p1, v0

    invoke-static {v0}, Lo/age;->c(B)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {p0, v0}, Lo/age;->d(S)V

    .line 121
    return-void
.end method

.method public b()S
    .locals 1

    .line 98
    iget-short v0, p0, Lo/age;->c:S

    return v0
.end method

.method public c()S
    .locals 1

    .line 55
    iget-short v0, p0, Lo/age;->e:S

    return v0
.end method

.method public c(S)V
    .locals 0

    .line 47
    iput-short p1, p0, Lo/age;->b:S

    .line 48
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 89
    iput-wide p1, p0, Lo/age;->a:J

    .line 90
    return-void
.end method

.method public d(S)V
    .locals 0

    .line 106
    iput-short p1, p0, Lo/age;->c:S

    .line 107
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 79
    iput-wide p1, p0, Lo/age;->d:J

    .line 80
    return-void
.end method

.method public h()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lo/age;->d:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lo/age;->a:J

    return-wide v0
.end method
