.class abstract Lo/sv;
.super Lo/sx;
.source "SourceFile"


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/sx;-><init>(Lo/qm;)V

    .line 38
    return-void
.end method


# virtual methods
.method protected abstract a(I)I
.end method

.method protected abstract c(Ljava/lang/StringBuilder;I)V
.end method

.method protected final e(Ljava/lang/StringBuilder;II)V
    .locals 5

    .line 41
    invoke-virtual {p0}, Lo/sv;->e()Lo/th;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/th;->d(II)I

    move-result v1

    .line 42
    invoke-virtual {p0, p1, v1}, Lo/sv;->c(Ljava/lang/StringBuilder;I)V

    .line 44
    invoke-virtual {p0, v1}, Lo/sv;->a(I)I

    move-result v2

    .line 46
    const v3, 0x186a0

    .line 47
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v4, v0, :cond_1

    .line 48
    div-int v0, v2, v3

    if-nez v0, :cond_0

    .line 49
    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    :cond_0
    div-int/lit8 v3, v3, 0xa

    .line 47
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    return-void
.end method
