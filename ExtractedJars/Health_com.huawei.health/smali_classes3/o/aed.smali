.class public Lo/aed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:I

.field public d:Z


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x2

    aget-byte v1, p1, v0

    .line 11
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aed;->d:Z

    .line 13
    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_0

    .line 14
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aed;->d:Z

    .line 17
    :cond_0
    and-int/lit8 v0, v1, 0x7f

    int-to-byte v1, v0

    .line 19
    const/16 v0, 0x64

    if-le v1, v0, :cond_1

    .line 20
    const/16 v1, 0x64

    .line 23
    :cond_1
    iput v1, p0, Lo/aed;->a:I

    .line 25
    return-void
.end method
