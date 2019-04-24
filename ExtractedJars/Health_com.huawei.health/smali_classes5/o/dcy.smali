.class public Lo/dcy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/dcy;->b:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/dcy;->c:I

    .line 23
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/dcy;->b:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/dcy;->c:I

    .line 31
    iput p1, p0, Lo/dcy;->c:I

    .line 32
    return-void
.end method
