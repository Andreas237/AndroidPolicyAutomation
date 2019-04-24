.class final Lo/sq;
.super Lo/sz;
.source "SourceFile"


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/sz;-><init>(Lo/qm;)V

    .line 38
    return-void
.end method


# virtual methods
.method protected a(I)I
    .locals 1

    .line 51
    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    .line 52
    return p1

    .line 54
    :cond_0
    add-int/lit16 v0, p1, -0x2710

    return v0
.end method

.method protected c(Ljava/lang/StringBuilder;I)V
    .locals 1

    .line 42
    const/16 v0, 0x2710

    if-ge p2, v0, :cond_0

    .line 43
    const-string v0, "(3202)"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 45
    :cond_0
    const-string v0, "(3203)"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    :goto_0
    return-void
.end method
