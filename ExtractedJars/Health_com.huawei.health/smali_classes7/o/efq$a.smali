.class public Lo/efq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/16 v0, 0x2600

    iput v0, p0, Lo/efq$a;->a:I

    .line 25
    const/16 v0, 0x2601

    iput v0, p0, Lo/efq$a;->b:I

    .line 26
    const v0, 0x812f

    iput v0, p0, Lo/efq$a;->e:I

    .line 27
    const v0, 0x812f

    iput v0, p0, Lo/efq$a;->c:I

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efq$a;->d:Z

    return-void
.end method


# virtual methods
.method public a(I)Lo/efq$a;
    .locals 0

    .line 36
    iput p1, p0, Lo/efq$a;->b:I

    .line 37
    return-object p0
.end method

.method public a(Z)Lo/efq$a;
    .locals 0

    .line 51
    iput-boolean p1, p0, Lo/efq$a;->d:Z

    .line 52
    return-object p0
.end method

.method public b()Lo/efq;
    .locals 3

    .line 56
    new-instance v2, Lo/efq;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/efq;-><init>(Lo/efq$3;)V

    .line 57
    iget v0, p0, Lo/efq$a;->a:I

    iput v0, v2, Lo/efq;->c:I

    .line 58
    iget v0, p0, Lo/efq$a;->b:I

    iput v0, v2, Lo/efq;->b:I

    .line 59
    iget v0, p0, Lo/efq$a;->e:I

    iput v0, v2, Lo/efq;->a:I

    .line 60
    iget v0, p0, Lo/efq$a;->c:I

    iput v0, v2, Lo/efq;->e:I

    .line 61
    iget-boolean v0, p0, Lo/efq$a;->d:Z

    iput-boolean v0, v2, Lo/efq;->d:Z

    .line 62
    iget-boolean v0, p0, Lo/efq$a;->d:Z

    if-eqz v0, :cond_1

    .line 63
    iget v0, p0, Lo/efq$a;->a:I

    const/16 v1, 0x2600

    if-eq v0, v1, :cond_0

    iget v0, p0, Lo/efq$a;->a:I

    const/16 v1, 0x2601

    if-ne v0, v1, :cond_1

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "the value GLES20.GL_NEAREST or GLES20.GL_LINEAR for GL_TEXTURE_MIN_FILTER is not good for texture when you wanna use mipmap"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_1
    return-object v2
.end method

.method public d(I)Lo/efq$a;
    .locals 0

    .line 31
    iput p1, p0, Lo/efq$a;->a:I

    .line 32
    return-object p0
.end method
