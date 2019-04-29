.class public Lkotlin/reflect/jvm/internal/impl/renderer/KeywordStringsGenerated;
.super Ljava/lang/Object;
.source "KeywordStringsGenerated.java"


# static fields
.field public static final KEYWORDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 27
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x1c

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "package"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "as"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "typealias"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "class"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "this"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "super"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "val"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, "var"

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "fun"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, "for"

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, "null"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const-string v2, "true"

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "false"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const-string v2, "is"

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, "in"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const-string v2, "throw"

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, "return"

    const/16 v3, 0x10

    aput-object v2, v1, v3

    const-string v2, "break"

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const-string v2, "continue"

    const/16 v3, 0x12

    aput-object v2, v1, v3

    const-string v2, "object"

    const/16 v3, 0x13

    aput-object v2, v1, v3

    const-string v2, "if"

    const/16 v3, 0x14

    aput-object v2, v1, v3

    const-string v2, "try"

    const/16 v3, 0x15

    aput-object v2, v1, v3

    const-string v2, "else"

    const/16 v3, 0x16

    aput-object v2, v1, v3

    const-string v2, "while"

    const/16 v3, 0x17

    aput-object v2, v1, v3

    const-string v2, "do"

    const/16 v3, 0x18

    aput-object v2, v1, v3

    const-string v2, "when"

    const/16 v3, 0x19

    aput-object v2, v1, v3

    const-string v2, "interface"

    const/16 v3, 0x1a

    aput-object v2, v1, v3

    const-string v2, "typeof"

    const/16 v3, 0x1b

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/KeywordStringsGenerated;->KEYWORDS:Ljava/util/Set;

    return-void
.end method
