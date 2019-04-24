.class public Lo/dfi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 173
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 176
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 177
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 178
    invoke-static {v5}, Lo/dff;->b(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public static b([B)Lo/dfp;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 75
    new-instance v3, Lo/daz;

    invoke-direct {v3}, Lo/daz;-><init>()V

    .line 77
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 80
    invoke-virtual {v3, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 81
    invoke-static {v6}, Lo/dfk;->e(Lo/dba;)Lo/dfp;

    move-result-object v2

    .line 83
    return-object v2
.end method

.method public static c([B)Lo/dfm;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 117
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    .line 118
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 120
    new-instance v5, Lo/daz;

    invoke-direct {v5}, Lo/daz;-><init>()V

    .line 121
    invoke-virtual {v5, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 122
    invoke-static {v6}, Lo/dfh;->e(Lo/dba;)Lo/dfm;

    move-result-object v2

    .line 123
    return-object v2
.end method

.method public static d([B)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 49
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 51
    new-instance v7, Lo/daz;

    invoke-direct {v7}, Lo/daz;-><init>()V

    .line 52
    invoke-virtual {v7, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 53
    invoke-static {v8}, Lo/dfk;->a(Lo/dba;)[I

    move-result-object v9

    .line 54
    const-string v0, "FitnessUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v9, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x0

    aget v0, v9, v0

    const v1, 0x186a0

    if-ne v0, v1, :cond_0

    .line 57
    const/4 v4, 0x0

    goto :goto_0

    .line 59
    :cond_0
    const/4 v0, 0x0

    aget v4, v9, v0

    .line 61
    :goto_0
    return v4
.end method

.method public static e([B)Lo/dfs;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 97
    new-instance v3, Lo/daz;

    invoke-direct {v3}, Lo/daz;-><init>()V

    .line 98
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 101
    invoke-virtual {v3, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 102
    invoke-static {v6}, Lo/dfh;->a(Lo/dba;)Lo/dfs;

    move-result-object v2

    .line 104
    return-object v2
.end method

.method public static f([B)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 207
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 208
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 210
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 211
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 212
    invoke-static {v5}, Lo/dfg;->c(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public static g([B)Lo/dfq;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 190
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 191
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 193
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 194
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 195
    invoke-static {v5}, Lo/dff;->c(Lo/dba;)Lo/dfq;

    move-result-object v0

    return-object v0
.end method

.method public static h([B)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 241
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 244
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 245
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 246
    invoke-static {v5}, Lo/dfk;->d(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public static i([B)Lcom/huawei/datatype/FitnessUserInfo;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 258
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 259
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 261
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 262
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 263
    invoke-static {v5}, Lo/dfk;->c(Lo/dba;)Lcom/huawei/datatype/FitnessUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public static k([B)Lo/dfx;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 224
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 225
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 227
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 228
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 229
    invoke-static {v5}, Lo/dfg;->d(Lo/dba;)Lo/dfx;

    move-result-object v0

    return-object v0
.end method

.method public static l([B)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 310
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 311
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 313
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 314
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 315
    invoke-static {v5}, Lo/dff;->e(Lo/dba;)I

    move-result v0

    return v0
.end method

.method public static m([B)Lo/dft;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 326
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 327
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 328
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 329
    invoke-virtual {v4, v3}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 330
    invoke-static {v5}, Lo/dff;->d(Lo/dba;)Lo/dft;

    move-result-object v0

    return-object v0
.end method
