.class public Lo/amg$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "c"
.end annotation


# instance fields
.field private e:J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/amg$c;->e:J

    .line 64
    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lo/amg$c;->e:J

    return-wide v0
.end method

.method public e(J)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lo/amg$c;->e:J

    .line 67
    return-void
.end method
