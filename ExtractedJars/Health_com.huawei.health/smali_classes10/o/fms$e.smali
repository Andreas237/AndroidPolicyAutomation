.class public Lo/fms$e;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fms;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/util/LinkedHashMap<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/fms;

.field private final e:I


# direct methods
.method public constructor <init>(Lo/fms;I)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/fms$e;->c:Lo/fms;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 74
    iput p2, p0, Lo/fms$e;->e:I

    .line 75
    return-void
.end method


# virtual methods
.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map$Entry<TK;TV;>;)Z"
        }
    .end annotation

    .line 79
    invoke-virtual {p0}, Lo/fms$e;->size()I

    move-result v0

    iget v1, p0, Lo/fms$e;->e:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
