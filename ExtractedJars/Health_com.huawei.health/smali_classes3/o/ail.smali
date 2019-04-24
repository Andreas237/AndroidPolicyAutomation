.class public abstract Lo/ail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public c:J

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lo/ail;->d:Ljava/lang/String;

    .line 34
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lo/ail;->c:J

    .line 40
    return-void
.end method


# virtual methods
.method public a([B)Lo/air;
    .locals 1

    .line 72
    new-instance v0, Lo/air;

    invoke-direct {v0}, Lo/air;-><init>()V

    .line 73
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lo/air;
    .locals 1

    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 67
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e(Ljava/lang/String;)Lo/air;
.end method
