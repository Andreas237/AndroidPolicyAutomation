.class public Lo/aoj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/aoj;->c:J

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lo/aoj;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 19
    iget-wide v0, p0, Lo/aoj;->c:J

    return-wide v0
.end method

.method public d(J)V
    .locals 0

    .line 23
    iput-wide p1, p0, Lo/aoj;->c:J

    .line 24
    return-void
.end method
