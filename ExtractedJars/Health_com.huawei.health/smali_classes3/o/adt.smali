.class public Lo/adt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:[I

.field private c:I

.field private d:I

.field private e:I

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIII[IZZ)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput p1, p0, Lo/adt;->a:I

    .line 58
    iput p2, p0, Lo/adt;->e:I

    .line 59
    iput p4, p0, Lo/adt;->d:I

    .line 60
    iput p3, p0, Lo/adt;->c:I

    .line 61
    if-nez p5, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    :goto_0
    iput-object v0, p0, Lo/adt;->b:[I

    .line 62
    iput-boolean p6, p0, Lo/adt;->g:Z

    .line 63
    iput-boolean p7, p0, Lo/adt;->h:Z

    .line 64
    return-void
.end method
