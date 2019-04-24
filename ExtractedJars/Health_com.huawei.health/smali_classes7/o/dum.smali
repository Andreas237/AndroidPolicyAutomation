.class public Lo/dum;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;[I>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 236
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lo/dum;->d:Ljava/util/Map;

    .line 239
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [I

    fill-array-data v2, :array_4

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_5

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    new-array v2, v2, [I

    fill-array-data v2, :array_6

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->i:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_7

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [I

    fill-array-data v2, :array_8

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    return-void

    nop

    :array_0
    .array-data 4
        0x232a
        0x2329
        0x232b
    .end array-data

    :array_1
    .array-data 4
        0x3eb
        0x3ec
        0x3ea
        0x3e9
    .end array-data

    :array_2
    .array-data 4
        0x7d3
        0x7d5
        0x7d4
        0x7d1
        0x7d6
        0x7d2
    .end array-data

    :array_3
    .array-data 4
        0xbb9
        0xbbb
        0xbbc
        0xbba
        0xbbd
    .end array-data

    :array_4
    .array-data 4
        0xfa1
        0xfa2
        0xfa3
        0xfa4
        0xfa5
    .end array-data

    :array_5
    .array-data 4
        0x1b59
        0x1b5a
        0x1b5b
    .end array-data

    :array_6
    .array-data 4
        0x1f41
        0x1f42
        0x1f43
        0x1f44
        0x1f45
        0x1f46
    .end array-data

    :array_7
    .array-data 4
        0x1389
    .end array-data

    :array_8
    .array-data 4
        0x1771
        0x1772
        0x1773
        0x1774
        0x1775
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)[I
    .locals 1

    .line 270
    sget-object v0, Lo/dum;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
