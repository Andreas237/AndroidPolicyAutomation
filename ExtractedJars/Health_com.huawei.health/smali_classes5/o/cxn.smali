.class public Lo/cxn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 10
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/cxn;->d:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()J
    .locals 2

    .line 17
    sget-wide v0, Lo/cxn;->d:J

    return-wide v0
.end method

.method public static c(J)V
    .locals 0

    .line 13
    sput-wide p0, Lo/cxn;->d:J

    .line 14
    return-void
.end method
