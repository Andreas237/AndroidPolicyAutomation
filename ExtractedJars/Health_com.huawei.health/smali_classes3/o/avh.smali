.class public Lo/avh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:J

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-wide p1, p0, Lo/avh;->d:J

    .line 40
    iput-wide p3, p0, Lo/avh;->a:J

    .line 41
    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/avh;->d:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lo/avh;->a:J

    return-wide v0
.end method
