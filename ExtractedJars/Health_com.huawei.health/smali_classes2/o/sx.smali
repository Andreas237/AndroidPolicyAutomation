.class abstract Lo/sx;
.super Lo/tc;
.source "SourceFile"


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/tc;-><init>(Lo/qm;)V

    .line 41
    return-void
.end method

.method private static a(Ljava/lang/StringBuilder;I)V
    .locals 5

    .line 67
    const/4 v2, 0x0

    .line 68
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0xd

    if-ge v3, v0, :cond_1

    .line 69
    add-int v0, v3, p1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    add-int/lit8 v4, v0, -0x30

    .line 70
    and-int/lit8 v0, v3, 0x1

    if-nez v0, :cond_0

    mul-int/lit8 v0, v4, 0x3

    goto :goto_1

    :cond_0
    move v0, v4

    :goto_1
    add-int/2addr v2, v0

    .line 68
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 73
    :cond_1
    rem-int/lit8 v0, v2, 0xa

    rsub-int/lit8 v2, v0, 0xa

    .line 74
    const/16 v0, 0xa

    if-ne v2, v0, :cond_2

    .line 75
    const/4 v2, 0x0

    .line 78
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    return-void
.end method


# virtual methods
.method protected final b(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 44
    const-string v0, "(01)"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 46
    const/16 v0, 0x39

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual {p0, p1, p2, v1}, Lo/sx;->d(Ljava/lang/StringBuilder;II)V

    .line 49
    return-void
.end method

.method protected final d(Ljava/lang/StringBuilder;II)V
    .locals 5

    .line 52
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v3, v0, :cond_2

    .line 53
    invoke-virtual {p0}, Lo/sx;->e()Lo/th;

    move-result-object v0

    mul-int/lit8 v1, v3, 0xa

    add-int/2addr v1, p2

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Lo/th;->d(II)I

    move-result v4

    .line 54
    div-int/lit8 v0, v4, 0x64

    if-nez v0, :cond_0

    .line 55
    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    :cond_0
    div-int/lit8 v0, v4, 0xa

    if-nez v0, :cond_1

    .line 58
    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 63
    :cond_2
    invoke-static {p1, p3}, Lo/sx;->a(Ljava/lang/StringBuilder;I)V

    .line 64
    return-void
.end method
