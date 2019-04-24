.class public final Lo/un$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/un;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final c:[Lo/un$e;

.field private final e:I


# direct methods
.method varargs constructor <init>(I[Lo/un$e;)V
    .locals 0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput p1, p0, Lo/un$b;->e:I

    .line 190
    iput-object p2, p0, Lo/un$b;->c:[Lo/un$e;

    .line 191
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 194
    iget v0, p0, Lo/un$b;->e:I

    return v0
.end method

.method public c()I
    .locals 6

    .line 198
    const/4 v1, 0x0

    .line 199
    iget-object v2, p0, Lo/un$b;->c:[Lo/un$e;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 200
    invoke-virtual {v5}, Lo/un$e;->c()I

    move-result v0

    add-int/2addr v1, v0

    .line 199
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 202
    :cond_0
    return v1
.end method

.method public d()[Lo/un$e;
    .locals 1

    .line 210
    iget-object v0, p0, Lo/un$b;->c:[Lo/un$e;

    return-object v0
.end method

.method public e()I
    .locals 2

    .line 206
    iget v0, p0, Lo/un$b;->e:I

    invoke-virtual {p0}, Lo/un$b;->c()I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method
