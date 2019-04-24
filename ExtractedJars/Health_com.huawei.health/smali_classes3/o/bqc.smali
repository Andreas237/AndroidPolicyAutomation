.class public final Lo/bqc;
.super Lo/bqh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bqc$a;,
        Lo/bqc$c;,
        Lo/bqc$e;
    }
.end annotation


# static fields
.field private static final a:[B

.field private static final c:[B

.field private static final d:[B


# instance fields
.field private final b:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bqc$c;>;"
        }
    .end annotation
.end field

.field private g:J

.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/bqc;->d:[B

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lo/bqc;->a:[B

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lo/bqc;->c:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lo/bqc$c;>;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Lo/bqh;-><init>()V

    .line 44
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/bqc;->g:J

    .line 48
    iput-object p1, p0, Lo/bqc;->b:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lo/bqc;->e:Ljava/lang/String;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; boundary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bqc;->k:Ljava/lang/String;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bqc;->f:Ljava/util/List;

    .line 53
    return-void
.end method

.method static a(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 4

    .line 223
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 224
    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_0

    .line 226
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 227
    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    .line 230
    :sswitch_0
    const-string v0, "%0A"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    goto :goto_2

    .line 233
    :sswitch_1
    const-string v0, "%0D"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    goto :goto_2

    .line 236
    :sswitch_2
    const-string v0, "%22"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    goto :goto_2

    .line 239
    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 224
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 243
    :cond_0
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 244
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xd -> :sswitch_1
        0x22 -> :sswitch_2
    .end sparse-switch
.end method

.method private c(Ljava/io/OutputStream;)J
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 118
    if-nez p1, :cond_0

    .line 119
    const-wide/16 v0, -0x1

    return-wide v0

    .line 122
    :cond_0
    move-object/from16 v0, p1

    instance-of v4, v0, Lo/bqc$e;

    .line 123
    const-wide/16 v5, 0x0

    .line 125
    const/4 v7, 0x0

    iget-object v0, p0, Lo/bqc;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_6

    .line 127
    iget-object v0, p0, Lo/bqc;->f:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/bqc$c;

    .line 128
    invoke-static {v9}, Lo/bqc$c;->d(Lo/bqc$c;)Lo/bpv;

    move-result-object v10

    .line 129
    invoke-static {v9}, Lo/bqc$c;->a(Lo/bqc$c;)Lo/bqh;

    move-result-object v11

    .line 131
    sget-object v0, Lo/bqc;->c:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 132
    iget-object v0, p0, Lo/bqc;->b:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 133
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 135
    if-eqz v10, :cond_1

    .line 137
    const/4 v12, 0x0

    invoke-virtual {v10}, Lo/bpv;->a()I

    move-result v13

    :goto_1
    if-ge v12, v13, :cond_1

    .line 139
    invoke-virtual {v10, v12}, Lo/bpv;->d(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 140
    sget-object v0, Lo/bqc;->d:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 141
    invoke-virtual {v10, v12}, Lo/bpv;->e(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 142
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 137
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 146
    :cond_1
    invoke-virtual {v11}, Lo/bqh;->a()Ljava/lang/String;

    move-result-object v12

    .line 147
    if-eqz v12, :cond_2

    .line 149
    const-string v0, "Content-Type: "

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 150
    const-string v0, "UTF-8"

    invoke-virtual {v12, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 151
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 154
    :cond_2
    invoke-virtual {v11}, Lo/bqh;->e()J

    move-result-wide v13

    .line 155
    const-wide/16 v0, -0x1

    cmp-long v0, v13, v0

    if-eqz v0, :cond_3

    .line 157
    const-string v0, "Content-Length: "

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 158
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 159
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    goto :goto_2

    .line 161
    :cond_3
    if-eqz v4, :cond_4

    .line 164
    const-wide/16 v0, -0x1

    return-wide v0

    .line 167
    :cond_4
    :goto_2
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 169
    if-eqz v4, :cond_5

    .line 171
    add-long/2addr v5, v13

    goto :goto_3

    .line 175
    :cond_5
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lo/bqh;->d(Ljava/io/OutputStream;)V

    .line 178
    :goto_3
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 125
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 181
    :cond_6
    sget-object v0, Lo/bqc;->c:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 182
    iget-object v0, p0, Lo/bqc;->b:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 183
    sget-object v0, Lo/bqc;->c:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 184
    sget-object v0, Lo/bqc;->a:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 186
    if-eqz v4, :cond_7

    .line 188
    move-object/from16 v7, p1

    check-cast v7, Lo/bqc$e;

    .line 189
    invoke-virtual {v7}, Lo/bqc$e;->e()J

    move-result-wide v0

    add-long/2addr v5, v0

    .line 193
    :try_start_0
    invoke-virtual {v7}, Lo/bqc$e;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_4

    .line 195
    :catch_0
    move-exception v8

    .line 196
    const-string v0, "MultipartBody"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_7
    :goto_4
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 206
    goto :goto_5

    .line 204
    :catch_1
    move-exception v7

    .line 205
    const-string v0, "MultipartBody"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :goto_5
    return-wide v5
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/bqc;->k:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 106
    invoke-direct {p0, p1}, Lo/bqc;->c(Ljava/io/OutputStream;)J

    .line 107
    return-void
.end method

.method public e()J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    iget-wide v2, p0, Lo/bqc;->g:J

    .line 96
    const-wide/16 v0, -0x1

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 98
    return-wide v2

    .line 100
    :cond_0
    new-instance v0, Lo/bqc$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/bqc$e;-><init>(Lo/bqc$5;)V

    invoke-direct {p0, v0}, Lo/bqc;->c(Ljava/io/OutputStream;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/bqc;->g:J

    return-wide v0
.end method
