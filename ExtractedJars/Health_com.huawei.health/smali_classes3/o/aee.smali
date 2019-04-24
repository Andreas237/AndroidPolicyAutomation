.class public Lo/aee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Lo/aeh;

.field private e:I

.field private h:Z


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aee;->h:Z

    .line 24
    invoke-direct {p0, p1}, Lo/aee;->b([B)V

    .line 25
    return-void
.end method

.method private b([B)V
    .locals 10

    .line 29
    array-length v0, p1

    const/16 v1, 0x9

    if-le v0, v1, :cond_3

    .line 30
    const/4 v0, 0x2

    aget-byte v3, p1, v0

    .line 31
    const/4 v0, 0x7

    invoke-static {v3, v0}, Lo/aef;->e(BI)Z

    move-result v4

    .line 32
    const/4 v0, 0x6

    invoke-static {v3, v0}, Lo/aef;->e(BI)Z

    move-result v5

    .line 34
    if-eqz v4, :cond_0

    .line 35
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x4

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    iput v0, p0, Lo/aee;->b:I

    goto/16 :goto_0

    .line 37
    :cond_0
    and-int/lit8 v0, v3, 0x3f

    int-to-byte v6, v0

    .line 38
    const/4 v0, 0x5

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x6

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    add-int v7, v0, v1

    .line 39
    const/4 v0, 0x7

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    add-int v8, v0, v1

    .line 40
    const/16 v0, 0x9

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/16 v1, 0xa

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    add-int v9, v0, v1

    .line 42
    if-eqz v6, :cond_1

    .line 43
    new-instance v0, Lo/aeh;

    invoke-direct {v0, v6}, Lo/aeh;-><init>(B)V

    iput-object v0, p0, Lo/aee;->d:Lo/aeh;

    goto :goto_0

    .line 44
    :cond_1
    if-eqz v5, :cond_2

    .line 45
    iput v7, p0, Lo/aee;->e:I

    .line 46
    iput v8, p0, Lo/aee;->c:I

    .line 47
    iput v9, p0, Lo/aee;->a:I

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aee;->h:Z

    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x4

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    iput v0, p0, Lo/aee;->b:I

    .line 55
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 70
    iget v0, p0, Lo/aee;->b:I

    return v0
.end method

.method public b()Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Lo/aee;->h:Z

    return v0
.end method

.method public c()I
    .locals 1

    .line 58
    iget v0, p0, Lo/aee;->e:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 66
    iget v0, p0, Lo/aee;->a:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 62
    iget v0, p0, Lo/aee;->c:I

    return v0
.end method

.method public h()Lo/aeh;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/aee;->d:Lo/aeh;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 84
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pressure:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aee;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dbpValue:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aee;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hhValue:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aee;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sbpValue:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/aee;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
