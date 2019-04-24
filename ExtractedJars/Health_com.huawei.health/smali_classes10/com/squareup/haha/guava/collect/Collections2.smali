.class public final Lcom/squareup/haha/guava/collect/Collections2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final STANDARD_JOINER:Lcom/squareup/haha/guava/base/Joiner;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 323
    const-string v2, ", "

    .line 1071
    new-instance v0, Lcom/squareup/haha/guava/base/Joiner;

    invoke-direct {v0, v2}, Lcom/squareup/haha/guava/base/Joiner;-><init>(Ljava/lang/String;)V

    .line 323
    const-string v1, "null"

    invoke-virtual {v0, v1}, Lcom/squareup/haha/guava/base/Joiner;->useForNull(Ljava/lang/String;)Lcom/squareup/haha/guava/base/Joiner;

    move-result-object v0

    sput-object v0, Lcom/squareup/haha/guava/collect/Collections2;->STANDARD_JOINER:Lcom/squareup/haha/guava/base/Joiner;

    return-void
.end method

.method static safeContains(Ljava/util/Collection;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;Ljava/lang/Object;)Z"
        }
    .end annotation

    .line 108
    invoke-static {p0}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 111
    .line 112
    :catch_0
    const/4 v0, 0x0

    return v0

    .line 113
    .line 114
    :catch_1
    const/4 v0, 0x0

    return v0
.end method
