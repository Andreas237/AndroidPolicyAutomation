.class public abstract Lo/fqy;
.super Lo/fpy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqy$5;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private b:I

.field private c:[B

.field private d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    const-class v0, Lo/fqy;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqy;->a:Lo/fty;

    return-void
.end method

.method protected constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 96
    invoke-direct {p0, p1}, Lo/fpy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Lo/fqy;->d:I

    .line 72
    const/4 v0, -0x1

    iput v0, p0, Lo/fqy;->b:I

    .line 78
    const/4 v0, -0x1

    iput v0, p0, Lo/fqy;->e:I

    .line 97
    return-void
.end method

.method private static b([BLo/fsf$a;Ljava/net/InetSocketAddress;)Lo/fqy;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 264
    sget-object v0, Lo/fqy$5;->c:[I

    invoke-virtual {p1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 266
    :sswitch_0
    invoke-static {p0, p2}, Lo/fqv;->e([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0

    .line 268
    :sswitch_1
    invoke-static {p0, p2}, Lo/fri;->d([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0

    .line 270
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Unsupported key exchange algorithm"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static b([BLo/fsf$a;ZLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 184
    new-instance v7, Lo/fpq;

    invoke-direct {v7, p0}, Lo/fpq;-><init>([B)V

    .line 185
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Lo/fpq;->c(I)I

    move-result v0

    invoke-static {v0}, Lo/fra;->d(I)Lo/fra;

    move-result-object v8

    .line 186
    sget-object v0, Lo/fqy;->a:Lo/fty;

    const-string v1, "Parsing HANDSHAKE message of type [{}]"

    invoke-interface {v0, v1, v8}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    const/16 v0, 0x18

    invoke-virtual {v7, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 190
    const/16 v0, 0x10

    invoke-virtual {v7, v0}, Lo/fpq;->c(I)I

    move-result v10

    .line 192
    const/16 v0, 0x18

    invoke-virtual {v7, v0}, Lo/fpq;->c(I)I

    move-result v11

    .line 193
    const/16 v0, 0x18

    invoke-virtual {v7, v0}, Lo/fpq;->c(I)I

    move-result v12

    .line 195
    invoke-virtual {v7, v12}, Lo/fpq;->d(I)[B

    move-result-object v13

    .line 197
    if-eq v9, v12, :cond_0

    .line 199
    new-instance v0, Lo/fqz;

    move-object v1, v8

    move v2, v9

    move v3, v10

    move v4, v11

    move-object v5, v13

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v6}, Lo/fqz;-><init>(Lo/fra;III[BLjava/net/InetSocketAddress;)V

    return-object v0

    .line 203
    :cond_0
    sget-object v0, Lo/fqy$5;->b:[I

    invoke-virtual {v8}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 205
    :pswitch_0
    new-instance v14, Lo/fre;

    move-object/from16 v0, p3

    invoke-direct {v14, v0}, Lo/fre;-><init>(Ljava/net/InetSocketAddress;)V

    .line 206
    goto/16 :goto_1

    .line 209
    :pswitch_1
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/fql;->b([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 210
    goto/16 :goto_1

    .line 213
    :pswitch_2
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/frs;->d([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 214
    goto/16 :goto_1

    .line 217
    :pswitch_3
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/frc;->e([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 218
    goto :goto_1

    .line 221
    :pswitch_4
    move/from16 v0, p2

    move-object/from16 v1, p3

    invoke-static {v13, v0, v1}, Lo/fqc;->c([BZLjava/net/InetSocketAddress;)Lo/fqc;

    move-result-object v14

    .line 222
    goto :goto_1

    .line 225
    :pswitch_5
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v13, v0, v1}, Lo/fqy;->b([BLo/fsf$a;Ljava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 226
    goto :goto_1

    .line 229
    :pswitch_6
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/fqd;->e([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 230
    goto :goto_1

    .line 233
    :pswitch_7
    new-instance v14, Lo/frz;

    move-object/from16 v0, p3

    invoke-direct {v14, v0}, Lo/frz;-><init>(Ljava/net/InetSocketAddress;)V

    .line 234
    goto :goto_1

    .line 237
    :pswitch_8
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/fqe;->e([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 238
    goto :goto_1

    .line 241
    :pswitch_9
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v13, v0, v1}, Lo/fqy;->e([BLo/fsf$a;Ljava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 242
    goto :goto_1

    .line 245
    :pswitch_a
    move-object/from16 v0, p3

    invoke-static {v13, v0}, Lo/fqw;->a([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v14

    .line 246
    goto :goto_1

    .line 249
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot parse unsupported message type %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    move-object/from16 v5, p3

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 254
    :goto_1
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, v14, Lo/fqy;->c:[B

    .line 255
    invoke-virtual {v14, v12}, Lo/fqy;->e(I)V

    .line 256
    invoke-virtual {v14, v11}, Lo/fqy;->c(I)V

    .line 257
    invoke-virtual {v14, v10}, Lo/fqy;->a(I)V

    .line 259
    return-object v14

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private static e([BLo/fsf$a;Ljava/net/InetSocketAddress;)Lo/fqy;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 279
    sget-object v0, Lo/fqy$5;->c:[I

    invoke-virtual {p1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 281
    :pswitch_0
    invoke-static {p0, p2}, Lo/fqs;->a([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0

    .line 283
    :pswitch_1
    invoke-static {p0, p2}, Lo/frj;->d([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0

    .line 285
    :pswitch_2
    invoke-static {p0, p2}, Lo/frk;->b([BLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0

    .line 287
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Unknown key exchange algorithm"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 316
    iput p1, p0, Lo/fqy;->d:I

    .line 317
    return-void
.end method

.method public a()[B
    .locals 3

    .line 156
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 159
    invoke-virtual {p0}, Lo/fqy;->c()Lo/fra;

    move-result-object v0

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 160
    invoke-virtual {p0}, Lo/fqy;->d()I

    move-result v0

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 162
    iget v0, p0, Lo/fqy;->d:I

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 164
    iget v0, p0, Lo/fqy;->b:I

    if-gez v0, :cond_0

    .line 166
    const/4 v0, 0x0

    iput v0, p0, Lo/fqy;->b:I

    .line 168
    :cond_0
    iget v0, p0, Lo/fqy;->b:I

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 170
    iget v0, p0, Lo/fqy;->e:I

    if-gez v0, :cond_1

    .line 173
    invoke-virtual {p0}, Lo/fqy;->d()I

    move-result v0

    iput v0, p0, Lo/fqy;->e:I

    .line 175
    :cond_1
    iget v0, p0, Lo/fqy;->e:I

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 177
    invoke-virtual {p0}, Lo/fqy;->g()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 179
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public final b()Lo/fqn;
    .locals 1

    .line 129
    sget-object v0, Lo/fqn;->a:Lo/fqn;

    return-object v0
.end method

.method public abstract c()Lo/fra;
.end method

.method public c(I)V
    .locals 0

    .line 320
    iput p1, p0, Lo/fqy;->b:I

    .line 321
    return-void
.end method

.method public abstract d()I
.end method

.method public e(I)V
    .locals 0

    .line 312
    iput p1, p0, Lo/fqy;->e:I

    .line 313
    return-void
.end method

.method public abstract g()[B
.end method

.method public q()I
    .locals 1

    .line 304
    iget v0, p0, Lo/fqy;->b:I

    return v0
.end method

.method public s()I
    .locals 1

    .line 296
    iget v0, p0, Lo/fqy;->d:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 134
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    const-string v0, "\tHandshake Protocol"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tPeer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tMessage Sequence No: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fqy;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tFragment Offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fqy;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tFragment Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fqy;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tLength: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fqy;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()I
    .locals 1

    .line 308
    iget v0, p0, Lo/fqy;->e:I

    return v0
.end method

.method protected final z()[B
    .locals 1

    .line 333
    iget-object v0, p0, Lo/fqy;->c:[B

    return-object v0
.end method
