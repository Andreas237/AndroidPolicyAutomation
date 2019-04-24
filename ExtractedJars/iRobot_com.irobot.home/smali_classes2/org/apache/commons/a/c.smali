.class public Lorg/apache/commons/a/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/a/c$b;,
        Lorg/apache/commons/a/c$a;
    }
.end annotation


# static fields
.field public static final a:Lorg/apache/commons/a/b/a/b;

.field public static final b:Lorg/apache/commons/a/b/a/b;

.field public static final c:Lorg/apache/commons/a/b/a/b;

.field public static final d:Lorg/apache/commons/a/b/a/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lorg/apache/commons/a/b/a/b;

.field public static final f:Lorg/apache/commons/a/b/a/b;

.field public static final g:Lorg/apache/commons/a/b/a/b;

.field public static final h:Lorg/apache/commons/a/b/a/b;

.field public static final i:Lorg/apache/commons/a/b/a/b;

.field public static final j:Lorg/apache/commons/a/b/a/b;

.field public static final k:Lorg/apache/commons/a/b/a/b;

.field public static final l:Lorg/apache/commons/a/b/a/b;

.field public static final m:Lorg/apache/commons/a/b/a/b;

.field public static final n:Lorg/apache/commons/a/b/a/b;

.field public static final o:Lorg/apache/commons/a/b/a/b;

