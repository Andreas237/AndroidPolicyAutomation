.class public final Lo/uv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:I

.field private final c:[[B

.field private final d:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    filled-new-array {p2, p1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lo/uv;->c:[[B

    .line 33
    iput p1, p0, Lo/uv;->d:I

    .line 34
    iput p2, p0, Lo/uv;->b:I

    .line 35
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 42
    iget v0, p0, Lo/uv;->d:I

    return v0
.end method

.method public b(IIZ)V
    .locals 2

    .line 65
    iget-object v0, p0, Lo/uv;->c:[[B

    aget-object v0, v0, p2

    if-eqz p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    int-to-byte v1, v1

    aput-byte v1, v0, p1

    .line 66
    return-void
.end method

.method public c(III)V
    .locals 2

    .line 61
    iget-object v0, p0, Lo/uv;->c:[[B

    aget-object v0, v0, p2

    int-to-byte v1, p3

    aput-byte v1, v0, p1

    .line 62
    return-void
.end method

.method public c()[[B
    .locals 1

    .line 53
    iget-object v0, p0, Lo/uv;->c:[[B

    return-object v0
.end method

.method public e(II)B
    .locals 1

    .line 46
    iget-object v0, p0, Lo/uv;->c:[[B

    aget-object v0, v0, p2

    aget-byte v0, v0, p1

    return v0
.end method

.method public e()I
    .locals 1

    .line 38
    iget v0, p0, Lo/uv;->b:I

    return v0
.end method

.method public e(B)V
    .locals 3

    .line 69
    const/4 v1, 0x0

    :goto_0
    iget v0, p0, Lo/uv;->b:I

    if-ge v1, v0, :cond_1

    .line 70
    const/4 v2, 0x0

    :goto_1
    iget v0, p0, Lo/uv;->d:I

    if-ge v2, v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/uv;->c:[[B

    aget-object v0, v0, v1

    aput-byte p1, v0, v2

    .line 70
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 69
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 74
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    iget v0, p0, Lo/uv;->d:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/uv;->b:I

    mul-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x2

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 79
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lo/uv;->b:I

    if-ge v3, v0, :cond_1

    .line 80
    const/4 v4, 0x0

    :goto_1
    iget v0, p0, Lo/uv;->d:I

    if-ge v4, v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/uv;->c:[[B

    aget-object v0, v0, v3

    aget-byte v0, v0, v4

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 83
    :sswitch_0
    const-string v0, " 0"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    goto :goto_3

    .line 86
    :sswitch_1
    const-string v0, " 1"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    goto :goto_3

    .line 89
    :goto_2
    const-string v0, "  "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 93
    :cond_0
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
