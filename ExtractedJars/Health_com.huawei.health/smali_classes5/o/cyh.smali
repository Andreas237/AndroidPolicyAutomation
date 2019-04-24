.class public Lo/cyh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:Z

.field public c:I

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyh;->d:Z

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyh;->b:Z

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyh;->e:Z

    return-void
.end method
