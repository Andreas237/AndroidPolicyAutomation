.class public Lo/eve;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/evp;>;"
        }
    .end annotation

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-static {v1}, Lo/eve;->e(Ljava/util/List;)I

    .line 27
    return-object v1
.end method

.method private static d(Ljava/util/List;Ljava/lang/String;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;Ljava/lang/String;)I"
        }
    .end annotation

    .line 38
    const/4 v4, 0x0

    .line 41
    const-string v0, "ljt"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMultiLanguageLength 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-static {p1}, Lo/evh;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/evr;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 43
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 44
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/evn;

    .line 45
    invoke-virtual {v7}, Lo/evn;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/evh;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/evh;->c(Ljava/lang/String;)J

    move-result-wide v8

    .line 46
    invoke-virtual {v7}, Lo/evn;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/evn;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v8, v9, v1}, Lo/evh;->b(Ljava/lang/String;JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    const-string v0, "ljt"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMultiLanguageLength 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    int-to-long v0, v4

    invoke-virtual {v7}, Lo/evn;->d()J

    move-result-wide v2

    add-long/2addr v0, v2

    long-to-int v4, v0

    .line 49
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 50
    new-instance v10, Lo/evp;

    invoke-direct {v10}, Lo/evp;-><init>()V

    .line 51
    invoke-virtual {v7}, Lo/evn;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/evp;->e(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v7}, Lo/evn;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/evh;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/evp;->c(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v7}, Lo/evn;->d()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/evp;->b(J)V

    .line 54
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lo/evp;->a(I)V

    .line 55
    invoke-interface {p0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 63
    :cond_1
    return v4
.end method

.method public static e(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;)I"
        }
    .end annotation

    .line 31
    const/4 v4, 0x0

    .line 32
    const-string v0, ""

    invoke-static {p0, v0}, Lo/eve;->d(Ljava/util/List;Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v4, v0, 0x0

    .line 33
    const-string v0, "ljt"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadWorkoutMediaFiles totalLength:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return v4
.end method
