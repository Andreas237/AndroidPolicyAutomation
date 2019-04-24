.class public final Lcom/ibotta/android/views/generic/ResValueKt;
.super Ljava/lang/Object;
.source "ResValue.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "createResValue",
        "Lcom/ibotta/android/views/generic/ResValue;",
        "resource",
        "",
        "string",
        "",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final createResValue(I)Lcom/ibotta/android/views/generic/ResValue;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    new-instance v0, Lcom/ibotta/android/views/generic/ResId;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/generic/ResId;-><init>(I)V

    check-cast v0, Lcom/ibotta/android/views/generic/ResValue;

    return-object v0
.end method

.method public static final createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    new-instance v0, Lcom/ibotta/android/views/generic/RawString;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/generic/RawString;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/ibotta/android/views/generic/ResValue;

    return-object v0
.end method