.field public static final p:Lorg/apache/commons/a/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lorg/apache/commons/a/b/a/f;

    const/4 v1, 0x2

    new-array v2, v1, [[Ljava/lang/String;

    const-string v3, "\""

    const-string v4, "\\\""

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "\\"

    const-string v5, "\\\\"

    filled-new-array {v3, v5}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-direct {v0, v2}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    new-array v2, v5, [Lorg/apache/commons/a/b/a/b;

    new-instance v3, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->i()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v4

    invoke-virtual {v0, v2}, Lorg/apache/commons/a/b/a/f;->a([Lorg/apache/commons/a/b/a/b;)Lorg/apache/commons/a/b/a/b;

    move-result-object v0

    new-array v2, v5, [Lorg/apache/commons/a/b/a/b;

    const/16 v3, 0x20

    const/16 v6, 0x7f

    invoke-static {v3, v6}, Lorg/apache/commons/a/b/a/e;->a(II)Lorg/apache/commons/a/b/a/e;

    move-result-object v7

    aput-object v7, v2, v4

    invoke-virtual {v0, v2}, Lorg/apache/commons/a/b/a/b;->a([Lorg/apache/commons/a/b/a/b;)Lorg/apache/commons/a/b/a/b;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/a/c;->a:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    const/4 v2, 0x3

    new-array v7, v2, [Lorg/apache/commons/a/b/a/b;

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    const/4 v9, 0x4

    new-array v10, v9, [[Ljava/lang/String;

    const-string v11, "\'"

    const-string v12, "\\\'"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v4

    const-string v11, "\""

    const-string v12, "\\\""

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v5

    const-string v11, "\\"

    const-string v12, "\\\\"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v1

    const-string v11, "/"

    const-string v12, "\\/"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v2

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->i()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    invoke-static {v3, v6}, Lorg/apache/commons/a/b/a/e;->a(II)Lorg/apache/commons/a/b/a/e;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-direct {v0, v7}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->b:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v7, v2, [Lorg/apache/commons/a/b/a/b;

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    new-array v10, v2, [[Ljava/lang/String;

    const-string v11, "\""

    const-string v12, "\\\""

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v4

    const-string v11, "\\"

    const-string v12, "\\\\"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v5

    const-string v11, "/"

    const-string v12, "\\/"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v1

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->i()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    invoke-static {v3, v6}, Lorg/apache/commons/a/b/a/e;->a(II)Lorg/apache/commons/a/b/a/e;

    move-result-object v3

    aput-object v3, v7, v1

    invoke-direct {v0, v7}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->c:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v1, [Lorg/apache/commons/a/b/a/b;

    new-instance v7, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->e()[[Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v7, v3, v4

    new-instance v7, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->g()[[Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v7, v3, v5

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->d:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    const/4 v3, 0x6

    new-array v7, v3, [Lorg/apache/commons/a/b/a/b;

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->e()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->g()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    new-instance v8, Lorg/apache/commons/a/b/a/f;

    const/16 v10, 0x1f

    new-array v11, v10, [[Ljava/lang/String;

    const-string v12, "\u0000"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v4

    const-string v12, "\u0001"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v5

    const-string v12, "\u0002"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v1

    const-string v12, "\u0003"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v2

    const-string v12, "\u0004"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v9

    const-string v12, "\u0005"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x5

    aput-object v12, v11, v13

    const-string v12, "\u0006"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v3

    const-string v12, "\u0007"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x7

    aput-object v12, v11, v14

    const-string v12, "\u0008"

    const-string v15, ""

    filled-new-array {v12, v15}, [Ljava/lang/String;

    move-result-object v12

    const/16 v15, 0x8

    aput-object v12, v11, v15

    const-string v12, "\u000b"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x9

    aput-object v12, v11, v14

    const-string v12, "\u000c"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xa

    aput-object v12, v11, v14

    const-string v12, "\u000e"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xb

    aput-object v12, v11, v14

    const-string v12, "\u000f"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xc

    aput-object v12, v11, v14

    const-string v12, "\u0010"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xd

    aput-object v12, v11, v14

    const-string v12, "\u0011"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xe

    aput-object v12, v11, v14

    const-string v12, "\u0012"

    const-string v3, ""

    filled-new-array {v12, v3}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0xf

    aput-object v3, v11, v12

    const-string v3, "\u0013"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x10

    aput-object v3, v11, v12

    const-string v3, "\u0014"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x11

    aput-object v3, v11, v12

    const-string v3, "\u0015"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x12

    aput-object v3, v11, v12

    const-string v3, "\u0016"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x13

    aput-object v3, v11, v12

    const-string v3, "\u0017"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x14

    aput-object v3, v11, v12

    const-string v3, "\u0018"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x15

    aput-object v3, v11, v12

    const-string v3, "\u0019"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x16

    aput-object v3, v11, v12

    const-string v3, "\u001a"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x17

    aput-object v3, v11, v12

    const-string v3, "\u001b"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x18

    aput-object v3, v11, v12

    const-string v3, "\u001c"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x19

    aput-object v3, v11, v12

    const-string v3, "\u001d"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1a

    aput-object v3, v11, v12

    const-string v3, "\u001e"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1b

    aput-object v3, v11, v12

    const-string v3, "\u001f"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1c

    aput-object v3, v11, v12

    const-string v3, "\ufffe"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1d

    aput-object v3, v11, v12

    const-string v3, "\uffff"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1e

    aput-object v3, v11, v12

    invoke-direct {v8, v11}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v1

    const/16 v3, 0x84

    invoke-static {v6, v3}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v8

    aput-object v8, v7, v2

    const/16 v8, 0x86

    const/16 v11, 0x9f

    invoke-static {v8, v11}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v11

    aput-object v11, v7, v9

    new-instance v11, Lorg/apache/commons/a/b/a/l;

    invoke-direct {v11}, Lorg/apache/commons/a/b/a/l;-><init>()V

    aput-object v11, v7, v13

    invoke-direct {v0, v7}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->e:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v7, v15, [Lorg/apache/commons/a/b/a/b;

    new-instance v11, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->e()[[Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v4

    new-instance v11, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->g()[[Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v5

    new-instance v11, Lorg/apache/commons/a/b/a/f;

    new-array v12, v13, [[Ljava/lang/String;

    const-string v8, "\u0000"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v4

    const-string v8, "\u000b"

    const-string v13, "&#11;"

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v5

    const-string v8, "\u000c"

    const-string v13, "&#12;"

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v1

    const-string v8, "\ufffe"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v2

    const-string v8, "\uffff"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v9

    invoke-direct {v11, v12}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v1

    invoke-static {v5, v15}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v14, v10}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v8

    aput-object v8, v7, v9

    invoke-static {v6, v3}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v3

    const/4 v6, 0x5

    aput-object v3, v7, v6

    const/16 v3, 0x9f

    const/16 v6, 0x86

    invoke-static {v6, v3}, Lorg/apache/commons/a/b/a/g;->a(II)Lorg/apache/commons/a/b/a/g;

    move-result-object v3

    const/4 v6, 0x6

    aput-object v3, v7, v6

    new-instance v3, Lorg/apache/commons/a/b/a/l;

    invoke-direct {v3}, Lorg/apache/commons/a/b/a/l;-><init>()V

    const/4 v6, 0x7

    aput-object v3, v7, v6

    invoke-direct {v0, v7}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->f:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v1, [Lorg/apache/commons/a/b/a/b;

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->e()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->a()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->g:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v2, [Lorg/apache/commons/a/b/a/b;

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->e()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->a()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->c()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->h:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/c$a;

    invoke-direct {v0}, Lorg/apache/commons/a/c$a;-><init>()V

    sput-object v0, Lorg/apache/commons/a/c;->i:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v9, [Lorg/apache/commons/a/b/a/b;

    new-instance v6, Lorg/apache/commons/a/b/a/i;

    invoke-direct {v6}, Lorg/apache/commons/a/b/a/i;-><init>()V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/a/b/a/k;

    invoke-direct {v6}, Lorg/apache/commons/a/b/a/k;-><init>()V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->j()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    new-array v7, v9, [[Ljava/lang/String;

    const-string v8, "\\\\"

    const-string v10, "\\"

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    const-string v8, "\\\""

    const-string v10, "\""

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v5

    const-string v8, "\\\'"

    const-string v10, "\'"

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v1

    const-string v8, "\\"

    const-string v10, ""

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v2

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->j:Lorg/apache/commons/a/b/a/b;

    sget-object v0, Lorg/apache/commons/a/c;->j:Lorg/apache/commons/a/b/a/b;

    sput-object v0, Lorg/apache/commons/a/c;->k:Lorg/apache/commons/a/b/a/b;

    sget-object v0, Lorg/apache/commons/a/c;->j:Lorg/apache/commons/a/b/a/b;

    sput-object v0, Lorg/apache/commons/a/c;->l:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v2, [Lorg/apache/commons/a/b/a/b;

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->f()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->b()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/a/b/a/h;

    new-array v7, v4, [Lorg/apache/commons/a/b/a/h$a;

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/h;-><init>([Lorg/apache/commons/a/b/a/h$a;)V

    aput-object v6, v3, v1

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->m:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v3, v9, [Lorg/apache/commons/a/b/a/b;

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->f()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->b()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->d()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    new-instance v6, Lorg/apache/commons/a/b/a/h;

    new-array v7, v4, [Lorg/apache/commons/a/b/a/h$a;

    invoke-direct {v6, v7}, Lorg/apache/commons/a/b/a/h;-><init>([Lorg/apache/commons/a/b/a/h$a;)V

    aput-object v6, v3, v2

    invoke-direct {v0, v3}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->n:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/b/a/a;

    new-array v2, v2, [Lorg/apache/commons/a/b/a/b;

    new-instance v3, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->f()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v4

    new-instance v3, Lorg/apache/commons/a/b/a/f;

    invoke-static {}, Lorg/apache/commons/a/b/a/d;->h()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/a/b/a/f;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v5

    new-instance v3, Lorg/apache/commons/a/b/a/h;

    new-array v4, v4, [Lorg/apache/commons/a/b/a/h$a;

    invoke-direct {v3, v4}, Lorg/apache/commons/a/b/a/h;-><init>([Lorg/apache/commons/a/b/a/h$a;)V

    aput-object v3, v2, v1

    invoke-direct {v0, v2}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    sput-object v0, Lorg/apache/commons/a/c;->o:Lorg/apache/commons/a/b/a/b;

    new-instance v0, Lorg/apache/commons/a/c$b;

    invoke-direct {v0}, Lorg/apache/commons/a/c$b;-><init>()V

    sput-object v0, Lorg/apache/commons/a/c;->p:Lorg/apache/commons/a/b/a/b;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/apache/commons/a/c;->l:Lorg/apache/commons/a/b/a/b;

    invoke-virtual {v0, p0}, Lorg/apache/commons/a/b/a/b;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
