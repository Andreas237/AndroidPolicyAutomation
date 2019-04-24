.class public interface abstract Lcom/google/code/regexp/MatchResult;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/regex/MatchResult;


# virtual methods
.method public abstract end(Ljava/lang/String;)I
.end method

.method public abstract group(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract namedGroups()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract orderedGroups()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract start(Ljava/lang/String;)I
.end method
