.class public abstract Lo/cao;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static b:I

.field static e:I


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    const/16 v0, 0x3e8

    sput v0, Lo/cao;->e:I

    .line 10
    sget v0, Lo/cao;->e:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/cao;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget v0, Lo/cao;->e:I

    iput v0, p0, Lo/cao;->d:I

    return-void
.end method

.method private b(I)V
    .locals 0

    .line 39
    iput p1, p0, Lo/cao;->d:I

    .line 40
    return-void
.end method

.method private e()I
    .locals 1

    .line 35
    iget v0, p0, Lo/cao;->d:I

    return v0
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public b()V
    .locals 1

    .line 27
    sget v0, Lo/cao;->e:I

    invoke-direct {p0, v0}, Lo/cao;->b(I)V

    .line 28
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    .line 15
    sget v0, Lo/cao;->b:I

    invoke-direct {p0, v0}, Lo/cao;->b(I)V

    .line 16
    return-void
.end method

.method protected abstract c(Lo/ald;)V
.end method

.method public c()Z
    .locals 2

    .line 31
    invoke-direct {p0}, Lo/cao;->e()I

    move-result v0

    sget v1, Lo/cao;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 2

    .line 43
    invoke-direct {p0}, Lo/cao;->e()I

    move-result v0

    sget v1, Lo/cao;->b:I

    if-ne v0, v1, :cond_0

    .line 44
    invoke-virtual {p0}, Lo/cao;->a()V

    .line 46
    :cond_0
    return-void
.end method

.method public d(Lo/ald;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Lo/cao;->e()I

    move-result v0

    sget v1, Lo/cao;->b:I

    if-ne v0, v1, :cond_0

    .line 20
    invoke-virtual {p0, p1}, Lo/cao;->c(Lo/ald;)V

    .line 22
    :cond_0
    return-void
.end method
