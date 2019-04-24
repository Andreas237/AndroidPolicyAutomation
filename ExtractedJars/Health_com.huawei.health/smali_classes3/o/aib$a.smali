.class Lo/aib$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aib;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/aib;


# direct methods
.method private constructor <init>(Lo/aib;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/aib$a;->a:Lo/aib;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/aib;Lo/aib$2;)V
    .locals 0

    .line 143
    invoke-direct {p0, p1}, Lo/aib$a;-><init>(Lo/aib;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v5, 0x0

    .line 149
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-static {}, Lo/akc;->d()[B

    move-result-object v6

    .line 153
    invoke-static {}, Lo/akc;->b()Ljava/lang/String;

    move-result-object v7

    .line 154
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssembleDataPackage aes128Key  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v0

    iget-object v0, v0, Lo/aie;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/aib;->b(Ljava/lang/String;)[B

    move-result-object v8

    .line 157
    invoke-static {v8, v7, v6}, Lo/ajt;->d([BLjava/lang/String;[B)[B

    move-result-object v9

    .line 159
    const/4 v10, 0x0

    .line 160
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->k(Lo/aib;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage mRegMessage is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 163
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->k(Lo/aib;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aib;->b(Ljava/lang/String;)[B

    move-result-object v11

    .line 164
    invoke-static {v11, v7, v6}, Lo/ajt;->d([BLjava/lang/String;[B)[B

    move-result-object v10

    .line 165
    array-length v5, v10

    .line 169
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0, v9}, Lo/aib;->d(Lo/aib;[B)[B

    move-result-object v11

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v0

    iget v0, v0, Lo/aie;->g:I

    invoke-static {v0, v11, v7}, Lo/ajw;->e(I[BLjava/lang/String;)[B

    move-result-object v12

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v0

    iget-object v0, v0, Lo/aie;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/aib;->b(Ljava/lang/String;)[B

    move-result-object v13

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/aib$a;->a:Lo/aib;

    invoke-static {v1}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v1

    iget-object v1, v1, Lo/aie;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/aib;->d(Lo/aib;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 177
    invoke-static {v14}, Lo/aib;->b(Ljava/lang/String;)[B

    move-result-object v15

    .line 180
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    const/4 v0, 0x0

    if-eq v0, v15, :cond_1

    const/4 v0, 0x0

    if-eq v0, v13, :cond_1

    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    array-length v0, v12

    const/16 v1, 0x10

    if-eq v1, v0, :cond_2

    .line 181
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->a(Lo/aib;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x451

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    .line 182
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u52a0\u5bc6\u540e\u7684\u6570\u636e\u957f\u5ea6\u4e0d\u5bf9"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 183
    return-void

    .line 186
    :cond_2
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage pwdArray len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage ssid: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aib$a;->a:Lo/aib;

    invoke-static {v2}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v2

    iget-object v2, v2, Lo/aie;->d:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage deviceSsid: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aib$a;->a:Lo/aib;

    invoke-static {v2}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v2

    iget-object v2, v2, Lo/aie;->l:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage encodedPwd:  len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage huaweiKeyIv:  len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage encodedKey:  len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage ssidArray:  len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v13

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage info:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 195
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssembleDataPackage regMsg: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/aib$a;->a:Lo/aib;

    invoke-static {v3}, Lo/aib;->k(Lo/aib;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage endcodeRegMsg:  len:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_3
    array-length v0, v13

    add-int/lit8 v0, v0, 0x14

    array-length v1, v9

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    add-int v16, v0, v5

    .line 201
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage dataPakageLen: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 202
    and-int/lit8 v0, v16, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    add-int/lit8 v1, v16, 0x1

    new-array v1, v1, [B

    invoke-static {v0, v1}, Lo/aib;->e(Lo/aib;[B)[B

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    const/4 v1, 0x0

    aput-byte v1, v0, v16

    goto :goto_1

    .line 206
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    move/from16 v1, v16

    new-array v1, v1, [B

    invoke-static {v0, v1}, Lo/aib;->e(Lo/aib;[B)[B

    .line 210
    :goto_1
    const/16 v17, 0x0

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-static {v15}, Lo/akc;->d([B)I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v1, 0x0

    aput-byte v2, v0, v1

    .line 214
    add-int/lit8 v17, v17, 0x1

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aib$a;->a:Lo/aib;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/aib$a;->a:Lo/aib;

    invoke-static {v3}, Lo/aib;->i(Lo/aib;)Lo/aie;

    move-result-object v3

    invoke-static {v2, v3}, Lo/aib;->d(Lo/aib;Lo/aie;)B

    move-result v2

    const/4 v1, 0x2

    aput-byte v2, v0, v1

    .line 218
    const/4 v4, 0x0

    :goto_2
    const/16 v0, 0x10

    if-ge v4, v0, :cond_5

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    aget-byte v2, v12, v4

    aput-byte v2, v0, v1

    .line 218
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 222
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    array-length v2, v13

    array-length v3, v9

    invoke-static {v2, v3}, Lo/akc;->b(II)I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 224
    const/4 v4, 0x0

    :goto_3
    array-length v0, v13

    if-ge v4, v0, :cond_6

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    aget-byte v2, v13, v4

    aput-byte v2, v0, v1

    .line 224
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 228
    :cond_6
    const/4 v4, 0x0

    :goto_4
    array-length v0, v9

    if-ge v4, v0, :cond_7

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    aget-byte v2, v9, v4

    aput-byte v2, v0, v1

    .line 228
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 231
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v10, :cond_8

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    array-length v2, v10

    shr-int/lit8 v2, v2, 0x4

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 235
    const/4 v4, 0x0

    :goto_5
    array-length v0, v10

    if-ge v4, v0, :cond_9

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    aget-byte v2, v10, v4

    aput-byte v2, v0, v1

    .line 235
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 239
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    const/4 v1, 0x0

    aput-byte v1, v0, v17

    .line 243
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/aib$a;->a:Lo/aib;

    invoke-static {v1}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v1

    const/4 v2, 0x2

    move/from16 v3, v16

    invoke-static {v1, v2, v3}, Lo/aib;->d([BII)B

    move-result v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    .line 244
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage mDataPakage:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aib$a;->a:Lo/aib;

    invoke-static {v2}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v2

    invoke-static {v2}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aib$a;->a:Lo/aib;

    invoke-static {v0}, Lo/aib;->c(Lo/aib;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 246
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AssembleDataPackage leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void
.end method
