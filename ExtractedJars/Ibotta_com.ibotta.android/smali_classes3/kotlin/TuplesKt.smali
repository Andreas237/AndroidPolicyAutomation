.class public final Lkotlin/TuplesKt;
.super Ljava/lang/Object;
.source "Tuples.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u0086\u0004\u00a2\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0007\"\u0004\u0008\u0000\u0010\u0008*\u000e\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\u00080\u0001\u001a(\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0007\"\u0004\u0008\u0000\u0010\u0008*\u0014\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\u00080\t\u00a8\u0006\n"
    }
    d2 = {
        "to",
        "Lkotlin/Pair;",
        "A",
        "B",
        "that",
        "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;",
        "toList",
        "",
        "T",
        "Lkotlin/Triple;",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "TuplesKt"
.end annotation


# direct methods
.method public static final to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(TA;TB;)",
            "Lkotlin/Pair<",
            "TA;TB;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 43
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
