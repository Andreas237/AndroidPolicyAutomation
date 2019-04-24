.class public abstract Lo/czy$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public b()J
    .locals 4

    .line 445
    invoke-virtual {p0}, Lo/czy$a;->c()J

    move-result-wide v0

    invoke-virtual {p0}, Lo/czy$a;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public abstract c()J
.end method

.method public abstract d()J
.end method

.method public abstract e()F
.end method
