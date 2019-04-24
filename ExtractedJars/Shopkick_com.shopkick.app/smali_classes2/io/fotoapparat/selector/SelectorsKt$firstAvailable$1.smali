.class final Lio/fotoapparat/selector/SelectorsKt$firstAvailable$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Selectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/selector/SelectorsKt;->firstAvailable([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "TInput;TOutput;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0004\n\u0002\u0008\u0005\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0001*\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "Output",
        "Input",
        "invoke",
        "(Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $functions:[Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>([Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/selector/SelectorsKt$firstAvailable$1;->$functions:[Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TInput;)TOutput;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 38
    iget-object v0, p0, Lio/fotoapparat/selector/SelectorsKt$firstAvailable$1;->$functions:[Lkotlin/jvm/functions/Function1;

    new-instance v1, Lio/fotoapparat/selector/SelectorsKt$firstAvailable$1$1;

    invoke-direct {v1, p1}, Lio/fotoapparat/selector/SelectorsKt$firstAvailable$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lio/fotoapparat/selector/SelectorsKt;->access$findNonNull([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
