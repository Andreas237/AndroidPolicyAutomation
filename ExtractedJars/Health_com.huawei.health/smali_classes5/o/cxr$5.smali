.class final Lo/cxr$5;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    .line 281
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 282
    const/4 v3, 0x0

    .line 283
    const/4 v3, 0x0

    :goto_0
    invoke-static {}, Lo/cxr;->c()[[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge v3, v0, :cond_0

    .line 284
    invoke-static {}, Lo/cxr;->c()[[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v3

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {}, Lo/cxr;->c()[[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {p0, v0, v1}, Lo/cxr$5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 286
    :cond_0
    return-void
.end method
