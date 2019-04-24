.class final Lo/tm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>(IIII)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, Lo/tm;->e:I

    .line 32
    iput p4, p0, Lo/tm;->d:I

    .line 33
    iput p2, p0, Lo/tm;->b:I

    .line 34
    iput p3, p0, Lo/tm;->c:I

    .line 35
    add-int v0, p2, p3

    iput v0, p0, Lo/tm;->a:I

    .line 36
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 47
    iget v0, p0, Lo/tm;->a:I

    return v0
.end method

.method b()I
    .locals 1

    .line 55
    iget v0, p0, Lo/tm;->c:I

    return v0
.end method

.method c()I
    .locals 1

    .line 43
    iget v0, p0, Lo/tm;->d:I

    return v0
.end method

.method d()I
    .locals 1

    .line 51
    iget v0, p0, Lo/tm;->b:I

    return v0
.end method

.method e()I
    .locals 1

    .line 39
    iget v0, p0, Lo/tm;->e:I

    return v0
.end method
